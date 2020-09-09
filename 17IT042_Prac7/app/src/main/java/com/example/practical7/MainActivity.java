package com.example.practical7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner s1;
    ArrayList<String> List = new ArrayList<String>();
    LinearLayout l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List.add("Choose");
        List.add("Red");
        List.add("Green");
        List.add("Blue");
        List.add("Black");
        l1=(LinearLayout)findViewById(R.id.ll);
        s1=(Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this
                ,android.R.layout.simple_dropdown_item_1line,List);
        s1.setAdapter(arrayAdapter);
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String s = List.get(i);
                switch (s) {
                    case "Choose": {
                        l1.setBackgroundColor(Color.WHITE);
                        break;
                    }
                    case "Red": {
                        l1.setBackgroundColor(Color.RED);
                        break;
                    }
                    case "Green": {
                        l1.setBackgroundColor(Color.GREEN);
                        break;
                    }
                    case "Blue": {
                        l1.setBackgroundColor(Color.BLUE);
                        break;
                    }
                    case "Black": {
                        l1.setBackgroundColor(Color.BLACK);
                        break;
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
