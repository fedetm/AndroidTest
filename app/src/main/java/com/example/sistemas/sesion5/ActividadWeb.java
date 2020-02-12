package com.example.sistemas.sesion5;

import android.os.Bundle;
import android.webkit.WebView;

public class ActividadWeb extends MainActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView myWebView = (WebView)
                findViewById(R.id.webview);
        myWebView.loadUrl("http://www.javeriana.edu.co");
    }

}
