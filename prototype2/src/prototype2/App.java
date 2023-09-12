package prototype2;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args){
				
		Usuario usuario1 = new Usuario();
		usuario1.setNombre("Andres");
		usuario1.setApellidos("Machetá");
		usuario1.setEdad(22);
		usuario1.setEstadoCivil("soltero");
		
		
		Usuario usuario2 = usuario1.clone();
		
		Usuario usuario3 = usuario1.clone();
		usuario3.setEstadoCivil("Casado");
		
		Usuario usuario4 = usuario1.clone();
		
		Usuario usuario5 = usuario1.clone();
		
		
		
		System.out.println(usuario1);
		System.out.println(usuario2);
		System.out.println(usuario3);
		System.out.println(usuario4);
		System.out.println(usuario5);
		
	}
		 	
}
