package com.atwebpages.awaillixa.jsonprasingdemo.JsonPrasingFromYoutube;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


    public class ApiClient {

        public static final String BASE_URL ="https://www.googleapis.com/";
        private static Retrofit retrofit = null;

        public static Retrofit getRetrofitApiClient(){
            if(retrofit==null){
                HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
                logging.setLevel(HttpLoggingInterceptor.Level.BODY);
                OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
                httpClient.addInterceptor(logging);

                retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }
            return retrofit;
        }

    }


