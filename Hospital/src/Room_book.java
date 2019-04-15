
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Room_book extends javax.swing.JFrame {

    public Room_book() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        id = new javax.swing.JTextField();
        roomno = new javax.swing.JTextField();
        in_date = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        out_date = new javax.swing.JTextField();
        bb1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Patient ID");

        jLabel2.setText("Room No.");

        jLabel4.setText("In date");

        jLabel8.setText("Room Booking");

        jLabel9.setText("Fill the fields given below (All fields are mandatory)");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setText("Out Date");

        out_date.setToolTipText("Eg. 01-DEC-1998");

        bb1.setText("<-- Back");
        bb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap(12, Short.MAX_VALUE)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(21)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(jLabel4)
        								.addComponent(jLabel1)
        								.addComponent(id, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        								.addComponent(in_date))
        							.addGap(110)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(out_date)
        								.addComponent(roomno)
        								.addComponent(jLabel2)
        								.addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)))
        						.addGroup(layout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(bb1)
        							.addGap(99)
        							.addComponent(jLabel8))))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(189)
        					.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(105, Short.MAX_VALUE)
        			.addComponent(jLabel9)
        			.addGap(61))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(bb1)
        				.addComponent(jLabel8))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel9)
        			.addGap(42)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 11, GroupLayout.PREFERRED_SIZE)
        					.addGap(18))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel1)
        					.addPreferredGap(ComponentPlacement.UNRELATED)))
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(id, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(55))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(roomno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel4)
        						.addComponent(jLabel12))
        					.addPreferredGap(ComponentPlacement.UNRELATED)))
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(in_date, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(out_date, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(49)
        			.addComponent(jButton1)
        			.addContainerGap(98, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if(!((roomno.getText()).equals(""))&&!(out_date.getText().equals(""))&&!((in_date.getText()).equals(""))&&!((id.getText()).equals("")))
                {
        				String p_id = id.getText();
            			int pid=Integer.parseInt(p_id);
            			String p_rno = roomno.getText();
            			int rno=Integer.parseInt(p_rno);
                        String ind=in_date.getText();
                        String outd=out_date.getText();
                        String query="insert into booking values('"+p_id+"','"+rno+"','"+ind+"','"+outd+"')";
                        System.out.println(query);
                        
                        try{
                            Class.forName("oracle.jdbc.driver.OracleDriver");  
                            Connection con=DriverManager.getConnection(  
                            "jdbc:oracle:thin:@localhost:1521:xe","system","awesome12");  
                            Statement stmt=con.createStatement();  
                            ResultSet rs = stmt.executeQuery(query);
                            JOptionPane.showMessageDialog(this,"Records successfully inserted");
                            
                            roomno.setText("");
                            id.setText("");
                            out_date.setText("");
                            in_date.setText("");                          
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
            java.util.logging.Logger.getLogger(Room_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Room_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Room_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Room_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Room_book().setVisible(true);
            }
        });
    }

    private javax.swing.JTextField out_date;
    private javax.swing.JButton bb1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField roomno;
    private javax.swing.JTextField in_date;
}
