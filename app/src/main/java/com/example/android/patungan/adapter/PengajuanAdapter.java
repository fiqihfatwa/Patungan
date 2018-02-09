package com.example.android.patungan.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.patungan.DetailActivity;
import com.example.android.patungan.R;
import com.example.android.patungan.model.Proyek;
import com.example.android.patungan.viewholder.PengajuanViewHolder;

import java.util.List;

/**
 * Created by Hitfa on 10/02/2018.
 */

public class PengajuanAdapter extends RecyclerView.Adapter<PengajuanViewHolder> {

    private List<Proyek> listPengajuan;

    public PengajuanAdapter(List<Proyek> mListPengajuan) {
        listPengajuan = mListPengajuan;
    }

    @Override
    public PengajuanViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pengajuan, parent, false);

        return new PengajuanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PengajuanViewHolder holder, int position) {
        Proyek data = listPengajuan.get(position);

        holder.tvPengajuanJudul.setText(data.getJudul());
        holder.tvPengajuanStatus.setText(data.getOleh());
        holder.tvPengajuanInsertDate.setText(data.getInsertDate());
        holder.tvPengajuanProfit.setText(data.getProfit());
        holder.tvPengajuanPeriode.setText(data.getPeriode());
        holder.tvPengajuanDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), DetailActivity.class);
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPengajuan.size();
    }
}
