/**
 * @author Francisco Medel
 * Triángulo
 * */
public class Triangulo{
	public static void main(String[] args) {
		float lado1=10.0F;
		float lado2=9.0F;
		float lado3=4.0F;
		boolean esCorrecto=esTriangulo(lado1,lado2,lado3);
		if(esCorrecto) {
			String tipoTriangulo = consultarTipoTriangulo(lado1,lado2,lado3);
			System.out.printf("es un triangulo del tipo %s", tipoTriangulo);
			
		}else {
			System.out.printf("No forman un triangulo");
		}
		static boolean esTriangulo(float lado1,float lado2, float lado3) {
			return true;
		}
	}
}