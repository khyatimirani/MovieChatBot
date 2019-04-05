package com.example.harsh.moviechatbot;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        if(savedInstanceState==null)
        {
            getSupportFragmentManager().beginTransaction().add(R.id.fragment1, new DetailActivityFragment()).commit();
        }

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(DetailActivity.this,ChatBot.class);
                startActivity(intent);
            }
        });
    }



    public void trailer1(View v)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com" +
                "/watch?v=" + DetailActivityFragment.youtube));
        startActivity(browserIntent);
    }
    public void trailer2(View v)
    {

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com" +
                "/watch?v=" + DetailActivityFragment.youtube2));
        startActivity(browserIntent);
    }


}


