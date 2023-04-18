package com.cdac.demohello;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class AI_WebView extends AppCompatActivity {
    WebView WebviewAI;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai_web_view);
        WebviewAI = findViewById(R.id.webview);

      //  WebviewAI.getSettings().setLoadsImagesAutomatically(true);
      //  WebviewAI.getSettings().setJavaScriptEnabled(true);
      /*  WebviewAI.getSettings().setLoadWithOverviewMode(true);
        WebviewAI.getSettings().setUseWideViewPort(true);

        WebviewAI.getSettings().setSupportZoom(true);
        WebviewAI.getSettings().setBuiltInZoomControls(true);
        WebviewAI.getSettings().setDisplayZoomControls(false);*/
       // WebviewAI.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
     //   WebviewAI.setScrollbarFadingEnabled(false);

     /*   // Add WebViewClient to monitor loading progress
        WebviewAI.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                // Show progress bar when page starts loading
                progressBar.setVisibility(View.VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                // Hide progress bar when page finishes loading
                progressBar.setVisibility(View.GONE);
            }
        });*/
        WebviewAI.getSettings().setUserAgentString("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.1234.5678 Safari/537.36"); // Set the user agent string to mimic a desktop browser
        WebviewAI.loadUrl("http://54.79.171.175");
    }
}