package lab1a;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		char caracter;
		char[] vogal = {'a', 'e', 'i', 'o', 'u'};
		boolean isVogal = false;
		
		System.out.print("Digite um caracter: ");
		caracter = entrada.next().charAt(0);
		
		for(int i = 0; i < 5; i++) {
			if (caracter == vogal[i]) {
				isVogal = true;
				break;
			} 
		}
		
		if(isVogal) {
			System.out.println(caracter + " é um vogal");
		} else {
			System.out.println(caracter + " é uma consoante");
		}
		
		entrada.close();
	}
}
