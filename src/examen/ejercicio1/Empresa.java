package examen.ejercicio1;

public class Empresa {
	protected String tipo;
	protected String nombre;
	protected String apellidos;
	protected String fechacont;
	public int cuenta;

	public Empresa(String tipo, String nombre, String apellidos, String fechacont, int cuenta) {
		this.tipo = tipo;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechacont = fechacont;
		this.cuenta = cuenta;
	}

	public String getTipo() {
		return tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getFechacont() {
		return fechacont;
	}

	public int getCuenta() {
		return cuenta;
	}

	@Override
	public String toString() {
		return "Ejer1 [tipo=" + tipo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechacont=" + fechacont
				+ ", cuenta=" + cuenta + "]";
	}

}
