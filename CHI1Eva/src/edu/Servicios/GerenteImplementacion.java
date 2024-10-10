package edu.Servicios;

import java.util.List;
import java.util.Scanner;

import edu.Dtos.clienteDto;

public class GerenteImplementacion implements GerenteInterfaz{

	Scanner sc = new Scanner(System.in);
	public void crearNuevoCliente(List<clienteDto> listaClientes) {
		
		
		String otraVez = "S";
		
		while (otraVez.equals("S")) {
			clienteDto nuevoCliente = new clienteDto();
			System.out.println("Nombre del cliente");
			nuevoCliente.setNombre(sc.next());
			
			System.out.println("Apellidos del cliente");
			nuevoCliente.setApellidos(sc.next());
			
			nuevoCliente.setIdCliente(idAuto(listaClientes));
			
			System.out.println("¿Quieres volver a añadir un nuevo cliente? [S] para si o [N] para no");
			otraVez = sc.next();
			
			listaClientes.add(nuevoCliente);
		}
		
		for (clienteDto cliente : listaClientes) {
			System.out.println(cliente.toString());
		}
		
		
	}
	
	/*
	 * Método privado que hace que el id se vaya autogenerando.
	 * 10102024
	 * @author - CHI
	 * */
	private long idAuto(List<clienteDto> listaClientes) {
	
		long idAutogenerado = 0;
		int tamanioLista = listaClientes.size();
		
		
		if(tamanioLista > 0) {
			idAutogenerado = listaClientes.get(tamanioLista - 1).getIdCliente() + 1;
		}
		else {
			idAutogenerado = 1;
		}
		return idAutogenerado;
	}
}
