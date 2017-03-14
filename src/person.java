import javax.swing.JOptionPane;

public class person {

	String superpower;
	
	String namee;
	
	public static void main(String[] args) {
		person jef = new person();
	
		JOptionPane.showMessageDialog(null, jef.toString());
		
	}
	public String toString(){
		person jef = new person();
		String name = JOptionPane.showInputDialog("name pls");
		String superpower = JOptionPane.showInputDialog("power pls");
		
		jef.setName(name);
		jef.setSuperpower(superpower);
		
		jef.toString() = name +" has mad " + superpower + " skills.";
		
		
		
		
	}
	public String getSuperpower(){
		return superpower;
	}
	public void setSuperpower(String power){
		superpower = power;
	}
	public String getName(){
		return namee;
		
	}
	public void setName(String name){
		
		namee = name;
	}
	
	
}
