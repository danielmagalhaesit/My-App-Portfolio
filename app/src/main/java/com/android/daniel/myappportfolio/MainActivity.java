package com.android.daniel.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPopularMovies = (Button) findViewById(R.id.btnPopularMovies);
        Button btnStockHawk = (Button) findViewById(R.id.btnStockHawk);
        Button btnBuildItBigger = (Button) findViewById(R.id.btnBuildItBigger);
        Button btnMakeMaterial = (Button) findViewById(R.id.btnMakeMaterial);
        Button btnGoUbiquitous = (Button) findViewById(R.id.btnGoUbiquitous);
        Button btnCapstone = (Button) findViewById(R.id.btnCapstone);

        btnPopularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast(getString(R.string.button_popular_movies));
            }
        });

        btnStockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast(getString(R.string.button_stock_hawk));
            }
        });

        btnBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast(getString(R.string.button_build_it_bigger));
            }
        });

        btnMakeMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast(getString(R.string.button_make_your_app_material));
            }
        });

        btnGoUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast(getString(R.string.button_go_ubiquitous));
            }
        });

        btnCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast(getString(R.string.button_Capstone));
            }
        });
    }

    private void makeToast(String appName){
        Toast.makeText(this, "This button will launch my " + appName  + " app!", Toast.LENGTH_SHORT).show();
    }


}
