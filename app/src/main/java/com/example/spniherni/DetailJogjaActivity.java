package com.example.spniherni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetailJogjaActivity extends AppCompatActivity {

    public static final String EXTRA_JOGJA_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_jogja);
        DetailJogjaFragment frag = (DetailJogjaFragment)
                getSupportFragmentManager().findFragmentById(R.id.jogja_frag);
        int provinsiId = (int) getIntent().getExtras().get(EXTRA_JOGJA_ID);
        frag.setProvinsi(provinsiId);
    }
}