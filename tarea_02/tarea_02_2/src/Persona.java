public class Persona {
	
	private String nombre, apellido;
	private int edad;
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getEdad() {
		return edad;
	}
	
	public void mostrarDatos() {
		System.out.println("=========================\n"
							+ "Apellido: " + apellido + "\n"
							+ "Nombre: " + nombre + "\n"
							+ "Edad: " + edad);
	}
}
