package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.IOException;

import utils.Formats;
import kernel.Game;
import Model.Client;
import View.IObservable;



public class StateControllerJoinGame extends AbstractStateController {

	public StateControllerJoinGame(IObservable v) {
		super(v);
		// TODO Auto-generated constructor stub
	}


	public void update() {
		//Nothing
	}

	/**
	 * 
	 * @param e
	 */
	public void MouseClicked(MouseEvent e) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param e
	 */
	public void KeyPressed(KeyEvent e) {
		throw new UnsupportedOperationException();
	}

	public void full() {
		throw new UnsupportedOperationException();
	}

	public void joined() {
		throw new UnsupportedOperationException();
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "Retour"){
			Game.getInstance().pop();
		}if(e.getActionCommand() == "join"){
			
			String ip = Formats.toString(this.view.getData("ip"));		
			int port = Integer.valueOf((Formats.toString(this.view.getData("port"))));
			
			try {
				Game.getInstance().setClient( new Client(ip, port));
				Game.getInstance().getClient().send("join", Game.getInstance().getPlayer());
			
				Game.getInstance().setHostApplication(false);
			} catch (IOException e1) {
				this.view.setData("erreurs", "Impossible de se connecter.".getBytes());
				e1.printStackTrace();
			}
		}
		
	}

}