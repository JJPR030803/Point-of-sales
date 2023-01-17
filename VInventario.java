package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JInternalFrame;
import javax.swing.JRootPane;

public class VInventario extends JInternalFrame{

	public VInventario(){
		setBackground(Color.BLUE);
		setBounds(0, 0, ancho, altura-tamPanelMenuAltura);
		this.setResizable(false);
		this.setClosable(false);
		this.putClientProperty("JInternalFrame.isPalette",Boolean.TRUE);
		this.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		}
		
	Dimension maxScreen = Toolkit.getDefaultToolkit().getScreenSize();
		
		public int ancho = (int) maxScreen.getWidth();
		public int altura = (int) maxScreen.getHeight();
		int tamPanelMenuAncho = ancho;
	    int tamPanelMenuAltura = altura/6;
	    int tamClientes = altura-tamPanelMenuAncho;

	
}
