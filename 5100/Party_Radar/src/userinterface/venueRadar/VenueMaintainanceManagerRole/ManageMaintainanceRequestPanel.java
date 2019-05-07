/*
 * BrowseProducts.java
 *
 * Created on October 10, 2008, 9:10 AM
 */
package userinterface.venueRadar.VenueMaintainanceManagerRole;


import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Business.Group.VenueMaintainanceManagerGroup;
import Business.InformationQueue.InformationPost;
import Business.InformationQueue.MaintainanceRequestPost;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Rushabh
 */
public class ManageMaintainanceRequestPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private VenueMaintainanceManagerGroup group;
    private Enterprise enterprise;


    /** Creates new form BrowseProducts */
    public ManageMaintainanceRequestPanel(JPanel userProcessContainer, UserAccount account, VenueMaintainanceManagerGroup group, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.group = group;
        this.enterprise = enterprise;
        this.account = account;
        
        valueLabel.setText(enterprise.getName());
        refreshTable();
        
      
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        productTable2 = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequest = new javax.swing.JTable();
        btnCreateRequest = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        lblHeader2 = new javax.swing.JLabel();
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

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 750, 90, -1));

        tblWorkRequest.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Place", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkRequest);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 450, 300));

        btnCreateRequest.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnCreateRequest.setText("Create Request");
        btnCreateRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateRequestActionPerformed(evt);
            }
        });
        add(btnCreateRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 580, 130, -1));

        btnRefresh.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, 130, 30));

        lblHeader.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(102, 102, 102));
        lblHeader.setText("Venue Maintainance Area");
        add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        lblHeader2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblHeader2.setForeground(new java.awt.Color(204, 0, 0));
        lblHeader2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/partyRadar/memberRole/logo_v.png"))); // NOI18N
        lblHeader2.setPreferredSize(new java.awt.Dimension(400, 124));
        add(lblHeader2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 260, 70));

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(102, 102, 102));
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, 30));
    }// </editor-fold>//GEN-END:initComponents
    public void refreshTable(){
        DefaultTableModel model = (DefaultTableModel)tblWorkRequest.getModel();
        model.setRowCount(0);
        
        for (InformationPost post : account.getInfoQueue().getInfoPostList()){
            Object[] row = new Object[4];
//            String result = post.getNotes();
            row[0] = post;
            row[1] = post.getPlace();
            row[2] = post.getReceiver();
            row[3] = post.getStatus();
//            row[3] = result == null ? "Waiting" : result;
            
            model.addRow(row);
        }
    }   

    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

        
    private void btnCreateRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateRequestActionPerformed

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestMaintainancePanel", new RequestMaintainancePanel(userProcessContainer,account, group, enterprise));
        layout.next(userProcessContainer);
        
        

    }//GEN-LAST:event_btnCreateRequestActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed

        refreshTable();

    }//GEN-LAST:event_btnRefreshActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateRequest;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblHeader2;
    private javax.swing.JTable productTable2;
    private javax.swing.JTable tblWorkRequest;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
