package com.example.symch;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class symptom_checker extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.symptom_click);

        WebView webView = findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);  // Enable JavaScript.
        webView.loadUrl("https://www.medifind.com/symptom-checker");  // Load the URL of your choice.
    }

}
