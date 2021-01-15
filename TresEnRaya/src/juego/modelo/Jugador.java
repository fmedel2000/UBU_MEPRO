package juego.modelo;
/**
 * 
 * 
 * @author Francisco Medel Molinero
 * 
 * 
 */

public class Jugador {
	//Atributos
	private String nombre;
	private Color color;
	
	//Constructor
	public Jugador(String nombre,Color color) {
		
		this.nombre=nombre;
		this.color=color;
	}
	
	//Métodos
	public Color obtenerColor() {
		
		return color;
		
	}
	public String obtenerNombre() {
		return nombre;
		
	}
	public Pieza generarPieza() {
		
		//Retornar una nueva pieza del color actual
		
		Pieza pieza = new Pieza(obtenerColor());
		return pieza;
		
	}
	public String toString() {
		return obtenerNombre() + " " + obtenerColor();
	}
}