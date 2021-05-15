package state;

public class MonjeVikingo {
	private EstadoMonje estado = new Normal(this);
	private int vida = 100;
	private int ataque = 10;
	public MonjeVikingo() {
		
	}
	public MonjeVikingo(int vida) {
		this.vida = vida;
	}
	public void recibirDa�o(int da�o) {
		estado.recibirDa�o(da�o);
	}
	public void atacar(MonjeVikingo other) {
		estado.atacar(other);
	}
	public void meditar() {
		estado.meditar();
	}
	public int getVida() {
		return vida;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setEstado(EstadoMonje estado) {
		this.estado = estado;
	}
	public boolean restarVida(int da�o) {
		return (vida -= da�o) > 0;
	}
	@Override
	public String toString() {
		return "MonjeVikingo [estado=" + estado + ", vida=" + vida + ", ataque=" + ataque + "]";
	}
	public EstadoMonje getEstado() {
		// TODO Auto-generated method stub
		return estado;
	}

}
