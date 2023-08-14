package com.sms.serviceimpl;
import java.util.ArrayList;


import java.util.List;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;
import com.sms.dto.PlayerDTO;
import com.sms.entity.Player;
import com.sms.repository.PlayerRepository;

import com.sms.service.PlayerService;
import com.sms.util.PlayerConverter;


@Service
public class PlayerServiceImpl implements PlayerService {
	@Autowired
	PlayerRepository playerRepository;

	@Autowired
	PlayerConverter playerConverter;


	

	public PlayerDTO getPlayerById(int id) {
		Player player=playerRepository.findById(id).get();
		return playerConverter.convertToPlayerDTO(player);
	}

	
	public String deletePlayer(int id) {
		playerRepository.deleteById(id);

		return "Player details got deleted successfuly";
	}
	
	
	public List<PlayerDTO> getplayerByPlayername(String playername) {
		return playerRepository.findPlayerByPlayername(playername);
	}

	public List<PlayerDTO> getPlayerByPlayerteam(String playerteam) {
		
		return playerRepository.findPlayerByPlayerteam(playerteam);
	}

	
	@Override
	public List<PlayerDTO> getAllPlayer() {
		List<Player> players=playerRepository.findAll();

		//list of DTO type
		List <PlayerDTO>DTOList=new ArrayList<>();
		for(Player p:players)
		{
			DTOList.add(playerConverter.convertToPlayerDTO(p));
		}
		return DTOList;
		}

	@Override
	public PlayerDTO updatePlayer(int id, PlayerDTO player) {
		Player p=playerRepository.findById(id).get();
		p.setPlayername(player.getPlayername());
		p.setPlayerteam(player.getPlayerteam());
		
		Player play=playerRepository.save(p);
		return playerConverter.convertToPlayerDTO(play);
	}


	@Override
	public PlayerDTO addPlayer(PlayerDTO playerDTO) {
		Player p=playerRepository.save(playerDTO);
		return playerConverter.convertToPlayerDTO(p);
	}
	
	

}	
	

	
	




