package com.example.android.patungan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;

import com.example.android.patungan.response.LoginResponse;
import com.example.android.patungan.response.RegisterResponse;
import com.example.android.patungan.service.RegisterService;

import butterknife.BindView;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RegisterActivity extends AppCompatActivity {

    @BindView(R.id.teEmail)
    EditText teEmail;

    @BindView(R.id.teHP)
    EditText teHP;

    @BindView(R.id.teName)
    EditText teName;

    @BindView(R.id.tePassword2)
    EditText tePassword2;

    @BindView(R.id.tePassword)
    EditText tePassword;

    String email;
    String hp;
    String nama;
    String password;
    String password2,kode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    @OnClick(R.id.btnSubmitResigter)
    void daftar_user(){
        email = teEmail.getText().toString();
        hp = teEmail.getText().toString();
        nama = teName.getText().toString();
        password = tePassword.getText().toString();
        password2 = tePassword2.getText().toString();



        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(RegisterService.baseUrl)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        RegisterService registerService = retrofit.create(RegisterService.class);

        registerService.registerUser(email,password,password2,nama,hp).enqueue(new Callback<RegisterResponse>() {
            @Override
            public void onResponse(Call<RegisterResponse> call, Response<RegisterResponse> response) {
                RegisterResponse result = response.body();

                if(result.getFailed().equalsIgnoreCase("0")){
                    Intent intent = new Intent(RegisterActivity.this, VerifikasiActivity.class);

                    intent.putExtra("email", email);
                    intent.putExtra("hp", hp);
                    intent.putExtra("nama", nama);
                    intent.putExtra("kode",result.getKode());
                    intent.putExtra("password", password);
                    intent.putExtra("password2", password2);
                    startActivity(intent);
                }
            }

            @Override
            public void onFailure(Call<RegisterResponse> call, Throwable t) {
                Toast.makeText(RegisterActivity.this, "Error : "+t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
