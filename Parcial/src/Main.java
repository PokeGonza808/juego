import java.util.LinkedList;

import javax.swing.JOptionPane;

class Main {

	public static void main(String[] args) {
		Equipo boca = new Equipo("Boca","La boca");
		Equipo river = new Equipo("River","Nuñez");
		Equipo independiente = new Equipo("Independiente", "Avellaneda");
		Equipo racing = new Equipo("Racing", "Avellaneda");
		Equipo sanlorenzo = new Equipo("San Lorenzo", "Avenida Francisco Fernandez de la Cruz");
		
		GestorEquipos nuevo = new GestorEquipos();
		nuevo.getEquipos().add(boca);
		nuevo.getEquipos().add(river);
		nuevo.getEquipos().add(independiente);
		nuevo.getEquipos().add(racing);
		nuevo.getEquipos().add(sanlorenzo);
		
		String[] Opciones = {
				
				"Jugar partido","Revisar Equipo","Salir"
					
			};
			int opcion =0;
			do {
				opcion = JOptionPane.showOptionDialog(null, "Bienvenido", null, opcion, opcion, null, Opciones, Opciones[0]);
				
				switch (opcion) {
				case 0:
					JOptionPane.showMessageDialog(null, "El ganador es:"+ nuevo.JugarPartido(nuevo.getEquipos().get(seleccionarEquipo(nuevo.getEquipos())),nuevo.getEquipos().get(seleccionarEquipo(nuevo.getEquipos()))));
					
					break;
				case 1: 
					int seleccionado = seleccionarEquipo(nuevo.getEquipos());
					
					
					String[] opcionesDeEquipo = {
						"Agregar jugador manualmente","Rellenar equipo","Ver equipo","Salir"	
						
					};
					int opcionEquipo=0;
					do {
					 opcionEquipo = JOptionPane.showOptionDialog(null, "Que desea hacer en el equipo", null, 0, 0, null, opcionesDeEquipo, opcionesDeEquipo[0]);
					 switch (opcionEquipo) {
					case 0:
						nuevo.getEquipos().get(seleccionado).agregarManualmente();
						break;
					case 1: 
						int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad"));
						nuevo.getEquipos().get(seleccionado).agregarJugadoresFalso(cantidad);

						break;
					case 2:
						JOptionPane.showMessageDialog(null, nuevo.getEquipos().get(seleccionado));
						break;
					case 3:
						JOptionPane.showMessageDialog(null, "Salir menu equipo");
						break;
					}
					
					
					} while (opcionEquipo!=3);
					
					break;

				case 2: 
					JOptionPane.showMessageDialog(null, "Salir menu principal");

					break;
				}
				
				
			} while (opcion!=2);
			
			
		
		}
		
		public static int seleccionarEquipo(LinkedList<Equipo> equipos) {
			String[] equiposarray = new String[equipos.size()];
			for (int i = 0; i < equipos.size(); i++) {
				equiposarray[i] = equipos.get(i).getNombre();
			}
			int opcion = JOptionPane.showOptionDialog(null, 
					"Seleccione equipo", null, 0, 0, null, equiposarray, equiposarray[0]);
			
			return opcion;
			

		}
		
			
		

	}