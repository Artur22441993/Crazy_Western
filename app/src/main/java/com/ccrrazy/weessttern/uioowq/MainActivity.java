package com.ccrrazy.weessttern.uioowq;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imageView1, imageView2;
    TextView textView;
    Handler handler;
    Img imgc;
    int p =0;
    int c =0;
    int img1 = R.drawable.ic_slot_1;
    int img2 = R.drawable.ic_slot_2;
    int img3 = R.drawable.ic_slot_3;
    int img4 = R.drawable.ic_slot_4;
    int img5 = R.drawable.ic_slot_5;
    int img6 = R.drawable.ic_slot_6;
    int img7 = R.drawable.ic_slot_7;
    int img8 = R.drawable.ic_slot_8;
    int img9 = R.drawable.ic_slot_9;
    int img10 = R.drawable.ic_slot_10;

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(),CW.class));
        finishAffinity();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String mmm(String jdus){
        Base64.Decoder iuhd = Base64.getDecoder();
        String oinns = new String(iuhd.decode(jdus));
        return oinns;
    }

    public static int adadada(CW cw){
       return Settings.Secure.getInt(cw.getContentResolver(),
                Settings.Global.DEVELOPMENT_SETTINGS_ENABLED , 0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(1024);

        imageView1 = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        textView = findViewById(R.id.textView);
        handler = new Handler();

        int[] img = {img1,img2,img3,img4,img5,img6,img7,img8,img9,img10};
      final   int[] imgTru = {img1,img2,img3,img4,img5,};
        Log.d("aaa",""+img1);
        Log.d("aaa",""+img2);
        Log.d("aaa",""+img3);
        Log.d("aaa",""+img4);
        Log.d("aaa",""+img5);
        int[] imgFol = {img6,img7,img8,img9,img10};
        imgc = new Img();
        randomImage();

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 0;
                for (int i = 0; i < imgTru.length; i++){
                    a = imgTru[i];

                    if (a == imgc.getImg()){

                        c++;
                        textView.setText(""+c);
                        break;
                    }

                    a = imgFol[i];
                    if (a == imgc.getImg()){

                        c--;
                        textView.setText(""+c);
                        break;
                    }

                }

                randomImage();
            }
        });



        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 0;
                Log.d("qqq", "  ");
                for (int i = 0; i < imgTru.length; i++){
                    a = imgTru[i];

                    Log.d("qqq",""+ a+ " "+ imgc.getImg());

                    if (a == imgc.getImg()){
                        Log.d("rrr", "TTT"+a);
                        c++;
                        textView.setText(""+c);
                        break;
                    }

                    a = imgFol[i];
                    if (a == imgc.getImg()){
                        Log.d("rrr", " FFF"+a);
                        c--;
                        textView.setText(""+c);
                        break;
                    }

                }

                randomImage();
            }
        });


    }

    private void randomImage(){
        handler.post(new Runnable() {
            @Override
            public void run() {

                Random random = new Random();
                int a = random.nextInt(10);
                int b = random.nextInt(10);
                switch (a){
                    case 0:
                        imageView1.setImageResource(img1);
                        imgc.setImg(img1);
                        break;
                    case 1:
                        imageView1.setImageResource(img2);
                        imgc.setImg(img2);
                        break;
                    case 2:
                        imageView1.setImageResource(img3);
                        imgc.setImg(img3);
                        break;
                    case 3:
                        imageView1.setImageResource(img4);
                        imgc.setImg(img4);
                        break;
                    case 4:
                        imageView1.setImageResource(img5);
                        imgc.setImg(img5);
                        break;
                    case 5:
                        imageView1.setImageResource(img6);
                        imgc.setImg(img6);
                        break;
                    case 6:
                        imageView1.setImageResource(img7);
                        imgc.setImg(img7);
                        break;
                    case 7:
                        imageView1.setImageResource(img8);
                        imgc.setImg(img8);
                        break;
                    case 8:
                        imageView1.setImageResource(img9);
                        imgc.setImg(img9);
                        break;
                    case 9:
                        imageView1.setImageResource(img10);
                        imgc.setImg(img10);
                        break;
                }

                switch (b){
                    case 0:
                        imageView2.setImageResource(img1);
                        break;
                    case 1:
                        imageView2.setImageResource(img2);
                        break;
                    case 2:
                        imageView2.setImageResource(img3);
                        break;
                    case 3:
                        imageView2.setImageResource(img4);
                        break;
                    case 4:
                        imageView2.setImageResource(img5);
                        break;
                    case 5:
                        imageView2.setImageResource(img6);
                        break;
                    case 6:
                        imageView2.setImageResource(img7);
                        break;
                    case 7:
                        imageView2.setImageResource(img8);
                        break;
                    case 8:
                        imageView2.setImageResource(img9);
                        break;
                    case 9:
                        imageView2.setImageResource(img10);
                        break;
                }


                p ++;
                if (p!=20){
                    handler.postDelayed(this::run,40);

                }else {
                    p = 0;}
            }

        });

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String cococonenwq()throws Exception{
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(mmm("aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9BcnR1cjIyNDQxOTkzL2ZhYWY2ODViYzFmNjdiYWQyZmMxZDlkZWRkMjQ1MTRhL3Jhdy9DcmF6eV9XZXN0ZXJu")).openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        String ssdsd = bufferedReader.readLine();
        return ssdsd;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void idifi(WebView wirie, CW cw){

       String savedLink = cw.getSharedPreferences(cw.getPackageName(), MODE_PRIVATE).getString(MainActivity.mmm("c2F2ZWRVcmw="), "null");
       if (savedLink.equals("null")){
           new Handler().postDelayed(new Runnable() {
               @Override
               public void run() {

                   String statusAppsFlyer = Pposxop.insdad;
                   String load = null;
                   if (statusAppsFlyer.equals(MainActivity.mmm("Tm9uLW9yZ2FuaWM="))){
                       load = cw.ihns + Pposxop.poijuh;
                       wirie.setVisibility(View.VISIBLE);
                       wirie.loadUrl(load);
                   }else if(Pposxop.udsj != null) {
                       load = cw.ihns + Pposxop.ooijnda;
                       wirie.setVisibility(View.VISIBLE);
                       wirie.loadUrl(load);
                   }else {
                       if (cw.insa.equals(MainActivity.mmm("Tk8="))) {

                           Img.staaa(cw.ojns,cw.ijs,cw.ins,cw.oiijds,cw);

                       }else {
                           String strAppsFlyer = cw.insa + mmm("P2J1bmRsZT0=") + cw.getPackageName() + mmm("JmFkX2lkPQ==") + Pposxop.iuhsq + mmm("JmFwcHNfaWQ9") + Pposxop.ibdad + mmm("JmRldl9rZXk9") + MainActivity.mmm(Pposxop.oijnaq);;
                           load = cw.ihns + strAppsFlyer;
                           wirie.setVisibility(View.VISIBLE);
                           wirie.loadUrl(load);
                       }
                   }
               }
           },5000);

       }else {
           wirie.setVisibility(View.VISIBLE);
           wirie.loadUrl(savedLink);
       }

    }
}