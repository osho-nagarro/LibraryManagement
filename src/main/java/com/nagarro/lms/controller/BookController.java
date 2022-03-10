package com.nagarro.lms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nagarro.lms.entity.Book;
import com.nagarro.lms.service.BooksService;

@Controller
public class BookController {
	
	
	private BooksService bookService;
	
	public BookController(BooksService bookService) {
		super();
		this.bookService = bookService;
	}
	

	@GetMapping("/books")
	public String listBooks(Model model) {
		model.addAttribute("books", bookService.getAllBooks());
		return "books";
	}
	
	@GetMapping("/books/new")
	public String createNewBook(Model model) {
		Book book = new Book();
		model.addAttribute("book",book);
		return "create_book";
		
	}
	
	@PostMapping("/books")
	public String saveBook(@ModelAttribute("book") Book book) {
		bookService.saveBook(book);
		return "redirect:/books";
	}
	
	@GetMapping("/books/edit/{id}")
	public String editBook(@PathVariable Long id,Model model) {
		model.addAttribute("book",bookService.getBookById(id));
		return "edit_books";
	}
	@PostMapping("/books/{id}")
	public String updateBook(@PathVariable Long id,@ModelAttribute("book") Book book,Model model) {
		
		Book nbook = bookService.getBookById(id);
		nbook.setBookCode(id);
		nbook.setBookName(book.getBookName());
		nbook.setAuthorName(book.getAuthorName());
		
		bookService.updateBook(nbook);
		
		return "redirect:/books";
		
	}
	
	@GetMapping("/books/{id}")
	public String deleteBook(@PathVariable Long id) {
		bookService.deleteBookById(id);
		return "redirect:/books";
	}

}
