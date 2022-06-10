/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;

/**
 *
 * @author minht
 */
public class PhimThem {
    private int ma_phim;
    private String mo_ta;
    private BufferedImage anh_minh_hoa;

    public PhimThem(int ma_phim, String mo_ta, BufferedImage anh_minh_hoa) {
        this.ma_phim = ma_phim;
        this.mo_ta = mo_ta;
        this.anh_minh_hoa = anh_minh_hoa;
    }

    public PhimThem(String mo_ta, BufferedImage anh_minh_hoa) {
        this.mo_ta = mo_ta;
        this.anh_minh_hoa = anh_minh_hoa;
    }

    public PhimThem() {
    }

    public int getMa_phim() {
        return ma_phim;
    }

    public void setMa_phim(int ma_phim) {
        this.ma_phim = ma_phim;
    }

    public String getMo_ta() {
        return mo_ta;
    }

    public void setMo_ta(String mo_ta) {
        this.mo_ta = mo_ta;
    }

    public BufferedImage getAnh_minh_hoa() {
        return anh_minh_hoa;
    }

    public void setAnh_minh_hoa(BufferedImage anh_minh_hoa) {
        this.anh_minh_hoa = anh_minh_hoa;
    }
    
    
}
