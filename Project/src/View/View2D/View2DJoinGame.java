package View.View2D;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;

import utils.Formats;

public class View2DJoinGame extends View2D {
	
	protected JPanel configuration;
	protected JLabel lIP;
	protected JTextField ip;
	protected JLabel lPort;
	protected JTextField port;
	protected JButton joinGame;
	protected JLabel erreurs;
	
	public View2DJoinGame(){
		configuration = new JPanel();
		lIP = new JLabel("Adresse IP");
		ip = new JTextField();	
		lPort = new JLabel("Port");
		port = new JTextField();
		joinGame = new JButton("join");
		erreurs = new JLabel("");
		
		ip.setText("127.0.0.1");
		port.setText("4400");
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
	 * @param donnee
	 * @return 
	 */
	public void setData(String champ, byte[] donnee) {
		if(champ == "erreurs"){
			erreurs.setText(Formats.toString(donnee));
		}
	}

	public byte[] getData(String name) {
		if(name.equals("ip"))
			return ip.getText().getBytes();
		else if(name.equals("port"))
			return port.getText().getBytes();
		
		return null;
	}

	public void initListeners() {
		if(back.getActionListeners().length == 0)
			back.addActionListener(this.getController());
		
		if(joinGame.getActionListeners().length == 0)
			joinGame.addActionListener(this.getController());
		
	}

	public void build() {
		
		buildMainLayout();
		buildJoinGameLayout();
		buildFooterLayout();
		buildBackground();		
		
		repaint();
	}
	
	protected void buildJoinGameLayout(){
		
		configuration.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192), new Color(255, 255, 255), new Color(192, 192, 192)), null));
		configuration.setBackground(Color.DARK_GRAY);
		configuration.setBounds(251, 184, 499, 237);
		mainLayout.add(configuration);
		configuration.setLayout(null);
		
		
		lIP.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lIP.setForeground(Color.WHITE);
		lIP.setHorizontalAlignment(SwingConstants.CENTER);
		lIP.setBounds(201, 33, 99, 14);
		configuration.add(lIP);
		
		
		ip.setBackground(Color.BLACK);
		ip.setBounds(148, 50, 200, 20);
		ip.setForeground(Color.WHITE);
		ip.setHorizontalAlignment(SwingConstants.CENTER);
		configuration.add(ip);
		ip.setColumns(10);
		
		
		lPort.setForeground(Color.WHITE);
		lPort.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lPort.setHorizontalAlignment(SwingConstants.CENTER);
		lPort.setBounds(225, 81, 46, 14);
		configuration.add(lPort);
		
		port.setColumns(10);
		port.setBackground(Color.BLACK);
		port.setBounds(148, 95, 200, 20);
		port.setForeground(Color.WHITE);
		port.setHorizontalAlignment(SwingConstants.CENTER);
		configuration.add(port);
		
		
		
		erreurs.setFont(new Font("Tahoma", Font.BOLD, 13));
		erreurs.setHorizontalAlignment(SwingConstants.CENTER);
		erreurs.setForeground(Color.RED);
		erreurs.setBounds(148, 136, 200, 14);
		configuration.add(erreurs);
		
		
		joinGame.setIcon(new ImageIcon(getClass().getResource("/Images/buttonRejoindreLaPartie.png")));
		joinGame.setBounds(62, 172, 381, 40);
		configuration.add(joinGame);
	}


}