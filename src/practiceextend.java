import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class practiceextend extends MouseAdapter{

	public practiceextend(){
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		button.setText("click");
		button.addMouseListener(this);
	}
	public static void main(String[] args) {
		practiceextend pe = new practiceextend();
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("hi");
		
	}
	
	
	}

