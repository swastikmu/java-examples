package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Alien;

import java.util.List;



public interface AlienRepo extends CrudRepository<Alien, Integer>{

	List<Alien> findByTech(String tech);
	
	List<Alien> findByAidGreaterThan(int aid);
	
}
