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

public class WelcomeMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeMenu window = new WelcomeMenu();
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
	public WelcomeMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 730, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(255, 255, 224));
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JButton btnNewButton = new JButton("Start Trip");
		btnNewButton.setOpaque(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorder(BorderFactory.createRaisedBevelBorder());
		ImageIcon img1 = new ImageIcon("image/car.png");
		btnNewButton.setIcon(img1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				ChoiceFrame CF = new ChoiceFrame();
				CF.frame.setVisible(true);
			}
		});	
		btnNewButton.setBackground(new Color(250, 250, 210));
		btnNewButton.setForeground(new Color(250, 128, 114));
		btnNewButton.setFont(new Font("Cooper Black", Font.PLAIN, 45));
		btnNewButton.setBounds(12, 235, 331, 72);
		frame.getContentPane().add(btnNewButton);

		JButton btnHowToUse = new JButton("How to use");
		btnHowToUse.setOpaque(false);
		btnHowToUse.setFocusPainted(false);
		btnHowToUse.setBorder(BorderFactory.createRaisedBevelBorder());
		ImageIcon img3 = new ImageIcon("image/book.png");
		btnHowToUse.setIcon(img3);
		btnHowToUse.setForeground(new Color(250, 128, 114));
		btnHowToUse.setFont(new Font("Cooper Black", Font.PLAIN, 45));
		btnHowToUse.setBackground(new Color(250, 250, 210));
		btnHowToUse.setBounds(12, 335, 331, 72);
		frame.getContentPane().add(btnHowToUse);

		JButton btnCredit = new JButton("Credit");
		btnCredit.setOpaque(false);
		btnCredit.setFocusPainted(false);
		btnCredit.setBorder(BorderFactory.createRaisedBevelBorder());
		ImageIcon img4 = new ImageIcon("image/author.png");
		btnCredit.setIcon(img4);
		btnCredit.setForeground(new Color(250, 128, 114));
		btnCredit.setFont(new Font("Cooper Black", Font.PLAIN, 45));
		btnCredit.setBackground(new Color(250, 250, 210));
		btnCredit.setBounds(379, 235, 321, 72);
		frame.getContentPane().add(btnCredit);

		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnClose.setOpaque(false);
		btnClose.setForeground(Color.BLUE);
		btnClose.setFont(new Font("Cooper Black", Font.PLAIN, 45));
		btnClose.setFocusPainted(false);
		btnClose.setBorder(BorderFactory.createRaisedBevelBorder());
		btnClose.setBackground(new Color(250, 250, 210));
		btnClose.setBounds(379, 335, 321, 72);
		btnClose.setVisible(true);
		frame.getContentPane().add(btnClose);
		
		ImageIcon img2 = new ImageIcon("image/Okinawa.jpg");
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(img2);
		lblNewLabel_1.setBounds(0, 0, 720, 450);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
