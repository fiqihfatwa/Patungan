package com.example.android.patungan.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.android.patungan.R;
import com.example.android.patungan.adapter.MainAdapter;
import com.example.android.patungan.model.Proyek;
import com.example.android.patungan.response.HomeResponse;
import com.example.android.patungan.service.HomeService;

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
        adapter = new MainAdapter(proyekList);

        rvMain.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false);
        rvMain.setLayoutManager(layoutManager);

        LoadData();

        // Inflate the layout for this fragment
        return view;
    }

    private void LoadData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(HomeService.baseUrl)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        HomeService service = retrofit.create(HomeService.class);

        service.homeList("fiqihfatwa@gmail.com").enqueue(new Callback<List<HomeResponse>>() {
            @Override
            public void onResponse(Call<List<HomeResponse>> call, Response<List<HomeResponse>> response) {
                List<HomeResponse> hasil = response.body();

                proyekList.clear();
                for (HomeResponse pengajuan : hasil) {
                    proyekList.add(new Proyek(pengajuan.getNamaProyek(), pengajuan.getNama(), pengajuan.getTanggal(), pengajuan.getEstimasiProfit(), pengajuan.getPeriode(), pengajuan.getGambar(), pengajuan.getDeskripsi(), pengajuan.getIdProyek()));
                }

                adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<HomeResponse>> call, Throwable t) {
                Toast.makeText(getContext(), "Gagal konek", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
