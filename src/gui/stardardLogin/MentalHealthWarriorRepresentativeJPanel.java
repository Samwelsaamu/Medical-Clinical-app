/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.stardardLogin;

import Controller.DB4OModel.DB4OModel;
import Controller.Department.Department;
import Controller.Employee.Employee;
import Controller.Enterprise.Enterprise;
import Controller.HealthNGO;
import Controller.Network.Network;
import Controller.Role.Role;
import Controller.Role.WarriorRepresentativeRole;
import Controller.Users.Users;
import gui.MentalHealthRepRole.MentalHealthRepWorkerjPanel;
import gui.StartUI;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Saamu
 */
@SuppressWarnings("unchecked")
public class MentalHealthWarriorRepresentativeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form mentalHealthWarriorJPanel
     */
    public StartUI starts;
    private HealthNGO system;
    private JPanel container,logincontainerJPanel;
    private DB4OModel dB4OModel = DB4OModel.getInstance();
    public MentalHealthWarriorRepresentativeJPanel(JPanel logincontainerJPanel,JPanel container, HealthNGO system) {
        initComponents();
        String networkname="Donor Login";
        for(Network network:system.getNetworkList()){
            networkname=network.getName()+" "+"Donor Login";
        }
        loginjPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, networkname, javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));
        this.system=system;
        this.container=container;
        this.logincontainerJPanel=logincontainerJPanel;
        this.newUserjPanel.setVisible(false);
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
        jButton1 = new javax.swing.JButton();
        newUserjPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        firstnamejTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lastnamejTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        phonejTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        emailIdjTextField = new javax.swing.JTextField();
        createNewUserjButton = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        usernamejTextField = new javax.swing.JTextField();
        passwordjPasswordField = new javax.swing.JPasswordField();
        backtologinjButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        loginjPanel.setBackground(new java.awt.Color(0, 102, 102));
        loginjPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Warrior Representative Login", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

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
        jLabel3.setText("Please Create Account for First Time Use.");

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setText("Create New Account");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(0, 102, 102)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginjPanelLayout = new javax.swing.GroupLayout(loginjPanel);
        loginjPanel.setLayout(loginjPanelLayout);
        loginjPanelLayout.setHorizontalGroup(
            loginjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userjTextField)
                    .addComponent(passjPasswordField)
                    .addGroup(loginjPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(loginjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginjPanelLayout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        loginjPanelLayout.setVerticalGroup(
            loginjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginjPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
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
                .addGap(14, 14, 14)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        newUserjPanel.setBackground(new java.awt.Color(0, 102, 102));
        newUserjPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Warrior Representative Registration", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("First Name");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Last Name");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("Phone");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel13.setText("Email");

        createNewUserjButton.setBackground(new java.awt.Color(204, 255, 204));
        createNewUserjButton.setText("Submit Account Details");
        createNewUserjButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(0, 102, 102)));
        createNewUserjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewUserjButtonActionPerformed(evt);
            }
        });

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel20.setText("Username");

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel21.setText("Password");

        backtologinjButton.setBackground(new java.awt.Color(204, 255, 204));
        backtologinjButton.setText("Back to Login");
        backtologinjButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(0, 102, 102)));
        backtologinjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtologinjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newUserjPanelLayout = new javax.swing.GroupLayout(newUserjPanel);
        newUserjPanel.setLayout(newUserjPanelLayout);
        newUserjPanelLayout.setHorizontalGroup(
            newUserjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newUserjPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(firstnamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(newUserjPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lastnamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(newUserjPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(phonejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(newUserjPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(emailIdjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(newUserjPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(usernamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(newUserjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newUserjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backtologinjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(newUserjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newUserjPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(passwordjPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(newUserjPanelLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(createNewUserjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        newUserjPanelLayout.setVerticalGroup(
            newUserjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newUserjPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(newUserjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstnamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(newUserjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastnamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newUserjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phonejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(newUserjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailIdjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newUserjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(newUserjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordjPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(newUserjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backtologinjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createNewUserjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(loginjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newUserjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(loginjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(newUserjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        newUserjPanel.setVisible(true);
        loginjPanel.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backtologinjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtologinjButtonActionPerformed
        newUserjPanel.setVisible(false);
        loginjPanel.setVisible(true);
    }//GEN-LAST:event_backtologinjButtonActionPerformed

    private void createNewUserjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewUserjButtonActionPerformed
        //Submit Details
        String username = this.usernamejTextField.getText().trim();
        char[] passwordRaw = this.passwordjPasswordField.getPassword();
        String password = String.valueOf(passwordRaw);
        String firstname = firstnamejTextField.getText().trim();
        String lastname = lastnamejTextField.getText().trim();
        String mailid = this.emailIdjTextField.getText().trim();
        String phone = this.phonejTextField.getText().trim();
        Long contactno;
        Role role = (Role) new WarriorRepresentativeRole();
        
        if(username.isEmpty() || password.isEmpty() || firstname.isEmpty() || lastname.isEmpty()
                || mailid.isEmpty() || phone.isEmpty()  || role==null){
            JOptionPane.showMessageDialog(this, "Some Data in Fields is Missing", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Employee employee = (Employee) system.getEmployeeDirectory().createEmployee(firstname+" "+lastname);
    
        try{
            contactno=Long.valueOf(phone);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Phone Must be a Positive Number.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(!checkMail(mailid)){
            JOptionPane.showMessageDialog(this, "Check Your Email ID.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (phone.length()<10 || phone.length()>10 ) {
            JOptionPane.showMessageDialog(this, "Phone Number Should be 10 digits.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(username.length()<=4) {
            JOptionPane.showMessageDialog(this, "Username should be Five and More Length", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(username.length()>120) {
            JOptionPane.showMessageDialog(this, "Username should be less than 120 length", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(password.length()<=7) {
            JOptionPane.showMessageDialog(this, "Your Password length should be more than 8 characters", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(password.length()>120) {
            JOptionPane.showMessageDialog(this, "Your Password length should be less than 120 characters", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        boolean unique=system.checkIfUserIsUnique(username);
        Enterprise inEnterprise=null;
        Department inDepartment=null;
        Network inNetwork=null;
        //checking if username is taken
        if(unique){
            //Step 1: Go inside each network and check each enterprise
            for(Network network:system.getNetworkList()){
                inNetwork=network;
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                    unique=enterprise.getUsersDirectory().checkIfUsernameIsUnique(username);
                    if(unique){
                       //Step 3:check against each department for each enterprise
                       for(Department department1:enterprise.getDepartmentDirectory().getDepartmentList()){
                           unique=department1.getUsersDirectory().checkIfUsernameIsUnique(username);
                           if(!unique){
                               inEnterprise=enterprise;
                               inDepartment=department1;
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
        
        if(!unique){
            JOptionPane.showMessageDialog(this, "Username Already Taken", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String message=null;
        if(role.toString().equalsIgnoreCase("Warrior Representative")){
            message="Dear, \n"+firstname+" "+lastname+"\n"+
                    "Your are now Registered with us.\n" +
                    "Thank you for being WITH you NGO.";
            if(message==null || inNetwork==null){
                JOptionPane.showMessageDialog(null, "The Network is Not Probally Configured.");
                return ;
            }
            if(system.getUsersDirectory().sendFirstLoginNotification(mailid,message,inNetwork).equalsIgnoreCase("Fail")){
                JOptionPane.showMessageDialog(null, "Notification Email Could not sent. Try Again.");
                return ;
            }
            Users MHW=system.getUsersDirectory().createUserAccount(username, password, employee, role, firstname, lastname, null, null, null, null, null, 0, contactno, mailid, null, null, null, null, null);
            if(MHW.toString()!=null)
            {
                this.newUserjPanel.setVisible(false);
                JOptionPane.showMessageDialog(null, "Details Submmited Successfully. Please Login.");
                this.loginjPanel.setVisible(true);

            }
        }
        else{
            JOptionPane.showMessageDialog(null, role.toString()+" Is Not Available. Get IT Support.");
            return;
        }
        dB4OModel.storeSystem(system);
    }//GEN-LAST:event_createNewUserjButtonActionPerformed

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
            boolean isFound=system.getUsersDirectory().checkIfUsernameIsWarriorRepresentative(user.getRole().toString());
            if(isFound){
                System.out.println("Warrior Rep "+user);
                MentalHealthRepWorkerjPanel patientRepWorkAreaJPanel=new MentalHealthRepWorkerjPanel(logincontainerJPanel,container, user ,system);
                logincontainerJPanel.setVisible(false);
                container.add("patientRepWorkAreaJPanel",patientRepWorkAreaJPanel);
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
    private javax.swing.JButton backtologinjButton;
    private javax.swing.JButton createNewUserjButton;
    private javax.swing.JTextField emailIdjTextField;
    private javax.swing.JTextField firstnamejTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lastnamejTextField;
    private javax.swing.JButton loginjButton;
    private javax.swing.JPanel loginjPanel;
    private javax.swing.JPanel newUserjPanel;
    private javax.swing.JPasswordField passjPasswordField;
    private javax.swing.JPasswordField passwordjPasswordField;
    private javax.swing.JTextField phonejTextField;
    private javax.swing.JTextField userjTextField;
    private javax.swing.JTextField usernamejTextField;
    // End of variables declaration//GEN-END:variables
}
