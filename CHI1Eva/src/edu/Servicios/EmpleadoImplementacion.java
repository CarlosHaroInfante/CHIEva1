package edu.Servicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import edu.Dtos.compraDto;

public class EmpleadoImplementacion implements EmpleadoInterfaz{

	Scanner sc = new Scanner(System.in);
	public void compraNueva(List<compraDto> listaCompra) {
		
		
		compraDto nuevaCompra = new compraDto();
		
		System.out.println("Importe de la venta");
		nuevaCompra.setImporteCompra(sc.nextDouble());
		
		System.out.println("Id del cliente");
		nuevaCompra.setIdCliente(sc.nextLong());
		
		nuevaCompra.setInstanteCompra(LocalDateTime.now());
		
		nuevaCompra.setIdCompra(idAuto(listaCompra));
		
		listaCompra.add(nuevaCompra);
		
		for (compraDto compra : listaCompra) {
			System.out.println(compra.toString());
		}
		
		
	}
	
	public void ventasMensuales(List<compraDto> listaCompra) {
		
		System.out.println("Dame la fecha con este formato MM-yyyy");
		String mesAnyo = sc.next();
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("MM-yyyy");
		
		LocalDateTime fechaFormateada = LocalDateTime.parse(mesAnyo, formato); 
		System.out.println(fechaFormateada);
		
		double compraTotal = 0.0;
		for (compraDto compra : listaCompra) {
			if(compra.getInstanteCompra().getMonthValue() == fechaFormateada.getMonthValue() && 
					compra.getInstanteCompra().getYear() == fechaFormateada.getYear()) {
				
				compraTotal = compraTotal += compra.getImporteCompra();
			}
					
		
		}
		
		
		
	}
	
	/*
	 * Método privado que hace que el id se vaya autogenerando.
	 * 10102024
	 * @author - CHI
	 * */
	private long idAuto(List<compraDto> listaCompra) {
	
		long idAutogenerado = 0;
		int tamanioLista = listaCompra.size();
		
		
		if(tamanioLista > 0) {
			idAutogenerado = listaCompra.get(tamanioLista - 1).getIdCompra() + 1;
		}
		else {
			idAutogenerado = 1;
		}
		return idAutogenerado;
	}
}
