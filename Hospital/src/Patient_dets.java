
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Patient_dets extends javax.swing.JFrame {
	int p_id;
    String compID;
    String brID;

    public Patient_dets() {
        initComponents();
        displayEmps();
        this.setLocationRelativeTo(null);
    }
    
    public Patient_dets(String c,String b) 
    {
        initComponents();
        compID = c;
        p_id=Integer.parseInt(compID);
        brID = b;
        displayEmps();
        this.setLocationRelativeTo(null);
    }

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ta1.setEditable(false);
        ta1.setColumns(20);
        ta1.setRows(5);
        jScrollPane1.setViewportView(ta1);

        jButton1.setText("<-- Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
       int n = JOptionPane.showConfirmDialog(this,"You will have to re-enter your login credentials","Do you want to proceed to the homepage ?",JOptionPane.YES_NO_OPTION);
       if(n==0)
       {
            this.setVisible(false);
            Patient_login ob  = new Patient_login();
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
            java.util.logging.Logger.getLogger(Patient_dets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient_dets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient_dets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient_dets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient_dets().setVisible(true);
            }
        });
        
    }
    
   public void displayEmps()
    {
      ta1.setText("");
      String query = "select pid,pat_name,dob,gender,email,phno,address,blood_group from patient where pid='"+p_id+"' ";
      System.out.println(query);
        
      try
       {
     Class.forName("oracle.jdbc.driver.OracleDriver");  
  
    Connection con=DriverManager.getConnection(  
    "jdbc:oracle:thin:@localhost:1521:xe","system","awesome12");  
    Statement stmt=con.createStatement();  
    ResultSet os=stmt.executeQuery(query); 
  
    ResultSetMetaData rsMetaData = os.getMetaData();
    String col_list= " ";
    int col = rsMetaData.getColumnCount();
    for(int i=1; i<col+1;i++)
    {
        String col_Name = rsMetaData.getColumnName(i);
        col_list+="              "+col_Name;
    } 
    ta1.append(col_list);
    
    while(os.next())
    {
        String temp = "";
      
        System.out.print(temp);
        for(int j=1;j<col+1;j++)
        {   
            temp += "            || " + os.getString(j);
        }
        ta1.append("\n");
        ta1.append(temp);

    }

    con.close();  
       }
        
         catch(SQLException e)
         {
    JOptionPane.showMessageDialog(this,"Enter a valid sql command"+e.toString());
         }  
       catch (Exception e)
       {
           JOptionPane.showMessageDialog(this," "+e.toString());
       }
    
    }
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ta1;
}
