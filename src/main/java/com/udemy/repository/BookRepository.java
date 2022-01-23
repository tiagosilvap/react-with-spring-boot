package com.udemy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.data.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
