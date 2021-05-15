package state;

public class Calmado extends EstadoMonje {

	public Calmado(MonjeVikingo monje) {
		super(monje);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atacar(MonjeVikingo otro) {
		otro.recibirDaño(monje.getAtaque());
		monje.setEstado(new Normal(monje));
	}

	@Override
	public void recibirDaño(int daño) {
		System.out.println("No recibo daño porque estoy modo zen");

	}

	@Override
	public void meditar() {
		System.out.println("Me quedo calmado");

	}

}
