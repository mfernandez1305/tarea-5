import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


public class Ejercicios {

	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	static void escribirString(String nombre_archivo, String contenido)
	{
		try{//se intenta 
			PrintWriter escritor= new PrintWriter(nombre_archivo);//se crea el escritor que exscribira en el archivo 
			escritor.write(contenido);//se define lo que se va escribir en este caso es la variable contenido
			escritor.flush();
			}catch(Exception e){//atrapa cualquier error
				e.printStackTrace();//imprime el error
				
				//obtuve ayuda de: http://curiotecnology.blogspot.com/2012/05/crear-leer-y-escribir-archivo-de-texto.html
			}

	}
	
	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	static void escribirInt(String nombre_archivo, int contenido)
	{
		try{//se intenta 
			PrintWriter escritor= new PrintWriter(nombre_archivo);//se crea el escritor que exscribira en el archivo 
			escritor.write(Integer.toString(contenido));//se define lo que se va escribir en este caso es la variable contenido
			escritor.flush();
			}catch(Exception e){//atrapa cualquier error
				e.printStackTrace();//imprime el error
			}
		
	}
	
	//Devuelve el primer entero contenido en el archivo con nombre nombre_archivo
	static int leerEntero(String nombre_archivo)
	{
	try//se intenta 
		{
			
			Scanner s = new Scanner(new File(nombre_archivo));//se crea el escaner 
			    
		return s.nextInt();// devuelve lo ingresado en el escaner 
		}catch (Exception e)//atrapa cualquier error
		{
			e.printStackTrace();//imprime el error
		}
		return 0 ;//devuelve cero 
	}
	//me guie con el ejercicio de mi compañero https://github.com/FabianTr13/Prog_t5/blob/master/src/Ejercicios.java
	
	//Devuelve la primera string contenida en el archivo con nombre nombre_archivo
	static String leerString(String nombre_archivo)
	{
		try//se intenta 
		{
			
		Scanner s = new Scanner(new File(nombre_archivo));// se crea el escaner 

		return s.next();//devuelve lo que se ingresa en el escaner 
		}catch (Exception e)//atrapa cualquier error 
		{
			e.printStackTrace();//imprime el error 
		}
		
		return "";
	}
	
	//Devuelve el primer double contenido en el archivo con nombre nombre_archivo
	static double leerDouble(String nombre_archivo)
	{
		try//se intenta 
		{
			
			Scanner s = new Scanner(new File(nombre_archivo));//se crea el scanner
		   
		return s.nextDouble();// devuelve lo ingresado en el escaner 
		}catch (Exception e)// atrapa cualquier error 
		{
			e.printStackTrace();//imprime el error
		}
		
		return -1;
	}
	
	//Devuelve si el archivo con nombre nombre_archivo contiene la string buscada
	static boolean existe(String nombre_archivo, String buscada)
	{
		
		try{
		
			Scanner s= new Scanner (new File(nombre_archivo));// se coloca el escaner que permitira ingresar datos 
			while(s.hasNext()){// se inicia el while leyendo los datos que estan en el archivo
			
			if(s.next().equals(buscada))//se evalua si el escaner es igual que el contenido de la variable buscada, esta linea la copie de la correccion hecha a alex fabian en http://pastebin.com/ysRAkkdU
		return true;//se devuelve true
			}
		}catch(Exception e){//atrapa cualquier error
		e.printStackTrace();//imprime el error
		}
		
		return false;//devuelve falso 
	}
	
	//Devuelve el numero menor de un archivo
	//Dado, el archivo unicamente contiene enteros
	static int getNumeroMenor(String nombre_archivo)
	{
		//este ejercicio esta corregido con la correcion de mi examen en http://pastebin.com/dtdtuk3S
		int menor=10000;//se declara y se inicializa la variable menor 
		
		try{
		
		Scanner s= new Scanner (new File(nombre_archivo));// se coloca el escaner que permitira ingresar datos 
		
		while(s.hasNext()){// se inicia el while leyendo los datos que estan ene l archivo
			int num=s.nextInt();//se declara la variable num 
			if(num<menor)//se evalua si num es menor que la variable menor 
				menor=num;//se igualan las variables 
		
		}	
		System.out.print("el menor es: " +menor);//se imprime el num menor
	}catch//atrapaa un error 
	(Exception e){
		e.printStackTrace();//imprime el error 
	}
		
		return menor;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
