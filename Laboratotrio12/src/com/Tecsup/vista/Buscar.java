package com.Tecsup.vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.Tecsup.mantenimiento.Libreria;

import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.ActionEvent;

public class Buscar extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textNombre;
	private JTextField textPrecio;
	private JTable tableReporte;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			Buscar dialog = new Buscar();
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
	
	public Buscar() {
		setBounds(100, 100, 658, 436);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(12, 13, 616, 150);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblPrecio = new JLabel("Precio");
				lblPrecio.setBounds(55, 93, 56, 16);
				panel.add(lblPrecio);
			}
			{
				JLabel lblNombre = new JLabel("Nombre");
				lblNombre.setBounds(55, 40, 56, 16);
				panel.add(lblNombre);
			}
			{
				textNombre = new JTextField();
				textNombre.setBounds(166, 37, 176, 22);
				panel.add(textNombre);
				textNombre.setColumns(10);
			}
			{
				textPrecio = new JTextField();
				textPrecio.setBounds(166, 90, 116, 22);
				panel.add(textPrecio);
				textPrecio.setColumns(10);
			}
			{
				JButton btnBuscarNombre = new JButton("Buscar por Nombre");
				btnBuscarNombre.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int fila = 1;
						for(int i=0;i<6;i++) {
							tableReporte.setValueAt(" ", fila, 0);
							tableReporte.setValueAt(" ", fila, 1);
							tableReporte.setValueAt(" ", fila, 2);
							tableReporte.setValueAt(" ", fila, 3);
							fila++;
						}
						ResultSet busc = lib.buscar(textNombre.getText());
						try {
							int columna = 1;
							while(busc.next()) {
								tableReporte.setValueAt(busc.getInt("codigo"), columna, 0);
								tableReporte.setValueAt(busc.getString("descripcion"), columna, 1);
								tableReporte.setValueAt(busc.getString("stock"), columna, 2);
								tableReporte.setValueAt(busc.getString("precio"), columna, 3);
								columna++;
							}
						}catch(SQLException e3) {
							
						}
						
					}
				});
				btnBuscarNombre.setBounds(406, 36, 148, 25);
				panel.add(btnBuscarNombre);
			}
			{
				JButton btnBuscaPrecio = new JButton("Buscar por Precio");
				btnBuscaPrecio.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int fila = 1;
						for(int i=0;i<6;i++) {
							tableReporte.setValueAt(" ", fila, 0);
							tableReporte.setValueAt(" ", fila, 1);
							tableReporte.setValueAt(" ", fila, 2);
							tableReporte.setValueAt(" ", fila, 3);
							fila++;
						}
						ResultSet busc = lib.buscar(Double.parseDouble(textPrecio.getText()));
						try {
							int columna = 1;
							while(busc.next()) {
								tableReporte.setValueAt(busc.getInt("codigo"), columna, 0);
								tableReporte.setValueAt(busc.getString("descripcion"), columna, 1);
								tableReporte.setValueAt(busc.getString("stock"), columna, 2);
								tableReporte.setValueAt(busc.getString("precio"), columna, 3);
								columna++;
							}
						}catch(SQLException e4) {
							
						}
						
					}
				});
				btnBuscaPrecio.setBounds(407, 89, 147, 25);
				panel.add(btnBuscaPrecio);
			}
		}
		{
			tableReporte = new JTable();
			tableReporte.setModel(new DefaultTableModel(
				new Object[][] {
					{"C�digo", "Nombre", "Stock", "Precio"},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
				},
				new String[] {
					"New column", "New column", "New column", "New column"
				}
			));
			tableReporte.setBounds(12, 199, 616, 160);
			contentPanel.add(tableReporte);
		}
	}

}
