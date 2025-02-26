import java.util.Scanner;
public class MovieDriver {
	static Scanner scanner = new Scanner(System.in);
	static Movie movie = new Movie();
	static boolean wantMore = true;
	static String userResponse;
	static boolean validResponse;
	public static void main(String[] args) {
		do {
			System.out.print("Enter the title of a movie: ");
			movie.setTitle(scanner.nextLine());
			System.out.print("Enter the rating of the aforementioned movie: ");
			movie.setRating(scanner.nextLine());
			System.out.print("Enter the number of tickets sold at a theater: ");
			movie.setSoldTickets(scanner.nextInt());
			System.out.println(movie.toString());
			System.out.print("Do you want to enter another movie? (y/n): ");
			scanner.nextLine();
			userResponse = scanner.nextLine();
			if(userResponse.equalsIgnoreCase("n")) {
				wantMore = false;
			} 
		} while(wantMore==true);
	}

}
