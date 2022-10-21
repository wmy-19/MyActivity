package com.example.work2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.util.Log;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Log.d("WeChat","这是ResultActivity的创建onCreate");
        Intent intent=new Intent();
        intent.putExtra("data","今天是安卓课"+"上课时间是："+ Calendar.getInstance().getTime());
    setResult(888,intent);
    finish();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("WeChat","这是ResultActivity的启动onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("WeChat","这是ResultActivity的停止onStop");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("WeChat","这是ResultActivity的恢复onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("WeChat","这是ResultActivity的暂停onPause");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("WeChat","这是ResultActivity的重启onRestart");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("WeChat","这是ResultActivity的销毁onDestroy");
    }
}