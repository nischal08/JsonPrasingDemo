package com.atwebpages.awaillixa.jsonprasingdemo.JsonPrasingFromYoutube;

import com.atwebpages.awaillixa.jsonprasingdemo.Contacts;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Interface {

        @GET("youtube/v3/search?key=AIzaSyCJ-qPiyqpNS8LJ2EHjEEo3iB6ZlQTmKpg&channelId=UCqECaJ8Gagnn7YCbPEzWH6g&part=snippet%2Cid&order=date&maxResults=25")
        Call<Music> getALLMusicFromApi();

    }


