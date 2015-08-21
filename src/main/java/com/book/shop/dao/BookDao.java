package com.book.shop.dao;

import java.util.List;

import com.book.shop.domain.Book;

public interface BookDao {

	public void saveBook(Book book);

	public Book getBookById(int id);

	public List<Book> getAllBooks();

	public void deleteBook(Book book);

	public List<Book> searchBook(String query);

}
