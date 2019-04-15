
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.DefaultComboBoxModel;

public class Admin_pat extends javax.swing.JFrame {

    public Admin_pat() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        ph_no = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        DOB = new javax.swing.JTextField();
        bb1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID");

        jLabel2.setText("Name");

        jLabel3.setText("Email");

        jLabel4.setText("Phone number");

        jLabel5.setText("Address");

        jLabel6.setText("Blood Group");

        jLabel7.setText("Gender");

        cb1.setModel(new DefaultComboBoxModel(new String[] {"A+", "B+", "AB+", "O+", "A-", "B-", "AB-", "O-", "Other"}));

        buttonGroup1.add(rb1);
        rb1.setText("Male");

        buttonGroup1.add(rb2);
        rb2.setText("Female");

        buttonGroup1.add(rb3);
        rb3.setText("Other");

        jLabel8.setText("New Patient details");

        jLabel9.setText("Fill the fields given below (All fields are mandatory)");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setText("Date of birth (DD-MON-YYYY) ");

        DOB.setToolTipText("Eg. 01-DEC-1998");

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
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(22)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel1)
        								.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        									.addComponent(id)
        									.addComponent(ph_no, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE))
        								.addComponent(jLabel4)
        								.addComponent(jLabel5)
        								.addComponent(address, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabel7)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(rb1, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
        									.addGap(18)
        									.addComponent(rb2)
        									.addGap(15)
        									.addComponent(rb3, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)))
        							.addGap(97))
        						.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
        							.addGap(26)))
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel3)
        						.addComponent(jLabel6)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        								.addComponent(DOB, Alignment.LEADING)
        								.addComponent(cb1, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(email, Alignment.LEADING)
        								.addComponent(name, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        								.addComponent(jLabel2, Alignment.LEADING)
        								.addComponent(jLabel12, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))
        							.addGap(46))))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(bb1)
        					.addGap(136)
        					.addComponent(jLabel8))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(128)
        					.addComponent(jLabel9)))
        			.addContainerGap(6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
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
        				.addComponent(jLabel3))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(ph_no, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(jLabel6))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(address, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(cb1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel7)
        				.addComponent(jLabel12))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(rb1)
        						.addComponent(rb2)
        						.addComponent(rb3))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jButton1))
        				.addComponent(DOB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(31))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if(!((name.getText()).equals(""))&&!(DOB.getText().equals(""))&&!((ph_no.getText()).equals(""))&&!((address.getText()).equals(""))&&!((id.getText()).equals(""))&&!((email.getText()).equals("")))
                {
                    if(cb1.getSelectedItem().toString().equals("<None>"))
                    {
                        JOptionPane.showMessageDialog(this,"Select a department");
                    }
                    else if(!(rb1.isSelected())&&!(rb2.isSelected())&&!(rb3.isSelected()))
                    {
                        JOptionPane.showMessageDialog(this,"Select highest level of education");
                    }
                    else
                    {   
                    	String p_name = name.getText();
                        String p_id = id.getText();
                        int pid=Integer.parseInt(p_id);
                        String p_email=email.getText();
                        String p_ph = ph_no.getText();
                        String p_address=address.getText();
                        String p_bg=cb1.getSelectedItem().toString();
                        String p_dob=DOB.getText();
                        String p_hdeg= rb1.isSelected()?"M":rb2.isSelected()?"F":"O";
                        String query="insert into patient values('"+pid+"','"+p_name+"','"+p_dob+"','"+p_hdeg+"','"+p_email+"','"+p_ph+"','"+p_address+"','"+p_bg+"')";
                        System.out.println(query);
                        
                        try{
                            Class.forName("oracle.jdbc.driver.OracleDriver");  
                            Connection con=DriverManager.getConnection(  
                            "jdbc:oracle:thin:@localhost:1521:xe","system","awesome12");   
                            Statement stmt=con.createStatement();  
                            ResultSet rs = stmt.executeQuery(query);
                            
                            JOptionPane.showMessageDialog(this,"Records successfully inserted");
                            
                            name.setText("");
                            id.setText("");
                            DOB.setText("");
                            email.setText("");
                            cb1.setSelectedIndex(0);
                            rb1.isSelected();
                            ph_no.setText("");
                            address.setText("");
                            
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
    }

    private void bb1ActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        Admin_option ob  = new Admin_option();
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
            java.util.logging.Logger.getLogger(Admin_pat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_pat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_pat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_pat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_pat().setVisible(true);
            }
        });
    }

    private javax.swing.JTextField DOB;
    private javax.swing.JTextField address;
    private javax.swing.JButton bb1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JTextField email;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField name;
    private javax.swing.JTextField ph_no;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
}
