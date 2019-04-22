package com.llx278.jsbridge;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

public class WebViewBridge {
    public static final String TAG = "WebViewBridge";
    private final WebView webView;
    private final Activity hostActivity;

    @SuppressLint("SetJavaScriptEnabled")
    public WebViewBridge(WebView webView, Activity hostActivity) {
        this.webView = webView;
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.addJavascriptInterface(this,"RCJSBridgeHandler");
        this.hostActivity = hostActivity;
    }

    @JavascriptInterface
    public void jsBridgeHandler(String jsonArray) {

        if (TextUtils.isEmpty(jsonArray)) {
            return;
        }

        InvokeUrlCommand command = InvokeUrlCommand.commandFrom(jsonArray);
        if (command == null) {
            return;
        }



    }

    private void exec(InvokeUrlCommand command) {
        if (TextUtils.isEmpty(command.getClassName())) {
            return;
        }
    }
}
