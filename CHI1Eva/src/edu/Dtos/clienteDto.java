package edu.Dtos;

/*
 * Dto que contiene los campos de un nuevo cliente, getters y setters, contructores con campos y vacios, y el método toString.
 * 10102024
 * @author - CHI
 * */
public class clienteDto {

	long idCliente;
	
	String nombre = "aaaaa";
	
	String apellidos = "aaaaa";

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public clienteDto(long idCliente, String nombre, String apellidos) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public clienteDto() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * Método toString que imprime por consola los campos del nuevo cliente.
	 * 10102024
	 * @author - CHI
	 * */
	@Override
	public String toString() {
		return "clienteDto [idCliente=" + idCliente + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
}
