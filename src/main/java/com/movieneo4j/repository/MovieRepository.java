package com.movieneo4j.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.movieneo4j.entity.Movies;

@Repository
public interface MovieRepository extends Neo4jRepository<Movies, Long>{
	
}
