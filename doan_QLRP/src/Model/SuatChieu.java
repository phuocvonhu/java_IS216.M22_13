/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author minht
 */
public class SuatChieu {
    private int ma_suat_chieu;
    private int ma_phong_chieu;
    private int ma_phim;
    private long gia_ve;
    private String thoi_gian;

    public SuatChieu(int ma_suat_chieu, int ma_phong_chieu, int ma_phim, long gia_ve, String thoi_gian) {
        this.ma_suat_chieu = ma_suat_chieu;
        this.ma_phong_chieu = ma_phong_chieu;
        this.ma_phim = ma_phim;
        this.gia_ve = gia_ve;
        this.thoi_gian = thoi_gian;
    }

    public SuatChieu(int ma_phong_chieu, int ma_phim, long gia_ve, String thoi_gian) {
        this.ma_phong_chieu = ma_phong_chieu;
        this.ma_phim = ma_phim;
        this.gia_ve = gia_ve;
        this.thoi_gian = thoi_gian;
    }

    public SuatChieu() {
    }

    public int getMa_suat_chieu() {
        return ma_suat_chieu;
    }

    public void setMa_suat_chieu(int ma_suat_chieu) {
        this.ma_suat_chieu = ma_suat_chieu;
    }

    public int getMa_phong_chieu() {
        return ma_phong_chieu;
    }

    public void setMa_phong_chieu(int ma_phong_chieu) {
        this.ma_phong_chieu = ma_phong_chieu;
    }

    public int getMa_phim() {
        return ma_phim;
    }

    public void setMa_phim(int ma_phim) {
        this.ma_phim = ma_phim;
    }

    public long getGia_ve() {
        return gia_ve;
    }

    public void setGia_ve(long gia_ve) {
        this.gia_ve = gia_ve;
    }

    public String getThoi_gian() {
        return thoi_gian;
    }

    public void setThoi_gian(String thoi_gian) {
        this.thoi_gian = thoi_gian;
    }
    
    
}
