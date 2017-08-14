package animal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class jriddle implements ActionListener{
JButton button1, button2;
JTextField textfield = new JTextField(20);
JLabel label, label2;
public static void main(String[] args) {
		jriddle riddle = new jriddle();
		riddle.makeButtons();
	}
void makeButtons(){
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setSize(300, 200);
	JPanel panel = new JPanel();
	label = new JLabel();
	frame.add(panel);
	button1 = new JButton();
	button2 = new JButton();
	
	panel.add(label);
	panel.add(textfield);
	panel.add(button1);
	panel.add(button2);
	panel.add(label2);
	label.setText("hi");
	button1.setText("submit");
	button2.setText("hint");
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == button1){
		if(textfield.getText() == "hi"){
			label2.setText("correct");
		}
		else{
			label2.setText("incorrect");
		}
	}
	if(e.getSource() == button2){
		label2.setText("");
	}
	}
}



