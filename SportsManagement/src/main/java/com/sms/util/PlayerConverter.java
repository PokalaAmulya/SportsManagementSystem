package com.sms.util;
import org.springframework.beans.BeanUtils;


import org.springframework.stereotype.Component;

import com.sms.dto.PlayerDTO;
import com.sms.entity.Player;




@Component
public class PlayerConverter {
	//converting DTO to entity
	public PlayerDTO convertToPlayerEntity(PlayerDTO playerDTO)
	{
		PlayerDTO player=new PlayerDTO();
		if(player!=null)
		{
			BeanUtils.copyProperties(player,player );
		}
		return player;

	}
	//converting  entity to DTO
	public PlayerDTO convertToPlayerDTO(Player player)
	{
		PlayerDTO playerDTO=new PlayerDTO();
		if(player!=null)
		{
			BeanUtils.copyProperties(player,playerDTO );
		}
		return playerDTO;

	}
}



