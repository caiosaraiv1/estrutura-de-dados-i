package aula_1;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x = 0;
		
		System.out.print("Digite um num: ");
		x = entrada.nextInt();
		
		for(int i = x; i >= 0; i--) {
			if(i != 0) {
				System.out.print(i + ", ");				
			} else {
				System.out.println(i);
			}
		}
		
		entrada.close();
	}

}
