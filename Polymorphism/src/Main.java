import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        Movie themovie = Movie.getMovie("Science", "Star Wars");
//        themovie.watchMovie();
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Type (A for Adventure, C for Comedy, S for Science Fiction or Q to quit): ");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();

            Object unknownObject = Movie.getMovie("C", "Airplane");
            if (unknownObject.getClass().getSimpleName() == "Comedy") {
                Comedy c = (Comedy) unknownObject;
                c.watchComedy();
            } else if (unknownObject instanceof Adventure) {
                ((Adventure) unknownObject).watchAdventure();
            } else if (unknownObject instanceof ScienceFiction syfy) {
                syfy.watchScienceFiction();

            }
        }
        }

    }
