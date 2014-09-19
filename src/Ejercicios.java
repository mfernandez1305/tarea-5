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
		contenido=1;//se le asigna el valor a la variable contenido
		String str=""+contenido;//se inicializa la variable y se le asigna la variable contenido a la variable string 
		try{
			PrintWriter escritor= new PrintWriter(nombre_archivo);//se crea el escritor que exscribira en el archivo 
			escritor.write(str);//se escribe en el archivo lo que contiene la variable str 
			escritor.flush();
			}catch(Exception e){//se atrapa cualquier error
				e.printStackTrace();//se escribe el erro encontrado 
				
				
			}
		return;
	}
	
	//Devuelve el primer entero contenido en el archivo con nombre nombre_archivo
	static int leerEntero(String nombre_archivo)
	{
		return -1;
	}
	
	//Devuelve la primera string contenida en el archivo con nombre nombre_archivo
	static String leerString(String nombre_archivo)
	{
		return "";
	}
	
	//Devuelve el primer double contenido en el archivo con nombre nombre_archivo
	static double leerDouble(String nombre_archivo)
	{
		return -1;
	}
	
	//Devuelve si el archivo con nombre nombre_archivo contiene la string buscada
	static boolean existe(String nombre_archivo, String buscada)
	{
		String str="";//se declara la variable str y se inicializa
		try{
			File archivo= new File ("nombre_archivo");
			Scanner s= new Scanner (nombre_archivo);// se coloca el escaner que permitira ingresar datos 
			while(s.hasNext()){// se inicia el while leyendo los datos que estan en el archivo
				
				buscada=s.next();// permite ingresar la variable a buscar 
				if(str.equals(buscada))//se evalua si string es igual que el contenido de la variable buscada 
					str=buscada;// si esto sucede se igalan las variables 
			
			}	
			
		}catch//atrapa cualquier error
		(Exception e){
			e.printStackTrace();//imprime el error
		}
		return false;//devuelve falso
	}
	
	//Devuelve el numero menor de un archivo
	//Dado, el archivo unicamente contiene enteros
	static int getNumeroMenor(String nombre_archivo)
	{
		int menor=10000;//se declara y se inicializa la variable menor 
		String str=""+menor;// se declara y se inicializa la variable str
		
		try{
		File archivo= new File ("nombre_archivo");
		Scanner s= new Scanner (nombre_archivo);// se coloca el escaner que permitira ingresar datos 
		
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
		
		return -1;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
