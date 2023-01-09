package com.yulia.dailynu;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Tasbih extends AppCompatActivity {

    ActionBar actionBar;

    private String textToast = "test";
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbih);

        getSupportActionBar().setTitle("back");
        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();


        mShowCount = (TextView) findViewById(R.id.showCount);
    }
    public void showToast(View view) {
        Toast toast = Toast.makeText( this,R.string.app_name,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount ++;
        if (mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));
        }
    }

    public void resetCount(View view) {
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
    }
}


