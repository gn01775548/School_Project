/*
 * BrowseProducts.java
 *
 * Created on October 10, 2008, 9:10 AM
 */
package userinterface.partyRadar.memberRole;


import Business.CampusParty;
import Business.Enterprise.Enterprise;
import Business.Group.Group;
import Business.Group.VenueBookingManagerGroup;
import Business.InformationQueue.EventPost;
import Business.UserAccount.UserAccount;
import Business.InformationQueue.InformationPost;
import Business.InformationQueue.InvitationPost;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Rushabh
 */
public class MessageBoxPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private VenueBookingManagerGroup group;
    private Enterprise enterprise;
    private CampusParty business;


    /** Creates new form BrowseProducts */
    public MessageBoxPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, CampusParty business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.group = (VenueBookingManagerGroup)group;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.business = business;
        
        refreshTable();
        
        populate();
        
        
       
    }
    
    private void populate(){
        
// dec.09 rita:
        
        ArrayList<InformationPost> iPostList = new ArrayList<InformationPost>();
        ArrayList<InformationPost> invitedPostList = new ArrayList<InformationPost>();

        for(InformationPost infoPost : userAccount.getInfoQueue().getInfoPostList()){
            if(infoPost instanceof InvitationPost){
                iPostList.add(infoPost);
                if (infoPost.getReceiver() == userAccount){
                    invitedPostList.add(infoPost);
                }
            }
        }
        
        // dec.09 rita:
        
        lblNoInvitations.setText(String.valueOf(invitedPostList.size()));
//        valueLabel.setText(enterprise.getName());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        productTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInvitations = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnAttend = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        lblNoInvitations = new javax.swing.JLabel();
        lblHeader3 = new javax.swing.JLabel();
        lblHeader1 = new javax.swing.JLabel();
        lblHeader2 = new javax.swing.JLabel();
        lblHeader4 = new javax.swing.JLabel();

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

        tblInvitations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Event", "Sender", "Venue", "Event Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblInvitations.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(tblInvitations);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 520, 230));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/partyRadar/memberRole/back.png"))); // NOI18N
        btnBack.setBorderPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 730, 90, -1));

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/partyRadar/memberRole/refresh.png"))); // NOI18N
        btnRefresh.setBorderPainted(false);
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, 50, 40));

        btnAttend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/partyRadar/memberRole/register.png"))); // NOI18N
        btnAttend.setBorderPainted(false);
        btnAttend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttendActionPerformed(evt);
            }
        });
        add(btnAttend, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, 50, -1));

        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/partyRadar/memberRole/search.png"))); // NOI18N
        btnView.setBorderPainted(false);
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 50, -1));

        lblNoInvitations.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNoInvitations.setForeground(new java.awt.Color(102, 102, 102));
        lblNoInvitations.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNoInvitations.setText("#");
        add(lblNoInvitations, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 20, -1));

        lblHeader3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblHeader3.setForeground(new java.awt.Color(204, 0, 0));
        lblHeader3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/partyRadar/memberRole/logo.png"))); // NOI18N
        lblHeader3.setPreferredSize(new java.awt.Dimension(400, 124));
        add(lblHeader3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 260, 70));

        lblHeader1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblHeader1.setForeground(new java.awt.Color(51, 51, 51));
        lblHeader1.setText("inviations from your connections:");
        add(lblHeader1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        lblHeader2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblHeader2.setForeground(new java.awt.Color(51, 51, 51));
        lblHeader2.setText("You have recived");
        add(lblHeader2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        lblHeader4.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblHeader4.setForeground(new java.awt.Color(204, 0, 0));
        lblHeader4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/partyRadar/memberRole/conncection.png"))); // NOI18N
        lblHeader4.setPreferredSize(new java.awt.Dimension(400, 124));
        add(lblHeader4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 120, 30));
    }// </editor-fold>//GEN-END:initComponents
    // Display all invitations sent to me:
    public void refreshTable(){
        
        // dec.09 rita:
                
        DefaultTableModel model = (DefaultTableModel)tblInvitations.getModel();        
        model.setRowCount(0);
        
        for(InformationPost infoPost : userAccount.getInfoQueue().getInfoPostList()){
            if(infoPost instanceof InvitationPost){
           
            ArrayList<UserAccount> regList = ((InvitationPost) infoPost).getEventPost().getCurrentRegister();
            
            if(regList.indexOf(infoPost.getReceiver())>=0){            
                infoPost.setStatus("registered");
            }
            else{
                infoPost.setStatus("unregistered");
            }
            
                     
            Object[] row = new Object[4];
            row[0] = infoPost;
            row[1] = infoPost.getSender();
            row[2] = infoPost.getReceiver();
            row[3] = infoPost.getStatus();
            
            model.addRow(row);

            }  
        }
    }

    
        
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        
        refreshTable();
        
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnAttendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttendActionPerformed
        // TODO add your handling code here:  
        
        int selectRow = tblInvitations.getSelectedRow();
        
        if(selectRow <0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table first to process.", "Warning", JOptionPane.WARNING_MESSAGE);            
        } 
        else{
            InvitationPost iPost = (InvitationPost) tblInvitations.getValueAt(selectRow, 0);
            EventPost ePost = iPost.getEventPost();

            if(userAccount.getInfoQueue().getInfoPostList().indexOf(ePost)<0){
                // Rita: add post to user's infoQueue
                userAccount.getInfoQueue().getInfoPostList().add(ePost);
                // Rita: add user to eventPost currentRegister                
                ePost.addCurrentRegister(userAccount);
                JOptionPane.showMessageDialog(null, "Registered successfully!");
            }
            else{
            JOptionPane.showMessageDialog(null, "You already registered.");           
            }
        }

 
    }//GEN-LAST:event_btnAttendActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectRow = tblInvitations.getSelectedRow();
        
        if(selectRow <0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table first to view detials", "Warning", JOptionPane.WARNING_MESSAGE);            
        } 
        else{
            InvitationPost iPost = (InvitationPost) tblInvitations.getValueAt(selectRow, 0);
            EventPost ePost = iPost.getEventPost();
           
            ViewEventDetails panel = new ViewEventDetails(userProcessContainer, enterprise, ePost, userAccount, business);
            userProcessContainer.add("ViewEventDetails", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnViewActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAttend;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblHeader1;
    private javax.swing.JLabel lblHeader2;
    private javax.swing.JLabel lblHeader3;
    private javax.swing.JLabel lblHeader4;
    private javax.swing.JLabel lblNoInvitations;
    private javax.swing.JTable productTable2;
    private javax.swing.JTable tblInvitations;
    // End of variables declaration//GEN-END:variables
}
