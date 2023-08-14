package com.sms.dto;

import javax.validation.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class PlayerDTO {
	private int id;

	@NotNull(message="Name of Player can never be null")
	@NotBlank(message="Name of Player can never be empty")
	@Size(min=5)
	private String playername;

	@NotBlank(message="Name of Player can never be empty")
	private String playerteam;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
