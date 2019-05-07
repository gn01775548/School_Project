/*
 * BrowseProducts.java
 *
 * Created on October 10, 2008, 9:10 AM
 */
package userinterface.venueRadar.cateringManagerRole;

import Business.Enterprise.CateringMenu;
import userinterface.venueRadar.venueBookingManagerRole.*;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Venue;
import Business.Enterprise.VenueRadarEnterprise;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author
 */
public class AddCateringPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Enterprise enterprise;

    /** Creates new form BrowseProducts */
    public AddCateringPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        valueLabel.setText(enterprise.getName());
    }                        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        productTable2 = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDetails = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        txtCateringName = new javax.swing.JTextField();
        txtType = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblHeader2 = new javax.swing.JLabel();
        lblHeader3 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        productTable2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        productTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Product Id", "Price", "Avail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(productTable2);

        setBackground(new java.awt.Color(250, 250, 250));
        setPreferredSize(new java.awt.Dimension(750, 1000));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 620, 80, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Catering Name");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 100, 30));

        txtDetails.setColumns(20);
        txtDetails.setRows(5);
        jScrollPane1.setViewportView(txtDetails);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 310, 190));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Menu Type");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 100, 30));

        txtCateringName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCateringNameActionPerformed(evt);
            }
        });
        add(txtCateringName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 310, 30));
        add(txtType, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 310, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Details");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 100, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 730, 90, -1));

        lblHeader2.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        lblHeader2.setForeground(new java.awt.Color(102, 102, 102));
        lblHeader2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader2.setText("Catering Option Management");
        add(lblHeader2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 330, -1));

        lblHeader3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblHeader3.setForeground(new java.awt.Color(204, 0, 0));
        lblHeader3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/partyRadar/memberRole/logo_v.png"))); // NOI18N
        lblHeader3.setPreferredSize(new java.awt.Dimension(400, 124));
        add(lblHeader3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 260, 70));

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(102, 102, 102));
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);
        
        Component[] components = userProcessContainer.getComponents();
        for (Component c: components){
            if (c instanceof ManageCateringPanel){
                ManageCateringPanel panel = (ManageCateringPanel)c;
                panel.refreshTable();
            }
        }

    }//GEN-LAST:event_btnBackActionPerformed

    private void txtCateringNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCateringNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCateringNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String menuName = txtCateringName.getText();
        String type = txtType.getText();
       // String location = txtLocation.getText();
   //     String label = txtLabel.getText();
        String details = txtDetails.getText();
//        String path = txtPath.getText();

        if (menuName.isEmpty()||type.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please add all the mandatory fields!");
        }
        else {
            CateringMenu menu = ((VenueRadarEnterprise)enterprise).getMenuDirectory().addCateringMenu();
            menu.setCateringName(menuName);
            menu.setType(type);
            menu.setDetails(details);
//            menu.setPicPath(path);

            JOptionPane.showMessageDialog(null, "Catering successfully created!");

        }
        txtCateringName.setText("");
        txtType.setText("");
        txtDetails.setText("");
//        txtPath.setText("");
//        lblImagePreview.setIcon(null);
        
    }//GEN-LAST:event_btnSaveActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblHeader2;
    private javax.swing.JLabel lblHeader3;
    private javax.swing.JTable productTable2;
    private javax.swing.JTextField txtCateringName;
    private javax.swing.JTextArea txtDetails;
    private javax.swing.JTextField txtType;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
