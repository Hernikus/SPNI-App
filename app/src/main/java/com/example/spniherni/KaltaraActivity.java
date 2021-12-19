package com.example.spniherni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KaltaraActivity extends AppCompatActivity implements KaltaraListFragment.Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaltara);
    }
    public void onShowDetails(View view) {
        Intent intent = new Intent(this, DetailKaltaraFragment.class);
        startActivity(intent);
    }
    @Override
    public void itemClicked(long id) {
        Intent intent = new Intent(this, DetailKaltaraActivity.class);
        intent.putExtra(DetailKaltaraFragment.EXTRA_KALTARA_ID, (int)id);
        startActivity(intent);
    }
}