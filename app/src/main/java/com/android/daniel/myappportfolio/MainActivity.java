package com.android.daniel.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.text.Format;

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

        makeToast(getString(R.string.button_popular_movies), btnPopularMovies);
        makeToast(getString(R.string.button_stock_hawk), btnStockHawk);
        makeToast(getString(R.string.button_build_it_bigger), btnBuildItBigger);
        makeToast(getString(R.string.button_make_your_app_material), btnMakeMaterial);
        makeToast(getString(R.string.button_go_ubiquitous), btnGoUbiquitous);
        makeToast(getString(R.string.button_Capstone), btnCapstone);

    }

    private void makeToast(String appName , View view){
        Button button = (Button) view;
        final String message = String.format(getString(R.string.Toast_button), appName);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), message , Toast.LENGTH_SHORT).show();
            }
        });
    }


}
