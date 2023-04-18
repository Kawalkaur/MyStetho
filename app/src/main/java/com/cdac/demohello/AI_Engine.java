package com.cdac.demohello;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.android.material.textfield.TextInputEditText;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class AI_Engine extends AppCompatActivity {
    TextInputEditText Name, Age, Fever;
    RadioGroup RadioCough, RadioChest, RadioBreathing;
    RadioButton YesCough, NoCough, YesChest, NoChest, FastBreathing, NormalBreathing, IrregularBreathing;
    @SuppressLint({"MissingInflatedId", "SetJavaScriptEnabled"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai_engine);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        Name = findViewById(R.id.name);
        Age = findViewById(R.id.age);
        Fever = findViewById(R.id.fever);
        RadioCough = findViewById(R.id.radioCough);
        RadioChest = findViewById(R.id.radioChest);
        RadioBreathing = findViewById(R.id.radioBreathing);
        YesCough = findViewById(R.id.yesCough);
        NoCough = findViewById(R.id.noCough);
        YesChest = findViewById(R.id.yesChest);
        NoChest = findViewById(R.id.noChest);
        FastBreathing = findViewById(R.id.fast);
        NormalBreathing = findViewById(R.id.normal);
        IrregularBreathing = findViewById(R.id.irregullar);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);    }

    public void runAIEngine(View view) {
        Uri uri = Uri.parse("http://54.79.171.175");
        Uri desktopUri = uri.buildUpon().appendQueryParameter("desktop", "true").build();
        Intent intent = new Intent(Intent.ACTION_VIEW, desktopUri);
        //intent.putExtra("desktopMode", true); // Add this line to enable desktop site
        startActivity(intent);
//startActivity(new Intent( AI_Engine.this, AI_WebView.class));
    }
}