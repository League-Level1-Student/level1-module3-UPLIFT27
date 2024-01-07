package _04_netflix;

public class NetflixRunner {
	
	public static void main(String[] args) {
	
		Movie Equalizer = new Movie("Equalizer", 1);
		Movie KarateKid = new Movie("KarateKid", 2);
		Movie Jumanji = new Movie("Jumanji", 3);
		Movie GetOut = new Movie("GetOut", 4);
		Movie RisingStars = new Movie("RisingStars", 5);
		
		
		
		
		Equalizer.getTicketPrice();
		
		NetflixQueue queue = new NetflixQueue();
		
		queue.addMovie(Equalizer);
		queue.addMovie(KarateKid);
		queue.addMovie(Jumanji);
		queue.addMovie(GetOut);
		queue.addMovie(RisingStars);
		
		queue.printMovies();
		System.out.println("The best movie is "+ queue.getBestMovie());
		System.out.println("The second best movie is "+ queue.getMovie(1));
		
		
	}

}
























