package com.nagarro.lms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Book {
    @Id
	private long bookCode;
    @Column(name="book_name", nullable=false)
	private String bookName;
    
    private String authorName;
	
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public long getBookCode() {
		return bookCode;
	}
	public void setBookCode(long bookCode) {
		this.bookCode = bookCode;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Book(long bookCode, String bookName) {
		super();
		this.bookCode = bookCode;
		this.bookName = bookName;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
