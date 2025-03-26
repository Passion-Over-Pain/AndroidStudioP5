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

    String[] countryList = {"Nigeria","South-Africa","United-States","United-Kingdom","Zambia","Zimbabwe"};
    int[] countryImages = {R.drawable.nigeria, R.drawable.southafrica, R.drawable.unitedstates, R.drawable.unitedkingdom, R.drawable.zambia,R.drawable.zimbabwe};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btnGo3), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        listView = (ListView) findViewById(R.id.customCountryList);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(), countryList, countryImages);
        listView.setAdapter(customBaseAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        startActivity(new Intent(MainActivity.this,Nigeria.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this, SouthAfrica.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this, UnitedStates.class));
                        break;
                    case 3:
                        startActivity(new Intent(MainActivity.this, UnitedKingdom.class));
                        break;
                    case 4:
                        startActivity(new Intent(MainActivity.this, Zambia.class));
                        break;
                    case 5:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://zim.gov.zw/index.php/en/")));
                        break;


                }
            }
        });
    }
}