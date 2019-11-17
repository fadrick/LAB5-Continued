package com.example.recyclerviewandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;

public class Second extends AppCompatActivity {
    String url;
    WebView webView;
    CircleImageView circleImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        Intent intent=getIntent();
        url=intent.getStringExtra("Url");

        Toast.makeText(this, url+"", Toast.LENGTH_SHORT).show();
        webView=(WebView) findViewById(R.id.webview);

        webView.loadUrl(url);
        webView.getSettings().setBuiltInZoomControls(true);
    }
}
