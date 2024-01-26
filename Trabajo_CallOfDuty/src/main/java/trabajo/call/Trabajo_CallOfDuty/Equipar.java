package CallOfDuty.Trabajo_CallOfDuty.src.main.java.trabajo.call.Trabajo_CallOfDuty;

import java.util.Objects;

public class Equipar {
	private Principal principal;
	private Secundaria secundaria;
	private Accesorios accesorios;

	public Equipar(Principal principal, Secundaria secundaria, Accesorios accesorios) {
		super();
		this.principal = principal;
		this.secundaria = secundaria;
		this.accesorios = accesorios;
	}

	public Principal getPrincipal() {
		return principal;
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	public Secundaria getSecundaria() {
		return secundaria;
	}

	public void setSecundaria(Secundaria secundaria) {
		this.secundaria = secundaria;
	}

	public Accesorios getAccesorios() {
		return accesorios;
	}

	public void setAccesorios(Accesorios accesorios) {
		this.accesorios = accesorios;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accesorios, principal, secundaria);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipar other = (Equipar) obj;
		return Objects.equals(accesorios, other.accesorios) && Objects.equals(principal, other.principal)
				&& Objects.equals(secundaria, other.secundaria);
	}

	@Override
	public String toString() {
		return "Equipar [principal=" + principal + ", secundaria=" + secundaria + ", accesorios=" + accesorios + "]";
	}

}
