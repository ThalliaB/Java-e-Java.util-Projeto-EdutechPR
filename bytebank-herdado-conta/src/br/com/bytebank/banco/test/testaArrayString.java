package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class testaArrayString {

	
	public static void main(String[] args) {
		
		System.out.println("Funcionou!!!");
		
		for (var i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}

//O "Olá" aparece por causa que foi mechido nas configurações do arquivo.
