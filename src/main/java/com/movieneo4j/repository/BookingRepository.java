package com.movieneo4j.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.movieneo4j.entity.Booking;
@Repository
public interface BookingRepository extends Neo4jRepository<Booking, Long>  {

}
