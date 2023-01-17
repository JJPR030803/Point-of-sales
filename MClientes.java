package Modelo;

public class MClientes {
	String nombre1,nombre2,apellidoPaterno,apellidoMaterno;
	MClientes siguiente;
public MClientes(String nombre1, String nombre2,String apellidoPaterno,String apellidoMaterno) {
	this.nombre1=nombre1;
	this.nombre2=nombre2;
	this.apellidoPaterno=apellidoPaterno;
	this.apellidoMaterno=apellidoMaterno;
}
public String getNombre1() {
	return nombre1;
}
public void setNombre1(String nombre1) {
	this.nombre1 = nombre1;
}
public String getNombre2() {
	return nombre2;
}
public void setNombre2(String nombre2) {
	this.nombre2 = nombre2;
}
public String getApellidoPaterno() {
	return apellidoPaterno;
}
public void setApellidoPaterno(String apellidoPaterno) {
	this.apellidoPaterno = apellidoPaterno;
}
public String getApellidoMaterno() {
	return apellidoMaterno;
}
public void setApellidoMaterno(String apellidoMaterno) {
	this.apellidoMaterno = apellidoMaterno;
}
public void setVacio() {
	this.nombre1="";
	this.nombre2="";
	this.apellidoPaterno="";
	this.apellidoMaterno="";
}
public String toString() {
	return nombre1 + nombre2 + apellidoPaterno + apellidoMaterno;
}
public class ListaEnlazada {
	MClientes cabeza;
	int size;
	public ListaEnlazada() {
		cabeza = null;
		 size = 0;
	}
	
	
	public  Object obtener(int indice) {
		int contador =0;
		MClientes temporal = cabeza;
		while(contador<indice) 
		{
			temporal = temporal.obtenerSiguiente();
			contador++;
		}
		return temporal.toString();
	}

	public void addPrimero(String nombre1,String nombre2,String apellidoPaterno,String apellidoMaterno) {
		if(cabeza==null) {
			cabeza= new MClientes(nombre1,nombre2,apellidoPaterno,apellidoMaterno);
		}
		else {
			MClientes temp = cabeza;
			MClientes nuevo = new MClientes (nombre1,nombre2,apellidoPaterno,apellidoMaterno);
			enlazarSiguienteNodo(temp);
			cabeza = nuevo;
		}
		size++;
	}
	public void eliminarPrimero() {
		cabeza = cabeza.obtenerSiguiente();
		size--;
	}
	
	
	public int size() {
		return size;
	}
	public boolean estaVacia() {
		return (cabeza == null)?true:false;
	}
	public void enlazarSiguienteNodo(MClientes n) {
		siguiente = n;
	}

	

}
public MClientes obtenerSiguiente() {
	// TODO Auto-generated method stub
	return siguiente;
}
}
