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
	public void existe() {
		String nombre_archivo="testaArchivo";
		try
		{
			PrintWriter pw = new PrintWriter(nombre_archivo);
			pw.write("32 43 34 564 23 1 64 2 432");
			pw.flush();
			
			
		}catch(Exception e)
		{
			
		}
		
		assertEquals("Error ejecutando existe(nombre_archivo)", true, Ejercicios.existe(nombre_archivo,"23"));
		assertEquals("Error ejecutando existe(nombre_archivo)", true, Ejercicios.existe(nombre_archivo,"432"));
		
		assertEquals("Error ejecutando existe(nombre_archivo)", false, Ejercicios.existe(nombre_archivo,"2312"));
		assertEquals("Error ejecutando existe(nombre_archivo)", false, Ejercicios.existe(nombre_archivo,"321"));
		
	}
	
	@Test
	public void getNumeroMenor() {
		String nombre_archivo="testaArchivo";
		try
		{
			PrintWriter pw = new PrintWriter(nombre_archivo);
			pw.write("32 43 34 564 23 134 64 2 432");
			pw.flush();
			
			
		}catch(Exception e)
		{
			
		}
		
		assertEquals("Error ejecutando getNumeroMenor(nombre_archivo)", 2, Ejercicios.getNumeroMenor(nombre_archivo));
	}

}
