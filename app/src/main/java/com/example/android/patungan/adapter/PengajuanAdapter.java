package com.example.android.patungan.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.android.patungan.DetailPengajuanActivity;
import com.example.android.patungan.R;
import com.example.android.patungan.model.Proyek;
import com.example.android.patungan.viewholder.PengajuanViewHolder;

import java.util.List;

/**
 * Created by Hitfa on 10/02/2018.
 */

public class PengajuanAdapter extends RecyclerView.Adapter<PengajuanViewHolder> {

    private List<Proyek> listPengajuan;
    private View view;
    public PengajuanAdapter(List<Proyek> mListPengajuan) {
        listPengajuan = mListPengajuan;
    }

    @Override
    public PengajuanViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pengajuan, parent, false);

        return new PengajuanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PengajuanViewHolder holder, int position) {
        final Proyek data = listPengajuan.get(position);

        holder.tvPengajuanJudul.setText(data.getJudul());
        holder.tvPengajuanStatus.setText(data.getOleh());
        holder.tvPengajuanInsertDate.setText(data.getInsertDate());
        holder.tvPengajuanProfit.setText(data.getProfit());
        holder.tvPengajuanPeriode.setText(data.getPeriode());
        holder.tvPengajuanDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), DetailPengajuanActivity.class);
                intent.putExtra("URL_GAMBAR", data.getUrl_gambar());
                intent.putExtra("JUDUL", data.getJudul());
                intent.putExtra("OLEH", data.getOleh());
                intent.putExtra("DESKRIPSI", data.getDeskripsi());
                view.getContext().startActivity(intent);
            }
        });

       Glide.with(view.getContext()).load(data.getUrl_gambar()).into(holder.ivPengajuanGambar);
    }

    @Override
    public int getItemCount() {
        return listPengajuan.size();
    }
}
