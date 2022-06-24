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
public class LoaiTaiKhoanDAO {
    public static List<LoaiTaiKhoan> getAll(Connection cons){
        if(cons == null) return null;
        try{
            List<LoaiTaiKhoan> ltklist = new ArrayList<LoaiTaiKhoan>();
            String sql = "select * from loai_tai_khoan";
            Statement st = cons.prepareCall(sql);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                ltklist.add(new LoaiTaiKhoan(rs.getInt(1), rs.getString(2)));
            }
            return ltklist;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static LoaiTaiKhoan getByMa(Connection cons, int ma){
        if(cons == null) return null;
        try{
            String sql = "select * from loai_tai_khoan where ma_loai_tai_khoan = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            if(rs.next()) return new LoaiTaiKhoan(rs.getInt(1), rs.getString(2));
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static List<LoaiTaiKhoan> getByTenLoai(Connection cons, String ten){
        if(cons == null) return null;
        try{
            List<LoaiTaiKhoan> list = new ArrayList<LoaiTaiKhoan>();
            String sql = "select * from loai_tai_khoan where ten_loai = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setString(1, ten);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                list.add(new LoaiTaiKhoan(rs.getInt(1), rs.getString(2)));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static int insert( Connection cons, LoaiTaiKhoan l){
        if(cons == null) return -1;
        try{
            if(l.getMa_loai_tai_khoan() == 0){
                String sql = "insert into loai_tai_khoan(ten_loai) values(?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setString(1, l.getTen_loai());
                return ps.executeUpdate();            
            }
            else
            {
                String sql = "insert into loai_tai_khoan(ma_loai_tai_khoan,ten_loai) values(?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setInt(1, l.getMa_loai_tai_khoan());
                ps.setString(2, l.getTen_loai());
                return ps.executeUpdate();      
            }           
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return -1;
    }
    public static int delete( Connection cons, LoaiTaiKhoan l){
        if(cons == null) return -1;
        try{
            String sql = "delete from loai_tai_khoan where ma_loai_tai_khoan = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setInt(1, l.getMa_loai_tai_khoan());
            return ps.executeUpdate();            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return -1;
    }
    public static int update( Connection cons, LoaiTaiKhoan l){
        if(cons == null) return -1;
        try{
            String sql = "update loai_tai_khoan set ten_loai = ? where ma_loai_tai_khoan = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, l.getTen_loai());
            ps.setInt(2, l.getMa_loai_tai_khoan());
            return ps.executeUpdate();          
        }
        catch(Exception ex){
            
            System.out.println(ex.getMessage());
        }
        return -1;
    }     
}
