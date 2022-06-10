/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author minht
 */
public class SuCo {
    private int ma_su_co;
    private int ma_phong_chieu;
    private String ten_su_co;
    private String thong_tin_them;

    public SuCo(int ma_su_co, int ma_phong_chieu, String ten_su_co, String thong_tin_them) {
        this.ma_su_co = ma_su_co;
        this.ma_phong_chieu = ma_phong_chieu;
        this.ten_su_co = ten_su_co;
        this.thong_tin_them = thong_tin_them;
    }

    public SuCo(int ma_phong_chieu, String ten_su_co, String thong_tin_them) {
        this.ma_phong_chieu = ma_phong_chieu;
        this.ten_su_co = ten_su_co;
        this.thong_tin_them = thong_tin_them;
    }

    public SuCo() {
    }

    public int getMa_su_co() {
        return ma_su_co;
    }

    public void setMa_su_co(int ma_su_co) {
        this.ma_su_co = ma_su_co;
    }

    public int getMa_phong_chieu() {
        return ma_phong_chieu;
    }

    public void setMa_phong_chieu(int ma_phong_chieu) {
        this.ma_phong_chieu = ma_phong_chieu;
    }

    public String getTen_su_co() {
        return ten_su_co;
    }

    public void setTen_su_co(String ten_su_co) {
        this.ten_su_co = ten_su_co;
    }

    public String getThong_tin_them() {
        return thong_tin_them;
    }

    public void setThong_tin_them(String thong_tin_them) {
        this.thong_tin_them = thong_tin_them;
    }
    
    
}
