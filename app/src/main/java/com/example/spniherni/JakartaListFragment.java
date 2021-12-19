package com.example.spniherni;

import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class JakartaListFragment extends ListFragment {

    static interface Listener {
        void itemClicked(long id);
    };
    private JakartaListFragment.Listener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] names = new String[Jakarta.DAFTAR_JAKARTA.length];
        for (int i = 0; i < names.length; i++) {
            names[i] = Jakarta.DAFTAR_JAKARTA[i].getKabupatenKota();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                inflater.getContext(), android.R.layout.simple_list_item_1, names);
        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.listener = (JakartaListFragment.Listener)context;
    }
    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id) {
        if (listener != null) {
            listener.itemClicked(id);
        }
    }
}