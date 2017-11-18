/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



/**
 *
 * @author praveena
 */
@Entity
public class Book {
	@Id
	@GeneratedValue	
    private Long id;
    private String bookName;
    
    public Book() {
    	
    }
    
    public Book(String bookName) {
    	this.bookName = bookName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    
    
}
