package prototype2;

import java.util.Objects;

//Clase
public class Usuario implements Cloneable{
	//Atributos
	String nombre;
	String apellidos;
	int edad;
	String estadoCivil;
	
	//get y set de nombre
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//get y set de apellidos
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	//get y set de edad
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//get y set de estadoCivil
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	

	@Override
	public boolean equals(Object o){
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Usuario usuario = (Usuario) o;
		return edad == usuario.edad && Objects.equals(nombre, usuario.nombre)&& Objects.equals(apellidos, usuario.apellidos)&& Objects.equals(estadoCivil, usuario.estadoCivil);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre, apellidos, edad, estadoCivil);
	}
	
	@Override
	protected Usuario clone() {
		Usuario cloneUsuario = new Usuario();
		cloneUsuario.setNombre(this.getNombre());
		cloneUsuario.setApellidos(this.getApellidos());
		cloneUsuario.setEdad(this.getEdad());
		cloneUsuario.setEstadoCivil(this.getEstadoCivil());
		return cloneUsuario;
	}
	
	@Override
	public String toString() {
		return "Usuario{" + " Nombre: " +nombre+ ','  + " Apellidos: " +apellidos+ ',' + " Edad: " +edad+ ',' + " Estado Civil: " +estadoCivil+ ' ' + "}"; 
	}
	
}
