/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author minht
 */
public class NhanVien {
    private int ma_nhan_vien;
    private String ho_ten;
    private String gioi_tinh;
    private String ngay_sinh;
    private String email;
    private String so_dien_thoai;
    private String ngay_bat_dau;
    private int ma_tai_khoan;

    public NhanVien(int ma_nhan_vien, String ho_ten, String gioi_tinh, String ngay_sinh, String email, String so_dien_thoai, String ngay_bat_dau, int ma_tai_khoan) {
        this.ma_nhan_vien = ma_nhan_vien;
        this.ho_ten = ho_ten;
        this.gioi_tinh = gioi_tinh;
        this.ngay_sinh = ngay_sinh;
        this.email = email;
        this.so_dien_thoai = so_dien_thoai;
        this.ngay_bat_dau = ngay_bat_dau;
        this.ma_tai_khoan = ma_tai_khoan;
    }

    public NhanVien(String ho_ten, String gioi_tinh, String ngay_sinh, String email, String so_dien_thoai, String ngay_bat_dau, int ma_tai_khoan) {
        this.ho_ten = ho_ten;
        this.gioi_tinh = gioi_tinh;
        this.ngay_sinh = ngay_sinh;
        this.email = email;
        this.so_dien_thoai = so_dien_thoai;
        this.ngay_bat_dau = ngay_bat_dau;
        this.ma_tai_khoan = ma_tai_khoan;
    }

    public NhanVien() {
    }

    public int getMa_nhan_vien() {
        return ma_nhan_vien;
    }

    public void setMa_nhan_vien(int ma_nhan_vien) {
        this.ma_nhan_vien = ma_nhan_vien;
    }

    public String getHo_ten() {
        return ho_ten;
    }

    public void setHo_ten(String ho_ten) {
        this.ho_ten = ho_ten;
    }

    public String getGioi_tinh() {
        return gioi_tinh;
    }

    public void setGioi_tinh(String gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }

    public String getNgay_sinh() {
        return ngay_sinh;
    }

    public void setNgay_sinh(String ngay_sinh) {
        this.ngay_sinh = ngay_sinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSo_dien_thoai() {
        return so_dien_thoai;
    }

    public void setSo_dien_thoai(String so_dien_thoai) {
        this.so_dien_thoai = so_dien_thoai;
    }

    public String getNgay_bat_dau() {
        return ngay_bat_dau;
    }

    public void setNgay_bat_dau(String ngay_bat_dau) {
        this.ngay_bat_dau = ngay_bat_dau;
    }

    public int getMa_tai_khoan() {
        return ma_tai_khoan;
    }

    public void setMa_tai_khoan(int ma_tai_khoan) {
        this.ma_tai_khoan = ma_tai_khoan;
    }
    
    
}
