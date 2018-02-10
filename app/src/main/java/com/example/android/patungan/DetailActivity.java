package com.example.android.patungan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity {

    String kdk, simulasi;

    @BindView(R.id.tv_detail_kdk)
    TextView tvDetailKdk;

    @BindView(R.id.tv_detail_simulasi)
    TextView tvDetailSimulasi;

    @BindView(R.id.tv_detail_oleh)
    TextView tvDetailOleh;

    @BindView(R.id.tv_detail_judul)
    TextView tvDetailJudul;

    @BindView(R.id.tv_detail_deskripsi)
    TextView tvDetailDeskripsi;

    @BindView(R.id.ivGambarDetail)
    ImageView ivMainGambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);

        String kdk =
                "<ol type=1>" +
                        "<li> Jumlah slot yang ingin didanai tidak dibatasi selama slot tersedia.</li>" +
                        "<li> Jumlah nominal pendanaan 1 slot ada lah senilai " + "<b> Rp 10000000,- </b></li>" +
                        "<li> Kesepakatan pembagian hasil keuntungan dari proyek adalah sebanyak masing - masing 50% untuk pemodal dan pemilik usaha dari total keuntungan bersih.</li>" +
                        "<li> Estimasi Keuntungan pada proyek ini adalah sebesar " + "<b> 30% </b>.</li>" +
                        "<li> Pemilik usaha yang mengajukan patungan modal sudah terverivikasi oleh pihak Platform Patungan.</li>" +
                        "<li> Segala transaksi yang terjadi diawasi oleh pihak Platform Patungan melaui rekening bersama.</li>" + " </ol>";

        String simulasi =
                "Simulasi perhitungan keuntungan (1 slot). <br>" +
                        "Nominal Investasi: " + "<b>10.000.000,00 </b><br>" +
                        "Profit 1 slot: " + "<b> 3.000.000,00 </b> <br>" +
                        "Uang yang Anda dapatkan setelah akhir periode bulan: " + " <b> 11.500.000,00 </b>";

        Intent intent = getIntent();

        String url_gambar = intent.getStringExtra("URL_GAMBAR");
        String oleh = intent.getStringExtra("OLEH");
        String name = intent.getStringExtra("JUDUL");
        String deskripsi = intent.getStringExtra("DESKRIPSI");

        tvDetailKdk.setText(Html.fromHtml(kdk));
        tvDetailSimulasi.setText(Html.fromHtml(simulasi));

        Glide.with(this).load(url_gambar).into(ivMainGambar);

        tvDetailOleh.setText(oleh);
        tvDetailJudul.setText(name);
        tvDetailDeskripsi.setText(deskripsi);

    }


}
