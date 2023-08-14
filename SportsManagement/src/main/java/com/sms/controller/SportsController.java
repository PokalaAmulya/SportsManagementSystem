package com.sms.controller;
import java.util.List;

import javax.validation.Valid;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sms.dto.SportsDTO;
import com.sms.entity.Sports;



import com.sms.exception.ResourceNotFoundException;
import com.sms.service.SportsService;
@RestController	
public class SportsController {
	@Autowired
	SportsService sportsService;{
	
	}

	@PostMapping("/addSports")
	ResponseEntity<Sports> addSports(@RequestBody Valid SportsDTO )
	{
		try
		{
	ResponseEntity<Sports> sports=((SportsController)sportsService).addSports(SportsDTO);
		if(sports!=null)
		{
			return new ResponseEntity<Sports>(HttpStatus.CREATED);
		}
		
		}
	
	catch(Exception e)
	{
		throw new ResourceNotFoundException("Sports data is not entered properly,check it");
	}
	return new ResponseEntity<Sports>(HttpStatus.BAD_REQUEST);
	}
	@GetMapping("/getSportsById/{id}")
	ResponseEntity<SportsDTO> getSportsById(@PathVariable int id)
	{
		return new ResponseEntity<SportsDTO>(sportsService.getSportsById(id),HttpStatus.FOUND);
	}

	@GetMapping("/getAllSports")
	ResponseEntity<List<SportsDTO>> getSports()
	{
		return new ResponseEntity<List<SportsDTO>>(sportsService.getAllSports(),HttpStatus.FOUND);
	}

	@GetMapping("/getsportsByName/{name}")
	ResponseEntity<Sports> getSportsByName(@PathVariable String name){

		return new ResponseEntity<Sports>(HttpStatus.OK);
	}
	@GetMapping("/getSportsbylocation")
	ResponseEntity<Sports> getStudentByLocation(@PathVariable String location){
		return new ResponseEntity<Sports>(HttpStatus.OK);
	}

	}






