package View;


import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

import Controller.AbstractStateController;
import kernel.Game;


public abstract class  View implements IObservable {
	
	private AbstractStateController controller;
	
	
	public View(){
		Game.getInstance().getWindow().getContentPane().removeAll();
		Game.getInstance().getWindow().getContentPane().repaint();
		
		/* ------ PARAMS DE LA FENETRE ------ */
		Game.getInstance().getWindow().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Game.getInstance().getWindow().setBounds(100, 100, 1000, 625);
		((JComponent) Game.getInstance().getWindow().getContentPane()).setBorder(new EmptyBorder(5, 5, 5, 5));
		Game.getInstance().getWindow().getContentPane().setLayout(null);
		Game.getInstance().getWindow().setLocationRelativeTo(null);  		
		Game.getInstance().getWindow().setVisible(true);
		
	}
	
	public AbstractStateController getController(){
		return controller;
	}
	
	public void setController(AbstractStateController ctrl){
		controller = ctrl;
	}

}
