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
public class KhachHangDAO {
    public static List<KhachHang> getAll(Connection cons){
        if(cons == null) return null;
        try{
            List<KhachHang> khachhanglist = new ArrayList<KhachHang>();
            String sql = "select * from khach_hang";
            Statement st = cons.prepareCall(sql);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                khachhanglist.add(new KhachHang(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5)));
            }
            return khachhanglist;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static KhachHang getByMaKhachHang(Connection cons, int ma){
        if(cons == null) return null;
        try{
            String sql = "select * from khach_hang where ma_khach_hang = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            if(rs.next()) return new KhachHang(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static KhachHang getBySoDienThoai(Connection cons, int ma){
        if(cons == null) return null;
        try{
            String sql = "select * from khach_hang where so_dien_thoai = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            if(rs.next()) return new KhachHang(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static int insert( Connection cons, KhachHang h){
        if(cons == null) return -1;
        try{
            if(h.getMa_khach_hang() == 0){
                String sql = "insert into khach_hang(ho_ten, so_dien_thoai, email, ma_tai_khoan) values(?,?,?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setString(1,h.getHo_ten());
                ps.setString(2, h.getSo_dien_thoai());
                ps.setString(3, h.getEmail());
                ps.setInt(4, h.getMa_tai_khoan());
                return ps.executeUpdate();            
            }
            else
            {
                String sql = "insert into khach_hang(ma_khach_hang, ho_ten, so_dien_thoai, email, ma_tai_khoan) values(?,?,?,?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setInt(1, h.getMa_khach_hang());
                ps.setString(2,h.getHo_ten());
                ps.setString(3, h.getSo_dien_thoai());
                ps.setString(4, h.getEmail());
                ps.setInt(5, h.getMa_tai_khoan());
                return ps.executeUpdate();              
            }           
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return -1;
    }
    public static int delete( Connection cons, KhachHang h){
        if(cons == null) return -1;
        try{
            String sql = "delete from khach_hang where ma_khach_hang = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setInt(1, h.getMa_khach_hang());
            return ps.executeUpdate();            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return -1;
    }
    public static int update( Connection cons, KhachHang h){
        if(cons == null) return -1;
        try{
            String sql = "update khach_hang set ho_ten = ?, so_dien_thoai = ?, email = ?, ma_tai_khoan  = ? where ma_khach_hang = ?";
            PreparedStatement ps = cons.prepareStatement(sql);         
            ps.setString(1,h.getHo_ten());
            ps.setString(2, h.getSo_dien_thoai());
            ps.setString(3, h.getEmail());
            ps.setInt(4, h.getMa_tai_khoan());
            ps.setInt(5, h.getMa_khach_hang());
            return ps.executeUpdate();          
        }
        catch(Exception ex){
            
            System.out.println(ex.getMessage());
        }
        return -1;
    } 
}
