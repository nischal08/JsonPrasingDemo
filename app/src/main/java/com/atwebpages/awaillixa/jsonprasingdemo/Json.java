package com.atwebpages.awaillixa.jsonprasingdemo;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


public class Json extends AppCompatActivity {

    RecyclerView showList;
    ProgressBar progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        showList=findViewById(R.id.show_list);
        RetrofitApiInterface apiInterface = RetrofitApiClient
                .getRetrofitApiClient()
                .create(RetrofitApiInterface.class);
        Call<Contacts> call = apiInterface.getALLContactsFromApi();

        progress = (ProgressBar) findViewById(R.id.Pro) ;


        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        showList.setLayoutManager(layoutManager);

        call.enqueue(new Callback<Contacts>() {
            @Override
            public void onResponse(Call<Contacts> call, Response<Contacts> response) {
                if(response.isSuccessful()){
                    progress.setVisibility(View.GONE);
                    Toast.makeText(Json.this, "Successful", Toast.LENGTH_SHORT).show();
                    ContactAdapter contactAdapter=new ContactAdapter(response.body().getContactsList());
                    showList.setAdapter(contactAdapter);
                }
            }

            @Override
            public void onFailure(Call<Contacts> call, Throwable t) {

                Toast.makeText(Json.this, "Failed", Toast.LENGTH_SHORT).show();


            }
        });

    }




    /*  FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_json, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    */
}
