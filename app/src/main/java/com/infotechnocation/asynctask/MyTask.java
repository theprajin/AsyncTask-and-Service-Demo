package com.infotechnocation.asynctask;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

/**
 * Created by Prajin Bajracharya on 1/8/2017.
 */

public class MyTask extends AsyncTask<String ,Integer, String> {


    onUpdateListener monUpdateListener ;

    public MyTask(onUpdateListener context) {
        monUpdateListener = context;
    }

    @Override
    protected String doInBackground(String... params) {
        int count = 100;



        for(int i=count;i>=0;i--){
            Log.e("infinity", "infinity");
            publishProgress(i);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        if(monUpdateListener!=null){
            monUpdateListener.onUpdate(values[0]);
        }

    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }

    public interface onUpdateListener{
        void onUpdate(int num);
    }
}
