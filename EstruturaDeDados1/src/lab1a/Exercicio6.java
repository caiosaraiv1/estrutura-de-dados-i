package lab1a;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double x = 0;
		int y = 0;
		
		System.out.print("Digite o valor de x: ");
		x = entrada.nextDouble();
		
		System.out.print("Digite o valor de y: ");
		y = entrada.nextInt();
		
		double resposta = mulComAdicao(x, y);
		
		System.out.println(resposta);

		entrada.close();
	}
	
	public static double mulComAdicao(double x, int y) {
		double sum = 0;
		for(int i = 0; i < y; i++) {
			sum += x;
		}
		return sum;
	}
}
