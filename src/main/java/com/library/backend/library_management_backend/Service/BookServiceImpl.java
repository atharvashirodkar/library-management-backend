package com.library.backend.library_management_backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.backend.library_management_backend.Entities.Book;
import com.library.backend.library_management_backend.Repository.BookRepository;
@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public Book addBooks(Book book) {
		// TODO Auto-generated method stub
		bookRepository.save(book);
		return book;
	}

	@Override
	public Book searchBookById(long bookId) {
		// TODO Auto-generated method stub
		Book book = bookRepository.getOne(bookId);
		return book;
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		bookRepository.save(book);
		return book;
	}

	@Override
	public String deleteBook(long bookId) {
		// TODO Auto-generated method stub
		Book foundBook = bookRepository.getOne(bookId);
		bookRepository.delete(foundBook);
		
		return "Book Deleted Successfully";
	}

}
