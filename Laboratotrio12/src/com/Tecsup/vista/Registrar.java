package com.Tecsup.vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.Tecsup.mantenimiento.Libreria;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registrar extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textCodigo;
	private JTextField textNombre;
	private JTextField textCantidad;
	private JTextField textPrecio;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			Registrar dialog = new Registrar();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	
	Libreria lib = new Libreria();
	
	
	public Registrar() {
		setBounds(100, 100, 598, 506);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Datos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(12, 13, 556, 255);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(41, 93, 56, 16);
		panel.add(lblNombre);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setBounds(41, 45, 56, 16);
		panel.add(lblCdigo);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(41, 153, 56, 16);
		panel.add(lblCantidad);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(41, 208, 56, 16);
		panel.add(lblPrecio);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(137, 42, 116, 22);
		panel.add(textCodigo);
		textCodigo.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setBounds(137, 93, 245, 22);
		panel.add(textNombre);
		textNombre.setColumns(10);
		
		textCantidad = new JTextField();
		textCantidad.setBounds(137, 150, 116, 22);
		panel.add(textCantidad);
		textCantidad.setColumns(10);
		
		textPrecio = new JTextField();
		textPrecio.setBounds(137, 205, 116, 22);
		panel.add(textPrecio);
		textPrecio.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
		textArea.setBounds(12, 288, 556, 72);
		contentPanel.add(textArea);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lib.insertar(Integer.parseInt(textCodigo.getText()), 
							textNombre.getText(), 
							Integer.parseInt(textCantidad.getText()), 
							Double.parseDouble(textPrecio.getText()));
				textArea.setText("Producto Registrado");
			}
		});
		btnRegistrar.setBounds(218, 397, 97, 25);
		contentPanel.add(btnRegistrar);
	}
}
