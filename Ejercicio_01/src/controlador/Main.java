package controlador;

import modelo.Persona;
import modelo.Profesor;
import modelo.Alumno;
import modelo.Administrativo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creamos 1 objeto de cada clase hija y ejecutamos los métodos toString y trabajar
		
		Profesor pr1= new Profesor("09081237V","Pepe García López","C/ Los Naranjos, 8","678167092","Matemáticas y Física");
		System.out.println(pr1.toString());
		System.out.println(pr1.trabajar());
		System.out.println("");//Salto de linea (por estetica en la consola)
		
		Alumno al1=new Alumno("16729018P","Ramón Gutiérrez Soria","C/ Los Perales, 18","658902167","4º ESO");
		System.out.println(al1.toString());
		System.out.println(al1.trabajar());
		System.out.println("");
		
		Administrativo ad1= new Administrativo("69912465S","Julia Requena Pérez","C/ Los Manzanos, 10","624001898","expedir títulos");
		System.out.println(ad1.toString());
		System.out.println(ad1.trabajar());
		System.out.println("");
		
		//Vamos a hacer que el alumno llame al profesor mediante el metodo llamar()
		
		System.out.println(al1.llamar(pr1));
		System.out.println("");
		
		//Ahora vamos a ejecutar los métodos propios de cada objeto:
		
		System.out.println(pr1.ponerNotas());
		System.out.println(al1.hacerExamen());
		System.out.println(ad1.gestionarMatricula());
	}

}
