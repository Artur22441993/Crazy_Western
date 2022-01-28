package com.ccrrazy.weessttern.uioowq;

import android.content.Intent;
import android.view.View;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;

import com.ncorti.slidetoact.SlideToActView;

public class Img {
    private int img;

    public Img() {
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public static String ip(String ip,String port){
        StringBuilder stringBuilder = new StringBuilder();
        String a [] = {ip,port};
        for (int i = 0 ; i< a.length;i++){
            stringBuilder.append(a[i]);
        }
        return stringBuilder.toString();
    }


    public static void staaa(SlideToActView s, SlideToActView p , SlideToActView c, ProgressBar progressBar, CW cw){

        progressBar.setVisibility(View.INVISIBLE);
        s.setVisibility(View.VISIBLE);
        p.setVisibility(View.VISIBLE);
        c.setVisibility(View.VISIBLE);
        s.setOnSlideCompleteListener(new SlideToActView.OnSlideCompleteListener() {
            @Override
            public void onSlideComplete(@NonNull SlideToActView slideToActView) {
                cw.startActivity(new Intent(cw.getApplicationContext(),MainActivity.class));
                cw.finishAffinity();
            }
        });


        p.setOnSlideCompleteListener(new SlideToActView.OnSlideCompleteListener() {
            @Override
            public void onSlideComplete(@NonNull SlideToActView slideToActView) {
                cw.startActivity(new Intent(cw.getApplicationContext(),Pposxop.class));
                cw.finishAffinity();
            }
        });

        c.setOnSlideCompleteListener(new SlideToActView.OnSlideCompleteListener() {
            @Override
            public void onSlideComplete(@NonNull SlideToActView slideToActView) {
                cw.finishAffinity();
            }
        });

    }
}


