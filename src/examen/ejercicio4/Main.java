package examen.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String cadena;
		int posicion = 0;
		int apariciones = 0;
		System.out.println("Introduzca la cadena en la que buscar");
		cadena = s.nextLine();
		System.out.println();
		for (int i = 0; i < cadena.length(); i++) {
			if(!cadena.equals(""))
				System.out.println(cadena.charAt(i) + " = [" + i + "]");
			
		}
	}
}
