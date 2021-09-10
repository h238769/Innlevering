package no.hvl.data100;

import static javax.swing.JOptionPane.*;

public class O2 {

	public static void main(String[] args) {
		
		// Input 10 different students scores and give each of them a grade (Task b)
		
		for (int i = 1; i <= 10; i++) {
			
		String poengTxt = showInputDialog("Hvor mange poeng fikk du?: ");
		int poeng = Integer.parseInt(poengTxt);
		
		// Gives you a grade within your score points (Task a)
		
		if (poeng <= 100 && poeng >= 90) {
			showMessageDialog(null, "Karakteren din er A" );
		}
		
		else if (poeng <= 89 && poeng >= 80) {
			showMessageDialog(null, "Karakteren din er B");
		}
		
		else if (poeng <= 79 && poeng >= 60) {
			showMessageDialog(null, "Karakteren din er C");
		}
		
		else if (poeng <= 59 && poeng >= 50) {
			showMessageDialog(null, "Karakteren din er D");
		}
		
		else if (poeng <= 49 && poeng >= 40) {
			showMessageDialog(null, "Karakteren din er E");
		}
		
		else if (poeng <= 39 && poeng >= 0) {
			showMessageDialog(null, "Karakteren din er F");
		}
		
		// If the score input is incorrect, it will not take a spot of a student spot (Task c)
		
		else {
			showMessageDialog(null, "Poengsum er ugyldig");
			i--;
		}
		
		}

	}

}