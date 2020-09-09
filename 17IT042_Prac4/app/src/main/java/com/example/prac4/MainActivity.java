package com.example.prac4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    EditText ed;
    ToggleButton tb;
    Button sb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed = (EditText) findViewById(R.id.editText);
        tb = (ToggleButton) findViewById(R.id.toggleButton);
        sb = (Button) findViewById(R.id.button);

        sb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Please Enter temprature", Toast.LENGTH_LONG).show();
                }
                else if (tb.isChecked()){
                    Double a = Double.parseDouble(ed.getText().toString());
                    Double b = a*9/5+32;
                    String r = String.valueOf(b);
                    Toast.makeText(MainActivity.this,r+"°F",Toast.LENGTH_LONG).show();

                }
                else {
                    Double a = Double.parseDouble(ed.getText().toString());
                    Double b = a - 32;
                    Double c = b*5/9;
                    String r = String.valueOf(c);
                    Toast.makeText(MainActivity.this,r+"°C",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
