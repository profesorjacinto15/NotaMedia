package NotaMedia;

import java.util.Scanner;

/**
 * Clase que Calcula la nota media
 */

public class NotaMedia {
	
	public static void main (String args[]) {

		Scanner teclado = new Scanner(System.in);
		int cantidadNotas, numero;
		float total, nota;
        
	    System.out.print("Indique cuantas notas desea introducir: ");
	    cantidadNotas = teclado.nextInt();
	        
	    total = 0.0f;
	    numero = 1;
	    do {
	        System.out.print("Introduzca la nota " + numero + ": ");
	        nota = teclado.nextFloat();
	        total = total + nota;
		    numero = numero + 1;
	    } while (numero <= cantidadNotas);
	        
	    float notaMedia = total/cantidadNotas;
	    System.out.println("La nota media es: " + notaMedia);    
	}
	
}