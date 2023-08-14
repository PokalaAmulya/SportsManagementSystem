package com.sms.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.dto.PlayerDTO;
import com.sms.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer> 

{

	List<PlayerDTO> findPlayerByPlayername(String playername);
	List<PlayerDTO> findPlayerByPlayerteam(String playerteam);
	Player save(PlayerDTO addPlayer);
	
}





