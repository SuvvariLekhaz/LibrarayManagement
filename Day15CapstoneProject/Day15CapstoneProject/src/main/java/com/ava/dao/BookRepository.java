package com.ava.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ava.model.Bookstore;

@Repository
public interface BookRepository extends JpaRepository<Bookstore,Integer> {
	

}
