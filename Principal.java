package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JPanel;

public class Principal extends JFrame{

	VClientes VC;
	
	public Principal(){
		
		btnClientes.setText("Clientes");
		btnClientes.setBackground(Color.CYAN);
		btnClientes.setPreferredSize(new Dimension(tamPanelMenuAncho/6,tamPanelMenuAltura/2));
		//btnClientes.setBounds(tamPanelMenuAncho/100, posbtnAltura, tamPanelMenuAncho/8, tamPanelMenuAltura/2);
		
		//btnReportes.setBounds(tamPanelMenuAncho/3, posbtnAltura, tamPanelMenuAncho/8, tamPanelMenuAltura/2);
		btnReportes.setText("Reportes");
		btnReportes.setBackground(Color.CYAN);
		btnReportes.setPreferredSize(new Dimension(tamPanelMenuAncho/6,tamPanelMenuAltura/2));
		
		//btnVentas.setBounds(tamPanelMenuAncho/6,posbtnAltura, tamPanelMenuAncho/8, tamPanelMenuAltura/2);
		btnVentas.setText("Ventas");
		btnVentas.setBackground(Color.CYAN);
		btnVentas.setPreferredSize(new Dimension(tamPanelMenuAncho/6,tamPanelMenuAltura/2));
		
		btnInventario.setText("Inventario");
		btnInventario.setBackground(Color.CYAN);
		btnInventario.setPreferredSize(new Dimension(tamPanelMenuAncho/6,tamPanelMenuAltura/2));
		
		
		btnProveedor.setText("Proveedores");
		btnProveedor.setBackground(Color.CYAN);
		btnProveedor.setPreferredSize(new Dimension(tamPanelMenuAncho/6,tamPanelMenuAltura/2));
		
		//btnSalir.setBounds(tamPanelMenuAncho/2, posbtnAltura, tamPanelMenuAncho/16, tamPanelMenuAltura/4);
		btnSalir.setText("Salir");
		btnSalir.setBackground(Color.red);
		
		
	
		
		panelmenu.setBackground(Color.LIGHT_GRAY);
		panelmenu.setBounds(0, 0, ancho, tamPanelMenuAltura);
		panelmenu.add(btnClientes);
		panelmenu.add(btnReportes);
		panelmenu.add(btnVentas);
		panelmenu.add(btnInventario);
		panelmenu.add(btnProveedor);
		panelmenu.add(btnSalir);
		panelmenu.setLayout(new FlowLayout(FlowLayout.CENTER ,20,tamPanelMenuAltura/4));
		
		panelMain.setBackground(Color.BLACK);
		panelMain.setBounds(0, tamPanelMenuAltura, ancho, altura-tamPanelMenuAltura);
		panelMain.setLayout(null);
		setBounds(posicionx, posiciony, ancho, altura);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
	    setUndecorated(true);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().add(panelmenu);
		getContentPane().add(panelMain);
		getContentPane().setLayout(null);
	}
	
	 public Dimension getMaxScreen() {return maxScreen;}
	public void setMaxScreen(Dimension maxScreen) {this.maxScreen = maxScreen;}
	public int getPosicionx() {return posicionx;}
	public void setPosicionx(int posicionx) {this.posicionx = posicionx;}
	public int getPosiciony() {return posiciony;}
	public void setPosiciony(int posiciony) {this.posiciony = posiciony;}
	public int getTamPanelMenuAncho() {return tamPanelMenuAncho;}
	public void setTamPanelMenuAncho(int tamPanelMenuAncho) {this.tamPanelMenuAncho = tamPanelMenuAncho;}
	public int getTamPanelMenuAltura() {return tamPanelMenuAltura;}
	public void setTamPanelMenuAltura(int tamPanelMenuAltura) {	this.tamPanelMenuAltura = tamPanelMenuAltura;}
	public JPanel getPanelmenu() {
		return panelmenu;
	}
	public void setPanelmenu(JPanel panelmenu) {
		this.panelmenu = panelmenu;
	}
	public JPanel getPanelMain() {
		return panelMain;
	}
	public void setPanelMain(JPanel panelMain) {
		this.panelMain = panelMain;
	}

	JMenu menu = new JMenu();
     JPanel panelmenu = new JPanel();
     JPanel panelMain = new JPanel();
     JDesktopPane dp = new JDesktopPane();
     JButton btnClientes = new JButton();
     JButton btnReportes = new JButton();
     JButton btnVentas = new JButton();
     JButton btnInventario = new JButton();
     JButton btnProveedor = new JButton();
     JButton btnSalir = new JButton();
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
	
	public JButton getBtnClientes() {
		return btnClientes;
	}
	public void setBtnClientes(JButton btnClientes) {
		this.btnClientes = btnClientes;
	}
	public JButton getBtnReportes() {
		return btnReportes;
	}
	public void setBtnReportes(JButton btnReportes) {
		this.btnReportes = btnReportes;
	}
	public JButton getBtnVentas() {
		return btnVentas;
	}
	public void setBtnVentas(JButton btnVentas) {
		this.btnVentas = btnVentas;
	}
	public JButton getBtnInventario() {
		return btnInventario;
	}
	public void setBtnInventario(JButton btnInventario) {
		this.btnInventario = btnInventario;
	}
	public JButton getBtnProveedor() {
		return btnProveedor;
	}
	public void setBtnProveedor(JButton btnProveedor) {
		this.btnProveedor = btnProveedor;
	}
	public JButton getBtnSalir() {
		return btnSalir;
	}
	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
    
	
	
}
