package CallOfDuty.Trabajo_CallOfDuty.src.main.java.trabajo.call.Trabajo_CallOfDuty;

import java.util.Objects;


public class Accesorios {
	private String utilidad;
	private boolean daño;

	
	public Accesorios(String utilidad, boolean daño) {
		super();
		this.utilidad = utilidad;
		this.daño = daño;
	}

	public String getUtilidad() {
		return utilidad;
	}

	public void setUtilidad(String utilidad) {
		this.utilidad = utilidad;
	}

	public boolean isDaño() {
		return daño;
	}

	public void setDaño(boolean daño) {
		this.daño = daño;
	}

	@Override
	public int hashCode() {
		return Objects.hash(daño, utilidad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Accesorios other = (Accesorios) obj;
		return daño == other.daño && Objects.equals(utilidad, other.utilidad);
	}

	@Override
	public String toString() {
		return "Accesorios [utilidad=" + utilidad + ", daño=" + daño + "]";
	}
}
