package com.sms.service;


import java.util.List;



import com.sms.dto.SportsDTO;

import com.sms.entity.Sports;

public interface SportsService {
	
	
	SportsDTO addSports(Sports sports);
	List<SportsDTO> getAllSports();
	SportsDTO getSportsById(int id);
	String deleteSports(int id);
	List<SportsDTO> getsportsByName(String name);  
	List<SportsDTO> getsportsByLocation(String location);
	Sports addSports(SportsDTO sportsDTO);
}


