package movie;
import java.util.ArrayList;
import java.util.List;
public class movie {
    private final List<MovieItem> items;
    public movie() {
        this.items = new ArrayList<>();
    }
    public void addmovieItem(MovieItem item) {
        items.add(item);
    }
    public void printmovieDetails() {
        for (MovieItem item : items) {
            item.printDetails();
        }
    }
}
