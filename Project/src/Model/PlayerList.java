package Model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


import kernel.Game;

public class PlayerList implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7052786572097302129L;
	
	
	//private ArrayList<Player> players;
	private Map<String, Player> players;
	

	public Map<String, Player> getPlayers() {
		return players;
	}

	public void setPlayers(Map<String, Player> players) {
	
		Player saved = Game.getInstance().getPlayer();
		this.players = players;
		Player p = this.players.get(Game.getInstance().getPlayer().getPseudo());
		if(p != null){
			Game.getInstance().setPlayer(p); // update the application player through the players received 
			Player pNew = Game.getInstance().getPlayer();
			pNew.setX(saved.getX());
			pNew.setY(saved.getY());
			
		}

			
		
	}

	/**
	 * 
	 * @param joueur
	 * @return 
	 */
	public void add(Player p) {
		
		Player pseudoExistant = getPlayers().get(p.getPseudo());

		
		int i=1;
		while(pseudoExistant != null){
			p.setPseudo(pseudoExistant.getPseudo() + "_"+i);
			pseudoExistant = getPlayers().get(p.getPseudo());
			i++;
		}
	
			
		this.players.put(p.getPseudo(), p);
		
	}

	/**
	 * 
	 * @param joueur
	 * @return 
	 */
	public void remove(Player joueur) {
		this.players.remove(joueur.getPseudo());
	}

	/**
	 * 
	 * @return 
	 */
	public int getAlive() {
		int alive = 0;
		
		for (Entry<String, Player> player : players.entrySet()){
			if(player.getValue().isAlive())
				alive++;
		}
		
		return alive;
	}

	/**
	 * 
	 * @return 
	 */
	public Player getWinner() {
		if(getAlive() == 1){
			while(players.values().iterator().hasNext()){
				Player p = players.values().iterator().next();
				if(p.isAlive())
					return p;
			}
		}
		
		return null;
	}

	/**
	 * 
	 * @param j
	 * @return 
	 */
	public void replace(Player j) {
		Player p = this.players.get(j.getPseudo());
		if(p != null){
			
			p.setX(j.getX());
			p.setY(j.getY());
			p.setAlive(j.isAlive());
		}
		
	}
	
	public PlayerList(){
		this.players = new HashMap<String, Player>();
	}
	
	public String toString(){
		String  s = "";
		
		for (Entry<String, Player> player : players.entrySet()){
			s = s + player.getValue().getPseudo() + "\r\n";
		}

		return s;
	}
	


}