package TP4;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ejercicio1 extends JFrame{
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldTelefono;
	private JTextField textFieldNacimiento;
	public ejercicio1() {
		getContentPane().setEnabled(false);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(300,365);
		setLocation(300,300);
		setTitle("Ejercicio 1");
		//setVisible(visibleEstate);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		getContentPane().add(lblNombre, gbc_lblNombre);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBackground(Color.WHITE);
		GridBagConstraints gbc_textFieldNombre = new GridBagConstraints();
		gbc_textFieldNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNombre.gridx = 3;
		gbc_textFieldNombre.gridy = 1;
		getContentPane().add(textFieldNombre, gbc_textFieldNombre);
		textFieldNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		GridBagConstraints gbc_lblApellido = new GridBagConstraints();
		gbc_lblApellido.anchor = GridBagConstraints.WEST;
		gbc_lblApellido.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellido.gridx = 1;
		gbc_lblApellido.gridy = 2;
		getContentPane().add(lblApellido, gbc_lblApellido);
		
		textFieldApellido = new JTextField();
		GridBagConstraints gbc_textFieldApellido = new GridBagConstraints();
		gbc_textFieldApellido.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldApellido.gridx = 3;
		gbc_textFieldApellido.gridy = 2;
		getContentPane().add(textFieldApellido, gbc_textFieldApellido);
		textFieldApellido.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Telefono");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 3;
		getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		textFieldTelefono = new JTextField();
		GridBagConstraints gbc_textFieldTelefono = new GridBagConstraints();
		gbc_textFieldTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldTelefono.gridx = 3;
		gbc_textFieldTelefono.gridy = 3;
		getContentPane().add(textFieldTelefono, gbc_textFieldTelefono);
		textFieldTelefono.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Fecha Nac.");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 4;
		getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textFieldNacimiento = new JTextField();
		GridBagConstraints gbc_textFieldNacimiento = new GridBagConstraints();
		gbc_textFieldNacimiento.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldNacimiento.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNacimiento.gridx = 3;
		gbc_textFieldNacimiento.gridy = 4;
		getContentPane().add(textFieldNacimiento, gbc_textFieldNacimiento);
		textFieldNacimiento.setColumns(10);
		
		JLabel lblDatosIngresados = new JLabel("");
		GridBagConstraints gbc_lblDatosIngresados = new GridBagConstraints();
		gbc_lblDatosIngresados.gridwidth = 4;
		gbc_lblDatosIngresados.anchor = GridBagConstraints.WEST;
		gbc_lblDatosIngresados.insets = new Insets(0, 0, 5, 5);
		gbc_lblDatosIngresados.gridx = 1;
		gbc_lblDatosIngresados.gridy = 6;
		getContentPane().add(lblDatosIngresados, gbc_lblDatosIngresados);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comprobarTextField() == 4) {
					lblDatosIngresados.setText("<html><body>Los datos ingresado fueron: <br>"+textFieldNombre.getText()+"<br>"+
					textFieldApellido.getText()+"<br>"+textFieldTelefono.getText()+"<br>"+textFieldNacimiento.getText()+"</body></html>");
					limpiarTextField();
				}else {
					lblDatosIngresados.setText("");
				}
			}
		});
		GridBagConstraints gbc_btnMostrar = new GridBagConstraints();
		gbc_btnMostrar.anchor = GridBagConstraints.EAST;
		gbc_btnMostrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnMostrar.gridx = 3;
		gbc_btnMostrar.gridy = 5;
		getContentPane().add(btnMostrar, gbc_btnMostrar);
	}
	
	private void limpiarTextField() {
		textFieldNombre.setText("");
		textFieldApellido.setText("");
		textFieldTelefono.setText("");
		textFieldNacimiento.setText("");
	}
	
	private int comprobarTextField() {
		int checks = 4;
		if(textFieldNombre.getText().isEmpty()){
			textFieldNombre.setBackground(Color.RED);
			checks--;
		}else if(!textFieldNombre.getText().isEmpty()){
			textFieldNombre.setBackground(Color.WHITE);
		}
		if(textFieldApellido.getText().isEmpty()){
			textFieldApellido.setBackground(Color.RED);
			checks--;
		}else if(!textFieldApellido.getText().isEmpty()){
			textFieldApellido.setBackground(Color.WHITE);
		}
		if(textFieldTelefono.getText().isEmpty()){
			textFieldTelefono.setBackground(Color.RED);
			checks--;
		}else if(!textFieldTelefono.getText().isEmpty()){
			textFieldTelefono.setBackground(Color.WHITE);
		}
		if(textFieldNacimiento.getText().isEmpty()){
			textFieldNacimiento.setBackground(Color.RED);
			checks--;
		}else if(!textFieldNacimiento.getText().isEmpty()){
			textFieldNacimiento.setBackground(Color.WHITE);
		}
		return checks;
	}
	
}
