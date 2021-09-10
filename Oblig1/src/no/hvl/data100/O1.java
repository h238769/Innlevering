package no.hvl.data100;

import static javax.swing.JOptionPane.*;

public class O1 {

	public static void main(String[] args) {
		
		// Input your salary
		
		String bruttoLonn = showInputDialog("Bruttolønn: ");
		int lonn = Integer.parseInt(bruttoLonn);
		
		// Constant
		
		final double trinn0 = 0;
		final double trinn1 = 0.093;
		final double trinn2 = 0.241;
		final double trinn3 = 0.1152;
		final double trinn4 = 0.1452;
		
		// Calculate your salary within the tax category
		
		if (lonn >=0 && lonn <=164100) {
			showMessageDialog(null, "Skattetrinnen er " + lonn * trinn0);
		}
		
		else if (lonn >=164100 && lonn <=230950) {
			showMessageDialog(null, "Skattetrinnen er " + lonn * trinn1);
		}
		
		else if (lonn >=230951 && lonn <=580650) {
			showMessageDialog(null, "Skattetrinnen er " + lonn * trinn2);		
		}
		
		else if (lonn >=580651 && lonn <=934050) {
			showMessageDialog(null, "Skattetrinnen er " + lonn * trinn3);
		}
		
		else if (lonn >=934051) {
			showMessageDialog(null, "Skattetrinnen er " + lonn * trinn4);
		}
		
	}
}
