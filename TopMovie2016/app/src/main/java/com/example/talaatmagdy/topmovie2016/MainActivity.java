package com.example.talaatmagdy.topmovie2016;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView listView;
    //Array Of Poster Movie

    int [] movie_poster
            ={
            R.drawable.movie1,
            R.drawable.movie2,
            R.drawable.movie3,
            R.drawable.movie4,
            R.drawable.movie5,
            R.drawable.movie6,
            R.drawable.movie7,
            R.drawable.movie8,
            R.drawable.movie9,
            R.drawable.movie10,
             };

    String [] movie_title;
    String [] movie_rating;
    MovieAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.list_view);
        movie_title = getResources().getStringArray(R.array.Title_Movie);
        movie_rating=getResources().getStringArray(R.array.Rating_movies);
        adapter = new MovieAdapter(getApplicationContext(),R.layout.row_layout);
        listView.setAdapter(adapter);
        int i = 0;

        for (String title:movie_title)
        {
            MovieDataProvider movieDataProvider = new MovieDataProvider(movie_poster[i],title,movie_rating[i]);
            adapter.add(movieDataProvider);
            i++;
        }
    }
}
