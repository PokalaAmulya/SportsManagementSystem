package com.sms.controller;
import java.util.List;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



import com.sms.dto.PlayerDTO;


import com.sms.service.PlayerService;
import com.sms.util.PlayerConverter;




public class PlayerController {
    @Autowired
     PlayerService playerService;
    
    @Autowired
    PlayerConverter playerConverter;
    
    @PostMapping("/addPlayer")
	ResponseEntity<PlayerDTO> addPlayer(@RequestBody  PlayerDTO playerDTO)
	{ 
		
    	PlayerDTO player =playerConverter.convertToPlayerEntity(playerDTO);
		return new ResponseEntity<PlayerDTO>(playerService.addPlayer(playerDTO),HttpStatus.CREATED);
	}


    @GetMapping("/getPlayerById{id}")
     ResponseEntity<PlayerDTO> getPlayerById(@PathVariable int id) {
    	return new ResponseEntity<PlayerDTO>(playerService.getPlayerById(id),HttpStatus.FOUND);
        
    }
    @GetMapping("/getAllPlayer")
	ResponseEntity<List<PlayerDTO>> getBooks()
	{
		return new ResponseEntity<List<PlayerDTO>>(playerService.getAllPlayer(),HttpStatus.FOUND);
	}
	@PutMapping("/updatePlayer/{id}")
	ResponseEntity<PlayerDTO> updatePlayer(@PathVariable int id,@RequestBody PlayerDTO playerDTO)
	{
		PlayerDTO player=playerConverter.convertToPlayerEntity(playerDTO);
		return new ResponseEntity<PlayerDTO>(playerService.updatePlayer(id, player),HttpStatus.OK);
		
		
	}
	
	@DeleteMapping("/deletePlayerById/{id}")
	ResponseEntity<PlayerDTO> deleteById(@PathVariable int id)
	{
		return new ResponseEntity<PlayerDTO>(HttpStatus.OK);
	}
	
}


