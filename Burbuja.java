/*
 * 
 * Ordenamientos : Método Burbuja
 */

package Ordenamientos;

import java.util.Scanner;

public class Burbuja {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
			
		int array[], nElementos, aux;
		System.out.println("Introduce la cantidad de elementos del array");
		
		nElementos = entrada.nextInt();
		
		array = new int [nElementos];// Le asignamos el numero de elementos al array
		for(int i=0;i<nElementos;i++) {
			System.out.println((i+1)+". Introduce un numero: ");
			array[i] = entrada.nextInt();
			
		}	
			// metodo Burbuja
		
		for(int i=0;i<nElementos-1;i++) {
			for(int j=0;j<nElementos-1;j++) {
				if(array[j] >array[j+1]) {					// Si numeroActual> numeroSiguiente
						aux = array[j];
						array[j] = array [j+1];
						array [j+1] = aux;
				}
			}
		}
		
		//Mostrando el array de forma creciente
		System.out.println("Array ordenado de forma ascendente");
		for(int i=0;i<nElementos;i++) {
			System.out.println(array[i]+ " - ");
		}
		
		System.out.println("Array invertido");
		for(int i=(nElementos-1);i>=0;i--) {
			System.out.println(array[i]+ " - Juarajuas");
			
		}
	}

}
