package com.library.backend.library_management_backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.backend.library_management_backend.Entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}