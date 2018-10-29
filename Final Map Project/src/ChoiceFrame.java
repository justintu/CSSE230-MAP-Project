import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChoiceFrame {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChoiceFrame window = new ChoiceFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ChoiceFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1300, 580); //BG1 = 1000x580
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		JLabel lblNewLabel = new JLabel("Choose the location by...");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 45));
		lblNewLabel.setBounds(24, 13, 509, 86);
		frame.getContentPane().add(lblNewLabel);
		
		// city panel
		final JPanel panel1 = new JPanel();
		panel1.setBounds(279, 98, 650, 400);
		this.frame.getContentPane().add(panel1);
		panel1.setLayout(null);
		panel1.setVisible(false);
		panel1.setOpaque(false);

		JButton btnCitya = new JButton("CityA");
		btnCitya.setOpaque(false);
		btnCitya.setForeground(new Color(220, 20, 60));
		btnCitya.setFont(new Font("Cooper Black", Font.PLAIN, 45));
		btnCitya.setFocusPainted(false);
		btnCitya.setBorder(BorderFactory.createRaisedBevelBorder());
		btnCitya.setBackground(new Color(250, 250, 210));
		btnCitya.setBounds(12, 13, 183, 72);
		panel1.add(btnCitya);

		JButton btnCityb = new JButton("CityB");
		btnCityb.setOpaque(false);
		btnCityb.setForeground(new Color(220, 20, 60));
		btnCityb.setFont(new Font("Cooper Black", Font.PLAIN, 45));
		btnCityb.setFocusPainted(false);
		btnCityb.setBorder(BorderFactory.createRaisedBevelBorder());
		btnCityb.setBackground(new Color(250, 250, 210));
		btnCityb.setBounds(12, 98, 183, 72);
		panel1.add(btnCityb);

		JButton btnCityc = new JButton("CityC");
		btnCityc.setOpaque(false);
		btnCityc.setForeground(new Color(220, 20, 60));
		btnCityc.setFont(new Font("Cooper Black", Font.PLAIN, 45));
		btnCityc.setFocusPainted(false);
		btnCityc.setBorder(BorderFactory.createRaisedBevelBorder());
		btnCityc.setBackground(new Color(250, 250, 210));
		btnCityc.setBounds(12, 183, 183, 72);
		panel1.add(btnCityc);

		JButton btnCityd = new JButton("CityD");
		btnCityd.setOpaque(false);
		btnCityd.setForeground(new Color(220, 20, 60));
		btnCityd.setFont(new Font("Cooper Black", Font.PLAIN, 45));
		btnCityd.setFocusPainted(false);
		btnCityd.setBorder(BorderFactory.createRaisedBevelBorder());
		btnCityd.setBackground(new Color(250, 250, 210));
		btnCityd.setBounds(226, 13, 183, 72);
		panel1.add(btnCityd);

		JButton btnCitye = new JButton("CityE");
		btnCitye.setOpaque(false);
		btnCitye.setForeground(new Color(220, 20, 60));
		btnCitye.setFont(new Font("Cooper Black", Font.PLAIN, 45));
		btnCitye.setFocusPainted(false);
		btnCitye.setBorder(BorderFactory.createRaisedBevelBorder());
		btnCitye.setBackground(new Color(250, 250, 210));
		btnCitye.setBounds(226, 98, 183, 72);
		panel1.add(btnCitye);

		JButton btnCityf = new JButton("CityF");
		btnCityf.setOpaque(false);
		btnCityf.setForeground(new Color(220, 20, 60));
		btnCityf.setFont(new Font("Cooper Black", Font.PLAIN, 45));
		btnCityf.setFocusPainted(false);
		btnCityf.setBorder(BorderFactory.createRaisedBevelBorder());
		btnCityf.setBackground(new Color(250, 250, 210));
		btnCityf.setBounds(226, 183, 183, 72);
		panel1.add(btnCityf);
		

		// category panel
		final JPanel panel2 = new JPanel();
		this.frame.getContentPane().add(panel2);
		panel2.setBounds(279, 98, 650, 400);
		panel2.setLayout(null);
		panel2.setVisible(false);
		panel2.setOpaque(false);

		JButton btnCatea = new JButton("Downtown");
		btnCatea.setOpaque(false);
		btnCatea.setForeground(new Color(220, 20, 60));
		btnCatea.setFont(new Font("Cooper Black", Font.PLAIN, 36));
		btnCatea.setFocusPainted(false);
		btnCatea.setBorder(BorderFactory.createRaisedBevelBorder());
		btnCatea.setBackground(new Color(250, 250, 210));
		btnCatea.setBounds(12, 13, 230, 72);
		panel2.add(btnCatea);

		JButton btnCateb = new JButton("Hotel");
		btnCateb.setOpaque(false);
		btnCateb.setForeground(new Color(220, 20, 60));
		btnCateb.setFont(new Font("Cooper Black", Font.PLAIN, 45));
		btnCateb.setFocusPainted(false);
		btnCateb.setBorder(BorderFactory.createRaisedBevelBorder());
		btnCateb.setBackground(new Color(250, 250, 210));
		btnCateb.setBounds(12, 98, 183, 72);
		panel2.add(btnCateb);

		JButton btnCatec = new JButton("Food");
		btnCatec.setOpaque(false);
		btnCatec.setForeground(new Color(220, 20, 60));
		btnCatec.setFont(new Font("Cooper Black", Font.PLAIN, 45));
		btnCatec.setFocusPainted(false);
		btnCatec.setBorder(BorderFactory.createRaisedBevelBorder());
		btnCatec.setBackground(new Color(250, 250, 210));
		btnCatec.setBounds(12, 183, 183, 72);
		panel2.add(btnCatec);

		// button setup
		final JButton btnCity = new JButton("City");
		btnCity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(true);
				panel2.setVisible(false);
				frame.repaint();
			}
		});
		btnCity.setOpaque(false);
		btnCity.setForeground(new Color(250, 128, 114));
		btnCity.setFont(new Font("Cooper Black", Font.PLAIN, 45));
		btnCity.setFocusPainted(false);
		btnCity.setBorder(BorderFactory.createRaisedBevelBorder());
		btnCity.setBackground(new Color(250, 250, 210));
		btnCity.setBounds(24, 113, 243, 72);
		frame.getContentPane().add(btnCity);

		JButton btnCategory = new JButton("Category");
		btnCategory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel1.setVisible(false);
				panel2.setVisible(true);
				frame.repaint();
			}
		});
		btnCategory.setOpaque(false);
		btnCategory.setForeground(new Color(250, 128, 114));
		btnCategory.setFont(new Font("Cooper Black", Font.PLAIN, 45));
		btnCategory.setFocusPainted(false);
		btnCategory.setBorder(BorderFactory.createRaisedBevelBorder());
		btnCategory.setBackground(new Color(250, 250, 210));
		btnCategory.setBounds(24, 208, 243, 72);
		frame.getContentPane().add(btnCategory);

		
		//Background lable (should be at the last line)
		ImageIcon BG1 = new ImageIcon("image/BG1.jpg");
		JLabel BGL = new JLabel("");
		BGL.setIcon(BG1);
		BGL.setBounds(0, 0, 1000, 580);
		frame.getContentPane().add(BGL);
		
		JPanel dataPanel = new JPanel();
		dataPanel.setBackground(new Color(255, 255, 255));
		dataPanel.setBounds(1000, 13, 270, 507);
		frame.getContentPane().add(dataPanel);
		dataPanel.setLayout(null);
		
		JLabel lblFirstLocation = new JLabel("First Location: ");
		lblFirstLocation.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblFirstLocation.setBounds(12, 13, 263, 46);
		dataPanel.add(lblFirstLocation);
		
		JLabel lblSecondLocation = new JLabel("Second Location: ");
		lblSecondLocation.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblSecondLocation.setBounds(12, 224, 263, 46);
		dataPanel.add(lblSecondLocation);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(12, 72, 202, 100);
		dataPanel.add(lblNewLabel_2);
	}
}
