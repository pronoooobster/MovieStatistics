package lab_1019_files.before;

public class Movie {

    private String title;
    private int releaseYear;
    private String director;
    private String genre;
    private double reviewScore;

    public Movie(String title, int releaseYear, String director, String genre, double reviewScore) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.director = director;
        this.genre = genre;
        this.reviewScore = reviewScore;
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

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    @Override
    public String toString() {
        String summary = title + " (" + releaseYear + ") - " + genre + "." + MovieParser.EOL;
        summary += "  - Directed by: " + director + ". Score: " + reviewScore;
        return summary;
    }
}
