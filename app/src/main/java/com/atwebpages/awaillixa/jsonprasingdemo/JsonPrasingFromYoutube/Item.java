package com.atwebpages.awaillixa.jsonprasingdemo.JsonPrasingFromYoutube;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("kind")
    @Expose
    private String Kind;

    @SerializedName("snippet")
    @Expose
    private Snippet snippet;

    public String getKind() {
        return Kind;
    }

    public void setKind(String kind) {
        Kind = kind;
    }

    public Snippet getSnippet() {
        return snippet;
    }

    public void setSnippet(Snippet snippet) {
        this.snippet = snippet;
    }
}
