package animal;

public class IceCreamVotesRunner {
 public static void main(String[] args) {
	
	 IceCreamVotes[] votes;
	 
	 IceCreamVotes[] votesList= {
			 
			 new IceCreamVotes("jeff", "strawberry"),
			 new IceCreamVotes("jefff", "chocolate"),
			 new IceCreamVotes("jef", "strawberry")
			 
	 };
	 
	 System.out.println(IceCreamVotes.getnumVotes());
	 votesList[1].setFlavor("vanilla");
	 
	 for (int i = 0; i < votesList.length; i++) {
		 System.out.println(votesList[i].getpersonName());
		System.out.println(votesList[i].getFlavor());
		
	}	 
}
}
