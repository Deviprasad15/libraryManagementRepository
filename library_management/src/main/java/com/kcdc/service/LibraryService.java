package com.kcdc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kcdc.dto.NewBookDetailsDto;
import com.kcdc.dto.StaffLoginDto;
import com.kcdc.entity.Books;
import com.kcdc.entity.LibraryStaffDetails;
import com.kcdc.repository.AdminRepository;
import com.kcdc.repository.BookRepository;

import jakarta.validation.Valid;

@Service
public class LibraryService {
	
	
	@Autowired
	AdminRepository repository;

	public String libraryStaffLogin(StaffLoginDto dto) {

		Optional<LibraryStaffDetails> op=	repository.findById(dto.getUserName());
		if(op.isPresent())
		{
			LibraryStaffDetails lsd=op.get();
			if(lsd.getPassword().equals(dto.getPassword()))
			{
				return "Login Successful";
			}
			else
			{
				return "Invalid Details";
			}
			
		}
		return "Invalid Details";
		
	}

	public String createNewLibraryStaff(@Valid StaffLoginDto dto) {
	
		Optional<LibraryStaffDetails> optional=	repository.findById(dto.getUserName());
		
		if(optional.isEmpty())
		{
			repository.save(new LibraryStaffDetails().builder().userName(dto.getUserName()).password(dto.getPassword()).build());
		
			return "CREATED SUCCESSFUL";
		}
		
		return "USER ALREADY EXISTED";
		
	}
	
	// Book repository
	
	@Autowired
	BookRepository bookRepository;
	
	

	public String insertNewBookDetails( NewBookDetailsDto bookDto) {
		Optional<Books>  op=	bookRepository.findByBookNameAndAuthorNameAndBookLanguage(bookDto.getBookName(), bookDto.getAuthorName(), bookDto.getBookLanguage());
		if(op.isEmpty())
		{
			Books book=new Books();
			book.setAuthorName(bookDto.getAuthorName());
			book.setBookLanguage(bookDto.getBookLanguage());
			book.setBookName(bookDto.getBookName());
			book.setBookStatus(bookDto.getBookStatus());
			book.setSection(bookDto.getSection());
			book.setRowNo(bookDto.getRowNo());
			
			bookRepository.save(book);
			return "BOOK STORED SUCCESSFULY ";	
		}
		return "BOOK ALREADY EXISTED";	
	}
	
	
	public String updateBookDetails( NewBookDetailsDto bookDto) {
		
		Optional<Books>  op=	bookRepository.findByBookNameAndAuthorNameAndBookLanguage(bookDto.getBookName(), bookDto.getAuthorName(), bookDto.getBookLanguage());
		
		if(op.isPresent())
		{
		Books b=	op.get();
			Books book=new Books();
			
			if(bookDto.getAuthorName()==null)
			book.setAuthorName(b.getAuthorName());
			else
			book.setAuthorName(bookDto.getAuthorName());
			
			if(bookDto.getBookLanguage()==null)
				book.setBookLanguage(b.getBookLanguage());
				else
				book.setBookLanguage(bookDto.getBookLanguage());
			
			if(bookDto.getBookName()==null)
				book.setBookName(b.getBookName());
				else
				book.setBookName(bookDto.getBookName());
			
			if(bookDto.getBookStatus()==null)
				book.setBookStatus(b.getBookStatus());
				else
				book.setBookStatus(bookDto.getBookStatus());
			
			
			if(bookDto.getSection()==null)
				book.setSection(b.getSection());
				else
				book.setSection(bookDto.getSection());
			
			if(bookDto.getRowNo()==0)
				book.setRowNo(b.getRowNo());
			else
				book.setRowNo(bookDto.getRowNo());
			book.setBookId(b.getBookId());
			bookRepository.save(book);
			return "updated";
		}
		return "first store book detais and after update";
	}

	public String deleteBook(long bookId) {
		
		Optional<Books> op=	bookRepository.findById(bookId);
		if(op.isPresent())
	    {
			bookRepository.deleteById(bookId);
			return "deleted";
		}
		
		return "INVALID BOOK ID ";
		
	}

	public String deleteeeBook(String name, String author, String lang) {
		
		Optional<Books> op=	bookRepository.findByBookNameAndAuthorNameAndBookLanguage(name, author, lang);
		if(op.isPresent())
	    {
			bookRepository.deleteById(op.get().getBookId());
			return "deleted";
		}
		
		return "INVALID BOOK Details ";
		
	
		
	}
	

}
