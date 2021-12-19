package com.example.spniherni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class JakartaActivity extends AppCompatActivity implements JakartaListFragment.Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jakarta);
    }
    public void onShowDetails(View view) {
        Intent intent = new Intent(this, DetailJakartaFragment.class);
        startActivity(intent);
    }
    @Override
    public void itemClicked(long id) {
        Intent intent = new Intent(this, DetailJakartaActivity.class);
        intent.putExtra(DetailJakartaFragment.EXTRA_JAKARTA_ID, (int)id);
        startActivity(intent);
    }
}