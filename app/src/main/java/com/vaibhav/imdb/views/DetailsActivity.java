package com.vaibhav.imdb.views;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.vaibhav.imdb.R;
import com.vaibhav.imdb.fragment.MovieDetails;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        getSupportActionBar();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        MovieDetails movieDetails = new MovieDetails();
        movieDetails.setArguments(getIntent().getExtras());
        transaction.replace(R.id.fragmentContainer2, movieDetails);
        transaction.commit();
    }
}
