
public class Tarea {

	public static void main(String[] args) {
		
		Persona juan = new Persona();
		Persona pepe = new Persona();
		Persona pedro = new Persona();
		
		juan.setApellido("Sanchez");
		juan.setEdad(19);
		juan.setNombre("Juan");
		pepe.setApellido("Ruiz");
		pepe.setEdad(24);
		pepe.setNombre("Pepe");
		pedro.setApellido("Ramirez");
		pedro.setEdad(33);
		pedro.setNombre("Pedro");
		
		juan.mostrarDatos();
		pepe.mostrarDatos();
		pedro.mostrarDatos();
	}

}
