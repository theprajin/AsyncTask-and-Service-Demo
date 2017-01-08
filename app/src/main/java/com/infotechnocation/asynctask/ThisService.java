package com.infotechnocation.asynctask;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Prajin Bajracharya on 1/8/2017.
 */

public class ThisService extends IntentService {

    public ThisService() {
        super("intentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        int count = 1;
        while(count>0){
            Log.e("infinity","infinity");
        }

    }
}
