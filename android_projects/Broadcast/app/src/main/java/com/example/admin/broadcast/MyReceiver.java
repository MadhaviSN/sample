package com.example.admin.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equalsIgnoreCase("android.intent.action.AIRPLANE_MODE"))
        {
            Toast.makeText(context, "receiver called", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(context, "not", Toast.LENGTH_SHORT).show();
        }
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
