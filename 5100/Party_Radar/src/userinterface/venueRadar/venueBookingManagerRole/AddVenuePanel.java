/*
 * BrowseProducts.java
 *
 * Created on October 10, 2008, 9:10 AM
 */
package userinterface.venueRadar.venueBookingManagerRole;

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
public class AddVenuePanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Enterprise enterprise;

    /** Creates new form BrowseProducts */
    public AddVenuePanel(JPanel userProcessContainer, Enterprise enterprise) {
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
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDetails = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        txtVenueName = new javax.swing.JTextField();
        txtCampus = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtLocation = new javax.swing.JTextField();
        txtLabel = new javax.swing.JTextField();
        lblHeader2 = new javax.swing.JLabel();
        lblHeader1 = new javax.swing.JLabel();
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
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 630, 80, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Venue Name");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 100, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Location");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 100, 30));

        txtDetails.setColumns(20);
        txtDetails.setRows(5);
        jScrollPane1.setViewportView(txtDetails);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 300, 190));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Campus");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 100, 30));

        txtVenueName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVenueNameActionPerformed(evt);
            }
        });
        add(txtVenueName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 300, 30));
        add(txtCampus, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 300, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Label");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 140, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Details");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 100, 30));

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 730, 90, -1));
        add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 300, 30));
        add(txtLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 300, 30));

        lblHeader2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblHeader2.setForeground(new java.awt.Color(204, 0, 0));
        lblHeader2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/partyRadar/memberRole/logo_v.png"))); // NOI18N
        lblHeader2.setPreferredSize(new java.awt.Dimension(400, 124));
        add(lblHeader2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 260, 70));

        lblHeader1.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        lblHeader1.setForeground(new java.awt.Color(102, 102, 102));
        lblHeader1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader1.setText("Add Venue");
        add(lblHeader1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 190, -1));

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
            if (c instanceof ManageVenuePanel){
                ManageVenuePanel panel = (ManageVenuePanel)c;
                panel.refreshTable();
            }
        }

    }//GEN-LAST:event_btnBackActionPerformed

    private void txtVenueNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVenueNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVenueNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String venueName = txtVenueName.getText();
        String campus = txtCampus.getText();
        String location = txtLocation.getText();
        String label = txtLabel.getText();
        String details = txtDetails.getText(); 
//        String path = txtPath.getText();

        if (venueName.isEmpty()||campus.isEmpty()||location.isEmpty()||label.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please add all the mandatory fields!");
            } 
        else {      
            Venue venue = ((VenueRadarEnterprise)enterprise).getVenueDirectory().addVenue();
            venue.setVenueName(venueName);
            venue.setCampus(campus);
            venue.setLocation(location);
            venue.setLabel(label);
            venue.setDetails(details);
//            venue.setPicPath(path);

            JOptionPane.showMessageDialog(null, "Venue successfully created!");

            txtVenueName.setText("");
            txtCampus.setText("");
            txtLocation.setText("");
            txtLabel.setText("");
            txtLabel.setText("");
            txtDetails.setText("");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblHeader1;
    private javax.swing.JLabel lblHeader2;
    private javax.swing.JTable productTable2;
    private javax.swing.JTextField txtCampus;
    private javax.swing.JTextArea txtDetails;
    private javax.swing.JTextField txtLabel;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtVenueName;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
