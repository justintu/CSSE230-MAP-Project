import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChoiceFrame {

	JFrame frame;
	SimulationPanel PS;
	public String location1 = null;
	public String location2 = null;


	public ChoiceFrame() {
		initialize();
		this.frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		PS = new SimulationPanel(this.frame);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1300, 580); // BG1 = 1000x580
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		// Background lable (should be at the last line)
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

		JLabel lblFirstLocation = new JLabel("From Location: ");
		lblFirstLocation.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblFirstLocation.setBounds(12, 13, 263, 46);
		dataPanel.add(lblFirstLocation);

		JLabel lblSecondLocation = new JLabel("To Location: ");
		lblSecondLocation.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblSecondLocation.setBounds(12, 224, 263, 46);
		dataPanel.add(lblSecondLocation);

		JLabel variable1 = new JLabel(this.location1);
		variable1.setFont(new Font("Dialog", Font.PLAIN, 30));
		variable1.setBounds(12, 72, 246, 105);
		dataPanel.add(variable1);

		JLabel variable2 = new JLabel(this.location2);
		variable2.setFont(new Font("Dialog", Font.PLAIN, 30));
		variable2.setBounds(12, 306, 246, 105);
		dataPanel.add(variable2);
	}
}
