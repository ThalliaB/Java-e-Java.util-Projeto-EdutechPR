package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {
		
		ArrayList lista = new ArrayList();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		System.out.println("Tamanho: " + lista.size());
		
		Conta ref = (Conta) lista.get(0);
		
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho: " + lista.size());
	
		//este e o de baixo s�o iguais
//		for(int i = 0; i < lista.size(); i++) {
//            Object oRef = lista.get(i);
//            System.out.println(oRef);
//        }

        for(Object o : lista) {
            System.out.println(o);
        }
		
	}
	
}