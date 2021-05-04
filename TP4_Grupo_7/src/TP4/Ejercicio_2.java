package TP4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class Ejercicio_2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtPromedio;
	private JTextField txtCondicion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_2 frame = new Ejercicio_2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	DecimalFormat formato = new DecimalFormat("#.00");

	/**
	 * Create the frame.
	 * @throws NotaInvalidaException 
	 */
	public Ejercicio_2() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 536, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 314, 155);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNota1 = new JLabel("Nota 1:");
		lblNota1.setBounds(10, 24, 46, 14);
		panel.add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2:");
		lblNota2.setBounds(10, 54, 46, 14);
		panel.add(lblNota2);
		
		JLabel lblNota3 = new JLabel("Nota 3:");
		lblNota3.setBounds(10, 84, 46, 14);
		panel.add(lblNota3);
		
		JLabel lblTPs = new JLabel("TPs");
		lblTPs.setBounds(10, 114, 46, 14);
		panel.add(lblTPs);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(108, 21, 174, 20);
		panel.add(txtNota1);		
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setBounds(108, 51, 174, 20);
		panel.add(txtNota2);
		txtNota2.setColumns(10);
		
		txtNota3 = new JTextField();
		txtNota3.setBounds(108, 81, 174, 20);
		panel.add(txtNota3);
		txtNota3.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Aprobado", "Desaprobado"}));
		comboBox.setBounds(108, 111, 174, 20);
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 177, 314, 73);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPromedio = new JLabel("Promedio:");
		lblPromedio.setBounds(10, 23, 66, 14);
		panel_1.add(lblPromedio);
		
		JLabel lblCondicion = new JLabel("Condicion");
		lblCondicion.setBounds(10, 48, 66, 14);
		panel_1.add(lblCondicion);
		
		txtPromedio = new JTextField();
		txtPromedio.setBounds(109, 20, 173, 20);
		panel_1.add(txtPromedio);
		txtPromedio.setColumns(10);
		
		
		txtCondicion = new JTextField();
		txtCondicion.setBounds(109, 45, 173, 20);
		panel_1.add(txtCondicion);
		txtCondicion.setColumns(10);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					comprobarNota(txtNota1.getText());
				} catch (NotaInvalidaException e1) {
					// TODO Auto-generated catch block
					txtNota1.setText("Solo Numeros de 1 a 10");					 
					e1.printStackTrace();					
					
				}
				try {
					comprobarNota(txtNota2.getText());
				} catch (NotaInvalidaException e1) {
					// TODO Auto-generated catch block
					txtNota2.setText("Solo Numeros de 1 a 10");
					e1.printStackTrace();
				}
				try {
					comprobarNota(txtNota3.getText());
				} catch (NotaInvalidaException e1) {
					// TODO Auto-generated catch block
					txtNota3.setText("Solo Numeros de 1 a 10");
					e1.printStackTrace();
				}
				double promedio = (Double.parseDouble(txtNota1.getText())+Double.parseDouble(txtNota2.getText())+Double.parseDouble(txtNota3.getText()))/3;								
				txtPromedio.setText(formato.format(promedio));	
				
			}
			
		});
		btnCalcular.setBounds(382, 28, 110, 38);
		contentPane.add(btnCalcular);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.setBounds(382, 67, 110, 38);
		contentPane.add(btnNuevo);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(382, 106, 110, 38);
		contentPane.add(btnSalir);
		
	}
	private void comprobarNota(String nota) throws NotaInvalidaException {
		
		for(int x=0; x< nota.length(); x++) {
			if(!Character.isDigit(nota.charAt(x))) {
				throw new NotaInvalidaException();
			}
		}
			if(Double.parseDouble(nota)<1 || Double.parseDouble(nota)>10) {
					throw new NotaInvalidaException();
			}
			}
	
}
