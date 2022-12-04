package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ArtSupplies extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArtSupplies frame = new ArtSupplies();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ArtSupplies() {
		setResizable(false);
		setLocationByPlatform(true);
		setUndecorated(true);
		setBackground(new Color(240, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 913, 711);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setBackground(new Color(240, 248, 255));
		header.setBounds(0, 0, 913, 52);
		contentPane.add(header);
		header.setLayout(null);
		
		final JPanel exit = new JPanel();
	
		
		JLabel lblExit = new JLabel("X");
		lblExit.setForeground(Color.RED);
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		
		
		exit.setBackground(new Color(240, 248, 255));
		exit.setBounds(839, 0, 74, 52);
		header.add(exit);
		exit.setLayout(null);
	
		lblExit.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblExit.setHorizontalTextPosition(SwingConstants.CENTER);
		lblExit.setHorizontalAlignment(SwingConstants.CENTER);
		lblExit.setBounds(0, 0, 74, 52);
		exit.add(lblExit);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 248, 255));
		panel.setBounds(0, 0, 155, 52);
		header.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Clientes");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 155, 52);
		panel.add(lblNewLabel);
		
		JPanel banner = new JPanel();
		banner.setBackground(new Color(255, 255, 255));
		banner.setBounds(616, 0, 297, 711);
		contentPane.add(banner);
	}
}
