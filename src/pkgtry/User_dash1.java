
package pkgtry;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class User_dash1 extends javax.swing.JFrame {
    private Font f;
    public User_dash1() {
        initComponents();
        func();
        menutable();
        menutable1();
        menutable2();
        menutable3();
        menutable4();
        
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(250);
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(250);
        jTable3.getColumnModel().getColumn(0).setPreferredWidth(250);
        jTable4.getColumnModel().getColumn(0).setPreferredWidth(250);
        jTable5.getColumnModel().getColumn(0).setPreferredWidth(250);
    }
    private void menutable3()
        {
        String str="select * from menu3 order by Category";
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/signup","root","passData123");
            PreparedStatement pst=con.prepareStatement(str);
            ResultSet rs=pst.executeQuery();
            
            while(rs.next())
            {
                String item_name=rs.getString("Item_name");
                String cate=rs.getString("Category");
                String price =String.valueOf(rs.getInt("Price"));
               
                String data[]={item_name,cate,price};
                DefaultTableModel table3=(DefaultTableModel)jTable4.getModel();
                table3.addRow(data);
                
                
            }
        }
        catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);
        }  
    }  
     private void menutable4()
        {
        String str="select * from menu4 order by Category";
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/signup","root","passData123");
            PreparedStatement pst=con.prepareStatement(str);
            ResultSet rs=pst.executeQuery();
            
            while(rs.next())
            {
                String item_name=rs.getString("Item_name");
                String cate=rs.getString("Category");
                String price =String.valueOf(rs.getInt("Price"));
               
                String data[]={item_name,cate,price};
                DefaultTableModel table4=(DefaultTableModel)jTable5.getModel();
                table4.addRow(data);
                
                
            }
        }
        catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);
        }
    }   
    
     public void showData3(int d1,int d2)
    {
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/signup","root","passData123");
            PreparedStatement pst;
            String st="select * from menu3";
            
            if(d1<=15 || d2<=15)
            {
                pst=con.prepareStatement(st);
                
            }
            else
            {
                pst=con.prepareStatement("select * from menu3 WHERE Price Between ? And ? ");
                pst.setInt(1, d1);
                pst.setInt(2, d2);
            }
            ResultSet rs=pst.executeQuery();
            DefaultTableModel table3=(DefaultTableModel)jTable4.getModel();
            //Object[] row;
            while(rs.next())
            {
                
                String item_name=rs.getString("Item_name");
                String cate=rs.getString("Category");
                String price =String.valueOf(rs.getInt("Price"));
               
                String data[]={item_name,cate,price};
                //DefaultTableModel table=(DefaultTableModel)jTable1.getModel();
                table3.addRow(data);
            }
        }
        catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);
        }
    }
     
      public void showData4(int d1,int d2)
    {
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/signup","root","passData123");
            PreparedStatement pst;
            String st="select * from menu4";
            
            if(d1<=15 || d2<=15)
            {
                pst=con.prepareStatement(st);
                
            }
            else
            {
                pst=con.prepareStatement("select * from menu4 WHERE Price Between ? And ? ");
                pst.setInt(1, d1);
                pst.setInt(2, d2);
            }
            ResultSet rs=pst.executeQuery();
            DefaultTableModel table4=(DefaultTableModel)jTable5.getModel();
            //Object[] row;
            while(rs.next())
            {
                
                String item_name=rs.getString("Item_name");
                String cate=rs.getString("Category");
                String price =String.valueOf(rs.getInt("Price"));
               
                String data[]={item_name,cate,price};
                //DefaultTableModel table=(DefaultTableModel)jTable1.getModel();
                table4.addRow(data);
            }
        }
        catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);
        }
    }
    private void func()
    { 
        f= new Font("Arial",Font.ITALIC,24);
        JTableHeader head1=jTable1.getTableHeader();
        JTableHeader head2=jTable2.getTableHeader();
        JTableHeader head3=jTable3.getTableHeader();
        JTableHeader head4=jTable4.getTableHeader();
        JTableHeader head5=jTable5.getTableHeader();
        Color col=new Color(102,0,0);
        head1.setForeground(col);
        head1.setFont(f);
        head2.setForeground(col);
        head2.setFont(f);
        head3.setForeground(col);
        head3.setFont(f);
        head4.setForeground(col);
        head4.setFont(f);
        head5.setForeground(col);
        head5.setFont(f);
    }
    private void menutable1()
        {
        String str="select * from menu1 order by Category";
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/signup","root","passData123");
            PreparedStatement pst=con.prepareStatement(str);
            ResultSet rs=pst.executeQuery();
            
            while(rs.next())
            {
                String item_name=rs.getString("Item_name");
                String cate=rs.getString("Category");
                String price =String.valueOf(rs.getInt("Price"));
               
                String data[]={item_name,cate,price};
                DefaultTableModel table1=(DefaultTableModel)jTable2.getModel();
                table1.addRow(data);
                
                
            }
        }
        catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);
        }
        
        
    }
    private void menutable2()
        {
        String str="select * from menu2 order by Category";
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/signup","root","passData123");
            PreparedStatement pst=con.prepareStatement(str);
            ResultSet rs=pst.executeQuery();
            
            while(rs.next())
            {
                String item_name=rs.getString("Item_name");
                String cate=rs.getString("Category");
                String price =String.valueOf(rs.getInt("Price"));
               
                String data[]={item_name,cate,price};
                DefaultTableModel table2=(DefaultTableModel)jTable3.getModel();
                table2.addRow(data);
                
                
            }
        }
        catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);
        }
        
        
    }   
    public void showData(int d1,int d2)
    {
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/signup","root","passData123");
            PreparedStatement pst;
            
            if(d1<=15 || d2<=15)
            {
                pst=con.prepareStatement("select * from menu ");
                
            }
            else
            {
                pst=con.prepareStatement("select * from menu WHERE Price Between ? And ? ");
                pst.setInt(1, d1);
                pst.setInt(2, d2);
            }
            ResultSet rs=pst.executeQuery();
            DefaultTableModel table=(DefaultTableModel)jTable1.getModel();
            //Object[] row;
            while(rs.next())
            {
                
                String item_name=rs.getString("Item_name");
                String cate=rs.getString("Category");
                String price =String.valueOf(rs.getInt("Price"));
               
                String data[]={item_name,cate,price};
                //DefaultTableModel table=(DefaultTableModel)jTable1.getModel();
                table.addRow(data);
            }
        }
        catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);
        }
        
        
    }
    public void showCombo(String com)
    {
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/signup","root","passData123");
            PreparedStatement pst;
            String st="select * from menu";
            
            if(com.equals("None"))
            {
                pst=con.prepareStatement(st);
                
            }
            else
            {
                pst=con.prepareStatement("select * from menu WHERE Category=?");
                pst.setString(1, com);
                
            }
            ResultSet rs=pst.executeQuery();
            DefaultTableModel table=(DefaultTableModel)jTable1.getModel();
            //Object[] row;
            while(rs.next())
            {
                
                String item_name=rs.getString("Item_name");
                String cate=rs.getString("Category");
                String price =String.valueOf(rs.getInt("Price"));
               
                String data[]={item_name,cate,price};
                //DefaultTableModel table=(DefaultTableModel)jTable1.getModel();
                table.addRow(data);
            }
        }
        catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);
        }
    }
    private void menutable()
    {
        String st="select * from menu order by Category";
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/signup","root","passData123");
            PreparedStatement pst=con.prepareStatement(st);
            ResultSet rs=pst.executeQuery();
            
            while(rs.next())
            {
                String item_name=rs.getString("Item_name");
                String cate=rs.getString("Category");
                String price =String.valueOf(rs.getInt("Price"));
               
                String data[]={item_name,cate,price};
                DefaultTableModel table=(DefaultTableModel)jTable1.getModel();
                table.addRow(data);
                
                
            }
        }
        catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);
        }
    }
    
    public void showData1(int d1,int d2)
    {
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/signup","root","passData123");
            PreparedStatement pst;
            String st="select * from menu1 ";
            
            if(d1<=15 || d2<=15)
            {
                pst=con.prepareStatement(st);
                
            }
            else
            {
                pst=con.prepareStatement("select * from menu1 WHERE Price Between ? And ? ");
                pst.setInt(1, d1);
                pst.setInt(2, d2);
            }
            ResultSet rs=pst.executeQuery();
            DefaultTableModel table1=(DefaultTableModel)jTable2.getModel();
            //Object[] row;
            while(rs.next())
            {
                
                String item_name=rs.getString("Item_name");
                String cate=rs.getString("Category");
                String price =String.valueOf(rs.getInt("Price"));
               
                String data[]={item_name,cate,price};
                //DefaultTableModel table=(DefaultTableModel)jTable1.getModel();
                table1.addRow(data);
            }
        }
        catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);
        }
    }
    public void showCombo1(String com1)
    {
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/signup","root","passData123");
            PreparedStatement pst;
            String st="select * from menu1 ";
            
            if(com1.equals("None"))
            {
                pst=con.prepareStatement(st);
                
            }
            else
            {
                pst=con.prepareStatement("select * from menu1 WHERE Category=?");
                pst.setString(1, com1);
                
            }
            ResultSet rs=pst.executeQuery();
            DefaultTableModel table1=(DefaultTableModel)jTable2.getModel();
            //Object[] row;
            while(rs.next())
            {
                
                String item_name=rs.getString("Item_name");
                String cate=rs.getString("Category");
                String price =String.valueOf(rs.getInt("Price"));
               
                String data[]={item_name,cate,price};
                //DefaultTableModel table=(DefaultTableModel)jTable1.getModel();
                table1.addRow(data);
            }
        }
        catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);
        }
    }
    public void showCombo2(String com2)
    {
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/signup","root","passData123");
            PreparedStatement pst;
            String st="select * from menu2";
            if(com2.equals("None"))
            {
                pst=con.prepareStatement(st);
                
            }
            else
            {
                pst=con.prepareStatement("select * from menu2 WHERE Category=?");
                pst.setString(1, com2);
                
            }
            ResultSet rs=pst.executeQuery();
            DefaultTableModel table2=(DefaultTableModel)jTable3.getModel();
            //Object[] row;
            while(rs.next())
            {
                
                String item_name=rs.getString("Item_name");
                String cate=rs.getString("Category");
                String price =String.valueOf(rs.getInt("Price"));
               
                String data[]={item_name,cate,price};
                //DefaultTableModel table=(DefaultTableModel)jTable1.getModel();
                table2.addRow(data);
            }
        }
        catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);
        }
    }
    
    public void showData2(int d1,int d2)
    {
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/signup","root","passData123");
            PreparedStatement pst;
            String st="select * from menu2 ";
            
            if(d1<=15 || d2<=15)
            {
                pst=con.prepareStatement(st);
                
            }
            else
            {
                pst=con.prepareStatement("select * from menu2 WHERE Price Between ? And ? ");
                pst.setInt(1, d1);
                pst.setInt(2, d2);
            }
            ResultSet rs=pst.executeQuery();
            DefaultTableModel table2=(DefaultTableModel)jTable3.getModel();
            //Object[] row;
            while(rs.next())
            {
                
                String item_name=rs.getString("Item_name");
                String cate=rs.getString("Category");
                String price =String.valueOf(rs.getInt("Price"));
               
                String data[]={item_name,cate,price};
                //DefaultTableModel table=(DefaultTableModel)jTable1.getModel();
                table2.addRow(data);
            }
        }
        catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);
        }
    }
    
    public void showCombo3(String com3)
    {
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/signup","root","passData123");
            PreparedStatement pst;
            String st="select * from menu3";
            
            if(com3.equals("None"))
            {
                pst=con.prepareStatement(st);
                
            }
            else
            {
                pst=con.prepareStatement("select * from menu3 WHERE Category=?");
                pst.setString(1, com3);
                
            }
            ResultSet rs=pst.executeQuery();
            DefaultTableModel table3=(DefaultTableModel)jTable4.getModel();
            //Object[] row;
            while(rs.next())
            {
                
                String item_name=rs.getString("Item_name");
                String cate=rs.getString("Category");
                String price =String.valueOf(rs.getInt("Price"));
               
                String data[]={item_name,cate,price};
                //DefaultTableModel table=(DefaultTableModel)jTable1.getModel();
                table3.addRow(data);
            }
        }
        catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);
        }
    }
    public void showCombo4(String com4)
    {
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/signup","root","passData123");
            PreparedStatement pst;
            String st="select * from menu4";
            
            if(com4.equals("None"))
            {
                pst=con.prepareStatement(st);
                
            }
            else
            {
                pst=con.prepareStatement("select * from menu4 WHERE Category=?");
                pst.setString(1, com4);
                
            }
            ResultSet rs=pst.executeQuery();
            DefaultTableModel table4=(DefaultTableModel)jTable5.getModel();
            //Object[] row;
            while(rs.next())
            {
                
                String item_name=rs.getString("Item_name");
                String cate=rs.getString("Category");
                String price =String.valueOf(rs.getInt("Price"));
               
                String data[]={item_name,cate,price};
                //DefaultTableModel table=(DefaultTableModel)jTable1.getModel();
                table4.addRow(data);
            }
        }
        catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);
        }
    }
    void dash(String user)
     {
         try
           {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/signup","root","passData123");
            PreparedStatement pst;
            String st="select * from customer1 WHERE Name =?";
            pst=con.prepareStatement(st);
            pst.setString(1, user);
            ResultSet rs=pst.executeQuery();
            while(rs.next())
            {
                jTextField1.setText(String.valueOf(rs.getInt("Id")));
                jTextField2.setText(user);
                jTextField3.setText(rs.getString("Email"));
                jTextField4.setText(String.valueOf(rs.getInt("Id")));
                jTextField5.setText(user);
                jTextField6.setText(rs.getString("Email"));
                jTextField7.setText(String.valueOf(rs.getInt("Id")));
                jTextField8.setText(user);
                jTextField9.setText(rs.getString("Email"));
                jTextField10.setText(String.valueOf(rs.getInt("Id")));
                jTextField11.setText(user);
                jTextField12.setText(rs.getString("Email"));
                jTextField13.setText(String.valueOf(rs.getInt("Id")));
                jTextField14.setText(user);
                jTextField15.setText(rs.getString("Email"));
            }
           }
           catch(Exception e)
           {
               System.out.print("ERROR OCCURED"+e);
           }
     }
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tf3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        spin1 = new javax.swing.JSpinner();
        tf7 = new javax.swing.JTextField();
        tf6 = new javax.swing.JTextField();
        tf8 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        tfq = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tf4 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        tf5 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        spin2 = new javax.swing.JSpinner();
        tf9 = new javax.swing.JTextField();
        tf10 = new javax.swing.JTextField();
        tf11 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        tfq2 = new javax.swing.JTextField();
        jButton19 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        tf12 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        tf13 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        spin3 = new javax.swing.JSpinner();
        tf14 = new javax.swing.JTextField();
        tf15 = new javax.swing.JTextField();
        tf16 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        tfq3 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        tf17 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        tf18 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        spin4 = new javax.swing.JSpinner();
        tf19 = new javax.swing.JTextField();
        tf20 = new javax.swing.JTextField();
        tf21 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        tfq4 = new javax.swing.JTextField();
        jButton20 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        tf22 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        tf23 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        spin5 = new javax.swing.JSpinner();
        tf24 = new javax.swing.JTextField();
        tf25 = new javax.swing.JTextField();
        tf26 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        tfq5 = new javax.swing.JTextField();
        jButton21 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Choose your favourite restaurant");

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deshi", "Korai-bhuna", "Carbon", "Astana", "Dawat" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgtry/logout.png"))); // NOI18N
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgtry/image/prawn1.jpeg"))); // NOI18N

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgtry/image/14new.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jButton2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel30)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(231, 231, 231))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 980));

        jLabel3.setBackground(new java.awt.Color(102, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("    Deshi");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 51), new java.awt.Color(102, 0, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 0, 0)));

        jLabel102.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel102.setText("Customer ID");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Customer Name");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Customer's  Email");

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Choose Your Catagory");

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Rice/Biryani", "Set-Menu", "Veg_food", "Non-Veg", "Snacks", "Dessert", "Drinks", " " }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBox2FocusGained(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Price Range :");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText(" From");

        tf2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("To");

        tf3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("      Menu");

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Catagory", "  Price"
            }
        ));
        jTable1.setRowHeight(40);
        jTable1.setSelectionBackground(new java.awt.Color(102, 0, 0));
        jTable1.setShowVerticalLines(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jPanel10.setBackground(new java.awt.Color(102, 0, 0));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Catagory");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Item Name");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Price");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Quantity");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("  Cart");

        spin1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        spin1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        spin1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spin1StateChanged(evt);
            }
        });

        tf7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tf7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf7ActionPerformed(evt);
            }
        });

        tf6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tf6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf6ActionPerformed(evt);
            }
        });

        tf8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tf8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf8ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton12.setText(" Add to List");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        tfq.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tfq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfqActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton18.setText("OK");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton3.setText("Place Order");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(43, 43, 43))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf6, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf7, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(tfq, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(spin1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf8, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(29, 29, 29)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tf8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(spin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18))
                .addGap(125, 125, 125)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(jButton3))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel102)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(547, 547, 547)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel102)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(17, 17, 17)
                .addComponent(jLabel9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("tab1", jPanel2);

        jLabel18.setBackground(new java.awt.Color(102, 0, 0));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 0, 0));
        jLabel18.setText(" Korai-bhuna");
        jLabel18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 51), new java.awt.Color(102, 0, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 0, 0)));

        jLabel103.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel103.setText("Customer ID");

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setText("Customer Name");

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setText("Customer's  Email");

        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setText("Choose Your Catagory");

        jComboBox3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Rice/Biryani", "Set-Menu", "Veg/Non-Veg", "Snacks", "Dessert", "Drinks", " " }));
        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });
        jComboBox3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBox3FocusGained(evt);
            }
        });
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jComboBox3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jComboBox3KeyReleased(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setText("Price Range :");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setText(" From");

        tf4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setText("To");

        tf5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel31.setText("      Menu");

        jTable2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Catagory", "  Price"
            }
        ));
        jTable2.setRowHeight(40);
        jTable2.setSelectionBackground(new java.awt.Color(102, 0, 0));
        jTable2.setShowVerticalLines(true);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable2);

        jPanel11.setBackground(new java.awt.Color(102, 0, 0));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Catagory");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Item Name");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Price");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Quantity");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("  Cart");

        spin2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        spin2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        spin2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spin2StateChanged(evt);
            }
        });

        tf9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tf9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf9ActionPerformed(evt);
            }
        });

        tf10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tf10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf10ActionPerformed(evt);
            }
        });

        tf11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tf11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf11ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton4.setText("Place Order");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton13.setText(" Add to List");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        tfq2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jButton19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton19.setText("OK");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addContainerGap(194, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(tfq2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(spin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf10)
                            .addComponent(tf9)
                            .addComponent(tf11)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4)
                                .addGap(16, 16, 16)))))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(tf10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(tf9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(tf11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(spin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfq2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19))
                .addGap(131, 131, 131)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton4))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel103)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf5, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(536, 536, 536)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 247, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel103)
                    .addComponent(jLabel19)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel23)
                    .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel22)
                    .addComponent(tf5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );

        jTabbedPane1.addTab("tab2", jPanel4);

        jLabel32.setBackground(new java.awt.Color(102, 0, 0));
        jLabel32.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 0, 0));
        jLabel32.setText("   Carbon");
        jLabel32.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 51), new java.awt.Color(102, 0, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 0, 0)));

        jLabel104.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel104.setText("Customer ID");

        jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setText("Customer Name");

        jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel34.setText("Customer's  Email");

        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setText("Choose Your Catagory");

        jComboBox4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Rice/Biryani", "Veg_food", "Non-Veg", "Snacks", "Dessert", "Drinks", " " }));
        jComboBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox4ItemStateChanged(evt);
            }
        });
        jComboBox4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBox4FocusGained(evt);
            }
        });
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setText("Price Range :");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel37.setText(" From");

        tf12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel38.setText("To");

        tf13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel39.setText("      Menu");

        jTable3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Catagory", "  Price"
            }
        ));
        jTable3.setRowHeight(40);
        jTable3.setSelectionBackground(new java.awt.Color(102, 0, 0));
        jTable3.setShowVerticalLines(true);
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable3);

        jPanel12.setBackground(new java.awt.Color(102, 0, 0));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Catagory");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Item Name");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Price");

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Quantity");

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("  Cart");

        spin3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        spin3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        spin3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spin3StateChanged(evt);
            }
        });

        tf14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tf14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf14ActionPerformed(evt);
            }
        });

        tf15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tf15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf15ActionPerformed(evt);
            }
        });

        tf16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tf16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf16ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton7.setText("Place Order");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton14.setText(" Add to List");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        tfq3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jButton17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton17.setText("OK");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf14, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf15, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf16, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(tfq3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(spin3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7)
                        .addGap(41, 41, 41))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel44)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(tf14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(tf16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(tfq3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spin3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14)
                    .addComponent(jButton7))
                .addGap(76, 76, 76))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel104)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56)
                                        .addComponent(jLabel33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(jLabel34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(116, 116, 116)
                                        .addComponent(jLabel36)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel37)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf12, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tf13, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(536, 536, 536)
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(235, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel104)
                    .addComponent(jLabel33)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel37)
                    .addComponent(tf12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel36)
                    .addComponent(tf13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGap(31, 31, 31)
                .addComponent(jLabel39)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", jPanel5);

        jLabel46.setBackground(new java.awt.Color(102, 0, 0));
        jLabel46.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(102, 0, 0));
        jLabel46.setText("   Astana");
        jLabel46.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 51), new java.awt.Color(102, 0, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 0, 0)));

        jLabel105.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel105.setText("Customer ID");

        jTextField10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel47.setText("Customer Name");

        jTextField11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel48.setText("Customer's  Email");

        jTextField12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel49.setText("Choose Your Catagory");

        jComboBox5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Rice/Biryani", "Set-Menu", "Veg/Non-Veg", "Snacks", "Dessert", "Drinks", " " }));
        jComboBox5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox5ItemStateChanged(evt);
            }
        });
        jComboBox5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBox5FocusGained(evt);
            }
        });
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel50.setText("Price Range :");

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel51.setText(" From");

        tf17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel52.setText("To");

        tf18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton8.setText("Search");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel53.setText("      Menu");

        jTable4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Catagory", "  Price"
            }
        ));
        jTable4.setRowHeight(40);
        jTable4.setSelectionBackground(new java.awt.Color(102, 0, 0));
        jTable4.setShowVerticalLines(true);
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable4);

        jPanel13.setBackground(new java.awt.Color(102, 0, 0));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Catagory");

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Item Name");

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Price");

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Quantity");

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("  Cart");

        spin4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        spin4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        spin4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spin4StateChanged(evt);
            }
        });

        tf19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tf19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf19ActionPerformed(evt);
            }
        });

        tf20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tf20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf20ActionPerformed(evt);
            }
        });

        tf21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tf21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf21ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton9.setText("Place Order");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton15.setText(" Add to List");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        tfq4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jButton20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton20.setText("OK");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(tfq4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                        .addComponent(spin4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8))
                                    .addComponent(tf21, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf19, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf20))
                                .addContainerGap())))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9)
                        .addGap(33, 33, 33))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel58)
                .addGap(32, 32, 32)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(tf20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(tf19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(tf21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(spin4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfq4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15)
                    .addComponent(jButton9))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel105)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel49)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116)
                                .addComponent(jLabel50)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf17, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel52)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf18, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(297, 297, 297)
                                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 205, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(524, 524, 524)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel105)
                    .addComponent(jLabel47)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(jLabel51)
                    .addComponent(tf17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52)
                    .addComponent(jLabel50)
                    .addComponent(tf18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel53)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab4", jPanel6);

        jLabel60.setBackground(new java.awt.Color(102, 0, 0));
        jLabel60.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(102, 0, 0));
        jLabel60.setText("    Dawat");
        jLabel60.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 51), new java.awt.Color(102, 0, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 0, 0)));

        jLabel106.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel106.setText("Customer ID");

        jTextField13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel61.setText("Customer Name");

        jTextField14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel62.setText("Customer's  Email");

        jTextField15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel63.setText("Choose Your Catagory");

        jComboBox6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Rice/Biryani", "Set-Menu", "Veg_food", "Non-Veg", "Snacks", "Dessert", "Drinks", " " }));
        jComboBox6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox6ItemStateChanged(evt);
            }
        });
        jComboBox6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBox6FocusGained(evt);
            }
        });
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel64.setText("Price Range :");

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel65.setText(" From");

        tf22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel66.setText("To");

        tf23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton10.setText("Search");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel67.setText("      Menu");

        jTable5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Catagory", "  Price"
            }
        ));
        jTable5.setRowHeight(40);
        jTable5.setSelectionBackground(new java.awt.Color(102, 0, 0));
        jTable5.setShowVerticalLines(true);
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTable5);

        jPanel14.setBackground(new java.awt.Color(102, 0, 0));

        jLabel68.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("Catagory");

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("Item Name");

        jLabel70.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("Price");

        jLabel71.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("Quantity");

        jLabel72.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("  Cart");

        spin5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        spin5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        spin5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spin5StateChanged(evt);
            }
        });

        tf24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tf24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf24ActionPerformed(evt);
            }
        });

        tf25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tf25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf25ActionPerformed(evt);
            }
        });

        tf26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tf26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf26ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton11.setText("Place Order");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton16.setText(" Add to List");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        tfq5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jButton21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton21.setText("OK");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf25)
                                    .addComponent(tf26)
                                    .addComponent(tf24)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addComponent(tfq5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                        .addComponent(spin5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton11)
                        .addGap(42, 42, 42))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel72)
                .addGap(32, 32, 32)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(tf25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(tf24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(tf26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(spin5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfq5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16)
                    .addComponent(jButton11))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel106)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel61)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel62)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel63)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116)
                                .addComponent(jLabel64)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel65)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf22, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel66)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf23, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 187, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(524, 524, 524)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel106)
                    .addComponent(jLabel61)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63)
                    .addComponent(jLabel65)
                    .addComponent(tf22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66)
                    .addComponent(jLabel64)
                    .addComponent(tf23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10))
                .addGap(18, 18, 18)
                .addComponent(jLabel67)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab5", jPanel7);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, -34, -1, 1030));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1729, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        String str=(String)jComboBox1.getSelectedItem();
        if(str.equals("Deshi"))
        {
            jTabbedPane1.setSelectedIndex(0);

        }
        else if(str.equals("Korai-bhuna"))
        {
            jTabbedPane1.setSelectedIndex(1);
        }
        else if(str.equals("Carbon"))
        {
            jTabbedPane1.setSelectedIndex(2);
        }
        else if(str.equals("Astana"))
        {
            jTabbedPane1.setSelectedIndex(3);

        }
        else if(str.equals("Dawat"))
        {
            jTabbedPane1.setSelectedIndex(4);
        }

    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null, "Do you really want to logout?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            Login_AU login =new Login_AU();
            login.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox2FocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox2FocusGained

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        /*String str = jComboBox2.getSelectedItem().toString();

        DefaultTableModel table=(DefaultTableModel)jTable1.getModel();
        TableRowSorter<DefaultTableModel>tr=new TableRowSorter<>(table);
        jTable1.setRowSorter(tr);
        if(!str.equals("None"))
        {
            tr.setRowFilter(RowFilter.regexFilter(str));
        }*/
        try
        {
            jTable1.setModel(new DefaultTableModel(null,new Object[]{"Item_name","Category","Price"}));
            String str = jComboBox2.getSelectedItem().toString();
            showCombo(str);

        }catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);
        }

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            jTable1.setModel(new DefaultTableModel(null,new Object[]{"Item_name","Category","Price"}));
            int a=Integer.parseInt(tf2.getText());
            int b=Integer.parseInt(tf3.getText());
            showData(a,b);
        }
        catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row=jTable1.getSelectedRow();

        String item=jTable1.getModel().getValueAt(row, 0).toString();

        String str="select * from menu WHERE Item_name='"+item+"'";
        try{

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/signup","root","passData123");

            PreparedStatement pst=con.prepareStatement(str);
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                tf6.setText(rs.getString("Item_name"));

                tf7.setText(rs.getString("Category"));
                tf8.setText(String.valueOf(rs.getInt("Price")));

            }

        }catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void spin1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spin1StateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_spin1StateChanged

    private void tf7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf7ActionPerformed

    private void tf6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf6ActionPerformed

    private void tf8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        place_order order =new place_order();
        order.bill(Integer.parseInt(jTextField1.getText()));
        order.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton12MouseClicked

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/signup","root","passData123");
            PreparedStatement pst=con.prepareStatement("insert into signup.order(Cus_id,Res_name,Item_name,Category,Price,Quantity) values(?,?,?,?,?,?)");
            pst.setInt(1,Integer.parseInt(jTextField1.getText()));
            pst.setString(2, jComboBox1.getSelectedItem().toString());
            pst.setString(3, tf6.getText());
            pst.setString(4, tf7.getText());
            pst.setInt(5, Integer.parseInt(tf8.getText()));
            
            pst.setInt(6, Integer.parseInt(tfq.getText()));
            pst.executeUpdate();
            System.out.println("Record Inserted Succesfully ");
            pst.close();
            con.close();
            
        }
        catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);
            
        }

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        int a;
        tfq.setText(spin1.getValue().toString());
        a = Integer.parseInt(tfq.getText());
        int x=Integer.parseInt(tf8.getText());
        int ans=x*a;
        if(a<=1)
        {
            tf8.setText(String.valueOf(x));
        }
        else
        {
            tf8.setText(String.valueOf(ans));
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox3ItemStateChanged

    private void jComboBox3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3FocusGained

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
        /*try
        {
            String str = jComboBox3.getSelectedItem().toString();
            DefaultTableModel table1=(DefaultTableModel)jTable2.getModel();
            TableRowSorter<DefaultTableModel>tr=new TableRowSorter<>(table1);
            jTable2.setRowSorter(tr);
            if(!str.equals("None"))
            {
                tr.setRowFilter(RowFilter.regexFilter(str));
            }
        }
        catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);
        }*/
        //showCombo1(str);
        try
        {
            jTable2.setModel(new DefaultTableModel(null,new Object[]{"Item_name","Category","Price"}));
            String str = jComboBox3.getSelectedItem().toString();
            showCombo1(str);

        }catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);
        }

    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox3KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox3KeyPressed

    private void jComboBox3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3KeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try{
            jTable2.setModel(new DefaultTableModel(null,new Object[]{"Item_name","Category","Price"}));
            int a=Integer.parseInt(tf4.getText());
            int b=Integer.parseInt(tf5.getText());
            showData1(a,b);
        }
        catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);

        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int row=jTable2.getSelectedRow();

        String item=jTable2.getModel().getValueAt(row, 0).toString();

        String str="select * from menu1 WHERE Item_name='"+item+"'";
        try{

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/signup","root","passData123");

            PreparedStatement pst=con.prepareStatement(str);
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                tf10.setText(rs.getString("Item_name"));

                tf9.setText(rs.getString("Category"));

                tf11.setText(String.valueOf(rs.getInt("Price")));
            }

        }catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void spin2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spin2StateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_spin2StateChanged

    private void tf9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf9ActionPerformed

    private void tf10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf10ActionPerformed

    private void tf11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf11ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        place_order order =new place_order();
        order.bill(Integer.parseInt(jTextField1.getText()));
        order.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/signup","root","passData123");
            PreparedStatement pst=con.prepareStatement("insert into signup.order(Cus_id,Res_name,Item_name,Category,Price,Quantity) values(?,?,?,?,?,?)");
            pst.setInt(1,Integer.parseInt(jTextField1.getText()));
            pst.setString(2, jComboBox1.getSelectedItem().toString());
            pst.setString(3, tf10.getText());
            pst.setString(4, tf9.getText());
            pst.setInt(5, Integer.parseInt(tf11.getText()));

            pst.setInt(6, Integer.parseInt(tfq2.getText()));
            pst.executeUpdate();
            System.out.println("Record Inserted Succesfully ");
            pst.close();
            con.close();

        }
        catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);

        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        int a;
        tfq2.setText(spin2.getValue().toString());
        a = Integer.parseInt(tfq2.getText());
        int x=Integer.parseInt(tf11.getText());
        int ans=x*a;
        if(a<=1)
        {
            tf11.setText(String.valueOf(x));
        }
        else
        {
            tf11.setText(String.valueOf(ans));
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jComboBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox4ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ItemStateChanged

    private void jComboBox4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox4FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4FocusGained

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
        try
        {
            jTable3.setModel(new DefaultTableModel(null,new Object[]{"Item_name","Category","Price"}));
            String str = jComboBox4.getSelectedItem().toString();
            showCombo2(str);

        }catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);
        }
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try{
            jTable3.setModel(new DefaultTableModel(null,new Object[]{"Item_name","Category","Price"}));
            int a=Integer.parseInt(tf12.getText());
            int b=Integer.parseInt(tf13.getText());
            showData2(a,b);
        }
        catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);

        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
        int row=jTable3.getSelectedRow();

        String item=jTable3.getModel().getValueAt(row, 0).toString();

        String str="select * from menu2 WHERE Item_name='"+item+"'";
        try{

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/signup","root","passData123");

            PreparedStatement pst=con.prepareStatement(str);
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                tf15.setText(rs.getString("Item_name"));

                tf14.setText(rs.getString("Category"));

                tf16.setText(String.valueOf(rs.getInt("Price")));

            }

        }catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);
        }
    }//GEN-LAST:event_jTable3MouseClicked

    private void spin3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spin3StateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_spin3StateChanged

    private void tf14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf14ActionPerformed

    private void tf15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf15ActionPerformed

    private void tf16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf16ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        place_order order =new place_order();
        order.bill(Integer.parseInt(jTextField1.getText()));
        order.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/signup","root","passData123");
            PreparedStatement pst=con.prepareStatement("insert into signup.order(Cus_id,Res_name,Item_name,Category,Price,Quantity) values(?,?,?,?,?,?)");
            pst.setInt(1,Integer.parseInt(jTextField1.getText()));
            pst.setString(2, jComboBox1.getSelectedItem().toString());
            pst.setString(3, tf15.getText());
            pst.setString(4, tf14.getText());
            pst.setInt(5, Integer.parseInt(tf16.getText()));

            pst.setInt(6, Integer.parseInt(tfq3.getText()));
            pst.executeUpdate();
            System.out.println("Record Inserted Succesfully ");
            pst.close();
            con.close();

        }
        catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);

        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        tfq3.setText(spin3.getValue().toString());
        int x=Integer.parseInt(tf16.getText());
        int a=Integer.parseInt(tfq3.getText());
        int ans=x*a;
        if(a<=1)
        {
            tf16.setText(String.valueOf(x));
        }
        else
        {
            tf16.setText(String.valueOf(ans));
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jComboBox5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox5ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ItemStateChanged

    private void jComboBox5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox5FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5FocusGained

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
        try
        {
            jTable4.setModel(new DefaultTableModel(null,new Object[]{"Item_name","Category","Price"}));
            String str = jComboBox5.getSelectedItem().toString();
            showCombo3(str);

        }catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);
        }

    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        try{
            jTable4.setModel(new DefaultTableModel(null,new Object[]{"Item_name","Category","Price"}));
            int a=Integer.parseInt(tf17.getText());
            int b=Integer.parseInt(tf18.getText());
            showData3(a,b);
        }
        catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);

        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        // TODO add your handling code here:
        int row=jTable4.getSelectedRow();

        String item=jTable4.getModel().getValueAt(row, 0).toString();

        String str="select * from menu3 WHERE Item_name='"+item+"'";
        try{

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/signup","root","passData123");

            PreparedStatement pst=con.prepareStatement(str);
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                tf20.setText(rs.getString("Item_name"));

                tf19.setText(rs.getString("Category"));

                tf21.setText(String.valueOf(rs.getInt("Price")));
            }

        }catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);
        }
    }//GEN-LAST:event_jTable4MouseClicked

    private void spin4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spin4StateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_spin4StateChanged

    private void tf19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf19ActionPerformed

    private void tf20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf20ActionPerformed

    private void tf21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf21ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        place_order order =new place_order();
        order.bill(Integer.parseInt(jTextField1.getText()));
        order.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/signup","root","passData123");
            PreparedStatement pst=con.prepareStatement("insert into signup.order(Cus_id,Res_name,Item_name,Category,Price,Quantity) values(?,?,?,?,?,?)");
            pst.setInt(1,Integer.parseInt(jTextField1.getText()));
            pst.setString(2, jComboBox1.getSelectedItem().toString());
            pst.setString(3, tf20.getText());
            pst.setString(4, tf19.getText());
            pst.setInt(5, Integer.parseInt(tf21.getText()));

            pst.setInt(6, Integer.parseInt(tfq4.getText()));
            pst.executeUpdate();
            System.out.println("Record Inserted Succesfully ");
            pst.close();
            con.close();

        }
        catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);

        }
        // place.table(new Object[]{jComboBox1.getSelectedItem(),tf20.getText(),tf19.getText(),tf21.getText()});
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        int a;
        tfq4.setText(spin4.getValue().toString());
        a=Integer.parseInt(tfq4.getText());
        int x=Integer.parseInt(tf21.getText());
        int ans=x*a;
        if(a<=1)
        {
            tf21.setText(String.valueOf(x));
        }
        else
        {
            tf21.setText(String.valueOf(ans));
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jComboBox6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox6ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox6ItemStateChanged

    private void jComboBox6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox6FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox6FocusGained

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:
        try
        {
            jTable5.setModel(new DefaultTableModel(null,new Object[]{"Item_name","Category","Price"}));
            String str = jComboBox6.getSelectedItem().toString();
            showCombo4(str);

        }catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);
        }
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        try{
            jTable5.setModel(new DefaultTableModel(null,new Object[]{"Item_name","Category","Price"}));
            int a=Integer.parseInt(tf22.getText());
            int b=Integer.parseInt(tf23.getText());
            showData4(a,b);
        }
        catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);

        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        // TODO add your handling code here:
        int row=jTable5.getSelectedRow();

        String item=jTable5.getModel().getValueAt(row, 0).toString();

        String str="select * from menu4 WHERE Item_name='"+item+"'";
        try{

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/signup","root","passData123");

            PreparedStatement pst=con.prepareStatement(str);
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                tf25.setText(rs.getString("Item_name"));

                tf24.setText(rs.getString("Category"));

                tf26.setText(String.valueOf(rs.getInt("Price")));
            }

        }catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);
        }
    }//GEN-LAST:event_jTable5MouseClicked

    private void spin5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spin5StateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_spin5StateChanged

    private void tf24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf24ActionPerformed

    private void tf25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf25ActionPerformed

    private void tf26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf26ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        place_order order =new place_order();
        order.bill(Integer.parseInt(jTextField1.getText()));
        order.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/signup","root","passData123");
            PreparedStatement pst=con.prepareStatement("insert into signup.order(Cus_id,Res_name,Item_name,Category,Price,Quantity) values(?,?,?,?,?,?)");
            pst.setInt(1,Integer.parseInt(jTextField1.getText()));
            pst.setString(2, jComboBox1.getSelectedItem().toString());
            pst.setString(3, tf25.getText());
            pst.setString(4, tf24.getText());
            pst.setInt(5, Integer.parseInt(tf26.getText()));

            pst.setInt(6, Integer.parseInt(tfq5.getText()));
            pst.executeUpdate();
            System.out.println("Record Inserted Succesfully ");
            pst.close();
            con.close();

        }
        catch(Exception e)
        {
            System.out.print("ERROR OCCURED"+e);

        }
        //place.table(new Object[]{jComboBox1.getSelectedItem(),tf25.getText(),tf24.getText(),tf26.getText()});
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        int a;
        tfq5.setText(spin5.getValue().toString());
        a=Integer.parseInt(tfq5.getText());
        int x=Integer.parseInt(tf26.getText());
        int ans=x*a;
        if(a<=1)
        {
            tf26.setText(String.valueOf(x));
        }
        else
        {
            tf26.setText(String.valueOf(ans));
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void tfqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfqActionPerformed

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
            java.util.logging.Logger.getLogger(User_dash1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_dash1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_dash1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_dash1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_dash1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JSpinner spin1;
    private javax.swing.JSpinner spin2;
    private javax.swing.JSpinner spin3;
    private javax.swing.JSpinner spin4;
    private javax.swing.JSpinner spin5;
    private javax.swing.JTextField tf10;
    private javax.swing.JTextField tf11;
    private javax.swing.JTextField tf12;
    private javax.swing.JTextField tf13;
    private javax.swing.JTextField tf14;
    private javax.swing.JTextField tf15;
    private javax.swing.JTextField tf16;
    private javax.swing.JTextField tf17;
    private javax.swing.JTextField tf18;
    private javax.swing.JTextField tf19;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf20;
    private javax.swing.JTextField tf21;
    private javax.swing.JTextField tf22;
    private javax.swing.JTextField tf23;
    private javax.swing.JTextField tf24;
    private javax.swing.JTextField tf25;
    private javax.swing.JTextField tf26;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    private javax.swing.JTextField tf7;
    private javax.swing.JTextField tf8;
    private javax.swing.JTextField tf9;
    private javax.swing.JTextField tfq;
    private javax.swing.JTextField tfq2;
    private javax.swing.JTextField tfq3;
    private javax.swing.JTextField tfq4;
    private javax.swing.JTextField tfq5;
    // End of variables declaration//GEN-END:variables
}
