package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class VClientes extends javax.swing.JInternalFrame {
Principal p;

	/**
	 * Create the frame.
	 */
	public VClientes() {
	
	panelBtn.setLayout(null);
	panelBtn.setBackground(Color.WHITE);
	panelBtn.setBounds(ancho-tamPanelBTN, 0, tamPanelBTN, altura);
	panelBtn.add(btnAgregar);
	panelBtn.add(btnEliminar);
	panelBtn.add(NombreC);
	panelBtn.add(TelefonoC);
	panelBtn.add(EmailC);
	panelBtn.add(txtEmailC);
	panelBtn.add(txtNombreC);
	panelBtn.add(txtTelefonoC);
	
	btnAgregar.setBackground(Color.CYAN);
	btnAgregar.setBounds((int) (tamPanelBTN*0.015), (int) (altura*0.63), (int)(tamPanelBTN*0.97), (int) (altura*0.05));
	
	btnEliminar.setBackground(Color.CYAN);
	btnEliminar.setBounds((int) (tamPanelBTN*0.015), (int) (altura*0.7), (int)(tamPanelBTN*0.97), (int) (altura*0.05));
	
	NombreC.setBackground(Color.CYAN);
	NombreC.setBounds((int) (tamPanelBTN*0.015), (int) (altura*0.01), (int)(tamPanelBTN*0.5), (int) (altura*0.05));
	
	TelefonoC.setBackground(Color.CYAN);
	TelefonoC.setBounds((int) (tamPanelBTN*0.015), (int) (altura*0.05), (int)(tamPanelBTN*0.5), (int) (altura*0.05));
	
	setBackground(Color.MAGENTA);
	setBounds(0, 0, ancho, altura-tamPanelMenuAltura);
	this.setLayout(null);
	this.setResizable(false);
	this.setClosable(false);
	this.putClientProperty("JInternalFrame.isPalette",Boolean.TRUE);
	this.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
	this.add(panelBtn);
	
	}
//componentes	
Dimension maxScreen = Toolkit.getDefaultToolkit().getScreenSize();

JPanel panelBtn = new JPanel();
JScrollPane scrlTabla = new JScrollPane();
JTable tablaC = new JTable();
DefaultTableModel modeloC = new DefaultTableModel();

JLabel NombreC = new JLabel("Nombre:");
JTextField txtNombreC = new JTextField();
JLabel TelefonoC = new JLabel("Telefono:");
JTextField txtTelefonoC = new JTextField();
JLabel EmailC = new JLabel("Email:");
JTextField txtEmailC = new JTextField();

JButton btnAgregar = new JButton("Agregar");
JButton btnEliminar = new JButton("Eliminar");

//variables tamaño
	public int ancho = (int) maxScreen.getWidth();
	public int altura = (int) maxScreen.getHeight();
	int tamPanelMenuAncho = ancho;
    int tamPanelMenuAltura = altura/6;
    int tamClientes = altura-tamPanelMenuAncho;
    int tamPanelBTN = ancho/4;
}
