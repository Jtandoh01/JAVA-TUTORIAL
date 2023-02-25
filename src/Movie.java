public class Movie {
    //instances field
    private String title;
    private String director;
    private int releaseYear;
    private int duration;
    private double rating;

    //getters and setters
    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector(){
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }



    public int getReleaseYear(){
        return releaseYear;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public int getDuration(){
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public double getRating(){
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    //check if movie is long
    public boolean isLongMovie(){
        return duration > 120;
    }
    // check if movie is highly rated
    public boolean isHighlyRated(){
        return rating > 4.0;
    }
}
