package com.example.spniherni;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailKaltaraFragment extends Fragment {

    public static final String EXTRA_KALTARA_ID = "id";
    private long provinsiId;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_kaltara, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView kabupatenKota = (TextView) view.findViewById(R.id.textTitle3);
            Kaltara kaltara = Kaltara.DAFTAR_KALTARA[(int) provinsiId];
            kabupatenKota.setText(kaltara.getKabupatenKota());
            TextView deskripsi = (TextView) view.findViewById(R.id.textDescription3);
            deskripsi.setText(kaltara.getDeskripsi());
        }
    }

    public void setProvinsi(long id) {
        this.provinsiId = id;
    }
}