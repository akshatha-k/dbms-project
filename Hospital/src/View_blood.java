
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;

public class View_blood extends javax.swing.JFrame {
	String cust_id;
	String branch_id;
    public View_blood() {
        initComponents();
          this.setLocationRelativeTo(null);
    }
    public View_blood(String c_id,String b_id)
    {
        initComponents();
        cust_id=c_id;
        branch_id=b_id;
        this.setLocationRelativeTo(null);
    }

    private void initComponents() {
        quan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        bb1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        quan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jLabel1.setText("Total Quantity:");

        jLabel8.setText("View Blood Bank");

        jLabel9.setText("Enter which blood group to check");

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
        quan.setEditable(false);
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"A+", "B+", "AB+", "O+", "A-", "B-", "AB-", "O-", "Other"}));
        
        JLabel label = new JLabel();
        label.setText("Blood Group");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(20)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        						.addComponent(quan, GroupLayout.PREFERRED_SIZE, 348, GroupLayout.PREFERRED_SIZE)
        						.addComponent(label, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
        						.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        							.addComponent(jLabel9)
        							.addGroup(layout.createSequentialGroup()
        								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
        								.addGap(47)
        								.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)))))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(bb1)
        					.addGap(100)
        					.addComponent(jLabel8)))
        			.addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(35)
        					.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(14)
        					.addComponent(bb1)))
        			.addGap(18)
        			.addComponent(jLabel9)
        			.addGap(93)
        			.addComponent(label)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton1))
        			.addGap(18)
        			.addComponent(jLabel1)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(quan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(23, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void idActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        				String b_g=comboBox.getSelectedItem().toString();
        				quan.setText("");       
        				String query = "select sum(amount) from blood_bank where blood_group='"+b_g+"'";
                        try{
                            Class.forName("oracle.jdbc.driver.OracleDriver");  
                            Connection con=DriverManager.getConnection(  
                            "jdbc:oracle:thin:@localhost:1521:xe","system","awesome12");  
  
                            Statement stmt=con.createStatement();  

                            ResultSet rs = stmt.executeQuery(query);
                            while(rs.next())
                            {
                            	if(rs.getString(1)==null)
                            		quan.setText("0ml");
                            	else
                            		quan.setText(rs.getString(1).concat("ml"));
                            }             
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

    private void bb1ActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        Blood_Bank ob  = new Blood_Bank(cust_id,branch_id);
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
            java.util.logging.Logger.getLogger(View_blood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_blood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_blood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_blood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_blood().setVisible(true);
            }
        });
    }
    private javax.swing.JButton bb1;
    private javax.swing.JTextField quan;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
}
