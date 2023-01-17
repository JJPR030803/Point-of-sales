package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JInternalFrame;
import javax.swing.JRootPane;

public class VReportes extends JInternalFrame {

	
	public VReportes() {
		setBackground(Color.PINK);
		setBounds(0, 0, ancho, altura-tamPanelMenuAltura);
		this.setResizable(false);
		this.setClosable(false);
		this.setMaximizable(true);
		this.putClientProperty("JInternalFrame.isPalette",Boolean.TRUE);
		this.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		}
		
	Dimension maxScreen = Toolkit.getDefaultToolkit().getScreenSize();
		
	public int ancho = (int) maxScreen.getWidth();
	public int altura = (int) maxScreen.getHeight();
	public int posicionx = ancho/2;
	public int posiciony = altura/2;
    int tamPanelMenuAncho = ancho;
    int tamPanelMenuAltura = altura/6;
    int posbtnClientesAncho = tamPanelMenuAncho/100;
    int posbtnReportes = tamPanelMenuAncho/4;
    int posbtnAltura = tamPanelMenuAltura/4;
	int tam = 50;

}
