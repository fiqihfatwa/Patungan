package com.example.android.patungan.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.patungan.DetailProyekSayaActivity;
import com.example.android.patungan.R;
import com.example.android.patungan.model.Proyek;
import com.example.android.patungan.viewholder.ProyekSayaViewHolder;

import java.util.List;

/**
 * Created by Hitfa on 10/02/2018.
 */

public class ProyekSayaAdapter extends RecyclerView.Adapter<ProyekSayaViewHolder> {

    private List<Proyek> listProyekSaya;

    public ProyekSayaAdapter(List<Proyek> mListProyekSaya) {
        listProyekSaya = mListProyekSaya;
    }

    @Override
    public ProyekSayaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_proyek_saya, parent, false);

        return new ProyekSayaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProyekSayaViewHolder holder, int position) {
        Proyek data = listProyekSaya.get(position);

        holder.tvProyekSayaJudul.setText(data.getJudul());
        holder.tvProyekSayaDate.setText(data.getInsertDate());
        holder.tvProyekSayaStatus.setText(data.getStatusPembayaran());

        holder.cvProyekSaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), DetailProyekSayaActivity.class);
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listProyekSaya.size();
    }
}
