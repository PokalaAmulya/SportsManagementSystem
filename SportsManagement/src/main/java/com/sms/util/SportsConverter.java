package com.sms.util;


import org.springframework.beans.BeanUtils;




import com.sms.dto.SportsDTO;
import com.sms.entity.Sports;


public class SportsConverter {
	public SportsDTO convertToSportsEntity(SportsDTO sportsDTO) {
		SportsDTO sports=new SportsDTO();
		if(sportsDTO!=null) {
			BeanUtils.copyProperties(sportsDTO, sportsDTO);
		}
		return sports;
		
	}
	public SportsDTO convertToSportsDTO(Sports sports) {
		SportsDTO sportsDTO=new SportsDTO();
		if(sports!=null) {
			org.springframework.beans.BeanUtils.copyProperties(sportsDTO,  sportsDTO);
		}
		return sportsDTO;
	}

}



