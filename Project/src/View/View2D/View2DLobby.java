package View.View2D;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

import kernel.Game;

public class View2DLobby extends View2D {

	protected JPanel configuration;
	protected JTextPane joueurs;
	protected JButton start;
	protected JLabel lblNewLabel;
	
	public View2DLobby(){
		configuration = new JPanel();
		joueurs  = new JTextPane();
		start = new JButton("start");
		lblNewLabel = new JLabel("Joueurs connect\u00E9s ");
		
	}
	
	/**
	 * 
	 * @return 
	 */
	public void draw() {
		joueurs.setText(Game.getInstance().getPlayers().toString());
	}


	public void setData(String name, byte[] data) {
		// TODO Auto-generated method stub
		
	}

	public byte[] getData(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public void initListeners() {
		if(back.getActionListeners().length == 0)
			this.back.addActionListener(this.getController());
		if(start.getActionListeners().length == 0)
			this.start.addActionListener(this.getController());
		
	}


	public void build() {
		
		buildMainLayout();
		buildView2DLobby();
		buildFooterLayout();
		buildBackground();
		
		repaint();	
				
	}
	
	protected void buildView2DLobby(){
		
		configuration.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.WHITE, Color.LIGHT_GRAY, Color.WHITE, Color.LIGHT_GRAY));
		configuration.setBackground(Color.DARK_GRAY);
		configuration.setBounds(294, 170, 409, 257);
		mainLayout.add(configuration);
		configuration.setLayout(null);

		joueurs.setFont(new Font("Tahoma", Font.BOLD, 14));
		joueurs.setForeground(Color.GREEN);
		joueurs.setEditable(false);
		joueurs.setBackground(Color.GRAY);
		joueurs.setBounds(10, 30, 389, 124);
		configuration.add(joueurs);
		
		start.setBounds(17, 206, 382, 40);
		start.setIcon(new ImageIcon(getClass().getResource("/Images/buttonsLancerPartie.png")));
		start.setVisible(false);
		configuration.add(start);
				
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(140, 11, 134, 14);
		configuration.add(lblNewLabel);
		
		if(Game.getInstance().isHostApplication())
			start.setVisible(true);
	}

}