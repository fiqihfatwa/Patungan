package com.example.android.patungan.response;

/**
 * Created by isadadi on 2/10/2018.
 */

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "email",
        "nama",
        "password",
        "kode",
        "telepon",
        "failed"
})
public class RegisterResponse {

    @JsonProperty("email")
    private String email;
    @JsonProperty("nama")
    private String nama;
    @JsonProperty("password")
    private String password;
    @JsonProperty("kode")
    private String kode;
    @JsonProperty("telepon")
    private String telepon;
    @JsonProperty("failed")
    private String failed;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("nama")
    public String getNama() {
        return nama;
    }

    @JsonProperty("nama")
    public void setNama(String nama) {
        this.nama = nama;
    }

    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    @JsonProperty("kode")
    public String getKode() {
        return kode;
    }

    @JsonProperty("kode")
    public void setKode(String kode) {
        this.kode = kode;
    }

    @JsonProperty("telepon")
    public String getTelepon() {
        return telepon;
    }

    @JsonProperty("telepon")
    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    @JsonProperty("failed")
    public String getFailed() {
        return failed;
    }

    @JsonProperty("failed")
    public void setFailed(String failed) {
        this.failed = failed;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

