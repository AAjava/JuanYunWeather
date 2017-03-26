package com.example.administrator.juanyunweather;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.juanyunweather.util.LogUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogUtil.level=LogUtil.NOTHING;
        SharedPreferences sharedPreferences= PreferenceManager.getDefaultSharedPreferences(this);
        String weather=sharedPreferences.getString("weather",null);
        if(weather!=null){
            Intent intent=new Intent(this, WeatherActivity.class);
            startActivity(intent);
            finish();
        }

    }
}
