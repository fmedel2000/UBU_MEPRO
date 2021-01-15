/**
 * @author Francisco Medel
 * Bisiesto
 * */

public class Bisiesto{
	
	public static void main(String[] args) {
		int año=2000;
		boolean esBisiesto = esBisiesto(año);
		if (esBisiesto) {
			System.out.printf("Es bisiesto");
		}else {
			System.out.printf("No es bisiesto");
		}
	}
	
	static boolean esBisiesto(int año) {
		boolean resultado;
		if ((año % 4 == 0 && año % 100  != 0) || año % 400 == 0){
		resultado=true;
		}else {				
		resultado=false;
		}
		return resultado;
	}
}