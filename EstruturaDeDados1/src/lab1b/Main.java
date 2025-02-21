package lab1b;

public class Main {

	public static void main(String[] args) {

		Palindromo p1 = new Palindromo("ola galo");
		
		boolean t = p1.verificar();
		
		System.out.println(t);
	}

}
