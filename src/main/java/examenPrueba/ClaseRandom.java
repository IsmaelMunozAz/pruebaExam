package examenPrueba;

import java.util.Random;

public class ClaseRandom {

	public int numero;
	public int valorRandom;
	public String exception;
	
	public ClaseRandom() {
		// TODO Auto-generated constructor stub
	}
	
	public ClaseRandom(int numero, int valorRandom, String exception) {
		this.numero=numero;
		this.valorRandom=valorRandom;
		this.exception=exception;
	}
	
	public int method(int valorRandom,String exception) throws Exception {
		if(exception.equals("exception")) 
			throw new Exception();
		valorRandom=(int) (valorRandom*Math.random()*8);
		if(valorRandom>= 60000) {
			throw new Exception();
		}
		if(valorRandom<0) {
			return 0;
		}
		return valorRandom-666;
	}
}
