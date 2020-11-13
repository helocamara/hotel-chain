package com.project.hotel.chain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.hotel.chain.model.Price;

@Repository
public interface PriceRepository extends JpaRepository <Price, Long> {

}
