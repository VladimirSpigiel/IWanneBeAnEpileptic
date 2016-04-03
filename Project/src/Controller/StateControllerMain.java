package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import View.IObservable;
import kernel.Game;



public class StateControllerMain extends AbstractStateController {

	public StateControllerMain(IObservable v) {
		super(v);
		// TODO Auto-generated constructor stub
	}


	public void update() {
		
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

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "Créer une partie"){
			// Création d'un serveur + socket
			Game.getInstance().push(new StateControllerCreateGame(Game.getViewFactory().createViewCreateGame()));
		}else if(e.getActionCommand() == "Rejoindre une partie"){
			// Création d'un socket
			Game.getInstance().push(new StateControllerJoinGame(Game.getViewFactory().createViewJoinGame()));
		}else if(e.getActionCommand() == "Aide"){
			Game.getInstance().push(new StateControllerHelp(Game.getViewFactory().createViewHelp()));
		}else if(e.getActionCommand() == "Score"){
			Game.getInstance().push(new StateControllerScore(Game.getViewFactory().createViewScore()));
		}
		
	}

}
