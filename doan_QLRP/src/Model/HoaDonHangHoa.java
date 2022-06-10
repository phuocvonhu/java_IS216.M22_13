/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author minht
 */
public class HoaDonHangHoa {
    private int ma_hoa_don;
    private int ma_hang_hoa;
    private int so_luong;

    public HoaDonHangHoa(int ma_hoa_don, int ma_hang_hoa, int so_luong) {
        this.ma_hoa_don = ma_hoa_don;
        this.ma_hang_hoa = ma_hang_hoa;
        this.so_luong = so_luong;
    }

    public HoaDonHangHoa() {
    }

    public int getMa_hoa_don() {
        return ma_hoa_don;
    }

    public void setMa_hoa_don(int ma_hoa_don) {
        this.ma_hoa_don = ma_hoa_don;
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
    
}
