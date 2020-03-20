import java.util.Scanner;

public class Tarea {
	
	public static void main(String[] args) {
		
		boolean compra;
		Cliente cliente = new Cliente();
		Vendedor vendedor = new Vendedor(50);
		Scanner lector = new Scanner(System.in);
		System.out.println("Desea llevar algo? (Si sí, ingresa Y): ");
		compra = lector.next().toLowerCase().equals("y");
		
		while(compra) {
			
			try {
				
				System.out.println("Cuánto deseas llevar?");
				cliente.comprar(lector.nextInt(), vendedor);
				System.out.println("Algo más? (Una vez más, Y");
				compra = lector.next().toLowerCase().equals("y");
				
			}catch(Exception a){
				
				System.out.println("No te entiendo, perdón");
				compra = false;
			
			}
		
		}
		
		lector.close();
		System.out.println("Hasta luego!");
	}
}
