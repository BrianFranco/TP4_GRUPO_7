package TP4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * BRIAN FRANCO - 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGrupoN = new JLabel("GRUPO N: 7");
		lblGrupoN.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblGrupoN.setBounds(51, 11, 133, 41);
		contentPane.add(lblGrupoN);
		
		JButton btnNewButton = new JButton("Ejercicio 1");
		btnNewButton.setBounds(149, 63, 115, 23);
		contentPane.add(btnNewButton);
		
		JButton btnEjercicio = new JButton("Ejercicio 2");
		btnEjercicio.setBounds(149, 97, 115, 23);
		contentPane.add(btnEjercicio);
		
		JButton btnEjercicio_1 = new JButton("Ejercicio 3");
		btnEjercicio_1.setBounds(149, 131, 115, 23);
		contentPane.add(btnEjercicio_1);
	}
}
