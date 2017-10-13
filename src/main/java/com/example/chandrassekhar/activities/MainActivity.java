package com.example.chandrassekhar.activities;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import static android.R.attr.color;
import static android.R.attr.data;
import static com.example.chandrassekhar.activities.R.layout.activity_main;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static int REQ_ID=101;
    int requestCode;
    FrameLayout f;
    Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        init();
    }

    private void init() {
        but=(Button)findViewById(R.id.button);
        but.setOnClickListener(this);

    }

    @Override
    public void onClick(View view){

        Intent myIntent=new Intent(MainActivity.this,MainActivity2.class);
        startActivityForResult(myIntent,REQ_ID);

         }
         protected void onActivityResult(int requestCode,int result,Intent data ){
             if(requestCode==REQ_ID){
                 if(result==RESULT_OK){
                     String color=data.getStringExtra("Selected");
                     f=(FrameLayout)findViewById(R.id.colorBox);
                     f.setBackgroundColor(Color.parseColor(color));
                 }
             }


         }

}





