package aula_1;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x = 0, y = 0, z = 0;
		
		System.out.print("Digite o valor de x: ");
		x = entrada.nextInt();
		
		System.out.print("Digite o valor de y: ");
		y = entrada.nextInt();
		
		System.out.print("Digite o valor de z: ");
		z = entrada.nextInt();
		
		if(x > y && x > z) {
			System.out.println(x + " é o maior num!");
		} else if(y > x && y > z) {
			System.out.println(y + " é o maior num!");
		} else if(z > x && z > y) {
			System.out.println(z + " é o maior num!");
		} else {
			System.out.println("São iguais!");
		}
		
		entrada.close();
	}
}
