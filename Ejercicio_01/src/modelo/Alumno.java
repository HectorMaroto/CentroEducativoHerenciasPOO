package modelo;

public class Alumno extends Persona {
	private String curso;
	
	public Alumno() {
		
	}

	public Alumno(String nif, String nombre, String direccion, String telefono, String curso) {
		super(nif, nombre, direccion, telefono);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String hacerExamen() {
		return "El alumno "+this.getNombre()+" va a hacer su examen";
	}

	@Override
	public String toString() {
		return "Alumno "+super.toString()+" curso=" + curso; //Usamos super.toString para mostrar todos los valores comunes a la clase padre e hija
	}

	@Override
	public String trabajar() {
		// TODO Auto-generated method stub
		return "El alumno "+this.getNombre()+" va a estudiar para el curso "+this.curso;
	}
	
}
