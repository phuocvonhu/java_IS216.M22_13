/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;

/**
 *
 * @author minht
 */
public class PhimThemDAO {
    public static List<PhimThem> getAll(Connection cons){
        if(cons == null) return null;
        try{
            List<PhimThem> list = new ArrayList<PhimThem>();
            String sql = "select * from phim_them";
            Statement st = cons.prepareCall(sql);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                list.add(new PhimThem(rs.getInt(1), rs.getString(2), ImageIO.read(rs.getBlob(3).getBinaryStream())));
            }
            return list;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static PhimThem getByMaPhim(Connection cons, int ma){
        if(cons == null) return null;
        try{
            String sql = "select * from phim_them where ma_phim = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            if(rs.next()) return new PhimThem(rs.getInt(1), rs.getString(2), ImageIO.read(rs.getBlob(3).getBinaryStream()));
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static int insert( Connection cons, PhimThem p){
        if(cons == null) return -1;
        try{
            if(p.getMa_phim() == 0){
                String sql = "insert into phim_them(mo_ta, anh_minh_hoa) values(?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setString(1, p.getMo_ta());
                ByteArrayOutputStream os = new ByteArrayOutputStream();
                ImageIO.write(p.getAnh_minh_hoa(), "png", os);
                InputStream is = new ByteArrayInputStream(os.toByteArray());
                ps.setBinaryStream(2, is);
                return ps.executeUpdate();            
            }
            else
            {
                String sql = "insert into phim_them(ma_phim, mo_ta, anh_minh_hoa) values(?,?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setInt(1, p.getMa_phim());
                ps.setString(2, p.getMo_ta());
                ByteArrayOutputStream os = new ByteArrayOutputStream();
                ImageIO.write(p.getAnh_minh_hoa(), "png", os);
                InputStream is = new ByteArrayInputStream(os.toByteArray());
                ps.setBinaryStream(3, is);
                return ps.executeUpdate();      
            }           
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return -1;
    }
    public static int delete( Connection cons, PhimThem p){
        if(cons == null) return -1;
        try{
            String sql = "delete from phim_them where ma_phim = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setInt(1, p.getMa_phim());
            return ps.executeUpdate();            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return -1;
    }
    public static int update( Connection cons, PhimThem p){
        if(cons == null) return -1;
        try{
            String sql = "update phim_them set mo_ta = ?, anh_minh_hoa = ? where ma_phim = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, p.getMo_ta());
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            ImageIO.write(p.getAnh_minh_hoa(), "png", os);
            InputStream is = new ByteArrayInputStream(os.toByteArray());
            ps.setBinaryStream(2, is);
            ps.setLong(3, p.getMa_phim());
            return ps.executeUpdate();          
        }
        catch(Exception ex){
            
            System.out.println(ex.getMessage());
        }
        return -1;
    } 
}
