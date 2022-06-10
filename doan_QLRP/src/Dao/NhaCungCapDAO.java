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
public class NhaCungCapDAO {
    public static List<NhaCungCap> getAll(Connection cons){
        if(cons == null) return null;
        try{
            List<NhaCungCap> ncclist = new ArrayList<NhaCungCap>();
            String sql = "select * from nha_cung_cap";
            Statement st = cons.prepareCall(sql);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                ncclist.add(new NhaCungCap(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
            return ncclist;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static boolean insert( Connection cons, NhaCungCap n){
        if(cons == null) return false;
        try{
            if(n.getMa_ncc() == 0){
                String sql = "insert into nha_cung_cap(ten_ncc, dia_chi) values(?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setString(1, n.getTen_ncc());
                ps.setString(2, n.getDia_chi());
                return ps.execute();            
            }
            else
            {
                String sql = "insert into nha_cung_cap(ma_ncc, ten_ncc, dia_chi) values(?,?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setInt(1, n.getMa_ncc());
                ps.setString(2, n.getTen_ncc());
                ps.setString(3, n.getDia_chi());
                return ps.execute();      
            }           
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    public static boolean delete( Connection cons, NhaCungCap n){
        if(cons == null) return false;
        try{
            String sql = "delete from nha_cung_cap where ma_ncc = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setInt(1, n.getMa_ncc());
            return ps.execute();            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    public static boolean update( Connection cons, NhaCungCap n){
        if(cons == null) return false;
        try{
            String sql = "update nha_cung_cap set ten_ncc = ?, dia_chi = ? where ma_ncc = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, n.getTen_ncc());
            ps.setString(2, n.getDia_chi());
            ps.setInt(3, n.getMa_ncc());
            return ps.execute();          
        }
        catch(Exception ex){
            
            System.out.println(ex.getMessage());
        }
        return false;
    } 
}
