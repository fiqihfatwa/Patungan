package com.example.android.patungan.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.patungan.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PengajuanProyekFragment extends Fragment {


    public PengajuanProyekFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pengajuan_proyek, container, false);
    }

}
