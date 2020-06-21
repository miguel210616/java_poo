import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.Tecsup.datos.Libreria;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import java.awt.Color;

public class Aplicacion01 extends JFrame {

	private JPanel contentPane;
	private JTextField textCodigo;
	private JTextField textApellidos;
	private JTextField textNombres;
	private JTextField textDni;
	private JTextField textDireccion;
	private JTextArea txtReporte;
	private JButton btnRegistrar;
	private JButton btnMostrar;
	private JButton btnBuscar;

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

	/**
	 * Create the frame.
	 */
	Libreria lib = new Libreria();
	private JTable tableReporte;
	
	public Aplicacion01() {
		getContentPane().setLayout(null);
		
		JButton btnNuevo = new JButton("NUevo");
		btnNuevo.setBounds(68, 174, 97, 25);
		getContentPane().add(btnNuevo);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(62, 161, 97, 25);
		getContentPane().add(btnNewButton);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 626, 652);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Datos", TitledBorder.LEADING, 
				TitledBorder.TOP, null, null));
		panel.setBounds(12, 13, 584, 281);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCdigp = new JLabel("C\u00F3digo");
		lblCdigp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCdigp.setBounds(59, 38, 53, 24);
		panel.add(lblCdigp);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblApellidos.setBounds(59, 86, 64, 24);
		panel.add(lblApellidos);
		
		JLabel lblNombres = new JLabel("Nombres");
		lblNombres.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombres.setBounds(59, 133, 64, 24);
		panel.add(lblNombres);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDni.setBounds(59, 182, 43, 24);
		panel.add(lblDni);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n");
		lblDireccin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDireccin.setBounds(59, 228, 64, 29);
		panel.add(lblDireccin);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(165, 40, 116, 22);
		panel.add(textCodigo);
		textCodigo.setColumns(10);
		
		textApellidos = new JTextField();
		textApellidos.setBounds(165, 88, 265, 22);
		panel.add(textApellidos);
		textApellidos.setColumns(10);
		
		textNombres = new JTextField();
		textNombres.setBounds(165, 135, 265, 22);
		panel.add(textNombres);
		textNombres.setColumns(10);
		
		textDni = new JTextField();
		textDni.setBounds(165, 184, 116, 22);
		panel.add(textDni);
		textDni.setColumns(10);
		
		textDireccion = new JTextField();
		textDireccion.setBounds(165, 232, 265, 22);
		panel.add(textDireccion);
		textDireccion.setColumns(10);
		
		txtReporte = new JTextArea();
		txtReporte.setBorder(new TitledBorder(null, "Reporte", 
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		txtReporte.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtReporte.setBounds(12, 307, 584, 68);
		contentPane.add(txtReporte);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lib.registrar(Integer.parseInt(textCodigo.getText()), 
						textApellidos.getText(), textNombres.getText(), 
						textDni.getText(), textDireccion.getText());
			txtReporte.setText("Alumno registrado");
			}
		});
		btnRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRegistrar.setBounds(68, 529, 97, 25);
		contentPane.add(btnRegistrar);
		
		btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String querySQL = "select * from alumno"; 
				ResultSet datos = lib.consulta(querySQL);
				try {
					int fila = 0;
					while(datos.next()) {
						tableReporte.setValueAt(datos.getInt(1), fila, 0);
						tableReporte.setValueAt(datos.getString(2), fila, 1);
						tableReporte.setValueAt(datos.getString(3), fila, 2);
						tableReporte.setValueAt(datos.getInt(4), fila, 3);
						tableReporte.setValueAt(datos.getString(5), fila, 4);
						fila++;
					}
						
				}catch(SQLException e1){
						txtReporte.setText("Error de consulta");
				}
			}
		});
		btnMostrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnMostrar.setBounds(257, 529, 97, 25);
		contentPane.add(btnMostrar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ResultSet busc = lib.buscar(textDni.getText());
				try {
					boolean records = busc.next();
					if(!records) {
						System.out.println("no sale pe");
					}
					tableReporte.setValueAt(busc.getInt(1), 1, 0);
					tableReporte.setValueAt(busc.getString(2), 1, 1);
					tableReporte.setValueAt(busc.getString(3), 1, 2);
					tableReporte.setValueAt(busc.getInt(4), 1, 3);
					tableReporte.setValueAt(busc.getString(5), 1, 4);
				}catch(SQLException e2) {
				}
			}
		});
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBuscar.setBounds(445, 529, 97, 25);
		contentPane.add(btnBuscar);
		
		tableReporte = new JTable();
		tableReporte.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tableReporte.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		tableReporte.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		tableReporte.setBounds(12, 388, 584, 107);
		contentPane.add(tableReporte);
	}
}