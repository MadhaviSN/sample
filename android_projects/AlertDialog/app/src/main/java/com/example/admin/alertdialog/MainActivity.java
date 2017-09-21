package com.example.admin.alertdialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    EditText e;
    EditText e1;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e = (EditText) findViewById(R.id.editText2);
        e1 = (EditText) findViewById(R.id.editText);
        b = (Button) findViewById(R.id.button);
    }
        public void OnBackPressed()
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Info");
        builder.setCancelable(false);
        builder.setMessage("Do you want to exit");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.setNegativeButton("No",null);
        builder.show();
    }
    }

