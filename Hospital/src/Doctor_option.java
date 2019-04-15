
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;


public class Doctor_option extends javax.swing.JFrame {
String doc_id;
String d_dept;
    public Doctor_option() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public Doctor_option(String d_id,String d_dep)
    {
        initComponents();
        doc_id=d_id;
        d_dept=d_dep;
        this.setLocationRelativeTo(null);
    }
    
    private void initComponents() {

        bb = new javax.swing.JButton();
        bb.setText("Check Blood Bank");
        jLabel1 = new javax.swing.JLabel();
        app = new javax.swing.JButton();
        bb2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        bb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jLabel1.setText("Select your operation");

        app.setText("Create Appointment");
        app.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appActionPerformed(evt);
            }
        });

        bb2.setText("<-- Back");
        bb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(91)
        					.addComponent(app)
        					.addGap(38)
        					.addComponent(bb))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(bb2)
        					.addGap(72)
        					.addComponent(jLabel1)))
        			.addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(bb2))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(31)
        					.addComponent(jLabel1)))
        			.addPreferredGap(ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(app)
        				.addComponent(bb))
        			.addGap(91))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void bbActionPerformed(java.awt.event.ActionEvent evt) {
                this.setVisible(false);
                 new Blood_Bank(doc_id,d_dept).setVisible(true);       
    }

    private void appActionPerformed(java.awt.event.ActionEvent evt) {
       this.setVisible(false);
        Create_app ob2 = new Create_app(doc_id,d_dept);
        ob2.setVisible(true);
    }

    private void bb2ActionPerformed(java.awt.event.ActionEvent evt) {
        int n = JOptionPane.showConfirmDialog(this,"You will have to re-enter your login credentials","Do you want to proceed to the homepage ?",JOptionPane.YES_NO_OPTION);
        if(n==0)
        {
            this.setVisible(false);
            Doctor_login ob  = new Doctor_login();
            ob.setVisible(true);
        }

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
            java.util.logging.Logger.getLogger(Doctor_option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor_option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor_option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor_option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor_option().setVisible(true);
            }
        });
    }

    private javax.swing.JButton bb2;
    private javax.swing.JButton app;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton bb;
}
