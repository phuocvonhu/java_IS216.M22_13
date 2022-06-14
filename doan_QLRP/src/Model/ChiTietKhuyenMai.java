/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author minht
 */
public class ChiTietKhuyenMai {
    private String ma_khuyen_mai;
    private String ma_hoa_don;


    public ChiTietKhuyenMai(String ma_khuyen_mai, String ma_hoa_don) {
        this.ma_khuyen_mai = ma_khuyen_mai;
        this.ma_hoa_don = ma_hoa_don;
    }

    public ChiTietKhuyenMai() {
    }

    public String getMa_khuyen_mai() {
        return ma_khuyen_mai;
    }

    public void setMa_khuyen_mai(String ma_khuyen_mai) {
        this.ma_khuyen_mai = ma_khuyen_mai;
    }

    public String getMa_hoa_don() {
        return ma_hoa_don;
    }

    public void setMa_hoa_don(String ma_hoa_don) {
        this.ma_hoa_don = ma_hoa_don;
    }
    
}
