package com.llx278.jsbridge;

import android.app.Activity;
import android.webkit.WebView;

class CommandDelegate {
    public final WebView webView;
    public final Activity activity;
    public CommandDelegate(WebView webView,Activity activity) {
        this.webView = webView;
        this.activity = activity;
    }

    public void sendPluginResult(PluginResult result ,String callbackId) {

    }

    public void sendPluginResult(PluginResult result,String callbackId,boolean keepCallback) {

    }

}
