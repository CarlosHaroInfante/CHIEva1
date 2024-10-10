package edu.Dtos;

import java.time.LocalDateTime;

/*
 * Dto que contiene los campos de una compra, getters y setters, contructores con campos y vacios, y el método toString.
 * 10102024
 * @author - CHI
 * */
public class compraDto {
	
	long idCompra;
	
	long idCliente;
	
	Double importeCompra = 99.99;
	
	LocalDateTime instanteCompra;

	public long getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(long idCompra) {
		this.idCompra = idCompra;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public Double getImporteCompra() {
		return importeCompra;
	}

	public void setImporteCompra(Double importeCompra) {
		this.importeCompra = importeCompra;
	}

	public LocalDateTime getInstanteCompra() {
		return instanteCompra;
	}

	public void setInstanteCompra(LocalDateTime instanteCompra) {
		this.instanteCompra = instanteCompra;
	}

	public compraDto(long idCompra, long idCliente, Double importeCompra, LocalDateTime instanteCompra) {
		super();
		this.idCompra = idCompra;
		this.idCliente = idCliente;
		this.importeCompra = importeCompra;
		this.instanteCompra = instanteCompra;
	}
	
	/*
	 * Método toString que imprime por consola los campos de la nueva venta.
	 * 10102024
	 * @author - CHI
	 * */

	public compraDto() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "compraDto [idCompra=" + idCompra + ", idCliente=" + idCliente + ", importeCompra=" + importeCompra
				+ ", instanteCompra=" + instanteCompra + "]";
	}

}
