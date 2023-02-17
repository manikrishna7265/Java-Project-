package com.mycompany.bookstore.entity;

import java.io.Serializable;

public class BookEntity  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long bookId;
	private String name;
	private String description;
	private Double pricePerQty;
	private Integer availableQty;
	private String authorname;
	private String authoremail;
	
	public BookEntity() {}
	
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPricePerQty() {
		return pricePerQty;
	}
	public void setPricePerQty(Double pricePerQty) {
		this.pricePerQty = pricePerQty;
	}
	public Integer getAvailableQty() {
		return availableQty;
	}
	public void setAvailableQty(Integer availableQty) {
		this.availableQty = availableQty;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public String getAuthoremail() {
		return authoremail;
	}
	public void setAuthoremail(String authoremail) {
		this.authoremail = authoremail;
	}
	
	
}
