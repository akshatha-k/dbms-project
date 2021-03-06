
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aditcam
 */

public class Organization_option extends javax.swing.JFrame {
String cust_id;
String branch_id;
    /**
     * Creates new form Organization_option
     */
    public Organization_option() {
        initComponents();
    }
    public Organization_option(String c_id,String b_id)
    {
        initComponents();
        cust_id=c_id;
        branch_id=b_id;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        view_hired = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        hire = new javax.swing.JButton();
        contract = new javax.swing.JButton();
        bb2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        view_hired.setText("View Hired Employees");
        view_hired.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_hiredActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Select your operation");

        hire.setText("Hire Employees");
        hire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireActionPerformed(evt);
            }
        });

        contract.setText("View Contract");
        contract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contractActionPerformed(evt);
            }
        });

        bb2.setText("<-- Back");
        bb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(hire)
                .addGap(28, 28, 28)
                .addComponent(contract)
                .addGap(18, 18, 18)
                .addComponent(view_hired)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bb2)
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bb2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hire)
                    .addComponent(contract)
                    .addComponent(view_hired))
                .addGap(91, 91, 91))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void view_hiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_hiredActionPerformed
                this.setVisible(false);
                 new viewHired(cust_id,branch_id).setVisible(true);    
        
     
    }//GEN-LAST:event_view_hiredActionPerformed

    private void hireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireActionPerformed
       this.setVisible(false);
        Organization_hire ob2 = new Organization_hire(cust_id,branch_id);
        ob2.setVisible(true);
    }//GEN-LAST:event_hireActionPerformed

    private void contractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contractActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Organization_contract ob1 = new Organization_contract(cust_id,branch_id);
        ob1.setVisible(true);
       
    }//GEN-LAST:event_contractActionPerformed

    private void bb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bb2ActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(this,"You will have to re-enter your login credentials","Do you want to proceed to the homepage ?",JOptionPane.YES_NO_OPTION);
        if(n==0)
        {
            this.setVisible(false);
            Login_page ob  = new Login_page();
            ob.setVisible(true);
        }

    }//GEN-LAST:event_bb2ActionPerformed

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
            java.util.logging.Logger.getLogger(Organization_option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Organization_option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Organization_option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Organization_option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Organization_option().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bb2;
    private javax.swing.JButton contract;
    private javax.swing.JButton hire;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton view_hired;
    // End of variables declaration//GEN-END:variables
}
