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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registro extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textNombre;
	private JTextField textCodigo;
	private JTextField textStock;
	private JTextField textPrecio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Registro dialog = new Registro();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	Libreria lib = new Libreria();
	/**
	 * Create the dialog.
	 */
	public Registro() {
		setBounds(100, 100, 616, 542);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Registro de productos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(12, 13, 574, 322);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("C\u00F3digo");
				lblNewLabel.setBounds(24, 34, 56, 16);
				panel.add(lblNewLabel);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("New label");
				lblNewLabel_1.setBounds(24, 75, 56, 16);
				panel.add(lblNewLabel_1);
			}
			
			textNombre = new JTextField();
			textNombre.setBounds(150, 72, 116, 22);
			panel.add(textNombre);
			textNombre.setColumns(10);
			
			textCodigo = new JTextField();
			textCodigo.setBounds(150, 31, 116, 22);
			panel.add(textCodigo);
			textCodigo.setColumns(10);
			
			textStock = new JTextField();
			textStock.setBounds(150, 124, 116, 22);
			panel.add(textStock);
			textStock.setColumns(10);
			
			textPrecio = new JTextField();
			textPrecio.setBounds(150, 183, 116, 22);
			panel.add(textPrecio);
			textPrecio.setColumns(10);
		}
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int cod = Integer.parseInt(textCodigo.getText());
				String nom = textNombre.getText();
				int stock = Integer.parseInt(textStock.getText());
				double pre = Double.parseDouble(textPrecio.getText());
				lib.insertar(cod, nom, stock, pre);
			}
		});
		btnRegistrar.setBounds(68, 377, 97, 25);
		contentPanel.add(btnRegistrar);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(213, 377, 97, 25);
		contentPanel.add(btnNewButton);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
