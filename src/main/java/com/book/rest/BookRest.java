package com.book.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.domain.Book;
import com.book.domain.Publisher;
import com.book.service.BookService;

@RestController
@RequestMapping(path = "/book")
public class BookRest {
	
	@Autowired
	public BookService bookService;
	
	
	@GetMapping( "/info" )
	public ResponseEntity<Book> getBookInfo() {
		Book book = new Book();
		book.setIsbn("123");
		book.setIsbn("The Life");
		book.setPublisher(new Publisher("TL123", "CTS"));
		return new ResponseEntity<Book>(book, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Book>> getAllBook(){
		List<Book> list =bookService.getAllBook();
		return new ResponseEntity<List<Book>>(list, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable("id") String id){
		Book list =bookService.getBookById(id);
		return new ResponseEntity<Book>(list, HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Book> save(@RequestBody Book book){
		Book bookRes = bookService.save(book);
		return new ResponseEntity<Book>(bookRes, HttpStatus.OK);
	}
	
	@RequestMapping("*")
	@ResponseBody
	public String fallbackMethod(){
		return "fallback method";
	}

}
