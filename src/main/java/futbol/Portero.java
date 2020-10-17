package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	
	public void setGolesRecibidos(short golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}
	public short getGolesRecibidos() {
		return this.golesRecibidos;
	}
	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}
	public byte getDorsal() {
		return this.dorsal;
	}
	public String toString() {
		return ("El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() + 
				" con el dorsal " + this.getDorsal() + ". Le han marcado " + this.getGolesRecibidos());
	}
	public int compareTo(Portero portero) {
		return (portero.getGolesRecibidos() - this.getGolesRecibidos());
	}
}
