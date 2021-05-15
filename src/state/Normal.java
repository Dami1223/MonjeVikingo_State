package state;

public class Normal extends EstadoMonje {

	public Normal(MonjeVikingo monjeVikingo) {
		super(monjeVikingo);
	}

	@Override
	public void atacar(MonjeVikingo otro) {
		otro.recibirDaño(monje.getAtaque());
	}

	@Override
	public void recibirDaño(int daño) {
		if(monje.restarVida(daño))
			monje.setEstado(new Colerico(monje));
		else
			monje.setEstado(new Muerto(monje));
		
	}

	@Override
	public void meditar() {
		monje.setEstado(new Calmado(monje));
		
	}

}
