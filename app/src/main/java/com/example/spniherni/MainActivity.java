package com.example.spniherni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast toast = Toast.makeText(getApplicationContext(),
                "Ini NKRI bukan Sunda Empire",Toast.LENGTH_SHORT);
        toast.show();

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> listView, View v, int position, long id) {
                        if (position == 0) {
                            Intent intent = new Intent(MainActivity.this, JogjaActivity.class);
                            startActivity(intent);
                        } else if (position == 1) {
                            Intent intent = new Intent(MainActivity.this, KaltaraActivity.class);
                            startActivity(intent);
                        } else if (position == 2) {
                            Intent intent = new Intent(MainActivity.this, JakartaActivity.class);
                            startActivity(intent);
                        }else if (position == 3) {
                            Toast toast = Toast.makeText(getApplicationContext(),
                                    "Coming Soon- Under Maintenance",Toast.LENGTH_LONG);
                            toast.show();

                        }
                    }
                };
        android.widget.ListView listView = (android.widget.ListView) findViewById(R.id.listProvinsi);
        listView.setOnItemClickListener(itemClickListener);

    }

}