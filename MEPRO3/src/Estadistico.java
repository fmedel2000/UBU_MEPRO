/**
 * 
 * @author Francisco Medel Molinero
 * Problema estadistico que busca el máximo, minimo y la media de un array de numeros
 *
 */
public class Estadistico {
	
	public static void main(String[] args) {
		double[] numeros = { 1.0, 1.0, 2.0, 3.0 };
		System.out.printf("El valor máximo es %.2f%n", obtenerMaximo(numeros));
		System.out.printf("El valor mínimo es %.2f%n", obtenerMinimo(numeros));
		System.out.printf("La media arimética es %.2f%n", obtenerMedia(numeros));
		}
	static double obtenerMaximo(double[] numeros) {
		double max = 0;
		for(int i=0;i<numeros.length;i++) {
			if (numeros[i] > max) {
				max = numeros[i];
			}
		}
		return max;
	}
	
	static double obtenerMinimo(double[] numeros) {
		double 	min = 0;
		for(int i=0;i<numeros.length;i++) {
			if (numeros[i] < min) {
				min = numeros[i];
			}
		}
		return min;
	}
	
	static double obtenerMedia(double[] numeros) {
		double media = 0;
		double sumatorio=0;
		for(int i=0;i<numeros.length;i++) {
			sumatorio+=numeros[i];
		}
		media=sumatorio/numeros.length;
		return media;
	}
	
	
}