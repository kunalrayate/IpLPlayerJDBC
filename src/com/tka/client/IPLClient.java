package com.tka.client;

import java.util.List;

import com.tka.controller.Controller;
import com.tka.entity.Player;

public class IPLClient {
	public static void main(String[] args) {
		Controller controller = new Controller();
		List<Player> AllPlayer = controller.allPlayer();
		 System.out.println(AllPlayer);

//		List<Player> allCSKPlayer = controller.getallCSKPlayer();
//		System.out.println(allCSKPlayer);

//		List<Player> allMIPlayer = controller.getallMIPlayer();
//		System.out.println(allMIPlayer);

//		List<Player> allRCBPlayer = controller.getallRCBPlayer();
//		System.out.println(allRCBPlayer);

//		List<Player> allGTPlayer = controller.getallGTPlayer();
//		System.out.println(allGTPlayer);

//		List<Player> allSHPlayer = controller.getallSHPlayer();
//		System.out.println(allSHPlayer);

//		List<Player> allPKPlayer = controller.getallPKPlayer();
//		System.out.println(allPKPlayer);

//		List<Player> allplayerMaxRun = controller.getallPlayerMaxRun();
//		System.out.println(allplayerMaxRun);

//		List<Player> allplayerMinRun = controller.getallPlayerMinRun();
//		System.out.println(allplayerMinRun);
	}
}