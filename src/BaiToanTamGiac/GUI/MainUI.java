/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiToanTamGiac.GUI;

import BaiToanTamGiac.Handles.TriangleHandle;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author chenjinguyen
 */
public class MainUI extends javax.swing.JFrame {
    TriangleHandle triangleHandle = new TriangleHandle();
    ArrayList<JTextField> txtElements = new ArrayList<JTextField>();
    /**
     * Creates new form MainUI
     */
    public MainUI() {
        this.setLocationRelativeTo(null);
        initComponents();
        initDatas();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitle = new javax.swing.JLabel();
        imgTriangle = new javax.swing.JLabel();
        pnResult = new javax.swing.JPanel();
        cbSelectElement = new javax.swing.JComboBox<>();
        lbResult = new javax.swing.JLabel();
        txtResult = new javax.swing.JTextField();
        btnTinh = new javax.swing.JButton();
        pnElements = new javax.swing.JPanel();
        pnAngles = new javax.swing.JPanel();
        lbAlpha = new javax.swing.JLabel();
        txtAlpha = new javax.swing.JTextField();
        lbBeta = new javax.swing.JLabel();
        txtBeta = new javax.swing.JTextField();
        lbDelta = new javax.swing.JLabel();
        txtDelta = new javax.swing.JTextField();
        pnSides = new javax.swing.JPanel();
        lbA = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        lbB = new javax.swing.JLabel();
        txtB = new javax.swing.JTextField();
        lbC = new javax.swing.JLabel();
        txtC = new javax.swing.JTextField();
        lbP = new javax.swing.JLabel();
        txtP = new javax.swing.JTextField();
        lbhC = new javax.swing.JLabel();
        txthC = new javax.swing.JTextField();
        btnNhapLai = new javax.swing.JButton();
        btnThongTin = new javax.swing.JButton();
        imgEleAndEqua = new javax.swing.JLabel();
        scpRTable = new javax.swing.JScrollPane();
        tblRTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bài Toán Tam Giác - Mạng Ngữ Nghĩa");
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        lbTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbTitle.setText("BÀI TOÁN TAM GIÁC - MẠNG NGỮ NGHĨA");

        imgTriangle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BaiToanTamGiac/Resoures/triangle.png"))); // NOI18N

        pnResult.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tính Giá Trị", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        lbResult.setText("Kết Quả");

        txtResult.setEnabled(false);

        btnTinh.setText("Tính");
        btnTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTinhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnResultLayout = new javax.swing.GroupLayout(pnResult);
        pnResult.setLayout(pnResultLayout);
        pnResultLayout.setHorizontalGroup(
            pnResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnResultLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbSelectElement, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnResultLayout.createSequentialGroup()
                        .addComponent(lbResult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtResult, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnResultLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnTinh)))
                .addContainerGap())
        );
        pnResultLayout.setVerticalGroup(
            pnResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnResultLayout.createSequentialGroup()
                .addComponent(cbSelectElement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbResult)
                    .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(btnTinh))
        );

        pnElements.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CÁC YẾU TỐ TRONG TAM GIÁC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 16))); // NOI18N

        pnAngles.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GÓC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        lbAlpha.setText("Góc Alpha");

        lbBeta.setText("Góc Beta");

        lbDelta.setText("Góc Delta");

        javax.swing.GroupLayout pnAnglesLayout = new javax.swing.GroupLayout(pnAngles);
        pnAngles.setLayout(pnAnglesLayout);
        pnAnglesLayout.setHorizontalGroup(
            pnAnglesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAnglesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnAnglesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAlpha)
                    .addComponent(lbBeta)
                    .addComponent(lbDelta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnAnglesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDelta, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(txtBeta)
                    .addComponent(txtAlpha))
                .addContainerGap())
        );
        pnAnglesLayout.setVerticalGroup(
            pnAnglesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAnglesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnAnglesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAlpha)
                    .addComponent(txtAlpha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnAnglesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBeta)
                    .addComponent(txtBeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnAnglesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDelta)
                    .addComponent(txtDelta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnSides.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GÓC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        lbA.setText("Cạnh A");

        txtA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAActionPerformed(evt);
            }
        });

        lbB.setText("Cạnh B");

        lbC.setText("Cạnh C");

        txtC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnSidesLayout = new javax.swing.GroupLayout(pnSides);
        pnSides.setLayout(pnSidesLayout);
        pnSidesLayout.setHorizontalGroup(
            pnSidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSidesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnSidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnSidesLayout.createSequentialGroup()
                        .addComponent(lbA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtA, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                    .addGroup(pnSidesLayout.createSequentialGroup()
                        .addGroup(pnSidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbC)
                            .addComponent(lbB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnSidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtB)
                            .addComponent(txtC))))
                .addGap(6, 6, 6))
        );
        pnSidesLayout.setVerticalGroup(
            pnSidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSidesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnSidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbA)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnSidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbB)
                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnSidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbC)
                    .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbP.setText("Diện Tích");

        txtP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPActionPerformed(evt);
            }
        });

        lbhC.setText("Chiều Cao");

        btnNhapLai.setText("Nhập Lại");
        btnNhapLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapLaiActionPerformed(evt);
            }
        });

        btnThongTin.setText("Thông Tin");
        btnThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongTinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnElementsLayout = new javax.swing.GroupLayout(pnElements);
        pnElements.setLayout(pnElementsLayout);
        pnElementsLayout.setHorizontalGroup(
            pnElementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnElementsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnElementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnElementsLayout.createSequentialGroup()
                        .addComponent(pnAngles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnSides, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnElementsLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(pnElementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbP)
                            .addComponent(lbhC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnElementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtP, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(txthC))
                        .addGap(18, 18, 18)
                        .addComponent(btnNhapLai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThongTin)
                        .addGap(16, 16, 16))))
        );
        pnElementsLayout.setVerticalGroup(
            pnElementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnElementsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnElementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnAngles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnSides, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(pnElementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnElementsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnElementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbP)
                            .addComponent(txtP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnElementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbhC)
                            .addComponent(txthC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))
                    .addGroup(pnElementsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnElementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNhapLai)
                            .addComponent(btnThongTin))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        imgEleAndEqua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BaiToanTamGiac/Resoures/hinhquanhe.png"))); // NOI18N

        tblRTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scpRTable.setViewportView(tblRTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnElements, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imgTriangle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scpRTable, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgEleAndEqua)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTitle)
                .addGap(329, 329, 329))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imgTriangle)
                            .addComponent(pnResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(pnElements, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scpRTable, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imgEleAndEqua))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTinhActionPerformed
        // TODO add your handling code here:
        btnTinh();
        
    }//GEN-LAST:event_btnTinhActionPerformed

    private void txtAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAActionPerformed

    private void txtCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCActionPerformed

    private void txtPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPActionPerformed

    private void btnNhapLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapLaiActionPerformed
        // TODO add your handling code here:
        btnNhapLai();
    }//GEN-LAST:event_btnNhapLaiActionPerformed

    private void btnThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongTinActionPerformed
        // TODO add your handling code here:
        btnThongTin();

    }//GEN-LAST:event_btnThongTinActionPerformed

    private void initDatas(){
        txtElements.add(txtAlpha);
        txtElements.add(txtBeta);
        txtElements.add(txtDelta);
        txtElements.add(txtA);
        txtElements.add(txtB);
        txtElements.add(txtC);
        txtElements.add(txtP);
        txtElements.add(txthC);
        tblRTable.setEnabled(false);
        tblRTable.setDragEnabled(false);
        tblRTable.getTableHeader().setEnabled(false);
        String[] cbDatas = {"Giá Trị Cần Tính","Góc Alpha","Góc Beta","Góc Delta","Cạnh A","Cạnh B","Cạnh C","Diện Tích","Đường Cao","Chu Vi"};
        for (int i = 0; i < cbDatas.length; i++) {
            cbSelectElement.addItem(cbDatas[i]);
        }
        triangleHandle.initRVTable();
        setRTable(triangleHandle.getRTable());
        

        
        
    }

    /**
     *
     * @param RTable
     */
    private void setRTable(int [][] RTable){
        DefaultTableModel dataRTable = new DefaultTableModel();
        tblRTable.setModel(dataRTable);
        for (String str : new String[] {"Yếu Tố","CT1","CT2","CT3","CT4","CT5","CT6"}) {
            dataRTable.addColumn(str);
        }

        Object[] dataElements = new Object[] {"Góc Alpha","Góc Beta","Góc Delta","Cạnh A","Cạnh B","Cạnh C","Chu Vi","Diện Tích","Đường Cao"};
        for (int i = 0; i < RTable.length; i++) {
            Vector v = new Vector();
            v.add(dataElements[i]);
            for (int j = 0; j < RTable[i].length; j++)
                v.add(RTable[i][j]);
            dataRTable.addRow(v);
        }

        for (int i = 1; i < tblRTable.getColumnCount(); i++) {
            ColorRenderer cellStyle = new ColorRenderer();
            cellStyle.setHorizontalAlignment(JLabel.CENTER);
            tblRTable.getColumnModel().getColumn(i).setCellRenderer(cellStyle);
        }




    }

    /**
     *
     */
    private void btnTinh(){
        String selectElements = cbSelectElement.getSelectedItem().toString();
        if(!selectElements.equals("Giá Trị Cần Tính")){
            triangleHandle.start(txtElements,txtResult,selectElements);
            setRTable(triangleHandle.getRTable());
        }else{
            JOptionPane.showMessageDialog(null,"Vui lòng chọn yếu tố cần tính.","Báo Lỗi!",JOptionPane.OK_OPTION);
        }

    }

    private void btnNhapLai(){
        cbSelectElement.setSelectedIndex(0);
        txtResult.setText("");
        for (JTextField txt: txtElements) {
            txt.setText("");
        }
        triangleHandle.initRVTable();
        this.setRTable(triangleHandle.getRTable());
    }

    private void btnThongTin(){
        JOptionPane.showMessageDialog(null, "- Đồ Án Tính Tam Giác Sử Dụng Mạng Ngữ Nghĩa" +
                "\n- HUFI - Khoa CNTT - Lớp Trí Tuệ Nhân Tạo + JAVA" +
                "\n- Thành Viên:" +
                "\n+ 2001181078 - Nguyễn Trần Phương Duy - Trưởng Nhóm" +
                "\n+ 2001181293 - Cao Quang Sơn" +
                "\n+ 2001181291 - Ngô Thị Như Quỳnh" +
                "\n+ 2001181437 - Phan Mai Như Ý" +
                "\n- Email: duyntp2000@gmail.com" +
                "\n- Github: chenjiinguyen", "Thông Tin Nhóm",
                JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon(getClass().getResource("/BaiToanTamGiac/Resoures/hufi.png")));
    }


    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNhapLai;
    private javax.swing.JButton btnThongTin;
    private javax.swing.JButton btnTinh;
    private javax.swing.JComboBox<String> cbSelectElement;
    private javax.swing.JLabel imgEleAndEqua;
    private javax.swing.JLabel imgTriangle;
    private javax.swing.JLabel lbA;
    private javax.swing.JLabel lbAlpha;
    private javax.swing.JLabel lbB;
    private javax.swing.JLabel lbBeta;
    private javax.swing.JLabel lbC;
    private javax.swing.JLabel lbDelta;
    private javax.swing.JLabel lbP;
    private javax.swing.JLabel lbResult;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbhC;
    private javax.swing.JPanel pnAngles;
    private javax.swing.JPanel pnElements;
    private javax.swing.JPanel pnResult;
    private javax.swing.JPanel pnSides;
    private javax.swing.JScrollPane scpRTable;
    private javax.swing.JTable tblRTable;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtAlpha;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtBeta;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtDelta;
    private javax.swing.JTextField txtP;
    private javax.swing.JTextField txtResult;
    private javax.swing.JTextField txthC;
    // End of variables declaration//GEN-END:variables
}
