package fakultet;

import javax.swing.JOptionPane;

/*
 * Uppgift J�mf�relse mellan rekursion och iteration
 * 
 * Resonemang:
 * Jag tror att rekursion kommer vara s�ligare eftersom metodanrop kan vara s�ligare �r att
 * bara skriva sj�lva koden
 */

public class Fakultet {

	public static void main(String[] args) {
		int input = Integer.parseInt(JOptionPane.showInputDialog("Ange ett tal"));
		
		long startRec = System.nanoTime();
		
		long resultRec = facRec(input);
		
		long stopRec = System.nanoTime();
		
		long nanoTimeRec = stopRec - startRec;
		
		long startIte = System.nanoTime();
		
		long resultIte = facIte(input);
		
		long stopIte = System.nanoTime();
		
		long nanoTimeIte = stopIte - startIte;
		
		JOptionPane.showMessageDialog(null, 
			"Resultat rekursion: " + resultRec + "\n" +
			"Tid rekursion: " + nanoTimeRec + " ns\n\n" +
			"Resultat iteration: " + resultIte + "\n" +
			"Tid iteration: " + nanoTimeIte + " ns"
		, "Resultat", 1);
	}
	
	public static long facRec(int number) {
		if(number == 2) {
			return 2;
		}
		return number * facRec(number - 1);
	}
	
	public static long facIte(int number) {
		long resIteration = 1;
		
		while(number >= 2) {
			resIteration *= number;
			number--;
		}
		
		return resIteration;
	}

}
