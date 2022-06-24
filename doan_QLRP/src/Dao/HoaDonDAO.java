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
public class HoaDonDAO {
    public static List<HoaDon> getAll(Connection cons){
        if(cons == null) return null;
        try{
            List<HoaDon> hoadonlist = new ArrayList<HoaDon>();
            String sql = "select * from hoa_don";
            Statement st = cons.prepareCall(sql);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                hoadonlist.add(new HoaDon(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getLong(4), rs.getString(5)));
            }
            return hoadonlist;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static HoaDon getByMaHoaDon(Connection cons, int ma){
        if(cons == null) return null;
        try{
            String sql = "select * from hoa_don where ma_hoa_don = ?";
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
    public static List<HoaDon> getByMaNhanVien(Connection cons, int ma){
        if(cons == null) return null;
        try{
            List<HoaDon> list = new ArrayList<HoaDon>();
            String sql = "select * from hoa_don where ma_nhan_vien = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                list.add(new HoaDon(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getLong(4), rs.getString(5)));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static List<HoaDon> getByMaKhachHang(Connection cons, int ma){
        if(cons == null) return null;
        try{
            List<HoaDon> list = new ArrayList<HoaDon>();
            String sql = "select * from hoa_don where ma_khach_hang = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                list.add(new HoaDon(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getLong(4), rs.getString(5)));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static List<HoaDon> getByNgayHoaDon(Connection cons, int nam, int thang){
        if(cons == null) return null;
        try{
            List<HoaDon> list = new ArrayList<HoaDon>();
            String sql = "select * from hoa_don where YEAR(ngay_hoa_don) = ? AND MONTH(ngay_hoa_don) = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setString(1, String.valueOf(nam));
            st.setString(2, String.valueOf(thang));
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                list.add(new HoaDon(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getLong(4), rs.getString(5)));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static int insert( Connection cons, HoaDon h){
        if(cons == null) return -1;
        try{
            if(h.getMa_hoa_don() == 0){
                String sql = "insert into hoa_don(ma_nhan_vien, ma_khach_hang, tri_gia, ngay_hoa_don) values(?,?,?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setInt(1, h.getMa_nhan_vien());
                ps.setInt(2, h.getMa_khach_hang());
                ps.setLong(3, h.getTri_gia());
                ps.setString(4, h.getNgay_hoa_don());
                return ps.executeUpdate();            
            }
            else
            {
                String sql = "insert into hoa_don(ma_hoa_don, ma_nhan_vien, ma_khach_hang, tri_gia, ngay_hoa_don) values(?,?,?,?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setInt(1, h.getMa_hoa_don());
                ps.setInt(2, h.getMa_nhan_vien());
                ps.setInt(3, h.getMa_khach_hang());
                ps.setLong(4, h.getTri_gia());
                ps.setString(5, h.getNgay_hoa_don());
                return ps.executeUpdate();      
            }           
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return -1;
    }
    public static int delete( Connection cons, HoaDon h){
        if(cons == null) return -1;
        try{
            String sql = "delete from hoa_don where ma_hoa_don = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setInt(1, h.getMa_hoa_don());
            return ps.executeUpdate();            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return -1;
    }
    public static int update( Connection cons, HoaDon h){
        if(cons == null) return -1;
        try{
            String sql = "update hoa_don set ma_nhan_vien = ?, ma_khach_hang = ?, tri_gia = ?, ngay_hoa_don  = ? where ma_hoa_don = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setInt(1, h.getMa_nhan_vien());
            ps.setInt(2, h.getMa_khach_hang());
            ps.setLong(3, h.getTri_gia());
            ps.setString(4, h.getNgay_hoa_don());
            ps.setInt(5, h.getMa_hoa_don());
            return ps.executeUpdate();          
        }
        catch(Exception ex){
            
            System.out.println(ex.getMessage());
        }
        return -1;
    } 
}
