package com.example.android.patungan.service;

import com.example.android.patungan.response.DetailResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Hitfa on 10/02/2018.
 */

public interface DetailService {
    public String baseUrl = "http://192.168.43.23/patunganWeb/api/";

    @POST("proyek/detail_proyek")
    @FormUrlEncoded
    Call<DetailResponse> detailData(
            @Field("id_proyek") String id_proyek
    );
}
