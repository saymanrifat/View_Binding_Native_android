package com.bd.saymanrifat.viewbinding_native;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.bd.saymanrifat.viewbinding_native.databinding.ActivityJavaClassBinding;

public class JavaClassActivity extends AppCompatActivity {

    ActivityJavaClassBinding mainJavaXml;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainJavaXml = ActivityJavaClassBinding.inflate(getLayoutInflater());
        setContentView(mainJavaXml.getRoot());

        mainJavaXml.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mainJavaXml.text.setText("Hi, Java");
            }
        });

        
    }
}