package testState;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import state.*;

class MonjeVikingoTests {
	EstadoMonje calmado = new Calmado(new MonjeVikingo());
	EstadoMonje normal = new Normal(new MonjeVikingo());
	EstadoMonje muerto = new Muerto(new MonjeVikingo());
	EstadoMonje berserker = new Berserker(new MonjeVikingo());
	EstadoMonje colerico = new Colerico(new MonjeVikingo());

	
	@Test
	void testNoRecibeDañoEstadoCalmado() {
		MonjeVikingo v1 = new MonjeVikingo();
		MonjeVikingo v2 = new MonjeVikingo();
		v1.meditar();
		assertEquals(calmado, v1.getEstado());
		v2.atacar(v1);
		assertEquals(100, v1.getVida());
	}
	
	@Test
	void testDismunucionDañoBerserker() {
		MonjeVikingo v1 = new MonjeVikingo();
		MonjeVikingo v2 = new MonjeVikingo();
		v1.atacar(v2);
		assertEquals(colerico, v2.getEstado());
		
		v2.atacar(v1);
		assertEquals(colerico, v1.getEstado());
		
		v1.atacar(v2);
		assertEquals(berserker, v2.getEstado());
		
		v2.atacar(v1);
		assertEquals(berserker, v1.getEstado());
		
		v1.atacar(v2);
		assertEquals(35, v2.getVida());
		
		v2.atacar(v1);
		assertEquals(5, v1.getVida());
	}
	
	@Test
	void testCalmadoANormal() {
		MonjeVikingo v1 = new MonjeVikingo();
		MonjeVikingo v2 = new MonjeVikingo();
		v1.meditar();
		assertEquals(calmado, v1.getEstado());
		v1.atacar(v2);
		assertEquals(normal, v1.getEstado());
	}
	@Test
	void testMuerto() {
		MonjeVikingo v1 = new MonjeVikingo();
		MonjeVikingo v2 = new MonjeVikingo(10);
		v1.meditar();
		assertEquals(calmado, v1.getEstado());
		v1.atacar(v2);
		assertEquals(muerto, v2.getEstado());
	}
	
	
}
