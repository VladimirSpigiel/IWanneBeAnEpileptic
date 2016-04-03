package Controller;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import kernel.Game;
import utils.Formats;
import Model.Player;
import View.IObservable;

public class StateControllerLogin extends AbstractStateController {

	public StateControllerLogin(IObservable v) {
		super(v);
		// TODO Auto-generated constructor stub
	}


	public void update() {
		// TODO Auto-generated method stub
		
	}

	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
			
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

		
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

	public void actionPerformed(java.awt.event.ActionEvent e) {
	
		if(e.getActionCommand() == "Se connecter"){
			String pseudo = Formats.toString(this.getView().getData("pseudo"));
			
			if(pseudo.trim().length() > 5){			
				Player p = new Player(pseudo.trim());
				// Lire dans le fichier le score
				
				
				try {
					File f = new File("score.txt");
					FileReader fr = new FileReader(f);
					BufferedReader br = new BufferedReader(fr);
				
					String score = br.readLine();
					if(score != null)
						p.setScore(Integer.valueOf(score));
					
					br.close();
					fr.close();
	
					
				} catch (FileNotFoundException a) {
					
					PrintWriter w;
					try {
						File f = new File("score.txt");
						w = new PrintWriter(f);
						w.println("0");
						w.close();
						
						
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}catch(IOException o){
					
				}
				
				
				Game.getInstance().setPlayer(p);
				Game.getInstance().getPlayers().add(p);
				Game.getInstance().push(new StateControllerMain(Game.getViewFactory().createViewMain()));
			}
		}
		
	}


}
