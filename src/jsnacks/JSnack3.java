package jsnacks;

import java.util.Random;

public class JSnack3 {

	public static void main(String[] args) {

	String [] Nomi = {"Luigi","Giuseppe","Antonio","Francesco"};
    String [] Cognomi = {"Cobucci","Sparadice","Creations","Capaccio"};

	Random random = new Random ();
	
	for(int i = 0; i < 4; i++) {
		int random1 = random.nextInt(4);
	    int random2 = random.nextInt(4);
	    System.out.println(Nomi[random1] + " " + Cognomi[random2]);
	}
	
}
}