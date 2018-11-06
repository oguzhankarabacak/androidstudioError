package com.oguzhankarabacak.instagramcloneparseexample;

import android.app.Application;

import com.parse.Parse;

public class ParseStarterActivity extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        Parse.initialize(new Parse.Configuration.Builder(this)
        .applicationId("Zy932Wbzw2P3E1hthGKfK06SP8POovqfZWV5FZo3")
        .clientKey("2cZFBkQZkSGkqzpkWvpaGeIVXVO9MzZcBMHQRTMr")
        .server("https://parseapi.back4app.com/")
        .build()
        );
    }
}
