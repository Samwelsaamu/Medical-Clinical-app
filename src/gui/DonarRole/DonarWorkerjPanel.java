/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.DonarRole;

import Controller.DB4OModel.DB4OModel;
import Controller.Department.Department;
import Controller.Donations.Donations;
import Controller.Enterprise.Enterprise;
import Controller.HealthNGO;
import Controller.Users.Users;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saamu
 */
@SuppressWarnings("unchecked")
public class DonarWorkerjPanel extends javax.swing.JPanel {

    /**
     * Creates new form MentalHealthWorkerjPanel
     */
    private HealthNGO system;
    private Enterprise enterprise;
    private Department org;
    private JPanel container,logincontainerJPanel;
    private Users user;
    private DB4OModel dB4OModel = DB4OModel.getInstance();
    public DonarWorkerjPanel(JPanel logincontainerJPanel,JPanel container,Enterprise enterprise,Department org, Users user, HealthNGO system) {
        initComponents();
        this.system=system;
        this.container=container;
        this.logincontainerJPanel=logincontainerJPanel;
        this.enterprise=enterprise;
        this.user=user;
        this.loggedmhwjLabel.setText("Hi, "+user.getEmployee()+"("+user.getRole()+")");
        donationDescjTextField.setText("");
        donationAmountjTextField.setText("");
        donationNamejTextField.setText("");
        newDonationButton.setVisible(false);
        updateNameButton.setVisible(false);
        deleteDonationjButton.setVisible(false);
        saveEnterprisejButton.setVisible(true);
        displayDonations();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loggedmhwjLabel = new javax.swing.JLabel();
        mhwLogoutjButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterprisessjTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        donationDescjTextField = new javax.swing.JTextField();
        saveEnterprisejButton = new javax.swing.JButton();
        updateNameButton = new javax.swing.JButton();
        deleteDonationjButton = new javax.swing.JButton();
        newDonationButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        donationNamejTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        donationAmountjTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(java.awt.SystemColor.window);
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        loggedmhwjLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        loggedmhwjLabel.setText("Logged Username");
        loggedmhwjLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        mhwLogoutjButton.setBackground(new java.awt.Color(204, 255, 204));
        mhwLogoutjButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        mhwLogoutjButton.setText("Logout");
        mhwLogoutjButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        mhwLogoutjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mhwLogoutjButtonActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 255, 204));
        jButton4.setText("Refresh");
        jButton4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loggedmhwjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mhwLogoutjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loggedmhwjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mhwLogoutjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jScrollPane1.setBackground(new java.awt.Color(0, 153, 153));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Your Donations", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        enterprisessjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Donation", "Notes", "Amount", "Date", "Status"
            }
        ));
        enterprisessjTable.setGridColor(java.awt.SystemColor.window);
        enterprisessjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterprisessjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(enterprisessjTable);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Donation", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Notes");

        saveEnterprisejButton.setBackground(new java.awt.Color(204, 255, 204));
        saveEnterprisejButton.setText("Donate");
        saveEnterprisejButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        saveEnterprisejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveEnterprisejButtonActionPerformed(evt);
            }
        });

        updateNameButton.setBackground(new java.awt.Color(204, 255, 204));
        updateNameButton.setText("Update");
        updateNameButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        updateNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateNameButtonActionPerformed(evt);
            }
        });

        deleteDonationjButton.setBackground(new java.awt.Color(204, 255, 204));
        deleteDonationjButton.setText("Delete");
        deleteDonationjButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        deleteDonationjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDonationjButtonActionPerformed(evt);
            }
        });

        newDonationButton.setBackground(new java.awt.Color(204, 255, 204));
        newDonationButton.setText("New");
        newDonationButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        newDonationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newDonationButtonActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Donation Name");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Amount");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(updateNameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteDonationjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newDonationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addComponent(saveEnterprisejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(donationDescjTextField))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(donationNamejTextField)))
                        .addGap(8, 8, 8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(donationAmountjTextField)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(donationNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(donationDescjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(donationAmountjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteDonationjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(saveEnterprisejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(updateNameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(newDonationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mhwLogoutjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mhwLogoutjButtonActionPerformed
        JLabel jLabel3;
        JLabel jLabel1;
        JPanel jPanel6;
    
        logincontainerJPanel.setVisible(true);
        container.removeAll();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.MatteBorder(null));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jLabel1.setText("You have been Logged Out. Please Login to Continue");

        jLabel3.setBackground(new java.awt.Color(0, 153, 153));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/withYouNGO - Copy.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(687, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(99, 99, 99)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 959, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(896, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(565, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(95, 95, 95)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(553, Short.MAX_VALUE)))
        );
        container.add(jPanel6);
    }//GEN-LAST:event_mhwLogoutjButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        displayDonations();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void enterprisessjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterprisessjTableMouseClicked
       int selectedRow = enterprisessjTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select Donation or Add.");
            donationDescjTextField.setText("");
            donationAmountjTextField.setText("");
            donationNamejTextField.setText("");
            newDonationButton.setVisible(false);
            updateNameButton.setVisible(false);
            deleteDonationjButton.setVisible(false);
            return;
        }
        Donations donation = (Donations)enterprisessjTable.getValueAt(selectedRow, 0);
        donationNamejTextField.setText(donation.getName());
        donationDescjTextField.setText(donation.getNotes());
        this.donationAmountjTextField.setText(String.valueOf(donation.getAmount()));
        newDonationButton.setVisible(true);
        updateNameButton.setVisible(true);
        deleteDonationjButton.setVisible(true);
        saveEnterprisejButton.setVisible(false);
    }//GEN-LAST:event_enterprisessjTableMouseClicked

    private void saveEnterprisejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveEnterprisejButtonActionPerformed
        String donationname = donationNamejTextField.getText().trim();
        String donationdesc = this.donationDescjTextField.getText().trim();
        String donationamount =donationAmountjTextField.getText().trim();
        double amount;
        if(donationname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Specify Donation Name", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(donationname.length()<=3) {
            JOptionPane.showMessageDialog(this, "Donation Name must be Three characters and more", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(donationname.length()>100) {
            JOptionPane.showMessageDialog(this, "Donation Name should have less than 100 characters", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(donationdesc.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Specify Donation Description", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(donationdesc.length()<=5) {
            JOptionPane.showMessageDialog(this, "Donation Description must be Five characters and more", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(donationdesc.length()>200) {
            JOptionPane.showMessageDialog(this, "Donation Description should have less than 200 characters", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try{
            amount=Double.parseDouble(donationamount);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Donation Amount Must be a Positive Integer Number.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(!system.getDonationDirectory().checkIfDonationsIsUnique(donationname)){
            JOptionPane.showMessageDialog(this, "Donation Name Exists", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        system.getDonationDirectory().createDonations(donationname, donationdesc, amount, user);
        dB4OModel.storeSystem(system);
        displayDonations();
    }                                

    private void delUserjButtonActionPerformed(java.awt.event.ActionEvent evt) {
             
    }//GEN-LAST:event_saveEnterprisejButtonActionPerformed

    private void updateNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateNameButtonActionPerformed
        int selectedRow = enterprisessjTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select Donation or Add.");
            donationNamejTextField.setText("");
            donationDescjTextField.setText("");
            donationAmountjTextField.setText("");
            newDonationButton.setVisible(false);
            updateNameButton.setVisible(false);
            deleteDonationjButton.setVisible(false);
            return;
        }

        String donationname = donationNamejTextField.getText().trim();
        String donationdesc = this.donationDescjTextField.getText().trim();
        String donationamount =donationAmountjTextField.getText().trim();
        double amount;
        if(donationname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Specify Donation Name", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(donationname.length()<=3) {
            JOptionPane.showMessageDialog(this, "Donation Name must be Three characters and more", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(donationname.length()>100) {
            JOptionPane.showMessageDialog(this, "Donation Name should have less than 100 characters", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(donationdesc.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Specify Donation Description", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(donationdesc.length()<=5) {
            JOptionPane.showMessageDialog(this, "Donation Description must be Five characters and more", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(donationdesc.length()>200) {
            JOptionPane.showMessageDialog(this, "Donation Description should have less than 200 characters", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try{
            amount=Double.parseDouble(donationamount);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Donation Amount Must be a Positive Integer Number.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(!system.getDonationDirectory().checkIfDonationsIsUnique(donationname)){
            JOptionPane.showMessageDialog(this, "Donation Name Exists", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Donations donation = (Donations)enterprisessjTable.getValueAt(selectedRow, 0);
        donation.setName(donationname);
        donation.setNotes(donationdesc);
        donation.setAmount(amount);
        
        dB4OModel.storeSystem(system);
        displayDonations();
    }//GEN-LAST:event_updateNameButtonActionPerformed

    private void deleteDonationjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDonationjButtonActionPerformed
        int selectedRow = enterprisessjTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select Donation or Add");
            donationDescjTextField.setText("");
            donationNamejTextField.setText("");
            donationAmountjTextField.setText("");
            newDonationButton.setVisible(false);
            updateNameButton.setVisible(false);
            deleteDonationjButton.setVisible(false);
            return;
        }
        Donations donation = (Donations)enterprisessjTable.getValueAt(selectedRow, 0);
        system.getDonationDirectory().getDonationsList().remove(donation);
        dB4OModel.storeSystem(system);
        displayDonations();
    }//GEN-LAST:event_deleteDonationjButtonActionPerformed

    private void newDonationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newDonationButtonActionPerformed
        this.donationDescjTextField.setText("");
        donationNamejTextField.setText("");
        donationAmountjTextField.setText("");
        this.newDonationButton.setVisible(false);
        updateNameButton.setVisible(false);
        deleteDonationjButton.setVisible(false);
        saveEnterprisejButton.setVisible(true);
    }//GEN-LAST:event_newDonationButtonActionPerformed
     
    private void displayDonations(){
        DefaultTableModel model = (DefaultTableModel) enterprisessjTable.getModel();
        
        model.setRowCount(0);
        for (Donations donation : system.getDonationDirectory().getDonationsList()){
            Object[] row = new Object[5];
            String rec=(donation.getDonar()!=null)?donation.getDonar().toString():"";
            if(rec.equals("") || (donation.getDonar()==user)){
                row[0] = donation;
                row[1] = donation.getNotes();
                row[2] = donation.getAmount();
                row[3] = donation.getDonationDate();
                row[4] = donation.getStatus();
                model.addRow(row);
            }
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteDonationjButton;
    private javax.swing.JTextField donationAmountjTextField;
    private javax.swing.JTextField donationDescjTextField;
    private javax.swing.JTextField donationNamejTextField;
    private javax.swing.JTable enterprisessjTable;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loggedmhwjLabel;
    private javax.swing.JButton mhwLogoutjButton;
    private javax.swing.JButton newDonationButton;
    private javax.swing.JButton saveEnterprisejButton;
    private javax.swing.JButton updateNameButton;
    // End of variables declaration//GEN-END:variables
}
