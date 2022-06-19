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
public class SuCoDAO {
    public static List<SuCo> getAll(Connection cons){
        if(cons == null) return null;
        try{
            List<SuCo> list = new ArrayList<SuCo>();
            String sql = "select * from su_co";
            Statement st = cons.prepareCall(sql);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                list.add(new SuCo(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4)));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static SuCo getByMaSuCo(Connection cons, int ma){
        if(cons == null) return null;
        try{
            String sql = "select * from su_co where ma_su_co = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            if(rs.next()) return new SuCo(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4));
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static List<SuCo> getByMaPhongChieu(Connection cons, int ma){
        if(cons == null) return null;
        try{
            List<SuCo> list = new ArrayList<SuCo>();
            String sql = "select * from su_co where ma_phong_chieu = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                list.add( new SuCo(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4)));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static int insert( Connection cons, SuCo s){
        if(cons == null) return -1;
        try{
            if(s.getMa_su_co() == 0){
                String sql = "insert into su_co(ma_phong_chieu, ten_su_co, thong_tin_them) values(?,?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setInt(1, s.getMa_phong_chieu());
                ps.setString(2, s.getTen_su_co());
                ps.setString(3, s.getThong_tin_them());
                return ps.executeUpdate();            
            }
            else
            {
                String sql = "insert into su_co(ma_su_co, ma_phong_chieu, ten_su_co, thong_tin_them) values(?,?,?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setInt(1, s.getMa_su_co());
                ps.setInt(2, s.getMa_phong_chieu());
                ps.setString(3, s.getTen_su_co());
                ps.setString(4, s.getThong_tin_them());
                return ps.executeUpdate();      
            }           
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return -1;
    }
    public static int delete( Connection cons, SuCo s){
        if(cons == null) return -1;
        try{
            String sql = "delete from su_co where ma_su_co = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setInt(1, s.getMa_su_co());
            return ps.executeUpdate();            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return -1;
    }
    public static int update( Connection cons, SuCo s){
        if(cons == null) return -1;
        try{
            String sql = "update su_co set ma_phong_chieu = ?, ten_su_co = ?, thong_tin_them = ? where ma_su_co = ?";
            PreparedStatement ps = cons.prepareStatement(sql);            
            ps.setInt(1, s.getMa_phong_chieu());
            ps.setString(2, s.getTen_su_co());
            ps.setString(3, s.getThong_tin_them());
            ps.setInt(4, s.getMa_su_co());
            return ps.executeUpdate();          
        }
        catch(Exception ex){
            
            System.out.println(ex.getMessage());
        }
        return -1;
    }     

}
