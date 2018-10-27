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
import javax.swing.border.EmptyBorder;

public class TestingGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestingGUI frame = new TestingGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					System.out.println("test");
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TestingGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 224));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Start Trip");
		btnNewButton.setOpaque(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorder(BorderFactory.createRaisedBevelBorder()); 
		ImageIcon img1 = new ImageIcon("image/car.png");
		btnNewButton.setIcon(img1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBackground(new Color(250, 250, 210));
		btnNewButton.setForeground(new Color(250, 128, 114));
		btnNewButton.setFont(new Font("Cooper Black", Font.PLAIN, 45));
		btnNewButton.setBounds(12, 235, 331, 72);
		contentPane.add(btnNewButton);
		
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
		contentPane.add(btnHowToUse);
		
		JButton btnCredit = new JButton("Credit");
		btnCredit.setOpaque(false);
		btnCredit.setFocusPainted(false);
		btnCredit.setBorder(BorderFactory.createRaisedBevelBorder());
		ImageIcon img4 = new ImageIcon("image/author.png");
		btnCredit.setIcon(img4);
		btnCredit.setForeground(new Color(250, 128, 114));
		btnCredit.setFont(new Font("Cooper Black", Font.PLAIN, 45));
		btnCredit.setBackground(new Color(250, 250, 210));
		btnCredit.setBounds(379, 335, 321, 72);
		contentPane.add(btnCredit);
		
		JLabel lblNewLabel_1 = new JLabel("");
		ImageIcon img2 = new ImageIcon("image/Okinawa.jpg");
		lblNewLabel_1.setIcon(img2);
		lblNewLabel_1.setBounds(0, 0, 720, 450);
		contentPane.add(lblNewLabel_1);
	}
}
