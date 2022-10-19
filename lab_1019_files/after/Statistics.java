package lab_1019_files.after;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public abstract class Statistics {
    public static final String EOL = System.lineSeparator();

    public static void printTopStatistics(String filepath, List<Movie> movies) throws Exception {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filepath), 1024);

        // output 5 top and 5 worst movies
        List<Movie> moviesSortedByScore = new ArrayList<>();
        moviesSortedByScore.addAll(movies);
        moviesSortedByScore.sort(Movie.compareByScore);
        // print first 5
        writer.write("Top 5 movies:" + EOL);
        for(int i = 0; i < 5; ++i) {
            writer.write(moviesSortedByScore.get(i).toString() + EOL);
        }
        // print last 5
        writer.write("Worst 5 movies:" + EOL);
        for(int i = moviesSortedByScore.size() - 5; i < moviesSortedByScore.size(); ++i) {
            writer.write(moviesSortedByScore.get(i).toString() + EOL);
        }

        writer.close();
    }

    public static void meanScore(String filepath, List<Movie> movies) throws Exception {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filepath), 1024);

        // output mean score
        double sum = 0;
        for(Movie movie : movies) {
            sum += movie.getReviewScore();
        }
        double mean = sum / movies.size();
        writer.write("Mean score: " + mean + EOL);

        writer.close();
    }
}
