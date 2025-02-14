package aula_1;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x = 0;
		
		System.out.println("Digite o valor de x: ");
		x = entrada.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(x + " x " + i + " = " + (x * i));
		}
		
		entrada.close();
	}
}
