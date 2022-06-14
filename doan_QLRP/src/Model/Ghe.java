/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author minht
 */
public class Ghe {
    private int ma_ghe;
    private int ma_phong_chieu;
    private String ten_ghe;
    private String loai_ghe;
    private int tinh_trang;

    public Ghe(int ma_phong_chieu, String ten_ghe, String loai_ghe, int tinh_trang) {
        this.ma_phong_chieu = ma_phong_chieu;
        this.ten_ghe = ten_ghe;
        this.loai_ghe = loai_ghe;
        this.tinh_trang = tinh_trang;
    }
    
    

    public Ghe(int ma_ghe, int ma_phong_chieu, String ten_ghe, String loai_ghe, int tinh_trang) {
        this.ma_ghe = ma_ghe;
        this.ma_phong_chieu = ma_phong_chieu;
        this.ten_ghe = ten_ghe;
        this.loai_ghe = loai_ghe;
        this.tinh_trang = tinh_trang;
    }

    public Ghe() {
    }

    public int getMa_ghe() {
        return ma_ghe;
    }

    public void setMa_ghe(int ma_ghe) {
        this.ma_ghe = ma_ghe;
    }

    public int getMa_phong_chieu() {
        return ma_phong_chieu;
    }

    public void setMa_phong_chieu(int ma_phong_chieu) {
        this.ma_phong_chieu = ma_phong_chieu;
    }

    public String getTen_ghe() {
        return ten_ghe;
    }

    public void setTen_ghe(String ten_ghe) {
        this.ten_ghe = ten_ghe;
    }

    public String getLoai_ghe() {
        return loai_ghe;
    }

    public void setLoai_ghe(String loai_ghe) {
        this.loai_ghe = loai_ghe;
    }

    public int getTinh_trang() {
        return tinh_trang;
    }

    public void setTinh_trang(int tinh_trang) {
        this.tinh_trang = tinh_trang;
    }
    
    
}
