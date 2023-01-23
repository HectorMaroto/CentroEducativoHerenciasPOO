package modelo;

public class Profesor extends Persona { //Con extends Persona, hacemos que la clase hija Profesor pueda hacer uso de los metodos de la clase padre (Persona) 
	
	private String competencias;
	
	public Profesor() {
		//Constructor vacio por defecto
	}

	public Profesor(String nif, String nombre, String direccion, String telefono,String competencias) {
		super(nif, nombre, direccion, telefono); //Con super(), se heredan los atributos de la clase padre
		this.competencias = competencias;
	}

	public String getCompetencias() {
		return competencias;
	}

	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}
	
	public String ponerNotas() {
		return "El profesor "+this.getNombre()+" va a corregir los examenes";
	}

	@Override
	public String toString() {
		return "Profesor"+ super.toString()+" competencias=" + competencias;
	}

	@Override
	public String trabajar() {
		// TODO Auto-generated method stub
		return "El Profesor "+ this.getNombre()+" va a impartir su clase";
	}
	
	
	
	

}
