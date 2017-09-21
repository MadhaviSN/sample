
package com.example.admin.button;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.button;
import static android.R.id.button2;

public abstract class MainActivity extends Activity implements View.OnClickListener {
Button b;
    EditText e,e1;
    TextView t,t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.button2);
        e=(EditText) findViewById(R.id.editText3);
        e1=(EditText) findViewById(R.id.editText4);
        t=(TextView) findViewById(R.id.textView3);
        t1=(TextView) findViewById(R.id.textView4);
        button2.setOnClickListener(this);

    }
}
