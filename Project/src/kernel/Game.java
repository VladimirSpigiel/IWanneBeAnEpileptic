package kernel;


import java.util.Iterator;
import java.util.Stack;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

import Controller.GameState;
import Model.Client;
import Model.Color;
import Model.Grid;
import Model.Player;
import Model.PlayerList;
import Model.Server;
import Model.Window;
import factory.AbstractViewFactory;
import factory.View2DFactory;

public class Game extends Thread implements GameStateManager {
	
	protected static Game instance = null;
	protected static AbstractViewFactory viewFactory;
	protected Stack<GameState> gameStates;
	protected JFrame window;
	
	protected Grid grid;
	protected Color colorChosen;
	protected PlayerList players;
	protected Player player;
	
	protected Server server;
	protected Client client;
	
	protected boolean isHostApplication = false;
	
	private Game(){
		gameStates = new Stack<GameState>();
		viewFactory = new View2DFactory();
		window = new Window();
		
		
				
		
		
		players = new PlayerList();
		
		
		
	}

	public static Game getInstance(){
		if(instance == null){
			instance = new Game();
			viewFactory = new View2DFactory();
		}
		
		return instance;
	}
	
	public static AbstractViewFactory getViewFactory(){
		return viewFactory;
	}
	
	
	
	public boolean isHostApplication() {
		return isHostApplication;
	}

	public void setHostApplication(boolean isHostApplication) {
		this.isHostApplication = isHostApplication;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Color getColorChosen() {
		return colorChosen;
	}

	public void setColorChosen(Color colorChosen) {
		this.colorChosen = colorChosen;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public JFrame getWindow(){
		return window;
	}
	
	public PlayerList getPlayers() {
		return players;
	}

	public void setPlayers(PlayerList players) {
		this.getPlayers().setPlayers(players.getPlayers());
	}

	public void setServer(Server sv){
		this.server = sv;
	}
	
	public Server getServer(){
		return server;
	}
	
	public void setGrid(Grid g){
		this.grid = g;
	}
	
	public Grid getGrid(){
		return this.grid;
	}
	
	public void run(){
		long now = System.currentTimeMillis(), delta;
		while(true){
			
			this.peek().update();			
			
			// GESTION FPS
			delta = - now + (now = System.currentTimeMillis());
			if(delta < 16){
				try{
					Thread.sleep(16 - delta);
					now += 16 - delta;
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
	}
	
	@SuppressWarnings("deprecation")
	public void dispose(){
		this.stop();
		
		
		if(getServer() != null)
			getServer().disconnect();
			
		if(getClient() != null)
			getClient().disconnect();
		
	}
	
	public void swap(GameState g) {
			
	}

	public GameState pop() {
		peek().leaving();
		GameState g = gameStates.pop();
		peek().entered();
		
		return g;
	}

	public void push(GameState g) {
		gameStates.push(g);	
		peek().entered();
	}

	public GameState peek() {
		return gameStates.peek();
	}
	
	public String list(){
		String s = "";
		for (Iterator<GameState> iterator = gameStates.iterator(); iterator.hasNext();)
			s = s + iterator.next() + "\r\n";
		
		
		return s;
	}
}
