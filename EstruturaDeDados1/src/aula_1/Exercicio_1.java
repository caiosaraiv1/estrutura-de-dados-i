package aula_1;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Bem-vindo à disciplina de Estrutura de Dados!");
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Bem vindo, " + nome + "!");
		
		entrada.close();
	}

}
