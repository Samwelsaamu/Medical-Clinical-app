/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.HDARole;

import Controller.DB4OModel.DB4OModel;
import Controller.Department.Department;
import Controller.Department.SupportDepartment;
import Controller.Enterprise.Enterprise;
import Controller.HealthNGO;
import Controller.Users.Users;
import Controller.WorkQueue.PatientMedicineRequest;
import Controller.WorkQueue.PatientRequest;
import Controller.WorkQueue.WorkRequest;
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
public class HelpDeskAgentWorkerjPanel extends javax.swing.JPanel {

    /**
     * Creates new form MentalHealthWorkerjPanel
     */
    private HealthNGO system;
    private JPanel container,logincontainerJPanel;
    private Users user;
    private Enterprise enterprise;
    private Department org;
    private DB4OModel dB4OModel = DB4OModel.getInstance();
    public HelpDeskAgentWorkerjPanel(JPanel logincontainerJPanel,JPanel container,Enterprise enterprise,Department org, Users user, HealthNGO system) {
        initComponents();
        this.system=system;
        this.container=container;
        this.logincontainerJPanel=logincontainerJPanel;
        this.enterprise=enterprise;
        this.user=user;
        this.loggedmhwjLabel.setText("Hi, "+user.toFullname()+"("+user.getRole()+")");
        this.org=(SupportDepartment)org;
        addictionRequests();
        medicineRequests();
        displayMyRehabChatsRequests();
        talkToAgentRequests();
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
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pharmacistRequestsjTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        addictionRequestsjTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        rehabCenterRequestsjTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        talkToAgentRequestsjTable = new javax.swing.JTable();

        setBackground(java.awt.SystemColor.window);

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

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton1.setText("Refresh");
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loggedmhwjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 977, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mhwLogoutjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(loggedmhwjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(mhwLogoutjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Prescription for Pharmacist", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        pharmacistRequestsjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request", "Sender", "Message", "Status", "Result"
            }
        ));
        pharmacistRequestsjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pharmacistRequestsjTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(pharmacistRequestsjTable);

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Addiction Requests", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        addictionRequestsjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request", "Sender", "Message", "Status", "Result"
            }
        ));
        addictionRequestsjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addictionRequestsjTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(addictionRequestsjTable);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MHW Rehab Center Requests", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        rehabCenterRequestsjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request", "Sender", "Status", "Message", "Requested", "Result"
            }
        ));
        rehabCenterRequestsjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rehabCenterRequestsjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(rehabCenterRequestsjTable);

        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Talk to Agent Requests", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        talkToAgentRequestsjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request", "Sender", "Status", "Message", "Requested", "Result"
            }
        ));
        talkToAgentRequestsjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                talkToAgentRequestsjTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(talkToAgentRequestsjTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(831, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addGap(600, 600, 600)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 381, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 492, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        addictionRequests();
        medicineRequests();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pharmacistRequestsjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pharmacistRequestsjTableMouseClicked
        int selectedRow = pharmacistRequestsjTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "No Request Selected");
            return;
        }
        PatientMedicineRequest request = (PatientMedicineRequest)pharmacistRequestsjTable.getValueAt(selectedRow, 0);
        
        HelpDeskAgentWorkerPrescriptionRequestjPanel HDAPrescriptionProcess=new HelpDeskAgentWorkerPrescriptionRequestjPanel(logincontainerJPanel,container,enterprise, user ,system,request);
        CardLayout layout=(CardLayout)container.getLayout();
        container.add("HDAPrescriptionProcess",HDAPrescriptionProcess);
        layout.next(container);
    }//GEN-LAST:event_pharmacistRequestsjTableMouseClicked

    private void addictionRequestsjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addictionRequestsjTableMouseClicked
       int selectedRow = addictionRequestsjTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "No Request Selected");
            return;
        }
        String requests=addictionRequestsjTable.getValueAt(selectedRow, 0).toString();
        if(requests.contains("Controller.WorkQueue.PatientRequest")){
            PatientRequest rehab=(PatientRequest)addictionRequestsjTable.getValueAt(selectedRow, 0);
            HelpDeskAgentWorkerProcessAddictionRequestjPanel patientAddictionProcess=new HelpDeskAgentWorkerProcessAddictionRequestjPanel(logincontainerJPanel,container,enterprise, user ,system,rehab);
            CardLayout layout=(CardLayout)container.getLayout();
            container.add("docRehabProcess",patientAddictionProcess);
            layout.next(container);
        }
    }//GEN-LAST:event_addictionRequestsjTableMouseClicked

    private void rehabCenterRequestsjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rehabCenterRequestsjTableMouseClicked
        int selectedRow = rehabCenterRequestsjTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "No Request Selected");
            return;
        }
        String requests=rehabCenterRequestsjTable.getValueAt(selectedRow, 0).toString();
        if(requests.contains("Controller.WorkQueue.PatientRequest")){
            PatientRequest rehab=(PatientRequest)rehabCenterRequestsjTable.getValueAt(selectedRow, 0);
            HelpDeskAgentWorkerProcessRehabRequestjPanel docRehabProcess=new HelpDeskAgentWorkerProcessRehabRequestjPanel(logincontainerJPanel,container,enterprise, user ,system,rehab);
            CardLayout layout=(CardLayout)container.getLayout();
            container.add("docRehabProcess",docRehabProcess);
            layout.next(container);
        }
    }//GEN-LAST:event_rehabCenterRequestsjTableMouseClicked

    private void talkToAgentRequestsjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_talkToAgentRequestsjTableMouseClicked
        int selectedRow = talkToAgentRequestsjTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "No Request Selected");
            return;
        }
        String requests=talkToAgentRequestsjTable.getValueAt(selectedRow, 0).toString();
        if(requests.contains("Controller.WorkQueue.PatientRequest")){
            PatientRequest rehab=(PatientRequest)talkToAgentRequestsjTable.getValueAt(selectedRow, 0);
            HelpDeskAgentWorkerProcessTalktoAgentRequestjPanel patientTalkingProcess=new HelpDeskAgentWorkerProcessTalktoAgentRequestjPanel(logincontainerJPanel,container,enterprise, user ,system,rehab);
            CardLayout layout=(CardLayout)container.getLayout();
            container.add("patientTalkingProcess",patientTalkingProcess);
            layout.next(container);
        }
    }//GEN-LAST:event_talkToAgentRequestsjTableMouseClicked
    
    public void talkToAgentRequests(){
        DefaultTableModel model = (DefaultTableModel) talkToAgentRequestsjTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest order : org.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            String request=String.valueOf(order);
            if(request.contains("Controller.WorkQueue.PatientRequest")){
                String rec=(order.getReceiver()!=null)?order.getReceiver().toString():"";
                if(rec.equals("")){
                    if(order.getMessage().equals("Talk: Workplace Harrasment") ||
                        order.getMessage().equals("Talk: Domestic Violence") || order.getMessage().equals("Talk: Anxiety") ||
                        order.getMessage().equals("Talk: Child Abuse") || order.getMessage().equals("Talk: Sexual Harrasment") ||
                        order.getMessage().equals("Talk: Depression") || order.getMessage().equals("Talk: Health and Wellness") ||
                        order.getMessage().equals("Talk: Trauma")){
                            row[0] = order;
                            row[1] = (order.getSender()!=null)?order.getSender():"";
                            row[2] = order.getMessage();
                            row[3] = order.getStatus();
                            String result = ((PatientRequest)order).getRequesteResult();
                            row[4] = result == null ? "Waiting" : result;
                            model.addRow(row);
                    }
                }
            }
        }
    }
    
    public void addictionRequests(){
        DefaultTableModel model = (DefaultTableModel) addictionRequestsjTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest order : org.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            String request=String.valueOf(order);
            if(request.contains("Controller.WorkQueue.PatientRequest")){
                String rec=(order.getReceiver()!=null)?order.getReceiver().toString():"";
                if(rec.equals("")){
                    if(order.getStatus().equals("Addiction Sent")){
                            row[0] = order;
                            row[1] = (order.getSender()!=null)?order.getSender():"";
                            row[2] = order.getMessage();
                            row[3] = order.getStatus();
                            String result = ((PatientRequest)order).getRequesteResult();
                            row[4] = result == null ? "Waiting" : result;
                            model.addRow(row);
                    }
                }
            }
        }
    }
    
    public void medicineRequests(){
        DefaultTableModel model = (DefaultTableModel) pharmacistRequestsjTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest order : org.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            String request=String.valueOf(order);
            if(request.contains("Controller.WorkQueue.PatientMedicineRequest")){
                String rec=(order.getReceiver()!=null)?order.getReceiver().toString():"";
                if(rec.equals("")){
                    row[0] = order;
                    row[1] = (order.getSender()!=null)?order.getSender():"";
                    row[2] = order.getMessage();
                    row[3] = order.getStatus();
                    String result = ((PatientMedicineRequest)order).getRequesteResult();
                    row[4] = result == null ? "Waiting" : result;
                    model.addRow(row);
                }
            }
        }
    }
    
    public void displayMyRehabChatsRequests(){
        DefaultTableModel model = (DefaultTableModel) rehabCenterRequestsjTable.getModel();
        model.setRowCount(0);
        for (WorkRequest order : org.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            String request=String.valueOf(order);
            if(request.contains("Controller.WorkQueue.PatientRequest")){
                if(order.getMessage().equals("Rehab Alcohol Addiction") || 
                    order.getMessage().equals("Rehab Substance Abuse")){
                        row[0] = order;
                        row[1] = order.getSender().toFullname();
                        row[2] = order.getStatus();
                        row[3] = order.getMessage();
                        row[4] = order.getRequestDate();
                        String result = ((PatientRequest)order).getRequesteResult();
                        row[5] = result == null ? "Waiting" : result;
                        model.addRow(row);
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable addictionRequestsjTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel loggedmhwjLabel;
    private javax.swing.JButton mhwLogoutjButton;
    private javax.swing.JTable pharmacistRequestsjTable;
    private javax.swing.JTable rehabCenterRequestsjTable;
    private javax.swing.JTable talkToAgentRequestsjTable;
    // End of variables declaration//GEN-END:variables
}
