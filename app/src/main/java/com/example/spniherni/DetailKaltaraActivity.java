package com.example.spniherni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetailKaltaraActivity extends AppCompatActivity {

    public static final String EXTRA_KALTARA_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kaltara);
        DetailKaltaraFragment frag = (DetailKaltaraFragment)
                getSupportFragmentManager().findFragmentById(R.id.kaltara_frag);
        int provinsiId = (int) getIntent().getExtras().get(EXTRA_KALTARA_ID);
        frag.setProvinsi(provinsiId);
    }
}