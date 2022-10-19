package lab_1019_files.after;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MovieParser {

    public static final String EOL = System.lineSeparator();

    private List<Movie> movies;

    public MovieParser() {
        this.movies = new ArrayList<>();
    }

    public void parseMovies(String filepath) throws FileNotFoundException {
        File file = new File(filepath);

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                
                String line = scanner.nextLine();
                String[] tokens = line.split(",");
                if(tokens.length < 14 || Arrays.stream(tokens).anyMatch(""::equals)) {
                    continue;
                }
                String title = tokens[0];
                char rating = tokens[1].charAt(0);
                String genre = tokens[2];
                int releaseYear = Integer.parseInt(tokens[3]);
                double score = Double.parseDouble(tokens[4]);
                double votes = Double.parseDouble(tokens[5]);
                String director = tokens[6];
                String writer = tokens[7];
                String star = tokens[8];
                String country = tokens[9];
                Double budget = Double.parseDouble(tokens[10]);
                Double gross = Double.parseDouble(tokens[11]);
                String company = tokens[12];
                Double runtime = Double.parseDouble(tokens[13]);
                Movie movie = new Movie(title, rating, genre, releaseYear, score, votes, director, writer, star, country, budget, gross, company, runtime);
                movies.add(movie);
                // System.out.println(movies.size());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filepath);
        }
    }

    public void printStatistics(String filepath) throws Exception {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filepath), 1024);

        // output 5 top and 5 worst movies
        List<Movie> moviesSortedByScore = new ArrayList<>();
        moviesSortedByScore.addAll(movies);
        moviesSortedByScore.sort(Movie.compareByScore);
        // print first 5
        System.out.println("Top 5 movies:");
        writer.write("Top 5 movies:" + EOL);
        for(int i = 0; i < 5; ++i) {
            System.out.println(moviesSortedByScore.get(i));
            writer.write(moviesSortedByScore.get(i).toString() + EOL);
        }
        // print last 5
        System.out.println("Worst 5 movies:");
        writer.write("Worst 5 movies:" + EOL);
        for(int i = moviesSortedByScore.size() - 5; i < moviesSortedByScore.size(); ++i) {
            System.out.println(moviesSortedByScore.get(i));
            writer.write(moviesSortedByScore.get(i).toString() + EOL);
        }

        writer.close();
    }

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.ENGLISH);
        String filepath = "resources/movies.csv"; // add the path here.
        String output = "resources/topmovies.txt";
        MovieParser parser = new MovieParser();
        parser.parseMovies(filepath);
        parser.printStatistics(output);

        // String genreFilepath = "";
        // String yearFilepath = "";

        // parser.saveGenreTable(genreFilepath);
        // parser.saveReleaseYearTable(yearFilepath);
    }

}
