package com.example.headline;

import com.example.headline.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener <NewsApiResponse>{

    void onFetchData(List<NewsHeadlines> list, String message);

    void onError(String message);

}
