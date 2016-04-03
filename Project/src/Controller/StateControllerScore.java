package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import utils.Formats;
import kernel.Game;
import View.IObservable;



public class StateControllerScore extends AbstractStateController {

	public StateControllerScore(IObservable v) {
		super(v);
		v.setData("score", Formats.toByte(String.valueOf(Game.getInstance().getPlayer().getScore())));
		// TODO Auto-generated constructor stub
	}



	public void update() {
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
		if(arg0.getActionCommand().equals("Retour"))
			Game.getInstance().pop();
		
	}

}