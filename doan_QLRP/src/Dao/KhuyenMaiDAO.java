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
public class KhuyenMaiDAO {
    public static List<KhuyenMai> getAll(Connection cons){
        if(cons == null) return null;
        try{
            List<KhuyenMai> kmlist = new ArrayList<KhuyenMai>();
            String sql = "select * from khuyen_mai";
            Statement st = cons.prepareCall(sql);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                kmlist.add(new KhuyenMai(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getBoolean(4)));
            }
            return kmlist;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static KhuyenMai getByMaKhuyenMai(Connection cons, int ma){
        if(cons == null) return null;
        try{
            String sql = "select * from khuyen_mai where ma_khuyen_mai = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            if(rs.next()) return new KhuyenMai(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getBoolean(4));
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static int insert( Connection cons, KhuyenMai k){
        if(cons == null) return -1;
        try{
            if(k.getMa_khuyen_mai() == 0){
                String sql = "insert into khuyen_mai(noi_dung, tri_gia, dung_chung) values(?,?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setString(1, k.getNoi_dung());
                ps.setFloat(2, k.getTri_gia());
                ps.setBoolean(3, k.getDung_chung());
                return ps.executeUpdate();            
            }
            else
            {
                String sql = "insert into khuyen_mai(ma_khuyen_mai, noi_dung, tri_gia, dung_chung) values(?,?,?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setInt(1, k.getMa_khuyen_mai());
                ps.setString(2, k.getNoi_dung());
                ps.setFloat(3, k.getTri_gia());
                ps.setBoolean(4, k.getDung_chung());
                return ps.executeUpdate();      
            }           
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return -1;
    }
    public static int delete( Connection cons, KhuyenMai k){
        if(cons == null) return -1;
        try{
            String sql = "delete from khuyen_mai where ma_khuyen_mai = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setInt(1, k.getMa_khuyen_mai());
            return ps.executeUpdate();            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return -1;
    }
    public static int update( Connection cons, KhuyenMai k){
        if(cons == null) return -1;
        try{
            String sql = "update khuyen_mai set noi_dung = ?, tri_gia = ?, dung_chung = ? where ma_khuyen_mai = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, k.getNoi_dung());
            ps.setFloat(2, k.getTri_gia());
            ps.setBoolean(3, k.getDung_chung());
            ps.setInt(4, k.getMa_khuyen_mai());
            return ps.executeUpdate();          
        }
        catch(Exception ex){
            
            System.out.println(ex.getMessage());
        }
        return -1;
    } 
}
