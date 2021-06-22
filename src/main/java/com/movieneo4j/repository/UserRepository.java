package com.movieneo4j.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.movieneo4j.entity.Users;


@Repository
public interface UserRepository extends Neo4jRepository<Users, Long>{
				
			Users findByUsername(String username); 
}
