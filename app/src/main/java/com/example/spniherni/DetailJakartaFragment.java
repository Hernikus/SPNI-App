package com.example.spniherni;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailJakartaFragment extends Fragment {

    public static final String EXTRA_JAKARTA_ID = "id";
    private long provinsiId;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_jakarta, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView kabupatenKota = (TextView) view.findViewById(R.id.textTitle2);
            Jakarta jakarta = Jakarta.DAFTAR_JAKARTA[(int) provinsiId];
            kabupatenKota.setText(jakarta.getKabupatenKota());
            TextView deskripsi = (TextView) view.findViewById(R.id.textDescription2);
            deskripsi.setText(jakarta.getDeskripsi());
        }
    }

    public void setProvinsi(long id) {
        this.provinsiId = id;
    }
}