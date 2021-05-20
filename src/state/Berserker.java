package state;

public class Berserker extends EstadoMonje {

	public Berserker(MonjeVikingo monje) {
		super(monje);
	}

	@Override
	public void atacar(MonjeVikingo otro) {
		otro.recibirDaño(monje.getAtaque() * 3);
	}

	@Override
	public void recibirDaño(int daño) {
		if (!monje.restarVida(daño / 2))
			monje.setEstado(new Muerto(monje));
	}

	@Override
	public void meditar() {
		monje.setEstado(new Normal(monje));

	}

}
