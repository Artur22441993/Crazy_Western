package com.ccrrazy.weessttern.uioowq;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.RequiresApi;

public class WebClientCW extends WebViewClient {

    CW cw;

    public WebClientCW(CW cw) {
        this.cw = cw;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onPageFinished(WebView view, String url) {
        cw.getSharedPreferences(cw.getPackageName(), cw.MODE_PRIVATE).edit().putString(MainActivity.mmm("c2F2ZWRVcmw="),url).apply();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        if(url.contains(MainActivity.mmm("NDA0"))){
            cw.startActivity(new Intent(cw.getApplicationContext(), MainActivity.class));
            cw.finishAffinity();
        }
    }
}
