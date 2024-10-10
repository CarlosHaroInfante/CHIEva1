package edu.Controladores;

import java.util.ArrayList;
import java.util.List;

import edu.Dtos.clienteDto;
import edu.Dtos.compraDto;
import edu.Servicios.EmpleadoImplementacion;
import edu.Servicios.EmpleadoInterfaz;
import edu.Servicios.FicherosImplementacion;
import edu.Servicios.FicherosInterfaz;
import edu.Servicios.GerenteImplementacion;
import edu.Servicios.GerenteInterfaz;
import edu.Servicios.MenuImplementacion;
import edu.Servicios.MenuInterfaz;

/*
 * Clase inicio donde se encuentra el main de la aplicación.
 * 10102024
 * @author - CHI
 * */
public class Inicio {

	/*
	 * Main de la aplicación donde se encuentran las llamadas a métodos, el try/catch, los case, etc.
	 * 10102024
	 * @author - CHI
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mensaje;
		List<clienteDto> clienteNuevo = new ArrayList<clienteDto>();
		List<compraDto> compraNueva = new ArrayList<compraDto>();
		FicherosInterfaz ficheroLog = new FicherosImplementacion();
		GerenteInterfaz gerencia = new GerenteImplementacion();
		EmpleadoInterfaz empleado = new EmpleadoImplementacion();
		MenuInterfaz menu = new MenuImplementacion();
		boolean cerrarMenu = false;
		
		try {
			
			while(!cerrarMenu) {
				
				byte opcionP = menu.menuPrincipal();
				mensaje = "Entra en el menu Principal";
				ficheroLog.ficheroLog(mensaje);
				
				switch (opcionP) {
				case 0: {
					mensaje = "Se cierra el menú";
					System.out.println("Se cierra el menú");
					ficheroLog.ficheroLog(mensaje);
					cerrarMenu = true;
					break;
				}
				
				case 1:{
					byte opcionG = menu.menuGerente();
					mensaje = "Entra en el menu Gerente";
					ficheroLog.ficheroLog(mensaje);
					switch (opcionG) {
					case 0:
						mensaje = "Se vuelve al menú principal";
						ficheroLog.ficheroLog(mensaje);
						System.out.println("Vuelve al menú principal");
						break;
					case 1:
						mensaje = "Se crea un nuevo cliente";
						ficheroLog.ficheroLog(mensaje);
						System.out.println("Crear Nuevo Cliente");
						gerencia.crearNuevoCliente(clienteNuevo);
						break;
							
					default:
						mensaje = "Opción no válida del menú, vuelva a intentarlo";
						ficheroLog.ficheroLog(mensaje);
						break;
					}
					
					break;
				}
				
				case 2:{
					byte opcionE = menu.menuEmpleado();
					mensaje = "Entra en el menu Empleado";
					ficheroLog.ficheroLog(mensaje);
					switch (opcionE) {
					case 0:
						mensaje = "Se vuelve al menú principal";
						ficheroLog.ficheroLog(mensaje);
						System.out.println("Vuelve al menú principal");
						break;
					case 1:
						mensaje = "Se calcula el total de ventas diario";
						ficheroLog.ficheroLog(mensaje);
						System.out.println("Cálculo total de ventas diario");
						empleado.ventasMensuales(compraNueva);
						break;
					case 2:
						mensaje = "Se añade compra a un cliente";
						ficheroLog.ficheroLog(mensaje);
						System.out.println("Añadir compra a un cliente");
						empleado.compraNueva(compraNueva);
						break;
							
					default:
						mensaje = "Opción no válida del menú, vuelva a intentarlo";
						ficheroLog.ficheroLog(mensaje);
						break;
					}
					
					break;
				}
				
				
				default:
					mensaje = "Opción no válida del menú, vuelva a intentarlo";
					ficheroLog.ficheroLog(mensaje);
					break;
				}
				
				
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error tipo I/O en el menú o alguna de sus opciones " + e.getMessage());
			mensaje = "Error tipo I/O en el menú o alguna de sus opciones";
			ficheroLog.ficheroLog(mensaje);
		}
	}

}
