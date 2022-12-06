package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.UsuarioController;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;

public class Cliente extends JFrame {
	int xMouse, yMouse;
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textApellido2;
	private JTextField txtCalle;
	private JTextField txtExamplegmailcom;

	/**
	 * Launch the application.
	 */
	UsuarioController uc = new UsuarioController();
	private JTextField txtN;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente frame = new Cliente();
				
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cliente() {
		setLocationRelativeTo(null);
		setResizable(false);
		setLocationByPlatform(true);
		setUndecorated(true);
		setBackground(new Color(240, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1066, 758);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel header = new JPanel();
		header.setBackground(new Color(255, 255, 255));
		header.setBounds(0, 0, 1066, 52);
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

		exit.setBackground(new Color(255, 255, 255));
		exit.setBounds(990, 0, 76, 52);
		header.add(exit);
		exit.setLayout(null);

		lblExit.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblExit.setHorizontalTextPosition(SwingConstants.CENTER);
		lblExit.setHorizontalAlignment(SwingConstants.CENTER);
		lblExit.setBounds(0, 0, 76, 52);
		exit.add(lblExit);

		JPanel menu = new JPanel();
		menu.setBackground(new Color(240, 248, 255));
		menu.setBounds(0, 0, 150, 52);
		header.add(menu);
		menu.setLayout(null);

		JLabel lblMenu = new JLabel("");
		lblMenu.setBackground(new Color(240, 248, 255));
		lblMenu.setIcon(new ImageIcon(Cliente.class.getResource("/Imagenes/iconHome.png")));
		lblMenu.setForeground(new Color(178, 34, 34));
		lblMenu.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setBounds(0, 0, 150, 52);
		menu.add(lblMenu);
		
		
		lblMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				lblMenu.setIcon(new ImageIcon(Cliente.class.getResource("/Imagenes/iconHome2.png")));
				menu.setBackground(new Color(178, 34, 34));
			}

			@Override
			public void mouseExited(MouseEvent e) {

				lblMenu.setIcon(new ImageIcon(Cliente.class.getResource("/Imagenes/iconHome.png")));
				menu.setBackground(new Color(240, 248, 255));

			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				ArtSupplies ar = new ArtSupplies();
				ar.setVisible(true);
				setVisible(false);
				
			}
		});


		JPanel Clientes = new JPanel();
		Clientes.setLayout(null);
		Clientes.setBackground(new Color(65, 105, 225));
		Clientes.setBounds(149, 0, 150, 52);
		header.add(Clientes);

		JLabel lblClientes = new JLabel("Clientes");
	
		lblClientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblClientes.setForeground(new Color(240, 248, 255));
		lblClientes.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblClientes.setBackground(new Color(240, 248, 255));
		lblClientes.setBounds(0, 0, 150, 52);
		Clientes.add(lblClientes);

		JPanel Productos = new JPanel();
		Productos.setLayout(null);
		Productos.setBackground(new Color(240, 248, 255));
		Productos.setBounds(298, 0, 150, 52);
		header.add(Productos);

		JLabel lblProductos = new JLabel("Productos");
		lblProductos.setHorizontalAlignment(SwingConstants.CENTER);
		lblProductos.setForeground(new Color(178, 34, 34));
		lblProductos.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblProductos.setBackground(new Color(240, 248, 255));
		lblProductos.setBounds(0, 0, 150, 52);
		Productos.add(lblProductos);

		Productos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Productos.setBackground(new Color(178, 34, 34));
				lblProductos.setForeground(new Color(240, 248, 255));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				Productos.setBackground(new Color(240, 248, 255));
				lblProductos.setForeground(new Color(178, 34, 34));

			}
		});

		JPanel Ventas = new JPanel();
		Ventas.setLayout(null);
		Ventas.setBackground(new Color(240, 248, 255));
		Ventas.setBounds(448, 0, 150, 52);
		header.add(Ventas);

		JLabel lblVentas = new JLabel("Ventas");
		lblVentas.setHorizontalAlignment(SwingConstants.CENTER);
		lblVentas.setForeground(new Color(178, 34, 34));
		lblVentas.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblVentas.setBackground(new Color(240, 248, 255));
		lblVentas.setBounds(0, 0, 150, 52);
		Ventas.add(lblVentas);

		Ventas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Ventas.setBackground(new Color(178, 34, 34));
				lblVentas.setForeground(new Color(240, 248, 255));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				Ventas.setBackground(new Color(240, 248, 255));
				lblVentas.setForeground(new Color(178, 34, 34));

			}
		});

		JPanel Proveedores = new JPanel();
		Proveedores.setLayout(null);
		Proveedores.setBackground(new Color(240, 248, 255));
		Proveedores.setBounds(598, 0, 150, 52);
		header.add(Proveedores);

		JLabel lblProveedores = new JLabel("Proveedores");
		lblProveedores.setHorizontalAlignment(SwingConstants.CENTER);
		lblProveedores.setForeground(new Color(178, 34, 34));
		lblProveedores.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblProveedores.setBackground(new Color(240, 248, 255));
		lblProveedores.setBounds(0, 0, 150, 52);
		Proveedores.add(lblProveedores);

		Proveedores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Proveedores.setBackground(new Color(178, 34, 34));
				lblProveedores.setForeground(new Color(240, 248, 255));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				Proveedores.setBackground(new Color(240, 248, 255));
				lblProveedores.setForeground(new Color(178, 34, 34));

			}
		});

		JPanel banner = new JPanel();
		banner.setBackground(new Color(255, 255, 255));
		banner.setBounds(747, 0, 319, 769);
		contentPane.add(banner);
		banner.setLayout(null);

		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(Cliente.class.getResource("/Imagenes/logo.png")));
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setBounds(0, 52, 319, 262);
		banner.add(lblLogo);

		JLabel lblEmail = new JLabel("Email: ArtSuppliesSMJ@gmail.com");
		lblEmail.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblEmail.setBackground(new Color(65, 105, 225));
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setForeground(new Color(0, 0, 139));
		lblEmail.setBounds(60, 325, 228, 23);
		banner.add(lblEmail);

		JLabel lblTfn = new JLabel("Telefono: 954307521");
		lblTfn.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblTfn.setBackground(new Color(65, 105, 225));
		lblTfn.setForeground(new Color(0, 0, 139));
		lblTfn.setBounds(60, 397, 228, 23);
		banner.add(lblTfn);

		JLabel lblDireccion = new JLabel("Direccion: Sevilla, C/Desgracia 27, 3\u00BA B");
		lblDireccion.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblDireccion.setBackground(new Color(65, 105, 225));
		lblDireccion.setHorizontalAlignment(SwingConstants.LEFT);
		lblDireccion.setForeground(new Color(0, 0, 139));
		lblDireccion.setBounds(60, 359, 228, 23);
		banner.add(lblDireccion);
		
		JLabel lblInsert = new JLabel("Insertar:");
		lblInsert.setForeground(new Color(65, 105, 225));
		lblInsert.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblInsert.setBounds(27, 94, 86, 20);
		contentPane.add(lblInsert);
		
		textNombre = new JTextField();
		textNombre.setForeground(new Color(192, 192, 192));
		textNombre.setText("Pepe");
		textNombre.setBounds(165, 140, 125, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(new Color(178, 34, 34));
		lblNombre.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNombre.setBounds(27, 140, 86, 20);
		contentPane.add(lblNombre);
		
		textApellido = new JTextField();
		textApellido.setForeground(new Color(192, 192, 192));
		textApellido.setText("Ramirez");
		textApellido.setColumns(10);
		textApellido.setBounds(165, 184, 125, 20);
		contentPane.add(textApellido);
		
		JLabel lblApellido1 = new JLabel("Primer apellido:");
		lblApellido1.setForeground(new Color(178, 34, 34));
		lblApellido1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblApellido1.setBounds(27, 184, 119, 20);
		contentPane.add(lblApellido1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(557, 158, 1, 2);
		contentPane.add(separator);
		
		JLabel lblApellido2 = new JLabel("Segundo apellido:");
		lblApellido2.setForeground(new Color(178, 34, 34));
		lblApellido2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblApellido2.setBounds(27, 227, 128, 20);
		contentPane.add(lblApellido2);
		
		textApellido2 = new JTextField();
		textApellido2.setForeground(new Color(192, 192, 192));
		textApellido2.setText("Vivaldi");
		textApellido2.setColumns(10);
		textApellido2.setBounds(165, 227, 125, 20);
		contentPane.add(textApellido2);
		
		JLabel lblDireccion2 = new JLabel("Direccion:");
		lblDireccion2.setForeground(new Color(178, 34, 34));
		lblDireccion2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblDireccion2.setBounds(27, 269, 86, 20);
		contentPane.add(lblDireccion2);
		
		JTextField txtDireccion = new JTextField();
		txtDireccion.setForeground(new Color(192, 192, 192));
		txtDireccion.setText("Calle");
		txtDireccion.setBounds(165, 271, 63, 20);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setForeground(new Color(178, 34, 34));
		lblTelefono.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblTelefono.setBounds(27, 309, 86, 20);
		contentPane.add(lblTelefono);
		
		JTextField txtTelefono = new JTextField();
		txtTelefono.setForeground(new Color(192, 192, 192));
		txtTelefono.setText("954431224");
		txtTelefono.setBounds(165, 311, 125, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JLabel lblEmail2 = new JLabel("Email:");
		lblEmail2.setForeground(new Color(178, 34, 34));
		lblEmail2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblEmail2.setBounds(27, 354, 86, 20);
		contentPane.add(lblEmail2);
		
		txtExamplegmailcom = new JTextField();
		txtExamplegmailcom.setText("example@gmail.com");
		txtExamplegmailcom.setForeground(Color.LIGHT_GRAY);
		txtExamplegmailcom.setColumns(10);
		txtExamplegmailcom.setBounds(165, 356, 125, 20);
		contentPane.add(txtExamplegmailcom);
		
		//Botón donde se crean los usuarios
		JButton btnInsert = new JButton("Enviar");
		
		btnInsert.setBackground(new Color(100, 149, 237));
		btnInsert.setForeground(new Color(178, 34, 34));
		btnInsert.setBounds(112, 412, 101, 31);
		contentPane.add(btnInsert);
		
		txtN = new JTextField();
		txtN.setText("n\u00BA");
		txtN.setForeground(Color.LIGHT_GRAY);
		txtN.setColumns(10);
		txtN.setBounds(251, 271, 39, 20);
		contentPane.add(txtN);
		btnInsert.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btnInsert.setBackground(new Color(180, 35, 35));
				btnInsert.setForeground(new Color(100, 149, 237));	
				String nombre= textNombre.getText();
				
				String apellido= textApellido.getText();
				
				String direccion= txtDireccion.getText()+" "+txtN.getText();
				
				uc.createUsuario(nombre,apellido,direccion);
				
			}
	
			@Override
			public void mouseReleased(MouseEvent e) {
				
				btnInsert.setBackground(new Color(100, 149, 237));
				btnInsert.setForeground(new Color(178, 34, 34));
			}
		});
	
	}
}
