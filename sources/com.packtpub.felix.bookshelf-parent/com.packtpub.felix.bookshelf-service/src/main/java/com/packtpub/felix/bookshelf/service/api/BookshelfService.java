package com.packtpub.felix.bookshelf.service.api;

import java.util.Set;

import com.packtpub.felix.bookshelf.inventory.api.Book;
import com.packtpub.felix.bookshelf.inventory.api.BookAlreadyExistsException;
import com.packtpub.felix.bookshelf.inventory.api.BookNotFoundException;
import com.packtpub.felix.bookshelf.inventory.api.InvalidBookException;

public interface BookshelfService extends Authentication {

	public Set<String> getCategories(String sessionId);

	public void addBook(String session, String isbn, String title,
			String author, String category, int rating)
			throws BookAlreadyExistsException, InvalidBookException;

	public void modifyBookCategory(String session, String isbn, String category)
			throws BookNotFoundException, InvalidBookException;

	public void modifyBookRating(String session, String isbn, int rating)
			throws BookNotFoundException, InvalidBookException;

	public void removeBook(String session, String isbn)
			throws BookNotFoundException;

	public Book getBook(String session, String isbn)
			throws BookNotFoundException;

	public Set<String> searchBooksByCategory(String session, String categoryLike);

	public Set<String> searchBooksByAuthor(String session, String authorLike);

	public Set<String> searchBooksByTitle(String session, String titleLike);

	public Set<String> searchBooksByRating(String session, int ratingLower,
			int ratingUpper);

}
