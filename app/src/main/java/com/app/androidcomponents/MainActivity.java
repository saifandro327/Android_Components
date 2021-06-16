package com.app.androidcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.app.androidcomponents.contentProvider.ContentProviderActivity;
import com.app.androidcomponents.services.ServicesActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonService, buttonContentProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonService = (Button) findViewById(R.id.servicebutton);
        buttonContentProvider = (Button) findViewById(R.id.content_provider_btn);

        buttonService.setOnClickListener(this);
        buttonContentProvider.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.servicebutton:
                startActivity(new Intent(MainActivity.this, ServicesActivity.class));
                break;
            case R.id.content_provider_btn:
                Intent intent=new Intent(MainActivity.this, ContentProviderActivity.class);
                startActivity(intent);

                break;
        }
    }
}