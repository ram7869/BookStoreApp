package com.book.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Chapter {
	
	@Id
	private String title;
	private Integer chapterNumber;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "BOOK_ISBN",referencedColumnName = "isbn")
	private Book book;
	
	public Chapter() {}	
	public Chapter(String title, Integer chapterNumber) {
		this.title = title;
		this.chapterNumber = chapterNumber;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getChapterNumber() {
		return chapterNumber;
	}
	public void setChapterNumber(Integer chapterNumber) {
		this.chapterNumber = chapterNumber;
	}
	
	
	
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "Chapter [title=" + title + ", chapterNumber=" 
				+ chapterNumber + "]";
	}	
}














