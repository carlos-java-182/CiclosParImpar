package parImpar;

import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {
	
		int numero = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Introduce un n�mero");
			numero=entrada.nextInt();
			
			if(numero==0) {
				System.out.println("El n�mero es: "+numero+" por lo tanto termina el programa");
			}
			else if(numero%2!=0){
				System.out.println("El n�mero "+numero+" es impar");
			}
			else if(numero%2==0){
				System.out.println("El n�mero "+numero+" es par");
			}
			
	}while(numero!=0);

}}
