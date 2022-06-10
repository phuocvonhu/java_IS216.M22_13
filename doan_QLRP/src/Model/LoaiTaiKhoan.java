/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author minht
 */
public class LoaiTaiKhoan {
    private int ma_loai_tai_khoan;
    private String ten_loai;

    public LoaiTaiKhoan(int ma_loai_tai_khoan, String ten_loai) {
        this.ma_loai_tai_khoan = ma_loai_tai_khoan;
        this.ten_loai = ten_loai;
    }

    public LoaiTaiKhoan(String ten_loai) {
        this.ten_loai = ten_loai;
    }

    
    public LoaiTaiKhoan() {
    }

    public int getMa_loai_tai_khoan() {
        return ma_loai_tai_khoan;
    }

    public void setMa_loai_tai_khoan(int ma_loai_tai_khoan) {
        this.ma_loai_tai_khoan = ma_loai_tai_khoan;
    }

    public String getTen_loai() {
        return ten_loai;
    }

    public void setTen_loai(String ten_loai) {
        this.ten_loai = ten_loai;
    }
    
}
