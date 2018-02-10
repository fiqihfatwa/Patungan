package com.example.android.patungan.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.patungan.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Hitfa on 10/02/2018.
 */

public class PengajuanViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.iv_pengajuan_gambar)
    public ImageView ivPengajuanGambar;

    @BindView(R.id.tv_pengajuan_judul)
    public TextView tvPengajuanJudul;

    @BindView(R.id.tv_pengajuan_status)
    public TextView tvPengajuanStatus;

    @BindView(R.id.tv_pengajuan_insert_date)
    public TextView tvPengajuanInsertDate;

    @BindView(R.id.tv_pengajuan_profit)
    public TextView tvPengajuanProfit;

    @BindView(R.id.tv_pengajuan_periode)
    public TextView tvPengajuanPeriode;

    @BindView(R.id.tv_pengajuan_detail)
    public TextView tvPengajuanDetail;


    public PengajuanViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
