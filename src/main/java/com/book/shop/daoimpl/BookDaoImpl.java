package com.book.shop.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.book.shop.dao.BookDao;
import com.book.shop.domain.Book;
import com.book.shop.util.ConnectionUtil;

@Repository
public class BookDaoImpl extends ConnectionUtil implements BookDao {

	@Override
	public void saveBook(Book book) {
		getSession().saveOrUpdate(book);

	}

	@Override
	public Book getBookById(int id) {

		return (Book) getSession().get(Book.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> getAllBooks() {
		return getSession().createQuery("From Book").list();
	}

	@Override
	public void deleteBook(Book book) {
		getSession().delete(book);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> searchBook(String query) {
		return getSession().createQuery("From Book b Where b.title LIKE :tquery OR b.author LIKE :aquery OR b.isbn LIKE :iquery").setString("tquery", "%" + query + "%").setString("aquery", "%" + query + "%").setString("iquery", "%" + query + "%").list();
	}

}
