package com.library.backend.library_management_backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.library.backend.library_management_backend.Entities.Book;
import com.library.backend.library_management_backend.Service.BookService;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class BookController {
	@Autowired
	BookService bookService;

	@GetMapping("/home")
	public String home() {
		return "This is Home Page";
	}

	@GetMapping("/view-books")
	public List<Book> getBooks() {
		return bookService.getBooks();
	}
	
	@PostMapping("/add-books")
	public Book addBooks(@RequestBody Book book) {
		return bookService.addBooks(book);
	}
	
	@GetMapping("/book/{bookId}")
	public Book searchBookById(@PathVariable String bookId) {

		return bookService.searchBookById(Long.parseLong(bookId));

	}

	@PutMapping("/update-book")
	public Book updateBook(@RequestBody Book book) {
		return bookService.updateBook(book);
	}
	
	@DeleteMapping("/delete-book/{bookId}")
	public String deleteBook(@PathVariable String bookId) {
		return bookService.deleteBook(Long.parseLong(bookId));
	}
	
}
