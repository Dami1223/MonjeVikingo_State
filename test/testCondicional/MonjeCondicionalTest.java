package testCondicional;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import condicional.MonjeVikingo;

class MonjeCondicionalTest {

	@Test
	void testUnAtaque() {
		MonjeVikingo vikingo1 = new MonjeVikingo();
		MonjeVikingo vikingo2 = new MonjeVikingo();
		vikingo1.atacar(vikingo2);
		assertEquals(90,vikingo2.getVida());
		assertEquals("colerico",vikingo2.getEstado());
		assertEquals(100,vikingo1.getVida());
		assertEquals("normal",vikingo1.getEstado());
	}
	
	@Test
	void testTodosLosEstadosAtacando() {
		MonjeVikingo vikingo1 = new MonjeVikingo();
		MonjeVikingo vikingo2 = new MonjeVikingo();
		vikingo2.meditar();
		assertEquals("calmado",vikingo2.getEstado());
		vikingo1.atacar(vikingo2);
		assertEquals("calmado",vikingo2.getEstado());
		vikingo2.atacar(vikingo1);
		assertEquals("normal",vikingo2.getEstado());
		vikingo1.atacar(vikingo2);
		assertEquals("colerico",vikingo2.getEstado());
		vikingo1.atacar(vikingo2);
		assertEquals("Berserker",vikingo2.getEstado());
		vikingo1.atacar(vikingo2);
		vikingo1.atacar(vikingo2);
		vikingo1.atacar(vikingo2);
		vikingo1.atacar(vikingo2);
		assertEquals("muerto",vikingo2.getEstado());
		vikingo1.atacar(vikingo2);
		vikingo1.atacar(vikingo2);
		assertEquals("muerto",vikingo2.getEstado());
		assertEquals(0,vikingo2.getVida());
	}
	
	@Test
	void testTodosLosEstadosMeditando() {
		MonjeVikingo vikingo1 = new MonjeVikingo();
		MonjeVikingo vikingo2 = new MonjeVikingo();
		vikingo2.meditar();
		assertEquals("calmado",vikingo2.getEstado());
		vikingo1.atacar(vikingo2);
		assertEquals("calmado",vikingo2.getEstado());
		vikingo2.atacar(vikingo1);
		assertEquals("normal",vikingo2.getEstado());
		vikingo1.atacar(vikingo2);
		assertEquals("colerico",vikingo2.getEstado());
		vikingo2.meditar();
		assertEquals("normal",vikingo2.getEstado());
		vikingo1.atacar(vikingo2);
		vikingo1.atacar(vikingo2);
		assertEquals("Berserker",vikingo2.getEstado());
		vikingo2.meditar();
		assertEquals("normal",vikingo2.getEstado());
		vikingo2.meditar();
		assertEquals("calmado",vikingo2.getEstado());
		vikingo2.meditar();
		assertEquals("calmado",vikingo2.getEstado());
	}
}
