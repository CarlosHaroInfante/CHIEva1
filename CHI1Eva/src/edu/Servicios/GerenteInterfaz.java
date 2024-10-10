package edu.Servicios;

import java.util.List;

import edu.Dtos.clienteDto;

/*
 * Interfaz donde se encuentra la operativa de los gerentes.
 * 10102024
 * @author - CHI
 * */
public interface GerenteInterfaz {

	/*
	 * Método que crea un nuevo cliente de forma ciclica.
	 * 10102024
	 * @author - CHI
	 * */
	public void crearNuevoCliente(List<clienteDto> listaClientes);
}
