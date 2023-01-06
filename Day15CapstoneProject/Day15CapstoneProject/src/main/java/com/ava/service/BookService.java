package com.ava.service;

import java.util.List;

import com.ava.model.Bookstore;

public interface BookService {

	Bookstore findById(int id);

	List<Bookstore> getAllBooks();

	Bookstore insertBook(Bookstore book);

	void removeBookById(int id);

	void removeBookAll();

	Bookstore updateBookById(Bookstore book, int id);

	

	


	


}

