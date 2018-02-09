package com.example.android.patungan.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.patungan.R;
import com.example.android.patungan.adapter.MainAdapter;
import com.example.android.patungan.model.Proyek;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    @BindView(R.id.rv_main)
    RecyclerView rvMain;
    List<Proyek> proyekList;
    MainAdapter adapter;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, view);

        proyekList = new ArrayList<>();
        proyekList.add(new Proyek("Reseller Kayu Manis", "Fiqih Fatwa", "09-02-2018", "10%", "5 bulan"));
        proyekList.add(new Proyek("Reseller Biji Kopi", "M. Sakta Akbari", "09-02-2018", "10%", "5 bulan"));
        adapter = new MainAdapter(proyekList);

        rvMain.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false);
        rvMain.setLayoutManager(layoutManager);

        // Inflate the layout for this fragment
        return view;
    }

}
