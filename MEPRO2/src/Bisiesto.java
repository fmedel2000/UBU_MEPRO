/**
 * @author Francisco Medel
 * Bisiesto
 * */

public class Bisiesto{
	
	public static void main(String[] args) {
		int a�o=2000;
		boolean esBisiesto = esBisiesto(a�o);
		if (esBisiesto) {
			System.out.printf("Es bisiesto");
		}else {
			System.out.printf("No es bisiesto");
		}
	}
	
	static boolean esBisiesto(int a�o) {
		boolean resultado;
		if ((a�o % 4 == 0 && a�o % 100  != 0) || a�o % 400 == 0){
		resultado=true;
		}else {				
		resultado=false;
		}
		return resultado;
	}
}