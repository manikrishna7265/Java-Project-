package com.mycompany.bookstore.repository.impl;

import com.mycompany.bookstore.entity.BookEntity;
import com.mycompany.bookstore.repository.BookRepository;
import com.mycompany.bookstore.serdeser.BookSerializer;

public class BookRepositoryimpl implements BookRepository{

	public Long add(BookEntity bookEntity) {
		BookSerializer.serializerBook(bookEntity);
		
		return bookEntity.getBookId();
		
	}

	@Override
	public BookEntity getDetail(Long bookId) {
		BookEntity be =  BookSerializer.deSerializerBook(bookId);
		return be;
	}
	
}
