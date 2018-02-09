package com.example.android.patungan.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.patungan.R;
import com.example.android.patungan.TambahProyekActivity;
import com.example.android.patungan.adapter.PengajuanAdapter;
import com.example.android.patungan.model.Proyek;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class PengajuanProyekFragment extends Fragment {

    @BindView(R.id.rv_pengajuan)
    RecyclerView rvPengajuan;

    @BindView(R.id.fab)
    FloatingActionButton fab;

    List<Proyek> proyekList;
    PengajuanAdapter adapter;

    public PengajuanProyekFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pengajuan_proyek, container, false);
        ButterKnife.bind(this, view);

        proyekList = new ArrayList<>();
        proyekList.add(new Proyek("Reseller Kayu Manis", 1, "09-02-2018", "10%", "5 bulan"));
        proyekList.add(new Proyek("Reseller Biji Kopi", 0, "09-02-2018", "10%", "5 bulan"));
        adapter = new PengajuanAdapter(proyekList);

        rvPengajuan.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false);
        rvPengajuan.setLayoutManager(layoutManager);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), TambahProyekActivity.class);
                view.getContext().startActivity(intent);
            }
        });

        // Inflate the layout for this fragment
        return view;
    }

}
