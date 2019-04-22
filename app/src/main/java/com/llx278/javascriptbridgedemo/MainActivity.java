package com.llx278.javascriptbridgedemo;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(new JsObject(),"JsObject");

        //webView.loadUrl("file//android_assets/www/default/index.html");
        if (ContextCompat.checkSelfPermission(this,Manifest.permission.INTERNET) == PackageManager.PERMISSION_GRANTED) {
            //webView.loadUrl("https://www.baidu.com");
           load();
        } else {
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.INTERNET},1);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 1 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

            //webView.loadUrl("https://www.baidu.com");
            load();
        } else {
            Log.d("main","...");
        }
    }

    public void load() {
        webView.loadUrl("file:///android_asset/www/main/index1.html");
    }
}
