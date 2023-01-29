package ejercicio;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		int auxFibo = 0; int auxFibo2 = 1; int auxFibo3 = auxFibo + auxFibo2;
		boolean primo = true; boolean fibonacci = true;
		System.out.println("Introduce un número");
		int num = lector.nextInt();
		String resultado = num + " ";
		
		if (num == 1) {
			resultado += "es primo";
		}
		
		for(int i = 2;i < num;i++) {
			if (num % i == 0) {
				primo = false;
			}
		}
		
		if (primo) {
			resultado += "es primo,";
		}else {
			resultado += "no es primo,";
		}
		
		if (num == 0 || num == 1) {
			resultado += " fibonacii y";
		} else {
		    while (auxFibo3 < num) {
		        auxFibo = auxFibo2;
		        auxFibo2 = auxFibo3;
		        auxFibo3 = auxFibo + auxFibo2;
		    }
		    if (auxFibo3 == num) {
		    	resultado += " fibonacii y";
		    } else {
		    	resultado += " no es fibonacci y";
		    }
		
		if (num % 2 == 0) {
			resultado += " es par";
		}else {
			resultado += " es impar";
		}
			
		System.out.println(resultado);
		}
	}	
}
