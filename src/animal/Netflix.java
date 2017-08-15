package animal;

public class Netflix {
	
	public static void main(String[] args) {
		Movie movie = new Movie("m1", 1);
		Movie movie2 = new Movie("m2", 2);
		Movie movie3 = new Movie("m3", 3);
		Movie movie4 = new Movie("m4", 4);
		Movie movie5 = new Movie("m5", 5);
		
		movie.getTicketPrice();
		
		NetflixQueue nQ = new NetflixQueue();
		nQ.addMovie(movie);
		nQ.addMovie(movie2);
		nQ.addMovie(movie3);
		nQ.addMovie(movie4);
		nQ.addMovie(movie5);
		
		nQ.printMovies();
		
		
		
		System.out.println("the best movie is " + nQ.getBestMovie());
		System.out.println("the 2nd best movie is " + nQ.getMovie(1));
		
		
		
		
		
	}

}
