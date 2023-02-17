package com.mycompany.bookstore.controller;

import com.mycompany.bookstore.dto.BookDTO;
import com.mycompany.bookstore.service.BookService;
import com.mycompany.bookstore.service.impl.BookServiceimpl;

public class BookController {
	private BookService bookservice;
		public BookController() {
			//Dynamic/runtime polymorphism
			this.bookservice = new BookServiceimpl();
		}
public Long add(BookDTO bookDTO) {
		// call to the service layer add method 
		return this.bookservice.add(bookDTO);
	}
public BookDTO getBook(Long bookId) {
	// call to the service layer get book method return the book DTO object 
	return this.bookservice.getBook(bookId);
	
}
}
