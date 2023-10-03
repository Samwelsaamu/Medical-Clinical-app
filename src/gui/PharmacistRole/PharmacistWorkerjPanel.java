/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.PharmacistRole;

import Controller.DB4OModel.DB4OModel;
import Controller.Department.Department;
import Controller.Department.PharmacyDepartment;
import Controller.Enterprise.Enterprise;
import Controller.HealthNGO;
import Controller.Users.Users;
import Controller.WorkQueue.PatientMedicineRequest;
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
public class PharmacistWorkerjPanel extends javax.swing.JPanel {

    /**
     * Creates new form MentalHealthWorkerSuicideIdeationjPanel
     */
    private HealthNGO system;
    private JPanel container,logincontainerJPanel;
    private Users user;
    private Department org;
    private DB4OModel dB4OModel = DB4OModel.getInstance();
    public PharmacistWorkerjPanel(JPanel logincontainerJPanel,JPanel container,Enterprise enterprise,Department org, Users user, HealthNGO system) {
        initComponents();
        this.system=system;
        this.container=container;
        this.logincontainerJPanel=logincontainerJPanel;
        this.user=user;
        this.loggedmhwjLabel.setText("Hi, "+user.toFullname()+"("+user.getRole()+")");
        this.org=(PharmacyDepartment)org;
        displayPrescriptions();
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
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        previousRequestsjTable = new javax.swing.JTable();

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

        jButton6.setBackground(new java.awt.Color(204, 255, 204));
        jButton6.setText("Refresh");
        jButton6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loggedmhwjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mhwLogoutjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(loggedmhwjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(mhwLogoutjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Psychriatrist Prescriptions", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        previousRequestsjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Request", "Sender", "Status", "Requested", "Note", "Prescription", "Medicine", "Qty", "Result"
            }
        ));
        previousRequestsjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousRequestsjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(previousRequestsjTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        displayPrescriptions();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void previousRequestsjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousRequestsjTableMouseClicked
        int selectedRow = previousRequestsjTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "No Prescription Selected");
            return;
        }
        String requests=previousRequestsjTable.getValueAt(selectedRow, 0).toString();
        if(requests.contains("Controller.WorkQueue.PatientMedicineRequest")){
            PatientMedicineRequest request = (PatientMedicineRequest)previousRequestsjTable.getValueAt(selectedRow, 0);
            PharmacistWorkerPrescriptionRequestjPanel medicineRProcess=new PharmacistWorkerPrescriptionRequestjPanel(logincontainerJPanel,container, user ,system,request);
            CardLayout layout=(CardLayout)container.getLayout();
            container.add("medicineRProcess",medicineRProcess);
            layout.next(container);
        }
    }//GEN-LAST:event_previousRequestsjTableMouseClicked
    public void displayPrescriptions(){
        DefaultTableModel model = (DefaultTableModel) previousRequestsjTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest order : org.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[9];
            String request=String.valueOf(order);
            if(request.contains("Controller.WorkQueue.PatientMedicineRequest")){
                row[0] = order;
                row[1] = (order.getSender()!=null)?order.getSender():"";
                row[2] = order.getStatus();
                row[3] = order.getRequestDate();
                String note = ((PatientMedicineRequest)order).getWorkOrderR().getPrecriptionNotesWList().getNotes();
                row[4] = note == null ? "None" : note;
                String msg = ((PatientMedicineRequest)order).getWorkOrderR().getPrecriptionNotesWList().getMessage();
                row[5] = msg == null ? "None" : msg;
                String medicine = ((PatientMedicineRequest)order).getMedicinename().toString();
                row[6] = medicine == null ? "None" : medicine;
                row[7] = String.valueOf(((PatientMedicineRequest)order).getQuantity());
                String result = ((PatientMedicineRequest)order).getRequesteResult();
                row[8] = result == null ? "Waiting" : result;
                model.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loggedmhwjLabel;
    private javax.swing.JButton mhwLogoutjButton;
    private javax.swing.JTable previousRequestsjTable;
    // End of variables declaration//GEN-END:variables
}
