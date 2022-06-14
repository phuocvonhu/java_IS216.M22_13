/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.util.List;
import java.sql.*;
import Model.*;
import java.util.ArrayList;

/**
 *
 * @author minht
 */
public class ChiTietKhuyenMaiDAO {
    public static List<ChiTietKhuyenMai> getAll(Connection cons){
        if(cons == null) return null;
        try{
            List<ChiTietKhuyenMai> kmlist = new ArrayList<ChiTietKhuyenMai>();
            String sql = "select * from chi_tiet_khuyen_mai";
            Statement st = cons.prepareCall(sql);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                kmlist.add(new ChiTietKhuyenMai(rs.getString(1), rs.getString(2)));
            }
            return kmlist;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static List<ChiTietKhuyenMai> getByMaKhuyenMai(Connection cons, String ma){
        if(cons == null) return null;
        try{
            List<ChiTietKhuyenMai> list = new ArrayList<ChiTietKhuyenMai>();
            String sql = "select * from chi_tiet_khuyen_mai where ma_khuyen_mai = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setString(1, ma);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                list.add(new ChiTietKhuyenMai(rs.getString(1), rs.getString(2)));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static List<ChiTietKhuyenMai> getByMaHoaDon(Connection cons, String ma){
        if(cons == null) return null;
        try{
            List<ChiTietKhuyenMai> list = new ArrayList<ChiTietKhuyenMai>();
            String sql = "select * from chi_tiet_khuyen_mai where ma_hoa_don = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setString(1, ma);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                list.add(new ChiTietKhuyenMai(rs.getString(1), rs.getString(2)));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static boolean insert( Connection cons, ChiTietKhuyenMai ct){
        if(cons == null) return false;
        try{
            String sql = "insert into chi_tiet_khuyen_mai(ma_khuyen_mai, ma_hoa_don) values(?,?)";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, ct.getMa_khuyen_mai());
            ps.setString(2, ct.getMa_hoa_don());
            return ps.execute();            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    public static boolean delete(Connection cons, ChiTietKhuyenMai ct ){
        if(cons == null) return false;
        try{
            String sql = "delete from chi_tiet_khuyen_mai where ma_khuyen_mai = ? and ma_hoa_don = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, ct.getMa_khuyen_mai());
            ps.setString(2, ct.getMa_hoa_don());
            return ps.execute();            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
}
