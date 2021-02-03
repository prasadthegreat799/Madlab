package com.prasadthegreat.madlabmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class Madmodules extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madmodules);
    }

    public static void url_intent(Context context,String data){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(data));
        context.startActivity(intent);
    }

    public static void explict_intent(Context context1,Class context2){
        Intent intent=new Intent(context1,context2);
        context1.startActivity(intent);
    }



}