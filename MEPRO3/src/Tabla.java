/**
 * @author Francisco Medel
 * Tabla
 * */

public class Tabla{
	public static void main(String[] args) {
		int [][] tabla= new int[3][3];
		inicialiazar(tabla);
		mostrar(tabla);
		elevarAlCuadrado(tabla);
		mostrar(tabla);		
	}
	
	static void inicializar(int[][] tabla) {
		int valor = 0;
		for (int i=0;i<tabla.length;i++) {
			for (int j=0;j<tabla[i].length;j++) {
				tabla = new int[i][j] {valor + 1};
			}
		}
	}
	
	static void elevarAlcuadrado(int[] tabla) {
		for(i=0;i<=tabla.length-1;i++) {
			
		}
	}
	
	static void mostrar(int[][] tabla) {
		for (int i=0;i<tabla.length;i++) {
			System.out.printf("\n");
			for (int j=0;j<tabla[i].length;i++) {
				System.out.printf("| %d |", tabla[i][j]);
			}
		}
		
	}
}