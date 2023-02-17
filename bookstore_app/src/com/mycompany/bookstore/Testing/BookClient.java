package com.mycompany.bookstore.Testing;

import com.mycompany.bookstore.controller.BookController;
import com.mycompany.bookstore.dto.BookDTO;

public class BookClient {

	public static void main(String[] args) {
		BookController controller = new BookController();
		//create the BookDTO and call the controller add book method 
		//call the add book functionality 
		addBook(controller);
		//call the get book Detail functionality 
		getBook(controller,111L);
	}
	private static void getBook(BookController controller, Long bookId) {
		BookDTO bookDTO = controller.getBook(bookId);
		System.out.println("following are  details for Book with ID:"+bookId);
		System.out.println("Book Name"+ bookDTO.getName());
		System.out.println("Book Author"+bookDTO.getAuthorname());
		System.out.println("Book Price"+bookDTO.getPricePerQty());
		
	}
	
	private static void addBook(BookController controller) {
		BookDTO bookDTO = new BookDTO();
		bookDTO.setBookId(111L);
		bookDTO.setAuthoremail("Author1@gmail.com");
		bookDTO.setAuthorname("Author name");
		bookDTO.setAvailableQty(10);
		bookDTO.setName("Book One");
		bookDTO.setDescription("Book One Description");
		bookDTO.setPricePerQty(19.95);
		
	//call controller add method and hold the return value
	Long bookId = controller.add(bookDTO);
	if(bookId != null) {
		System.out.println("Book was successfully created with Id:" + bookId);
	}else {
		System.out.println("Some error is occured while creating a new book:");
	}	
	}
}
