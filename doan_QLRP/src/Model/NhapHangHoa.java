/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author minht
 */
public class NhapHangHoa {
    private int ma_don;
    private int ma_ncc;
    private int ma_hang_hoa;
    private int so_luong;
    private long don_gia;
    private String ngay_nhap;
    private String ten_ncc;
    private String ten_hang_hoa;

    public NhapHangHoa(int ma_don, int ma_ncc, int ma_hang_hoa, int so_luong, long don_gia, String ngay_nhap) {
        this.ma_don = ma_don;
        this.ma_ncc = ma_ncc;
        this.ma_hang_hoa = ma_hang_hoa;
        this.so_luong = so_luong;
        this.don_gia = don_gia;
        this.ngay_nhap = ngay_nhap;
    }

    public NhapHangHoa(int ma_ncc, int ma_hang_hoa, int so_luong, long don_gia, String ngay_nhap) {
        this.ma_ncc = ma_ncc;
        this.ma_hang_hoa = ma_hang_hoa;
        this.so_luong = so_luong;
        this.don_gia = don_gia;
        this.ngay_nhap = ngay_nhap;
    }

    public NhapHangHoa(int ma_don, int ma_ncc, int ma_hang_hoa, int so_luong, long don_gia, String ngay_nhap, String ten_ncc, String ten_hang_hoa) {
        this.ma_don = ma_don;
        this.ma_ncc = ma_ncc;
        this.ma_hang_hoa = ma_hang_hoa;
        this.so_luong = so_luong;
        this.don_gia = don_gia;
        this.ngay_nhap = ngay_nhap;
        this.ten_ncc = ten_ncc;
        this.ten_hang_hoa = ten_hang_hoa;
    }

    public String getTen_ncc() {
        return ten_ncc;
    }

    public void setTen_ncc(String ten_ncc) {
        this.ten_ncc = ten_ncc;
    }

    public String getTen_hang_hoa() {
        return ten_hang_hoa;
    }

    public void setTen_hang_hoa(String ten_hang_hoa) {
        this.ten_hang_hoa = ten_hang_hoa;
    }
    

    public NhapHangHoa() {
    }

    public int getMa_don() {
        return ma_don;
    }

    public void setMa_don(int ma_don) {
        this.ma_don = ma_don;
    }

    public int getMa_ncc() {
        return ma_ncc;
    }

    public void setMa_ncc(int ma_ncc) {
        this.ma_ncc = ma_ncc;
    }

    public int getMa_hang_hoa() {
        return ma_hang_hoa;
    }

    public void setMa_hang_hoa(int ma_hang_hoa) {
        this.ma_hang_hoa = ma_hang_hoa;
    }

    public int getSo_luong() {
        return so_luong;
    }

    public void setSo_luong(int so_luong) {
        this.so_luong = so_luong;
    }

    public long getDon_gia() {
        return don_gia;
    }

    public void setDon_gia(long don_gia) {
        this.don_gia = don_gia;
    }

    public String getNgay_nhap() {
        return ngay_nhap;
    }

    public void setNgay_nhap(String ngay_nhap) {
        this.ngay_nhap = ngay_nhap;
    }
    
    
}
