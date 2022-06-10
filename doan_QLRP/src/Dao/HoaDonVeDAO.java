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
public class HoaDonVeDAO {
    public static List<HoaDonVe> getAll(Connection cons){
        if(cons == null) return null;
        try{
            List<HoaDonVe> hoadonvelist = new ArrayList<HoaDonVe>();
            String sql = "select * from hoa_don_ve";
            Statement st = cons.prepareCall(sql);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                hoadonvelist.add(new HoaDonVe(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getLong(5)));
            }
            return hoadonvelist;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static HoaDon getByMaVe(Connection cons, int ma){
        if(cons == null) return null;
        try{
            String sql = "select * from hoa_don_ve where ma_ve = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            if(rs.next()) return new HoaDon(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getLong(4), rs.getString(5));
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static List<HoaDonVe> getByMaHoaDon(Connection cons, int ma){
        if(cons == null) return null;
        try{
            List<HoaDonVe> list = new ArrayList<HoaDonVe>();
            String sql = "select * from hoa_don_ve where ma_hoa_don = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                list.add(new HoaDonVe(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getLong(5)));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static List<HoaDonVe> getByMaSuatChieu(Connection cons, int ma){
        if(cons == null) return null;
        try{
            List<HoaDonVe> list = new ArrayList<HoaDonVe>();
            String sql = "select * from hoa_don_ve where ma_suat_chieu = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                list.add(new HoaDonVe(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getLong(5)));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static boolean insert( Connection cons, HoaDonVe h){
        if(cons == null) return false;
        try{
            if(h.getMa_ve() == 0){
                String sql = "insert into hoa_don_ve(ma_hoa_don, ma_suat_chieu, ma_ghe, gia) values(?,?,?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setInt(1, h.getMa_hoa_don());
                ps.setInt(2, h.getMa_suat_chieu());
                ps.setInt(3, h.getMa_ghe());
                ps.setLong(4, h.getGia());
                return ps.execute();            
            }
            else
            {
                String sql = "insert into hoa_don_ve(ma_hoa_don, ma_ve, ma_suat_chieu, ma_ghe, gia) values(?,?,?,?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setInt(1, h.getMa_hoa_don());
                ps.setInt(2, h.getMa_ve());
                ps.setInt(3, h.getMa_suat_chieu());
                ps.setInt(4, h.getMa_ghe());
                ps.setLong(5, h.getGia());
                return ps.execute();      
            }           
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    public static boolean delete( Connection cons, HoaDonVe h){
        if(cons == null) return false;
        try{
            String sql = "delete from hoa_don_ve where ma_ve = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setInt(1, h.getMa_ve());
            return ps.execute();            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    public static boolean update( Connection cons, HoaDonVe h){
        if(cons == null) return false;
        try{
            String sql = "update hoa_don set ma_hoa_don = ?, ma_suat_chieu = ?, ma_ghe = ?, gia = ? where ma_ve = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setInt(1, h.getMa_hoa_don());
            ps.setInt(2, h.getMa_suat_chieu());
            ps.setInt(3, h.getMa_ghe());
            ps.setLong(4, h.getGia());
            ps.setInt(5, h.getMa_ve());
            return ps.execute();          
        }
        catch(Exception ex){
            
            System.out.println(ex.getMessage());
        }
        return false;
    }         
}
