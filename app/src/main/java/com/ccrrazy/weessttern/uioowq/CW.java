package com.ccrrazy.weessttern.uioowq;

import android.app.Activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import com.github.ybq.android.spinkit.sprite.Sprite;
import com.github.ybq.android.spinkit.style.DoubleBounce;
import com.ncorti.slidetoact.SlideToActView;
import com.onesignal.OneSignal;


public class CW extends Activity {
    WebView wersxo;
    public  ProgressBar oiijds;
    public  SlideToActView ojns, ijs, ins;
    public  String ihns;
    public  String insa;
    public static String ijja;
    public ValueCallback<Uri> oinas;
    public Uri ojsa = null;
    public ValueCallback<Uri[]> omads;
    public String ojnad;
    public static final int onsda = 1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        setContentView(R.layout.cw);
        wersxo = findViewById(R.id.wersxo);
        setds();
        oiijds = (ProgressBar)findViewById(R.id.spin_kit);
        Sprite doubleBounce = new DoubleBounce();
        oiijds.setIndeterminateDrawable(doubleBounce);
        ojns = (SlideToActView) findViewById(R.id.example);
        ojns.setAnimDuration(500);
        ijs = (SlideToActView) findViewById(R.id.example1);
        ijs.setAnimDuration(500);
        ins = (SlideToActView) findViewById(R.id.example2);
        ins.setAnimDuration(500);
        ijfd();

    }


    private void ijfd(){

        if (MainActivity.adadada(this) == 0){

            new Thread(new Runnable() {
                @RequiresApi(api = Build.VERSION_CODES.O)
                @Override
                public void run() {
                    try {

                        String [] sd = MainActivity.cococonenwq().split("\\\u007C");
                        Log.d("weq", sd[0]);
                        Log.d("weq", sd[1]);
                        Log.d("weq", sd[2]);
                        ihns = sd[0];
                        insa = sd[1];
                        ijja = sd[2];

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Pposxop.didididwq(CW.this);
                               MainActivity.idifi(wersxo,CW.this);
                            }
                        });
                    }catch (Exception e){
                        Img.staaa(ojns, ijs, ins, oiijds,CW.this);
                    }
                }
            }).start();

        }else {

            Img.staaa(ojns, ijs, ins, oiijds,this);
        }

    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onStart() {
        super.onStart();

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(this);
        OneSignal.setAppId(MainActivity.mmm("MDQ1OGMxYjAtYTY0Ni00MjVhLTg0YjQtOTE0ZTIzOTQyMWQx"));
        Pposxop.appPpPp(this);

    }

    @Override
    public void onBackPressed() {
        if (wersxo.isFocused() && wersxo.canGoBack()) {
            wersxo.goBack();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != onsda || omads == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        Uri[] results = null;
        if (resultCode == Activity.RESULT_OK) {
            if (data == null) {
                if (ojnad != null) {
                    results = new Uri[]{Uri.parse(ojnad)};
                }
            } else {
                String dataString = data.getDataString();
                if (dataString != null) {
                    results = new Uri[]{Uri.parse(dataString)};
                }
            }
        }
        omads.onReceiveValue(results);
        omads = null;
        if (oinas == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        Uri result = null;
        try {
            if (resultCode != RESULT_OK) {
                result = null;
            } else {
                result = data == null ? ojsa : data.getData();
            }
        } catch (Exception e) { }
        oinas.onReceiveValue(result);
        oinas = null;
    }


    private void setds(){

        wersxo.getSettings().setAllowUniversalAccessFromFileURLs(true);
        wersxo.getSettings().setJavaScriptEnabled(true);
        wersxo.getSettings().setAllowContentAccess(true);
        wersxo.getSettings().setLoadWithOverviewMode(true);
        wersxo.getSettings().setEnableSmoothTransition(true);
        wersxo.getSettings().setUseWideViewPort(true);
        wersxo.getSettings().setSaveFormData(true);
        wersxo.getSettings().setAllowFileAccess(true);
        wersxo.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        wersxo.getSettings().setDomStorageEnabled(true);
        wersxo.setFocusableInTouchMode(true);
        wersxo.setWebViewClient(new WebClientCW(this));
        wersxo.setWebChromeClient(new WebChromeCW(this));
        CookieManager.getInstance().setAcceptThirdPartyCookies(wersxo, true);
        CookieManager.getInstance().setAcceptCookie(true);
        wersxo.getSettings().setAllowFileAccessFromFileURLs(true);
        wersxo.getSettings().setSavePassword(true);
        wersxo.getSettings().setDatabaseEnabled(true);
        wersxo.getSettings().setRenderPriority(android.webkit.WebSettings.RenderPriority.HIGH);
        wersxo.getSettings().setCacheMode(android.webkit.WebSettings.LOAD_DEFAULT);
        wersxo.getSettings().setAppCacheEnabled(true);
        wersxo.getSettings().setLoadsImagesAutomatically(true);
        wersxo.setSaveEnabled(true);
        wersxo.getSettings().setMixedContentMode(0);
        wersxo.setFocusable(true);


    }

}
