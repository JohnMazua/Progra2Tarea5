import static org.junit.Assert.*;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.Test;


public class Evaluar {

	@Test
	public void escribirString() {
		
		String nombre_archivo="testaArchivo";
		
		try
		{
			PrintWriter pw = new PrintWriter(nombre_archivo);
			pw.write("");
			pw.flush();
			pw.close();
			
			
		}catch(Exception e)
		{
			fail("Error");
		}
		
		Ejercicios.escribirString(nombre_archivo, "hola");
		
		int res=0;
		try
		{
			Scanner pw = new Scanner(new File(nombre_archivo));
			if(!pw.next().equals("hola"))
				fail("Error");
		}catch(Exception e)
		{
			fail("Error");
		}
		
	}
	
	@Test
	public void escribirInt() {
		String nombre_archivo="34";
		
		try
		{
			PrintWriter pw = new PrintWriter(nombre_archivo);
			pw.write("");
			pw.flush();
			pw.close();
			
			
		}catch(Exception e)
		{
			fail("Error");
		}
		
		Ejercicios.escribirInt(nombre_archivo, 34);
		
		int res=0;
		try
		{
			Scanner pw = new Scanner(new File(nombre_archivo));
			if(pw.nextInt()!=34)
				fail("Error");
		}catch(Exception e)
		{
			fail("Error");
		}
	}
	
	@Test
	public void leerEntero() {
		
		String nombre_archivo="testaArchivo";
		try
		{
			PrintWriter pw = new PrintWriter(nombre_archivo);
			pw.write("23");
			pw.flush();
			
			
		}catch(Exception e)
		{
			
		}
		
		assertEquals("Error ejecutando leerEntero(nombre_archivo)", 23, Ejercicios.leerEntero(nombre_archivo));
	}
	
	@Test
	public void leerString() {
		String nombre_archivo="testaArchivo";
		try
		{
			PrintWriter pw = new PrintWriter(nombre_archivo);
			pw.write("holas");
			pw.flush();
			
			
		}catch(Exception e)
		{
			
		}
		
		assertEquals("Error ejecutando leerEntero(nombre_archivo)", "holas", Ejercicios.leerString(nombre_archivo));
	}
	
	@Test
	public void leerDouble() {
		String nombre_archivo="testaArchivo";
		try
		{
			PrintWriter pw = new PrintWriter(nombre_archivo);
			pw.write("54.2");
			pw.flush();
			
			
		}catch(Exception e)
		{
			
		}
		
		assertEquals("Error ejecutando leerEntero(nombre_archivo)", (int)54.2, (int)Ejercicios.leerDouble(nombre_archivo));
	}
	
	@Test
	public void contar() {
		String nombre_archivo="testaArchivo";
		try
		{
			PrintWriter pw = new PrintWriter(nombre_archivo);
			pw.write("32 43 1 564 32 1 32 2 432");
			pw.flush();
			
			
		}catch(Exception e)
		{
			
		}
		
		assertEquals("Error", 2, Ejercicios.contar(nombre_archivo,"1"));
		assertEquals("Error", 1, Ejercicios.contar(nombre_archivo,"432"));
		
		assertEquals("Error", 3, Ejercicios.contar(nombre_archivo,"32"));
		assertEquals("Error", 0, Ejercicios.contar(nombre_archivo,"33"));
		
	}
	
	@Test
	public void getPromedio() {
		String nombre_archivo="testaArchivo";
		String nombre_archivo2="testaArchivo2";
		String nombre_archivo3="testaArchivo3";
		try
		{
			PrintWriter pw = new PrintWriter(nombre_archivo);
			pw.write("3 5 2 8 7");
			pw.flush();
			
			PrintWriter pw2 = new PrintWriter(nombre_archivo2);
			pw2.write("10 15 20");
			pw2.flush();
			
			PrintWriter pw3 = new PrintWriter(nombre_archivo3);
			pw3.write("22 20 31 11");
			pw3.flush();
			
			
		}catch(Exception e)
		{
			
		}
		
		assertEquals("Error", 5, Ejercicios.getPromedio(nombre_archivo));
		assertEquals("Error", 15, Ejercicios.getPromedio(nombre_archivo2));
		assertEquals("Error", 21, Ejercicios.getPromedio(nombre_archivo3));
	}

}
