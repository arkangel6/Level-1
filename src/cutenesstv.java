import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.spun.util.database.SQLQuery.FromPart;

public class cutenesstv implements ActionListener {
	
	private JButton button, button2, button3;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	public static void main(String[] args) {
		cutenesstv tv = new cutenesstv();
		tv.makeButton();
		
		
	
	}
	void makeButton(){
		
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(600, 600);
		
		button = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		panel.add(button);
		button.addActionListener(this);
		button.setText("ducks");
		panel.add(button2); 
		button2.addActionListener(this);
		button2.setText("sheep");
		panel.add(button3);
		button3.addActionListener(this);
		button3.setText("fluffy");
		
	}
	public void actionPerformed(ActionEvent arg0) {
	JButton buttonPressed=(JButton)arg0.getSource();
	if(buttonPressed == button){
		showDucks();
	}
	else if(buttonPressed == button2){
		showSheep();
	}
	else if(buttonPressed==button3){
		showFluffyUnicorns();
	}
	}
	
	void showDucks() {
		playVideo("MtN1YnoL46Q");
	}

	void showSheep() {
		playVideo("CZlfbep2LdU");
	}
	
	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
	URI uri = new URI("https://www.youtube.com/watch?v=" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
