/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csomag;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


/**
 *
 * @author Mikey
 */
public class Nyolceves2 extends javax.swing.JFrame {
String host="jdbc:mysql://localhost:3306/vizsga";
String user="root";
String pass="root";
private int  ID;
private Statement sta;


    public Nyolceves2() {
        initComponents(); 
        
       }
    
 public Nyolceves2(Statement sta){
    initComponents();
    this.sta=sta;
    játékkezd();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hetevespalyak = new javax.swing.JTabbedPane();
        masodikpalya = new javax.swing.JPanel();
        köv1 = new javax.swing.JButton();
        z1 = new javax.swing.JLabel();
        z2 = new javax.swing.JLabel();
        z3 = new javax.swing.JLabel();
        z4 = new javax.swing.JLabel();
        z5 = new javax.swing.JLabel();
        s1 = new javax.swing.JLabel();
        s2 = new javax.swing.JLabel();
        s3 = new javax.swing.JLabel();
        s4 = new javax.swing.JLabel();
        s5 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        egy = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        kettő = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        három = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        GOMB = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nyolcévesek2");
        setPreferredSize(new java.awt.Dimension(938, 613));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        hetevespalyak.setPreferredSize(new java.awt.Dimension(938, 613));

        masodikpalya.setBackground(new java.awt.Color(102, 153, 255));
        masodikpalya.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        masodikpalya.setMaximumSize(new java.awt.Dimension(0, 0));
        masodikpalya.setLayout(null);

        köv1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        köv1.setText("Következő pálya!");
        köv1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        köv1.setEnabled(false);
        köv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                köv1ActionPerformed(evt);
            }
        });
        masodikpalya.add(köv1);
        köv1.setBounds(20, 90, 237, 37);

        z1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/szorny1a.png"))); // NOI18N
        z1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                z1MouseEntered(evt);
            }
        });
        masodikpalya.add(z1);
        z1.setBounds(150, 340, 130, 180);

        z2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/szorny1b.png"))); // NOI18N
        z2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                z2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                z2MouseExited(evt);
            }
        });
        masodikpalya.add(z2);
        z2.setBounds(150, 340, 130, 180);

        z3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/szorny1c.png"))); // NOI18N
        z3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                z3MouseEntered(evt);
            }
        });
        masodikpalya.add(z3);
        z3.setBounds(150, 340, 130, 180);

        z4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/szorny1d.png"))); // NOI18N
        masodikpalya.add(z4);
        z4.setBounds(150, 340, 130, 180);

        z5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/szorny1e.png"))); // NOI18N
        z5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                z5MouseEntered(evt);
            }
        });
        masodikpalya.add(z5);
        z5.setBounds(150, 340, 130, 180);

        s1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/szorny3a.png"))); // NOI18N
        s1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                s1MouseEntered(evt);
            }
        });
        masodikpalya.add(s1);
        s1.setBounds(400, 350, 130, 180);

        s2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/szorny3b.png"))); // NOI18N
        s2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                s2MouseExited(evt);
            }
        });
        masodikpalya.add(s2);
        s2.setBounds(400, 350, 130, 180);

        s3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/szorny3c.png"))); // NOI18N
        s3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                s3MouseEntered(evt);
            }
        });
        masodikpalya.add(s3);
        s3.setBounds(400, 350, 130, 180);

        s4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/szorny3d.png"))); // NOI18N
        masodikpalya.add(s4);
        s4.setBounds(400, 350, 130, 180);

        s5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/szorny3e.png"))); // NOI18N
        s5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                s5MouseEntered(evt);
            }
        });
        masodikpalya.add(s5);
        s5.setBounds(400, 350, 130, 180);

        p1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/szorny2.png"))); // NOI18N
        p1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p1MouseEntered(evt);
            }
        });
        masodikpalya.add(p1);
        p1.setBounds(680, 360, 130, 180);

        p2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/szorny2b.png"))); // NOI18N
        p2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p2MouseExited(evt);
            }
        });
        masodikpalya.add(p2);
        p2.setBounds(680, 360, 130, 180);

        p3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/szorny2c.png"))); // NOI18N
        p3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p3MouseEntered(evt);
            }
        });
        masodikpalya.add(p3);
        p3.setBounds(680, 360, 130, 180);

        p4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/szorny2d.png"))); // NOI18N
        masodikpalya.add(p4);
        p4.setBounds(680, 360, 130, 180);

        p5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/szorny2e.png"))); // NOI18N
        p5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p5MouseEntered(evt);
            }
        });
        masodikpalya.add(p5);
        p5.setBounds(680, 360, 130, 180);

        egy.setEditable(false);
        egy.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        egy.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        egy.setBorder(null);
        egy.setMaximumSize(new java.awt.Dimension(0, 0));
        egy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egyActionPerformed(evt);
            }
        });
        masodikpalya.add(egy);
        egy.setBounds(80, 250, 180, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/bubisszöveg.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        masodikpalya.add(jLabel1);
        jLabel1.setBounds(50, 210, 230, 130);

        kettő.setEditable(false);
        kettő.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        kettő.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kettő.setBorder(null);
        kettő.setMaximumSize(new java.awt.Dimension(0, 0));
        kettő.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kettőActionPerformed(evt);
            }
        });
        masodikpalya.add(kettő);
        kettő.setBounds(330, 260, 180, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/bubisszöveg.png"))); // NOI18N
        jLabel2.setText("jLabel1");
        masodikpalya.add(jLabel2);
        jLabel2.setBounds(300, 220, 230, 130);

        három.setEditable(false);
        három.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        három.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        három.setBorder(null);
        három.setMaximumSize(new java.awt.Dimension(0, 0));
        három.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                háromActionPerformed(evt);
            }
        });
        masodikpalya.add(három);
        három.setBounds(610, 270, 180, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/bubisszöveg.png"))); // NOI18N
        jLabel3.setText("jLabel1");
        masodikpalya.add(jLabel3);
        jLabel3.setBounds(580, 230, 230, 130);

        GOMB.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        GOMB.setText("következő");
        GOMB.setEnabled(false);
        GOMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GOMBActionPerformed(evt);
            }
        });
        masodikpalya.add(GOMB);
        GOMB.setBounds(20, 50, 160, 37);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Melyik szörnyecske mond igazat? kattitns rá!");
        masodikpalya.add(jLabel4);
        jLabel4.setBounds(10, 20, 540, 29);

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
        jScrollPane1.setBounds(640, 20, 200, 124);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("kattints a  nevedre!     --->");
        masodikpalya.add(jLabel7);
        jLabel7.setBounds(330, 90, 303, 27);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Ahhoz hogy pontot gyűjts, ");
        masodikpalya.add(jLabel6);
        jLabel6.setBounds(330, 60, 303, 27);

        hetevespalyak.addTab("Második pálya", masodikpalya);

        getContentPane().add(hetevespalyak);
        hetevespalyak.setBounds(0, 0, 930, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void köv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_köv1ActionPerformed
        Nyolceves3 h1=new Nyolceves3(sta);
        h1.setVisible(true);
        dispose();
    }//GEN-LAST:event_köv1ActionPerformed

    private void egyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egyActionPerformed
   
    }//GEN-LAST:event_egyActionPerformed

    private void kettőActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kettőActionPerformed

    }//GEN-LAST:event_kettőActionPerformed

    private void háromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_háromActionPerformed
 
    }//GEN-LAST:event_háromActionPerformed

    private void z1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_z1MouseEntered
   z1.setVisible(false); z2.setVisible(true);
    }//GEN-LAST:event_z1MouseEntered

    private void z2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_z2MouseExited
     z2.setVisible(false);z1.setVisible(true);
    }//GEN-LAST:event_z2MouseExited

    private void z2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_z2MouseClicked
  zöld();
    }//GEN-LAST:event_z2MouseClicked

    private void z5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_z5MouseEntered
      z1.setVisible(false);
      z2.setVisible(false);
      z5.setVisible(true);
    }//GEN-LAST:event_z5MouseEntered

    private void GOMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GOMBActionPerformed
       gomb();
       gomb2(); 
      
    }//GEN-LAST:event_GOMBActionPerformed

    private void s1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s1MouseEntered
      s1.setVisible(false); s2.setVisible(true);
    }//GEN-LAST:event_s1MouseEntered

    private void s2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s2MouseExited
    s2.setVisible(false);s1.setVisible(true);
    }//GEN-LAST:event_s2MouseExited

    private void s2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s2MouseClicked
sárga();
 
 
    }//GEN-LAST:event_s2MouseClicked

    private void s3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s3MouseEntered
    s1.setVisible(false);
      s2.setVisible(false);
      s3.setVisible(true);
    }//GEN-LAST:event_s3MouseEntered

    private void p1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MouseEntered
      p1.setVisible(false); p2.setVisible(true);
    }//GEN-LAST:event_p1MouseEntered

    private void p2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MouseExited
      p2.setVisible(false);p1.setVisible(true);
    }//GEN-LAST:event_p2MouseExited

    private void p2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MouseClicked
    piros();
   
    }//GEN-LAST:event_p2MouseClicked

    private void p3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3MouseEntered
    p1.setVisible(false);
      p2.setVisible(false);
      p3.setVisible(true);
    }//GEN-LAST:event_p3MouseEntered

    private void s5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s5MouseEntered
      s1.setVisible(false);
      s2.setVisible(false);
      s5.setVisible(true);
    }//GEN-LAST:event_s5MouseEntered

    private void z3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_z3MouseEntered
        z1.setVisible(false);
      z2.setVisible(false);
      z3.setVisible(true);
    }//GEN-LAST:event_z3MouseEntered

    private void p5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5MouseEntered
        p1.setVisible(false);
      p2.setVisible(false);
      p5.setVisible(true);
    }//GEN-LAST:event_p5MouseEntered

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
   beolvas(); 
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Nyolceves2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nyolceves2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nyolceves2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nyolceves2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nyolceves2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GOMB;
    private javax.swing.JTextField egy;
    private javax.swing.JTabbedPane hetevespalyak;
    private javax.swing.JTextField három;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField kettő;
    private javax.swing.JButton köv1;
    private javax.swing.JPanel masodikpalya;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    private javax.swing.JLabel s1;
    private javax.swing.JLabel s2;
    private javax.swing.JLabel s3;
    private javax.swing.JLabel s4;
    private javax.swing.JLabel s5;
    private javax.swing.JLabel z1;
    private javax.swing.JLabel z2;
    private javax.swing.JLabel z3;
    private javax.swing.JLabel z4;
    private javax.swing.JLabel z5;
    // End of variables declaration//GEN-END:variables

    private void játékkezd() {
       //KÉPEK ANIMÁLÁS
     Animálás();
       //SZÖBEGBUBORÉK
       egy.setText("30 az páros szám");
       kettő.setText("45+30=74");
       három.setText("20:7=2");}
    
    private void Animálás() {
      z1.setVisible(true);
      z2.setVisible(false);
      z3.setVisible(false);
      z4.setVisible(false);
      z5.setVisible(false);
      
       s1.setVisible(true);
       s2.setVisible(false);
        s3.setVisible(false);
         s4.setVisible(false);
          s5.setVisible(false);
          
       p1.setVisible(true);
       p2.setVisible(false);
       p3.setVisible(false);
       p4.setVisible(false);
       p5.setVisible(false);
       
       }
    
    private void gomb() {
Animálás();
       egy.setText("8x5=41");
       kettő.setText("40:10=4");
       három.setText("26 páratlan szám");
       GOMB.setEnabled(false);
       }

    private void sárga() {
String z=  "30 az páros szám";
String v="40:10=4"; 
 String u="10x10=100";

if((egy.getText().equals(z))){
  kettő.setText("AJJAJ");
  hang2();
  //SÁRGA PIROS SZÖRNY
  s1.setVisible(false);
  s2.setVisible(false);
  s3.setVisible(true);
  p1.setVisible(false);
  p2.setVisible(false);
  p3.setVisible(true);
  
  //ZÖLDSZÖRNY
  z1.setVisible(false);
  z2.setVisible(false);
  z4.setVisible(true);
   //GOMB
     GOMB.setEnabled(true);
  }
  if(kettő.getText().equals(v)){
   s1.setVisible(false);
      s2.setVisible(false);
      s5.setVisible(true);
     kettő.setText("HURRÁ");
     hang();
    
     adat();
     GOMB.setEnabled(true);
     GOMB.setText("Utolsó");
     
      p1.setVisible(false);
      p2.setVisible(false);
      p4.setVisible(true);
      
      z1.setVisible(false);
      z2.setVisible(false);
      z4.setVisible(true);
  }if((három.getText().equals(u))){
  kettő.setText("AJJAJ");
   hang2();
  
  //SÁRGA PIROS SZÖRNY
  s1.setVisible(false);
  s2.setVisible(false);
  s3.setVisible(true);
  z1.setVisible(false);
  z2.setVisible(false);
  z3.setVisible(true);
  
  //ZÖLDSZÖRNY
  p1.setVisible(false);
  p2.setVisible(false);
  p4.setVisible(true);
   //GOMB
     köv1.setEnabled(true);
  }}

    private void piros() {
       String z=  "30 az páros szám";
         String v="40:10=4";
          String u="10x10=100";
          
  if((egy.getText().equals(z))){
  három.setText("AJJAJ");
   hang2();
  
  //SÁRGA PIROS SZÖRNY
  s1.setVisible(false);
  s2.setVisible(false);
  s3.setVisible(true);
  
  p1.setVisible(false);
  p2.setVisible(false);
  p3.setVisible(true);
  
  //ZÖLDSZÖRNY
  z1.setVisible(false);
  z2.setVisible(false);
  z4.setVisible(true);
   //GOMB
     GOMB.setEnabled(true);}
  if((kettő.getText().equals(v))){
  kettő.setText("AJJAJ");
   hang2();
  
  //SÁRGA PIROS SZÖRNY
  p1.setVisible(false);
  p2.setVisible(false);
  p3.setVisible(true);
  z1.setVisible(false);
  z2.setVisible(false);
  z3.setVisible(true);
  
  //ZÖLDSZÖRNY
  s1.setVisible(false);
  s2.setVisible(false);
  s4.setVisible(true);
   //GOMB
     GOMB.setEnabled(true);
     GOMB.setText("Utolsó");
  }if(három.getText().equals(u)){
      p1.setVisible(false);
      p2.setVisible(false);
      p5.setVisible(true);
       
      //PIROS
      s1.setVisible(false);
      s2.setVisible(false);
      s4.setVisible(true);
   három.setText("HURRÁ");
    hang();
      adat();
   
      //SÁRGA 
      z1.setVisible(false);
      z2.setVisible(false);
      z4.setVisible(true);
      //GOMB
     köv1.setEnabled(true);}
 }

    private void zöld() {
   String z=  "30 az páros szám";
   String v="40:10=4";
   String u="10x10=100";
         
  if(egy.getText().equals(z)){
      //ZÖLD 
      z1.setVisible(false);
      z2.setVisible(false);
      z5.setVisible(true);
       
      //PIROS
      p1.setVisible(false);
      p2.setVisible(false);
      p4.setVisible(true);
   egy.setText("HURRÁ");
    hang();
      adat();
   
      //SÁRGA 
      s1.setVisible(false);
      s2.setVisible(false);
      s4.setVisible(true);
      //GOMB
     GOMB.setEnabled(true);}
  if((kettő.getText().equals(v))){
  egy.setText("AJJAJ");
   hang2();
  
  //PIROS ZÖLD
  p1.setVisible(false);
  p2.setVisible(false);
  p3.setVisible(true);
  z1.setVisible(false);
  z2.setVisible(false);
  z3.setVisible(true);
  
  //SÁRGA
  s1.setVisible(false);
  s2.setVisible(false);
  s4.setVisible(true);
   //GOMB
     GOMB.setEnabled(true);
     GOMB.setText("Utolsó");}
  
  if((három.getText().equals(u))){
  kettő.setText("AJJAJ");
   hang2();
  
  //SÁRGA PIROS SZÖRNY
  s1.setVisible(false);
  s2.setVisible(false);
  s3.setVisible(true);
  z1.setVisible(false);
  z2.setVisible(false);
  z3.setVisible(true);
  
  //ZÖLDSZÖRNY
  p1.setVisible(false);
  p2.setVisible(false);
  p4.setVisible(true);
   //GOMB
     köv1.setEnabled(true);
  }
    }

    private void gomb2() {
       
          String v="Utolsó";
        if((GOMB.getText().equals(v))){
            Animálás();
         egy.setText("44-12=21");
       kettő.setText("81:9=3");
       három.setText("10x10=100");
       GOMB.setEnabled(false);
        }
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
 //  JOptionPane.showMessageDialog(null, "JÁR A PONT"); ELLENŐRÉS SZEMPONTJÁBÓL
  }
  catch(SQLException e)
{
JOptionPane.showMessageDialog(null, "Hiba");}
       }

    private void beolvas() {
   {
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
    }

       private void hang() {
       InputStream in;
try{
in=new FileInputStream(new File ("src\\hangok\\Szörny hurrá.wav"));
AudioStream ad=new AudioStream(in); 
AudioPlayer.player.start(ad);
}
catch(IOException e){
JOptionPane.showMessageDialog(null, "Hiba");  
}
    }
    
    private void hang2() {
             InputStream in;
try{
in=new FileInputStream(new File ("src\\hangok\\Szörny ajjaj.wav"));
AudioStream ad=new AudioStream(in); 
AudioPlayer.player.start(ad);
}
catch(IOException e){
JOptionPane.showMessageDialog(null, "Hiba");  
}
    }

 
}
