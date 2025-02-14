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
		
		int resposta = maiorNum(x, y, z);
		
		if(resposta == -1) {
			System.out.println("São iguais!");
		} else {
			System.out.println(resposta + " é o maior num!");
		}
		
		entrada.close();
	}
	
	public static int maiorNum(int x, int y, int z) {
		if(x > y && x > z) {
			return x;
		} else if(y > x && y > z) {
			return y;
		} else if(z > x && z > y) {
			return z;
		} else {
			return -1;
		}
	}
}
