/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author minht
 */
public class HangHoa {
    private int ma_hang_hoa;
    private String ten_hang_hoa;
    private int tong_so_luong;
    private long don_gia;

    public HangHoa(int ma_hang_hoa, String ten_hang_hoa, int tong_so_luong, long don_gia) {
        this.ma_hang_hoa = ma_hang_hoa;
        this.ten_hang_hoa = ten_hang_hoa;
        this.tong_so_luong = tong_so_luong;
        this.don_gia = don_gia;
    }

    public HangHoa(String ten_hang_hoa, int tong_so_luong, long don_gia) {
        this.ten_hang_hoa = ten_hang_hoa;
        this.tong_so_luong = tong_so_luong;
        this.don_gia = don_gia;
    }

    public HangHoa() {
    }

    public int getMa_hang_hoa() {
        return ma_hang_hoa;
    }

    public void setMa_hang_hoa(int ma_hang_hoa) {
        this.ma_hang_hoa = ma_hang_hoa;
    }

    public String getTen_hang_hoa() {
        return ten_hang_hoa;
    }

    public void setTen_hang_hoa(String ten_hang_hoa) {
        this.ten_hang_hoa = ten_hang_hoa;
    }

    public int getTong_so_luong() {
        return tong_so_luong;
    }

    public void setTong_so_luong(int tong_so_luong) {
        this.tong_so_luong = tong_so_luong;
    }

    public long getDon_gia() {
        return don_gia;
    }

    public void setDon_gia(long don_gia) {
        this.don_gia = don_gia;
    }
    
    
}
