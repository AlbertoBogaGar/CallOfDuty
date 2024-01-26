package CallOfDuty.Trabajo_CallOfDuty.src.main.java.trabajo.call.Trabajo_CallOfDuty;

import java.util.Objects;

public class Secundaria extends Armas {
	
	private static final int PESO_OCUPACION = 2;
	
	private int tamñoHoja;

	public Secundaria(String nombre, String tipo, int daño) {
		super(nombre, tipo, daño);
		
	}

	public int getTamñoHoja() {
		return tamñoHoja;
	}

	public void setTamñoHoja(int tamñoHoja) {
		this.tamñoHoja = tamñoHoja;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(tamñoHoja);
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
		Secundaria other = (Secundaria) obj;
		return tamñoHoja == other.tamñoHoja;
	}

	@Override
	public String toString() {
		return "Secundaria [tamñoHoja=" + tamñoHoja + "]";
	}
	
	

}
