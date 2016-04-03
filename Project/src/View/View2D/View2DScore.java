package View.View2D;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;

import utils.Formats;

public class View2DScore extends View2D {
	
	protected JLabel lblNewLabel;
	protected JPanel configuration;
	protected JLabel score;
	
	
	
	public View2DScore(){
		lblNewLabel=  new JLabel("Votre score");
		configuration = new JPanel();
		score = new JLabel("0");
	}
	
	/**
	 * 
	 * @return 
	 */
	public void draw() {
		//Nothing
	}

	/**
	 * 
	 * @param champ
	 * @param donnee
	 * @return 
	 */
	public void setData(String champ, byte[] donnee) {
		if(champ.equals("score")){
			score.setText(Formats.toString(donnee));
		}
	}


	public byte[] getData(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public void initListeners() {
		if(back.getActionListeners().length == 0)
			back.addActionListener(getController());
		
	}
	
	protected void buildView2DScore(){
		
		
		configuration.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255)), null));
		configuration.setBackground(Color.DARK_GRAY);
		configuration.setBounds(297, 229, 406, 136);
		mainLayout.add(configuration);
		configuration.setLayout(null);
		
		
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 386, 38);
		configuration.add(lblNewLabel);
		
		
		score.setForeground(Color.ORANGE);
		score.setFont(new Font("Tahoma", Font.BOLD, 20));
		score.setHorizontalAlignment(SwingConstants.CENTER);
		score.setBounds(0, 60, 406, 65);
		configuration.add(score);
	}
	
	public void build() {
		buildMainLayout();
		buildView2DScore();
		buildFooterLayout();
		buildBackground();
		
	}

}