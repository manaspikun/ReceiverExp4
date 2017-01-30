package com.techpalle.receiverexp4;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button,button2,button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= (Button) findViewById(R.id.button1);
        button2= (Button) findViewById(R.id.button2);
        button5= (Button) findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //start receiver
                Intent intent=new Intent();//implicit intent
                intent.setAction("batch34");
//                sendBroadcast(intent);
                sendOrderedBroadcast(intent,null);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startservice
              //  Intent intent=new Intent(MainActivity.this,MyService.class);//explicit intent
                Intent intent=new Intent();//implicit intent
                intent.setAction("java");
                startService(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();//implicit intent
                intent.setAction("STICKY_TEST");
                sendStickyBroadcast(intent);
            }
        });
    }
}
