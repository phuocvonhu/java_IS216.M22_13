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
public class HoaDonHangHoaDAO {
    public static List<HoaDonHangHoa> getAll(Connection cons){
        if(cons == null) return null;
        try{
            List<HoaDonHangHoa> hoadonhhlist = new ArrayList<HoaDonHangHoa>();
            String sql = "select * from hoa_don_hang_hoa";
            Statement st = cons.prepareCall(sql);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                hoadonhhlist.add(new HoaDonHangHoa(rs.getInt(1), rs.getInt(2), rs.getInt(3)));
            }
            return hoadonhhlist;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static List<HoaDonHangHoa> getByMaHoaDon(Connection cons, int ma){
        if(cons == null) return null;
        try{
            List<HoaDonHangHoa> list = new ArrayList<HoaDonHangHoa>();
            String sql = "select * from hoa_don_hang_hoa where ma_hoa_don = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                list.add(new HoaDonHangHoa(rs.getInt(1), rs.getInt(2), rs.getInt(3)));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static List<HoaDonHangHoa> getByMaHangHoa(Connection cons, int ma){
        if(cons == null) return null;
        try{
            List<HoaDonHangHoa> list = new ArrayList<HoaDonHangHoa>();
            String sql = "select * from hoa_don_hang_hoa where ma_hang_hoa = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                list.add(new HoaDonHangHoa(rs.getInt(1), rs.getInt(2), rs.getInt(3)));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }   
    public static boolean insert( Connection cons, HoaDonHangHoa h){
        if(cons == null) return false;
        try{
            String sql = "insert into hoa_don_hang_hoa(ma_hoa_don, ma_hang_hoa, so_luong) values(?,?,?)";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setInt(1, h.getMa_hoa_don());
            ps.setInt(2, h.getMa_hang_hoa());
            ps.setInt(3, h.getSo_luong());
            return ps.execute();      
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    public static boolean delete( Connection cons, HoaDonHangHoa h){
        if(cons == null) return false;
        try{
            String sql = "delete from hoa_don_hang_hoa where ma_hoa_don = ? and ma_hang_hoa = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setInt(1, h.getMa_hoa_don());
            ps.setInt(2, h.getMa_hang_hoa());
            return ps.execute();            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    public static boolean update( Connection cons, HoaDonHangHoa h){
        if(cons == null) return false;
        try{
            String sql = "update hoa_don_hang_hoa set so_luong = ? where ma_hoa_don = ? and ma_hang_hoa = ?";
            PreparedStatement ps = cons.prepareStatement(sql);  
            ps.setInt(1, h.getSo_luong());
            ps.setInt(2, h.getMa_hoa_don());
            ps.setInt(3, h.getMa_hang_hoa());
            return ps.execute();          
        }
        catch(Exception ex){
            
            System.out.println(ex.getMessage());
        }
        return false;
    } 
}
