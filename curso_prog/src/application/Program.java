package application;

import java.util.Locale;
import java.util.Scanner;

import enti.Pessoa;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		 Pessoa[] vect = new Pessoa[n];
		 
		
		
		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.printf("dados da %da pessoa:\n", i + 1);
			System.out.print("nome: ");
			String nome = sc.nextLine();
			System.out.print("idade: ");
			int idade = sc.nextInt();
			System.out.print("altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Pessoa(nome, idade, altura);
		}
		
		double sum = 0.0;
		for (int i=0; i<n; i++) {
			sum += vect[i].getAltura();
		}
		
		double avg = sum / n;
		System.out.printf(" a media é = %.2f%n", avg);
		
		int cont =0;
		 for (int i=0; i<n; i++) {
		        if (vect[i].getIdade() < 16) {
		        	cont = cont + 1;}
		        }
		
		    double porcent = cont * 100.0 / n;
		    
		    
		    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n",porcent);
				
		
		
		sc.close();
	}

	}
