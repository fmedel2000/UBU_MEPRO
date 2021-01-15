/**
 * @author Francisco Medel
 * Ejercicio de Fibonacci
 */
public class Fibonacci{
	public static void main(String[] args) {
		int num = 7;
		int resultado=fibonacci(num);
	}
		static int fibonacci(int num) {
		int resultado=0;
		if (num == 0) {
			resultado=0;
		}else if(num==1){
			resultado=1;
			}
			else {
				resultado=fibonacci(num-1)+fibonacci(num-2);
			}
		return resultado;
	}
}