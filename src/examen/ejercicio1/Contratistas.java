package examen.ejercicio1;

public class Contratistas extends Empresa {

	protected int numsoci;
	protected String nomsoci;

	public Contratistas(String tipo, String nombre, String apellidos, String fechacont, int cuenta) {
		super(tipo, nombre, apellidos, fechacont, cuenta);

	}

	public Contratistas(String tipo, String nombre, String apellidos, String fechacont, int cuenta, int numsoci,String nomsoci) {
		super(tipo, nombre, apellidos, fechacont, cuenta);

		this.numsoci = numsoci;
		this.nomsoci = nomsoci;
	}
	
	@Override
	public String toString() {
		return "Contratistas [numsoci=" + numsoci + ", nomsoci=" + nomsoci + "]";
	}

	public void Ingresar() {

	}

}
