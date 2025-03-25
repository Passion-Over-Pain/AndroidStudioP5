package com.example.practical5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    String[] smoothieList = {"Tropical","Peach-plum","Melon-lemon","Hulk-classic","Berrific","Smoothie Site"};
    int[] smoothieImages = {R.drawable.tropical, R.drawable.peachplum, R.drawable.melonlemon, R.drawable.hulkclassic, R.drawable.berrific,R.drawable.gingermangoberry};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        listView = (ListView) findViewById(R.id.customSmoothieList);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(), smoothieList, smoothieImages);
        listView.setAdapter(customBaseAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        startActivity(new Intent(MainActivity.this,Tropical.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this,PeachPlum.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this,MelonLemon.class));
                        break;
                    case 3:
                        startActivity(new Intent(MainActivity.this,HulkClassic.class));
                        break;
                    case 4:
                        startActivity(new Intent(MainActivity.this,Berrific.class));
                        break;
                    case 5:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.thesmoothiesite.com")));
                        break;


                }
            }
        });
    }
}