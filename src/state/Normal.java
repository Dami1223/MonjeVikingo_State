package state;

public class Normal extends EstadoMonje {

	public Normal(MonjeVikingo monjeVikingo) {
		super(monjeVikingo);
	}

	@Override
	public void atacar(MonjeVikingo otro) {
		otro.recibirDa�o(monje.getAtaque());
	}

	@Override
	public void recibirDa�o(int da�o) {
		if(monje.restarVida(da�o))
			monje.setEstado(new Colerico(monje));
		else
			monje.setEstado(new Muerto(monje));
		
	}

	@Override
	public void meditar() {
		monje.setEstado(new Calmado(monje));
		
	}

}
