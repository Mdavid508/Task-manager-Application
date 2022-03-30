
import javax.swing.JComboBox;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author San
 */
public class Pendingtasksemp extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Pendingtasksemp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxProfile = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        btnDashboard = new javax.swing.JButton();
        btnSubmitted = new javax.swing.JButton();
        btnAssignTaskMenu = new javax.swing.JButton();
        btnPendingTasks = new javax.swing.JButton();
        btnMyWriters = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBoxProfile1 = new javax.swing.JComboBox<>();

        jComboBoxProfile.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jComboBoxProfile.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employer" }));
        jComboBoxProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProfileActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(12, 28, 59));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TASK MANAGER");

        btnDashboard.setBackground(new java.awt.Color(0, 51, 255));
        btnDashboard.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard.setText("DASHBOARD");
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        btnSubmitted.setBackground(new java.awt.Color(0, 51, 255));
        btnSubmitted.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSubmitted.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmitted.setText("SUBMITTED");
        btnSubmitted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmittedActionPerformed(evt);
            }
        });

        btnAssignTaskMenu.setBackground(new java.awt.Color(0, 51, 255));
        btnAssignTaskMenu.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnAssignTaskMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignTaskMenu.setText("ASSIGN TASKS");
        btnAssignTaskMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignTaskMenuActionPerformed(evt);
            }
        });

        btnPendingTasks.setBackground(new java.awt.Color(0, 51, 255));
        btnPendingTasks.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnPendingTasks.setForeground(new java.awt.Color(255, 255, 255));
        btnPendingTasks.setText("PENDING ");

        btnMyWriters.setBackground(new java.awt.Color(0, 51, 255));
        btnMyWriters.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnMyWriters.setForeground(new java.awt.Color(255, 255, 255));
        btnMyWriters.setText("MY WRITERS");

        btnProfile.setBackground(new java.awt.Color(0, 51, 255));
        btnProfile.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnProfile.setText("PROFILE");
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(28, 28, 28))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMyWriters, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPendingTasks, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDashboard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSubmitted, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAssignTaskMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDashboard)
                .addGap(27, 27, 27)
                .addComponent(btnSubmitted)
                .addGap(18, 18, 18)
                .addComponent(btnAssignTaskMenu)
                .addGap(18, 18, 18)
                .addComponent(btnPendingTasks)
                .addGap(18, 18, 18)
                .addComponent(btnMyWriters)
                .addGap(18, 18, 18)
                .addComponent(btnProfile)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0001", "Economics", "Macroeconomics", "2", "600", "5hrs"},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order Id", "Subject", "Topic", "No of Pages", "Budget", "Duration"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jComboBoxProfile1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jComboBoxProfile1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employer", "Logout", " " }));
        jComboBoxProfile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProfile1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jComboBoxProfile1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jComboBoxProfile1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        //Directs the employer to the dashboard
        this.setVisible(false);
        EmployerDashboard empdboard = new EmployerDashboard();
        empdboard.setVisible(true);
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnSubmittedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmittedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmittedActionPerformed

    private void btnAssignTaskMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignTaskMenuActionPerformed
        // directs you to assigntask
        this.setVisible(false);
        Assigntask assigntaskd =new Assigntask();
        assigntaskd.setVisible(true);
    }//GEN-LAST:event_btnAssignTaskMenuActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        // directs the employer to their profile
        this.setVisible(false);
        Employersprofile profile = new Employersprofile();
        profile.setVisible(true);
    }//GEN-LAST:event_btnProfileActionPerformed

    private void jComboBoxProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxProfileActionPerformed

    private void jComboBoxProfile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProfile1ActionPerformed
        // displays the employer profile and enables them to log out.
         JComboBox cb = (JComboBox) evt.getSource();
         int option = cb.getSelectedIndex();
         if (option==1){
             this.setVisible(false);
             EmployerLogin login = new EmployerLogin();
             login.setVisible(true);
         }
    }//GEN-LAST:event_jComboBoxProfile1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pendingtasksemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pendingtasksemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pendingtasksemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pendingtasksemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pendingtasksemp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignTaskMenu;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnMyWriters;
    private javax.swing.JButton btnPendingTasks;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnSubmitted;
    private javax.swing.JComboBox<String> jComboBoxProfile;
    private javax.swing.JComboBox<String> jComboBoxProfile1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
