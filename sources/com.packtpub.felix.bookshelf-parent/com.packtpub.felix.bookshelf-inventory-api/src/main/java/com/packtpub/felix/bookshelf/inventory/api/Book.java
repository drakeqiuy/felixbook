package com.packtpub.felix.bookshelf.inventory.api;

public interface Book {
	public String getIsbn();

	public String getTitle();

	public String getAuthor();

	public String getCategory();

	public int getRating();
}
