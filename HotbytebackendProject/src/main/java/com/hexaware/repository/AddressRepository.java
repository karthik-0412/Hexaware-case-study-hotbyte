package com.hexaware.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
