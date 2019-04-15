
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Create_app extends javax.swing.JFrame {
	int d_id;
	String doc_id;
	String d_dept;
	
    public Create_app() {
        initComponents();
          this.setLocationRelativeTo(null);
    }
    public Create_app(String d_id1,String d_dep)
    {
        initComponents();
        doc_id=d_id1;
        d_id=Integer.parseInt(d_id1);
        d_dept=d_dep;
        this.setLocationRelativeTo(null);
    }
    
    private void initComponents() {
        id = new javax.swing.JTextField();
        appoint = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        bb1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        						.addComponent(appoint, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
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
        				.addComponent(appoint, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(42)
        			.addComponent(jButton1)
        			.addContainerGap(98, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if(!((appoint.getText()).equals(""))&&!((id.getText()).equals("")))
                {
        	 jLabel1.setText("Patient ID");

             jLabel2.setText("Appointment Date");
                        String p_id = id.getText();
                        int pid=Integer.parseInt(p_id);
                        String a_date = appoint.getText();
                        String query="insert into appointment values('"+pid+"','"+d_id+"','"+a_date+"')";
                        System.out.println(query);
                        
                        try{ 
                            Class.forName("oracle.jdbc.driver.OracleDriver");   
                            Connection con=DriverManager.getConnection(  
                            "jdbc:oracle:thin:@localhost:1521:xe","system","awesome12");  
                            Statement stmt=con.createStatement();  
                            ResultSet rs = stmt.executeQuery(query);
                            
                            JOptionPane.showMessageDialog(this,"Records successfully inserted");
                            
                            appoint.setText("");
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
    }

    private void bb1ActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        Doctor_option ob  = new Doctor_option(doc_id,d_dept);
        ob.setVisible(true);
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
            java.util.logging.Logger.getLogger(Create_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_app().setVisible(true);
            }
        });
    }
    private javax.swing.JButton bb1;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField appoint;
}
