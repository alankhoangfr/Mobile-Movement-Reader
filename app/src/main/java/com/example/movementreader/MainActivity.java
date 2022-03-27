package com.example.movementreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendBroadcast(view);
            }
        });
    }
    private void sendBroadcast(View v){
        Intent intent = new Intent();
        ComponentName cn = new ComponentName("com.example.helloworld","com.example.helloworld.BroadcastReceiver");
        intent.setComponent(cn);
        sendBroadcast(intent);
    }
}