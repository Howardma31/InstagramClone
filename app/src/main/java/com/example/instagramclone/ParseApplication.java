package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();
        
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("WvBNeiVCKnU2tkJ93GIIFKdweyiBpDw3DAKDeLYf")
                .clientKey("W2SEYDRLDe6QDw0YFfIvSXULhipzqLJbKX335RQB")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
