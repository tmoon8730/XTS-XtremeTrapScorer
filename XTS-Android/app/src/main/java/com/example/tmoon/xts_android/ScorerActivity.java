package com.example.tmoon.xts_android;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by tmoon on 1/7/17.
 */

public class ScorerActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scorer);

        Button hit_button = (Button) findViewById(R.id.hit_button);
        Button done_button = (Button) findViewById(R.id.done_button);

        hit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Hit!", Snackbar.LENGTH_SHORT).setAction("Action",null).show();
            }
        });

        done_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(ScorerActivity.this, MainActivity.class);
                ScorerActivity.this.startActivity(myIntent);
            }
        });
    }
}
