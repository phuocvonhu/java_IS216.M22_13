/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author minht
 */
public class KhuyenMai {
    private int ma_khuyen_mai;
    private String noi_dung;
    private float tri_gia;
    private boolean dung_chung;

    public KhuyenMai(int ma_khuyen_mai, String noi_dung, float tri_gia, boolean dung_chung) {
        this.ma_khuyen_mai = ma_khuyen_mai;
        this.noi_dung = noi_dung;
        this.tri_gia = tri_gia;
        this.dung_chung = dung_chung;
    }

    public KhuyenMai(String noi_dung, float tri_gia, boolean dung_chung) {
        this.noi_dung = noi_dung;
        this.tri_gia = tri_gia;
        this.dung_chung = dung_chung;
    }

    public KhuyenMai() {
    }

    public int getMa_khuyen_mai() {
        return ma_khuyen_mai;
    }

    public void setMa_khuyen_mai(int ma_khuyen_mai) {
        this.ma_khuyen_mai = ma_khuyen_mai;
    }

    public String getNoi_dung() {
        return noi_dung;
    }

    public void setNoi_dung(String noi_dung) {
        this.noi_dung = noi_dung;
    }

    public float getTri_gia() {
        return tri_gia;
    }

    public void setTri_gia(float tri_gia) {
        this.tri_gia = tri_gia;
    }

    public boolean getDung_chung() {
        return dung_chung;
    }

    public void setDung_chung(boolean dung_chung) {
        this.dung_chung = dung_chung;
    }
    
    
}
