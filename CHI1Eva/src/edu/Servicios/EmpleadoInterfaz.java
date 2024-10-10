package edu.Servicios;

import java.util.List;

import edu.Dtos.compraDto;
/*
 * Interfaz que contiene los métodos relacionados a las opciones del empleado.
 * 10102024
 * @author - CHI
 * */
public interface EmpleadoInterfaz {

	/*
	 * Método para añadir una nueva venta.
	 * 10102024
	 * @author - CHI
	 * */
	public void compraNueva(List<compraDto> listaCompra);
	
	/*
	 * Método para calcular las ventas mensuales.
	 * 10102024
	 * @author - CHI
	 * */
	public void ventasMensuales(List<compraDto> listaCompra);
}
