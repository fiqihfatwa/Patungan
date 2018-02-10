package com.example.android.patungan.response;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id_proyek",
        "nama_proyek",
        "deskripsi",
        "nama",
        "estimasi_profit",
        "periode",
        "tanggal",
        "gambar",
        "tersedia"
})
public class HomeResponse {

    @JsonProperty("id_proyek")
    private String idProyek;
    @JsonProperty("nama_proyek")
    private String namaProyek;
    @JsonProperty("deskripsi")
    private String deskripsi;
    @JsonProperty("nama")
    private String nama;
    @JsonProperty("estimasi_profit")
    private String estimasiProfit;
    @JsonProperty("periode")
    private String periode;
    @JsonProperty("tanggal")
    private String tanggal;
    @JsonProperty("gambar")
    private String gambar;
    @JsonProperty("tersedia")
    private Boolean tersedia;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id_proyek")
    public String getIdProyek() {
        return idProyek;
    }

    @JsonProperty("id_proyek")
    public void setIdProyek(String idProyek) {
        this.idProyek = idProyek;
    }

    @JsonProperty("nama_proyek")
    public String getNamaProyek() {
        return namaProyek;
    }

    @JsonProperty("nama_proyek")
    public void setNamaProyek(String namaProyek) {
        this.namaProyek = namaProyek;
    }

    @JsonProperty("deskripsi")
    public String getDeskripsi() {
        return deskripsi;
    }

    @JsonProperty("deskripsi")
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    @JsonProperty("nama")
    public String getNama() {
        return nama;
    }

    @JsonProperty("nama")
    public void setNama(String nama) {
        this.nama = nama;
    }

    @JsonProperty("estimasi_profit")
    public String getEstimasiProfit() {
        return estimasiProfit;
    }

    @JsonProperty("estimasi_profit")
    public void setEstimasiProfit(String estimasiProfit) {
        this.estimasiProfit = estimasiProfit;
    }

    @JsonProperty("periode")
    public String getPeriode() {
        return periode;
    }

    @JsonProperty("periode")
    public void setPeriode(String periode) {
        this.periode = periode;
    }

    @JsonProperty("tanggal")
    public String getTanggal() {
        return tanggal;
    }

    @JsonProperty("tanggal")
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    @JsonProperty("gambar")
    public String getGambar() {
        return gambar;
    }

    @JsonProperty("gambar")
    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    @JsonProperty("tersedia")
    public Boolean getTersedia() {
        return tersedia;
    }

    @JsonProperty("tersedia")
    public void setTersedia(Boolean tersedia) {
        this.tersedia = tersedia;
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