package View.View2D;



import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import utils.Formats;


public class View2DLogin extends View2D  {
	
	protected JButton seConnecter;
	protected JTextField pseudo;
	
	public View2DLogin(){
		
		seConnecter = new JButton("Se connecter");
		pseudo = new JTextField();
				
			
	}
	
	public void build() {
		buildMainLayout();
		buildLoginLayout();
		buildBackground();
		
		repaint();		
	}
	
	public void buildLoginLayout(){
		

		seConnecter.setIcon(new ImageIcon(getClass().getResource("/Images/buttonSeConnecter.png")));
		seConnecter.setBounds(310, 318, 383, 40);
		
		pseudo.setHorizontalAlignment(SwingConstants.CENTER);
		pseudo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		pseudo.setForeground(Color.WHITE);
		pseudo.setBackground(SystemColor.black);
		pseudo.setBounds(310, 281, 384, 29);
		pseudo.setColumns(10);
		
		pseudo.setText("Crayer");
		
		mainLayout.add(seConnecter);
		mainLayout.add(pseudo);
		
		
	}

	public void draw() {
		// TODO Auto-generated method stub
		
	}

	public void setData(String name, byte[] data) {
		// TODO Auto-generated method stub
		
	}

	public byte[] getData(String name) {
		if(name == "pseudo"){
			return Formats.toByte(pseudo.getText());
		}
		return null;
	}

	public void initListeners() {
		if(seConnecter.getActionListeners().length == 0)
			seConnecter.addActionListener(this.getController());
		
		
	}

	



}
