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
public class PhongChieuDAO {
    public static List<PhongChieu> getAll(Connection cons){
        if(cons == null) return null;
        try{
            List<PhongChieu> list = new ArrayList<PhongChieu>();
            String sql = "select * from phong_chieu";
            Statement st = cons.prepareCall(sql);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                list.add(new PhongChieu(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static PhongChieu getByMaPhongChieu(Connection cons, int ma){
        if(cons == null) return null;
        try{
            String sql = "select * from phong_chieu where ma_phong_chieu = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            if(rs.next()) return new PhongChieu(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static boolean insert( Connection cons, PhongChieu p){
        if(cons == null) return false;
        try{
            if(p.getMa_phong_chieu() == 0){
                String sql = "insert into phong_chieu(ten_phong_chieu, loai_phong_chieu, so_luong_ghe) values(?,?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setString(1, p.getTen_phong_chieu());
                ps.setString(2, p.getLoai_phong_chieu());
                ps.setInt(3, p.getSo_luong_ghe());
                return ps.execute();            
            }
            else
            {
                String sql = "insert into phong_chieu(ma_phong_chieu, ten_phong_chieu, loai_phong_chieu, so_luong_ghe) values(?,?,?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setInt(1, p.getMa_phong_chieu());
                ps.setString(2, p.getTen_phong_chieu());
                ps.setString(3, p.getLoai_phong_chieu());
                ps.setInt(4, p.getSo_luong_ghe());
                return ps.execute();      
            }           
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    public static boolean delete( Connection cons, PhongChieu p){
        if(cons == null) return false;
        try{
            String sql = "delete from phong_chieu where ma_phong_chieu = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setInt(1, p.getMa_phong_chieu());
            return ps.execute();            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    public static boolean update( Connection cons, PhongChieu p){
        if(cons == null) return false;
        try{
            String sql = "update phong_chieu set ten_phong_chieu = ?, loai_phong_chieu = ?, so_luong_ghe = ? where ma_phong_chieu = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, p.getTen_phong_chieu());
            ps.setString(2, p.getLoai_phong_chieu());
            ps.setInt(3, p.getSo_luong_ghe());
            ps.setInt(4, p.getMa_phong_chieu());
            return ps.execute();          
        }
        catch(Exception ex){
            
            System.out.println(ex.getMessage());
        }
        return false;
    }

}
