package com.atwebpages.awaillixa.jsonprasingdemo;



import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitApiInterface {
    @GET("contacts")
    Call<Contacts> getALLContactsFromApi();

}
