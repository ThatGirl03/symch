package com.example.symch;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class symptom_checker extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.symptom_click);

        WebView webView = findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);  // Enable JavaScript.

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                // Inject CSS to change the background color and hide specific elements
                String css = "body { background-color: #800080 !important; }" +
                        "div.header, .site-name, .hamburger-menu { display: none !important; }";
                String javascript = "javascript:(function() {" +
                        "var style = document.createElement('style');" +
                        "style.type = 'text/css';" +
                        "style.appendChild(document.createTextNode('" + css + "'));" +
                        "document.head.appendChild(style);" +
                        "})()";
                webView.evaluateJavascript(javascript, null);
            }
        });

        // Load the URL after setting up the client
        webView.loadUrl("https://www.symptoma.co.za/");
    }
}
