package lab_1019_files.after;

import java.util.Comparator;

public class Movie {

    private String title;
    private char rating;
    private String genre;
    private int releaseYear;
    private Double reviewScore;
    private Double votes;
    private String director;
    private String writer;
    private String star;
    private String country;
    private Double budget;
    private Double gross;
    private String company;
    private Double runtime;

    //title,rating,genre,releaseYear,reviewScore,votes,director,writer,star,country,budget,gross,company,runtime
    public Movie(String title, char rating, String genre, int releaseYear, Double reviewScore, Double votes, String director, String writer, String star, String country, Double budget, Double gross, String company, Double runtime) {
        this.title = title;
        this.rating = rating;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.reviewScore = reviewScore;
        this.votes = votes;
        this.director = director;
        this.writer = writer;
        this.star = star;
        this.country = country;
        this.budget = budget;
        this.gross = gross;
        this.company = company;
        this.runtime = runtime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(double reviewScore) {
        this.reviewScore = reviewScore;
    }

    public double getVotes() {
        return votes;
    }

    public void setVotes(double votes) {
        this.votes = votes;
    }

    public char getRating() {
        return rating;
    }

    public void setRating(char rating) {
        this.rating = rating;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getGross() {
        return gross;
    }

    public void setGross(double gross) {
        this.gross = gross;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getRuntime() {
        return runtime;
    }

    public void setRuntime(double runtime) {
        this.runtime = runtime;
    }

    // compare movies by score
    static Comparator<Movie> compareByScore = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return Double.compare(o2.getReviewScore(), o1.getReviewScore());
        }
    };

    @Override
    public String toString() {
        String summary = title + " (" + releaseYear + ") - " + genre + "." + MovieParser.EOL;
        summary += "  - Directed by: " + director + ". Score: " + reviewScore;
        return summary;
    }
}
