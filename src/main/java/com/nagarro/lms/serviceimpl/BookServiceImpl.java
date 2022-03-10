package com.nagarro.lms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.lms.entity.Book;
import com.nagarro.lms.repository.BooksRepository;
import com.nagarro.lms.service.BooksService;

@Service
public class BookServiceImpl implements BooksService {
	
	@Autowired
	private BooksRepository booksRepository;

	@Override
	public List<Book> getAllBooks() {
		return booksRepository.findAll();
	}

	@Override
	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		return booksRepository.save(book);
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return booksRepository.save(book);
	}

	@Override
	public Book getBookById(Long id) {
		// TODO Auto-generated method stub
		return booksRepository.findById(id).get();
	}

	@Override
	public void deleteBookById(Long id) {
		// TODO Auto-generated method stub
		booksRepository.deleteById(id);
		
	}

}
