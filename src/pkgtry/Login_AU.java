
package pkgtry;

import java.awt.Cursor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Login_AU extends javax.swing.JFrame {
    private Cursor cur;
    public Login_AU() {
        initComponents();
        func();
        
    }
    public final void func()
    {
        cur = new Cursor(Cursor.HAND_CURSOR);
        jComboBox1.setCursor(cur);
        jButton1.setCursor(cur);
        jButton2.setCursor(cur);
        jButton3.setCursor(cur);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf = new javax.swing.JTextField();
        pf = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        chk = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 64)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("  Login");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 238, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, -1, -1));

        tf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 300, -1));

        pf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(pf, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 300, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 561, 121, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setText("   Forgot Password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 561, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgtry/image/Screenshot (100).png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 10, 110, 40));

        chk.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        chk.setForeground(new java.awt.Color(255, 255, 255));
        chk.setText("Show password");
        chk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkActionPerformed(evt);
            }
        });
        getContentPane().add(chk, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgtry/jav.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int a=JOptionPane.showConfirmDialog(null, "Do you really want to close the application?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            Welcome wel =new Welcome();
            wel.setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String str=(String)jComboBox1.getSelectedItem();
        if(str.equals("Admin"))
        {
            if(tf.getText().isEmpty() & String.valueOf(pf.getPassword()).isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Please enter username and password");
                }
                else if(tf.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Please enter username");
                    
                }
                else if(String.valueOf(pf.getPassword()).isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Please enter password");
                    
                }
                else if(tf.getText().equals("Dola") && pf.getText().equals("pass123"))
                {
                    int a=JOptionPane.showConfirmDialog(null,"Login successful", "Login",JOptionPane.DEFAULT_OPTION);
                    if(a==JOptionPane.OK_OPTION)
                    {
                        Admin_pg admin=new Admin_pg();
                        admin.setVisible(true);
                        dispose();
                        
                    }
                    
                }
                
                else 
                {
                JOptionPane.showMessageDialog(null, "Wrong information");
                }
                
               
            
            
        }
        else
        {
            
            String st="select *from customer1 where Name=? and Password=?";
            
            try
            {
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost/signup","root","passData123");
                PreparedStatement pst=con.prepareStatement(st);
                pst.setString(1,tf.getText());
                pst.setString(2,pf.getText());
                ResultSet rs=pst.executeQuery();
                if(rs.next())
                {
                    int a=JOptionPane.showConfirmDialog(null,"Login successful", "Login",JOptionPane.DEFAULT_OPTION);
                    if(a==JOptionPane.OK_OPTION)
                    {
                        dispose();
                        User_dash1 data =new User_dash1();
                        data.dash(tf.getText());
                        data.setVisible(true);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Information doesn't match");
                    
                }
            }
                
            catch(Exception e)
            {
                    System.out.print("ERROR OCCURED"+e);
            }
                
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                dispose();
                Forgot obj2 =new Forgot();
                obj2.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void chkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkActionPerformed
        if(chk.isSelected())
            {
                pf.setEchoChar((char)0);
            }
            else
            {
                pf.setEchoChar('*');
            }
    }//GEN-LAST:event_chkActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login_AU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_AU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_AU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_AU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_AU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chk;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField pf;
    private javax.swing.JTextField tf;
    // End of variables declaration//GEN-END:variables
}
