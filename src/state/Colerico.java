package state;

public class Colerico extends EstadoMonje {

	public Colerico(MonjeVikingo monje) {
		super(monje);
	}

	@Override
	public void atacar(MonjeVikingo otro) {
		otro.recibirDaño(monje.getAtaque() * 2);
	}

	@Override
	public void recibirDaño(int daño) {
		if(monje.restarVida(daño * 2)) 
			monje.setEstado(new Berserker(monje));
		else
			monje.setEstado(new Muerto(monje));
	}

	@Override
	public void meditar() {
		monje.setEstado(new Normal(monje));
	}

}
