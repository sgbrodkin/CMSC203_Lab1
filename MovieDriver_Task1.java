import java.util.Scanner;
public class MovieDriver {
	static Scanner scanner = new Scanner(System.in);
	static Movie movie = new Movie();


	public static void main(String[] args) {
		System.out.print("Enter the title of a movie: ");
		movie.setTitle(scanner.nextLine());
		System.out.print("Enter the rating of the aforementioned movie: ");
		movie.setRating(scanner.nextLine());
		System.out.print("Enter the number of tickets sold at a theater: ");
		movie.setSoldTickets(scanner.nextInt());
		System.out.print(movie.toString());
	}

}
