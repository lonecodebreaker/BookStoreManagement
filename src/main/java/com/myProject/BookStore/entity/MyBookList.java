package com.myProject.BookStore.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
 @Data
 @AllArgsConstructor
 @NoArgsConstructor
 @Table(name = "MyBooks")
 public class MyBookList {

    @Id
    private int id;
    private String name;
    private String author;
    private String price;


}
