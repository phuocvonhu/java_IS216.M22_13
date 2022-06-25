/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author minht
 */
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import View.ClassTableModel;
import Model.*;
import java.sql.*;
import Dao.*;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
public class ViewNhanVien extends javax.swing.JFrame {

    /**
     * Creates new form NhanVien
     */
    List<NhanVien> listItem;
    List<TaiKhoan> listtk;
    List<LoaiTaiKhoan> listltk;
    TableRowSorter<TableModel> rowSorter = null;
    Connection cons = null;
    SimpleDateFormat sdf, sdfd;
    DefaultTableModel dtm;
    public ViewNhanVien() {
        initComponents();
        sdf = new SimpleDateFormat("yyyy/MM/dd");
        sdfd = new SimpleDateFormat("yyyy-MM-dd");
        ImageIcon imgi = new ImageIcon("C:\\Users\\minht\\Documents\\NetBeansProjects\\doan_QLRP\\src\\resources\\home.png");
        Image img = imgi.getImage();
        Image newimg = img.getScaledInstance(home.getWidth(), home.getHeight(), java.awt.Image.SCALE_SMOOTH);
        imgi = new ImageIcon(newimg);
        home.setIcon(imgi);
        imgi = new ImageIcon("C:\\Users\\minht\\Documents\\NetBeansProjects\\doan_QLRP\\src\\resources\\locate.png");
        img = imgi.getImage();
        newimg = img.getScaledInstance(jLabel14.getHeight(), jLabel14.getHeight(), java.awt.Image.SCALE_SMOOTH);
        imgi = new ImageIcon(newimg);
        jLabel14.setIcon(imgi);
        
//        home.addMouseListener(new MouseListener(){
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                JOptionPane.showMessageDialog(rootPane, "chua code");
//            }
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//
//            @Override
////            public void mouseEntered(MouseEvent e) {
////                jPanel4.setBackground(new Color(250,250,250));
////            }
//
//            @Override
////            public void mouseExited(MouseEvent e) {
////                jPanel4.setBackground(new Color(127,127,127));
////            }
//            
//        });
        cons = DBConnect.getConnectionMySql("root", "");
        if(cons == null){
            JOptionPane.showMessageDialog(rootPane, "khong the ket noi co so du lieu");
            return;
        }
        listItem = NhanVienDAO.getAll(cons);
        listtk = TaiKhoanDAO.getAll(cons);
        listltk = LoaiTaiKhoanDAO.getAll(cons);
        String[] str = {"ma nhan vien", "ten nhan vien", "gioi tinh", "ngay sinh", "email", "so dien thoai", "ngay bat dau"};
        dtm = ClassTableModel.setTableNhanVien(listItem, str);
        rowSorter = new TableRowSorter<>(dtm);
        tbl.setModel(dtm);
        tbl.setRowSorter(rowSorter);
        search.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = search.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = search.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });
        loaitk.addItem("");
        listltk.remove(1);
        for(LoaiTaiKhoan l : listltk){
            loaitk.addItem(l.getTen_loai());
        }
        loaitk.setSelectedIndex(0);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        hot = new javax.swing.JTextField();
        manv = new javax.swing.JTextField();
        sdt = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        matk = new javax.swing.JTextField();
        tentk = new javax.swing.JTextField();
        nam = new javax.swing.JRadioButton();
        nu = new javax.swing.JRadioButton();
        ngayvl = new com.toedter.calendar.JDateChooser();
        ngays = new com.toedter.calendar.JDateChooser();
        matkh = new javax.swing.JPasswordField();
        Dongy = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Them = new javax.swing.JButton();
        Xoa = new javax.swing.JButton();
        loaitk = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        search = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);

        jPanel2.setBackground(new java.awt.Color(157, 157, 157));
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);
        jPanel2.setPreferredSize(new java.awt.Dimension(622, 45));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Nhan vien");

        home.setBackground(new java.awt.Color(127, 127, 127));
        home.setForeground(new java.awt.Color(127, 127, 127));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/home.png"))); // NOI18N
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(home)
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(622, 45));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Linh Trung, Thu Duc, TPHCM");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Rap Chieu Phim");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(607, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel5.setBackground(new java.awt.Color(220, 205, 205));
        jPanel5.setAlignmentX(0.0F);
        jPanel5.setAlignmentY(0.0F);
        jPanel5.setPreferredSize(new java.awt.Dimension(622, 45));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ho ten");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Mã nv");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Gioi tinh");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Ngay sinh");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("SDT");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Email");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Ngay vao lam");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Ma tai khoan");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Loai tai khoan");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Ten tai khoan");

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Mat khau");

        buttonGroup1.add(nam);
        nam.setForeground(new java.awt.Color(0, 0, 0));
        nam.setSelected(true);
        nam.setText("Nam");

        buttonGroup1.add(nu);
        nu.setForeground(new java.awt.Color(0, 0, 0));
        nu.setText("Nu");

        Dongy.setText("Dong y");
        Dongy.setMaximumSize(new java.awt.Dimension(72, 35));
        Dongy.setMinimumSize(new java.awt.Dimension(72, 35));
        Dongy.setPreferredSize(new java.awt.Dimension(75, 35));
        Dongy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DongyActionPerformed(evt);
            }
        });

        Reset.setText("Reset");
        Reset.setPreferredSize(new java.awt.Dimension(75, 35));
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        Them.setText("Them");
        Them.setPreferredSize(new java.awt.Dimension(75, 35));
        Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemActionPerformed(evt);
            }
        });

        Xoa.setText("Xoa");
        Xoa.setPreferredSize(new java.awt.Dimension(75, 35));
        Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(121, 121, 121))
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel2)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(manv, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(nam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(ngayvl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                                .addComponent(tentk, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(sdt, javax.swing.GroupLayout.Alignment.LEADING)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Them, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Dongy, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4)
                                .addComponent(jLabel11)
                                .addComponent(email)
                                .addComponent(hot)
                                .addComponent(ngays, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                .addComponent(matkh))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Reset, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Xoa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(loaitk, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(matk, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(manv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nam)
                            .addComponent(nu))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ngayvl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel9)
                        .addGap(3, 3, 3)
                        .addComponent(loaitk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tentk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(ngays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(matk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(matkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dongy, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Them, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jPanel6.setBackground(new java.awt.Color(121, 82, 144));
        jPanel6.setAlignmentX(0.0F);
        jPanel6.setAlignmentY(0.0F);
        jPanel6.setPreferredSize(new java.awt.Dimension(622, 45));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Nhan vien");

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);

        search.setToolTipText("");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        TaiKhoan tk = null;
        NhanVien nv = listItem.get(tbl.getSelectedRow());
        for(TaiKhoan i : listtk){
            if(i.getMa_tai_khoan() == nv.getMa_tai_khoan()){
                tk = i;
                break;
            }
        }
        manv.setText(String.valueOf(nv.getMa_nhan_vien()));
        hot.setText(nv.getHo_ten());
        if(nv.getGioi_tinh() == "Nam") nam.setSelected(true);
        else nu.setSelected(true);
        try{
            ngays.setDate(sdfd.parse(nv.getNgay_sinh()));
            ngayvl.setDate(sdfd.parse(nv.getNgay_bat_dau()));
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, "loi khi hien thi ngay");
            return;
        }
        sdt.setText(nv.getSo_dien_thoai());
        email.setText(nv.getEmail());
        if(tk == null) return;
        matk.setText(String.valueOf(tk.getMa_tai_khoan()));
        loaitk.setSelectedIndex(tk.getMa_loai_tai_khoan());
        tentk.setText(tk.getTen_dang_nhap());
        matkh.setText(tk.getMat_khau());
    }//GEN-LAST:event_tblMouseClicked

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        manv.setText("");
        hot.setText("");
        nam.setSelected(true);
        ngays.cleanup();
        sdt.setText("");
        email.setText("");
        ngayvl.cleanup();
        matk.setText("");
        loaitk.setSelectedIndex(0);
        tentk.setText("");
        matkh.setText("");
    }//GEN-LAST:event_ResetActionPerformed

    private void XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaActionPerformed
        if(manv.getText().equals("") == true || tbl.getSelectedRow() == -1) return;
        int i = NhanVienDAO.delete(cons, listItem.get(tbl.getSelectedRow()));
        if(i == -1){
            JOptionPane.showMessageDialog(rootPane, "loi co so du lieu");
        }
        else if( i == 0){
            JOptionPane.showMessageDialog(rootPane, "khong tim duoc nhan vien");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "da xoa thanh cong");
            TaiKhoan tk = null;
            NhanVien nv = listItem.get(tbl.getSelectedRow());
            for(TaiKhoan j : listtk){
                if(j.getMa_tai_khoan() == nv.getMa_tai_khoan()){
                    tk = j;
                    break;
                }
            }
            listItem.remove(tbl.getSelectedRow());
            dtm.removeRow(tbl.getSelectedRow()); 
            if(tk != null) listtk.remove(tk);
            manv.setText("");
            hot.setText("");
            nam.setSelected(true);
            ngays.cleanup();
            sdt.setText("");
            email.setText("");
            ngayvl.cleanup();
            matk.setText("");
            loaitk.setSelectedIndex(0);
            tentk.setText("");
            matkh.setText("");
        }
    }//GEN-LAST:event_XoaActionPerformed

    private void ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemActionPerformed
        if(hot.getText().equals("") == true) return;
        if(sdt.getText().equals("") == true) return;
        if(email.getText().equals("") == true) return;
        if(tentk.getText().equals("") == true) return;
        if(matkh.getPassword() == null) return;
        if(loaitk.getSelectedIndex() == 0) return;
        if(ngays.getDate() == null) return;
        if(ngayvl.getDate() == null) return;
        if(ngayvl.getDate().compareTo(ngays.getDate()) <= 0) return;
        TaiKhoan tk;
        if(matk.getText().equals("") == true){
            tk = new TaiKhoan(tentk.getText(), String.valueOf(matkh.getPassword()),loaitk.getSelectedIndex() );
        }
        else{
            try{
                tk = new TaiKhoan(Integer.parseInt(matk.getText()),tentk.getText(), String.valueOf(matkh.getPassword()),loaitk.getSelectedIndex() );
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(rootPane, "ma tai khoan la so");
                return;
            }
        }
        int i = TaiKhoanDAO.insert(cons, tk);
        if(i == 0 || i == -1) {
            JOptionPane.showMessageDialog(rootPane, "them nhan vien that bai. Khong them duoc tai khoan");
            return;
        }
        TaiKhoan tkh = TaiKhoanDAO.getByAccount(cons, tentk.getText(), String.valueOf(matkh.getPassword()));
        if(tkh == null){
            JOptionPane.showMessageDialog(rootPane, "them nhan vien that bai. Khong lay duoc tai khoan");
            return;
        }
        matk.setText(String.valueOf(tkh.getMa_tai_khoan()));
        NhanVien nv;
        String gt = (nam.isSelected() == true)?"Nam":"Nu";
        
        try{
            String ns = sdf.format(ngays.getDate());
            String nvl = sdf.format(ngayvl.getDate());
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, "ngay khong hop le");
            TaiKhoanDAO.delete(cons, tkh);
            return;
        }
        String ns = sdf.format(ngays.getDate());
        String nvl = sdf.format(ngayvl.getDate());
        if(manv.getText().equals("")== true){
            nv = new NhanVien(hot.getText(), gt, ns, email.getText(), sdt.getText(), nvl, tkh.getMa_tai_khoan());
        }
        else{
            try{
                nv = new NhanVien(Integer.parseInt(manv.getText()),hot.getText(), gt, ns, email.getText(), sdt.getText(), nvl, tkh.getMa_tai_khoan());
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(rootPane, "ma nhan vien la so");
                TaiKhoanDAO.delete(cons, tkh);
                return;
            }
        }
        int t = NhanVienDAO.insert(cons, nv);
        if(t == -1){
            JOptionPane.showMessageDialog(rootPane, "loi co so du lieu");
        }
        else if( t == 0){
            JOptionPane.showMessageDialog(rootPane, "khong them duoc nhan vien");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "da them thanh cong");
            NhanVien nvg = NhanVienDAO.getBySdt(cons, nv.getSo_dien_thoai());
            dtm.addRow(new Object[]{nvg.getMa_nhan_vien(), nvg.getHo_ten(), nvg.getGioi_tinh(), nvg.getNgay_sinh(), nvg.getEmail(), nvg.getSo_dien_thoai(), nvg.getNgay_bat_dau()});
            System.out.println("preset table: " + tbl.getRowCount());
            tbl.setModel(dtm);
            System.out.println(tbl.getRowCount());
            listItem.add(nvg);
            manv.setText(String.valueOf(nvg.getMa_nhan_vien()));
        }
        
    }//GEN-LAST:event_ThemActionPerformed

    private void DongyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DongyActionPerformed
        if(manv.getText().equals("")) return;
        if(matk.getText().equals("")) return;
        if(hot.getText().equals("") == true) return;
        if(sdt.getText().equals("") == true) return;
        if(email.getText().equals("") == true) return;
        if(tentk.getText().equals("") == true) return;
        if(matkh.getPassword() == null) return;
        if(loaitk.getSelectedIndex() == 0) return;
        if(ngays.getDate() == null) return;
        if(ngayvl.getDate() == null) return;
        if(ngayvl.getDate().compareTo(ngays.getDate()) <= 0) return; 
        NhanVien nv;
        String gt = (nam.isSelected() == true)?"Nam":"Nu";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        try{
            String ns = sdf.format(ngays.getDate());
            String nvl = sdf.format(ngayvl.getDate());
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, "ngay khong hop le");
            return;
        }
        String ns = sdf.format(ngays.getDate());
        String nvl = sdf.format(ngayvl.getDate());
        try{
            nv = new NhanVien(Integer.parseInt(manv.getText()),hot.getText(), gt, ns, email.getText(), sdt.getText(), nvl, Integer.parseInt(matk.getText()));
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, "ma nhan vien hoac ma tai khoan la so");
            return;
        }
        int t = NhanVienDAO.update(cons, nv);
        if(t == -1){
            JOptionPane.showMessageDialog(rootPane, "loi co so du lieu");
        }
        else if( t == 0){
            JOptionPane.showMessageDialog(rootPane, "khong sua duoc nhan vien");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "da sua thanh cong");
            //{"ma nhan vien", "ten nhan vien", "gioi tinh", "ngay sinh", "email", "so dien thoai", "ngay bat dau"};
            tbl.setValueAt(nv.getMa_nhan_vien(), tbl.getSelectedRow(), 0);
            tbl.setValueAt(nv.getHo_ten(), tbl.getSelectedRow(), 1);
            tbl.setValueAt(nv.getGioi_tinh(), tbl.getSelectedRow(), 2);
            tbl.setValueAt(nv.getNgay_sinh(), tbl.getSelectedRow(), 3);
            tbl.setValueAt(nv.getEmail(), tbl.getSelectedRow(), 4);
            tbl.setValueAt(nv.getSo_dien_thoai(), tbl.getSelectedRow(), 5);
            tbl.setValueAt(nv.getNgay_bat_dau(), tbl.getSelectedRow(), 6);
        }
        
        TaiKhoan tk;
        try{
            tk = new TaiKhoan(Integer.parseInt(matk.getText()),tentk.getText(), String.valueOf(matkh.getPassword()),loaitk.getSelectedIndex()-1 );
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, "ma tai khoan la so");
            return;
        }
        int i = TaiKhoanDAO.update(cons, tk);
        if(i == 0 || i == -1) {
            JOptionPane.showMessageDialog(rootPane, "Sua tai khoan that bai");
            return;
        }
        else if(i == 1) JOptionPane.showMessageDialog(rootPane, "Sua tai khoan thanh cong");
    }//GEN-LAST:event_DongyActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new TrangChu().setVisible(true);
    }//GEN-LAST:event_homeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dongy;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Them;
    private javax.swing.JButton Xoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField email;
    private javax.swing.JLabel home;
    private javax.swing.JTextField hot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> loaitk;
    private javax.swing.JTextField manv;
    private javax.swing.JTextField matk;
    private javax.swing.JPasswordField matkh;
    private javax.swing.JRadioButton nam;
    private com.toedter.calendar.JDateChooser ngays;
    private com.toedter.calendar.JDateChooser ngayvl;
    private javax.swing.JRadioButton nu;
    private javax.swing.JTextField sdt;
    private javax.swing.JTextField search;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField tentk;
    // End of variables declaration//GEN-END:variables
}
