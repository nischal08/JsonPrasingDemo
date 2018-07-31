package com.atwebpages.awaillixa.jsonprasingdemo.JsonPrasingFromYoutube;

import com.atwebpages.awaillixa.jsonprasingdemo.Contact;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Music {

    @SerializedName("items")
    @Expose
    private List<Item> musicList;


    public List<Item> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Item> musicList) {
        this.musicList = musicList;
    }
}
