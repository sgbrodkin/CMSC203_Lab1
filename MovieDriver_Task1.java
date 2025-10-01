import java.util.Scanner;

public class MovieDriver {
	public static void main(String[] args) {
			Scanner kb = new Scanner(System.in);
			Movie movie1 = new Movie();
			System.out.print("Enter the title of a movie: ");
			movie1.setTitle(kb.nextLine());
			System.out.print("Enter the rating of the movie: ");
			movie1.setRating(kb.nextLine());
			System.out.print("Enter the number of tickets sold: ");
			movie1.setSoldTickets(kb.nextInt());
			System.out.println(movie1.toString());

	}

}
