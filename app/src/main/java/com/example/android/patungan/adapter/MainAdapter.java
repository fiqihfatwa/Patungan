package com.example.android.patungan.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.patungan.R;
import com.example.android.patungan.model.Proyek;
import com.example.android.patungan.viewholder.MainViewHolder;

import java.util.List;

/**
 * Created by Hitfa on 09/02/2018.
 */

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    private List<Proyek> listMain;

    public MainAdapter(List<Proyek> mListMain) {
        listMain = mListMain;
    }


    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main, parent, false);

        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, int position) {
        Proyek data = listMain.get(position);

        holder.tvMainJudul.setText(data.getJudul());
        holder.tvMainOleh.setText(data.getOleh());
        holder.tvMainInsertDate.setText(data.getInsertDate());
        holder.tvMainProfit.setText(data.getProfit());
        holder.tvMainPeriode.setText(data.getPeriode());
    }

    @Override
    public int getItemCount() {
        return listMain.size();
    }
}
