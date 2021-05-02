package TP4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Ejercicio_3 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4L;
	private JPanel Ej3;
	/**
	 * Create the frame.
	 */
	public Ejercicio_3() {
		setTitle("Seleccion multiple");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 331);
		Ej3 = new JPanel();
		setContentPane(Ej3);
		Ej3.setLayout(null); 
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(55, 22, 406, 44);
		Ej3.add(panel);
		panel.setLayout(null);
		
		JRadioButton btnWindows = new JRadioButton("Windows");
		btnWindows.setBounds(168, 14, 94, 23);
		panel.add(btnWindows);
		
		JRadioButton btnMac = new JRadioButton("Mac");
		btnMac.setBounds(264, 14, 63, 23);
		panel.add(btnMac);
		
		JRadioButton btnLinux = new JRadioButton("Linux");
		btnLinux.setBounds(329, 14, 71, 23);
		panel.add(btnLinux);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(btnWindows);
		bg.add(btnMac);
		bg.add(btnLinux);
	
		JLabel lblNewLabel = new JLabel("Elije un sistema operativo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 14, 154, 23);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(55, 95, 406, 88);
		Ej3.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Elije una especialidad");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(22, 37, 118, 14);
		panel_1.add(lblNewLabel_1);
		
		
		JCheckBox boxProgramacion = new JCheckBox("Programacion");
		boxProgramacion.setBounds(195, 7, 174, 23);
		panel_1.add(boxProgramacion);
		
		JCheckBox boxAdministracion = new JCheckBox("Administracion");
		boxAdministracion.setBounds(195, 34, 174, 23);
		panel_1.add(boxAdministracion);
		
		JCheckBox boxDiseño = new JCheckBox("Dise\u00F1o Grafico");
		boxDiseño.setBounds(195, 59, 174, 23);
		panel_1.add(boxDiseño);
		
		JCheckBox[] checkBoxes = {boxProgramacion,boxAdministracion,boxDiseño};
		
		JLabel lblCantidadDeHoras = new JLabel("Cantidad de horas en el computador");
		lblCantidadDeHoras.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCantidadDeHoras.setBounds(55, 212, 216, 15);
		Ej3.add(lblCantidadDeHoras);
		
		JTextField txtHoras = new JTextField();
		txtHoras.setBounds(267, 210, 86, 20);
		Ej3.add(txtHoras);
		txtHoras.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Mensaje ventanaMensaje = new Mensaje(checkBoxes,bg,txtHoras);
				ventanaMensaje.setVisible(true);
			}
		});
		btnAceptar.setBounds(372, 245, 89, 23);
		Ej3.add(btnAceptar);
	}
}
