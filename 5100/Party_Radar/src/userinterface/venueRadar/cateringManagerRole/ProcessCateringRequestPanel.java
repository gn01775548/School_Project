/*
 * BrowseProducts.java
 *
 * Created on October 10, 2008, 9:10 AM
 */
package userinterface.venueRadar.cateringManagerRole;


import userinterface.venueRadar.venueBookingManagerRole.*;
import Business.Campus.Campus;
import Business.Enterprise.CateringMenu;
import Business.Enterprise.Enterprise;
import Business.Group.CateringManagerGroup;
import Business.Group.Group;
import Business.InformationQueue.CateringRequestPost;
import Business.UserAccount.UserAccount;
import Business.InformationQueue.InformationPost;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;


/**
 *
 * @author Rushabh
 */
public class ProcessCateringRequestPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private CateringManagerGroup group;
    private Enterprise enterprise;
    private Campus campus;


    /** Creates new form BrowseProducts */
    public ProcessCateringRequestPanel(JPanel userProcessContainer, UserAccount account, Group group, Enterprise enterprise, Campus campus) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.group = (CateringManagerGroup)group;
        this.enterprise = enterprise;
        this.account = account;
        this.campus = campus;
        valueLabel.setText(enterprise.getName());
        refreshTable();
       
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        productTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVenueRequest = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnApprove = new javax.swing.JButton();
        btnDeny = new javax.swing.JButton();
        lblHeader3 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        lblHeader2 = new javax.swing.JLabel();

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

        tblVenueRequest.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblVenueRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Date", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVenueRequest);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 480, 340));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 730, 90, -1));

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 620, -1, 30));

        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        add(btnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 620, 90, -1));

        btnDeny.setText("Deny");
        btnDeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDenyActionPerformed(evt);
            }
        });
        add(btnDeny, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 620, 90, -1));

        lblHeader3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblHeader3.setForeground(new java.awt.Color(204, 0, 0));
        lblHeader3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/partyRadar/memberRole/logo_v.png"))); // NOI18N
        lblHeader3.setPreferredSize(new java.awt.Dimension(400, 124));
        add(lblHeader3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 260, 70));

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(102, 102, 102));
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, 30));

        lblHeader2.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        lblHeader2.setForeground(new java.awt.Color(102, 102, 102));
        lblHeader2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader2.setText("Catering Process Request");
        add(lblHeader2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 380, -1));
    }// </editor-fold>//GEN-END:initComponents
    // Display all Venue Request from EventManager
    public void refreshTable(){
                
        DefaultTableModel model = (DefaultTableModel)tblVenueRequest.getModel();
        
        model.setRowCount(0);
        
        for(InformationPost infoPost : group.getInfoQueue().getInfoPostList()){
           
            Object[] row = new Object[5];
            row[0] = infoPost;
            row[1] = infoPost.getDate();
            row[2] = infoPost.getSender();
            row[3] = infoPost.getReceiver() == null ? null : infoPost.getReceiver().getMember().getName();
            row[4] = infoPost.getStatus();
            
            model.addRow(row);
        }  
    }

    
        
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CateringManagerWorkAreaPanel mngBookingPanel = (CateringManagerWorkAreaPanel) component;
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        
        refreshTable();
        
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:       
                
        int selectedRow = tblVenueRequest.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a post to process!");
        }  
        else {
            InformationPost post = (InformationPost)tblVenueRequest.getValueAt(selectedRow, 0); 
            Date d = post.getDate();
            post.setStatus("Catering Booked");
            post.setReceiver(account);
            CateringMenu menu = ((CateringRequestPost)post).getCateringMenu();                 
            System.out.println(menu.getCateringCalender());                  
            menu.getCateringCalender().bookDate(d);
            refreshTable();
            JOptionPane.showMessageDialog(null,"Request approved!");

        }
   
        
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnDenyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDenyActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblVenueRequest.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a post to process!");
        }     
        else{
            InformationPost post = (InformationPost)tblVenueRequest.getValueAt(selectedRow, 0); 
            post.setStatus("Catering Rejected");
            post.setReceiver(account);
            refreshTable();
            JOptionPane.showMessageDialog(null, "Request denied!");
        }
    }//GEN-LAST:event_btnDenyActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeny;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblHeader2;
    private javax.swing.JLabel lblHeader3;
    private javax.swing.JTable productTable2;
    private javax.swing.JTable tblVenueRequest;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
