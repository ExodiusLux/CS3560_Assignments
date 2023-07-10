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
	 
	 public int getCode() {
		 return code;
	 }
	 
	 public void setCode(int code) {
		 this.code = code;
	 }
	 
	 public ArrayList<Player> getPlayer(){
		 return player;
	 }
	 
	 public void setPlayer(ArrayList<Player> player) {
		 this.player = player;
	 }
	 
	 public void addPlayer(Player player) {
		 if(player == null) {
			 this.player = new ArrayList<Player>();
			 this.player.add(player);
		 }
		 else {
			 this.player.add(player);
		 }
	 }
}
