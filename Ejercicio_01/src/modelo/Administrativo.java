package modelo;

import java.util.ArrayList;

public class Administrativo extends Persona {
	
	private String tareas;
	
	public Administrativo() {
		
	}
	
	public Administrativo(String nif, String nombre, String direccion, String telefono, String tareas) {
		super(nif, nombre, direccion, telefono);
		this.tareas = tareas;
	}

	public String getTareas() {
		return tareas;
	}

	public void setTareas(String tareas) {
		this.tareas = tareas;
	}
	
	public String gestionarMatricula() {
		return "El administrativo "+this.getNombre()+" va a gestionar una matrícula";
	}

	@Override
	public String toString() {
		return "Administrativo "+super.toString()+" tareas=" + tareas;
	}

	@Override
	public String trabajar() {
		// TODO Auto-generated method stub
		return "El administrativo "+this.getNombre()+" va a realizar estas tareas: "+this.tareas;
	}
	
	

}
