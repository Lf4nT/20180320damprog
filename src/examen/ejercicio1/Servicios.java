package examen.ejercicio1;

public class Servicios extends Empresa {

	public Servicios(String tipo, String nombre, String apellidos, String fechacont, int cuenta) {
		super(tipo, nombre, apellidos, fechacont, cuenta);

	}

	@Override
	public String toString() {
		return "Servicios [tipo=" + tipo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechacont="
				+ fechacont + ", cuenta=" + cuenta + "]";
	}

	public void Ingresar() {

	}

}
