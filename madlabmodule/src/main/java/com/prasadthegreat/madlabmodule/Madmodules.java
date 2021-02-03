package com.prasadthegreat.madlabmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class Madmodules extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madmodules);


    }

    public static void url_intent(Context context,String data,Button button){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(data));
                context.startActivity(intent);
            }
        });

    }

    public static void explict_intent(Context context1,Class context2,Button button){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context1,context2);
                context1.startActivity(intent);
            }
        });

    }

    public static void time_picker(TextView txtview, Button button, TimePicker timePicker)
    {
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                int hour, minute;
                String am_pm;
                if (Build.VERSION.SDK_INT >= 23 )
                {
                    hour = timePicker.getHour();
                    minute = timePicker.getMinute();
                }
                else{
                    hour = timePicker.getCurrentHour();
                    minute =timePicker.getCurrentMinute();
                }
                if(hour > 12) {
                    am_pm = "PM";
                    hour = hour - 12;
                }
                else
                {
                    am_pm="AM";
                }
                txtview.setText("Selected Date: "+ hour +":"+ minute+" "+am_pm);
            }

        });

    }

    public static void date_picker(TextView textView, Button button, DatePicker datePicker){
        textView.setText("Current Date: "+getCurrentDate(datePicker));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Change Date: "+getCurrentDate(datePicker));
            }
        });

    }

    private static String getCurrentDate(DatePicker picker) {
        StringBuilder builder=new StringBuilder();;
        builder.append((picker.getMonth() + 1)+"/");//month is 0 based
        builder.append(picker.getDayOfMonth()+"/");
        builder.append(picker.getYear());
        return builder.toString();
    }
}