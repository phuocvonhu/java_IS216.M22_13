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
public class PhanHoiDAO {
    public static List<PhanHoi> getAll(Connection cons){
        if(cons == null) return null;
        try{
            List<PhanHoi> list = new ArrayList<PhanHoi>();
            String sql = "select * from phan_hoi";
            Statement st = cons.prepareCall(sql);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                list.add(new PhanHoi(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getFloat(4)));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static PhanHoi getByMaPhanHoi(Connection cons, int ma){
        if(cons == null) return null;
        try{
            String sql = "select * from phan_hoi where ma_phan_hoi = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            if(rs.next()) return new PhanHoi(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getFloat(4));
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static List<PhanHoi> getByMaKhachHang(Connection cons, int ma){
        if(cons == null) return null;
        try{
            List<PhanHoi> list = new ArrayList<PhanHoi>();
            String sql = "select * from phan_hoi where ma_khach_hang = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                list.add(new PhanHoi(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getFloat(4)));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static int insert( Connection cons, PhanHoi p){
        if(cons == null) return -1;
        try{
            if(p.getMa_phan_hoi() == 0){
                String sql = "insert into phan_hoi(ma_khach_hang, noi_dung, danh_gia) values(?,?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setInt(1, p.getMa_khach_hang());
                ps.setString(2, p.getNoi_dung());
                ps.setFloat(3, p.getDanh_gia());
                return ps.executeUpdate();            
            }
            else
            {
                String sql = "insert into phan_hoi(ma_phan_hoi, ma_khach_hang, noi_dung, danh_gia) values(?,?,?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setInt(1, p.getMa_phan_hoi());
                ps.setInt(2, p.getMa_khach_hang());
                ps.setString(3, p.getNoi_dung());
                ps.setFloat(4, p.getDanh_gia());
                return ps.executeUpdate();      
            }           
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return -1;
    }
    public static int delete( Connection cons, PhanHoi p){
        if(cons == null) return -1;
        try{
            String sql = "delete from phan_hoi where ma_phan_hoi = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setInt(1, p.getMa_phan_hoi());
            return ps.executeUpdate();            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return -1;
    }
    public static int update( Connection cons, PhanHoi p){
        if(cons == null) return -1;
        try{
            String sql = "update phan_hoi set ma_khach_hang = ?, noi_dung = ?, danh_gia  = ? where ma_phan_hoi = ?";
            PreparedStatement ps = cons.prepareStatement(sql);     
            ps.setInt(1, p.getMa_khach_hang());
            ps.setString(2, p.getNoi_dung());
            ps.setFloat(3, p.getDanh_gia());
            ps.setInt(4, p.getMa_phan_hoi());
            return ps.executeUpdate();          
        }
        catch(Exception ex){
            
            System.out.println(ex.getMessage());
        }
        return -1;
    } 
}
