package com.nagarro.lms.service;

import java.util.List;

import com.nagarro.lms.entity.Book;

public interface BooksService {
	
	List<Book> getAllBooks();
	Book saveBook(Book book);
	Book updateBook(Book book);
	Book getBookById(Long id);
	void deleteBookById(Long id);

}
