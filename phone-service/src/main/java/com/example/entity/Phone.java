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
public class Phone {
	@Id
	@GeneratedValue	
    private Long id;
    private Integer phoneNumber;
    
    public Phone() {
    	
    }
    
    public Phone(Integer phoneNumber) {
    	this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
}
