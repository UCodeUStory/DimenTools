package com.wangpos.dimentools;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.content.FileProvider;
import android.text.TextUtils;
import android.util.Log;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView)findViewById(R.id.tvContent);
        TextView tvReal = (TextView)findViewById(R.id.tvReal);
        TextView tvDpi = (TextView)findViewById(R.id.tvDpi);
        TextView tvDescription = (TextView)findViewById(R.id.tv_description);

        IntentFilter intentFilter = new IntentFilter();

        int width = getDimen();

        DisplayMetrics metrics = getResources().getDisplayMetrics();
        tvReal.setText("机器分辨率"+metrics.heightPixels+"x"+metrics.widthPixels);
        tvDpi.setText("DPI "+metrics.density);
        tvDescription.setText("" +
                "举个例子 相同分辨率720x1280,屏幕大小都为5寸，但是一个是16：9,一个是18：9，当我们设置50px高度给控件时，18:9的明显更高" +
                "因此我们使用dp作为单位，使用px不准确" +
                "，但是当dpi也相同时，我们使用dp会按照dpi转化成px，这时18：9的还是会显得高");




         switch (width){
             case 1:
                 tv.setText("values-800x480");
                 break;
             case 2:
                 tv.setText("values-854x480");
                 break;
             case 3:
                 tv.setText("values-960x540");
                 break;
             case 4:
                 tv.setText("values-960x640");
                 break;
             case 5:
                 tv.setText("values-1024x600");
                 break;
             case 6:
                 tv.setText("values-1280x720");
                 break;
             case 7:
                 tv.setText("values-1280x800");
                 break;
         }

    }


    /**
     * 判断实际获取的资源文件夹
     * @return
     */
    private  int getDimen(){
        int width = (int)getResources().getDimension(R.dimen.width);
        return width;
    }


}
