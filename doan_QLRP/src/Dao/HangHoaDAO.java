/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.*;

import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author minht
 */
public class HangHoaDAO {
    public static List<HangHoa> getAll(Connection cons){
        if(cons == null) return null;
        try{
            List<HangHoa> hanghoalist = new ArrayList<HangHoa>();
            String sql = "select * from hang_hoa";
            Statement st = cons.prepareCall(sql);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                hanghoalist.add(new HangHoa(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getLong(4)));
            }
            return hanghoalist;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static HangHoa getByMaHangHoa(Connection cons, int i){
        if(cons == null) return null;
        try{
            String sql = "select * from hang_hoa where ma_hang_hoa = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setInt(1, i);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) return new HangHoa(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getLong(4));
            return null;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static int insert( Connection cons, HangHoa h){
        if(cons == null) return -1;
        try{
            if(h.getMa_hang_hoa() == 0){
                String sql = "insert into hang_hoa(ten_hang_hoa, tong_so_luong, don_gia) values(?,?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setString(1, h.getTen_hang_hoa());
                ps.setInt(2, h.getTong_so_luong());
                ps.setLong(3, h.getDon_gia());
                return ps.executeUpdate();            
            }
            else
            {
                String sql = "insert into hang_hoa(ma_hang_hoa, ten_hang_hoa, tong_so_luong, don_gia) values(?,?,?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setInt(1, h.getMa_hang_hoa());
                ps.setString(2, h.getTen_hang_hoa());
                ps.setInt(3, h.getTong_so_luong());
                ps.setLong(4, h.getDon_gia());
                return ps.executeUpdate();      
            }    
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return -1;
    }
    public static int delete( Connection cons, HangHoa h){
        if(cons == null) return -1;
        try{
            String sql = "delete from hang_hoa where ma_hang_hoa = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setInt(1, h.getMa_hang_hoa());
            return ps.executeUpdate();            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return -1;
    }
    public static int update( Connection cons, HangHoa h){
        if(cons == null) return -1;
        try{
            String sql = "update hang_hoa set ten_hang_hoa = ?, tong_so_luong = ?, don_gia = ? where ma_hang_hoa = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, h.getTen_hang_hoa());
            ps.setInt(2, h.getTong_so_luong());
            ps.setLong(3, h.getDon_gia());
            ps.setInt(4, h.getMa_hang_hoa());
            return ps.executeUpdate();          
        }
        catch(Exception ex){
            
            System.out.println(ex.getMessage());
        }
        return -1;
    } 
}
