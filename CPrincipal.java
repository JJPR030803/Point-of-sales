package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.Principal;
import Vista.VClientes;
import Vista.VInventario;
import Vista.VProveedores;
import Vista.VReportes;
import Vista.Vventas;

public class CPrincipal implements ActionListener {
Principal inicio;

CPrincipal(){
	this.inicio = new Principal();
}
public void iniciar() {
	inicio.getBtnSalir().addActionListener(this);
	inicio.getBtnClientes().addActionListener(this);
	inicio.getBtnInventario().addActionListener(this);
	inicio.getBtnProveedor().addActionListener(this);
	inicio.getBtnReportes().addActionListener(this);
	inicio.getBtnVentas().addActionListener(this);
	inicio.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource().equals(inicio.getBtnSalir())) {
		System.exit(0);
	}else if(e.getSource().equals(inicio.getBtnClientes())) {
		this.inicio.getPanelMain().removeAll();
		VClientes c = new VClientes();
		this.inicio.getPanelMain().add(c);
		c.setVisible(true);
	}
	else if(e.getSource().equals(inicio.getBtnInventario())) {
		this.inicio.getPanelMain().removeAll();
		VInventario inventario = new VInventario();
		this.inicio.getPanelMain().add(inventario);
		inventario.setVisible(true);
	}
	else if(e.getSource().equals(inicio.getBtnProveedor())) {
		this.inicio.getPanelMain().removeAll();
		VProveedores proveedor = new VProveedores();
		this.inicio.getPanelMain().add(proveedor);
		proveedor.setVisible(true);
	}
	else if(e.getSource().equals(inicio.getBtnReportes())) {
		this.inicio.getPanelMain().removeAll();
		VReportes rep = new VReportes();
		this.inicio.getPanelMain().add(rep);
          rep.setVisible(true);
	}
	else if(e.getSource().equals(inicio.getBtnVentas())) {
		this.inicio.getPanelMain().removeAll();
		Vventas ventas = new Vventas();
		this.inicio.getPanelMain().add(ventas);
		ventas.setVisible(true);
	}
}
}
