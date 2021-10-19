package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    Button telepon, email;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // kita mulai langsung saja dari sini

    telepon = findViewById(R.id.tb_telepon);
    telepon.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            // pake implicit intent
            String phoneNumber = "081233143063";
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:" + phoneNumber));
            startActivity(intent);

        }



    });

    email = findViewById(R.id.tb_email);
    email.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

           startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:111202012   950.mhs.dinus.ac.id")));


        }
    });


    }

    // nek arep nggawe method ng ngisor iki....

    public void tampilAlamat(View v){
        Intent inten = new Intent(Intent.ACTION_VIEW);
        String url = "https://goo.gl/maps/i1G11C9MgaZhSnzf7";
        inten.setData(Uri.parse(url));
        startActivity(inten);
    }




}