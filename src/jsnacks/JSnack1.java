package jsnacks;

import java.util.Scanner;

public class JSnack1 {

	public static void main(String[] args) {
	

	int numero;
	int somma = 0;
	Scanner nm = new Scanner(System.in);
	System.out.println("inseriti 5 numeri ");
	
	for(int i = 0; i < 5; i++) {
		numero = nm.nextInt();
		somma = somma + numero;
	}
	System.out.println("La somma dei 5 numeri è: " + somma);

	nm.close();}
}