package trabajo.call.Trabajo_CallOfDuty;

import java.util.Objects;

public class Principal extends Armas {
	
	private static final int PESO_OCUPACION = 3;
	
	private String recarga;
	private AccesorioPrincipal[] accesoriosArma;

	public Principal(String nombre, String tipo, int daño) {
		super(nombre, tipo, daño);
	}

	public String getRecarga() {
		return recarga;
	}

	public void setRecarga(String recarga) {
		this.recarga = recarga;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(recarga);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Principal other = (Principal) obj;
		return Objects.equals(recarga, other.recarga);
	}

	@Override
	public String toString() {
		return "Principal [recarga=" + recarga + "]";
	}
	
	
	

}
