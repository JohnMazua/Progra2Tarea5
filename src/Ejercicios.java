import static org.junit.Assert.fail;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;



public class Ejercicios {

	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	static void escribirString(String nombre_archivo, String contenido)
	{
		try{
		PrintWriter Ingreso = new PrintWriter(nombre_archivo);
		Ingreso.println(contenido);
		Ingreso.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	static void escribirInt(String nombre_archivo, int contenido)
	{
		
		try{
		PrintWriter num = new PrintWriter(nombre_archivo);
		num.println(contenido);
		num.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Devuelve el primer entero contenido en el archivo con nombre nombre_archivo
	static int leerEntero(String nombre_archivo)
	{
		String test;
		int num;
		Scanner leer = new Scanner(nombre_archivo);
		//num = leer.nextInt();
		test = leer.next();
		System.out.println(test);
		return 0;
		
	}
	
	//Devuelve la primera string contenida en el archivo con nombre nombre_archivo
	static String leerString(String nombre_archivo) 
	{
		String linea;
		Scanner eyes = new Scanner(nombre_archivo);
		linea = eyes.next();
		System.out.print(linea);
		return linea;
		
	}
	
	//Devuelve el primer double contenido en el archivo con nombre nombre_archivo
	static double leerDouble(String nombre_archivo)
	{
		return -1;
	}
	
	//Devuelve la cantidad de veces que buscada (dado) existe en el archivo con nombre nombre_archivo (dado)
	static int contar(String nombre_archivo, String buscada)
	{
		return -1;
	}
	
	//Devuelve el promedio de los numeros almacenados en un archivo
	//Nota: el archivo unicamente contiene enteros
	static int getPromedio(String nombre_archivo)
	{
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
