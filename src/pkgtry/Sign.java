
package pkgtry;
import java.sql.*;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Sign extends javax.swing.JFrame {
    private Container c;
    private JButton bt,bt1,bt2;
    private Font f2;
    private Cursor cur;

    public Sign() {
        initComponents();
        func();
    }
    public final void func()
    {
        cur = new Cursor(Cursor.HAND_CURSOR);
        jButton2.setCursor(cur);
        jButton3.setCursor(cur);
        jButton4.setCursor(cur);
        
        
    }
    
    public boolean chkdup()
    {
        String name =tf1.getText();
        boolean isexist= false;
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/signup","root","passData123");
            PreparedStatement ps= con.prepareStatement("select *from customer1 where Name=?");
            ps.setString(1,tf1.getText());
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
              isexist=true;  
            }
            else
            {
                isexist=false;
            }
            
        } catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);
            
        }
        return isexist;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pf = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        chk = new javax.swing.JCheckBox();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        tf1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Sign Up");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mobile No");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date of Birth");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, -1, -1));

        tf3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tf3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf3KeyTyped(evt);
            }
        });
        getContentPane().add(tf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 350, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, -1, -1));

        pf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(pf, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, 350, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gender");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 492, -1, 40));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgtry/Back.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setText("Sign Up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 640, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton3.setText("Login");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 640, 110, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 640, 90, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        chk.setBackground(new java.awt.Color(255, 255, 255));
        chk.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chk.setText("Show Password");
        chk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkActionPerformed(evt);
            }
        });
        getContentPane().add(chk, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 590, 130, 30));

        jDateChooser1.setDateFormatString("dd-MM-yyyy");
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 442, 350, 30));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, 170, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ID");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        tf2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tf2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf2KeyTyped(evt);
            }
        });
        getContentPane().add(tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 350, -1));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 350, -1));

        tf1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf1KeyTyped(evt);
            }
        });
        getContentPane().add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 350, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgtry/jav.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String id=tf2.getText();
        String name=tf1.getText();
        String email=tf2.getText();
        String mobile=tf3.getText();
        String dob=jDateChooser1.getCalendar().getTime().toString();
        String combo= jComboBox1.getSelectedItem().toString();
        String pass=pf.getText();
        
        
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/signup","root","passData123");
            PreparedStatement pst=con.prepareStatement("insert into signup.customer1 values(?,?,?,?,?,?,?)");
            //int z=1;
            pst.setString(1,jTextField2.getText());
            pst.setString(2, tf1.getText());
            pst.setString(3, tf2.getText());
            pst.setString(4, tf3.getText());
            pst.setString(5, pf.getText());
            pst.setString(6, jDateChooser1.getCalendar().getTime().toString());
            pst.setString(7, jComboBox1.getSelectedItem().toString());
            
            pst.execute();
            System.out.println("Record Inserted Succesfully ");
            pst.close();
            con.close();
            
        }catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);
        }
        int a;
        if(id.trim().isEmpty() || name.trim().isEmpty() || email.trim().isEmpty() || mobile.trim().isEmpty() || dob.trim().isEmpty() || combo.trim().isEmpty() ||pass.trim().isEmpty())
        {
            
           JOptionPane.showConfirmDialog(null,"Please enter all information", "Info",JOptionPane.DEFAULT_OPTION);
        }
        else
        {
        
            
            a=JOptionPane.showConfirmDialog(null,"Account has created successfully", "Sign_Up",JOptionPane.DEFAULT_OPTION);
            if(a==JOptionPane.OK_OPTION)
            {
                Login_AU obj =new Login_AU();
                obj.setVisible(true);
                dispose();
           }
        }
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                Login_AU obj =new Login_AU();
                obj.setVisible(true);
                dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int a=JOptionPane.showConfirmDialog(null," Do you want to exit ?", "Yes or No",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            dispose();
            Welcome wel =new Welcome();
            wel.setVisible(true);
        
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        Welcome go =new Welcome();
        go.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void tf3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf3KeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar()))
        {
            evt.consume();
            
        }
    }//GEN-LAST:event_tf3KeyTyped

    private void tf2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf2KeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tf2KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2KeyTyped

    private void tf1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1KeyTyped

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
            java.util.logging.Logger.getLogger(Sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Sign().setVisible(true);
                new Sign().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chk;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPasswordField pf;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    // End of variables declaration//GEN-END:variables
}
