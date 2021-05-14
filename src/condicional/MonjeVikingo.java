package condicional;

public class MonjeVikingo {
	private static final int ATAQUE_BASICO = 10;
	private String estado;
	private int vida;

	public MonjeVikingo() {
		this.estado = "normal";
		this.setVida(100);
	}

	public void atacar(MonjeVikingo otro) {
		if (this.estado == "calmado") {
			otro.recibirAtaque(0);
		} else if (this.estado == "normal") {
			otro.recibirAtaque(ATAQUE_BASICO);
		} else if (this.estado == "colerico") {
			otro.recibirAtaque(ATAQUE_BASICO * 2);
		} else if (this.estado == "Berserker") {
			otro.recibirAtaque(ATAQUE_BASICO * 3);
		}
	}

	public void meditar() {
		if (this.estado == "calmado") {
			this.estado = "calmado";
		} else if (this.estado == "normal") {
			this.estado = "calmado";
		} else if (this.estado == "colerico") {
			this.estado = "normal";
		} else if (this.estado == "Berserker") {
			this.estado = "normal";
		}
	}

	public void recibirAtaque(int ataque) {
		if (this.estado == "calmado") {
			this.estado = "normal";
		} else if (this.estado == "normal") {
			this.estado = "colerico";
			this.setVida(this.getVida() - ataque);
		} else if (this.estado == "colerico") {
			this.estado = "Berserker";
			this.setVida(this.getVida() - ataque * 2);
		} else if (this.estado == "Berserker") {
			this.estado = "Berserker";
			this.setVida(this.getVida() - ataque / 2);
		}
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public String getEstado() {
		return estado;
	}

}
