package aula_1;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x = 0;
		
		System.out.print("Digite um número: ");
		x = entrada.nextInt();
		
		if(x % 2 == 0) {
			System.out.println(x + " é par!");
		} else {
			System.out.println(x + " é ímpar!");
		}

		entrada.close();
	}

}
