package com.book.domain;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Book {
	@Id
	private String isbn;
	
	@Column(name = "BOOK_NAME")
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "PUBLISHER_CODE")
	private Publisher publisher;
	
	@OneToMany(mappedBy = "book",cascade = CascadeType.ALL)
	private List<Chapter>  chapters = new ArrayList<>();
	
	
	
	public Book() {}
	public Book(String isbn, String name, Publisher publisher) {
		this.isbn = isbn;
		this.name = name;
		this.publisher = publisher;
	}

	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
		
	public List<Chapter> getChapters() {
		return chapters;
	}
	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", publisher="
				+ publisher + "]";
	}
}












































