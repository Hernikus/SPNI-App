package com.example.spniherni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class JogjaActivity extends AppCompatActivity implements JogjaListFragment.Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogja);
    }
    public void onShowDetails(View view) {
        Intent intent = new Intent(this, DetailJogjaFragment.class);
        startActivity(intent);
    }
    @Override
    public void itemClicked(long id) {
        Intent intent = new Intent(this, DetailJogjaActivity.class);
        intent.putExtra(DetailJogjaFragment.EXTRA_JOGJA_ID, (int)id);
        startActivity(intent);
    }
}