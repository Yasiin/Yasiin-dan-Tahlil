package com.rpl.yasiin;

import android.os.Bundle;
import android.app.Activity;
import org.apache.cordova.*;

public class YasiinTahlil extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}
