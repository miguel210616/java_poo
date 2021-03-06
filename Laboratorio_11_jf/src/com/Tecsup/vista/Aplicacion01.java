package com.Tecsup.vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import com.Tecsup.datos.Libreria;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Aplicacion01 extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtApellidos;
	private JTextField txtNombres;
	private JTextField txtDni;
	private JTextField txtDireccion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aplicacion01 frame = new Aplicacion01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Libreria lib = new Libreria();
	
	/**
	 * Create the frame.
	 */
	public Aplicacion01() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(229, 462, 97, 25);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton = new JButton("New button");
		getContentPane().add(btnNewButton, BorderLayout.WEST);
		getContentPane().setLayout(null);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(96, 481, 97, 25);
		getContentPane().add(btnNuevo);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(29, 32, 591, 269);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(49, 40, 54, 23);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(47, 87, 56, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombres");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(49, 134, 56, 16);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DNI");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(49, 179, 56, 16);
		panel.add(lblNewLabel_3);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n");
		lblDireccin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDireccin.setBounds(49, 230, 56, 16);
		panel.add(lblDireccin);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(153, 38, 155, 22);
		panel.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(153, 85, 259, 22);
		panel.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(153, 132, 259, 22);
		panel.add(txtNombres);
		txtNombres.setColumns(10);
		
		txtDni = new JTextField();
		txtDni.setBounds(153, 177, 116, 22);
		panel.add(txtDni);
		txtDni.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(153, 228, 259, 22);
		panel.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setBorder(new TitledBorder(null, "Resultados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		txtArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtArea.setBounds(29, 325, 591, 166);
		contentPane.add(txtArea);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lib.registrar(Integer.parseInt(txtCodigo.getText()), txtApellidos.getText(), txtNombres.getText(), 
						Integer.parseInt(txtDni.getText()), txtDireccion.getText());
			}
		});
		btnRegistrar.setBounds(62, 518, 97, 25);
		contentPane.add(btnRegistrar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(468, 518, 97, 25);
		contentPane.add(btnBuscar);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String querySQL = "select * from alumno";
				ResultSet datos = lib.consulta(querySQL);
				try{
					int fila = 0;
					while(datos.next()) {
						txtArea.setValueat
					}
				}catch(SQLException e7) {
					System.out.println("Ojala salga tambien");
				}
					
				}
		});
		btnMostrar.setBounds(261, 518, 97, 25);
		contentPane.add(btnMostrar);
	}
}
