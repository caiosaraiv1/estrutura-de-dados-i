package lab1a;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] nums = new int[10];
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print("Digite o valor: ");
			nums[i] = entrada.nextInt();
		}
		
		int inicio = 0, fim = nums.length - 1, temp = 0;
		while(inicio < fim) {
			
			temp = nums[inicio];
			nums[inicio] = nums[fim];
			nums[fim] = temp;
			
			inicio++;
			fim--;
		}
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

		entrada.close();
	}
}
