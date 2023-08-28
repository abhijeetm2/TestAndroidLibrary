package com.example.android_demo_lib;

import android.util.Log;

public class HelloWorld {
    private static final String TAG = "HelloWorld";
    public static void main(String tag, String message){

    }

    public static void printLog(String message){
        Log.d(TAG, "printLog: "+message);
    }

}
