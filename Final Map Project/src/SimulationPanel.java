import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SimulationPanel {

	public JFrame frame;
	public JPanel cityPanel;
	public JPanel CatePanel;

	public SimulationPanel(JFrame frame) {
		this.frame = frame;
		
		//add all panels
		makeCityPanel();
		makeCategoryPanel();
		makeTitle();
		makeControlButton();
	}

	public void makeCityPanel() {
		// city panel
		this.cityPanel = new JPanel();
		cityPanel.setBounds(279, 98, 650, 400);
		this.frame.getContentPane().add(cityPanel);
		cityPanel.setLayout(null);
		cityPanel.setVisible(false);
		cityPanel.setOpaque(false);

		JButton btnCitya = new JButton("CityA");
		btnCitya.setOpaque(false);
		btnCitya.setForeground(new Color(220, 20, 60));
		btnCitya.setFont(new Font("Cooper Black", Font.PLAIN, 45));
		btnCitya.setFocusPainted(false);
		btnCitya.setBorder(BorderFactory.createRaisedBevelBorder());
		btnCitya.setBackground(new Color(250, 250, 210));
		btnCitya.setBounds(12, 13, 183, 72);
		cityPanel.add(btnCitya);

		JButton btnCityb = new JButton("CityB");
		btnCityb.setOpaque(false);
		btnCityb.setForeground(new Color(220, 20, 60));
		btnCityb.setFont(new Font("Cooper Black", Font.PLAIN, 45));
		btnCityb.setFocusPainted(false);
		btnCityb.setBorder(BorderFactory.createRaisedBevelBorder());
		btnCityb.setBackground(new Color(250, 250, 210));
		btnCityb.setBounds(12, 98, 183, 72);
		cityPanel.add(btnCityb);

		JButton btnCityc = new JButton("CityC");
		btnCityc.setOpaque(false);
		btnCityc.setForeground(new Color(220, 20, 60));
		btnCityc.setFont(new Font("Cooper Black", Font.PLAIN, 45));
		btnCityc.setFocusPainted(false);
		btnCityc.setBorder(BorderFactory.createRaisedBevelBorder());
		btnCityc.setBackground(new Color(250, 250, 210));
		btnCityc.setBounds(12, 183, 183, 72);
		cityPanel.add(btnCityc);

		JButton btnCityd = new JButton("CityD");
		btnCityd.setOpaque(false);
		btnCityd.setForeground(new Color(220, 20, 60));
		btnCityd.setFont(new Font("Cooper Black", Font.PLAIN, 45));
		btnCityd.setFocusPainted(false);
		btnCityd.setBorder(BorderFactory.createRaisedBevelBorder());
		btnCityd.setBackground(new Color(250, 250, 210));
		btnCityd.setBounds(226, 13, 183, 72);
		cityPanel.add(btnCityd);

		JButton btnCitye = new JButton("CityE");
		btnCitye.setOpaque(false);
		btnCitye.setForeground(new Color(220, 20, 60));
		btnCitye.setFont(new Font("Cooper Black", Font.PLAIN, 45));
		btnCitye.setFocusPainted(false);
		btnCitye.setBorder(BorderFactory.createRaisedBevelBorder());
		btnCitye.setBackground(new Color(250, 250, 210));
		btnCitye.setBounds(226, 98, 183, 72);
		cityPanel.add(btnCitye);

		JButton btnCityf = new JButton("CityF");
		btnCityf.setOpaque(false);
		btnCityf.setForeground(new Color(220, 20, 60));
		btnCityf.setFont(new Font("Cooper Black", Font.PLAIN, 45));
		btnCityf.setFocusPainted(false);
		btnCityf.setBorder(BorderFactory.createRaisedBevelBorder());
		btnCityf.setBackground(new Color(250, 250, 210));
		btnCityf.setBounds(226, 183, 183, 72);
		cityPanel.add(btnCityf);
	}

	public void makeCategoryPanel() {
		// category panel
		this.CatePanel = new JPanel();
		this.frame.getContentPane().add(CatePanel);
		CatePanel.setBounds(279, 98, 650, 400);
		CatePanel.setLayout(null);
		CatePanel.setVisible(false);
		CatePanel.setOpaque(false);

		JButton btnCatea = new JButton("Downtown");
		btnCatea.setOpaque(false);
		btnCatea.setForeground(new Color(220, 20, 60));
		btnCatea.setFont(new Font("Cooper Black", Font.PLAIN, 36));
		btnCatea.setFocusPainted(false);
		btnCatea.setBorder(BorderFactory.createRaisedBevelBorder());
		btnCatea.setBackground(new Color(250, 250, 210));
		btnCatea.setBounds(12, 13, 230, 72);
		CatePanel.add(btnCatea);

		JButton btnCateb = new JButton("Hotel");
		btnCateb.setOpaque(false);
		btnCateb.setForeground(new Color(220, 20, 60));
		btnCateb.setFont(new Font("Cooper Black", Font.PLAIN, 45));
		btnCateb.setFocusPainted(false);
		btnCateb.setBorder(BorderFactory.createRaisedBevelBorder());
		btnCateb.setBackground(new Color(250, 250, 210));
		btnCateb.setBounds(12, 98, 183, 72);
		CatePanel.add(btnCateb);

		JButton btnCatec = new JButton("Food");
		btnCatec.setOpaque(false);
		btnCatec.setForeground(new Color(220, 20, 60));
		btnCatec.setFont(new Font("Cooper Black", Font.PLAIN, 45));
		btnCatec.setFocusPainted(false);
		btnCatec.setBorder(BorderFactory.createRaisedBevelBorder());
		btnCatec.setBackground(new Color(250, 250, 210));
		btnCatec.setBounds(12, 183, 183, 72);
		CatePanel.add(btnCatec);
	}
	
	public void makeTitle(){
		JLabel lblNewLabel = new JLabel("Choose the location by...");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 45));
		lblNewLabel.setBounds(24, 13, 509, 86);
		frame.getContentPane().add(lblNewLabel);
	}
	
	public void makeControlButton(){
		
		JPanel optionPanel = new JPanel();
		optionPanel.setBounds(12, 78, 270, 237);
		frame.getContentPane().add(optionPanel);
		optionPanel.setLayout(null);
		optionPanel.setOpaque(false);

		// button setup
		final JButton btnCity = new JButton("City");
		btnCity.setBounds(12, 33, 243, 72);
		optionPanel.add(btnCity);
		btnCity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cityVisable();
//				frame.repaint();
			}
		});
		btnCity.setOpaque(false);
		btnCity.setForeground(new Color(250, 128, 114));
		btnCity.setFont(new Font("Cooper Black", Font.PLAIN, 45));
		btnCity.setFocusPainted(false);
		btnCity.setBorder(BorderFactory.createRaisedBevelBorder());
		btnCity.setBackground(new Color(250, 250, 210));

		JButton btnCategory = new JButton("Category");
		btnCategory.setBounds(12, 134, 243, 72);
		optionPanel.add(btnCategory);
		btnCategory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cateVisable();
//				frame.repaint();
			}
		});
		btnCategory.setOpaque(false);
		btnCategory.setForeground(new Color(250, 128, 114));
		btnCategory.setFont(new Font("Cooper Black", Font.PLAIN, 45));
		btnCategory.setFocusPainted(false);
		btnCategory.setBorder(BorderFactory.createRaisedBevelBorder());
		btnCategory.setBackground(new Color(250, 250, 210));
		
	}
	
	public void cityVisable(){
		this.cityPanel.setVisible(true);
		this.CatePanel.setVisible(false);
//		frame.repaint();
	}
	public void cateVisable(){
		this.cityPanel.setVisible(false);
		this.CatePanel.setVisible(true);
//		frame.repaint();
	}

}
