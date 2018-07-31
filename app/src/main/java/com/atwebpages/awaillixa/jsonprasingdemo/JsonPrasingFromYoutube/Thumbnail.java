package com.atwebpages.awaillixa.jsonprasingdemo.JsonPrasingFromYoutube;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Thumbnail {

    @SerializedName("medium")
    @Expose
    private Medium Medium;

    public com.atwebpages.awaillixa.jsonprasingdemo.JsonPrasingFromYoutube.Medium getMedium() {
        return Medium;
    }

    public void setMedium(com.atwebpages.awaillixa.jsonprasingdemo.JsonPrasingFromYoutube.Medium medium) {
        Medium = medium;
    }
}
