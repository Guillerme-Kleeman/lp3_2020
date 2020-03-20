public class Vendedor extends Persona{
	
	public Vendedor(int cantidad) {
	
		productos = cantidad;
	
	}
	
	public boolean vender(int cantidad) {
	
		if(cantidad < productos) {
		
			productos -= cantidad;
			dinero += cantidad*100000;
			return true;
		
		}else {
			
			System.out.println("No hay productos suficientes");
			return false;
		
		}
	}
}
