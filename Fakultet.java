package fakultet;

import javax.swing.JOptionPane;

/*
 * Uppgift Jämförelse mellan rekursion och iteration
 * 
 * Resonemang:
 * Jag tror att rekursion kommer vara söligare eftersom metodanrop kan vara söligare är att
 * bara skriva själva koden
 */

public class Fakultet {

	public static void main(String[] args) {
		int input = Integer.parseInt(JOptionPane.showInputDialog("Ange ett tal"));
		
		long start = System.nanoTime();
		
		long resultRec = facRec(input);
		
		long stop = System.nanoTime();
		
		long nanoTimeRec = stop - start;
		
		start = System.nanoTime();
		
		long resultIte = facIte(input);
		
		stop = System.nanoTime();
		
		long nanoTimeIte = stop - start;
		
		JOptionPane.showMessageDialog(null, 
			"Resultat rekursion: " + resultRec + "\n" +
			"Tid rekursion: " + nanoTimeRec + " ns\n\n" +
			"Resultat iteration: " + resultIte + "\n" +
			"Tid iteration: " + nanoTimeIte + " ns"
		, "Resultat", 1);
	}
	
	//Returnerar fakulteten av ett tal med hjälp av rekursion
	public static long facRec(int number) {
		if(number == 2) {
			return 2;
		}
		return number * facRec(number - 1);
	}
	
	//Returnerar fakulteten av ett tal med hjälp av iteration
	public static long facIte(int number) {
		long resIteration = 1;
		
		while(number >= 2) {
			resIteration *= number;
			number--;
		}
		
		return resIteration;
	}

}
