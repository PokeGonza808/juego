import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Equipo {
	private String nombre;
	private String ciudad;
	private LinkedList<Jugador> jugadores = new LinkedList<Jugador>();
	public Equipo(String nombre, String ciudad) {
		this.nombre = nombre;
		this.ciudad = ciudad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public LinkedList<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(LinkedList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", ciudad=" + ciudad + ", jugadores=" + jugadores + "]";
	} 
	public void agregarJugadoresFalso(int cant) {
		
		for (int i = 0; i < cant; i++) {
			boolean flag = true;
			do {
					int camiseta = (int)(Math.random()*99+1);
					
				for (Jugador jugador: this.getJugadores()) {
					if (jugador.getNC()==camiseta) {
						flag=false;
					}
					
				}
				
				int edad = (int)(Math.random()*22+18);
				
				for (Jugador jugador: this.getJugadores()) {
					if (jugador.getEdad()==edad) {
						flag=false;
					}
				}
				this.getJugadores().add(new Jugador("nombre","posicion",camiseta, edad));
				break;
			} while (flag==false);
		
		}
		
	}
	public void agregarManualmente() {
		String nombreJugador = JOptionPane.showInputDialog("ingrese nombre de jugador");
		String posicionJugador = JOptionPane.showInputDialog("ingrese posicion de jugador");
		int numeroCamiseta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de jugador"));
		int edadJugador;
		do {
			edadJugador = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad de jugador"));
			if (edadJugador<18) {
				JOptionPane.showMessageDialog(null, "Demasiado joven");
			} else if (edadJugador>40) {
				JOptionPane.showMessageDialog(null, "Demasiado viejo");
			}
		}while (edadJugador<18||edadJugador>40);
		Jugador nuevo = new Jugador(nombreJugador,posicionJugador,numeroCamiseta, edadJugador);
		if (this.getJugadores().isEmpty()) {
			this.getJugadores().add(nuevo);
		}else {
			boolean flag=true;
			for (Jugador jugador: this.getJugadores()) {
				if (jugador.getNC()==nuevo.getNC()) {
					JOptionPane.showMessageDialog(null, "Este numero ya existe");
					flag=false;
					break;
				} 
			}
			if (flag) {
				this.getJugadores().add(nuevo);
			} else {
				JOptionPane.showMessageDialog(null, "No se pudo agregar el jugador, el numero ya existe");
			}
			
		}
		}
	
	
	
}
