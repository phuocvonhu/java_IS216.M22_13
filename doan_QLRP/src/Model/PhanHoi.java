/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author minht
 */
public class PhanHoi {
    private int ma_phan_hoi;
    private int ma_khach_hang;
    private String noi_dung;
    private float danh_gia;

    public PhanHoi(int ma_phan_hoi, int ma_khach_hang, String noi_dung, float danh_gia) {
        this.ma_phan_hoi = ma_phan_hoi;
        this.ma_khach_hang = ma_khach_hang;
        this.noi_dung = noi_dung;
        this.danh_gia = danh_gia;
    }

    public PhanHoi(int ma_khach_hang, String noi_dung, float danh_gia) {
        this.ma_khach_hang = ma_khach_hang;
        this.noi_dung = noi_dung;
        this.danh_gia = danh_gia;
    }

    public PhanHoi() {
    }

    public int getMa_phan_hoi() {
        return ma_phan_hoi;
    }

    public void setMa_phan_hoi(int ma_phan_hoi) {
        this.ma_phan_hoi = ma_phan_hoi;
    }

    public int getMa_khach_hang() {
        return ma_khach_hang;
    }

    public void setMa_khach_hang(int ma_khach_hang) {
        this.ma_khach_hang = ma_khach_hang;
    }

    public String getNoi_dung() {
        return noi_dung;
    }

    public void setNoi_dung(String noi_dung) {
        this.noi_dung = noi_dung;
    }

    public float getDanh_gia() {
        return danh_gia;
    }

    public void setDanh_gia(float danh_gia) {
        this.danh_gia = danh_gia;
    }
    
    
}
