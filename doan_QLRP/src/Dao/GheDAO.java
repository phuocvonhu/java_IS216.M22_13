/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.ChiTietKhuyenMai;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.*;
import java.sql.PreparedStatement;

/**
 *
 * @author minht
 */
public class GheDAO {
    public static List<Ghe> getAll(Connection cons){
        if(cons == null) return null;
        try{
            List<Ghe> ghelist = new ArrayList<Ghe>();
            String sql = "select * from ghe";
            Statement st = cons.prepareCall(sql);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                ghelist.add(new Ghe(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5)));
            }
            return ghelist;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static List<Ghe> getByMaGhe(Connection cons, int ma){
        if(cons == null) return null;
        try{
            List<Ghe> list = new ArrayList<Ghe>();
            String sql = "select * from ghe where ma_ghe = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                list.add(new Ghe(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5)));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static List<Ghe> getByMaPhongChieu(Connection cons, int ma){
        if(cons == null) return null;
        try{
            List<Ghe> list = new ArrayList<Ghe>();
            String sql = "select * from ghe where ma_phong_chieu = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                list.add(new Ghe(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5)));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static List<Ghe> getByTinhTrang(Connection cons, int ma){
        if(cons == null) return null;
        try{
            List<Ghe> list = new ArrayList<Ghe>();
            String sql = "select * from ghe where tinh_trang = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                list.add(new Ghe(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5)));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static List<Ghe> getByLoaiGhe(Connection cons, String ma){
        if(cons == null) return null;
        try{
            List<Ghe> list = new ArrayList<Ghe>();
            String sql = "select * from ghe where loai_ghe = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setString(1, ma);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                list.add(new Ghe(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5)));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static int insert( Connection cons, Ghe g){
        if(cons == null) return -1;
        try{
            if(g.getMa_ghe() == 0){
                String sql = "insert into ghe(ma_phong_chieu, ten_ghe, loai_ghe, tinh_trang) values(?,?,?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setInt(1, g.getMa_phong_chieu());
                ps.setString(2, g.getTen_ghe());
                ps.setString(3, g.getLoai_ghe());
                ps.setInt(4, g.getTinh_trang());
                return ps.executeUpdate();            
            }
            else
            {
                String sql = "insert into ghe(ma_ghe, ma_phong_chieu, ten_ghe, loai_ghe, tinh_trang) values(?,?,?,?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setInt(1, g.getMa_ghe());
                ps.setInt(2, g.getMa_phong_chieu());
                ps.setString(3, g.getTen_ghe());
                ps.setString(4, g.getLoai_ghe());
                ps.setInt(5, g.getTinh_trang());
                return ps.executeUpdate();      
            }           
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return -1;
    }
    public static int delete( Connection cons, Ghe g){
        if(cons == null) return -1;
        try{
            String sql = "delete from ghe where ma_ghe = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setInt(1, g.getMa_ghe());
            return ps.executeUpdate();            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return -1;
    }
    public static int update( Connection cons, Ghe g){
        if(cons == null) return -1;
        try{
            String sql = "update ghe set ma_phong_chieu = ?, ten_ghe = ?, loai_ghe = ?, tinh_trang  = ? where ma_ghe = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setInt(1, g.getMa_phong_chieu());
            ps.setString(2, g.getTen_ghe());
            ps.setString(3, g.getLoai_ghe());            
            ps.setInt(4, g.getTinh_trang());
            ps.setInt(5, g.getMa_ghe());
            return ps.executeUpdate();          
        }
        catch(Exception ex){
            
            System.out.println(ex.getMessage());
        }
        return -1;
    }    
}
