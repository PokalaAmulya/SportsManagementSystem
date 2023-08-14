package com.sms.repository;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.dto.SportsDTO;

import com.sms.entity.Sports;


public interface SportsRepository extends JpaRepository<Sports,Integer> 
{
	List<SportsDTO>findByAll();
 List<SportsDTO>findById(int id);
	List<SportsDTO> findByLocation(String location);

	List<SportsDTO> findByName(String name);

	Sports save(Sports sports);
}