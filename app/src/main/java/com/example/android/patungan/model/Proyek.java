package com.example.android.patungan.model;

/**
 * Created by Hitfa on 09/02/2018.
 */

public class Proyek {
    private String judul;
    private String oleh;
    private String insertDate;
    private String profit;
    private String periode;
    private String statusPembayaran;
    private int status;
    private String url_gambar;
    public Proyek(String mJudul, String mOleh, String mInsertDate, String mProfit, String mPeriode, String gambar) {
        judul = mJudul;
        oleh = mOleh;
        insertDate = mInsertDate;
        profit = mProfit;
        periode = mPeriode;
        url_gambar = gambar;
    }

    public Proyek(String mJudul, String mDate, String mStatus) {
        judul = mJudul;
        insertDate = mDate;
        statusPembayaran = mStatus;
    }

    public String getUrl_gambar(){ return url_gambar;};

    void setUrl_gambar(String gambar){url_gambar = gambar;};

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getOleh() {
        return oleh;
    }

    public void setOleh(String oleh) {
        this.oleh = oleh;
    }

    public String getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(String insertDate) {
        this.insertDate = insertDate;
    }

    public String getProfit() {
        return profit;
    }

    public void setProfit(String profit) {
        this.profit = profit;
    }

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusPembayaran() {
        return statusPembayaran;
    }

    public void setStatusPembayaran(String statusPembayaran) {
        this.statusPembayaran = statusPembayaran;
    }
}
