package CallOfDuty.Trabajo_CallOfDuty.src.main.java.trabajo.call.Trabajo_CallOfDuty;

import java.util.Objects;

public class Armas {
	
	private String nombre;
	private String tipo; //fusil subfusil 
	private int daño;
	public Armas(String nombre, String tipo, int daño) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.daño = daño;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getDaño() {
		return daño;
	}
	public void setDaño(int daño) {
		this.daño = daño;
	}
	@Override
	public int hashCode() {
		return Objects.hash(daño, nombre, tipo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Armas other = (Armas) obj;
		return daño == other.daño && Objects.equals(nombre, other.nombre) && Objects.equals(tipo, other.tipo);
	}
	@Override
	public String toString() {
		return "Armas [nombre=" + nombre + ", tipo=" + tipo + ", daño=" + daño + "]";
	}
	
	
	
	

}
