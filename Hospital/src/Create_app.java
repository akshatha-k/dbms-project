
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aditcam
 */
public class Create_app extends javax.swing.JFrame {
	int d_id;
	String cust_id;
	String branch_id;
    /**
     * Creates new form Admin_pat
     */
    public Create_app() {
        initComponents();
          this.setLocationRelativeTo(null);
    }
    public Create_app(String c_id,String b_id)
    {
        initComponents();
        cust_id=c_id;
        d_id=Integer.parseInt(c_id);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        bb1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jLabel1.setText("Patient ID");

        jLabel2.setText("Appointment Date");

        jLabel8.setText("Appointment Booking");

        jLabel9.setText("Fill the fields given below (All fields are mandatory)");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bb1.setText("<-- Back");
        bb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(12, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(bb1)
        					.addGap(78)
        					.addComponent(jLabel8))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(21)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel1)
        						.addComponent(id, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
        					.addGap(94)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(name, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel2))))
        			.addGap(33))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(83)
        			.addComponent(jLabel9)
        			.addContainerGap(83, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(199)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(215, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(bb1)
        				.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
        			.addGap(14)
        			.addComponent(jLabel9)
        			.addGap(42)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 11, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(id, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(42)
        			.addComponent(jButton1)
        			.addContainerGap(98, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(!((name.getText()).equals(""))&&!((id.getText()).equals("")))
                {
//                    if(cb1.getSelectedItem().toString().equals("<None>"))
//                    {
//                        JOptionPane.showMessageDialog(this,"Select a department");
//                    }
        	 jLabel1.setText("Patient ID");

             jLabel2.setText("Appointment Date");
                        String p_id = id.getText();
                        int pid=Integer.parseInt(p_id);
                        String a_date = name.getText();
                        String query="insert into appointment values('"+pid+"','"+d_id+"','"+a_date+"')";
//                        String query2="update dep set no_avl=no_avl+1,no_emp=no_emp+1 where dept_id='"+e_dept+"'";
//                        System.out.println(query2);
                        System.out.println(query);
                        
                        try{
                            //step1 load the driver class  
                            Class.forName("oracle.jdbc.driver.OracleDriver");  
  
                            //step2 create  the connection object  
                            Connection con=DriverManager.getConnection(  
                            "jdbc:oracle:thin:@localhost:1521:xe","system","awesome12");  

                            //step3 create the statement object  
                            Statement stmt=con.createStatement();  

                            //step4 execute query
                            ResultSet rs = stmt.executeQuery(query);
           
//                            rs = stmt.executeQuery(query2);
                            
                            JOptionPane.showMessageDialog(this,"Records successfully inserted");
                            
                            name.setText("");
                            id.setText("");                     
                            con.close();  
                             
                        }
                         catch(SQLException e)
                         {
                            JOptionPane.showMessageDialog(this,e.getMessage().toString());
                         }  
                        catch(Exception e)
                        {
                            JOptionPane.showMessageDialog(this,"Error");
                        }   
                }
        else{
            JOptionPane.showMessageDialog(this,"Fill all the fields");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bb1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Doctor_option ob  = new Doctor_option(cust_id,branch_id);
        ob.setVisible(true);
    }//GEN-LAST:event_bb1ActionPerformed

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
            java.util.logging.Logger.getLogger(Create_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_app().setVisible(true);
            }
        });
    }
    private javax.swing.JButton bb1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}
