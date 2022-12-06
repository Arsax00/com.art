package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controllers.AlmacenController;

public class ArtSupplies extends JFrame {
	int xMouse, yMouse;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		try {

		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

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
		header.setBackground(new Color(255, 255, 255));
		header.setBounds(0, 0, 913, 52);
		contentPane.add(header);
		header.setLayout(null);

		header.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xMouse = e.getX();
				yMouse = e.getY();

			}
		});
		header.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - xMouse, y - yMouse);

			}
		});

		final JPanel exit = new JPanel();

		JLabel lblExit = new JLabel("X");
		lblExit.setForeground(new Color(178, 34, 34));
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				lblExit.setForeground(new Color(255, 255, 255));
				exit.setBackground(new Color(178, 34, 34));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblExit.setForeground(new Color(178, 34, 34));
				exit.setBackground(new Color(255, 255, 255));
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

		JPanel menu = new JPanel();
		menu.setBackground(new Color(178, 34, 34));
		menu.setBounds(0, 0, 109, 52);
		header.add(menu);
		menu.setLayout(null);

		JLabel lblMenu = new JLabel("");
		lblMenu.setBackground(new Color(178, 34, 34));
		lblMenu.setIcon(new ImageIcon(ArtSupplies.class.getResource("/Imagenes/iconHome2.png")));
		lblMenu.setForeground(new Color(178, 34, 34));
		lblMenu.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setBounds(0, 0, 109, 52);
		menu.add(lblMenu);

		JLabel lblMenu_1 = new JLabel("");
		lblMenu_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu_1.setForeground(new Color(178, 34, 34));
		lblMenu_1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblMenu_1.setBackground(Color.WHITE);
		lblMenu_1.setBounds(108, 0, 109, 52);
		header.add(lblMenu_1);

		JPanel banner = new JPanel();
		banner.setBackground(new Color(255, 255, 255));
		banner.setBounds(622, 0, 291, 711);
		contentPane.add(banner);
		banner.setLayout(null);

		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(ArtSupplies.class.getResource("/Imagenes/logo.png")));
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setBounds(0, 52, 297, 262);
		banner.add(lblLogo);

		JLabel lblEmail = new JLabel("Email: ArtSuppliesSMJ@gmail.com");
		lblEmail.setForeground(new Color(0, 0, 139));
		lblEmail.setBounds(42, 325, 169, 23);
		banner.add(lblEmail);

		JLabel lblTfn = new JLabel("Tel\u00E9fono: 954307521");
		lblTfn.setForeground(new Color(0, 0, 139));
		lblTfn.setBounds(42, 397, 169, 23);
		banner.add(lblTfn);

		JLabel lblDireccin = new JLabel("Direcci\u00F3n: Sevilla, C/Desgracia 27, 3\u00BA B");
		lblDireccin.setForeground(new Color(0, 0, 139));
		lblDireccin.setBounds(42, 359, 193, 23);
		banner.add(lblDireccin);
		
		AlmacenController AC = new AlmacenController();
		JList jLista = new JList(AC.getAlmacenes().toArray());
		jLista.setBounds(152, 93, 341, 368);
		contentPane.add(jLista);
	}
}
