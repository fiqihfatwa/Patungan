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

    public Proyek(String mJudul, String mOleh, String mInsertDate, String mProfit, String mPeriode) {
        judul = mJudul;
        oleh = mOleh;
        insertDate = mInsertDate;
        profit = mProfit;
        periode = mPeriode;
    }

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
}