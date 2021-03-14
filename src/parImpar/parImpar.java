package parImpar;

import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {
	
		int numero = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Introduce un número");
			numero=entrada.nextInt();
			
			if(numero==0) {
				System.out.println("El número es: "+numero+" por lo tanto termina el programa");
			}
			else if(numero%2!=0){
				System.out.println("El número "+numero+" es impar");
			}
			else if(numero%2==0){
				System.out.println("El número "+numero+" es par");
			}
			
	}while(numero!=0);

}}
