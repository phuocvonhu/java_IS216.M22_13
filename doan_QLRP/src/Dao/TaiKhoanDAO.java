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
public class TaiKhoanDAO {
    public static List<TaiKhoan> getAll(Connection cons){
        if(cons == null) return null;
        try{
            List<TaiKhoan> list = new ArrayList<TaiKhoan>();
            String sql = "select * from tai_khoan";
            Statement st = cons.prepareCall(sql);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                list.add(new TaiKhoan(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static TaiKhoan getByMaTaiKhoan(Connection cons, int ma){
        if(cons == null) return null;
        try{
            String sql = "select * from tai_khoan where ma_tai_khoan = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            if(rs.next()) return new TaiKhoan(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }    
    public static TaiKhoan getByAccount(Connection cons, String user, String pass){
        if(cons == null) return null;
        try{
            String sql = "select * from tai_khoan where ten_dang_nhap = ? and mat_khau = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setString(1, user);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();
            if(rs.next()) return new TaiKhoan(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static boolean insert( Connection cons, TaiKhoan t){
        if(cons == null) return false;
        try{
            if(t.getMa_tai_khoan() == 0){
                String sql = "insert into tai_khoan(ten_dang_nhap, mat_khau, ma_loai_tai_khoan) values(?,?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setString(1, t.getTen_dang_nhap());
                ps.setString(2, t.getMat_khau());
                ps.setInt(3, t.getMa_loai_tai_khoan());
                return ps.execute();            
            }
            else
            {
                String sql = "insert into tai_khoan(ma_tai_khoan, ten_dang_nhap, mat_khau, ma_loai_tai_khoan) values(?,?,?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setInt(1, t.getMa_tai_khoan());
                ps.setString(2, t.getTen_dang_nhap());
                ps.setString(3,t.getMat_khau());
                ps.setInt(4, t.getMa_loai_tai_khoan());
                return ps.execute();      
            }           
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    public static boolean delete( Connection cons, TaiKhoan t){
        if(cons == null) return false;
        try{
            String sql = "delete from tai_khoan where ma_tai_khoan = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setInt(1, t.getMa_tai_khoan());
            return ps.execute();            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    public static boolean update( Connection cons, TaiKhoan t){
        if(cons == null) return false;
        try{
            String sql = "update tai_khoan set ten_dang_nhap = ?, mat_khau = ?, ma_loai_tai_khoan = ? where ma_tai_khoan = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, t.getTen_dang_nhap());
            ps.setString(2, t.getMat_khau());
            ps.setInt(3, t.getMa_loai_tai_khoan());
            ps.setInt(4, t.getMa_tai_khoan());
            return ps.execute();          
        }
        catch(Exception ex){
            
            System.out.println(ex.getMessage());
        }
        return false;
    }
}
