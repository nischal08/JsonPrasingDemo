package com.atwebpages.awaillixa.jsonprasingdemo.JsonPrasingFromYoutube;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Snippet {

    @SerializedName("publishAt")
    @Expose
    private String PublishAt;

    @SerializedName("title")
    @Expose
    private String Title;

    @SerializedName("description")
    @Expose
    private String Description;

    @SerializedName("thumbnails")
    @Expose
    private Thumbnail thumbnail;

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getPublishAt() {
        return PublishAt;
    }

    public void setPublishAt(String publishAt) {
        PublishAt = publishAt;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
