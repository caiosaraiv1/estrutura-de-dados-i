package lab1a;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int v1 = 0, v2 = 0;
		
		System.out.print("Digite o valor 1: ");
		v1 = entrada.nextInt();
		
		System.out.println();
		
		System.out.print("Digite o valor 2: ");
		v2 = entrada.nextInt();
		
		System.out.println("Antes V1: " + v1 + " V2: " + v2);
		
		int temp = v1;
		v1 = v2;
		v2 = temp;
		
		System.out.println("Depois V1: " + v1 + " V2: " + v2);

		entrada.close();
	}
	

}
