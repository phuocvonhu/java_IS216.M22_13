/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author minht
 */
public class Phim {
    private int ma_phim;
    private String ten_phim;
    private String loai_phim;
    private String tac_gia;
    private String quoc_gia;
    private int thoi_luong;
    private String nam_phat_hanh;

    public Phim(int ma_phim, String ten_phim, String loai_phim, String tac_gia, String quoc_gia, int thoi_luong, String nam_phat_hanh) {
        this.ma_phim = ma_phim;
        this.ten_phim = ten_phim;
        this.loai_phim = loai_phim;
        this.tac_gia = tac_gia;
        this.quoc_gia = quoc_gia;
        this.thoi_luong = thoi_luong;
        this.nam_phat_hanh = nam_phat_hanh;
    }

    public Phim(String ten_phim, String loai_phim, String tac_gia, String quoc_gia, int thoi_luong, String nam_phat_hanh) {
        this.ten_phim = ten_phim;
        this.loai_phim = loai_phim;
        this.tac_gia = tac_gia;
        this.quoc_gia = quoc_gia;
        this.thoi_luong = thoi_luong;
        this.nam_phat_hanh = nam_phat_hanh;
    }

    public Phim() {
    }

    public int getMa_phim() {
        return ma_phim;
    }

    public void setMa_phim(int ma_phim) {
        this.ma_phim = ma_phim;
    }

    public String getTen_phim() {
        return ten_phim;
    }

    public void setTen_phim(String ten_phim) {
        this.ten_phim = ten_phim;
    }

    public String getLoai_phim() {
        return loai_phim;
    }

    public void setLoai_phim(String loai_phim) {
        this.loai_phim = loai_phim;
    }

    public String getTac_gia() {
        return tac_gia;
    }

    public void setTac_gia(String tac_gia) {
        this.tac_gia = tac_gia;
    }

    public String getQuoc_gia() {
        return quoc_gia;
    }

    public void setQuoc_gia(String quoc_gia) {
        this.quoc_gia = quoc_gia;
    }

    public int getThoi_luong() {
        return thoi_luong;
    }

    public void setThoi_luong(int thoi_luong) {
        this.thoi_luong = thoi_luong;
    }

    public String getNam_phat_hanh() {
        return nam_phat_hanh;
    }

    public void setNam_phat_hanh(String nam_phat_hanh) {
        this.nam_phat_hanh = nam_phat_hanh;
    }
    
    
}
