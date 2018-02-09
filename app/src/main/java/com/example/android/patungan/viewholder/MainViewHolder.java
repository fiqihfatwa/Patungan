package com.example.android.patungan.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.patungan.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Hitfa on 09/02/2018.
 */

public class MainViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.iv_main_gambar)
    public ImageView ivMainGambar;

    @BindView(R.id.tv_main_judul)
    public TextView tvMainJudul;

    @BindView(R.id.tv_main_oleh)
    public TextView tvMainOleh;

    @BindView(R.id.tv_main_insert_date)
    public TextView tvMainInsertDate;

    @BindView(R.id.tv_main_profit)
    public TextView tvMainProfit;

    @BindView(R.id.tv_main_periode)
    public TextView tvMainPeriode;

    @BindView(R.id.tv_main_detail)
    public TextView tvMainDetail;

    public MainViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
