package br.edu.univas.main;

import java.util.Scanner;

public class Questao3 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		String palavra = read.nextLine();
		int tamanho = palavra.length();
		String novaPal = "";
		char leLetra = ' ';
		
		novaPal = invertePalavra(tamanho,leLetra,novaPal,palavra);
		
		
		
		read.close();
	}

	public static String invertePalavra (int tamanho, char leLetra, String novaPal, String palavra) {
		
		for (int i = tamanho; i > 0 ; i--) {
			
			leLetra = palavra.charAt(i-1);
			
			novaPal = novaPal + leLetra;
			
		}
		
		return novaPal;
	}

	public static boolean verificaPalin (String novaPal, String palavra) {
		
		if (novaPal == palavra) {
			
			return true;
			
		}else {
			
			return false;
			
		}
		
	}

}
