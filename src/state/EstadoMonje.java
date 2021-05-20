package state;

public abstract class EstadoMonje {
	MonjeVikingo monje;

	public EstadoMonje(MonjeVikingo monje) {
		this.monje = monje;
	}

	public EstadoMonje() {
	}

	public abstract void atacar(MonjeVikingo otro);

	public abstract void recibirDaño(int daño);

	public abstract void meditar();

	@Override
	public String toString() {
		return this.getClass().toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((monje == null) ? 0 : monje.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// Este equals solo se usa para unit test
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

}
