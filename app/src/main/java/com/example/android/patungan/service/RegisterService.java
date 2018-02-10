package com.example.android.patungan.service;

import com.example.android.patungan.response.LoginResponse;
import com.example.android.patungan.response.RegisterResponse;
import com.example.android.patungan.response.VerifikasiResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by isadadi on 2/10/2018.
 */

public interface RegisterService {

    public String baseUrl = "http://192.168.43.23/patunganWeb/api/";

    @POST("register")
    @FormUrlEncoded
    Call<RegisterResponse> registerUser(
            @Field("email") String email,
            @Field("password") String password,
            @Field("password2") String password2,
            @Field("nama") String nama,
            @Field("hp") String hp
    );


    @POST("register/verifikasi")
    @FormUrlEncoded
    Call<VerifikasiResponse> verifikasiUser(
            @Field("email") String email,
            @Field("password") String password,
            @Field("nama") String nama,
            @Field("hp") String hp
    );


}
