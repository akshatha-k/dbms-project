
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;


public class Blood_Bank extends javax.swing.JFrame {
String doc_id;
String d_dept;
    public Blood_Bank() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public Blood_Bank(String d_id,String d_dep)
    {
        initComponents();
        doc_id=d_id;
        d_dept=d_dep;
        this.setLocationRelativeTo(null);
    }

    private void initComponents() {

        bb = new javax.swing.JButton();
        bb.setText("Donate/Withdraw");
        jLabel1 = new javax.swing.JLabel();
        bb3 = new javax.swing.JButton();
        bb2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        bb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Select your operation");

        bb3.setText("View Blood Bank");
        bb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb3ActionPerformed(evt);
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
        					.addComponent(bb3)
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
        				.addComponent(bb3)
        				.addComponent(bb))
        			.addGap(91))
        );
        getContentPane().setLayout(layout);

        pack(); 
    }

    private void bbActionPerformed(java.awt.event.ActionEvent evt) {
                this.setVisible(false);
                 new Add_Blood(doc_id,d_dept).setVisible(true);      
    }

    private void bb3ActionPerformed(java.awt.event.ActionEvent evt) {
       this.setVisible(false);
        View_blood ob2 = new View_blood(doc_id,d_dept);
        ob2.setVisible(true);
    }

    private void bb2ActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(Blood_Bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Blood_Bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Blood_Bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Blood_Bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Blood_Bank().setVisible(true);
            }
        });
    }


    private javax.swing.JButton bb2;
    private javax.swing.JButton bb3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton bb;
}
