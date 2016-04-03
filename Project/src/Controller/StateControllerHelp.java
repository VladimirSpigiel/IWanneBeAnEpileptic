package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import kernel.Game;
import View.IObservable;


public class StateControllerHelp extends AbstractStateController {

	public StateControllerHelp(IObservable v) {
		super(v);
		// TODO Auto-generated constructor stub
	}


	public void update() {
		// Nothing
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
	public void keyPressed(KeyEvent e) {
		throw new UnsupportedOperationException();
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
		if(e.getActionCommand().equals("Retour")){
			Game.getInstance().pop();
		}
		
	}

}