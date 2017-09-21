package com.example.admin.buttonpic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = getLayoutInflater();
                View appearance = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.root_layout));
                Toast toast = new Toast(MainActivity.this);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.setView(appearance);
                toast.show();
                //Toast.makeText(MainActivity.this, appearance, Toast.LENGTH_SHORT).show();

            }
        });

    }
}

