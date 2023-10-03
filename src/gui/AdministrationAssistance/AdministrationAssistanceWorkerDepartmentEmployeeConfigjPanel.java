/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.AdministrationAssistance;

import Controller.DB4OModel.DB4OModel;
import Controller.Department.Department;
import Controller.Department.DepartmentDirectory;
import Controller.Employee.Employee;
import Controller.Enterprise.Enterprise;
import Controller.HealthNGO;
import Controller.Network.Network;
import Controller.Users.Users;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saamu
 */
@SuppressWarnings("unchecked")
public class AdministrationAssistanceWorkerDepartmentEmployeeConfigjPanel extends javax.swing.JPanel {

    /**
     * Creates new form MentalHealthWorkerjPanel
     */
    private HealthNGO system;
    private Enterprise enterprise;
    private DepartmentDirectory directory;
    private JPanel container,logincontainerJPanel;
    private Users user;
    private DB4OModel dB4OModel = DB4OModel.getInstance();
    public AdministrationAssistanceWorkerDepartmentEmployeeConfigjPanel(JPanel logincontainerJPanel,JPanel container,Enterprise enterprise,DepartmentDirectory directory, Users user, HealthNGO system) {
        initComponents();
        this.system=system;
        this.container=container;
        this.logincontainerJPanel=logincontainerJPanel;
        this.enterprise=enterprise;
        this.directory=directory;
        this.user=user;
        this.loggedmhwjLabel.setText("Hi, "+user.getEmployee()+"("+user.getRole()+")");
        String networkname="";
        for(Network network:system.getNetworkList()){
            networkname=network.getName();
        }
        this.networknamejLabel.setText(networkname);
        enterprisenamejLabel.setText(enterprise.getName());
        employeeNamejTextField.setText("");
        newEnterprisejButton.setVisible(false);
        updateEnterprisejButton.setVisible(false);
        deleteEnterprisejButton.setVisible(false);
        saveEnterprisejButton.setVisible(true);
        fillDepartmentComboBox();
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
        enterprisenamejLabel = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterprisessjTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        employeeNamejTextField = new javax.swing.JTextField();
        saveEnterprisejButton = new javax.swing.JButton();
        updateEnterprisejButton = new javax.swing.JButton();
        deleteEnterprisejButton = new javax.swing.JButton();
        newEnterprisejButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        departmentjComboBox = new javax.swing.JComboBox();

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

        enterprisenamejLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        enterprisenamejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterprisenamejLabel.setText("Enterprise");
        enterprisenamejLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton4.setBackground(new java.awt.Color(204, 255, 204));
        jButton4.setText("<< Back");
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
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(networknamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(enterprisenamejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loggedmhwjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mhwLogoutjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(loggedmhwjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(mhwLogoutjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(enterprisenamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(networknamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setBackground(new java.awt.Color(0, 153, 153));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Your Netwoks", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        enterprisessjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Name"
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
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New/Edit Network Information", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Employee");

        saveEnterprisejButton.setBackground(new java.awt.Color(204, 255, 204));
        saveEnterprisejButton.setText("Save");
        saveEnterprisejButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        saveEnterprisejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveEnterprisejButtonActionPerformed(evt);
            }
        });

        updateEnterprisejButton.setBackground(new java.awt.Color(204, 255, 204));
        updateEnterprisejButton.setText("Update");
        updateEnterprisejButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        updateEnterprisejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEnterprisejButtonActionPerformed(evt);
            }
        });

        deleteEnterprisejButton.setBackground(new java.awt.Color(204, 255, 204));
        deleteEnterprisejButton.setText("Delete");
        deleteEnterprisejButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        deleteEnterprisejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEnterprisejButtonActionPerformed(evt);
            }
        });

        newEnterprisejButton.setBackground(new java.awt.Color(204, 255, 204));
        newEnterprisejButton.setText("New");
        newEnterprisejButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        newEnterprisejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newEnterprisejButtonActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Department");

        departmentjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentjComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(employeeNamejTextField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(updateEnterprisejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteEnterprisejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newEnterprisejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveEnterprisejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(departmentjComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(departmentjComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteEnterprisejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(saveEnterprisejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(updateEnterprisejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(newEnterprisejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(195, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void enterprisessjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterprisessjTableMouseClicked
       int selectedRow = enterprisessjTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select Employee or Add.");
            employeeNamejTextField.setText("");
            departmentjComboBox.setSelectedIndex(0);
            this.newEnterprisejButton.setVisible(false);
            updateEnterprisejButton.setVisible(false);
            deleteEnterprisejButton.setVisible(false);
            return;
        }
        Employee employee = (Employee)enterprisessjTable.getValueAt(selectedRow, 0);
        employeeNamejTextField.setText(employee.getName());
        newEnterprisejButton.setVisible(true);
        updateEnterprisejButton.setVisible(true);
        deleteEnterprisejButton.setVisible(true);
        saveEnterprisejButton.setVisible(false);
    }//GEN-LAST:event_enterprisessjTableMouseClicked

    private void saveEnterprisejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveEnterprisejButtonActionPerformed
        Department dept = (Department) departmentjComboBox.getSelectedItem();
        String departmentname = employeeNamejTextField.getText();
        if (dept == null) {
            JOptionPane.showMessageDialog(null, "Please Selct Department.");
            return;
        }
        
        if(departmentname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Specify Employee Name", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(departmentname.length()<=5) {
            JOptionPane.showMessageDialog(this, "Employee Name must be five characters and more", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(departmentname.length()>120) {
            JOptionPane.showMessageDialog(this, "Employee Name should have less than 120 characters", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(!system.getEmployeeDirectory().checkIfEmployeeIsUnique(departmentname)){
            JOptionPane.showMessageDialog(this, "Employee Name Exists", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(!dept.getEmployeeDirectory().checkIfEmployeeIsUnique(departmentname)){
            JOptionPane.showMessageDialog(this, "Employee Name Exists", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(!enterprise.getEmployeeDirectory().checkIfEmployeeIsUnique(departmentname)){
            JOptionPane.showMessageDialog(this, "Employee Exists", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        dept.getEmployeeDirectory().createEmployee(departmentname);
        dB4OModel.storeSystem(system);
        displayEmployees(dept);
    }                                          

                                       

    private void delUserjButtonActionPerformed(java.awt.event.ActionEvent evt) {
             
    }//GEN-LAST:event_saveEnterprisejButtonActionPerformed

    private void updateEnterprisejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEnterprisejButtonActionPerformed
        int selectedRow = enterprisessjTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select Employee or Add.");
            this.employeeNamejTextField.setText("");
            departmentjComboBox.setSelectedIndex(0);
            this.newEnterprisejButton.setVisible(false);
            updateEnterprisejButton.setVisible(false);
            deleteEnterprisejButton.setVisible(false);
            return;
        }

        Department dept = (Department) departmentjComboBox.getSelectedItem();
        String departmentname = employeeNamejTextField.getText().trim();
        if (dept == null) {
            JOptionPane.showMessageDialog(null, "Please Select Department.");
            return;
        }
        
        if(departmentname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Specify Employee Name", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(departmentname.length()<=5) {
            JOptionPane.showMessageDialog(this, "Employee Name must be five characters and more", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(departmentname.length()>120) {
            JOptionPane.showMessageDialog(this, "Employee Name should have less than 120 characters", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(!system.getEmployeeDirectory().checkIfEmployeeIsUnique(departmentname)){
            JOptionPane.showMessageDialog(this, "Employee Name Exists", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(!dept.getEmployeeDirectory().checkIfEmployeeIsUnique(departmentname)){
            JOptionPane.showMessageDialog(this, "Employee Name Exists", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(!enterprise.getEmployeeDirectory().checkIfEmployeeIsUnique(departmentname)){
            JOptionPane.showMessageDialog(this, "Employee Exists", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Employee employee = (Employee)enterprisessjTable.getValueAt(selectedRow, 0);
        employee.setName(departmentname);
        
        dB4OModel.storeSystem(system);
        displayEmployees(dept);
    }//GEN-LAST:event_updateEnterprisejButtonActionPerformed

    private void deleteEnterprisejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEnterprisejButtonActionPerformed
        int selectedRow = enterprisessjTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select Employee or Add");
            employeeNamejTextField.setText("");
            newEnterprisejButton.setVisible(false);
            updateEnterprisejButton.setVisible(false);
            deleteEnterprisejButton.setVisible(false);
            departmentjComboBox.setSelectedIndex(0);
            return;
        }
        Department dept = (Department) departmentjComboBox.getSelectedItem();
       
        Employee employee = (Employee)enterprisessjTable.getValueAt(selectedRow, 0);
        dept.getEmployeeDirectory().getEmployeeList().remove(employee);
        dB4OModel.storeSystem(system);
        displayEmployees(dept);
    }//GEN-LAST:event_deleteEnterprisejButtonActionPerformed

    private void newEnterprisejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEnterprisejButtonActionPerformed
        this.employeeNamejTextField.setText("");
        this.newEnterprisejButton.setVisible(false);
        updateEnterprisejButton.setVisible(false);
        deleteEnterprisejButton.setVisible(false);
        saveEnterprisejButton.setVisible(true);
    }//GEN-LAST:event_newEnterprisejButtonActionPerformed

    private void departmentjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentjComboBoxActionPerformed
        Department dept = (Department)departmentjComboBox.getSelectedItem();
        if (dept != null){
            displayEmployees(dept);
        }
    }//GEN-LAST:event_departmentjComboBoxActionPerformed
    
    public void fillDepartmentComboBox(){
        departmentjComboBox.removeAllItems();
        
        for (Department organization : directory.getDepartmentList()){
            departmentjComboBox.addItem(organization);
        }
    }

    private void displayEmployees(Department dept){
        DefaultTableModel model = (DefaultTableModel) enterprisessjTable.getModel();
        
        model.setRowCount(0);
        
        for (Employee employee : dept.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[1];
            row[0] = employee;
            model.addRow(row);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteEnterprisejButton;
    private javax.swing.JComboBox departmentjComboBox;
    private javax.swing.JTextField employeeNamejTextField;
    private javax.swing.JLabel enterprisenamejLabel;
    private javax.swing.JTable enterprisessjTable;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loggedmhwjLabel;
    private javax.swing.JButton mhwLogoutjButton;
    private javax.swing.JLabel networknamejLabel;
    private javax.swing.JButton newEnterprisejButton;
    private javax.swing.JButton saveEnterprisejButton;
    private javax.swing.JButton updateEnterprisejButton;
    // End of variables declaration//GEN-END:variables
}