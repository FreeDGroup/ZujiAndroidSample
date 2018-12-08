package com.travelflan.zuji.zujiandroidsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.view.ViewGroup.LayoutParams;

public class ChatActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setWebView();
    }

    private void setWebView() {
        LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);
        webView = new WebView(this);
//        webView.setWebChromeClient(new WebChromeClient() {
//            @Override
//            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
//                Log.d("MyApplication", consoleMessage.message() + " -- From line "
//                        + consoleMessage.lineNumber() + " of "
//                        + consoleMessage.sourceId());
//                return super.onConsoleMessage(consoleMessage);
//            }
//        });
        webView.setLayoutParams(params);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDatabaseEnabled(true);
        webSettings.setCacheMode(WebSettings.LOAD_NO_CACHE);
        webView.loadUrl("https://alpha-zuji-widget.travelflan.com.cn/?region=hk&locale=en_us&platform=android");
        setContentView(webView);
    }
}
