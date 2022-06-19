package View;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import Model.*;

public class ClassTableModel {

    public static DefaultTableModel setTableNhanVien(List<NhanVien> listItem, String[] listColumn) {
        int columns = listColumn.length;
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }

//            @Override
//            public Class<?> getColumnClass(int columnIndex) {
//                return columnIndex == 7 ? Boolean.class : String.class;
//            }
        };
        dtm.setColumnIdentifiers(listColumn);
        Object[] obj;
        int num = listItem.size();
        NhanVien nv = null;
        for (int i = 0; i < num; i++) {
            nv = listItem.get(i);
            obj = new Object[columns];
            obj[0] = nv.getMa_nhan_vien();
            obj[1] = nv.getHo_ten();
            obj[2] = nv.getGioi_tinh();
            obj[3] = nv.getNgay_sinh();
            obj[4] = nv.getEmail();
            obj[5] = nv.getSo_dien_thoai();
            obj[6] = nv.getNgay_bat_dau();
            dtm.addRow(obj);
        }
        return dtm;
    }
    public static DefaultTableModel setTableKhachHang(List<KhachHang> listItem, String[] listColumn) {
        int columns = listColumn.length;
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }

//            @Override
//            public Class<?> getColumnClass(int columnIndex) {
//                return columnIndex == 7 ? Boolean.class : String.class;
//            }
        };
        dtm.setColumnIdentifiers(listColumn);
        Object[] obj;
        int num = listItem.size();
        KhachHang kh = null;
        for (int i = 0; i < num; i++) {
            kh = listItem.get(i);
            obj = new Object[columns];
            obj[0] = kh.getMa_khach_hang();
            obj[1] = kh.getHo_ten();
            obj[2] = kh.getSo_dien_thoai();
            obj[3] = kh.getEmail();
            obj[4] = kh.getMa_tai_khoan();
            dtm.addRow(obj);
        }
        return dtm;
    }
    public static DefaultTableModel setTablePhim(List<Phim> listItem, String[] listColumn) {
        int columns = listColumn.length;
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }

//            @Override
//            public Class<?> getColumnClass(int columnIndex) {
//                return columnIndex == 7 ? Boolean.class : String.class;
//            }
        };
        dtm.setColumnIdentifiers(listColumn);
        Object[] obj;
        int num = listItem.size();
        Phim p = null;
        for (int i = 0; i < num; i++) {
            p = listItem.get(i);
            obj = new Object[columns];
            obj[0] = p.getMa_phim();
            obj[1] = p.getTen_phim();
            obj[2] = p.getLoai_phim();
            obj[3] = p.getTac_gia();
            obj[4] = p.getQuoc_gia();
            obj[5] = p.getThoi_luong();
            obj[6] = p.getNam_phat_hanh();
            dtm.addRow(obj);
        }
        return dtm;
    }

}