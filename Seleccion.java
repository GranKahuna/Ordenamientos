/*
 * Ordenamiento por seleccion
 */

package Ordenamientos;

import java.util.Scanner;

public class Seleccion {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int array[], nElementos,min,aux;
		
		System.out.println("Introduce un numero de elementos del arrays");

		nElementos = entrada.nextInt();
		
		array = new int [nElementos]; 
		
		System.out.println("Rellenando el arreglo");
		System.out.println("---------------------");
		
		for(int i=0;i<nElementos;i++) {
			System.out.println((i+1)+". Introduce un numero: ");
			array[i] = entrada.nextInt();
		}
		
		// Ordenamiento por seleccion
		for(int i=0;i<nElementos;i++) {
			min = i;				// el elemento menor del arreglo (empieza en 0)
			for(int j=i+1;j<nElementos;j++) {
				if(array[j]< array[min]) {
					min = j;
				}
			}
			aux = array[i];
			array[i] = array[min];
			array[min] = aux;
			
		}
		System.out.println("Orden Ascendente");
		for(int i = 0; i<nElementos;i++) {
			System.out.print(array[i]+" - ");
			
		}
		System.out.println("\nOrden Descenciente");
	
		for(int i=(nElementos-1);i>=0;i--) {
			System.out.print(array[i]+" - ");
		}
	}

}
