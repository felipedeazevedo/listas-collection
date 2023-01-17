package com.felipe.listas;

import java.util.ArrayList;
import java.util.List;

public class Exemplo1 {
	
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		
		nomes.add("José");
		nomes.add("Maria");
		nomes.add("João");
		
//		for (int i = 0; i < nomes.size(); i++) {
//			System.out.println("Nome: " + nomes.get(i));
//		}
		
//		for (String nome : nomes) {
//			System.out.println("Nome: " + nome);
//		}
		
//		nomes.forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//		});
		
		nomes.forEach(System.out::println);
	}

}
