package com.example.android.patungan.response;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

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
        "proyek_id",
        "proyek_nama",
        "proyek_deskripsi",
        "proyek_lokasi",
        "proyek_estimasi_keuntungan",
        "proyek_insert_date",
        "proyek_status",
        "proyek_jangka_waktu",
        "proyek_gambar"
})
public class PengajuanResponse {

    @JsonProperty("proyek_id")
    private String proyekId;
    @JsonProperty("proyek_nama")
    private String proyekNama;
    @JsonProperty("proyek_deskripsi")
    private String proyekDeskripsi;
    @JsonProperty("proyek_lokasi")
    private String proyekLokasi;
    @JsonProperty("proyek_estimasi_keuntungan")
    private String proyekEstimasiKeuntungan;
    @JsonProperty("proyek_insert_date")
    private String proyekInsertDate;
    @JsonProperty("proyek_status")
    private String proyekStatus;
    @JsonProperty("proyek_jangka_waktu")
    private String proyekJangkaWaktu;
    @JsonProperty("proyek_gambar")
    private String proyekGambar;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("proyek_id")
    public String getProyekId() {
        return proyekId;
    }

    @JsonProperty("proyek_id")
    public void setProyekId(String proyekId) {
        this.proyekId = proyekId;
    }

    @JsonProperty("proyek_nama")
    public String getProyekNama() {
        return proyekNama;
    }

    @JsonProperty("proyek_nama")
    public void setProyekNama(String proyekNama) {
        this.proyekNama = proyekNama;
    }

    @JsonProperty("proyek_deskripsi")
    public String getProyekDeskripsi() {
        return proyekDeskripsi;
    }

    @JsonProperty("proyek_deskripsi")
    public void setProyekDeskripsi(String proyekDeskripsi) {
        this.proyekDeskripsi = proyekDeskripsi;
    }

    @JsonProperty("proyek_lokasi")
    public String getProyekLokasi() {
        return proyekLokasi;
    }

    @JsonProperty("proyek_lokasi")
    public void setProyekLokasi(String proyekLokasi) {
        this.proyekLokasi = proyekLokasi;
    }

    @JsonProperty("proyek_estimasi_keuntungan")
    public String getProyekEstimasiKeuntungan() {
        return proyekEstimasiKeuntungan;
    }

    @JsonProperty("proyek_estimasi_keuntungan")
    public void setProyekEstimasiKeuntungan(String proyekEstimasiKeuntungan) {
        this.proyekEstimasiKeuntungan = proyekEstimasiKeuntungan;
    }

    @JsonProperty("proyek_insert_date")
    public String getProyekInsertDate() {
        return proyekInsertDate;
    }

    @JsonProperty("proyek_insert_date")
    public void setProyekInsertDate(String proyekInsertDate) {
        this.proyekInsertDate = proyekInsertDate;
    }

    @JsonProperty("proyek_status")
    public String getProyekStatus() {
        return proyekStatus;
    }

    @JsonProperty("proyek_status")
    public void setProyekStatus(String proyekStatus) {
        this.proyekStatus = proyekStatus;
    }

    @JsonProperty("proyek_jangka_waktu")
    public String getProyekJangkaWaktu() {
        return proyekJangkaWaktu;
    }

    @JsonProperty("proyek_jangka_waktu")
    public void setProyekJangkaWaktu(String proyekJangkaWaktu) {
        this.proyekJangkaWaktu = proyekJangkaWaktu;
    }

    @JsonProperty("proyek_gambar")
    public String getProyekGambar() {
        return proyekGambar;
    }

    @JsonProperty("proyek_gambar")
    public void setProyekGambar(String proyekGambar) {
        this.proyekGambar = proyekGambar;
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


