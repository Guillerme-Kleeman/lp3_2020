public class Cliente extends Persona{
	
	public void comprar(int cantidad, Vendedor vendedor) {
		
		int precio = cantidad*100000;
		
		if(dinero > precio) {
			
			if(vendedor.vender(cantidad)) {
			
				dinero -= precio;
				productos += cantidad;
			
			}
			
		}else {
			
			System.out.println("No tienes dinero suficiente");
		
		}
	}
}
