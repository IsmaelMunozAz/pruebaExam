package examenPrueba;

import java.util.Random;

public class ClaseRandom {
	public ClaseRandom() {
		// TODO Auto-generated constructor stub
	}
	
	public int method(int valorRandom,String exception) throws Exception {
		if(exception.equals("exception")) 
			throw new Exception();
		valorRandom=(int) (valorRandom*Math.random()*8);
		if(valorRandom>= 60000) {
			throw new Exception();
		}
		if (exception.equals("negative"))
			valorRandom=-valorRandom;
		if(valorRandom<0) {
			return 0;
		}
		return -666;
	}
	public int methodd2(int valor)throws Exception {
		int a=valor*valor;
		int b=valor+valor;
		if(a>b*2) {
			return a;
		}else if(a<b*2) {
			return b;
		}else if(a==b*2) {
			throw new Exception();
		}
		return 0;
	}
}
