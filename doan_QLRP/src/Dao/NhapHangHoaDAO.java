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
public class NhapHangHoaDAO {
    public static List<NhapHangHoa> getAll(Connection cons){
        if(cons == null) return null;
        try{
            List<NhapHangHoa> list = new ArrayList<NhapHangHoa>();
            String sql = "select * from nhap_hang_hoa";
            Statement st = cons.prepareCall(sql);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                list.add(new NhapHangHoa(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getLong(5), rs.getString(6)));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static NhapHangHoa getByMaDon(Connection cons, int ma){
        if(cons == null) return null;
        try{
            String sql = "select * from nhap_hang_hoa where ma_don = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            if(rs.next()) return new NhapHangHoa(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getLong(5), rs.getString(6));
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static List<NhapHangHoa> getByMaNcc(Connection cons, int ma){
        if(cons == null) return null;
        try{
            List<NhapHangHoa> list = new ArrayList<NhapHangHoa>();
            String sql = "select * from nhap_hang_hoa where ma_ncc = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                list.add( new NhapHangHoa(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getLong(5), rs.getString(6)));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static List<NhapHangHoa> getByMaHangHoa(Connection cons, int ma){
        if(cons == null) return null;
        try{
            List<NhapHangHoa> list = new ArrayList<NhapHangHoa>();
            String sql = "select * from nhap_hang_hoa where ma_hang_hoa = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                list.add( new NhapHangHoa(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getLong(5), rs.getString(6)));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static boolean insert( Connection cons, NhapHangHoa n){
        if(cons == null) return false;
        try{
            if(n.getMa_don() == 0){
                String sql = "insert into nhap_hang_hoa(ma_ncc, ma_hang_hoa, so_luong, don_gia, ngay_nhap) values(?,?,?,?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setInt(1, n.getMa_ncc());
                ps.setInt(2, n.getMa_hang_hoa());
                ps.setInt(3, n.getSo_luong());
                ps.setLong(4, n.getDon_gia());
                ps.setString(5, n.getNgay_nhap());
                return ps.execute();            
            }
            else
            {
                String sql = "insert into nhap_hang_hoa(ma_don, ma_ncc, ma_hang_hoa, so_luong, don_gia, ngay_nhap) values(?,?,?,?,?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setInt(1, n.getMa_don());
                ps.setInt(2, n.getMa_ncc());
                ps.setInt(3, n.getMa_hang_hoa());
                ps.setInt(4, n.getSo_luong());
                ps.setLong(5, n.getDon_gia());
                ps.setString(6, n.getNgay_nhap());
                return ps.execute();      
            }           
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    public static boolean delete( Connection cons, NhapHangHoa n){
        if(cons == null) return false;
        try{
            String sql = "delete from nhap_hang_hoa where ma_don = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setInt(1, n.getMa_don());
            return ps.execute();            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    public static boolean update( Connection cons, NhapHangHoa n){
        if(cons == null) return false;
        try{
            String sql = "update nhap_hang_hoa set ma_ncc = ?, ma_hang_hoa = ?, so_luong = ?, don_gia = ?, ngay_nhap = ? where ma_don = ?";
            PreparedStatement ps = cons.prepareStatement(sql);           
            ps.setInt(1, n.getMa_ncc());
            ps.setInt(2, n.getMa_hang_hoa());
            ps.setInt(3, n.getSo_luong());
            ps.setLong(4, n.getDon_gia());
            ps.setString(5, n.getNgay_nhap());
            ps.setInt(6, n.getMa_don());
            return ps.execute();          
        }
        catch(Exception ex){
            
            System.out.println(ex.getMessage());
        }
        return false;
    } 
}
