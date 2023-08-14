package com.sms.entity;


import javax.persistence.Entity;





import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;





import lombok.Data;

@Entity
@Data

public class Player {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)   
	    private Long id;
	    private String playername;
	    private String playerteam;
	   
		
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getPlayername() {
			return playername;
		}
		public void setPlayername(String playername) {
			this.playername = playername;
		}
		public String getPlayerteam() {
			return playerteam;
		}
		public void setPlayerteam(String playerteam) {
			this.playerteam = playerteam;
		}		
		
}
	    

