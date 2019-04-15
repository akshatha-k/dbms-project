
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aditcam
 */
public class Admin_doc extends javax.swing.JFrame {

    /**
     * Creates new form Admin_pat
     */
    public Admin_doc() {
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
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        ph_no = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        dno = new javax.swing.JTextField();
        bb1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("Name");

        jLabel4.setText("Phone number");

        jLabel5.setText("Address");

        jLabel7.setText("Gender");

        buttonGroup1.add(rb1);
        rb1.setText("Male");

        buttonGroup1.add(rb2);
        rb2.setText("Female");

        buttonGroup1.add(rb3);
        rb3.setText("Other");

        jLabel8.setText("New doctor details");

        jLabel9.setText("Fill the fields given below (All fields are mandatory)");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setText("Department");

        dno.setToolTipText("Eg. 01-DEC-1998");

        bb1.setText("<-- Back");
        bb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb1ActionPerformed(evt);
            }
        });
        
        email = new JTextField();
        email.setColumns(10);
        
        lblEmail = new JLabel("Email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap(21, Short.MAX_VALUE)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel1)
        						.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        							.addComponent(id)
        							.addComponent(ph_no, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE))
        						.addComponent(jLabel4)
        						.addComponent(jLabel5)
        						.addComponent(address, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE))
        					.addGap(97)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        							.addComponent(email)
        							.addComponent(dno)
        							.addComponent(name, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        							.addComponent(jLabel2)
        							.addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))
        						.addComponent(lblEmail))
        					.addGap(46))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(bb1)
        					.addGap(136)
        					.addComponent(jLabel8))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(128)
        					.addComponent(jLabel9))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(237)
        					.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(107)
        					.addComponent(jLabel7)
        					.addGap(18)
        					.addComponent(rb1, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(rb2)
        					.addGap(15)
        					.addComponent(rb3, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(bb1)
        				.addComponent(jLabel8))
        			.addGap(18)
        			.addComponent(jLabel9)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 11, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(id, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4)
        				.addComponent(jLabel12))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(ph_no, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(dno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(lblEmail))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(address, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(39)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(rb1)
        				.addComponent(rb2)
        				.addComponent(rb3)
        				.addComponent(jLabel7))
        			.addPreferredGap(ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
        			.addComponent(jButton1)
        			.addGap(32))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(!((name.getText()).equals(""))&&!(dno.getText().equals(""))&&!((ph_no.getText()).equals(""))&&!((address.getText()).equals(""))&&!((id.getText()).equals("")))
                {
//                    if(cb1.getSelectedItem().toString().equals("<None>"))
//                    {
//                        JOptionPane.showMessageDialog(this,"Select a department");
//                    }
                   if(!(rb1.isSelected())&&!(rb2.isSelected())&&!(rb3.isSelected()))
                    {
                        JOptionPane.showMessageDialog(this,"Select highest level of education");
                    }
                    else
                    {   
                        String d_name = name.getText();
                        String d_id = id.getText();
                        int did=Integer.parseInt(d_id);
                        String d_ph = ph_no.getText();
                        int dph=Integer.parseInt(d_ph);
                        String d_dept=dno.getText();
                        int ddno=Integer.parseInt(d_dept);
                        String d_address=address.getText();
                        String d_email=lblEmail.getText();
                        String d_hdeg= rb1.isSelected()?"M":rb2.isSelected()?"F":"O";
                        String query="insert into doctor values('"+did+"','"+ddno+"','"+d_name+"','"+d_address+"','"+d_email+"','"+d_hdeg+"','"+dph+"')";
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
                            dno.setText("");
                            ph_no.setText("");
                            address.setText("");
                            lblEmail.setText("");
                            
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
                }
        else{
            JOptionPane.showMessageDialog(this,"Fill all the fields");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bb1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Admin_option ob  = new Admin_option();
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
            java.util.logging.Logger.getLogger(Admin_doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_doc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dno;
    private javax.swing.JTextField address;
    private javax.swing.JButton bb1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField name;
    private javax.swing.JTextField ph_no;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private JTextField email;
    private JLabel lblEmail;
}
