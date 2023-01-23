package modelo;

public class Libro {
	
	private String titulo;
	private String genero;
	private Autor autor;
	
	public Libro() {
		//Constructor vacio por defecto
	}

	public Libro(String titulo, String genero, Autor autor) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", genero=" + genero + ", autor=" + autor + "]";
	}
	
	
	
	

}
