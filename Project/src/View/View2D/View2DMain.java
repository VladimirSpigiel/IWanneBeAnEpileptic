package View.View2D;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class View2DMain extends View2D {

	
	protected JButton joinGame;
	protected JButton createGame;
	protected JButton help;
	protected JButton score;
	
	public View2DMain(){
		joinGame = new JButton("Rejoindre une partie");
		createGame = new JButton("Cr\u00E9er une partie");
		help = new JButton("Aide");
		score = new JButton("Score");
	
	}
	
	public void build() {
		buildMainLayout();
		buildMainLayouth();
		buildBackground();
	
		repaint();
		
	}
	
	protected void buildMainLayouth(){

		joinGame.setIcon(new ImageIcon(getClass().getResource("/Images/buttonRejoindreUnePartie.png")));
		joinGame.setBounds(311, 294, 383, 40);
		mainLayout.add(joinGame);
		
		createGame.setIcon(new ImageIcon(getClass().getResource("/Images/buttonCreerUnePartie.png")));
		createGame.setBounds(311, 232, 383, 40);
		mainLayout.add(createGame);
		
		
		help.setIcon(new ImageIcon(getClass().getResource("/Images/buttonAide.png")));
		help.setBounds(528, 356, 166, 40);
		mainLayout.add(help);
		
		
		score.setIcon(new ImageIcon(getClass().getResource("/Images/buttonScore.png")));
		score.setBounds(311, 356, 162, 40);
		mainLayout.add(score);
	}
	
	public void draw() {
	}



	/**
	 * 
	 * @param champ
	 * @param donnee
	 * @return 
	 */
	public void setData(String champ, byte[] donnee) {
		throw new UnsupportedOperationException();
	}



	public byte[] getData(String name) {
		// TODO Auto-generated method stub
		return null;
	}



	public void initListeners() {
		// TODO Auto-generated method stub
		if(joinGame.getActionListeners().length <= 0)
			joinGame.addActionListener(this.getController());
		if(createGame.getActionListeners().length <= 0)
			createGame.addActionListener(this.getController());
		if(help.getActionListeners().length <= 0)
			help.addActionListener(this.getController());
		if(score.getActionListeners().length <= 0)
			score.addActionListener(this.getController());
		
		
	}



}