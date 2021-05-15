package state;

public class Muerto extends EstadoMonje {

	public Muerto(MonjeVikingo monje) {
		super(monje);
	}

	@Override
	public void atacar(MonjeVikingo otro) {
		System.out.println("Muerto no ataca");
	}

	@Override
	public void recibirDa�o(int da�o) {
		System.out.println("Esta muerto no recibe da�o");

	}

	@Override
	public void meditar() {
		System.out.println("Llegaste tarde para meditar");
	}

}
