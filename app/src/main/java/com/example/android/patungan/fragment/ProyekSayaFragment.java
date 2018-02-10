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
import com.example.android.patungan.response.ProyekSayaResponse;
import com.example.android.patungan.service.ProyekSayaService;

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

    private void LoadData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ProyekSayaService.baseUrl)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        ProyekSayaService service = retrofit.create(ProyekSayaService.class);

        service.proyeksayaList("fiqihfatwa@gmail.com").enqueue(new Callback<List<ProyekSayaResponse>>() {
            @Override
            public void onResponse(Call<List<ProyekSayaResponse>> call, Response<List<ProyekSayaResponse>> response) {
                List<ProyekSayaResponse> hasil = response.body();

                proyekList.clear();
                for (ProyekSayaResponse proyeksaya : hasil) {
                    proyekList.add(new Proyek(proyeksaya.getProyekNama(), proyeksaya.getSlotDate(), proyeksaya.getStatusPemabayran()));
                }

                adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<ProyekSayaResponse>> call, Throwable t) {

            }
        });
    }

}
