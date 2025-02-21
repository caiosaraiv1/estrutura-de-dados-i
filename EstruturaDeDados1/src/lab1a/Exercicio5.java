package lab1a;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int x = 0, y = 0;
		
		System.out.print("Digite o valor de x: ");
		x = entrada.nextInt();
		
		System.out.print("Digite o valor de y: ");
		y = entrada.nextInt();
		
		int menor = min(x, y);
		int maior = max(x, y);
		
		System.out.println("Maior -> " + maior);
		System.out.println("Menor -> " + menor);

		entrada.close();	
	}
	
	public static int min(int x, int y) {
		if(x > y) {
			return y;
		}
		return x;
	}
	
	public static int max(int x, int y) {
		if(x > y) {
			return x;
		}
		return y;
	}

}
