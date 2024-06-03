
public class Jugador {
	private String nombre, posicion;
	private int nc, edad;
	
	public Jugador (String nombre, String posicion, int nc, int edad) {
		this.nombre=nombre;
		this.posicion=posicion;
		this.nc=nc;
		this.edad=edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	public int getNC() {
		return nc;
	}
	public void setNC(int nc) {
		this.nc = nc;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Jugador [nombre= " + nombre + ", Posicion= " + posicion + ", edad= " + edad + ", Numero de camiseta= " + nc + "\n]";
	}
	public Jugador(){
		nombre="";
		edad=0;
		
	}
}
