package Assignment2;

import java.util.ArrayList;

public class Team {
	 private int code;
	 private ArrayList<Player> player;
	 
	 Team(){
		 code = 0;
		 player = null;
	 }
	 
	 Team(int code){
		 this.code = code;
		 player = null;
	 }
	 
	 Team(int code, ArrayList<Player> player){
		 this.code = code;
		 this.player = player;
	 }
	 
	 public int getCode() { //get code
		 return code;
	 }
	 
	 public void setCode(int code) { //set code
		 this.code = code;
	 }
	 
	 public ArrayList<Player> getPlayer(){ //get player list
		 return player;
	 }
	 
	 public void setPlayer(ArrayList<Player> player) { //set player list
		 this.player = player;
	 }
	 
	 public void addPlayer(Player player) { //add player to list
		 if(player == null) {
			 this.player = new ArrayList<Player>();
			 this.player.add(player);
		 }
		 else {
			 this.player.add(player);
		 }
	 }
}
