package com.example.android.patungan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.example.android.patungan.response.VerifikasiResponse;
import com.example.android.patungan.service.RegisterService;

import butterknife.BindView;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class VerifikasiActivity extends AppCompatActivity {

    @BindView(R.id.editTextVerifikasi)
    EditText editTextVerifikasi;
    String email, hp, nama, password,kode,kode2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verifikasi);
    }

    @OnClick(R.id.btn_verifikasi)
    void verifikasi(){
        Bundle extra = getIntent().getExtras();
        email = extra.getString("email");
        hp = extra.getString("hp");
        nama = extra.getString("nama");
        password = extra.getString("password");
        kode = extra.getString("kode");

        kode2 = editTextVerifikasi.getText().toString();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(RegisterService.baseUrl).addConverterFactory(JacksonConverterFactory.create())
                .build();

        RegisterService verifikasi = retrofit.create(RegisterService.class);
        verifikasi.verifikasiUser(email,password,nama,hp).enqueue(new Callback<VerifikasiResponse>() {
            @Override
            public void onResponse(Call<VerifikasiResponse> call, Response<VerifikasiResponse> response) {
                VerifikasiResponse result = response.body();
                if(result.getFailed().equals(0)){
                    Intent intent = new Intent(VerifikasiActivity.this,LoginActivity.class);
                    startActivity(intent);
                    finish();
                }
            }

            @Override
            public void onFailure(Call<VerifikasiResponse> call, Throwable t) {
                Toast.makeText(VerifikasiActivity.this, "Error : "+t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
