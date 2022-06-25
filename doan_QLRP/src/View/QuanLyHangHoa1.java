/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Dao.DBConnect;
import Dao.HangHoaDAO;
import Dao.NhapHangHoaDAO;
import Model.HangHoa;
import Model.NhaCungCap;
import Model.NhapHangHoa;
//import com.google.protobuf.Int32Value;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class QuanLyHangHoa1 extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyHangHoa
     */
    DefaultTableModel tbm1;
    List<NhapHangHoa> dsHangHoa = new ArrayList<>();
    List<NhaCungCap> dsncc = new ArrayList<>();
    List<HangHoa> dshh = new ArrayList<>();
    String username = "root";
    String password = "";
    Connection conn = null;
    PreparedStatement statement = null;
    Connection con = (Connection) DBConnect.getConnectionMySql(username, password);

    public QuanLyHangHoa1() throws SQLException, ParseException {
        initComponents();
        tbm1 = (DefaultTableModel) table_nhapHang.getModel();
        date_nhap.setDateFormatString("dd/MM/yyyy");
        showList();
        showncc();
        showhh();
        reset();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        txt_giahh = new javax.swing.JTextField();
        txt_soluonghh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_themhh = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        date_nhap = new com.toedter.calendar.JDateChooser();
        txt_madon = new javax.swing.JTextField();
        cbb_mancc = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbb_mahh = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbb_ten_ncc = new javax.swing.JComboBox<>();
        cbb_tenhh = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_nhapHang = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(199, 99, 99));

        txt_giahh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_giahhKeyTyped(evt);
            }
        });

        txt_soluonghh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_soluonghhKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Mã đơn");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Mã nhà cung cấp");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Giá nhập");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Số lượng");

        btn_themhh.setText("Thêm");
        btn_themhh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themhhActionPerformed(evt);
            }
        });

        jButton3.setText("Sửa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Tìm kiếm");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Reset");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        cbb_mancc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbb_mancc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_manccActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Mã hàng hóa");

        cbb_mahh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbb_mahh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_mahhActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Tên hàng hóa");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Tên nhà cung cấp");

        cbb_ten_ncc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbb_ten_ncc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_ten_nccActionPerformed(evt);
            }
        });

        cbb_tenhh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbb_tenhh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_tenhhActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Ngày nhập ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_themhh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cbb_mahh, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbb_mancc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(33, 33, 33))
                            .addComponent(cbb_ten_ncc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbb_tenhh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_giahh, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(date_nhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12)
                                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 45, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_soluonghh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_madon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_madon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbb_mancc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbb_mahh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbb_ten_ncc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbb_tenhh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_soluonghh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_giahh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_themhh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(date_nhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/placeholder.png"))); // NOI18N
        jLabel3.setText("Linh Trung, Thủ Đức, TPHCM");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/home.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table_nhapHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã đơn", "Mã NCC", "Tên nhà cung cấp", "Mã HH", "Tên hàng hóa", "Số lượng", "Ngày nhập", "Đơn giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_nhapHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                table_nhapHangMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(table_nhapHang);
        if (table_nhapHang.getColumnModel().getColumnCount() > 0) {
            table_nhapHang.getColumnModel().getColumn(0).setPreferredWidth(20);
            table_nhapHang.getColumnModel().getColumn(1).setPreferredWidth(20);
            table_nhapHang.getColumnModel().getColumn(2).setPreferredWidth(20);
            table_nhapHang.getColumnModel().getColumn(3).setResizable(false);
            table_nhapHang.getColumnModel().getColumn(4).setResizable(false);
            table_nhapHang.getColumnModel().getColumn(4).setPreferredWidth(20);
            table_nhapHang.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            // TODO add your handling code here:
            reset();
        } catch (ParseException ex) {
            Logger.getLogger(QuanLyHangHoa1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_themhhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themhhActionPerformed
        SimpleDateFormat f2 = new SimpleDateFormat("yyyy-MM-dd");
        if (!txt_madon.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Thêm mới không cần nhập mã đơn!");
        } else if (cbb_mahh.getSelectedIndex() == -1 || cbb_mancc.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Hãy chọn nhà cung cấp và hàng hóa!");
        } else if (txt_soluonghh.getText().isEmpty() || txt_giahh.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Hãy nhập số lượng và giá nhập!");
        } else if (date_nhap.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Hãy chon ngày nhập!");
        } else {
            String mahh = (String) cbb_mahh.getSelectedItem();
            String mancc = (String) cbb_mancc.getSelectedItem();
            Integer soluong = Integer.parseInt(txt_soluonghh.getText());
            long gianhap = Long.parseLong(txt_giahh.getText());
            String ngaynhap = f2.format(date_nhap.getDate());
            NhapHangHoa nhh = new NhapHangHoa(Integer.parseInt(mancc), Integer.parseInt(mahh), soluong, gianhap, ngaynhap);
            if (NhapHangHoaDAO.insert(con, nhh) != 0) {
                try {
                    JOptionPane.showMessageDialog(this, "Thêm thành công!");
                    reset();
                } catch (ParseException ex) {
                    Logger.getLogger(QuanLyHangHoa1.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Thêm không thành công!");
            }
        }

    }//GEN-LAST:event_btn_themhhActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        SimpleDateFormat f2 = new SimpleDateFormat("yyyy-MM-dd");
        if (txt_madon.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nhập mã đơn!");
        } else if (cbb_mahh.getSelectedIndex() == -1 || cbb_mancc.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Hãy chọn nhà cung cấp và hàng hóa!");
        } else if (txt_soluonghh.getText().isEmpty() || txt_giahh.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Hãy nhập số lượng và giá nhập!");
        } else if (date_nhap.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Hãy chon ngày nhập!");
        } else {
            String madon = txt_madon.getText();
            String mahh = (String) cbb_mahh.getSelectedItem();
            String mancc = (String) cbb_mancc.getSelectedItem();
            Integer soluong = Integer.parseInt(txt_soluonghh.getText());
            long gianhap = Long.parseLong(txt_giahh.getText());
            String ngaynhap = f2.format(date_nhap.getDate());
            NhapHangHoa nhh = new NhapHangHoa(Integer.parseInt(madon), Integer.parseInt(mancc), Integer.parseInt(mahh), soluong, gianhap, ngaynhap);
            if (NhapHangHoaDAO.update(con, nhh) != 0) {
                try {
                    JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
                    reset();
                } catch (ParseException ex) {
                    Logger.getLogger(QuanLyHangHoa1.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Cập nhật không thành công!");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        SimpleDateFormat f2 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
        Integer madon = -1;
        Integer mancc = -1;
        Integer mahh = -1;
        Integer soluong = -1;
        Integer gianhap = -1;
        String ngaynhap = null;
        if (!txt_madon.getText().isEmpty()) {
            madon = Integer.parseInt(txt_madon.getText());
        }

        if (cbb_mancc.getSelectedIndex() != -1) {
            String mancc1 = (String) cbb_mancc.getSelectedItem();
            mancc = Integer.parseInt(mancc1);
        }

        if (cbb_mahh.getSelectedIndex() != -1) {
            String mahh1 = (String) cbb_mahh.getSelectedItem();
            mahh = Integer.parseInt(mahh1);

        }

        if (!txt_giahh.getText().isEmpty()) {
            gianhap = Integer.parseInt(txt_giahh.getText());
        }
        if (!txt_soluonghh.getText().isEmpty()) {
            soluong = Integer.parseInt(txt_soluonghh.getText());
        }
        if(date_nhap.getDate() != null){
            ngaynhap=f2.format(date_nhap.getDate());
        }
        NhapHangHoa hh = new NhapHangHoa(madon, mancc, mahh, soluong, gianhap, ngaynhap);
        try {
            dsHangHoa = NhapHangHoaDAO.find(con, hh);
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyHangHoa1.class.getName()).log(Level.SEVERE, null, ex);
        }
        tbm1.setRowCount(0);
        int flag = 0;
        for (NhapHangHoa rc : dsHangHoa) {
            try {
                tbm1.addRow(new Object[]{tbm1.getRowCount() + 1, rc.getMa_don(), rc.getMa_ncc(), rc.getTen_ncc(), rc.getMa_hang_hoa(), rc.getTen_hang_hoa(), rc.getSo_luong(), f.format(f2.parse(rc.getNgay_nhap())), rc.getDon_gia()});
                flag =1;
            } catch (ParseException ex) {
                Logger.getLogger(QuanLyHangHoa1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (flag != 1) {
                JOptionPane.showMessageDialog(null, "Không hoa don cần tìm!");
            }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void cbb_manccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_manccActionPerformed
        // TODO add your handling code here:
        if (cbb_mancc.hasFocus()) {
            cbb_ten_ncc.setSelectedIndex(cbb_mancc.getSelectedIndex());
        }
    }//GEN-LAST:event_cbb_manccActionPerformed

    private void cbb_ten_nccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_ten_nccActionPerformed
        // TODO add your handling code here:
        if (cbb_ten_ncc.hasFocus()) {
            cbb_mancc.setSelectedIndex(cbb_ten_ncc.getSelectedIndex());
        }
    }//GEN-LAST:event_cbb_ten_nccActionPerformed

    private void cbb_mahhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_mahhActionPerformed
        // TODO add your handling code here:
        if (cbb_mahh.hasFocus()) {
            cbb_tenhh.setSelectedIndex(cbb_mahh.getSelectedIndex());
        }
    }//GEN-LAST:event_cbb_mahhActionPerformed

    private void cbb_tenhhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_tenhhActionPerformed
        // TODO add your handling code here:
        if (cbb_tenhh.hasFocus()) {
            cbb_mahh.setSelectedIndex(cbb_tenhh.getSelectedIndex());
        }
    }//GEN-LAST:event_cbb_tenhhActionPerformed

    private void txt_soluonghhKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_soluonghhKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_soluonghhKeyTyped

    private void txt_giahhKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_giahhKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_giahhKeyTyped

    private void table_nhapHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_nhapHangMousePressed
        // TODO add your handling code here:
        SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat f2 = new SimpleDateFormat("yyyy-MM-dd");
        int selectedIndex = table_nhapHang.getSelectedRow();
        if (selectedIndex >= 0) {
            try {
                NhapHangHoa hh = dsHangHoa.get(selectedIndex);
                txt_madon.setText(String.valueOf(hh.getMa_don()));
                txt_giahh.setText(String.valueOf(hh.getDon_gia()));
                txt_soluonghh.setText(String.valueOf(hh.getSo_luong()));
                cbb_mahh.setSelectedItem(String.valueOf(hh.getMa_hang_hoa()));
                cbb_mancc.setSelectedItem(String.valueOf(hh.getMa_ncc()));
                cbb_tenhh.setSelectedItem(hh.getTen_hang_hoa());
                cbb_ten_ncc.setSelectedItem(hh.getTen_ncc());
                date_nhap.setDate((f2.parse(hh.getNgay_nhap())));
                txt_madon.setEditable(false);

            } catch (ParseException ex) {
                Logger.getLogger(QuanLyHangHoa1.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_table_nhapHangMousePressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new TrangChu().setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void showList() throws ParseException {
        SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat f2 = new SimpleDateFormat("yyyy-MM-dd");
        dsHangHoa = NhapHangHoaDAO.getAll(con);
        tbm1.setRowCount(0);
        for (NhapHangHoa rc : dsHangHoa) {
            tbm1.addRow(new Object[]{tbm1.getRowCount() + 1, rc.getMa_don(), rc.getMa_ncc(), rc.getTen_ncc(), rc.getMa_hang_hoa(), rc.getTen_hang_hoa(), rc.getSo_luong(), f.format(f2.parse(rc.getNgay_nhap())), rc.getDon_gia()});
        }
    }

    private void showncc() throws SQLException {
        dsncc = NhapHangHoaDAO.getncc(con);
        cbb_mancc.removeAllItems();
        cbb_ten_ncc.removeAllItems();
        for (NhaCungCap rc : dsncc) {
            cbb_mancc.addItem(String.valueOf(rc.getMa_ncc()));
            cbb_ten_ncc.addItem(rc.getTen_ncc());
        }
    }

    private void showhh() throws SQLException {
        dshh = NhapHangHoaDAO.gethh(con);
        cbb_mahh.removeAllItems();
        cbb_tenhh.removeAllItems();
        for (HangHoa rc : dshh) {
            cbb_mahh.addItem(String.valueOf(rc.getMa_hang_hoa()));
            cbb_tenhh.addItem(rc.getTen_hang_hoa());
        }
    }

    private void reset() throws ParseException {
        showList();
        cbb_mancc.setSelectedIndex(-1);
        cbb_ten_ncc.setSelectedIndex(-1);
        cbb_mahh.setSelectedIndex(-1);
        cbb_tenhh.setSelectedIndex(-1);
        txt_giahh.setText("");
        txt_madon.setText("");
        txt_soluonghh.setText("");
        date_nhap.setDate(null);
        txt_madon.setEditable(true);
    }

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
            java.util.logging.Logger.getLogger(QuanLyHangHoa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyHangHoa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyHangHoa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyHangHoa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new QuanLyHangHoa1().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(QuanLyHangHoa1.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(QuanLyHangHoa1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_themhh;
    private javax.swing.JComboBox<String> cbb_mahh;
    private javax.swing.JComboBox<String> cbb_mancc;
    private javax.swing.JComboBox<String> cbb_ten_ncc;
    private javax.swing.JComboBox<String> cbb_tenhh;
    private com.toedter.calendar.JDateChooser date_nhap;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table_nhapHang;
    private javax.swing.JTextField txt_giahh;
    private javax.swing.JTextField txt_madon;
    private javax.swing.JTextField txt_soluonghh;
    // End of variables declaration//GEN-END:variables
}
