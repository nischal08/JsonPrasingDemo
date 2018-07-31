package com.atwebpages.awaillixa.jsonprasingdemo.JsonPrasingFromYoutube;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.atwebpages.awaillixa.jsonprasingdemo.ContactAdapter;
import com.atwebpages.awaillixa.jsonprasingdemo.Contacts;
import com.atwebpages.awaillixa.jsonprasingdemo.Json;
import com.atwebpages.awaillixa.jsonprasingdemo.R;
import com.atwebpages.awaillixa.jsonprasingdemo.RetrofitApiClient;
import com.atwebpages.awaillixa.jsonprasingdemo.RetrofitApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class YoutubeJson extends AppCompatActivity {
    RecyclerView musicList;
    ProgressBar progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_json);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        musicList=findViewById(R.id.show_list);
        Interface apiInterface = ApiClient
                .getRetrofitApiClient()
                .create(Interface.class);
        Call<Music> call = apiInterface.getALLMusicFromApi();

        progress = (ProgressBar) findViewById(R.id.show_pb) ;


        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        musicList.setLayoutManager(layoutManager);

        call.enqueue(new Callback<Music>() {
            @Override
            public void onResponse(Call<Music> call, Response<Music> response) {
                if(response.isSuccessful()){
                    progress.setVisibility(View.GONE);
                    Toast.makeText(YoutubeJson.this, "Successful", Toast.LENGTH_SHORT).show();
                    MusicAdapter musicAdapter=new MusicAdapter(response.body().getMusicList());
                    musicList.setAdapter(musicAdapter);
                }
            }

            @Override
            public void onFailure(Call<Music> call, Throwable t) {

                Toast.makeText(YoutubeJson.this, "Failed", Toast.LENGTH_SHORT).show();


            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(YoutubeJson.this, "K xa didi halkhabar ??", Toast.LENGTH_SHORT).show();
                Snackbar.make(view, "Kasto lagyo thichiera", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
