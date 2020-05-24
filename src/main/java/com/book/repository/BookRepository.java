package com.book.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.book.domain.Book;

public interface BookRepository extends CrudRepository<Book, String>{

	
	Optional<Book> findByIsbn(String id);
	
	List<Book> findAll();
}
