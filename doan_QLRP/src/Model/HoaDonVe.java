/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author minht
 */
public class HoaDonVe {
    private int ma_hoa_don;
    private int ma_ve;
    private int ma_suat_chieu;
    private int ma_ghe;
    private long gia;

    public HoaDonVe(int ma_hoa_don, int ma_ve, int ma_suat_chieu, int ma_ghe, long gia) {
        this.ma_hoa_don = ma_hoa_don;
        this.ma_ve = ma_ve;
        this.ma_suat_chieu = ma_suat_chieu;
        this.ma_ghe = ma_ghe;
        this.gia = gia;
    }

    public HoaDonVe(int ma_hoa_don, int ma_suat_chieu, int ma_ghe, long gia) {
        this.ma_hoa_don = ma_hoa_don;
        this.ma_suat_chieu = ma_suat_chieu;
        this.ma_ghe = ma_ghe;
        this.gia = gia;
    }
    

    public HoaDonVe() {
    }

    public int getMa_hoa_don() {
        return ma_hoa_don;
    }

    public void setMa_hoa_don(int ma_hoa_don) {
        this.ma_hoa_don = ma_hoa_don;
    }

    public int getMa_ve() {
        return ma_ve;
    }

    public void setMa_ve(int ma_ve) {
        this.ma_ve = ma_ve;
    }

    public int getMa_suat_chieu() {
        return ma_suat_chieu;
    }

    public void setMa_suat_chieu(int ma_suat_chieu) {
        this.ma_suat_chieu = ma_suat_chieu;
    }

    public int getMa_ghe() {
        return ma_ghe;
    }

    public void setMa_ghe(int ma_ghe) {
        this.ma_ghe = ma_ghe;
    }

    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }
    
    
}
