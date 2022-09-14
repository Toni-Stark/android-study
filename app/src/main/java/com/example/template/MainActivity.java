package com.example.template;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        mShowCount = (TextView) findViewById(R.id.textView2);
        Log.d("MainActivity", "[log]------------------");
        Log.d("MainActivity", "HappyBirthday~~~");
        Log.d("MainActivity", "[log]------------------");
    }

    public void setCount(int count) {
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(count));
        }
//        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
//        toast.show();
    }

    public void addShowToast(View view) {
        mCount++;
        setCount(mCount);
    }

    public void deleteShowToast(View view) {
        mCount--;
        setCount(mCount);
    }
}