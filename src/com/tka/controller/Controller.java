package com.tka.controller;

import java.util.List;

import com.tka.entity.Player;
import com.tka.service.Service;

public class Controller {
	Service service = null;

	public List<Player> allPlayer() {
		service = new Service();
		List<Player> AllPlayer = service.allPlayer();
		return AllPlayer;
	}

	public List<Player> getallCSKPlayer() {
		// TODO Auto-generated method stub
		service = new Service();
		List<Player> allCSKPlayer = service.getallCSKPlayer();
		return allCSKPlayer;
	}

	public List<Player> getallMIPlayer() {
		// TODO Auto-generated method stub
		service = new Service();
		List<Player> allMIPlayer = service.getallMIPlayer();
		return allMIPlayer;
	}

	public List<Player> getallRCBPlayer() {
		// TODO Auto-generated method stub
		service = new Service();
		List<Player> allRCBPlayer = service.getallRCBPlayer();
		return allRCBPlayer;
	}

	public List<Player> getallGTPlayer() {
		// TODO Auto-generated method stub
		service = new Service();
		List<Player> allGTPlayer = service.getallGTPlayer();
		return allGTPlayer;
	}

	public List<Player> getallPlayerMaxRun() {
		// TODO Auto-generated method stub
		service = new Service();
		List<Player> allplayerMaxrun = service.getallPlayerMaxRun();
		return allplayerMaxrun;
	}

	public List<Player> getallPlayerMinRun() {
		// TODO Auto-generated method stub
		service = new Service();
		List<Player> allplayerMinrun = service.getallPlayerMinRun();
		return allplayerMinrun;
	}

	public List<Player> getallSHPlayer() {
		// TODO Auto-generated method stub
		service = new Service();
		List<Player> allshplayer = service.getallSHPlayer();
		return allshplayer;
	}

	public List<Player> getallPKPlayer() {
		// TODO Auto-generated method stub
		service = new Service();
		List<Player> allpkplayer = service.getallPKPlayer();
		return allpkplayer;
	}
}