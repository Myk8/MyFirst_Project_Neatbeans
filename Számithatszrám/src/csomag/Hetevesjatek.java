/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csomag;




import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


/**
 *
 * @author Mikey
 */
public class Hetevesjatek extends javax.swing.JFrame {

   private Statement sta; //ELÉRHETŐSÉG TÖRTÉNÉSE
   String host="jdbc:mysql://localhost:3306/vizsga";
String user="root";
String pass="root";
private int  ID;

    Random rand = new Random(); //számok megjelenítése 0-tól-20-ig ELSŐ JÁTÉK
    //ELSŐ JÁTÉKRA VONATKOZIK
    int randomszam = rand.nextInt(21);
    int randomszam2 = rand.nextInt(21);
    int randomszam3 = rand.nextInt(21);
    int randomszam4 = rand.nextInt(21);
    int randomszam5 = rand.nextInt(21);
    int randomszam6 = rand.nextInt(21);
    int randomszam7 = rand.nextInt(21);
    int randomszam8 = rand.nextInt(21); 
    
    public Hetevesjatek() {initComponents();}

    //ENNEK AZ OLDAL ELÉRHETŐSÉGE
   public Hetevesjatek(Statement sta){
    initComponents();
    this.sta=sta;
      kezdés();}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hetevespalyak = new javax.swing.JTabbedPane();
        elsopalya = new javax.swing.JPanel();
        egyik = new javax.swing.JButton();
        másik = new javax.swing.JButton();
        egyenlo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        egyik1 = new javax.swing.JButton();
        másik1 = new javax.swing.JButton();
        egyenlo1 = new javax.swing.JButton();
        egyik2 = new javax.swing.JButton();
        másik2 = new javax.swing.JButton();
        egyenlo2 = new javax.swing.JButton();
        egyik3 = new javax.swing.JButton();
        másik3 = new javax.swing.JButton();
        egyenlo3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        köv = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("hétevesek\n");
        setMaximumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(876, 460));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        elsopalya.setBackground(new java.awt.Color(102, 153, 255));
        elsopalya.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        elsopalya.setLayout(null);

        egyik.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        egyik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                egyikMouseClicked(evt);
            }
        });
        egyik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egyikActionPerformed(evt);
            }
        });
        elsopalya.add(egyik);
        egyik.setBounds(320, 160, 190, 35);

        másik.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        másik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                másikActionPerformed(evt);
            }
        });
        elsopalya.add(másik);
        másik.setBounds(523, 160, 180, 35);

        egyenlo.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        egyenlo.setText("egyenlő");
        egyenlo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egyenloActionPerformed(evt);
            }
        });
        elsopalya.add(egyenlo);
        egyenlo.setBounds(720, 160, 127, 35);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setText("Válaszolj a kérdésre, kattints a megoldásra!");
        elsopalya.add(jLabel1);
        jLabel1.setBounds(10, 20, 483, 37);

        egyik1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        egyik1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egyik1ActionPerformed(evt);
            }
        });
        elsopalya.add(egyik1);
        egyik1.setBounds(320, 220, 187, 35);

        másik1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        másik1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                másik1ActionPerformed(evt);
            }
        });
        elsopalya.add(másik1);
        másik1.setBounds(510, 220, 187, 35);

        egyenlo1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        egyenlo1.setText("egyenlő");
        egyenlo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egyenlo1ActionPerformed(evt);
            }
        });
        elsopalya.add(egyenlo1);
        egyenlo1.setBounds(720, 220, 127, 35);

        egyik2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        egyik2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egyik2ActionPerformed(evt);
            }
        });
        elsopalya.add(egyik2);
        egyik2.setBounds(320, 280, 187, 35);

        másik2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        másik2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                másik2ActionPerformed(evt);
            }
        });
        elsopalya.add(másik2);
        másik2.setBounds(510, 280, 187, 35);

        egyenlo2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        egyenlo2.setText("egyenlő");
        egyenlo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egyenlo2ActionPerformed(evt);
            }
        });
        elsopalya.add(egyenlo2);
        egyenlo2.setBounds(720, 280, 127, 35);

        egyik3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        egyik3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egyik3ActionPerformed(evt);
            }
        });
        elsopalya.add(egyik3);
        egyik3.setBounds(320, 340, 187, 35);

        másik3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        másik3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                másik3ActionPerformed(evt);
            }
        });
        elsopalya.add(másik3);
        másik3.setBounds(510, 340, 187, 35);

        egyenlo3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        egyenlo3.setText("egyenlő");
        egyenlo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egyenlo3ActionPerformed(evt);
            }
        });
        elsopalya.add(egyenlo3);
        egyenlo3.setBounds(720, 340, 127, 35);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel2.setText("Melyik a legnagyobb szám?");
        elsopalya.add(jLabel2);
        jLabel2.setBounds(10, 160, 303, 27);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel3.setText("Melyik a legkisebb szám?");
        elsopalya.add(jLabel3);
        jLabel3.setBounds(10, 230, 279, 27);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel4.setText("Melyik a legnagyobb szám?");
        elsopalya.add(jLabel4);
        jLabel4.setBounds(10, 290, 303, 27);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel5.setText("Melyik a legkisebb szám?");
        elsopalya.add(jLabel5);
        jLabel5.setBounds(10, 340, 279, 27);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 51));
        jLabel6.setText("Ahhoz hogy pontot gyűjts, ");
        elsopalya.add(jLabel6);
        jLabel6.setBounds(270, 60, 303, 27);

        köv.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        köv.setText("Következő pálya!");
        köv.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        köv.setEnabled(false);
        köv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kövActionPerformed(evt);
            }
        });
        elsopalya.add(köv);
        köv.setBounds(10, 70, 237, 37);

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

        elsopalya.add(jScrollPane1);
        jScrollPane1.setBounds(610, 10, 200, 124);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("kattints a  nevedre!     --->");
        elsopalya.add(jLabel7);
        jLabel7.setBounds(270, 90, 303, 27);

        hetevespalyak.addTab("Első pálya", elsopalya);

        getContentPane().add(hetevespalyak);
        hetevespalyak.setBounds(0, 0, 870, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        beolvas();
    }//GEN-LAST:event_formWindowOpened

     /////ELÉRHETŐSÉG BEJELŐLÉSSEL
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int sor=jTable1.getSelectedRow();
        ID=Integer.parseInt(jTable1.getModel().getValueAt(sor, 0).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void kövActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kövActionPerformed
        Heteves2 h2=new Heteves2(sta);
        h2.setVisible(true);
        dispose();
    }//GEN-LAST:event_kövActionPerformed

    private void egyenlo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egyenlo3ActionPerformed
        egyenlő3();
    }//GEN-LAST:event_egyenlo3ActionPerformed

    private void másik3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_másik3ActionPerformed
        masik3();
    }//GEN-LAST:event_másik3ActionPerformed

    private void egyik3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egyik3ActionPerformed
        egyik3();
    }//GEN-LAST:event_egyik3ActionPerformed

    private void egyenlo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egyenlo2ActionPerformed
        egyenlő2();
    }//GEN-LAST:event_egyenlo2ActionPerformed

    private void másik2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_másik2ActionPerformed
        masik2();

    }//GEN-LAST:event_másik2ActionPerformed

    private void egyik2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egyik2ActionPerformed
        egyik2();

    }//GEN-LAST:event_egyik2ActionPerformed

    private void egyenlo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egyenlo1ActionPerformed
        egyenlő1();

    }//GEN-LAST:event_egyenlo1ActionPerformed

    private void másik1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_másik1ActionPerformed
        masik1();

    }//GEN-LAST:event_másik1ActionPerformed

    private void egyik1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egyik1ActionPerformed
        egyik1();
    }//GEN-LAST:event_egyik1ActionPerformed

    private void egyenloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egyenloActionPerformed
        egyenlő();
    }//GEN-LAST:event_egyenloActionPerformed

    private void másikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_másikActionPerformed
        masik();
    }//GEN-LAST:event_másikActionPerformed

    private void egyikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egyikActionPerformed
        egyik();

    }//GEN-LAST:event_egyikActionPerformed

    private void egyikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_egyikMouseClicked

    }//GEN-LAST:event_egyikMouseClicked

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
            java.util.logging.Logger.getLogger(Hetevesjatek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hetevesjatek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hetevesjatek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hetevesjatek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hetevesjatek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton egyenlo;
    private javax.swing.JButton egyenlo1;
    private javax.swing.JButton egyenlo2;
    private javax.swing.JButton egyenlo3;
    private javax.swing.JButton egyik;
    private javax.swing.JButton egyik1;
    private javax.swing.JButton egyik2;
    private javax.swing.JButton egyik3;
    private javax.swing.JPanel elsopalya;
    private javax.swing.JTabbedPane hetevespalyak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton köv;
    private javax.swing.JButton másik;
    private javax.swing.JButton másik1;
    private javax.swing.JButton másik2;
    private javax.swing.JButton másik3;
    // End of variables declaration//GEN-END:variables
 
    private void beolvas() { //ADATOK BEOLVASÁSA
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
        JOptionPane.showMessageDialog(null, "Hiba a beolvasás");
       
        }
    }
    
    private void adat() { //PONTSZÁM NÖVELÉSÉRE ALKALMAS
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
JOptionPane.showMessageDialog(null, "Hiba");
}
    }

    private void kezdés() {
 
     köv.setEnabled(false);//KÖVI OLDAL ZÁRVA LEGYEN ADDIG MÍG MEG NEM CSINÁLTÁL MINDENT
    
    //BEILESZTÉS FOLYAMATA!
        egyik.setText(Integer.toString(randomszam));
        másik.setText(Integer.toString(randomszam2));
        egyik1.setText(Integer.toString(randomszam3));
        másik1.setText(Integer.toString(randomszam4));
        egyik2.setText(Integer.toString(randomszam5));
        másik2.setText(Integer.toString(randomszam6));
        egyik3.setText(Integer.toString(randomszam7));
        másik3.setText(Integer.toString(randomszam8)); 
        
        
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        egyik1.setVisible(false);
        egyik2.setVisible(false);
        egyik3.setVisible(false);
        másik1.setVisible(false);
        másik2.setVisible(false);
        másik3.setVisible(false);
        egyenlo1.setVisible(false);
        egyenlo2.setVisible(false);
        egyenlo3.setVisible(false);
     }

    private void egyik() {
   if(randomszam>randomszam2){
            egyik.setText("SZÉP VOLT!");
            hang();
            egyik.setBackground(Color.green);
            adat();
            jTable1.setEnabled(false);
           //MERT VÁLASZOLTÁL
            másik.setEnabled(false); 
            egyenlo.setEnabled(false);
            //KÖVETKEZŐ FELADAT MEGJENÍTÉSE
            egyik1.setVisible(true); 
            másik1.setVisible(true);
            egyenlo1.setVisible(true);
            jLabel3.setVisible(true);}

        if(randomszam<randomszam2){
            egyik.setText("AJJAJ");
            hang2();
            //VÁLASZ MAGYARÁZATA
            JOptionPane.showMessageDialog(null,"SE BAJ! "+randomszam2+" a legnagyobb szám"); 
            egyik.setBackground(Color.red);
            //MERT VÁLASZOLTÁL
            másik.setEnabled(false);
            egyenlo.setEnabled(false);
            //KÖVETKEZŐ FELADAT MEGJENÍTÉSE
             egyik1.setVisible(true);
            másik1.setVisible(true);
            egyenlo1.setVisible(true);
            jLabel3.setVisible(true);
           }
         if(randomszam==randomszam2){
            egyik.setText("AJJAJ");
            hang2();JOptionPane.showMessageDialog(null,"SE BAJ! Ezek nem egyenlőek!");
            egyik.setBackground(Color.red);
            másik.setEnabled(false);
            egyenlo.setEnabled(false);
            
             egyik1.setVisible(true);
            másik1.setVisible(true);
            egyenlo1.setVisible(true);
            jLabel3.setVisible(true);
             }
      }
    private void egyik1() {
              if(randomszam3<randomszam4){
            egyik1.setText("SZÉP VOLT!");
              hang();
            egyik1.setBackground(Color.green);
        adat();
          másik1.setEnabled(false);
          egyenlo1.setEnabled(false);
          
               egyik2.setVisible(true);
            másik2.setVisible(true);
            egyenlo2.setVisible(true);
            jLabel4.setVisible(true);}

        if(randomszam3>randomszam4){
            egyik1.setText("AJJAJ");
              hang2();JOptionPane.showMessageDialog(null,"SE BAJ! "+randomszam4+" a legkisebb szám!");
            egyik1.setBackground(Color.red);
              másik1.setEnabled(false);
          egyenlo1.setEnabled(false);
          
            egyik2.setVisible(true);
            másik2.setVisible(true);
            egyenlo2.setVisible(true);
            jLabel4.setVisible(true);
        }

        if(randomszam3==randomszam4){
            egyik1.setText("AJJAJ");
              hang2();JOptionPane.showMessageDialog(null,"SE BAJ! Ezek nem egyenlőek!");
            egyik1.setBackground(Color.red);
          másik1.setEnabled(false);
          egyenlo1.setEnabled(false);
        
          egyik2.setVisible(true);
            másik2.setVisible(true);
            egyenlo2.setVisible(true);
            jLabel4.setVisible(true);}
    }
    private void egyik2() {
         if(randomszam5>randomszam6){
            egyik2.setText("SZÉP VOLT!");
              hang();
            egyik2.setBackground(Color.green);
        adat();
         másik2.setEnabled(false);
          egyenlo2.setEnabled(false);
          
         egyik3.setVisible(true);
            másik3.setVisible(true);
            egyenlo3.setVisible(true);
            jLabel5.setVisible(true);
         }

        if(randomszam5<randomszam6){
            egyik2.setText("AJJAJ");
              hang2();JOptionPane.showMessageDialog(null,"SE BAJ! "+randomszam6+" a legnagyobb szám!");
            egyik2.setBackground(Color.red);
        másik2.setEnabled(false);
          egyenlo2.setEnabled(false);
          
         egyik3.setVisible(true);
            másik3.setVisible(true);
            egyenlo3.setVisible(true);
            jLabel5.setVisible(true);}

        if(randomszam5==randomszam6){
            egyik2.setText("AJJAJ");
              hang2();JOptionPane.showMessageDialog(null,"SE BAJ! Ezek nem egyenlőek!");
            egyik2.setBackground(Color.red);
            másik2.setEnabled(false);
          egyenlo2.setEnabled(false);
          
           egyik3.setVisible(true);
            másik3.setVisible(true);
            egyenlo3.setVisible(true);
            jLabel5.setVisible(true);
}
    }
    private void egyik3() {
        if(randomszam7<randomszam8){
            egyik3.setText("SZÉP VOLT!");
              hang();
            egyik3.setBackground(Color.green);
            
adat();
egyenlo3.setEnabled(false);
          másik3.setEnabled(false);
           köv.setEnabled(true);
        }
        if(randomszam7>randomszam8){
            egyik3.setText("AJJAJ");
              hang2();JOptionPane.showMessageDialog(null,"SE BAJ! "+randomszam8+" a legkisebb szám!");
            egyik3.setBackground(Color.red);
            egyenlo3.setEnabled(false);
          másik3.setEnabled(false);
    köv.setEnabled(true);
    
        }if(randomszam7==randomszam8){
            egyik3.setText("AJJAJ");
              hang2();JOptionPane.showMessageDialog(null,"SE BAJ! Ezek nem egyenlőek!");
            egyik3.setBackground(Color.red);
            egyenlo3.setEnabled(false);
          másik3.setEnabled(false);
    köv.setEnabled(true);
        }
      }
 
    private void masik() {
         if(randomszam2>randomszam){
            másik.setText("SZÉP VOLT!");
              hang();
            másik.setBackground(Color.green);
       adat(); //PLUSZ PONT
       jTable1.setEnabled(false);
            
            egyik.setEnabled(false);
            egyenlo.setEnabled(false);
            
            egyik1.setVisible(true);
            másik1.setVisible(true);
            egyenlo1.setVisible(true);
            jLabel3.setVisible(true);
        }

        if(randomszam2<randomszam){
            másik.setText("AJJAJ");
              hang2();JOptionPane.showMessageDialog(null,"SE BAJ! "+randomszam+" a legnagyobb szám");
            másik.setBackground(Color.red);
         egyik.setEnabled(false);
            egyenlo.setEnabled(false);
        
            egyik1.setVisible(true);
            másik1.setVisible(true);
            egyenlo1.setVisible(true);
            jLabel3.setVisible(true);
        }

        if(randomszam2==randomszam){
            másik.setText("AJJAJ");
              hang2();JOptionPane.showMessageDialog(null,"SE BAJ! Ezek nem egyenlőek!");
            másik.setBackground(Color.red);
         egyik.setEnabled(false);
            egyenlo.setEnabled(false);
        
        egyik1.setVisible(true);
            másik1.setVisible(true);
            egyenlo1.setVisible(true);
            jLabel3.setVisible(true);}
    }
    private void masik1() {
     if(randomszam4<randomszam3){
            másik1.setText("SZÉP VOLT!");
              hang();
            másik1.setBackground(Color.green);
        adat();
          egyik1.setEnabled(false);
          egyenlo1.setEnabled(false);
     
               egyik2.setVisible(true);
            másik2.setVisible(true);
            egyenlo2.setVisible(true);
            jLabel4.setVisible(true);}

        if(randomszam4>randomszam3){
            másik1.setText("AJJAJ!");
              hang2();JOptionPane.showMessageDialog(null,"SE BAJ! "+randomszam3+" a legkisebb szám!");
            másik1.setBackground(Color.red);
         egyik1.setEnabled(false);
          egyenlo1.setEnabled(false);
        
               egyik2.setVisible(true);
            másik2.setVisible(true);
            egyenlo2.setVisible(true);
            jLabel4.setVisible(true);}

        if(randomszam3==randomszam4){
            másik1.setText("AJJAJ!");
              hang2();JOptionPane.showMessageDialog(null,"SE BAJ! Ezek nem egyenlőek!");
            másik1.setBackground(Color.red);
         egyik1.setEnabled(false);
          egyenlo1.setEnabled(false);
        
               egyik2.setVisible(true);
            másik2.setVisible(true);
            egyenlo2.setVisible(true);
            jLabel4.setVisible(true);}
    }
    private void masik2() {
         if(randomszam6>randomszam5){
            másik2.setText("SZÉP VOLT!");
              hang();
            másik2.setBackground(Color.green);
            adat();
            egyik2.setEnabled(false);
          egyenlo2.setEnabled(false);
          
         egyik3.setVisible(true);
            másik3.setVisible(true);
            egyenlo3.setVisible(true);
            jLabel5.setVisible(true);
          

        }
        if(randomszam6<randomszam5){
            másik2.setText("AJJAJ");
              hang2();JOptionPane.showMessageDialog(null,"SE BAJ! "+randomszam5+" a legnagyobb szám");
            másik2.setBackground(Color.red);
                        egyik2.setEnabled(false);
          egyenlo2.setEnabled(false);
          
          egyik3.setVisible(true);
            másik3.setVisible(true);
            egyenlo3.setVisible(true);
            jLabel5.setVisible(true);

        }
        if(randomszam5==randomszam6){
            másik2.setText("AJJAJ");
              hang2();JOptionPane.showMessageDialog(null,"SE BAJ! Ezek nem egyenlőek!");
            másik2.setBackground(Color.red);
                  egyik2.setEnabled(false);
          egyenlo2.setEnabled(false);
          
          egyik3.setVisible(true);
            másik3.setVisible(true);
            egyenlo3.setVisible(true);
            jLabel5.setVisible(true);
        }
     }
     private void masik3() {
                if(randomszam8<randomszam7){
            másik3.setText("SZÉP VOLT!");
              hang();
            másik3.setBackground(Color.green);
adat();
egyenlo3.setEnabled(false);
          egyik3.setEnabled(false);
              köv.setEnabled(true);
        }
        if(randomszam8>randomszam7){
            másik3.setText("AJJAJ");
              hang2();JOptionPane.showMessageDialog(null,"SE BAJ! "+randomszam7+" a legkisebb szám");
            másik3.setBackground(Color.red);
            egyenlo3.setEnabled(false);
          egyik3.setEnabled(false);
              köv.setEnabled(true);

        }
        if(randomszam8==randomszam7){
            másik3.setText("AJJAJ");
              hang2();JOptionPane.showMessageDialog(null,"SE BAJ! Ezek nem egyenlőek!");
            másik3.setBackground(Color.red);
            egyenlo3.setEnabled(false);
          egyik3.setEnabled(false);
              köv.setEnabled(true);
        }
     }
  
   private void egyenlő() {
         if(randomszam==randomszam2){
            egyenlo.setText("SZÉP VOLT!");
              hang();
            egyenlo.setBackground(Color.green);
            adat();
 jTable1.setEnabled(false);
  egyik.setEnabled(false);
  másik.setEnabled(false);
  
  egyik1.setVisible(true);
            másik1.setVisible(true);
            egyenlo1.setVisible(true);
            jLabel3.setVisible(true);
        }
        if(randomszam!=randomszam2){
            egyenlo.setText("AJJAJ");
              hang2();JOptionPane.showMessageDialog(null,"SE BAJ! Ezek nem egyenlőek!");
            egyenlo.setBackground(Color.red);
 egyik.setEnabled(false);
  másik.setEnabled(false);
  
  egyik1.setVisible(true);
            másik1.setVisible(true);
            egyenlo1.setVisible(true);
            jLabel3.setVisible(true);
        }
    }
   private void egyenlő1() {
        if(randomszam3==randomszam4){
            egyenlo1.setText("SZÉP VOLT!");
              hang();
            egyenlo1.setBackground(Color.green);
        adat();
         egyik1.setEnabled(false);
          másik1.setEnabled(false);
        
               egyik2.setVisible(true);
            másik2.setVisible(true);
            egyenlo2.setVisible(true);
            jLabel4.setVisible(true);
        }
        
        if(randomszam3!=randomszam4){
            egyenlo1.setText("AJJAJ");
              hang2();JOptionPane.showMessageDialog(null,"SE BAJ! Ezek nem egyenlőek!");
            egyenlo1.setBackground(Color.red);
         egyik1.setEnabled(false);
          másik1.setEnabled(false);
        
        egyik2.setVisible(true);
            másik2.setVisible(true);
            egyenlo2.setVisible(true);
            jLabel4.setVisible(true);}
      }
   private void egyenlő2() {
                if(randomszam5==randomszam6){
            egyenlo2.setText("SZÉP VOLT!");
              hang();
            egyenlo2.setBackground(Color.green);
adat();
            egyik2.setEnabled(false);
          másik2.setEnabled(false);
          
           egyik3.setVisible(true);
            másik3.setVisible(true);
            egyenlo3.setVisible(true);
            jLabel5.setVisible(true);
        }
        if(randomszam5!=randomszam6){
            egyenlo2.setText("AJJAJ");
              hang2();JOptionPane.showMessageDialog(null,"SE BAJ! Ezek nem egyenlőek!");
            egyenlo2.setBackground(Color.red);
            egyik2.setEnabled(false);
          másik2.setEnabled(false);
          
           egyik3.setVisible(true);
            másik3.setVisible(true);
            egyenlo3.setVisible(true);
            jLabel5.setVisible(true);
        }
     }
   private void egyenlő3() {
                if(randomszam7==randomszam8){
            egyenlo3.setText("SZÉP VOLT!");
              hang();
            egyenlo3.setBackground(Color.green);
             jTable1.setEnabled(false);
adat();
másik3.setEnabled(false);
          egyik3.setEnabled(false);
              köv.setEnabled(true);
        }
        if(randomszam7!=randomszam8){
            egyenlo3.setText("AJJAJ");
              hang2();JOptionPane.showMessageDialog(null,"SE BAJ! Ezek nem egyenlőek!");
            egyenlo3.setBackground(Color.red);
            másik3.setEnabled(false);
          egyik3.setEnabled(false);
              köv.setEnabled(true);

        }
     }

    private void hang() {
          InputStream in;
try{
in=new FileInputStream(new File ("src\\hangok\\szépvolt.wav"));
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
in=new FileInputStream(new File ("src\\hangok\\ajjaj.wav"));
AudioStream ad=new AudioStream(in); 
AudioPlayer.player.start(ad);
}
catch(IOException e){
JOptionPane.showMessageDialog(null, "Hiba");  
}
     }
    }


