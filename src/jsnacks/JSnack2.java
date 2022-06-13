package jsnacks;

import java.util.Scanner;

public class JSnack2 {
	
	public static void main (String[] args) {

	Scanner nm = new Scanner(System.in);
	int Numero = 0;
	
	System.out.println("Inserisci un Numero:");
	Numero = nm.nextInt();
	
	if (Numero % 2 == 0) {
		System.out.println(Numero);
	}
	else {System.out.println(Numero +1 );
}
	

    nm.close();
}
} 
