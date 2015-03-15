import java.io.File;
// java.io.FileNotFoundException se ocupa para el catch del lector de archivo, por si no encuentra el archivo en Scanner
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;



public class Ejercicios {

	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	static void escribirString(String nombre_archivo, String contenido)
	{
		// utiliza un try para intentar grabar al archivo
		try{
		// Asigna Ingreso como un nuevo PrintWriter al archivo nombre_archivo
		PrintWriter Ingreso = new PrintWriter(nombre_archivo);
		// Imprime a nombre_archivo el string contenido
		Ingreso.println(contenido);
		// cierra Ingreso para no gastar memoria 
		Ingreso.close();
		}
		// intenta un catch en caso de que tire un error
		catch (Exception e)
		{
			// Hace un Trazo de errores a la variable e
			e.printStackTrace();
		}
		
	}
	
	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	static void escribirInt(String nombre_archivo, int contenido)
	{
		// utiliza un try para intentar grabar al archivo		
		try{
		// Asigna num como un nuevo PrintWriter al archivo nombre_archivo
		PrintWriter num = new PrintWriter(nombre_archivo);
		// Imprime el int contenido dentro del archivo nombre_archivo
		num.println(contenido);
		// cierra num para no gastar memoria
		num.close();
		}
		// crea un catch por si algo tira un error.
		catch (Exception e)
		{
			// Hace un Trazo de errores a la variable e
			e.printStackTrace();
		}
	}
	
	//Devuelve el primer entero contenido en el archivo con nombre nombre_archivo
	static int leerEntero(String nombre_archivo)
	{
		// crea la variable num que es un entero
		int num;
		// Utiliza try para hacer un intento para leer un archivo
		try {
			// Scanner asignar un scanner nuevo (leer) al archivo nuevo (nombre_archivo)
			Scanner leer = new Scanner(new File(nombre_archivo));
			// lee el siguiente Entero y lo asigna a num
			num = leer.nextInt();
			// imprime la variable num para ver que valor asigna (uso personal)
			System.out.println(num);
			// cierra el scanner leer para no gastar memoria
			leer.close();
			// retorna la variable asignado a num
			return num;
			// intenta atrapar la excepcion si no encuentra un archivo
		} catch (FileNotFoundException e) {
			// Hace un trazo de errores a la variable e
			e.printStackTrace();
		}
		// asigna un retorno en caso de que el try/catch no tenga efecto
		return -1;
		
	}
	
	//Devuelve la primera string contenida en el archivo con nombre nombre_archivo
	static String leerString(String nombre_archivo) 
	{
		// crea la variable linea que es un String
		String linea;
		// Utiliza try para hacer un intento para leer un archivo
		try{
		// Scanner asigna un scanner nuevo (leer) al archivo nuevo (nombre_archivo)
		Scanner leer = new Scanner(new File(nombre_archivo));
		// lee es siguiente string y lo asigna a linea
		linea = leer.next();
		// imprime la variable linea para ver que valor asigna (uso personal)
		System.out.println(linea);
		// cierra el scanner leer para no gastar memoria
		leer.close();
		// retorna la variable asignada a linea
		return linea;
		// intenta atrapar la excepcion si no encuentra un archivo
		}catch (FileNotFoundException e) {
			// Hace un trazo de errores a la variable e
			e.printStackTrace();
		}
		// asigna un retorno en caso de que el try/catch no tenga efecto
		return "";
	}
	
	//Devuelve el primer double contenido en el archivo con nombre nombre_archivo
	static double leerDouble(String nombre_archivo)
	{
		// crea la variable num que es un Double
		Double num;
		// Utiliza try para hacer un intento para leer un archivo
		try{
			// Scanner asigna un scanner nuevo (leer) al archivo nuevo (nombre_archivo)
			Scanner leer = new Scanner(new File(nombre_archivo));
			// lee es siguiente double y lo asigna a num
			num = leer.nextDouble();
			// imprime la variable num para ver que valor asigna (uso personal)
			System.out.println(num);
			// cierra el scanner leer para no gastar memoria
			leer.close();
			// retorna la variable asignada a num
			return num;
		// intenta atrapar la excepcion si no encuentra un archivo	
		}catch (FileNotFoundException e){
			// Hace un trazo de errores a la variable e
			e.printStackTrace();
		}
		// asigna un retorno en caso de que el try/catch no tenga efecto
		return -1;
	}
	
	//Devuelve la cantidad de veces que buscada (dado) existe en el archivo con nombre nombre_archivo (dado)
	static int contar(String nombre_archivo, String buscada)
	{
		// crea las variables palabra que es un String y cont que es un entero
		String palabra;
		int cont=0;
		// Utiliza try para hacer un intento para leer un archivo
		try{
			// Scanner asigna un scanner nuevo (lector) al archivo nuevo (nombre_archivo)
			Scanner lector = new Scanner(new File(nombre_archivo));
			// Crea un loop con while, por mientras hay un string en el archivo
			while(lector.hasNext())
			{
			// el lector asigna el valor string encontrado a palabra
			palabra = lector.next();
			// si palabra es igual a la variable buscada asigna +1 al contador
			if(palabra.equals(buscada)) cont = cont +1;
			}
			// imprime la variable cont para ver que valor asigna (uso personal)
			System.out.println(cont);
			// Cierra el scanner lector
			lector.close();
			// Retorna el valor del contador
			return cont;
			// intenta atrapar la excepcion si no encuentra un archivo
		}catch (FileNotFoundException e){
			// Hace un trazo de errores a la variable e
			e.printStackTrace();
		}
		// asigna un retorno en caso de que el try/catch no tenga efecto
		return -1;
	}
	
	//Devuelve el promedio de los numeros almacenados en un archivo
	//Nota: el archivo unicamente contiene enteros
	static int getPromedio(String nombre_archivo)
	{
		// crea las variables suma y cont y les asigna el valor de 0 a las dos
		int suma=0, cont=0;
		// Utiliza try para hacer un intento para leer un archivo
		try{
			// Scanner asigna un scanner nuevo (numbers) al archivo nuevo (nombre_archivo)
			Scanner numbers = new Scanner(new File(nombre_archivo));
			// Crea un loop con while, por mientras hay un Int en el archivo
			while(numbers.hasNextInt())
			{
				// agrega el siguiente entero de numbers a la suma
				suma = suma + numbers.nextInt();
				// suma 1 al contador
				cont = cont+1;
			}
			// crea la variable prom la cual toma la suma dividad por el contador
			int prom = suma/cont;
			// imprime la variable prom para ver que valor asigna (uso personal)
			System.out.println(prom);
			// cierra el scanner numbers 
			numbers.close();
			// retorna el promedio
			return prom;
			// intenta atrapar la excepcion si no encuentra un archivo
		}catch (FileNotFoundException e){
			// Hace un trazo de errores a la variable e
			e.printStackTrace();
		}
		// asigna un retorno en caso de que el try/catch no tenga efecto
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
