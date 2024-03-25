package com.example.callurl;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.browser.customtabs.CustomTabsIntent;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button openUrlButton = findViewById(R.id.openUrlButton);
        openUrlButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // La URL que quieres abrir
                String url = "https://leodiazdev.github.io/react-useragent-app/";

                // Crear un nuevo intent de Chrome Custom Tabs
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                CustomTabsIntent customTabsIntent = builder.build();

                // Lanzar la URL
                customTabsIntent.launchUrl(MainActivity.this, Uri.parse(url));
            }
        });
    }
}
