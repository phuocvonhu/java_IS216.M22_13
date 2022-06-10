/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author minht
 */
public class HoaDon {
    private int ma_hoa_don;
    private int ma_nhan_vien;
    private int ma_khach_hang;
    private long tri_gia; 
    private String ngay_hoa_don;

    public HoaDon(int ma_hoa_don, int ma_nhan_vien, int ma_khach_hang, long tri_gia, String ngay_hoa_don) {
        this.ma_hoa_don = ma_hoa_don;
        this.ma_nhan_vien = ma_nhan_vien;
        this.ma_khach_hang = ma_khach_hang;
        this.tri_gia = tri_gia;
        this.ngay_hoa_don = ngay_hoa_don;
    }

    public HoaDon(int ma_nhan_vien, int ma_khach_hang, long tri_gia, String ngay_hoa_don) {
        this.ma_nhan_vien = ma_nhan_vien;
        this.ma_khach_hang = ma_khach_hang;
        this.tri_gia = tri_gia;
        this.ngay_hoa_don = ngay_hoa_don;
    }

    public String getNgay_hoa_don() {
        return ngay_hoa_don;
    }

    public void setNgay_hoa_don(String ngay_hoa_don) {
        this.ngay_hoa_don = ngay_hoa_don;
    }

    public HoaDon() {
    }

    public int getMa_hoa_don() {
        return ma_hoa_don;
    }

    public void setMa_hoa_don(int ma_hoa_don) {
        this.ma_hoa_don = ma_hoa_don;
    }

    public int getMa_nhan_vien() {
        return ma_nhan_vien;
    }

    public void setMa_nhan_vien(int ma_nhan_vien) {
        this.ma_nhan_vien = ma_nhan_vien;
    }

    public int getMa_khach_hang() {
        return ma_khach_hang;
    }

    public void setMa_khach_hang(int ma_khach_hang) {
        this.ma_khach_hang = ma_khach_hang;
    }

    public long getTri_gia() {
        return tri_gia;
    }

    public void setTri_gia(long tri_gia) {
        this.tri_gia = tri_gia;
    }
    
    
    
}
