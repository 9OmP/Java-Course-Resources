import java.util.Scanner;

public class Movie_Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Movie Name: ");
        String movieName = sc.nextLine();
        System.out.print("Enter Genre Name: ");
        String movieGenre = sc.nextLine();
        System.out.println("The movie details are: ");

        Movie movie1 = Movie.getMovie(movieGenre, movieName);
        movie1.watchMovie();
        System.out.println();

    }
}