package com.nagarro.lms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nagarro.lms.entity.Book;
import com.nagarro.lms.repository.BooksRepository;

@SpringBootApplication
public class LibraryManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementSystemApplication.class, args);
	}

	@Autowired
	private BooksRepository booksRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * Book b1 = new Book(1,"Holy Book"); booksRepository.save(b1); Book b2 = new
		 * Book(2,"Mugli Book"); booksRepository.save(b2);
		 */
	}
	

}
