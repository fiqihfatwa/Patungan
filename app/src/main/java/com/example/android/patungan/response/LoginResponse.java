
package com.example.android.patungan.response;

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
    "alamat",
    "telepon",
    "nama_bank",
    "an_bank",
    "no_rekening",
    "ktp",
    "failed"
})
public class LoginResponse {

    @JsonProperty("email")
    private String email;
    @JsonProperty("nama")
    private String nama;
    @JsonProperty("alamat")
    private Object alamat;
    @JsonProperty("telepon")
    private String telepon;
    @JsonProperty("nama_bank")
    private Object namaBank;
    @JsonProperty("an_bank")
    private Object anBank;
    @JsonProperty("no_rekening")
    private Object noRekening;
    @JsonProperty("ktp")
    private Object ktp;
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

    @JsonProperty("alamat")
    public Object getAlamat() {
        return alamat;
    }

    @JsonProperty("alamat")
    public void setAlamat(Object alamat) {
        this.alamat = alamat;
    }

    @JsonProperty("telepon")
    public String getTelepon() {
        return telepon;
    }

    @JsonProperty("telepon")
    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    @JsonProperty("nama_bank")
    public Object getNamaBank() {
        return namaBank;
    }

    @JsonProperty("nama_bank")
    public void setNamaBank(Object namaBank) {
        this.namaBank = namaBank;
    }

    @JsonProperty("an_bank")
    public Object getAnBank() {
        return anBank;
    }

    @JsonProperty("an_bank")
    public void setAnBank(Object anBank) {
        this.anBank = anBank;
    }

    @JsonProperty("no_rekening")
    public Object getNoRekening() {
        return noRekening;
    }

    @JsonProperty("no_rekening")
    public void setNoRekening(Object noRekening) {
        this.noRekening = noRekening;
    }

    @JsonProperty("ktp")
    public Object getKtp() {
        return ktp;
    }

    @JsonProperty("ktp")
    public void setKtp(Object ktp) {
        this.ktp = ktp;
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
