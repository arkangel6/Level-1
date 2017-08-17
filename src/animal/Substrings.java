package animal;

import javax.swing.JOptionPane;

public class Substrings {
	public static void main(String[] args) {
		
		String s = "I am a giraffe";
		String number = JOptionPane.showInputDialog("pick a number");
		int x = Integer.parseInt(number);
		if(s.length()>x+2) {
		JOptionPane.showMessageDialog(null, s.substring(x, x+3));
		}
		else {
			JOptionPane.showMessageDialog(null, "doesn't work");
		}
	}

}
