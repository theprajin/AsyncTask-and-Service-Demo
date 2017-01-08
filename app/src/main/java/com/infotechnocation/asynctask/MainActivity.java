package com.infotechnocation.asynctask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MyTask.onUpdateListener {

    int count = 1;
    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView)findViewById(R.id.txt);

        MyTask myTask = new MyTask(this);
        myTask.execute();

        //Intent i = new Intent(this,MyService.class);
        //startService(i);




    }

    @Override
    public void onUpdate(int num) {
        mTextView.setText("new number is "+num);
    }
}
