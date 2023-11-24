/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trackerapp.forms;

/**
 *
 * @author micle
 */
public class MenuForm extends javax.swing.JFrame {

    private ActivityLogsForm logForm;
    private WorkoutPlansForm plansForm;
    private RemindersForm remindersForm;
   
    
    /**
     * Creates new form MenuForm
     */
    public MenuForm() {
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

        jLabel1 = new javax.swing.JLabel();
        plansBtn = new javax.swing.JButton();
        activityLogBtn = new javax.swing.JButton();
        reminderBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Menu");

        plansBtn.setText("Workout Plans");
        plansBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plansBtnActionPerformed(evt);
            }
        });

        activityLogBtn.setText("Activity Log");
        activityLogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activityLogBtnActionPerformed(evt);
            }
        });

        reminderBtn.setText("Health Reminder");
        reminderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reminderBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(plansBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(activityLogBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reminderBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(plansBtn)
                .addGap(32, 32, 32)
                .addComponent(activityLogBtn)
                .addGap(33, 33, 33)
                .addComponent(reminderBtn)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void plansBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plansBtnActionPerformed
                // TODO add your handling code here:
        
        plansForm = new WorkoutPlansForm();
        plansForm.setLocationRelativeTo(null);
        plansForm.setVisible(true);   
    }//GEN-LAST:event_plansBtnActionPerformed

    private void activityLogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityLogBtnActionPerformed
        // TODO add your handling code here:
        logForm = new ActivityLogsForm();
        logForm.setLocationRelativeTo(null);
        logForm.setVisible(true);  
    }//GEN-LAST:event_activityLogBtnActionPerformed

    private void reminderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reminderBtnActionPerformed
        // TODO add your handling code here:
        
        remindersForm = new RemindersForm();
        remindersForm.setLocationRelativeTo(null);
        remindersForm.setVisible(true);
    }//GEN-LAST:event_reminderBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activityLogBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton plansBtn;
    private javax.swing.JButton reminderBtn;
    // End of variables declaration//GEN-END:variables
}
