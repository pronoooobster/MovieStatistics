package lab_1019_files.before;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class MovieParser {

    public static final String EOL = System.lineSeparator();

    private List<Movie> movies;

    public MovieParser() {
        this.movies = new ArrayList<>();
    }

    public void parseMovies(String filepath) {
        // Use a Scanner

    }

    public void saveGenreTable(String filepath) {
        // User a BufferedWriter, each element is a line.

    }

    public void saveReleaseYearTable(String filepath) {


    }

    public void printStatistics(){


        // print top 5 reviews
        // print bottom 5 reviews
        // print director with most movies.
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        String filepath = ""; // add the path here.
        MovieParser parser = new MovieParser();
        parser.parseMovies(filepath); // <-- import movies here.

        String genreFilepath = "";
        String yearFilepath = "";

        parser.saveGenreTable(genreFilepath);
        parser.saveReleaseYearTable(yearFilepath);
    }

}
