package com.movieneo4j.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.movieneo4j.entity.Theatre;
@Repository
public interface TheatreRepository extends Neo4jRepository<Theatre, Long>{
	
		
	Theatre findByScreen(int screen);

	void deleteByTheatrename(String theatrename);
}
