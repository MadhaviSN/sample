package com.example.admin.autooooooooo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {
    AutoCompleteTextView auto;
    String[] s={"Shrre Hari","Chandra mavli","Gagan","viknath","Neha","Nikita","Danya Shree","Shafina","Madhu Shree"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        auto=findViewById(R.id.autoCompleteTextView);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,s);
        auto.setAdapter(adapter);
        auto.setThreshold(1);


    }
}
