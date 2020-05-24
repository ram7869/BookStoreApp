package com.book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.domain.Book;
import com.book.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	public BookRepository bookRepository;

	public List<Book> getAllBook() {
		return bookRepository.findAll();
	}

	public Book getBookById(String id) {
		 Optional<Book> optional = bookRepository.findByIsbn(id);
		 return optional.isPresent()?optional.get():null;
	}

	public Book save(Book book) {
		Book book1 = bookRepository.save(book);
		return book1;
	}

}
