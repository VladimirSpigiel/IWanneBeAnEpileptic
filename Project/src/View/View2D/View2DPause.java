package View.View2D;

import java.awt.Dimension;

import kernel.Game;

public class View2DPause extends View2D {
	
	public View2DPause(){
		Game.getInstance().getWindow().getContentPane().removeAll();
		Game.getInstance().getWindow().getContentPane().repaint();
		Game.getInstance().getWindow().setPreferredSize(new Dimension(700, 700));
		Game.getInstance().getWindow().pack();
		
	}
	
	
	public void draw() {
		Game.getInstance().getWindow().repaint();			
	}

	public void setData(String name, byte[] data) {
		// TODO Auto-generated method stub
		
	}

	public byte[] getData(String name) {
		// TODO Auto-generated method stub
		return null;
	}



	public void initListeners() {
		// TODO Auto-generated method stub
		
	}


	public void build() {
		// TODO Auto-generated method stub
		
	}

}
