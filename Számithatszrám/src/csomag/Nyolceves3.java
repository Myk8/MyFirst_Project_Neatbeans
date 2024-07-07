/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csomag;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Mikey
 */
public class Nyolceves3 extends javax.swing.JFrame {
String host="jdbc:mysql://localhost:3306/vizsga";
String user="root";
String pass="root";
private int  ID;
private Statement sta;

String[] tömb = {"fél 3", "3 óra"};
String[] tömb2 = {"háromnegyed 3", "fél 6"};
String[] tömb3 = {"negyed 8", "12 óra"};

int szam=(int)(Math.random()*2);

    public Nyolceves3() {
        initComponents();
    }

     public Nyolceves3(Statement sta){
    initComponents();
    this.sta=sta;
     kezdés();
   
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hetevespalyak = new javax.swing.JTabbedPane();
        masodikpalya = new javax.swing.JPanel();
        óra = new javax.swing.JLabel();
        óra1 = new javax.swing.JLabel();
        óra2 = new javax.swing.JLabel();
        óra3 = new javax.swing.JLabel();
        óra4 = new javax.swing.JLabel();
        óra5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        köv1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nyoclevesek3");
        setPreferredSize(new java.awt.Dimension(780, 540));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        hetevespalyak.setPreferredSize(new java.awt.Dimension(780, 540));

        masodikpalya.setBackground(new java.awt.Color(102, 153, 255));
        masodikpalya.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        masodikpalya.setEnabled(false);
        masodikpalya.setMaximumSize(new java.awt.Dimension(0, 0));
        masodikpalya.setLayout(null);

        óra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/ÓRA.png"))); // NOI18N
        óra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                óraMouseClicked(evt);
            }
        });
        masodikpalya.add(óra);
        óra.setBounds(110, 230, 227, 230);

        óra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/ÓRA1.png"))); // NOI18N
        óra1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                óra1MouseClicked(evt);
            }
        });
        masodikpalya.add(óra1);
        óra1.setBounds(420, 230, 230, 230);

        óra2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/ÓRA2.png"))); // NOI18N
        óra2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                óra2MouseClicked(evt);
            }
        });
        masodikpalya.add(óra2);
        óra2.setBounds(110, 230, 230, 230);

        óra3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/ÓRA3.png"))); // NOI18N
        óra3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                óra3MouseClicked(evt);
            }
        });
        masodikpalya.add(óra3);
        óra3.setBounds(420, 230, 230, 230);

        óra4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/ÓRA4.png"))); // NOI18N
        óra4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                óra4MouseClicked(evt);
            }
        });
        masodikpalya.add(óra4);
        óra4.setBounds(110, 230, 227, 230);

        óra5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/ÓRA5.png"))); // NOI18N
        óra5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                óra5MouseClicked(evt);
            }
        });
        masodikpalya.add(óra5);
        óra5.setBounds(420, 230, 230, 230);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jTextField1.setText("Melyik óra mutatja ");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        masodikpalya.add(jTextField1);
        jTextField1.setBounds(40, 150, 220, 40);

        köv1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        köv1.setText("EREDMÉNYED");
        köv1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        köv1.setEnabled(false);
        köv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                köv1ActionPerformed(evt);
            }
        });
        masodikpalya.add(köv1);
        köv1.setBounds(20, 60, 201, 37);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jTextField2.setMaximumSize(new java.awt.Dimension(0, 0));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        masodikpalya.add(jTextField2);
        jTextField2.setBounds(270, 150, 200, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setText("Kattints arra az órára amire kiváncsi a feladat!");
        masodikpalya.add(jLabel1);
        jLabel1.setBounds(10, 10, 512, 27);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "játékos kódja", "Neved"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        masodikpalya.add(jScrollPane1);
        jScrollPane1.setBounds(540, 10, 200, 124);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("kattints a  nevedre!     --->");
        masodikpalya.add(jLabel7);
        jLabel7.setBounds(230, 80, 303, 27);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Ahhoz hogy pontot gyűjts, ");
        masodikpalya.add(jLabel6);
        jLabel6.setBounds(230, 50, 303, 27);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("?");
        masodikpalya.add(jLabel2);
        jLabel2.setBounds(480, 160, 40, 40);

        hetevespalyak.addTab("Harmadik pálya", masodikpalya);

        getContentPane().add(hetevespalyak);
        hetevespalyak.setBounds(0, 0, 770, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void köv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_köv1ActionPerformed

        Vége_és_vissza_az_elejére v=new Vége_és_vissza_az_elejére(sta);
        v.setVisible(true);
        dispose();
    }//GEN-LAST:event_köv1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void óraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_óraMouseClicked
   ora();
    
   
    }//GEN-LAST:event_óraMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
beolv();
    }//GEN-LAST:event_formWindowOpened

    private void óra1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_óra1MouseClicked
   ora1();
    }//GEN-LAST:event_óra1MouseClicked

    private void óra2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_óra2MouseClicked
   ora2();
    }//GEN-LAST:event_óra2MouseClicked

    private void óra3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_óra3MouseClicked
   ora3();
    }//GEN-LAST:event_óra3MouseClicked

    private void óra4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_óra4MouseClicked
      ora4();
    }//GEN-LAST:event_óra4MouseClicked

    private void óra5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_óra5MouseClicked
      ora5();
    }//GEN-LAST:event_óra5MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int sor=jTable1.getSelectedRow();
        ID=Integer.parseInt(jTable1.getModel().getValueAt(sor, 0).toString());
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Nyolceves3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nyolceves3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nyolceves3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nyolceves3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nyolceves3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane hetevespalyak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton köv1;
    private javax.swing.JPanel masodikpalya;
    private javax.swing.JLabel óra;
    private javax.swing.JLabel óra1;
    private javax.swing.JLabel óra2;
    private javax.swing.JLabel óra3;
    private javax.swing.JLabel óra4;
    private javax.swing.JLabel óra5;
    // End of variables declaration//GEN-END:variables

    private void kezdés() {
   
             óra2.setVisible(false);
          óra3.setVisible(false);
          óra4.setVisible(false);
          óra5.setVisible(false);
          jTextField2.setText(tömb[szam]);
        }
       
    private void adat() {
        try{
   Connection con=DriverManager.getConnection(host,user,pass);
     String sql="UPDATE játékosadatok SET "
   +"pontszam=pontszam+1"
   +" WHERE id="+ID;
   
   Statement sta=con.createStatement();
   sta.executeUpdate(sql);
   sta.close();
   con.close();
    JOptionPane.showMessageDialog(null, "SZUPER VAGY :D");
 //  JOptionPane.showMessageDialog(null, "JÁR A PONT"); ELLENŐRÉS SZEMPONTJÁBÓL
  }
  catch(SQLException e)
{
JOptionPane.showMessageDialog(null, "Hiba");}

    }   
    
    private void beolv() {
DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
try{
        Connection con=DriverManager.getConnection(host,user,pass);
        String sql="SELECT * FROM játékosadatok";
        Statement sta=con.createStatement();
        ResultSet rs=sta.executeQuery(sql);
        while(rs.next())
        {
           model.addRow(new Object[]{rs.getInt("id"),rs.getString("nev")});
         }
        sta.close();
        con.close();
        }
        catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Hiba a beolvasás");}
    }
   
    private void ora() {
         String s="3 óra";
   if(tömb[szam].equals(s)){
       adat();
       óra.setVisible(false);
       óra1.setVisible(false);
       óra2.setVisible(true);
       óra3.setVisible(true);
           jTextField2.setText(tömb2[szam]);
  }else{
          JOptionPane.showMessageDialog(null, "Ajjaj se baj! Ez 3 őra!");
    óra.setVisible(false);
    óra1.setVisible(false);
    óra2.setVisible(true);
    óra3.setVisible(true);
     jTextField2.setText(tömb2[szam]);
   
   }
    }

    private void ora1() {
          String s="fél 3";
   if(tömb[szam].equals(s)){
       adat();
       óra.setVisible(false);
       óra1.setVisible(false);
       óra2.setVisible(true);
       óra3.setVisible(true);
        jTextField2.setText(tömb2[szam]);
  }else{
            JOptionPane.showMessageDialog(null, "Ajjaj se baj! Ez fél 3!");
    óra.setVisible(false);
    óra1.setVisible(false);
    óra2.setVisible(true);
    óra3.setVisible(true);
     jTextField2.setText(tömb2[szam]);}
    }

    private void ora2() {
          String s="háromnegyed 3";
   if(tömb2[szam].equals(s)){
        adat();
       óra2.setVisible(false);
       óra3.setVisible(false);
       óra4.setVisible(true);
       óra5.setVisible(true);
           jTextField2.setText(tömb3[szam]);
  }else{
            JOptionPane.showMessageDialog(null, "Ajjaj se baj! Ez háromnegyed 3!");
    óra2.setVisible(false);
    óra3.setVisible(false);
    óra4.setVisible(true);
    óra5.setVisible(true);
     jTextField2.setText(tömb3[szam]);
   
   }
    }

    private void ora3() {
     String s="fél 6";
   if(tömb2[szam].equals(s)){
        adat();
       óra2.setVisible(false);
       óra3.setVisible(false);
       óra4.setVisible(true);
       óra5.setVisible(true);
           jTextField2.setText(tömb3[szam]);
  }else{
       JOptionPane.showMessageDialog(null, "Ajjaj se baj! Ez fél 6!");
    óra2.setVisible(false);
    óra3.setVisible(false);
    óra4.setVisible(true);
    óra5.setVisible(true);
     jTextField2.setText(tömb3[szam]);
   
   }
    }

    private void ora4() {
     String s="negyed 8";
        if(tömb3[szam].equals(s)){
             adat();
       óra4.setVisible(false);
       óra5.setVisible(false);
       köv1.setEnabled(true);
        
  }else{
         JOptionPane.showMessageDialog(null, "Ajjaj se baj! Ez negyed 8!");    
    óra4.setVisible(false);
    óra5.setVisible(false);
    köv1.setEnabled(true);
   }
    }

    private void ora5() {
   String s="12 óra";
      if(tömb3[szam].equals(s)){
           adat();
       óra4.setVisible(false);
       óra5.setVisible(false);
        köv1.setEnabled(true);
  }else{
           JOptionPane.showMessageDialog(null, "Ajjaj se baj! Ez 12 óra!");    
    óra4.setVisible(false);
    óra5.setVisible(false);
      köv1.setEnabled(true);
   
   }
    }

 
 

 

    
}
