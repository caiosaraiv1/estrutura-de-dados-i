package lab1a;

public class Exercicio7 {

	public static void main(String[] args) {
		
		String txt = "Caio e muito top xD";
		
		int resultado = contarVogais(txt);
		
		System.out.println(resultado);
		
	}
	
	public static int contarVogais(String txt) {
		
		int sum = 0;
		
		txt = txt.toLowerCase().replace(" ", "");
		
		for(int i = 0; i < txt.length(); i++) {
			if(txt.charAt(i) == 'a' || 
			   txt.charAt(i) == 'e'	|| 
			   txt.charAt(i) == 'i' || 
			   txt.charAt(i) == 'o'	||
			   txt.charAt(i) == 'u') {
				sum++;
			}
				
		}
		
		return sum;
	}
}
