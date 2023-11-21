import java.util.Scanner;

public class Actividad_E1_1 {

	public Actividad_E1_1() {
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);

		String nombre;
		String fecha;
		String cuenta;
		
		int eleccionUsuario;
		int saldo = 250;
		int num;
		int divisa;
		int ingresos = 0;
		int gastos = 0;
		
		double dolar = 0.95;
		double libra = 1.15;
		double yuan = 0.13;
		
		
		String log = "";
		String suma = "";
		String resta = "";
		
		boolean seguir = true;
		
		System.out.println("Introduzca su nombre: ");
			nombre = entrada.nextLine();
		System.out.println("Introduzca su fecha de nacimiento: ");
			fecha = entrada.nextLine();
		System.out.println("Introduzca su número de cuenta: ");
			cuenta = entrada.nextLine();
		
		System.out.println("Bienvenido " + nombre + " a Abanca");
		
		while (seguir == true) {
				System.out.println();
			System.out.println("\n" + "Indique qué operación quiere realizar" + "\n" + "1- Ingresar \n" + "2- Retirar \n" + "3- Ver correspondencia \n"
				+ "4- Ver datos de la cuenta \n" + "5- Ver registro de ingresos \n" + "6- Ver registro de gastos \n" + "7- Salir \n" + ">> " );
			eleccionUsuario = entrada.nextInt();
			
			switch (eleccionUsuario) {
			
			case 1:
				System.out.println("Cuánto dinero quiere ingresar: ");
				num = entrada.nextInt();
				System.out.println("Se ha realizado correctamente el ingreso de: " + num + "�");
				saldo += num;
				ingresos ++;
				log = log + "+" + num + "\n";
				suma = suma + "+" + num + "\n";
				saldo = saldo + num;
			break;
		
			case 2:
				System.out.println("Cuánto dinero quieres retirar: ");
				num = entrada.nextInt();
				if (saldo < num) {
					System.out.println("Saldo induficiente, no puede realizar esta opración \n");
				} else {
					saldo -= num;
					ingresos ++;
					log = log + "-" + num + "\n";
					resta = resta + "-" + num + "\n";
					gastos ++ ; 
					System.out.println("Se ha realizado correctamente la retira de: " + num + "�");
				}
			break;
			
			case 3:
				System.out.println("Introduzca la moneda con la quiera revisar la equivalencia: \n" + "1. Libras \n" + "2. Dolares \n" + "3. Yuanes \n" + ">> ");
				divisa = entrada.nextInt();
				switch (divisa) {
				
					case 1:
						System.out.println("Su saldo en libras es de: " + (saldo*libra) + "£");
					break;
				
					case 2:
						System.out.println("Su saldo en dolares es de: " + (saldo*dolar) + "$");
					break;
				
					case 3:
						System.out.println("Su saldo en yuanes es de: " + (saldo*yuan) + "¥");
					break;
				}
			break;
			
			case 4:
				System.out.println("Aqui tiene sus datos personales: \n" + "Nombre: " + nombre + "\n Fecha de nacimiento: " + fecha + "\n Número de cuenta: " + cuenta);
				
			break;
			
			case 5:
				System.out.println("Ha realizado un total de: " + ingresos + " ingresos \n" + suma );
			break;
			
			case 6:
				System.out.println("Ha realizado un total de: " + gastos + " gastos \n" + resta );
			break;
			
			case 7:
				System.out.println("Que tenga un buen dia y hasta pronto");
				seguir = false;
			break;
				
			}
		}

	}

}
