import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import examenPrueba.ClaseRandom;

public class TestMethod2 {
	ClaseRandom claseRandom=new ClaseRandom();
	@Test
	public void test_ok() throws Exception {
		int valor=5;
		int resultado=25;
		assertEquals(resultado, claseRandom.methodd2(valor));
	}
	@Test
	public void test_fail_equal() throws Exception {
		int valor=2;
		int resultado=25;
		assertEquals(resultado, claseRandom.methodd2(valor));
	}
}
