package com.myProject.BookStore.service;

import com.myProject.BookStore.entity.Book;
import com.myProject.BookStore.entity.MyBookList;
import com.myProject.BookStore.repository.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookListService {

    @Autowired
    private MyBookRepository myBookRepository;

    public void saveMyBooks(MyBookList myBookList){
        myBookRepository.save(myBookList);
    }

    public List<MyBookList> getAllMyBook() {
        return myBookRepository.findAll();
    }

    public void deleteById(int id) {
        myBookRepository.deleteById(id);
    }
}
