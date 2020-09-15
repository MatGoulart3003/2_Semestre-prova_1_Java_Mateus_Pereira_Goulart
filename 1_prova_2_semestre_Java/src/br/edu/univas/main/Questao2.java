package br.edu.univas.main;

import java.util.Scanner;

public class Questao2 {
		
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		
		String palavra = read.nextLine();
		
		int tamanho = palavra.length();
		String novaPal = "";
		char leLetra;
		
		for (int i = tamanho; i > 0 ; i--) {
			
			leLetra = palavra.charAt(i-1);
			System.out.println(leLetra);
			novaPal = novaPal + leLetra;
			
		}
		
		System.out.println(novaPal);
		
		read.close();
	}
	
}
