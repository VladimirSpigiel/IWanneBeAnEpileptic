package View.View2D;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;

public class View2DHelp extends View2D {
	
	protected JTextPane description;
	
	
	public View2DHelp(){
		description = new JTextPane();
	
	}
	
	public void build() {
		buildMainLayout();
		buildHelpLayout();
		buildFooterLayout();
		buildBackground();
		repaint();
		
	}
	
	protected void buildHelpLayout(){
		
		
		
		description.setForeground(Color.WHITE);
		description.setFont(new Font("Tahoma", Font.BOLD, 16));
		description.setEditable(false);
		description.setOpaque(false);
		description.setText("\"I Wanna Be An Epileptic\" est un jeu invitant l'utilisateur \u00E0 s'amuser de ses r\u00E9flexes et de sa rapidit\u00E9.\r\nSur un damier de couleurs, l'utilisateur est un point qui se d\u00E9place librement parmi d'autres joueurs.\r\nLorsqu\u2019une couleur est annonc\u00E9e, avec un compte \u00E0 rebours lanc\u00E9, les joueurs devront rapidement se placer sur celle-ci, sinon le joueur aura perdu. \r\nA chaque nouvelle couleur annonc\u00E9e, le compte \u00E0 rebours sera de plus en plus rapide et lorsqu'il n'y aura plus qu'un seul survivant, la partie sera consid\u00E9r\u00E9e comme termin\u00E9e.\r\n\r\nLes actions possible dans ce jeu sont simple : \r\nSe d\u00E9placer : Z (haut) Q ( gauche)  D ( droite ) S ( bas )\r\n");
		description.setBounds(132, 187, 738, 235);
		
		mainLayout.add(description);
	}
	
	/** 
	 * 
	 * @return 
	 */
	public void draw() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param champ
	 * @return 
	 */
	public byte[] getData(int champ) {
		throw new UnsupportedOperationException();
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
		if(back.getActionListeners().length == 0)
			back.addActionListener(this.getController());
		
	}


	

}