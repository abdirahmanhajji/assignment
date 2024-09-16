
package test;
import movie.movie;
import movie.MovieItem;
public class movieTest {
    public static void main(String[] args) {
        movie movieCollection = new movie();
        MovieItem item1 = new MovieItem("Inception", "abdi");
        MovieItem item2 = new MovieItem("The Matrix", "maka, abdi");
        MovieItem item3 = new MovieItem("Interstellar", "abdi");
        movieCollection.addmovieItem(item1);
        movieCollection.addmovieItem(item2);
        movieCollection.addmovieItem(item3);
        movieCollection.printmovieDetails();
    }
}
