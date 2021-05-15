package state;

public class Calmado extends EstadoMonje {

	public Calmado(MonjeVikingo monje) {
		super(monje);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atacar(MonjeVikingo otro) {
		otro.recibirDa�o(monje.getAtaque());
		monje.setEstado(new Normal(monje));
	}

	@Override
	public void recibirDa�o(int da�o) {
		System.out.println("No recibo da�o porque estoy modo zen");

	}

	@Override
	public void meditar() {
		System.out.println("Me quedo calmado");

	}

}
