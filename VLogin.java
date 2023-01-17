package Vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class VLogin extends JFrame{
	private JPasswordField txtContraseña;
	private JTextField textFieldUsuario;
	
	VLogin(){
		getContentPane().setLayout(null);
		
		txtContraseña = new JPasswordField();
		txtContraseña.setBounds(146, 293, 228, 38);
		getContentPane().add(txtContraseña);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(146, 244, 228, 38);
		getContentPane().add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsuario.setBackground(Color.LIGHT_GRAY);
		lblUsuario.setBounds(10, 244, 135, 38);
		getContentPane().add(lblUsuario);
		
		JLabel lblContraseña = new JLabel("Contraseña:");
		lblContraseña.setHorizontalAlignment(SwingConstants.CENTER);
		lblContraseña.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblContraseña.setBackground(Color.LIGHT_GRAY);
		lblContraseña.setBounds(10, 293, 135, 38);
		getContentPane().add(lblContraseña);
		
	}

	public JPasswordField gettxtContraseña() {
		return txtContraseña;
	}

	public void settxtContraseña(JPasswordField txtContraseña) {
		this.txtContraseña = txtContraseña;
	}

	public JTextField getTextFieldUsuario() {
		return textFieldUsuario;
	}

	public void setTextFieldUsuario(JTextField textFieldUsuario) {
		this.textFieldUsuario = textFieldUsuario;
	}
}
