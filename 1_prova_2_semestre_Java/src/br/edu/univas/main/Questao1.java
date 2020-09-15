package br.edu.univas.main;

import java.util.Scanner;

public class Questao1 {
		
	static int quantAlunos = 10;
	static Scanner read = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		int nota[] = new int [quantAlunos];
		int nota2[] =  new int [quantAlunos * 2];
		System.out.println("Digite as 10 notas dos alunos: ");
		leNotas(nota);
		verificaAprovado(nota,nota2);
		mostraResult (nota2);
		
		
		read.close();
	}
	
	public static void leNotas (int nota []) {
		
		for (int i = 0; i < quantAlunos; i++) {
			
			nota[i] = read.nextInt();
			
		}
		
	}

	public static void verificaAprovado (int nota[], int nota2[]) {
		
		int cont = 1;
		
		for (int i = 0; i < quantAlunos * 2; i++) {
			
			if (i==0) {
				
			nota2 [i] = nota[i];
				
				if (nota[i] >= 60) {
					
					nota2[++i] = 1;
					
				}else {
					
					nota2[++i] = 0;
					
				}
		

			}else {
				
				nota2 [i] = nota[i-cont];
				cont++;
			}
			
						
		}
		
		
	}
	
	public static void mostraResult (int [] nota2) {
		
		for (int i = 0; i > quantAlunos * 2; i++) {
			
			System.out.println(nota2[i]);
			
		}
		
	}

}
