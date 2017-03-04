package com.example.nut_it.maptest2.model;

import java.io.Serializable;

/**
 * Created by Nut_IT on 3/4/2017.
 */

public class NhaHangFake implements Serializable {
    private String ten;
    private int hinh;
    private float viDo;
    private float kinhDo;

    public NhaHangFake() {
    }

    public NhaHangFake(String ten, int hinh, float viDo, float kinhDo) {
        this.ten = ten;
        this.hinh = hinh;
        this.viDo = viDo;
        this.kinhDo = kinhDo;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public float getViDo() {
        return viDo;
    }

    public void setViDo(float viDo) {
        this.viDo = viDo;
    }

    public float getKinhDo() {
        return kinhDo;
    }

    public void setKinhDo(float kinhDo) {
        this.kinhDo = kinhDo;
    }

    @Override
    public String toString() {
        return this.ten;
    }
}
