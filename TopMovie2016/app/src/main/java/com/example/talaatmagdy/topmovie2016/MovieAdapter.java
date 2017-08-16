package com.example.talaatmagdy.topmovie2016;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;

/**
 * Created by talaatmagdy on 4/24/17.
 */

public class MovieAdapter  extends ArrayAdapter{
    List list = new ArrayList();

    public MovieAdapter( Context context,  int resource) {
        super(context, resource);
    }

    static class  DataHandler
    {
        ImageView poster;
        TextView title;
        TextView rating;
    }

    public void add(Object object)
    {
        super.add(object);
        list.add(object);
    }

    public  int getCount()
    {
        return this.list.size();
    }
    public Object getItem(int postion)
    {
        return this.list.get(postion);
    }
    public View getView (int postion , View ConvertView , @NonNull ViewGroup parent)
    {
        View row ;
        row = ConvertView;
        DataHandler handler;
        if(ConvertView == null)
        {
            LayoutInflater inflater = (LayoutInflater)this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.row_layout,parent,false);
            handler= new DataHandler();
            handler.poster = (ImageView)row.findViewById(R.id.movie_poster);
            handler.title = (TextView) row.findViewById(R.id.movie_title);
            handler.rating = (TextView) row.findViewById(R.id.movie_Rating);
            row.setTag(handler);

        }
        else
        {
            handler=(DataHandler)row.getTag();
        }

        MovieDataProvider movieDataProvider ;
        movieDataProvider = (MovieDataProvider)this.getItem(postion);
        handler.poster.setImageResource(movieDataProvider.getMovie_poster());
        handler.title.setText(movieDataProvider.getMovie_title());
        handler.rating.setText(movieDataProvider.getMovie_rating());
        return row;

    }
}
