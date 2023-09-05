package com.myProject.BookStore.service;

import com.myProject.BookStore.entity.Book;
import com.myProject.BookStore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void saveBook(Book book){
        bookRepository.save(book);
    }

    public List<Book> getAllBook(){

        return bookRepository.findAll();
    }

    public Book getBookById(int id){

        return bookRepository.findById(id).get();
    }

    public void deleteById(int id) {
        bookRepository.deleteById(id);
    }
}
