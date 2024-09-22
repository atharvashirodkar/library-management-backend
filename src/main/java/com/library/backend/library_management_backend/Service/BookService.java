package com.library.backend.library_management_backend.Service;

import java.util.List;

import com.library.backend.library_management_backend.Entities.Book;

public interface BookService {

	List<Book> getBooks();

	Book addBooks(Book book);

	Book searchBookById(long long1);

	Book updateBook(Book book);

	String deleteBook(long long1);


}
