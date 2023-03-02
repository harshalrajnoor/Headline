package com.example.headline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.headline.Models.NewsApiResponse;
import com.example.headline.Models.NewsHeadlines;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RequestManager manager = new RequestManager(this);
        manager.getNewsHeadlines(listener,"general",null);

    }

    private final OnFetchDataListener<NewsApiResponse> listener = new OnFetchDataListener<NewsApiResponse>() {
        @Override
        public void onFetchData(List<NewsHeadlines> list, String message) {

        }

        @Override
        public void onError(String message) {

        }
    };
}