package com.wangpos.dimentools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView)findViewById(R.id.tvContent);
        TextView tvReal = (TextView)findViewById(R.id.tvReal);
        TextView tvDpi = (TextView)findViewById(R.id.tvDpi);


         int width = getDimen();

        DisplayMetrics metrics = getResources().getDisplayMetrics();
        tvReal.setText("机器分辨率"+metrics.heightPixels+"x"+metrics.widthPixels);
        tvDpi.setText("DPI "+metrics.density);
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



    private  int getDimen(){
        int width = (int)getResources().getDimension(R.dimen.width);
        return width;
    }



}
