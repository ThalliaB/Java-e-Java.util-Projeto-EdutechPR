package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class testaArrayReferencias {

	
	public static void main(String[] args) {
		
		Object[] referencias = new Conta[5];
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencias[0] = cc1;//atribuindo cc1 à posição do array
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 22);
		referencias[1] = cc2;
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1];//type cast
		//System.out.println(cc1.getNumero());
		//System.out.println(referencias[1].getNumero());
		
	}
}
