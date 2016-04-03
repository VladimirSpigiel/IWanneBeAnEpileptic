package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import kernel.Game;
import View.IObservable;


public class StateControllerLobby extends AbstractStateController {

	public StateControllerLobby(IObservable v) {
		super(v);
		// TODO Auto-generated constructor stub
	}


	public void update() {
		this.view.draw();
	}

	/**
	 * 
	 * @param e
	 */
	public void MouseClicked(MouseEvent e) {
		// TODO - implement StateControllerLobby.MouseClicked
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param e
	 */
	public void KeyPressed(KeyEvent e) {
		// TODO - implement StateControllerLobby.KeyPressed
		throw new UnsupportedOperationException();
	}

	public void start() {
		// TODO - implement StateControllerLobby.start
		throw new UnsupportedOperationException();
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

	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getActionCommand() == "Retour"){
			Game.getInstance().pop();
			Game.getInstance().getClient().disconnect();
			if(Game.getInstance().getServer() != null){
				Game.getInstance().getServer().disconnect();
				Game.getInstance().setServer(null);
			}	
		}else if(arg0.getActionCommand() == "start"){
			Game.getInstance().getClient().send("start", null);
		}
	}

}