package com.example.talaatmagdy.topmovie2016;



public class MovieDataProvider {

    private int movie_poster;
    private String movie_title;
    private String movie_rating ;

    public MovieDataProvider(int movie_poster, String movie_title, String movie_rating) {
        this.movie_poster = movie_poster;
        this.movie_title = movie_title;
        this.movie_rating = movie_rating;
    }

    public int getMovie_poster() {
        return movie_poster;
    }

    public void setMovie_poster(int movie_poster) {
        this.movie_poster = movie_poster;
    }

    public String getMovie_title() {
        return movie_title;
    }

    public void setMovie_title(String movie_title) {
        this.movie_title = movie_title;
    }

    public String getMovie_rating() {
        return movie_rating;
    }

    public void setMovie_rating(String movie_rating) {
        this.movie_rating = movie_rating;
    }
}
