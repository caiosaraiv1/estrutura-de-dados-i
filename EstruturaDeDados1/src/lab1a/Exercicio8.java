package lab1a;

public class Exercicio8 {

	public static void main(String[] args) {
		boolean teste1 = haColisaoEntreCirculos(0, 0, 3, 4, 0, 3);
		boolean teste2 = haColisaoEntreCirculos(0, 0, 2, 5, 0, 2);
		
		System.out.println("Teste 1 -> " + teste1);
		System.out.println("Teste 2 -> " + teste2);
	}
	
	public static boolean haColisaoEntreCirculos(double x1, double y1, double r1, double x2, double y2, double r2) {
		
		double sumRaios = r1 + r2;
		double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		return distancia <= sumRaios;
	}
}