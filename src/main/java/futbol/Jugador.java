package futbol;
import java.util.*;
public class Jugador extends Futbolista {
	
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	public Jugador() {
		super("Maradona", 30, "delantero");
		this.golesMarcados = 289;
		this.dorsal = 7;
	}
	public void setGolesMarcados(short golesMarcados) {
		this.golesMarcados = golesMarcados;
	}
	public short getGolesMarcados() {
		return this.golesMarcados;
	}
	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}
	public byte getDorsal() {
		return this.dorsal;
	}
	public int compareTo(Jugador jugador) {
		return (this.getEdad() - jugador.getEdad());
	}
	public String toString() {
		return ("El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() + 
				" con el dorsal " + this.getDorsal() + ". Ha marcado " + this.getGolesMarcados());
	}
}
