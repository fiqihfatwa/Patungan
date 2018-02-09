package com.example.android.patungan.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.patungan.R;
import com.example.android.patungan.adapter.ProyekSayaAdapter;
import com.example.android.patungan.model.Proyek;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProyekSayaFragment extends Fragment {

    @BindView(R.id.rv_proyeksaya)
    RecyclerView rvProyekSaya;

    List<Proyek> proyekList;
    ProyekSayaAdapter adapter;

    public ProyekSayaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_proyek_saya, container, false);
        ButterKnife.bind(this, view);

        proyekList = new ArrayList<>();
        proyekList.add(new Proyek("Reseller Kayu Manis", "22-01-2018", "Belum Bayar"));
        proyekList.add(new Proyek("Reseller Kayu Manis", "22-01-2018", "Belum Bayar"));
        adapter = new ProyekSayaAdapter(proyekList);

        rvProyekSaya.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false);
        rvProyekSaya.setLayoutManager(layoutManager);

        // Inflate the layout for this fragment
        return view;
    }

}
