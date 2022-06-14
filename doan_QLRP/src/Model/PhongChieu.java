/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author minht
 */
public class PhongChieu {
    private int ma_phong_chieu;
    private String ten_phong_chieu;
    private String loai_phong_chieu;
    private int so_luong_ghe;

    public PhongChieu(int ma_phong_chieu, String ten_phong_chieu, String loai_phong_chieu, int so_luong_ghe) {
        this.ma_phong_chieu = ma_phong_chieu;
        this.ten_phong_chieu = ten_phong_chieu;
        this.loai_phong_chieu = loai_phong_chieu;
        this.so_luong_ghe = so_luong_ghe;
    }

    public PhongChieu(String ten_phong_chieu, String loai_phong_chieu, int so_luong_ghe) {
        this.ten_phong_chieu = ten_phong_chieu;
        this.loai_phong_chieu = loai_phong_chieu;
        this.so_luong_ghe = so_luong_ghe;
    }

    public PhongChieu() {
    }

    public int getMa_phong_chieu() {
        return ma_phong_chieu;
    }

    public void setMa_phong_chieu(int ma_phong_chieu) {
        this.ma_phong_chieu = ma_phong_chieu;
    }

    public String getTen_phong_chieu() {
        return ten_phong_chieu;
    }

    public void setTen_phong_chieu(String ten_phong_chieu) {
        this.ten_phong_chieu = ten_phong_chieu;
    }

    public String getLoai_phong_chieu() {
        return loai_phong_chieu;
    }

    public void setLoai_phong_chieu(String loai_phong_chieu) {
        this.loai_phong_chieu = loai_phong_chieu;
    }

    public int getSo_luong_ghe() {
        return so_luong_ghe;
    }

    public void setSo_luong_ghe(int so_luong_ghe) {
        this.so_luong_ghe = so_luong_ghe;
    }
    
    
}
