package TP4;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Enumeration;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mensaje extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Mensaje(JCheckBox[] checkBoxes,ButtonGroup bg,JTextField txtHoras) {
		setTitle("Mensaje");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 452, 142);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel mensaje = new JLabel("");
		mensaje.setBounds(22, 25, 404, 23);
		contentPane.add(mensaje);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose()
				/*bg.clearSelection();
				Ejercicio_3 ej3 = new Ejercicio_3();
				ej3.setVisible(true);*/
			}
		});
		btnAceptar.setBounds(128, 69, 89, 23);
		contentPane.add(btnAceptar);
		
		String btnText = "";
		String radioText = "";
		
		for (Enumeration<AbstractButton> buttons = bg.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                btnText = button.getText();
            }
        }
		for (JCheckBox checkbox : checkBoxes) {
			if (checkbox.isSelected()) {
				String t = checkbox.getText();
				radioText = radioText + " - " + t;
			}
		}
		mensaje.setText(btnText + radioText + " - " + txtHoras.getText() + " Hs");
	}

}
