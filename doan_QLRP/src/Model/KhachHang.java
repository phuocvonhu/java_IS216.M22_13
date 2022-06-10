/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author minht
 */
public class KhachHang {
    private int ma_khach_hang;
    private String ho_ten;
    private String so_dien_thoai;
    private String email;
    private int ma_tai_khoan;

    public KhachHang(int ma_khach_hang, String ho_ten, String so_dien_thoai, String email, int ma_tai_khoan) {
        this.ma_khach_hang = ma_khach_hang;
        this.ho_ten = ho_ten;
        this.so_dien_thoai = so_dien_thoai;
        this.email = email;
        this.ma_tai_khoan = ma_tai_khoan;
    }

    public KhachHang(String ho_ten, String so_dien_thoai, String email, int ma_tai_khoan) {
        this.ho_ten = ho_ten;
        this.so_dien_thoai = so_dien_thoai;
        this.email = email;
        this.ma_tai_khoan = ma_tai_khoan;
    }

    public KhachHang() {
    }

    public int getMa_khach_hang() {
        return ma_khach_hang;
    }

    public void setMa_khach_hang(int ma_khach_hang) {
        this.ma_khach_hang = ma_khach_hang;
    }

    public String getHo_ten() {
        return ho_ten;
    }

    public void setHo_ten(String ho_ten) {
        this.ho_ten = ho_ten;
    }

    public String getSo_dien_thoai() {
        return so_dien_thoai;
    }

    public void setSo_dien_thoai(String so_dien_thoai) {
        this.so_dien_thoai = so_dien_thoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMa_tai_khoan() {
        return ma_tai_khoan;
    }

    public void setMa_tai_khoan(int ma_tai_khoan) {
        this.ma_tai_khoan = ma_tai_khoan;
    }
    
    
}
