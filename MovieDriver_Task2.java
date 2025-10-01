import java.util.Scanner;

public class MovieDriver {
	public static void main(String[] args) {
		boolean wantNext = true;
		boolean valid;
		String looper;
		do {
			Scanner kb = new Scanner(System.in);
			Movie movie1 = new Movie();
			System.out.print("Enter the title of a movie: ");
			movie1.setTitle(kb.nextLine());
			System.out.print("Enter the rating of the movie: ");
			movie1.setRating(kb.nextLine());
			System.out.print("Enter the number of tickets sold: ");
			movie1.setSoldTickets(kb.nextInt());
			System.out.println(movie1.toString());
			System.out.println("Would you like to enter another movie? (y/n): ");
			kb.nextLine();
			looper = kb.nextLine();
			do {
				if(looper.equalsIgnoreCase("n")) {
					wantNext = false;
					valid = true;
				}else if(looper.equalsIgnoreCase("y")) {
					wantNext = true;
					valid = true;
				}else {
					valid = false;
					System.out.println("Invalid input entered. Please input y or n.");
					looper = kb.nextLine();
				}
			}while(!valid);
		} while(wantNext);
	}

}
