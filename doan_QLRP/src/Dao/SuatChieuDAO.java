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
public class SuatChieuDAO {
    public static List<SuatChieu> getAll(Connection cons){
        if(cons == null) return null;
        try{
            List<SuatChieu> list = new ArrayList<SuatChieu>();
            String sql = "select * from suat_chieu";
            Statement st = cons.prepareCall(sql);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                list.add(new SuatChieu(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getLong(4), rs.getString(5)));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static List<SuatChieu> getByMaPhongChieu(Connection cons, int ma){
        if(cons == null) return null;
        try{
            List<SuatChieu> list = new ArrayList<SuatChieu>();
            String sql = "select * from suat_chieu where ma_phong_chieu = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                list.add(new SuatChieu(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getLong(4), rs.getString(5)));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static List<SuatChieu> getByMaSuatChieu(Connection cons, int ma){
        if(cons == null) return null;
        try{
            List<SuatChieu> list = new ArrayList<SuatChieu>();
            String sql = "select * from suat_chieu where ma_suat_chieu = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                list.add(new SuatChieu(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getLong(4), rs.getString(5)));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static List<SuatChieu> getByMaPhim(Connection cons, int ma){
        if(cons == null) return null;
        try{
            List<SuatChieu> list = new ArrayList<SuatChieu>();
            String sql = "select * from suat_chieu where ma_phim = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                list.add(new SuatChieu(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getLong(4), rs.getString(5)));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static int insert( Connection cons, SuatChieu s){
        if(cons == null) return -1;
        try{
            String sql = "insert into suat_chieu(ma_suat_chieu, ma_phong_chieu, ma_phim, gia_ve, thoi_gian) values(?,?,?,?,?)";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setInt(1, s.getMa_suat_chieu());
            ps.setInt(2, s.getMa_phong_chieu());
            ps.setInt(3, s.getMa_phim());
            ps.setLong(4, s.getGia_ve());
            ps.setString(5, s.getThoi_gian());
            return ps.executeUpdate();       
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return -1;
    }
    public static int delete( Connection cons, int maSuatChieu){
        if(cons == null) return -1;
        try{
            String sql = "delete from suat_chieu where ma_suat_chieu = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setInt(1, maSuatChieu);
            return ps.executeUpdate();            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return -1;
    }
    public static int update( Connection cons, SuatChieu s){
        if(cons == null) return -1;
        try{
            String sql = "update suat_chieu set ma_phim = ?, gia_ve = ? where ma_suat_chieu = ? and ma_phong_chieu = ? and thoi_gian = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setInt(1, s.getMa_phim());
            ps.setLong(2, s.getGia_ve());
            ps.setInt(3, s.getMa_suat_chieu());
            ps.setInt(4, s.getMa_phong_chieu());
            ps.setString(5, s.getThoi_gian());
            return ps.executeUpdate();          
        }
        catch(Exception ex){
            
            System.out.println(ex.getMessage());
        }
        return -1;
    }
    
    public static List<SuatChieu> getByMaPhimAndMaPhongChieu(Connection cons, int maPhim, int maPhongChieu){
        if(cons == null) return null;
        try{
            List<SuatChieu> list = new ArrayList<SuatChieu>();
            String sql = "select * from suat_chieu where ma_phim = ? AND ma_phong_chieu = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, maPhim);
            st.setInt(2, maPhongChieu);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                list.add(new SuatChieu(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getLong(4), rs.getString(5)));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public static List<SuatChieu> getByThoiGian(Connection cons, String time) {
        if(cons == null) return null;
        try{
            List<SuatChieu> list = new ArrayList<SuatChieu>();
            String sql = "select * from suat_chieu where thoi_gian = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setString(1, time);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                list.add(new SuatChieu(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getLong(4), rs.getString(5)));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
