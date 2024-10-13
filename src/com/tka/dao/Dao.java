package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Player;

public class Dao {
	String path = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3307/player";
	String uname = "root";
	String pwd = "root";
	Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	ResultSet rs1 = null;
	List<Player> playerList = null;
	String query = " SELECT * FROM player.ipl";
//	String query1 = "INSERT INTO ipl (jn,'name',runs,wickets,'tname') VALUES(101,'kunal' 7200,20,'CSK)";

	public List<Player> allPlayer() {
		playerList = new ArrayList<Player>();
		try {
			Class.forName(path);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			con = DriverManager.getConnection(url, uname, pwd);

			st = con.createStatement();

			rs = st.executeQuery(query);

			// rs1 = DriverManager.getConnection(url, uname,
			// pwd).createStatement().executeQuery(query1);

			while (rs.next()) {
				int jn = rs.getInt("jn");
				String name = rs.getString("name");
				int runs = rs.getInt("runs");
				int wickets = rs.getInt("wickets");
				String tname = rs.getString("tname");

				Player p1 = new Player(jn, name, runs, wickets, tname);
				playerList.add(p1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return playerList;
	}
}