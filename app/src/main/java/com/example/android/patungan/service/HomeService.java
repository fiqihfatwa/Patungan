package com.example.android.patungan.service;

import com.example.android.patungan.response.HomeResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Hitfa on 10/02/2018.
 */

public interface HomeService {

    public String baseUrl = "http://192.168.43.23/patunganWeb/api/";

    @POST("proyek")
    @FormUrlEncoded
    Call<List<HomeResponse>> homeList(
            @Field("email") String email
    );
}
