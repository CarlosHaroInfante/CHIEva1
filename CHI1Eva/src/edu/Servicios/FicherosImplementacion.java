package edu.Servicios;

import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FicherosImplementacion implements FicherosInterfaz{

	public void ficheroLog(String mensaje) {
		
		try {
			
		
		LocalDateTime fechaSinFormato = LocalDateTime.now();
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("ddMMyyyy");
		
		String fechaFormateada = formato.format(fechaSinFormato);
		
		
		String ruta = "C:\\Users\\CHI\\eclipse-workspace\\CHI1Eva\\src\\edu\\Servicios\\auditorias\\" +  fechaFormateada + ".txt";
		
		FileWriter escribe = new FileWriter(ruta, true);
		
		escribe.write(mensaje + "\n");
		escribe.close();
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al escribir en el archivo log " + e.getMessage());
		}
		
		
	}
}
