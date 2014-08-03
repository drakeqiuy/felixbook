package com.packtpub.felix.bookshelf.inventory.api;

import java.util.Map;
import java.util.Set;

public interface BookInventory {
	public enum SearchCriteria {
		ISBN_LIKE,
		TITLE_LIKE,
		AUTHOR_LIKE,
		CATEGORY_LIKE,
		RATING_GT,
		RATING_LT
	}
	
	public Set<String> searchBooks(Map<SearchCriteria,String> criteria);
	public Set<String> getCategories();
	
	public MutableBook createBook(String isbn) throws BookAlreadyExistsException;
	public MutableBook loadBookForEdit(String isbn)throws BookNotFoundException;
	public String storeBook(MutableBook book) throws InvalidBookException;
	
	public Book loadBook(String isbn) throws BookNotFoundException;
	public void removeBook(String isbn) throws BookNotFoundException;
	
}
