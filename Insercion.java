/*
 * Ordenamiento por insercion 
 */

package Ordenamientos;

import java.util.Scanner;

public class Insercion {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int array[],nElementos,pos,aux;
		System.out.println("Introduce el numero de elementos en el array");
		nElementos = entrada.nextInt();
		
		array = new int[nElementos];
		
		
		for(int i=0; i<nElementos;i++) {
			System.out.println((i+1)+". Digite un numero");
			array[i] = entrada.nextInt();
			
		}
		
		// Ordenamiento por Insercion
		for(int i=0;i<nElementos;i++) {
			pos=i;  				// Posicion del arreglo
			aux = array[i];	//Valor dentro del array
			
			while((pos>0)&&(array[pos-1]>aux)) {				//Mientras pos mayor que 0 y que el nº de la izq sea mayor que el actual.
				array[pos] = array[pos-1];					// Nº actual igualar al de la izquierda.
				pos--;										// Comprueba con los nº de la iz hasta la pos 1.
			}
			array[pos] = aux;
		}
		
		System.out.println("Orden Ascendente");
		for(int i = 0;i<nElementos;i++) {
			System.out.print(array[i]+ " - ");
		}
		System.out.println("");
		
		System.out.println("Orden Descendente: ");
		for(int i = (nElementos-1);i>=0;i--) {
			System.out.print(array[i]+" - ");
		}
		

	}

}
