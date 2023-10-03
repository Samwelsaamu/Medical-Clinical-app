/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.TreasurerRole;

import Controller.DB4OModel.DB4OModel;
import Controller.Enterprise.Enterprise;
import Controller.HealthNGO;
import Controller.Network.Network;
import Controller.Users.Users;
import Controller.WorkQueue.FundsRequestWorker;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Saamu
 */
@SuppressWarnings("unchecked")
public class TreasurerWorkerFundsRequestjPanel extends javax.swing.JPanel {

    /**
     * Creates new form MentalHealthWorkerjPanel
     */
    private HealthNGO system;
    private JPanel container,logincontainerJPanel;
    private Users user;
    private DB4OModel dB4OModel = DB4OModel.getInstance();
    private Enterprise enterprise;
    private FundsRequestWorker fundsRequest;
    public TreasurerWorkerFundsRequestjPanel(JPanel logincontainerJPanel,JPanel container,Enterprise enterprise, Users user, HealthNGO system,FundsRequestWorker fundsRequest) {
        initComponents();
        this.system=system;
        this.container=container;
        this.logincontainerJPanel=logincontainerJPanel;
        this.enterprise=enterprise;
        this.fundsRequest=fundsRequest;
        this.user=user;
        this.loggedmhwjLabel.setText("Hi, "+user.toFullname()+"("+user.getRole()+")");
        String networkname="";
        for(Network network:system.getNetworkList()){
            networkname=network.getName();
        }
        this.networknamejLabel.setText(networkname);
        displayItemRequest();
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
        networknamejLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        resoveItemResultjTextArea = new javax.swing.JTextArea();
        submitjButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        itemQtyjTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestIssuejTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        itemQuantityjLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        itemsstatusLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(java.awt.SystemColor.window);
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        loggedmhwjLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        loggedmhwjLabel.setText("Logged Username");
        loggedmhwjLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        mhwLogoutjButton.setBackground(new java.awt.Color(255, 255, 204));
        mhwLogoutjButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        mhwLogoutjButton.setText("Logout");
        mhwLogoutjButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        mhwLogoutjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mhwLogoutjButtonActionPerformed(evt);
            }
        });

        networknamejLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        networknamejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        networknamejLabel.setText("Logged Network");
        networknamejLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton1.setText("<< Back");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(networknamejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loggedmhwjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mhwLogoutjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(loggedmhwjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(mhwLogoutjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(networknamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resolve Funds Requested", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        resoveItemResultjTextArea.setColumns(20);
        resoveItemResultjTextArea.setRows(5);
        jScrollPane2.setViewportView(resoveItemResultjTextArea);

        submitjButton.setBackground(new java.awt.Color(204, 255, 204));
        submitjButton.setText("Submit Result");
        submitjButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        submitjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitjButtonActionPerformed(evt);
            }
        });

        jLabel10.setText("Amount");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(submitjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(itemQtyjTextField)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemQtyjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Funds Request", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Fund Message"));

        requestIssuejTextArea.setEditable(false);
        requestIssuejTextArea.setColumns(20);
        requestIssuejTextArea.setRows(5);
        requestIssuejTextArea.setEnabled(false);
        jScrollPane1.setViewportView(requestIssuejTextArea);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Amount");

        itemQuantityjLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        itemQuantityjLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Status");

        itemsstatusLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        itemsstatusLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(itemQuantityjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(itemsstatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemQuantityjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemsstatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        TreasurerWorkerjPanel dwjp = (TreasurerWorkerjPanel) component;
        dwjp.displayFundsRequests();
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void submitjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitjButtonActionPerformed
        String message = resoveItemResultjTextArea.getText().trim();
        String quantity=itemQtyjTextField.getText().trim();
        if(message.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Specify Result", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        double qty=0;
        try{
            qty=Double.parseDouble(quantity);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Amount Must be a Positive Integer Number.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int confirm=JOptionPane.showConfirmDialog(null, "Do You Want to Resolve this Fund Request?", "Resolve Fund Request", JOptionPane.YES_NO_OPTION);
        if(confirm==0){
            fundsRequest.setRequesteResult(message);
            fundsRequest.setStatus("Request Resolved");
            fundsRequest.setResolvedAmount(qty);
            fundsRequest.setReceiver(user);
            resoveItemResultjTextArea.setText("");
            resoveItemResultjTextArea.setVisible(false);
            submitjButton.setVisible(false);
            JOptionPane.showMessageDialog(null, "Fund Request Resolved.");
            dB4OModel.storeSystem(system);
            displayItemRequest();
        }      
    }//GEN-LAST:event_submitjButtonActionPerformed
    
    public void displayItemRequest(){
        this.itemQuantityjLabel.setText(String.valueOf(fundsRequest.getAmount()));
        this.itemsstatusLabel.setText(fundsRequest.getStatus());
        this.requestIssuejTextArea.setText(fundsRequest.getMessage());
        if(this.fundsRequest.getRequesteResult()!=null){
            resoveItemResultjTextArea.setText(fundsRequest.getRequesteResult());
            resoveItemResultjTextArea.setEditable(false);
            submitjButton.setVisible(false);
            itemQtyjTextField.setEditable(false);
            itemQtyjTextField.setText(String.valueOf(fundsRequest.getResolvedAmount()));
        }
        else{
            resoveItemResultjTextArea.setText("");
            resoveItemResultjTextArea.setEditable(true);
            submitjButton.setVisible(true);
            itemQtyjTextField.setEditable(true);
            itemQtyjTextField.setText("");
        }
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField itemQtyjTextField;
    private javax.swing.JLabel itemQuantityjLabel;
    private javax.swing.JLabel itemsstatusLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel loggedmhwjLabel;
    private javax.swing.JButton mhwLogoutjButton;
    private javax.swing.JLabel networknamejLabel;
    private javax.swing.JTextArea requestIssuejTextArea;
    private javax.swing.JTextArea resoveItemResultjTextArea;
    private javax.swing.JButton submitjButton;
    // End of variables declaration//GEN-END:variables
}
