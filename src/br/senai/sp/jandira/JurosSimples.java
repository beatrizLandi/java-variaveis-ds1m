package br.senai.sp.jandira;

import java.util.Scanner;

public class JurosSimples {

	public static void main(String[] args) {
	

		double juros, capital, taxa, tempo;
		
		Scanner leitor;
		
		leitor = new Scanner(System.in);
		
		System.out.print("Qual a capital?: ");
		capital= leitor.nextDouble();
		
		System.out.print("Qual a taxa de juros?" );
		taxa = leitor.nextDouble();
		
		System.out.print("Qual o tempo? ");
		tempo = leitor.nextDouble();
		
		juros = capital * taxa/100 * tempo;// J=j.i.t
		
		System.out.println("o valor de seu juros é:) " +juros);
		
		System.out.printf("Voce possui agora %s", juros + capital);
		
		
	
	}

}



