package animal;

public class IceCreamVotes {
	private String flavor;
	private String personName;
	static private int numVotes = 0;
	public static void main(String[] args) {
		
	}
	public IceCreamVotes(String personName, String flavor) {
		this.personName = personName;
		this.flavor = flavor;
		numVotes++;
	}
	
	public String getFlavor() {
		return flavor;
	}
	public String getpersonName() {
		return personName;
	}
	static public int getnumVotes() {
		return numVotes;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	}


