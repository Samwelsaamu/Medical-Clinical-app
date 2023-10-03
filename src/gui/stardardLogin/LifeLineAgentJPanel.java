/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.stardardLogin;

import Controller.DB4OModel.DB4OModel;
import Controller.Department.Department;
import Controller.Enterprise.Enterprise;
import Controller.HealthNGO;
import Controller.Network.Network;
import Controller.Users.Users;
import gui.LifelineAgent.LifelineWorkerjPanel;
import gui.StartUI;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Saamu
 */
@SuppressWarnings("unchecked")
public class LifeLineAgentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form mentalHealthWarriorJPanel
     */
    public StartUI starts;
    private HealthNGO system;
    private JPanel container,logincontainerJPanel;
    private DB4OModel dB4OModel = DB4OModel.getInstance();
    public LifeLineAgentJPanel(JPanel logincontainerJPanel,JPanel container, HealthNGO system) {
        initComponents();
        String networkname="Lifeline Agent Login";
        for(Network network:system.getNetworkList()){
            networkname=network.getName()+" "+"Lifeline Agent Login";
        }
        loginjPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, networkname, javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));
        this.system=system;
        this.container=container;
        this.logincontainerJPanel=logincontainerJPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginjPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userjTextField = new javax.swing.JTextField();
        passjPasswordField = new javax.swing.JPasswordField();
        loginjButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        loginjPanel.setBackground(new java.awt.Color(0, 102, 102));
        loginjPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lifeline Agent Login Only", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        passjPasswordField.setToolTipText("");

        loginjButton.setBackground(new java.awt.Color(204, 255, 204));
        loginjButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        loginjButton.setText("Login");
        loginjButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(0, 102, 102)));
        loginjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginjButtonActionPerformed(evt);
            }
        });

        jLabel3.setForeground(java.awt.SystemColor.activeCaption);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Login to receive life saving requets");

        javax.swing.GroupLayout loginjPanelLayout = new javax.swing.GroupLayout(loginjPanel);
        loginjPanel.setLayout(loginjPanelLayout);
        loginjPanelLayout.setHorizontalGroup(
            loginjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginjPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(loginjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginjButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                    .addComponent(passjPasswordField))
                .addContainerGap())
        );
        loginjPanelLayout.setVerticalGroup(
            loginjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(loginjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passjPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(loginjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(loginjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(loginjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginjButtonActionPerformed
        String userName = userjTextField.getText();
        char[] passwordRaw = passjPasswordField.getPassword();
        String password = String.valueOf(passwordRaw);

        //Step1: Check in the system admin user account directory if you have the user
        Users user=system.getUsersDirectory().authenticateUser(userName, password);

        Enterprise inEnterprise=null;
        Department inDepartment=null;

        if(user==null){
            //Step 2: Go inside each network and check each enterprise
            for(Network network:system.getNetworkList()){
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                    user=enterprise.getUsersDirectory().authenticateUser(userName, password);
                    if(user==null){
                        //Step 3:check against each organization for each enterprise
                        for(Department organization:enterprise.getDepartmentDirectory().getDepartmentList()){
                            user=organization.getUsersDirectory().authenticateUser(userName, password);
                            if(user!=null){
                                inEnterprise=enterprise;
                                inDepartment=organization;
                                break;
                            }
                        }

                    }
                    else{
                        inEnterprise=enterprise;
                        break;
                    }
                    if(inDepartment!=null){
                        break;
                    }
                }
                if(inEnterprise!=null){
                    break;
                }
            }
        }
        
        if(user==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        }
        else{
            boolean isFound=system.getUsersDirectory().checkIfUsernameIsLifelineAgent(user.getRole().toString());
            if(isFound){
                LifelineWorkerjPanel lifelineWorkAreaJPanel=new LifelineWorkerjPanel(logincontainerJPanel,container,inEnterprise, user ,system);
                logincontainerJPanel.setVisible(false);
                container.add("lifelineWorkAreaJPanel",lifelineWorkAreaJPanel);
                CardLayout layout=(CardLayout)container.getLayout();
                layout.next(container);
            }
            else{
                JOptionPane.showMessageDialog(null, "Unauthorised User");
                return;
            }
        }

    }//GEN-LAST:event_loginjButtonActionPerformed
    
    static boolean checkMail(String email) {
      String mailregex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
      return email.matches(mailregex);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton loginjButton;
    private javax.swing.JPanel loginjPanel;
    private javax.swing.JPasswordField passjPasswordField;
    private javax.swing.JTextField userjTextField;
    // End of variables declaration//GEN-END:variables
}
