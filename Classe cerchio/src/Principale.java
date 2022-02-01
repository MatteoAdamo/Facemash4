import java.io.*;
public class Principale {
	public static void main(String[] args) {
	
	String valore;
	double l1=0,l2=0,l3=0;
	InputStreamReader input = new InputStreamReader(System.in);
	BufferedReader tastiera = new BufferedReader(input);
	
	try {
		System.out.println("Inserisci la misura del raggio: ");
		valore=tastiera.readLine();	
		l1=Integer.valueOf(valore).intValue();
	}catch(IOException e) {
		System.out.println("Errore");
		return;
	}  //Ciaoooooooooooooooooooooooooooooooooooooo
	datiCerchio cerchio1 = new datiCerchio(l1,l2,l3); 
	System.out.println("La circonferenza vale: " + cerchio1.Ccirconferenza(l1));
	System.out.println("L'area vale: " + cerchio1.Carea(l1));
	}
}
