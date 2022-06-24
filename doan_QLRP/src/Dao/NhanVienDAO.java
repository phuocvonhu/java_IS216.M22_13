/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author minht
 */
public class NhanVienDAO {
    public static List<NhanVien> getAll(Connection cons){
        if(cons == null) return null;
        try{
            List<NhanVien> list = new ArrayList<NhanVien>();
            String sql = "select * from nhan_vien";
            Statement st = cons.prepareCall(sql);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                list.add(new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8)));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static NhanVien getByMaNhanVien(Connection cons, int ma){
        if(cons == null) return null;
        try{
            String sql = "select * from nhan_vien where ma_nhan_vien = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            if(rs.next()) return new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8));
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static int insert( Connection cons, NhanVien n){
        if(cons == null) return -1;
        try{
            if(n.getMa_nhan_vien() == 0){
                String sql = "insert into nhan_vien(ho_ten, gioi_tinh, ngay_sinh, email, so_dien_thoai, ngay_bat_dau, ma_tai_khoan) values(?,?,?,?,?,?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setString(1, n.getHo_ten());
                ps.setString(2, n.getGioi_tinh());
                ps.setString(3, n.getNgay_sinh());
                ps.setString(4, n.getEmail());
                ps.setString(5, n.getSo_dien_thoai());
                ps.setString(6, n.getNgay_bat_dau());
                ps.setInt(7, n.getMa_tai_khoan());
                return ps.executeUpdate();            
            }
            else
            {
                String sql = "insert into nhan_vien(ma_nhan_vien, ho_ten, gioi_tinh, ngay_sinh, email, so_dien_thoai, ngay_bat_dau, ma_tai_khoan) values(?,?,?,?,?,?,?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setInt(1, n.getMa_nhan_vien());
                ps.setString(2, n.getHo_ten());
                ps.setString(3, n.getGioi_tinh());
                ps.setString(4, n.getNgay_sinh());
                ps.setString(5, n.getEmail());
                ps.setString(6, n.getSo_dien_thoai());
                ps.setString(7, n.getNgay_bat_dau());
                ps.setInt(8, n.getMa_tai_khoan());   
                return ps.executeUpdate();      
            }           
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return -1;
    }
    public static int delete( Connection cons, NhanVien n){
        if(cons == null) return -1;
        try{
            String sql = "delete from nhan_vien where ma_nhan_vien = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setInt(1, n.getMa_nhan_vien());
            return ps.executeUpdate();            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return -1;
    }
    public static int update( Connection cons, NhanVien n){
        if(cons == null) return -1;
        try{
            String sql = "update nhan_vien set ho_ten = ?, gioi_tinh = ?, ngay_sinh = ?, email  = ?, so_dien_thoai = ?, ngay_bat_dau = ?, ma_tai_khoan = ? where ma_nhan_vien = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, n.getHo_ten());
            ps.setString(2, n.getGioi_tinh());
            ps.setString(3, n.getNgay_sinh());
            ps.setString(4, n.getEmail());
            ps.setString(5, n.getSo_dien_thoai());
            ps.setString(6, n.getNgay_bat_dau());
            ps.setInt(7, n.getMa_tai_khoan());   
            ps.setInt(8, n.getMa_nhan_vien());
            return ps.executeUpdate();          
        }
        catch(Exception ex){
            
            System.out.println(ex.getMessage());
        }
        return -1;
    } 
}
