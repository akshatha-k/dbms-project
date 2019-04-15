
import java.util.Arrays;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Admin_login extends javax.swing.JFrame {
    public Admin_login() {
        initComponents();
          this.setLocationRelativeTo(null);

    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        pwd = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Admin Login");

        jLabel2.setText("Enter your username:");

        jLabel3.setText("Enter your password:");

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lb2.setForeground(new java.awt.Color(255, 0, 0));

        lb3.setForeground(new java.awt.Color(255, 0, 0));

        jButton2.setText("<-- Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(165, Short.MAX_VALUE)
        			.addComponent(jLabel1)
        			.addGap(165))
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(46)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel3)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(jLabel2)
        								.addComponent(tf1, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
        								.addComponent(pwd))
        							.addGap(18)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(lb2, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
        								.addComponent(lb3, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)))))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jButton2)))
        			.addContainerGap(51, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(173, Short.MAX_VALUE)
        			.addComponent(jButton1)
        			.addGap(164))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(12)
        			.addComponent(jButton2)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel1)
        			.addGap(35)
        			.addComponent(jLabel2)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(tf1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lb3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addComponent(jLabel3)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(pwd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lb2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        			.addGap(29)
        			.addComponent(jButton1)
        			.addContainerGap(55, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String username="admin";
        char[] password = pwd.getPassword();
        char[] correctPass = new char[] {'s', 'e', 'c', 'r', 'e', 't'};
 
        if ( Arrays.equals(password, correctPass)&&username.equals(tf1.getText())) {
        	lb2.setText("");
        	Admin_option ob = new Admin_option();
        	pwd.setText("");
        	tf1.setText("");
        	ob.setVisible(true);
        	this.setVisible(false);
    
        } 
        else if(username.equals(tf1.getText())) {
        	lb2.setText("*Incorrect password");
        	pwd.setText("");
        	lb3.setText("");
        }
        else 
        {
        	lb3.setText("*Invalid username");
        	pwd.setText("");
        	tf1.setText("");
        }	
    }


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
         this.setVisible(false);
         new Login().setVisible(true);
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
            java.util.logging.Logger.getLogger(Admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_login().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JTextField tf1;
}
