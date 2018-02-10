package com.example.android.patungan;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.android.patungan.response.AjukanProyekResponse;
import com.example.android.patungan.service.AjukanProyekService;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class TambahProyekActivity extends AppCompatActivity {

    @BindView(R.id.nama_proyek)
    TextInputEditText namaProyek;

    @BindView(R.id.lokasi_proyek)
    TextInputEditText lokasiProyek;

    @BindView(R.id.jumlah_modal)
    TextInputEditText jumlahModal;

    @BindView(R.id.estimasi_profit)
    TextInputEditText estimasiProfit;

    @BindView(R.id.durasi)
    TextInputEditText durasi;

    @BindView(R.id.deskripsi)
    EditText deskripsi;

    @BindView(R.id.jlh_slot)
    TextInputEditText jumlahSlot;

    @BindView(R.id.bSaveProyek)
    Button bSaveProyek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_proyek);
        ButterKnife.bind(this);

        bSaveProyek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nama_proyek = namaProyek.getText().toString();
                String lokasi_proyek = lokasiProyek.getText().toString();
                String jumlah_modal = jumlahModal.getText().toString();
                String estimasi_profit = estimasiProfit.getText().toString();
                String mDurasi = durasi.getText().toString();
                String mDeskripsi = deskripsi.getText().toString();
                String mJumlahSLot = jumlahSlot.getText().toString();

                String email = "fiqihfatwa@gmail.com";

                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(AjukanProyekService.baseUrl)
                        .addConverterFactory(JacksonConverterFactory.create())
                        .build();

                AjukanProyekService service = retrofit.create(AjukanProyekService.class);

                service.ajukanProyek(nama_proyek, lokasi_proyek, jumlah_modal, estimasi_profit, email, mJumlahSLot, mDurasi, mDeskripsi).enqueue(new Callback<AjukanProyekResponse>() {
                    @Override
                    public void onResponse(Call<AjukanProyekResponse> call, Response<AjukanProyekResponse> response) {
                        AjukanProyekResponse result = response.body();

                        Log.d("haha", "" + result);

                        if (result.getFailed()) {
                            Toast.makeText(TambahProyekActivity.this, "Berhasil Menyimpan", Toast.LENGTH_SHORT).show();
                            finish();
                        }
                    }

                    @Override
                    public void onFailure(Call<AjukanProyekResponse> call, Throwable t) {
                        Toast.makeText(TambahProyekActivity.this, "Gagal Menyimpan", Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });

    }
}
