package com.infotechnocation.asynctask;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by Prajin Bajracharya on 1/8/2017.
 */

public class MyService extends Service {


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();



        Thread mThread=new Thread(new Runnable() {
            @Override
            public void run() {
                int count = 1;
                while(count>0){
                    Log.e("infinity","infinity");
                }
            }
        });

        mThread.start();

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        return super.onStartCommand(intent, flags, startId);
    }
}
