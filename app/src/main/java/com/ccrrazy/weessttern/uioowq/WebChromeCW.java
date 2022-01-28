package com.ccrrazy.weessttern.uioowq;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.annotation.RequiresApi;

public class WebChromeCW extends WebChromeClient {

    CW cw;

    public WebChromeCW(CW cw) {
        this.cw = cw;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public boolean onShowFileChooser(WebView view,
                                     ValueCallback<Uri[]> filePath,
                                     FileChooserParams fileChooserParams) {

        if (cw.omads != null) {
            cw.omads.onReceiveValue(null);
        }
        cw.omads = filePath;
        Intent contentSelectionIntent = new Intent(Intent.ACTION_GET_CONTENT);
        contentSelectionIntent.addCategory(Intent.CATEGORY_OPENABLE);
        contentSelectionIntent.setType("*/*");
        Intent[] intentArray = new Intent[0];
        Intent chooserIntent = new Intent(Intent.ACTION_CHOOSER);
        chooserIntent.putExtra(Intent.EXTRA_INTENT, contentSelectionIntent);
        chooserIntent.putExtra(Intent.EXTRA_TITLE, MainActivity.mmm("U2VsZWN0IE9wdGlvbjo="));
        chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, intentArray);
        cw.startActivityForResult(chooserIntent, 1);
        return true;
    }
}
