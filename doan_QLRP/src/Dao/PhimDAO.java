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
public class PhimDAO {
    public static List<Phim> getAll(Connection cons){
        if(cons == null) return null;
        try{
            List<Phim> list = new ArrayList<Phim>();
            String sql = "select * from phim";
            Statement st = cons.prepareCall(sql);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                list.add(new Phim(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7)));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static Phim getByMaPhim(Connection cons, int ma){
        if(cons == null) return null;
        try{
            String sql = "select * from phim where ma_phim = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            if(rs.next()) return new Phim(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7));
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static boolean insert( Connection cons, Phim p){
        if(cons == null) return false;
        try{
            if(p.getMa_phim() == 0){
                String sql = "insert into phim(ten_phim, loai_phim, tac_gia, quoc_gia, thoi_luong, nam_phat_hanh) values(?,?,?,?,?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setString(1, p.getTen_phim());
                ps.setString(2, p.getLoai_phim());
                ps.setString(3, p.getTac_gia());
                ps.setString(4, p.getQuoc_gia());
                ps.setInt(5, p.getThoi_luong());
                ps.setString(6, p.getNam_phat_hanh());
                return ps.execute();            
            }
            else
            {
                String sql = "insert into phim(ma_phim, ten_phim, loai_phim, tac_gia, quoc_gia, thoi_luong, nam_phat_hanh) values(?,?,?,?,?,?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setInt(1, p.getMa_phim());
                ps.setString(2, p.getTen_phim());
                ps.setString(3, p.getLoai_phim());
                ps.setString(4, p.getTac_gia());
                ps.setString(5, p.getQuoc_gia());
                ps.setInt(6, p.getThoi_luong());
                ps.setString(7, p.getNam_phat_hanh());
                return ps.execute();      
            }           
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    public static boolean delete( Connection cons, Phim p){
        if(cons == null) return false;
        try{
            String sql = "delete from phim where ma_phim = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setInt(1, p.getMa_phim());
            return ps.execute();            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    public static boolean update( Connection cons, Phim p){
        if(cons == null) return false;
        try{
            String sql = "update phim set ten_phim = ?, loai_phim = ?, tac_gia = ?, quoc_gia  = ?, thoi_luong = ?, nam_phat_hanh = ? where ma_phim = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, p.getTen_phim());
            ps.setString(2, p.getLoai_phim());
            ps.setString(3, p.getTac_gia());
            ps.setString(4, p.getQuoc_gia());
            ps.setInt(5, p.getThoi_luong());
            ps.setString(6, p.getNam_phat_hanh());
            ps.setInt(7, p.getMa_phim());
            return ps.execute();          
        }
        catch(Exception ex){
            
            System.out.println(ex.getMessage());
        }
        return false;
    } 
}
