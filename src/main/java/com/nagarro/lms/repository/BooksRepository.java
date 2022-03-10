package com.nagarro.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.lms.entity.Book;


public interface BooksRepository extends JpaRepository<Book,Long> {

}
