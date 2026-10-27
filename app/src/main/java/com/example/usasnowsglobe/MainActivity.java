
package com.example.usasnowsglobe;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;
import android.graphics.Color;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Window window = getWindow();
        window.setStatusBarColor(Color.rgb(5, 17, 39));
        window.setNavigationBarColor(Color.rgb(5, 17, 39));
        window.getDecorView().setSystemUiVisibility(0);

        WebView webView = new WebView(this);
        webView.setBackgroundColor(Color.rgb(5, 17, 39));

        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setMixedContentMode(
            WebSettings.MIXED_CONTENT_NEVER_ALLOW
        );

        webView.setWebViewClient(new WebViewClient());
        setContentView(webView);
        webView.loadUrl("file:///android_asset/index.html");
    }
}
