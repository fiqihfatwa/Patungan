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
        "nama_proyek",
        "nama",
        "harga_slot",
        "periode",
        "lokasi",
        "estimasi_profit",
        "sisa_slot",
        "jlh_slot",
        "hp",
        "email",
        "deskripsi",
        "total_dana"
})
public class DetailResponse {

    @JsonProperty("nama_proyek")
    private String namaProyek;
    @JsonProperty("nama")
    private String nama;
    @JsonProperty("harga_slot")
    private String hargaSlot;
    @JsonProperty("periode")
    private String periode;
    @JsonProperty("lokasi")
    private String lokasi;
    @JsonProperty("estimasi_profit")
    private String estimasiProfit;
    @JsonProperty("sisa_slot")
    private Integer sisaSlot;
    @JsonProperty("jlh_slot")
    private String jlhSlot;
    @JsonProperty("hp")
    private String hp;
    @JsonProperty("email")
    private String email;
    @JsonProperty("deskripsi")
    private String deskripsi;
    @JsonProperty("total_dana")
    private String totalDana;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nama_proyek")
    public String getNamaProyek() {
        return namaProyek;
    }

    @JsonProperty("nama_proyek")
    public void setNamaProyek(String namaProyek) {
        this.namaProyek = namaProyek;
    }

    @JsonProperty("nama")
    public String getNama() {
        return nama;
    }

    @JsonProperty("nama")
    public void setNama(String nama) {
        this.nama = nama;
    }

    @JsonProperty("harga_slot")
    public String getHargaSlot() {
        return hargaSlot;
    }

    @JsonProperty("harga_slot")
    public void setHargaSlot(String hargaSlot) {
        this.hargaSlot = hargaSlot;
    }

    @JsonProperty("periode")
    public String getPeriode() {
        return periode;
    }

    @JsonProperty("periode")
    public void setPeriode(String periode) {
        this.periode = periode;
    }

    @JsonProperty("lokasi")
    public String getLokasi() {
        return lokasi;
    }

    @JsonProperty("lokasi")
    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    @JsonProperty("estimasi_profit")
    public String getEstimasiProfit() {
        return estimasiProfit;
    }

    @JsonProperty("estimasi_profit")
    public void setEstimasiProfit(String estimasiProfit) {
        this.estimasiProfit = estimasiProfit;
    }

    @JsonProperty("sisa_slot")
    public Integer getSisaSlot() {
        return sisaSlot;
    }

    @JsonProperty("sisa_slot")
    public void setSisaSlot(Integer sisaSlot) {
        this.sisaSlot = sisaSlot;
    }

    @JsonProperty("jlh_slot")
    public String getJlhSlot() {
        return jlhSlot;
    }

    @JsonProperty("jlh_slot")
    public void setJlhSlot(String jlhSlot) {
        this.jlhSlot = jlhSlot;
    }

    @JsonProperty("hp")
    public String getHp() {
        return hp;
    }

    @JsonProperty("hp")
    public void setHp(String hp) {
        this.hp = hp;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("deskripsi")
    public String getDeskripsi() {
        return deskripsi;
    }

    @JsonProperty("deskripsi")
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    @JsonProperty("total_dana")
    public String getTotalDana() {
        return totalDana;
    }

    @JsonProperty("total_dana")
    public void setTotalDana(String totalDana) {
        this.totalDana = totalDana;
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