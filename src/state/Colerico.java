package state;

public class Colerico extends EstadoMonje {

	public Colerico(MonjeVikingo monje) {
		super(monje);
	}

	@Override
	public void atacar(MonjeVikingo otro) {
		otro.recibirDa�o(monje.getAtaque() * 2);
	}

	@Override
	public void recibirDa�o(int da�o) {
		if(monje.restarVida(da�o * 2)) 
			monje.setEstado(new Berserker(monje));
		else
			monje.setEstado(new Muerto(monje));
	}

	@Override
	public void meditar() {
		monje.setEstado(new Normal(monje));
	}

}
