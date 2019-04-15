
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import java.awt.Font;

public class Patient_login extends javax.swing.JFrame {

    public Patient_login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jLabel1.setText("ID:");

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
        jButton2.setText("<--Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jLabel2.setText("Phone No:");
        
        JLabel lblPatientLogin = new JLabel();
        lblPatientLogin.setText("Patient Login");
        lblPatientLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(40)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jButton1)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel2)
        								.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        							.addGap(29)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(tf2)
        								.addComponent(tf1, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)))))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jButton2)
        					.addGap(60)
        					.addComponent(lblPatientLogin, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jButton2))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(25)
        					.addComponent(lblPatientLogin, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
        			.addGap(36)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
        				.addComponent(tf1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tf2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel2))
        			.addGap(61)
        			.addComponent(jButton1)
        			.addContainerGap(100, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
         this.setVisible(false);
         new Login().setVisible(true);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String e_id = tf1.getText();
        String pno = tf2.getText();
        String query = "select pid from patient where pid='"+e_id+"' and phno='"+pno+"'";
        try{  
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","system","awesome12");  

Statement stmt=con.createStatement();  

ResultSet rs=stmt.executeQuery(query);  
if(!rs.next())
{
    JOptionPane.showMessageDialog(this,"Please enter valid details");
    tf1.setText("");
    tf2.setText("");
}
else
{
    this.setVisible(false);   
    Patient_dets ob = new Patient_dets(tf1.getText(),tf2.getText());
    ob.setVisible(true); 
}   

con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  

        
             
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Patient_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient_login().setVisible(true);
            }
        });
    
}
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
}
