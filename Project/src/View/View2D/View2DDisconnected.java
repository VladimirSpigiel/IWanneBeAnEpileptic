package View.View2D;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;

public class View2DDisconnected extends View2D {
	
	protected JPanel configuration;
	protected JLabel error ;
	
	public View2DDisconnected(){
		configuration  = new JPanel();
		error = new JLabel("Vous avez \u00E9t\u00E9 d\u00E9connect\u00E9 du serveur.");
	}


	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void build() {
		buildMainLayout();
		buildView2DDisconnected();
		buildFooterLayout();
		buildBackground();	
		
		repaint();
	}
	
	protected void buildView2DDisconnected(){
		
		configuration.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255)), null));
		configuration.setBackground(Color.DARK_GRAY);
		configuration.setBounds(297, 229, 406, 136);
		mainLayout.add(configuration);
		configuration.setLayout(null);
		
		
		error.setHorizontalAlignment(SwingConstants.CENTER);
		error.setForeground(Color.RED);
		error.setFont(new Font("Tahoma", Font.BOLD, 18));
		error.setBounds(0, 62, 406, 14);
		configuration.add(error);
	}

	@Override
	public void setData(String name, byte[] data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public byte[] getData(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void initListeners() {
		if(this.back.getActionListeners().length == 0)
			this.back.addActionListener(getController());
		
	}

}
