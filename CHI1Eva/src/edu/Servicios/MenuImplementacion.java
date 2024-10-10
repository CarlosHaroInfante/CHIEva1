package edu.Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{

	Scanner sc = new Scanner(System.in);
	public byte menuPrincipal() {
		
		System.out.println("Menú Principal");
		System.out.println("//////////////");
		System.out.println("[0] - Cerrar menú");
		System.out.println("[1] - Menu gerencia");
		System.out.println("[2] - Menu empleado");
		
		byte opcionMenuPrincipal = sc.nextByte();
		
		return opcionMenuPrincipal;
			
	}
	public byte menuGerente() {
			
			System.out.println("Menú gerente");
			System.out.println("//////////////");
			System.out.println("[0] - Volver");
			System.out.println("[1] - Crear nuevo cliente");
			
			byte opcionMenuGerente = sc.nextByte();
			
			return opcionMenuGerente;
	}
	public byte menuEmpleado() {
		
		System.out.println("Menú empleado");
		System.out.println("//////////////");
		System.out.println("[0] - Volver");
		System.out.println("[1] - Cálculo total de ventas mensual");
		System.out.println("[2] - Añadir compras a un nuevo cliente");
		
		byte opcionMenuEmpleado = sc.nextByte();
		
		return opcionMenuEmpleado;
			
	}
}
