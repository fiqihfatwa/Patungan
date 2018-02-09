package com.example.android.patungan.service;

import com.example.android.patungan.response.LoginResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by isadadi on 2/10/2018.
 */

public interface LoginService {

    public String baseUrl = "http://192.168.43.23/patunganWeb/api/";

    @POST("login")
    @FormUrlEncoded
    Call<LoginResponse> loginUser(
        @Field("email") String email,
        @Field("password") String password
    );
}
