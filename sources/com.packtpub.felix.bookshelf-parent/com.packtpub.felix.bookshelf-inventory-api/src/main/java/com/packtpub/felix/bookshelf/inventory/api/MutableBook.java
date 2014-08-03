package com.packtpub.felix.bookshelf.inventory.api;

public interface MutableBook extends Book {
	public void setIsbn(String isbn);

	public void setTitle(String title);

	public void setAuthor(String author);

	public void setCategory(String category);

	public void setRating(int rating);
}
