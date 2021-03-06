
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aditcam
 */
public class Admin_option extends javax.swing.JFrame {

    /**
     * Creates new form Admin_option
     */
    public Admin_option() {
        initComponents();
          this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        bb2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(rb1);
        rb1.setText("Add new Patient");

        buttonGroup1.add(rb2);
        rb2.setText("Execute display queries on the database ");

        jLabel1.setText("Select your operation");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bb2.setText("<-- Back");
        bb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb2ActionPerformed(evt);
            }
        });
        
        rb3 = new JRadioButton();
        rb3.setText("Add new Doctor");
        buttonGroup1.add(rb3);
        
        rb4 = new JRadioButton();
        rb4.setText("Add new room booking");
        buttonGroup1.add(rb4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(bb2)
        					.addGap(18)
        					.addComponent(jLabel1))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(56)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(rb3, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
        						.addComponent(rb2)
        						.addComponent(rb4, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(57)
        					.addComponent(rb1))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(124)
        					.addComponent(jButton1)))
        			.addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(13)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(bb2)
        				.addComponent(jLabel1))
        			.addPreferredGap(ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
        			.addComponent(rb1)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(rb3)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(rb4)
        			.addGap(2)
        			.addComponent(rb2)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jButton1)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(rb1.isSelected())
        {
            this.setVisible(false);
            Admin_pat ob1 = new Admin_pat();
            ob1.setVisible(true);
        }
        else if(rb2.isSelected())
        {
            this.setVisible(false);
            Admin_page ob2 = new Admin_page();
            ob2.setVisible(true);
        }
        else if(rb3.isSelected())
        {
            this.setVisible(false);
            Admin_doc ob2 = new Admin_doc();
            ob2.setVisible(true);
        }
        else if(rb4.isSelected())
        {
            this.setVisible(false);
            Room_book ob2 = new Room_book();
            ob2.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bb2ActionPerformed
        // TODO add your handling code here:
       int n = JOptionPane.showConfirmDialog(this,"You will have to re-enter your login credentials","Do you want to proceed to the homepage ?",JOptionPane.YES_NO_OPTION);
       if(n==0)
       {
            this.setVisible(false);
            Login ob  = new Login();
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
            java.util.logging.Logger.getLogger(Admin_option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_option().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bb2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private JRadioButton rb3;
    private JRadioButton rb4;
}
