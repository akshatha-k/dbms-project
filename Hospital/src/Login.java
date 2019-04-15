import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.GroupLayout;

public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
          this.setLocationRelativeTo(null);
    }
    private void initComponents() {

        b_admin = new javax.swing.JButton();
        b_admin.setAction(action);
        b_doc = new javax.swing.JButton();
        b_pat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b_admin.setText("Adminstrator");
        b_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_adminActionPerformed(evt);
            }
        });
        
        b_doc.setText("Doctor");
        b_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_docActionPerformed(evt);
            }
        });

        b_pat.setText("Patient");
        b_pat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_patActionPerformed(evt);
            }
        });

        jLabel1.setText("Login Page");

        jLabel2.setText("Select your login type ");
        
      

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(69)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        						.addPreferredGap(ComponentPlacement.RELATED)
            					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
            						.addComponent(jLabel2)
            						.addGroup(layout.createSequentialGroup()
            							.addComponent(b_admin)
            							.addGap(18)
            							.addComponent(b_doc, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)))
        					.addGap(18)
        					.addComponent(b_pat, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(121)
        					.addComponent(jLabel1)))
        			.addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(76)
        			.addComponent(jLabel1)
        			.addGap(72)
        			.addComponent(jLabel2)
        			.addPreferredGap(ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(b_admin)
        				.addComponent(b_doc)
        				.addComponent(b_pat))
        			.addGap(71))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void b_adminActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        Admin_login ob1 = new Admin_login();
        ob1.setVisible(true);
    }
    
    private void b_patActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        Patient_login ob = new Patient_login();
        ob.setVisible(true);
    }

    private void b_docActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        Doctor_login ob2 = new Doctor_login();
        ob2.setVisible(true);
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    private javax.swing.JButton b_admin;
    private javax.swing.JButton b_doc;
    private javax.swing.JButton b_pat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private final Action action = new SwingAction();
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Hospital");
			putValue(SHORT_DESCRIPTION, "A new tomorrow, that starts today");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
