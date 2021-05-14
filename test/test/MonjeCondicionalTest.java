package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import condicional.MonjeVikingo;

class MonjeCondicionalTest {

	@Test
	void test() {
		MonjeVikingo vikingo1 = new MonjeVikingo();
		MonjeVikingo vikingo2 = new MonjeVikingo();
		vikingo1.atacar(vikingo2);
		assertEquals(90,vikingo2.getVida());
		assertEquals("colerico",vikingo2.getEstado());
		assertEquals(100,vikingo1.getVida());
		assertEquals("normal",vikingo1.getEstado());
	}

}
