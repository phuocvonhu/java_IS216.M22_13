/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.TaiKhoan;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Lenovo
 */
public class DangNhapDao {
    public static ArrayList<TaiKhoan> listTaiKhoan() throws SQLException{
        ArrayList<TaiKhoan> list = new ArrayList<>(); 
        Connection con = (Connection) DBConnect.getConnectionMySql("root", "");
        String sql = "select * from tai_khoan";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            TaiKhoan tk = new TaiKhoan(rs.getInt("ma_tai_khoan"), rs.getString("ten_dang_nhap"), rs.getString("mat_khau"),rs.getInt("ma_loai_tai_khoan"));
        list.add(tk);
        }
        return list;
        
    }
    
    
    
    public static Integer login (String userName, String password) throws SQLException, ClassNotFoundException {
        Integer id = -1;
        ArrayList<TaiKhoan> arrListUser = listTaiKhoan();
        
        // Kiem tra userName va password nhap vao co ton tai. Neu co tra ve userID cua nguoi nay
        for (TaiKhoan x : arrListUser) {
//            System.out.println(x.getTen_dang_nhap());
//            System.out.println(x.getMat_khau());
//            System.out.println(x.getMa_loai_tai_khoan());
            if (x.getTen_dang_nhap().equals(userName) && x.getMat_khau().equals(password)) {
                id = x.getMa_loai_tai_khoan();
                break;
            }
        }
        return id;
    }
    
}
