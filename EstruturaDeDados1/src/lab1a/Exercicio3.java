package lab1a;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double[] nums = new double[10];
		double maior = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite valor: ");
			nums[i] = entrada.nextDouble();
		}
		
		double menor = nums[0];
		
		for(int i = 0; i < 10; i++) {
			if(nums[i] > maior) {
				maior = nums[i];
			} else if(nums[i] < menor){
				menor = nums[i];
			}
		}
		
		System.out.println("Maior num -> " + maior);
		System.out.println("Menor num -> " + menor);
		
		entrada.close();
	}
}
