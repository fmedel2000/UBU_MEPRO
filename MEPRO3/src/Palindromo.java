/**
 * @author Francisco Medel
 * Palindromo
 * */

public class Palindromo{
	
	public static void main(String[] args) {
		char[] candidato="textotodololargoquequeramos".toCharArray();
		boolean resultado=esPalindromo(candidato);
		if(resultado) {
			System.out.printf("Es un palindromo: %s%n", new String(candidato).toString());
		}else {
			System.out.printf("No es un palindromo: %s%n", new String(candidato).toString());
		}
	}
	
	static boolean esPalindromo(char[] texto) {
		for(int i=0;i<=texto.length-1; i++) {
			if(texto[i]!=texto[texto.length-(i+1)]) {
				return false;
			}else {
				return true;
			}
		}
		return true;
	}
}