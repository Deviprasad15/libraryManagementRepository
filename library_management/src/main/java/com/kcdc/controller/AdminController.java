package com.kcdc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kcdc.dto.NewBookDetailsDto;
import com.kcdc.dto.StaffLoginDto;
import com.kcdc.service.LibraryService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/library")
public class AdminController {
	
	@Autowired
	LibraryService service;
	
	
	// Admin login endpoint 
	
	@PostMapping(path = "/kcdc/admin/login",consumes = {"application/json"} )
	public ResponseEntity<String> libraryStaffLogin(@Valid @RequestBody StaffLoginDto dto)
	{
	String result=	service.libraryStaffLogin(dto);
	if(result=="Invalid Details")

		return new ResponseEntity<String>(result,HttpStatus.UNAUTHORIZED);
	else
		return new ResponseEntity<String>(result,HttpStatus.OK);
	}
	
	//create new userName and password for new staff or Admin
	
	@PostMapping(path = "/kcdc/create/new/staff",consumes = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE} )
	public ResponseEntity<String> createNewLibraryStaff(@Valid @RequestBody StaffLoginDto dto)
	{
		String result =service.createNewLibraryStaff(dto);
		if(result.equals("CREATED SUCCESSFUL"))
		{
			return new ResponseEntity<String>(result,HttpStatus.CREATED);
		}
		 return new ResponseEntity<String>(result,HttpStatus.FORBIDDEN);
	}
	
	// stored new book details in database 
	
	@GetMapping(path="/kcdc/insert/newBook/details",consumes = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE} )
	public ResponseEntity<String> insertNewBookDetails(@Valid  @RequestBody NewBookDetailsDto bookDto)
	{
	String result=	service.insertNewBookDetails(bookDto);
	
	if(result=="BOOK STORED SUCCESSFULY ")
	{
		return new ResponseEntity<String>(result,HttpStatus.CREATED);
	}
		return new ResponseEntity<String>(result, HttpStatus.FORBIDDEN);
	}
	
	
	@PutMapping(path="/kcdc/update/Book/details",consumes = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE} )
	public ResponseEntity<String> updateBookDetails(@Valid  @RequestBody NewBookDetailsDto bookDto)
	{
	String result=	service.updateBookDetails(bookDto);
	
	if(result=="updated")
	{
		return new ResponseEntity<String>(result,HttpStatus.OK);
	}
		return new ResponseEntity<String>(result, HttpStatus.FORBIDDEN);
	}
	
	
	@DeleteMapping(path="/kcdc/delete/book")
	public ResponseEntity<String> deleteBook(@RequestParam(name = "bookId") long bookId)
	{
		String result=service.deleteBook(bookId);
		if(result=="deleted")
		return new ResponseEntity<String>(result, HttpStatus.OK);
		else
			return new ResponseEntity<String>(result,HttpStatus.FORBIDDEN);
	}
	
	
	@DeleteMapping(path="/kcdc/delete/book/name/{name}/author/{author}/lang/{lang}")
	public ResponseEntity<String> deleteeeBook(@PathVariable String name,@PathVariable String author,@PathVariable String lang)
	{  
		String result=service.deleteeeBook(name,author,lang);
		if(result=="deleted")
			return new ResponseEntity<String>(result, HttpStatus.OK);
			else
				return new ResponseEntity<String>(result,HttpStatus.FORBIDDEN);
	}
			

}
