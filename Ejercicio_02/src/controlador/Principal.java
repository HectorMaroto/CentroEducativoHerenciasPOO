package controlador;

import modelo.Autor;
import modelo.Libro;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creamos los objetos Autor y Libro y les damos valores
		
		Autor a1=new Autor("Javier Gómez Peña","Nació en 1970, de origen español, y llegó a escribir más de 30 novelas de misterio");
		
		Libro l1=new Libro("La niebla","Misterio",a1);
		
		//Ejecutamos el metodo toString de l1
		
		System.out.println(l1.toString());
		
		//Modificamos la biografia del autor a través del objeto Libro
		
		l1.getAutor().setBiografia("Nació en 1961, de origen chileno, y llegó a escribir más de 50 novelas de misterio");
		
		//Comprobamos el cambio
		
		System.out.println(l1.toString());
		
		//Invocamos el metodo toString de Autor a través del objeto Libro
		
		System.out.println(l1.getAutor().toString());
		
		//Invocamos el método toString directamente desde el objeto Autor
		
		System.out.println(a1.toString());
		
		//Modificamos el valor del atributo genero
		
		l1.setGenero("Aventuras");
		
		//Comprobamos el cambio
		
		System.out.println(l1.toString());
		
		
		
		
		
		
		

	}

}
