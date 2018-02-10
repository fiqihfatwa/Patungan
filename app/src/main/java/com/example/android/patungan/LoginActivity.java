package com.example.android.patungan;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.patungan.DBHandler.SQLiteHandler;
import com.example.android.patungan.response.LoginResponse;
import com.example.android.patungan.service.LoginService;

import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class LoginActivity extends AppCompatActivity {


    @BindView(R.id.et_email)
    TextView tvEmail;

    @BindView(R.id.et_password)
    TextView tvPassword;

    ProgressDialog progressDialog;
    SQLiteHandler db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        db = new SQLiteHandler(this);
        if(db.cek_user()){
            HashMap<String,String> user = db.getUserDetails();
            Log.d("database","ada usernya "+user.get("email"));
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Mohon menunggu");
        progressDialog.setCancelable(false);
        progressDialog.setCanceledOnTouchOutside(false);




    }


    @OnClick(R.id.b_login)
    void cek_login(){
        String email = tvEmail.getText().toString();
        String password = tvPassword.getText().toString();

        if (email.isEmpty()){
            tvEmail.setError("Username harus diisi");
            return;
        } else {
            tvEmail.setError(null);
        }

        if (password.isEmpty()){
            tvPassword.setError("Password harus diisi");
            return;
        } else {
            tvPassword.setError(null);
        }

        progressDialog.show();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(LoginService.baseUrl)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        LoginService loginService = retrofit.create(LoginService.class);

        loginService.loginUser(email, password).enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {

                LoginResponse result = response.body();
                if(result.getFailed().equalsIgnoreCase("0")) {
                    db.addUser(result.getEmail().toString(), result.getNama().toString(),
                            result.getAlamat().toString(), result.getTelepon().toString(), result.getNamaBank().toString(),
                            result.getAnBank().toString(), result.getNoRekening().toString(), result.getKtp().toString());

                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }else{
                    Toast.makeText(LoginActivity.this, "Username atau Password Salah", Toast.LENGTH_SHORT).show();
                }
                progressDialog.hide();


            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                progressDialog.hide();
                Toast.makeText(LoginActivity.this, "Error: "+t.getMessage(), Toast.LENGTH_SHORT).show();
                Log.d("LoginError", "Error: "+t.getMessage());
            }
        });
    }
}
