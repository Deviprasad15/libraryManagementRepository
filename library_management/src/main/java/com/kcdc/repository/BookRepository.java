package com.kcdc.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kcdc.entity.Books;

public interface BookRepository  extends JpaRepository<Books,Long>{
	
	
	
  Optional<Books>	findByBookNameAndAuthorNameAndBookLanguage(String bookName,String authorName,String bookLanguage);

}
