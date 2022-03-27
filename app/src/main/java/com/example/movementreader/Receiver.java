package com.example.movementreader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Receiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Receiver Recieved - Not Good", Toast.LENGTH_SHORT).show();
    }
}
