package com.example.android.patungan.viewholder;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.android.patungan.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Hitfa on 10/02/2018.
 */

public class ProyekSayaViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.tv_proyeksaya_judul)
    public TextView tvProyekSayaJudul;

    @BindView(R.id.tv_proyeksaya_date)
    public TextView tvProyekSayaDate;

    @BindView(R.id.tv_proyeksaya_status)
    public TextView tvProyekSayaStatus;

    @BindView(R.id.card_view_proyeksaya)
    public CardView cvProyekSaya;

    public ProyekSayaViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
