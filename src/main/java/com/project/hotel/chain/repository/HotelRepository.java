package com.project.hotel.chain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.hotel.chain.model.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

}
