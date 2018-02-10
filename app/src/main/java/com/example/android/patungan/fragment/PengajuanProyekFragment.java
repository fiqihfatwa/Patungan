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
import android.widget.Toast;

import com.example.android.patungan.R;
import com.example.android.patungan.TambahProyekActivity;
import com.example.android.patungan.adapter.PengajuanAdapter;
import com.example.android.patungan.model.Proyek;
import com.example.android.patungan.response.PengajuanResponse;
import com.example.android.patungan.service.PengajuanService;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

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
        //proyekList.add(new Proyek("jhdjhjd", "29-01-2018", "10 - 13%", "skjd", "hdjhdj"));
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

        LoadData();

        // Inflate the layout for this fragment
        return view;
    }

    private void LoadData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(PengajuanService.baseUrl)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        PengajuanService service = retrofit.create(PengajuanService.class);

        service.pengajuanList("fiqihfatwa@gmail.com").enqueue(new Callback<List<PengajuanResponse>>() {
            @Override
            public void onResponse(Call<List<PengajuanResponse>> call, Response<List<PengajuanResponse>> response) {
                List<PengajuanResponse> hasil = response.body();

                proyekList.clear();
                for (PengajuanResponse pengajuan : hasil) {
                    proyekList.add(new Proyek(pengajuan.getProyekNama(), pengajuan.getProyekStatus(), pengajuan.getProyekInsertDate(), pengajuan.getProyekEstimasiKeuntungan(), pengajuan.getProyekJangkaWaktu(), pengajuan.getProyekGambar(), pengajuan.getProyekDeskripsi(), pengajuan.getProyekId()));
                }

                adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<PengajuanResponse>> call, Throwable t) {
                Toast.makeText(getContext(), "Gagal konek", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
