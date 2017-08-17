import javax.swing.JButton;
import javax.swing.JFrame;

public class PracticeJf extends JFrame {

	
	public static void main(String[] args) {
		PracticeJf practice = new PracticeJf();
		
	}
	public PracticeJf() {
		setVisible(true);
		JButton button = new JButton();
		add(button);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
