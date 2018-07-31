package com.atwebpages.awaillixa.jsonprasingdemo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Contacts {

    @SerializedName("contacts")
    @Expose
    private List<Contact> contactsList;

    public List<Contact> getContactsList() {
        return contactsList;
    }

    public void setContactsList(List<Contact> contactsList) {
        this.contactsList = contactsList;
    }
}
