package com.book.shop.service;

import java.util.List;

import com.book.shop.domain.Book;

public interface BookService {

	public void saveBook(Book book);

	public Book getBookById(int id);

	public List<Book> getAllBooks();

	public void deleteBook(int id);

	public List<Book> searchBook(String quary);

}
