
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sai Ji
 */
public class marks extends javax.swing.JFrame {

    java.sql.Connection con;
    ResultSet rs;
    PreparedStatement st,ps;
    int sem;
    String id;
    /**
     * Creates new form marks
     */
    public marks(int sem,String id) {
        System.out.print("semester: "+sem);
        this.sem=sem;
        this.id=id;
        initComponents();
        
        if(this.sem==1)
        {
            jLabel2.setText("MATHS101");
            jLabel3.setText("EC102");
            jLabel4.setText("ME103");
            jLabel5.setText("CH101");
            jLabel6.setText("HSS102");
            jLabel7.setText("EE-E101");
            
            jLabel8.hide();
            jLabel9.hide();
            jLabel10.hide();
            jLabel11.hide();
            
            jTextField7.hide();
            jTextField8.hide();
            jTextField9.hide();
            jTextField11.hide();
        }
        else if(sem==2)
        {
            jLabel2.setText("MATHS201");
            jLabel3.setText("HSS201");
            jLabel4.setText("CS204");
            jLabel5.setText("GS201");
            jLabel6.setText("EE-E201");
            jLabel7.hide();
            jLabel8.hide();
            jLabel9.hide();
            jLabel10.hide();
            jLabel11.hide();
            jTextField6.hide();
            jTextField7.hide();
            jTextField8.hide();
            jTextField9.hide();
            jTextField11.hide();
        }
        else if(sem==3)
        {
            jLabel2.setText("EE301");
            jLabel3.setText("EE351");
            jLabel4.setText("EE305");
            jLabel5.setText("EE356");
            jLabel6.setText("EE307");
            jLabel7.setText("EE358");
            jLabel8.setText("MATHS301");
            jLabel9.hide();
            jLabel10.hide();
            jLabel11.hide();
            jTextField8.hide();
            jTextField9.hide();
            jTextField10.hide();
            jTextField11.hide();
            
        }
        else if(sem==4)
        {
            jLabel2.setText("AS401");
            jLabel3.setText("EE401");
            jLabel4.setText("EE451");
            jLabel5.setText("EE402");
            jLabel6.setText("EE452");
            jLabel7.setText("EE403");
            jLabel8.setText("EE453");
            jLabel9.setText("EE405");
            jLabel10.setText("EE455");
            
            jLabel11.hide();
            jTextField10.hide();
            jTextField11.hide();
        }
        else if(sem==5)
        {
            jLabel2.setText("EE501");
            jLabel3.setText("EE551");
            jLabel4.setText("EE507");
            jLabel5.setText("EE557");
            jLabel6.setText("EE508");
            jLabel7.setText("EE509");
            jLabel8.setText("EE559");
            jLabel9.setText("EE556");
            
            jLabel10.hide();
            jLabel11.hide();
            
            jTextField9.hide();
            jTextField10.hide();
            jTextField11.hide();
        }
        else if(sem==6)
        {
            
            jLabel2.setText("EE601");
            jLabel3.setText("EE651");
            jLabel4.setText("EE611");
            jLabel5.setText("EE661");
            jLabel6.setText("EE612");
            jLabel7.setText("EE613");
            jLabel8.setText("EE663");
            jLabel9.setText("EE606");
            jLabel10.setText("EE656");
            jLabel11.setText("DIC02");
        }
        else if(sem==7)
        {
            jLabel2.setText("EE710");
            jLabel3.setText("EE760");
            jLabel4.setText("EE711");
            jLabel5.setText("EE708");
            jLabel6.setText("EE758");
            jLabel7.setText("EE709");
            jLabel8.setText("EE705");
            jLabel9.setText("EE706");
            jLabel10.setText("EE707");
            jLabel11.hide();
            jTextField11.hide();
            jTextField10.hide();
        }
        else if(sem==8)
        {
            jLabel2.setText("EE801");
            jLabel3.setText("EE809");
            jLabel4.setText("EE859");
            jLabel5.setText("EE808");
            jLabel6.setText("EE810");
            jLabel7.setText("EE805");
            jLabel8.setText("EE850");
            jLabel9.hide();
            jLabel10.hide();
            jLabel11.hide();
            jTextField11.hide();
            jTextField10.hide();
            jTextField9.hide();
            jTextField8.hide();
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField10 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();

        jTextField10.setText("jTextField10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter the Marks");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        jTextField4.setText("jTextField4");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("jLabel6");

        jTextField5.setText("jTextField5");

        jLabel7.setText("jLabel7");

        jTextField6.setText("jTextField6");

        jLabel8.setText("jLabel8");

        jTextField7.setText("jTextField7");

        jLabel9.setText("jLabel9");

        jLabel10.setText("jLabel10");

        jTextField8.setText("jTextField8");

        jTextField9.setText("jTextField9");

        jLabel11.setText("jLabel11");

        jTextField11.setText("jTextField11");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 97, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(75, 75, 75))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int sub1,sub2,sub3,sub4,sub5,sub6,sub7,sub8,sub9,sub10;
        
        if(sem==1)
        {
            sub1=Integer.parseInt(jTextField1.getText());
            sub2=Integer.parseInt(jTextField2.getText());
            sub3=Integer.parseInt(jTextField3.getText());
            sub4=Integer.parseInt(jTextField4.getText());
            sub5=Integer.parseInt(jTextField5.getText());
            sub6=Integer.parseInt(jTextField6.getText());
            try {
            con=connect.connection();
            ps=con.prepareStatement("INSERT INTO `sem1`(`studID`, `MATHS101`, `EC102`, `ME103`, `CH101`, `HSS102`, `EE-E101`) values (?,?,?,?,?,?,?)");
            ps.setString(1, id);
            ps.setInt(2,sub1 );
            ps.setInt(3,sub2 );
            ps.setInt(4,sub3 );
            ps.setInt(5,sub4 );
            ps.setInt(6,sub5 );
            ps.setInt(7,sub6 );
            int i=ps.executeUpdate();
            if(i>0)
            {
                dashboard d=new dashboard();
                d.setVisible(true);
                this.dispose();
            }
            } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
            }
            }
        else if(sem==2)
        {
            sub1=Integer.parseInt(jTextField1.getText());
            sub2=Integer.parseInt(jTextField2.getText());
            sub3=Integer.parseInt(jTextField3.getText());
            sub4=Integer.parseInt(jTextField4.getText());
            sub5=Integer.parseInt(jTextField5.getText());
            try {
            con=connect.connection();
            ps=con.prepareStatement("INSERT INTO `sem2`(`studID`, `MATHS201`, `HSS201`, `CS204`, `GS201`, `EE-E201`) values (?,?,?,?,?,?)");
            ps.setString(1, id);
            ps.setInt(2,sub1 );
            ps.setInt(3,sub2 );
            ps.setInt(4,sub3 );
            ps.setInt(5,sub4 );
            ps.setInt(6,sub5 );
            
            int i=ps.executeUpdate();
            if(i>0)
            {
                dashboard d=new dashboard();
                d.setVisible(true);
                this.dispose();
            }
            } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
            }
        }
        else if(sem==3)
        {
            sub1=Integer.parseInt(jTextField1.getText());
            sub2=Integer.parseInt(jTextField2.getText());
            sub3=Integer.parseInt(jTextField3.getText());
            sub4=Integer.parseInt(jTextField4.getText());
            sub5=Integer.parseInt(jTextField5.getText());
            sub6=Integer.parseInt(jTextField6.getText());
            sub7=Integer.parseInt(jTextField7.getText());
            
            try {
            con=connect.connection();
            ps=con.prepareStatement("INSERT INTO `sem3`(`studID`, `EE301`, `EE351`, `EE305`, `EE356`, `EE307`, `EE358`, `MATHS301`) values (?,?,?,?,?,?,?,?)");
            ps.setString(1, id);
            ps.setInt(2,sub1 );
            ps.setInt(3,sub2 );
            ps.setInt(4,sub3 );
            ps.setInt(5,sub4 );
            ps.setInt(6,sub5 );
            ps.setInt(7,sub6 );
            ps.setInt(8, sub7);
            int i=ps.executeUpdate();
            if(i>0)
            {
                dashboard d=new dashboard();
                d.setVisible(true);
                this.dispose();
            }
            } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
            }
        }
        else if(sem==4)
        {
            sub1=Integer.parseInt(jTextField1.getText());
            sub2=Integer.parseInt(jTextField2.getText());
            sub3=Integer.parseInt(jTextField3.getText());
            sub4=Integer.parseInt(jTextField4.getText());
            sub5=Integer.parseInt(jTextField5.getText());
            sub6=Integer.parseInt(jTextField6.getText());
            sub7=Integer.parseInt(jTextField7.getText());
            sub8=Integer.parseInt(jTextField8.getText());
            sub9=Integer.parseInt(jTextField9.getText());
            
            try {
            con=connect.connection();
            ps=con.prepareStatement("INSERT INTO `sem4`(`studID`, `AS401`, `EE401`, `EE451`, `EE402`, `EE452`, `EE403`, `EE453`, `EE405`, `EE455`) values (?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, id);
            ps.setInt(2,sub1 );
            ps.setInt(3,sub2 );
            ps.setInt(4,sub3 );
            ps.setInt(5,sub4 );
            ps.setInt(6,sub5 );
            ps.setInt(7,sub6 );
            ps.setInt(8,sub7 );
            ps.setInt(9,sub8 );
            ps.setInt(10,sub9 );
            int i=ps.executeUpdate();
            if(i>0)
            {
                dashboard d=new dashboard();
                d.setVisible(true);
                this.dispose();
            }
            } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
            }
        }
        else if(sem==5)
        {
            sub1=Integer.parseInt(jTextField1.getText());
            sub2=Integer.parseInt(jTextField2.getText());
            sub3=Integer.parseInt(jTextField3.getText());
            sub4=Integer.parseInt(jTextField4.getText());
            sub5=Integer.parseInt(jTextField5.getText());
            sub6=Integer.parseInt(jTextField6.getText());
            sub7=Integer.parseInt(jTextField7.getText());
            sub8=Integer.parseInt(jTextField8.getText());
            sub9=Integer.parseInt(jTextField9.getText());
            sub10=Integer.parseInt(jTextField10.getText());
            
            try {
            con=connect.connection();
            ps=con.prepareStatement("INSERT INTO `sem5`(`studID`, `EE501`, `EE551`, `EE510`, `EE560`, `EE507`, `EE557`, `EE508`, `EE509`, `EE559`, `EE556`) values (?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, id);
            ps.setInt(2,sub1 );
            ps.setInt(3,sub2 );
            ps.setInt(4,sub3 );
            ps.setInt(5,sub4 );
            ps.setInt(6,sub5 );
            ps.setInt(7,sub6 );
            ps.setInt(8,sub7 );
            ps.setInt(9,sub8 );
            ps.setInt(10,sub9 );
            ps.setInt(11,sub10 );
            int i=ps.executeUpdate();
            if(i>0)
            {
                dashboard d=new dashboard();
                d.setVisible(true);
                this.dispose();
            }
            } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
            }
        }
        else if(sem==6)
        {
            sub1=Integer.parseInt(jTextField1.getText());
            sub2=Integer.parseInt(jTextField2.getText());
            sub3=Integer.parseInt(jTextField3.getText());
            sub4=Integer.parseInt(jTextField4.getText());
            sub5=Integer.parseInt(jTextField5.getText());
            sub6=Integer.parseInt(jTextField6.getText());
            sub7=Integer.parseInt(jTextField7.getText());
            sub8=Integer.parseInt(jTextField8.getText());
            sub9=Integer.parseInt(jTextField9.getText());
            sub10=Integer.parseInt(jTextField10.getText());
            
            try {
            con=connect.connection();
            ps=con.prepareStatement("INSERT INTO `sem6`(`studID`, `EE601`, `EE651`, `EE611`, `EE661`, `EE612`, `EE613`, `EE663`, `EE606`, `EE656`, `DIC02`) values (?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, id);
            ps.setInt(2,sub1 );
            ps.setInt(3,sub2 );
            ps.setInt(4,sub3 );
            ps.setInt(5,sub4 );
            ps.setInt(6,sub5 );
            ps.setInt(7,sub6 );
            ps.setInt(8,sub7 );
            ps.setInt(9,sub8 );
            ps.setInt(10,sub9 );
            ps.setInt(11,sub10 );
            int i=ps.executeUpdate();
            if(i>0)
            {
                dashboard d=new dashboard();
                d.setVisible(true);
                this.dispose();
            }
            } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
            }
        }
        else if(sem==7)
        {
            sub1=Integer.parseInt(jTextField1.getText());
            sub2=Integer.parseInt(jTextField2.getText());
            sub3=Integer.parseInt(jTextField3.getText());
            sub4=Integer.parseInt(jTextField4.getText());
            sub5=Integer.parseInt(jTextField5.getText());
            sub6=Integer.parseInt(jTextField6.getText());
            sub7=Integer.parseInt(jTextField7.getText());
            sub8=Integer.parseInt(jTextField8.getText());
            sub9=Integer.parseInt(jTextField9.getText());
            
            try {
            con=connect.connection();
            ps=con.prepareStatement("INSERT INTO `sem7`(`studID`, `EE710`, `EE760`, `EE711`, `EE708`, `EE758`, `EE709`, `EE705`, `EE706`, `EE707`) values (?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, id);
            ps.setInt(2,sub1 );
            ps.setInt(3,sub2 );
            ps.setInt(4,sub3 );
            ps.setInt(5,sub4 );
            ps.setInt(6,sub5 );
            ps.setInt(7,sub6 );
            ps.setInt(8,sub7 );
            ps.setInt(9,sub8 );
            ps.setInt(10,sub9 );
            int i=ps.executeUpdate();
            if(i>0)
            {
                dashboard d=new dashboard();
                d.setVisible(true);
                this.dispose();
            }
            } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
            }
        }
        else if(sem==8)
        {
            sub1=Integer.parseInt(jTextField1.getText());
            sub2=Integer.parseInt(jTextField2.getText());
            sub3=Integer.parseInt(jTextField3.getText());
            sub4=Integer.parseInt(jTextField4.getText());
            sub5=Integer.parseInt(jTextField5.getText());
            sub6=Integer.parseInt(jTextField6.getText());
            sub7=Integer.parseInt(jTextField7.getText());
            try {
            con=connect.connection();
            ps=con.prepareStatement("INSERT INTO `sem8`(`studID`, `EE801`, `EE809`, `EE859`, `EE808`, `EE810`, `EE805`, `EE850`) values (?,?,?,?,?,?,?,?)");
            ps.setString(1, id);
            ps.setInt(2,sub1 );
            ps.setInt(3,sub2 );
            ps.setInt(4,sub3 );
            ps.setInt(5,sub4 );
            ps.setInt(6,sub5 );
            ps.setInt(7,sub6 );
            ps.setInt(8,sub7 );
            int i=ps.executeUpdate();
            if(i>0)
            {
                dashboard d=new dashboard();
                d.setVisible(true);
                this.dispose();
            }
            } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new marks(1,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
