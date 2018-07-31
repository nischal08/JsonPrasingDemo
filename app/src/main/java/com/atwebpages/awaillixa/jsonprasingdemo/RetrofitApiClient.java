package com.atwebpages.awaillixa.jsonprasingdemo;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitApiClient {

    public static final String BASE_URL ="https://api.androidhive.info/";
    private static Retrofit retrofit = null;

    public static Retrofit getRetrofitApiClient(){
        if(retrofit==null){
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            }
            return retrofit;
    }

}
