package com.example.spniherni;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class DetailJakartaActivity extends AppCompatActivity {

    public static final String EXTRA_JAKARTA_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_jakarta);
        DetailJakartaFragment frag = (DetailJakartaFragment)
                getSupportFragmentManager().findFragmentById(R.id.jakarta_frag);
        int provinsiId = (int) getIntent().getExtras().get(EXTRA_JAKARTA_ID);
        frag.setProvinsi(provinsiId);
    }
}