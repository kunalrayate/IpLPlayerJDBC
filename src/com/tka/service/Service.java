package com.tka.service;

import java.util.ArrayList;
import java.util.List;

import com.tka.dao.Dao;
import com.tka.entity.Player;

public class Service {
	Dao dao = null;

	public List<Player> allPlayer() {
		dao = new Dao();
		List<Player> AllPlayer = dao.allPlayer();
		return AllPlayer;
	}

	public List<Player> getallCSKPlayer() {
		// TODO Auto-generated method stub
		dao = new Dao();
		List<Player> allPlayer = dao.allPlayer();
		List<Player> cskplayer = new ArrayList<Player>();

		for (Player player : allPlayer) {
			if (player.getTname().equals("CSK")) {
				cskplayer.add(player);
			}

		}
		return cskplayer;
	}

	public List<Player> getallMIPlayer() {
		// TODO Auto-generated method stub
		dao = new Dao();
		List<Player> AllPlayer = dao.allPlayer();
		List<Player> miplayer = new ArrayList<Player>();
		for (Player player : AllPlayer) {
			if (player.getTname().equals("MI")) {
				miplayer.add(player);
			}
		}
		return miplayer;
	}

	public List<Player> getallRCBPlayer() {
		// TODO Auto-generated method stub
		dao = new Dao();
		List<Player> AllPlayer = dao.allPlayer();
		List<Player> rcbplayer = new ArrayList<Player>();
		for (Player player : AllPlayer) {
			if (player.getTname().equals("RCB")) {
				rcbplayer.add(player);
			}

		}
		return rcbplayer;
	}

	public List<Player> getallGTPlayer() {
		// TODO Auto-generated method stub
		dao = new Dao();
		List<Player> AllPlayer = dao.allPlayer();
		List<Player> gtplayer = new ArrayList<Player>();
		for (Player player : AllPlayer) {
			if (player.getTname().equals("GT")) {
				gtplayer.add(player);

			}

		}
		return gtplayer;
	}

	public List<Player> getallPlayerMaxRun() {
		// TODO Auto-generated method stub
		dao = new Dao();
		List<Player> AllPlayer = dao.allPlayer();
		List<Player> allplayerMaxrun = new ArrayList<Player>();
		for (Player player : AllPlayer) {
			if (player.getRuns() >= 7000) {
				allplayerMaxrun.add(player);
			}

		}
		return allplayerMaxrun;
	}

	public List<Player> getallPlayerMinRun() {
		// TODO Auto-generated method stub
		dao = new Dao();
		List<Player> AllPlayer = dao.allPlayer();
		List<Player> allplayerMinrun = new ArrayList<Player>();
		for (Player player : AllPlayer) {
			if (player.getRuns() < 1500) {
				allplayerMinrun.add(player);
			}

		}
		return allplayerMinrun;
	}

	public List<Player> getallSHPlayer() {
		// TODO Auto-generated method stub
		dao = new Dao();
		List<Player> AllPlayer = dao.allPlayer();
		List<Player> allshplayer = new ArrayList<Player>();
		for (Player player : AllPlayer) {
			if (player.getTname().equals("SH")) {
				allshplayer.add(player);
			}

		}
		return allshplayer;
	}

	public List<Player> getallPKPlayer() {
		// TODO Auto-generated method stub
		dao = new Dao();
		List<Player> AllPlayer = dao.allPlayer();
		List<Player> allpkplayer = new ArrayList<Player>();
		for (Player player : AllPlayer) {
			if (player.getTname().equals("PK")) {
				allpkplayer.add(player);
			}

		}
		return allpkplayer;
	}
}