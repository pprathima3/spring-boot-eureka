/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author praveena
 */

@RepositoryRestResource
public interface BookRepository extends JpaRepository<Book, Long>{
    
}
