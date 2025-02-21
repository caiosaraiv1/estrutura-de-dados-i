package lab1b;

public class Palindromo {
	
	private String frase;
	
	public Palindromo() {
	
	}

	public Palindromo(String frase) {
		super();
		this.frase = frase;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}
	
	public boolean verificar() {
		frase = frase.replaceAll(" ", "").toLowerCase();
		
		int inicio = 0;
		int fim = frase.length() - 1;
		
		while(inicio < fim) {
			if(frase.charAt(inicio) != frase.charAt(fim)) {
				return false;
			}
			inicio++;
			fim--;
		}
		return true;
	}
	

}
