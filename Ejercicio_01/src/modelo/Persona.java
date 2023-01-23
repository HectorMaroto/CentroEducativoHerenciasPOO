package modelo;

public abstract class Persona {
	
	private String nif;
	private String nombre;
	private String direccion;
	private String telefono;
	
	public Persona() {
		//Constructor vacio por defecto
	}

	public Persona(String nif, String nombre, String direccion, String telefono) {
		this.nif = nif;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String llamar(Persona p) {
		return this.nombre+" está llamando a "+p.nombre;
	}
	
	public abstract String trabajar(); //Le ponemos al keyword abstract porque es un metodo que la clase Padre no va a utilizar, pero si sus clases hijas

	@Override
	public String toString() {
		return "[nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ "]";
	}
	
	
	
	

}
