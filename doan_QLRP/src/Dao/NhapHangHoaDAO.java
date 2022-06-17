/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.*;
import java.sql.Connection;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author minht
 */
public class NhapHangHoaDAO {

    public static List<NhapHangHoa> getAll(Connection cons) {
        if (cons == null) {
            return null;
        }
        try {
            List<NhapHangHoa> list = new ArrayList<NhapHangHoa>();
            String sql = "select ma_don, nhh.ma_ncc, ten_ncc, nhh.ma_hang_hoa, ten_hang_hoa, nhh.so_luong, nhh.don_gia, ngay_nhap\n"
                    + "from (nhap_hang_hoa nhh join hang_hoa hh on nhh.ma_hang_hoa = hh.ma_hang_hoa) join nha_cung_cap ncc on ncc.ma_ncc = nhh.ma_ncc";
            Statement st = cons.prepareCall(sql);
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                list.add(new NhapHangHoa(rs.getInt("ma_don"), rs.getInt("ma_ncc"), rs.getInt("ma_hang_hoa"), rs.getInt("so_luong"), rs.getLong("don_gia"), rs.getString("ngay_nhap"), rs.getString("ten_ncc"), rs.getString("ten_hang_hoa")));
            }
            return list;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public static NhapHangHoa getByMaDon(Connection cons, int ma) {
        if (cons == null) {
            return null;
        }
        try {
            String sql = "select * from nhap_hang_hoa where ma_don = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new NhapHangHoa(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getLong(5), rs.getString(6));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public static List<NhapHangHoa> getByMaNcc(Connection cons, int ma) {
        if (cons == null) {
            return null;
        }
        try {
            List<NhapHangHoa> list = new ArrayList<NhapHangHoa>();
            String sql = "select * from nhap_hang_hoa where ma_ncc = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new NhapHangHoa(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getLong(5), rs.getString(6)));
            }
            return list;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public static List<NhapHangHoa> getByMaHangHoa(Connection cons, int ma) {
        if (cons == null) {
            return null;
        }
        try {
            List<NhapHangHoa> list = new ArrayList<NhapHangHoa>();
            String sql = "select * from nhap_hang_hoa where ma_hang_hoa = ?";
            PreparedStatement st = cons.prepareStatement(sql);
            st.setInt(1, ma);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new NhapHangHoa(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getLong(5), rs.getString(6)));
            }
            return list;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public static Integer insert(Connection cons, NhapHangHoa n) {
        if (cons == null) {
            return 0;
        }
        try {
            if (n.getMa_don() == 0) {
                String sql = "insert into nhap_hang_hoa(ma_ncc, ma_hang_hoa, so_luong, don_gia, ngay_nhap) values(?,?,?,?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setInt(1, n.getMa_ncc());
                ps.setInt(2, n.getMa_hang_hoa());
                ps.setInt(3, n.getSo_luong());
                ps.setLong(4, n.getDon_gia());
                ps.setString(5, n.getNgay_nhap());
                return ps.executeUpdate();
            } else {
                String sql = "insert into nhap_hang_hoa(ma_don, ma_ncc, ma_hang_hoa, so_luong, don_gia, ngay_nhap) values(?,?,?,?,?,?)";
                PreparedStatement ps = cons.prepareStatement(sql);
                ps.setInt(1, n.getMa_don());
                ps.setInt(2, n.getMa_ncc());
                ps.setInt(3, n.getMa_hang_hoa());
                ps.setInt(4, n.getSo_luong());
                ps.setLong(5, n.getDon_gia());
                ps.setString(6, n.getNgay_nhap());
                return ps.executeUpdate();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }

    public static boolean delete(Connection cons, NhapHangHoa n) {
        if (cons == null) {
            return false;
        }
        try {
            String sql = "delete from nhap_hang_hoa where ma_don = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setInt(1, n.getMa_don());
            return ps.execute();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    public static Integer update(Connection cons, NhapHangHoa n) {
        if (cons == null) {
            return 0;
        }
        try {
            String sql = "update nhap_hang_hoa set ma_ncc = ?, ma_hang_hoa = ?, so_luong = ?, don_gia = ?, ngay_nhap = ? where ma_don = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setInt(1, n.getMa_ncc());
            ps.setInt(2, n.getMa_hang_hoa());
            ps.setInt(3, n.getSo_luong());
            ps.setLong(4, n.getDon_gia());
            ps.setString(5, n.getNgay_nhap());
            ps.setInt(6, n.getMa_don());
            return ps.executeUpdate();
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
        return 0;
    }

    public static List<NhaCungCap> getncc(Connection cons) throws SQLException {
        List<NhaCungCap> dsncc = new ArrayList<NhaCungCap>();
        String sql = "SELECT * FROM NHA_CUNG_CAP";
        PreparedStatement ps = cons.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            dsncc.add(new NhaCungCap(rs.getInt("ma_ncc"), rs.getString("ten_ncc"), ""));
        }
        return dsncc;
    }

    public static List<HangHoa> gethh(Connection cons) throws SQLException {
        List<HangHoa> dshh = new ArrayList<HangHoa>();
        String sql = "SELECT * FROM HANG_HOA";
        PreparedStatement ps = cons.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            dshh.add(new HangHoa(rs.getInt("ma_hang_hoa"), rs.getString("ten_hang_hoa"), 0, 0));
        }
        return dshh;
    }

    public static List<NhapHangHoa> find(Connection cons, NhapHangHoa hh)throws SQLException {

            List<NhapHangHoa> list = new ArrayList<>();
            String sql = "select ma_don, nhh.ma_ncc, ten_ncc, nhh.ma_hang_hoa, ten_hang_hoa, nhh.so_luong, nhh.don_gia, ngay_nhap\n"
                    + "from ((nhap_hang_hoa nhh join hang_hoa hh on nhh.ma_hang_hoa = hh.ma_hang_hoa) join nha_cung_cap ncc on ncc.ma_ncc = nhh.ma_ncc)\n"
                    + "where ma_don = nvl(?,ma_don)\n"
                    + "and nhh.ma_ncc = nvl(?,nhh.ma_ncc)\n"
                    + "and nhh.ma_hang_hoa = nvl(?,nhh.ma_hang_hoa)\n"
                    + "and nhh.so_luong = nvl(?,nhh.so_luong)\n"
                    + "and nhh.don_gia = nvl(?,nhh.don_gia)\n"
                    + "and ngay_nhap = nvl(?,ngay_nhap)";


            PreparedStatement ps = cons.prepareStatement(sql);
            if (hh.getMa_don() != -1) {
                ps.setInt(1, hh.getMa_don());
            } else {
                ps.setString(1, null);
            }

            if (hh.getMa_ncc() != -1) {
                ps.setInt(2, hh.getMa_ncc());
            } else {
                ps.setString(2, null);
            }

            if (hh.getMa_hang_hoa() != -1) {
                ps.setInt(3, hh.getMa_hang_hoa());
            } else {
                ps.setString(3, null);
            }

            if (hh.getSo_luong() != -1) {
                ps.setInt(4, hh.getSo_luong());
            } else {
                ps.setString(4, null);
            }

            if (hh.getDon_gia() != -1) {
                ps.setLong(5, hh.getDon_gia());
            } else {
                ps.setString(5, null);
            }

            ps.setString(6, hh.getNgay_nhap());

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new NhapHangHoa(rs.getInt("ma_don"), rs.getInt("ma_ncc"), rs.getInt("ma_hang_hoa"), rs.getInt("so_luong"), rs.getLong("don_gia"), rs.getString("ngay_nhap"), rs.getString("ten_ncc"), rs.getString("ten_hang_hoa")));
            }
            return list;
    }


}
