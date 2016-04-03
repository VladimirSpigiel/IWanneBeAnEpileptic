package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map.Entry;

import utils.Formats;
import kernel.Game;
import Model.Player;
import Model.PlayerList;
import View.IObservable;



public class StateControllerPlaying extends AbstractStateController {
	
	protected int dx;
	protected int dy;
	protected int speedDEGUG = 5;
	protected boolean endOfRound;

	public StateControllerPlaying(IObservable v) {
		super(v);
		dx = 0;
		dy = 0;
		endOfRound = false;

		
	}



	public  void update() {
		
		this.view.draw();
	
				
		
		Player p = Game.getInstance().getPlayer();
		PlayerList list = Game.getInstance().getPlayers();
		boolean collide = false;
		if(!endOfRound)
			if(Game.getInstance().getClient().isAlive()){
				p.collision(Game.getInstance().getGrid());
	
				
				for (Entry<String, Player> player : list.getPlayers().entrySet()){
					if(player.getValue().isAlive())
						if(player.getValue().getPseudo() != p.getPseudo()){
						
							
							if(p.collision(player.getValue())){
								this.dx = -this.dx;
								this.dy = -this.dy;
								collide = true;
								break;
							}
						}
				}
				
				
				Game.getInstance().getPlayer().move(this.dx, this.dy);
				Game.getInstance().getClient().send("player", Game.getInstance().getPlayer());
				
				if(collide){
					this.dx = 0;
					this.dy = 0;
					
				}
				
			}
				
	}


	public void mancheLance() {
	
		throw new UnsupportedOperationException();
	}

	public void timerUpdate(int t) {
		this.view.setData("timer", Formats.toByte(String.valueOf(t)));
	}

	public void win(Player p) {
		this.view.setData("winner", Formats.toByte("Le gagnant est : " + p.getPseudo()));
		Player me = Game.getInstance().getPlayer();
		if(me.getPseudo().equals(p.getPseudo())){
			me.setScore(p.getScore());
			
			PrintWriter w;
			try {
				File f = new File("score.txt");
				if(f.exists())
					f.delete();
				
				w = new PrintWriter(f);
				w.println(me.getScore());
				w.close();
				
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	public void tie(){
		this.view.setData("tie",  Formats.toByte("La partie se termine par une �galit�"));
	}
	
	public void endOfRound(boolean t){
		this.endOfRound = t;
		
	}

	public void keyPressed(KeyEvent arg0) {
		
	}

	public void keyReleased(KeyEvent arg0) {
	
		
		switch(arg0.getKeyChar()){
		
			case('d'):{
				this.dx = 0;
				break;
			}
			case('q'):{
				this.dx = 0;
				break;
			}
			case('z'):{
				this.dy = 0;
				break;
			}
			case('s'):{
				this.dy = 0;
				break;
			}
		}
	
		
	}

	public void keyTyped(KeyEvent arg0) {
		
	
		
		
		Player p = Game.getInstance().getPlayer();
		
		switch(arg0.getKeyChar()){
			
			case('d'):{
				this.dx = speedDEGUG;
				break;
			}
			case('q'):{
				this.dx = - speedDEGUG;
				break;
			}
			case('z'):{
				this.dy = -speedDEGUG;
				break;
			}
			case('s'):{
				this.dy = speedDEGUG;
				break;
			}
		}
		
		p.setDx(this.dx);
		p.setDy(this.dy);
	
	}

	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
			
	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getActionCommand().equals("Retour")){
			Game.getInstance().pop();
		}
			
	}
	

}