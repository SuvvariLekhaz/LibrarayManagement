package com.ava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ava.dao.BookRepository;
import com.ava.model.Bookstore;



@Service
public class BookServiceImplementation implements BookService {

	@Autowired
	BookRepository bookRepo;
	
	@Override
	public Bookstore findById(int id) {
		return bookRepo.findById(id).get();
	}
	
	@Override
	public List<Bookstore> getAllBooks() {
		// TODO Auto-generated method stub
		
		System.out.println("in service");
		return bookRepo.findAll();
	}

	@Override
	public Bookstore insertBook(Bookstore book) {
		// TODO Auto-generated method stub
		return bookRepo.save(book);
	}
	
	@Override
	public void removeBookById(int id) {
		bookRepo.deleteById(id);
	}
	
	@Override
	public void removeBookAll() {
		bookRepo.deleteAll();;
	}
	
	@Override
	public Bookstore updateBookById(Bookstore book,int id) {
		Bookstore toUpdate = bookRepo.findById(id).get();
		toUpdate.setTitle(book.getTitle());
		toUpdate.setAuthor(book.getAuthor());
		toUpdate.setPrice(book.getPrice());		
		return bookRepo.save(toUpdate);
	
		
		
	}

}