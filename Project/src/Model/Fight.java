package Model;

import java.util.Random;
import java.util.Timer;
import java.util.Map.Entry;

public class Fight {
	
	protected Grid grid;
	protected Color chosenColor;
	protected Server server;
	protected Difficulty difficulty;
	
	protected Timer refresh;
	protected Timer pause;
	private int acceptEndOfRound;
	protected int timer;
	protected int timerMax;
	protected int roundCounter;
	
	public Fight(Server s){
		roundCounter = 0;
		timerMax = 10;
		acceptEndOfRound = 0;
		server = s;
	}
	
	public Fight(Server s, Difficulty d){
		this(s);
		this.difficulty = d;
		
		for (Entry<String, Player> player : this.server.getPlayerList().getPlayers().entrySet()){
		
				player.getValue().setAlive(true);
				
			
		}
		this.server.broadcast("players", this.server.getPlayerList());
		
		
	}
	
	
	public void newRound(){
		
		timerMax--;
		
		if(timerMax <= 2)
			timerMax = 2;
		
		timer = timerMax;		
		roundCounter++;
		
		
		this.grid = new Grid(this.difficulty, new Random());
		chosenColor = grid.getRandomColor();
		
		server.broadcast("grid", grid);
		server.broadcast("color", chosenColor);
		server.broadcast("newRound", null);
		
		refresh = new Timer();
		refresh.schedule(new FightTimerRefresh(this), 0, 1000);
		

		
	}
	
	
	protected void startEndOfRound(){
		
		acceptEndOfRound = 0;
		
		pause = new Timer();
		pause.schedule(new FightTimerEndOfRound(this, 5000), 0, 1000);
		
		this.server.broadcast("endRound", null);
		
		while(true){
			
			if(acceptEndOfRound == this.server.getSocketsHandler().size()){	// attend l'accus� de reception de tout les clients. Puis tue les joueurs qu'il faut et envoi l'information.
				
				killPlayers();
				this.grid.show(this.chosenColor);
				this.server.broadcast("grid", this.grid);
				this.server.broadcast("players", this.server.getPlayerList());
				
				if( this.server.getPlayerList().getAlive() == 1){
					this.win();
				}else if( this.server.getPlayerList().getAlive() == 0) {
					this.tie();
				}
				break;
			}
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	protected void win(){
		this.server.getPlayerList().getWinner().setScore( this.server.getPlayerList().getWinner().getScore() + 100);
		this.server.broadcast("win", this.server.getPlayerList().getWinner());
		this.server.broadcast("end", null);
		this.server.fight = null;
	}
	
	protected void tie(){
		this.server.broadcast("tie", null);
		this.server.broadcast("end", null);
		this.server.fight = null;
	} 
	
	protected void stopEndOfRound(){
		
		pause.cancel();
		if(this.server.getPlayerList().getAlive() > 1){
			this.newRound();
		}
		
	}
	
	protected void timesUp(){
		refresh.cancel();
		startEndOfRound();
		
	}
		
	private void killPlayers(){
		
	
		// Corriger le fait que le joueur soit pas synchro lors de la mort.
		for (Entry<String, Player> player : this.server.getPlayerList().getPlayers().entrySet()){
			if(! grid.getCellAt(player.getValue().getX()/grid.getSizeCells(), player.getValue().getY()/grid.getSizeCells()).getColor().equals(chosenColor)){
				if(player.getValue().isAlive()){
					player.getValue().setAlive(false);
					
				}	
			}
				
		}
	
	
	}

	public int getAcceptEndOfRound() {
		return acceptEndOfRound;
	}

	public void setAcceptEndOfRound(int acceptEndOfRound) {
		this.acceptEndOfRound = acceptEndOfRound;
	}
	
	
	
	
	

}
