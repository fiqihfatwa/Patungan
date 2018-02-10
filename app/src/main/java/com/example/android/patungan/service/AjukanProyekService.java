package com.example.android.patungan.service;

import com.example.android.patungan.response.AjukanProyekResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Hitfa on 10/02/2018.
 */

public interface AjukanProyekService {
    public String baseUrl = "http://192.168.43.23/patunganWeb/api/";

    @POST("proyek/ajukan_proyek")
    @FormUrlEncoded
    Call<AjukanProyekResponse> ajukanProyek(
            @Field("proyek_nama") String nama_proyek,
            @Field("proyek_lokasi") String lokasi_proyek,
            @Field("proyek_total_dana") String jumlah_modal,
            @Field("proyek_estimasi_keuntungan") String estimasi_profit,
            @Field("proyek_email") String email,
            @Field("proyek_jlh_slot") String jlh_slot,
            @Field("proyek_jangka_waktu") String mDurasi,
            @Field("proyek_deskripsi") String mDeskripsi
    );
}
