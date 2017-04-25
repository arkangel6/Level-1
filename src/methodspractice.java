import javax.swing.JOptionPane;

public class methodspractice {

	
	
	
	void iRock(){
		System.out.println("I rok");
	}
	void uRock(){
		String name = JOptionPane.showInputDialog("name");
		JOptionPane.showMessageDialog(null, name + "rocks");
		
	}
	void truth(){
		String singer = JOptionPane.showInputDialog("singer?");
		if(singer.equals("")){
			JOptionPane.showMessageDialog(null, singer + "is awesome");
			
		}
		else if(singer.equals("Justin Bieber")){
			JOptionPane.showMessageDialog(null, singer + "sucks");
		}
	}
}
