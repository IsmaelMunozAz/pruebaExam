import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import examenPrueba.ClaseRandom;

public class TestRandomClass {

	ClaseRandom claseRandom=new ClaseRandom();
	
	@Test
	public void test_ok() throws Exception {
		int numero=5;
		String exception="sfdnvrfg";
		int resultado=-666;
		assertEquals(resultado,claseRandom.method(numero, exception));
	}
	@Test
	public void test_fail_Exception() throws Exception {
		int numero=5;
		String exception="exception";
		Exception excepcion=assertThrows(Exception.class, ()->claseRandom.method(numero, exception));
		assertEquals(null, excepcion.getMessage());
	}
	@Test
	public void test_fail_valorMax()throws Exception {
		int numero=513681453;
		String exception="sdfingrdoinf";
		Exception ex=assertThrows(Exception.class,()->claseRandom.method(numero, exception));
		assertEquals(null, ex.getMessage());
	}
	
	@Test
	public void test_fail_negative() throws Exception {
		int numero=5;
		String exception="negative";
		assertEquals(0,claseRandom.method(numero, exception));
	}
}
		
		
		
		