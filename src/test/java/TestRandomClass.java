import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import examenPrueba.ClaseRandom;

public class TestRandomClass {

	ClaseRandom claseRandom=new ClaseRandom();
	
	@Test
	public void test_ok() throws Exception {
		int numero=5;
		String exception="sfdnv";
		int resultado=653;
		assertEquals(resultado,claseRandom.method(numero, exception));
	}
}
