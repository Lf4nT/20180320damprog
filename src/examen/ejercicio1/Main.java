package examen.ejercicio1;

import examen.ejercicio1.Empresa;
import examen.ejercicio1.Contratistas;
import examen.ejercicio1.Servicios;

public class Main {

	public static void main(String[] args) {
		Contratistas Contratistas1 = new Contratistas(" Contratista ", " Julian ", " Martínez López ", " 17/02/2009 ",
				163456305, 3, " Retraso S.A.");
		System.out.println("Iniciando transaccion al usuario: " + Contratistas1.tipo + Contratistas1.nombre
				+ Contratistas1.apellidos + "Por las acciones de la empresa: " + Contratistas1.nomsoci
				+ " Transaccion a numero de cuenta: " + Contratistas1.cuenta);
		Empresa c = Contratistas1;
		((Contratistas) c).Ingresar();

		Servicios Servicios1 = new Servicios(" Catering ", " Manolo ", " Ricardo Del Rio ", " 16/02/2001 ", 156236337);
		System.out.println("Iniciando transaccion al usuario: " + Servicios1.nombre + Servicios1.apellidos
				+ " Por el cumplimiento de los servicios de: " + Servicios1.tipo + " Transaccion a numero de cuenta: "
				+ Servicios1.cuenta);
		Empresa s = Servicios1;
		((Servicios) s).Ingresar();
	}
}
