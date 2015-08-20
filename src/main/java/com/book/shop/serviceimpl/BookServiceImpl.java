package com.book.shop.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.book.shop.dao.BookDao;
import com.book.shop.domain.Book;
import com.book.shop.service.BookService;

@Service
@Transactional
public class BookServiceImpl implements BookService {

	@Autowired
	BookDao bookDao;

	@Override
	public void saveBook(Book book) {
		bookDao.saveBook(book);

	}

	@Override
	public Book getBookById(int id) {
		return bookDao.getBookById(id);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}

	@Override
	public void deleteBook(int id) {
		Book book = getBookById(id);
		if (book != null)
			bookDao.deleteBook(book);

	}

	@Override
	public List<Book> searchBook(String quary) {
		return bookDao.searchBook(quary);
	}

}
