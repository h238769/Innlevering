package no.hvl.data100;

import static javax.swing.JOptionPane.*;

public class O3 {

	public static void main(String[] args) {
		
		String fakultTxt = showInputDialog("Tast inn fakultet ");
		int fakultTall = Integer.parseInt(fakultTxt);
		
		long fakult = 1;
		
		// Calculating the input of the number of factorial
		
		for ( int i = 1; i <= fakultTall; i++)
		{
			fakult = fakult * i;
		}
		
		// Output the sum of factorial after the loop has finished calculating the factorial
		
		showMessageDialog(null, "Fakultet av " + fakultTall + "! = " + fakult);
		
	}

}
