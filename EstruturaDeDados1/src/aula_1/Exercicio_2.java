package aula_1;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x = 0, y = 0;
		
		System.out.print("Digite o valor de x: ");
		x = entrada.nextInt();
		
		System.out.print("Digite o valor de y: ");
		y = entrada.nextInt();
		
		System.out.println("Resultado: " + (x + y));

		entrada.close();
	}

}
