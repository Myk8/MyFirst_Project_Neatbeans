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
public class Heteves3 extends javax.swing.JFrame {
private Statement sta; //ÚJ OLDAL
String host="jdbc:mysql://localhost:3306/vizsga";
String user="root";
String pass="root";
private int  ID;
// ---TÖMBÖK
int[]tomb;
int[]tomb2;
int[]tomb3;
//----------
int szam=(int)(Math.random()*3);//HÁROM RANDOMOT GENERLÁS


    public Heteves3() {
        initComponents();
        
    }

     public Heteves3(Statement sta){
    initComponents();
    this.sta=sta; 
    kezdés();
     }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hetevespalyak = new javax.swing.JTabbedPane();
        harmadikpalya = new javax.swing.JPanel();
        köv1 = new javax.swing.JButton();
        P = new javax.swing.JLabel();
        sam = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        k = new javax.swing.JLabel();
        k2 = new javax.swing.JLabel();
        k3 = new javax.swing.JLabel();
        k4 = new javax.swing.JLabel();
        k5 = new javax.swing.JLabel();
        k6 = new javax.swing.JLabel();
        K7 = new javax.swing.JLabel();
        K8 = new javax.swing.JLabel();
        K9 = new javax.swing.JLabel();
        E3 = new javax.swing.JLabel();
        E2 = new javax.swing.JLabel();
        E1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hétévesek3");
        setMaximumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(992, 650));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        harmadikpalya.setBackground(new java.awt.Color(102, 153, 255));
        harmadikpalya.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        harmadikpalya.setLayout(null);

        köv1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        köv1.setText("EREDMÉNYED");
        köv1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        köv1.setEnabled(false);
        köv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                köv1ActionPerformed(evt);
            }
        });
        harmadikpalya.add(köv1);
        köv1.setBounds(10, 80, 201, 37);

        P.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        P.setText("Melyik állatból van ");
        harmadikpalya.add(P);
        P.setBounds(10, 20, 230, 27);

        sam.setEditable(false);
        sam.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        sam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                samActionPerformed(evt);
            }
        });
        harmadikpalya.add(sam);
        sam.setBounds(230, 10, 70, 70);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setText("darab? Kattints a válaszra!");
        harmadikpalya.add(jLabel1);
        jLabel1.setBounds(310, 20, 330, 27);

        k.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/pingvinkilenc.png"))); // NOI18N
        k.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kMouseEntered(evt);
            }
        });
        harmadikpalya.add(k);
        k.setBounds(410, 210, 230, 250);

        k2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/cicanégy.png"))); // NOI18N
        k2.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                k2MouseWheelMoved(evt);
            }
        });
        k2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                k2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                k2MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k2MouseEntered(evt);
            }
        });
        harmadikpalya.add(k2);
        k2.setBounds(90, 260, 180, 190);

        k3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/katica.png"))); // NOI18N
        k3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                k3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                k3MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k3MouseEntered(evt);
            }
        });
        harmadikpalya.add(k3);
        k3.setBounds(780, 310, 80, 60);

        k4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/cicakettő.png"))); // NOI18N
        k4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                k4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                k4MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k4MouseEntered(evt);
            }
        });
        harmadikpalya.add(k4);
        k4.setBounds(740, 300, 150, 100);

        k5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/pingvinnyolc.png"))); // NOI18N
        k5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                k5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                k5MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k5MouseEntered(evt);
            }
        });
        harmadikpalya.add(k5);
        k5.setBounds(380, 250, 290, 180);

        k6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/katica5.png"))); // NOI18N
        k6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                k6MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                k6MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k6MouseEntered(evt);
            }
        });
        harmadikpalya.add(k6);
        k6.setBounds(70, 300, 252, 109);

        K7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/katica3.png"))); // NOI18N
        K7.setText("jLabel2");
        K7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                K7MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                K7MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                K7MouseEntered(evt);
            }
        });
        K7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                K7KeyPressed(evt);
            }
        });
        harmadikpalya.add(K7);
        K7.setBounds(740, 300, 140, 100);
        K7.getAccessibleContext().setAccessibleName("");

        K8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/pingvinhét.png"))); // NOI18N
        K8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                K8MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                K8MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                K8MouseEntered(evt);
            }
        });
        harmadikpalya.add(K8);
        K8.setBounds(60, 280, 280, 160);

        K9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/cicahat.png"))); // NOI18N
        K9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                K9MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                K9MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                K9MouseEntered(evt);
            }
        });
        harmadikpalya.add(K9);
        K9.setBounds(390, 250, 260, 180);

        E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/karikakicsi.png"))); // NOI18N
        harmadikpalya.add(E3);
        E3.setBounds(720, 260, 190, 170);

        E2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/karika.png"))); // NOI18N
        harmadikpalya.add(E2);
        E2.setBounds(10, 220, 350, 306);

        E1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/karikaÓRIÁS.png"))); // NOI18N
        harmadikpalya.add(E1);
        E1.setBounds(330, 140, 390, 420);

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

        harmadikpalya.add(jScrollPane1);
        jScrollPane1.setBounds(680, 10, 200, 124);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("kattints a  nevedre!     --->");
        harmadikpalya.add(jLabel7);
        jLabel7.setBounds(350, 90, 303, 27);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Ahhoz hogy pontot gyűjts, ");
        harmadikpalya.add(jLabel6);
        jLabel6.setBounds(350, 60, 303, 27);

        hetevespalyak.addTab("Harmadik Pálya", harmadikpalya);

        getContentPane().add(hetevespalyak);
        hetevespalyak.setBounds(0, 0, 980, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    beolvas();
    }//GEN-LAST:event_formWindowOpened

    private void köv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_köv1ActionPerformed

        Vége_és_vissza_az_elejére v=new Vége_és_vissza_az_elejére(sta);
        v.setVisible(true);
        dispose();
    }//GEN-LAST:event_köv1ActionPerformed

    private void samActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_samActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_samActionPerformed

    private void k2MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_k2MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_k2MouseWheelMoved

    private void k2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k2MouseClicked
   cica();
  
    }//GEN-LAST:event_k2MouseClicked

    private void k2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k2MouseEntered
     E2.setVisible(true);
    }//GEN-LAST:event_k2MouseEntered

    private void k2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k2MouseExited
       E2.setVisible(false);
    }//GEN-LAST:event_k2MouseExited

    private void kMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kMouseClicked
    pingvin();        
    }//GEN-LAST:event_kMouseClicked

    private void kMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kMouseEntered
       E1.setVisible(true);
    }//GEN-LAST:event_kMouseEntered

    private void kMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kMouseExited
       E1.setVisible(false);
    }//GEN-LAST:event_kMouseExited

    private void k3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k3MouseClicked
     katica();
    }//GEN-LAST:event_k3MouseClicked

    private void k3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k3MouseEntered
        E3.setVisible(true);
    }//GEN-LAST:event_k3MouseEntered

    private void k3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k3MouseExited
  E3.setVisible(false);
    }//GEN-LAST:event_k3MouseExited

    private void k4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k4MouseClicked
       cica2();
      
    }//GEN-LAST:event_k4MouseClicked

    private void k4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k4MouseEntered
       E3.setVisible(true);
    }//GEN-LAST:event_k4MouseEntered

    private void k4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k4MouseExited
    E3.setVisible(false);
    }//GEN-LAST:event_k4MouseExited

    private void k5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k5MouseClicked
   pingvin2();

    }//GEN-LAST:event_k5MouseClicked

    private void k5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k5MouseEntered
       E1.setVisible(true);
    }//GEN-LAST:event_k5MouseEntered

    private void k5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k5MouseExited
       E1.setVisible(false);
    }//GEN-LAST:event_k5MouseExited

    private void k6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k6MouseClicked
   katica2();
  
    }//GEN-LAST:event_k6MouseClicked

    private void k6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k6MouseEntered
     E2.setVisible(true);
    }//GEN-LAST:event_k6MouseEntered

    private void k6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k6MouseExited
      E2.setVisible(false);
    }//GEN-LAST:event_k6MouseExited

    private void K7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_K7KeyPressed
  
    }//GEN-LAST:event_K7KeyPressed

    private void K7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K7MouseClicked
  katica3();
   
    }//GEN-LAST:event_K7MouseClicked

    private void K7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K7MouseEntered
   E3.setVisible(true);
    }//GEN-LAST:event_K7MouseEntered

    private void K7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K7MouseExited
        E3.setVisible(false);
    }//GEN-LAST:event_K7MouseExited

    private void K8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K8MouseClicked
      pingvin3();
      
    }//GEN-LAST:event_K8MouseClicked

    private void K8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K8MouseEntered
     E2.setVisible(true);
    }//GEN-LAST:event_K8MouseEntered

    private void K8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K8MouseExited
   E2.setVisible(false);
    }//GEN-LAST:event_K8MouseExited

    private void K9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K9MouseClicked
    cica3();
    }//GEN-LAST:event_K9MouseClicked

    private void K9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K9MouseEntered
       E1.setVisible(true);
    }//GEN-LAST:event_K9MouseEntered

    private void K9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K9MouseExited
        E1.setVisible(false);
    }//GEN-LAST:event_K9MouseExited

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
            java.util.logging.Logger.getLogger(Heteves3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Heteves3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Heteves3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Heteves3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Heteves3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel E1;
    private javax.swing.JLabel E2;
    private javax.swing.JLabel E3;
    private javax.swing.JLabel K7;
    private javax.swing.JLabel K8;
    private javax.swing.JLabel K9;
    private javax.swing.JLabel P;
    private javax.swing.JPanel harmadikpalya;
    private javax.swing.JTabbedPane hetevespalyak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel k;
    private javax.swing.JLabel k2;
    private javax.swing.JLabel k3;
    private javax.swing.JLabel k4;
    private javax.swing.JLabel k5;
    private javax.swing.JLabel k6;
    private javax.swing.JButton köv1;
    private javax.swing.JTextField sam;
    // End of variables declaration//GEN-END:variables

    private void beolvas() {
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

    private void tömb() {
        tomb2=new int[3];
tomb2[0]=2;
tomb2[1]=8;
tomb2[2]=5;
sam.setText(Integer.toString(tomb2[szam]));
}

    private void tömb2() {
           tomb3=new int[3];
tomb3[0]=7;
tomb3[1]=6;
tomb3[2]=3;
sam.setText(Integer.toString(tomb3[szam]));
    }

    private void kezdés() {     
        //KARIKÁK -------------------------------
       E1.setVisible(false);
       E2.setVisible(false);
       E3.setVisible(false);
        k4.setVisible(false);
       k5.setVisible(false);
       k6.setVisible(false);
       K7.setVisible(false);
       K8.setVisible(false);
       K9.setVisible(false);
      
      //-------------------------------------
       //KÉPEK------
         
       //-------------------------------
      
//A  TÖMBÖM KIVÁLASZTOTT SZÁMAI-------------------
tomb=new int[3];
tomb[0]=4;
tomb[1]=9;
tomb[2]=1;
sam.setText(Integer.toString(tomb[szam]));
//-------------------------------------
    }

    private void cica() {
             int a=4;
        if(tomb[szam]==a){
      JOptionPane.showMessageDialog(null,"SZUPER VAGY!  :D Jöhet a  következő");
      adat();
      k.setVisible(false);
      k2.setVisible(false);
      k3.setVisible(false);
       E2.setVisible(false);
       
       k4.setVisible(true);
       k5.setVisible(true);
       k6.setVisible(true);
       tömb();
   
   }else{JOptionPane.showMessageDialog(null,"AJJAJ, SEBAJ!  ez: "+a+" darab cica");
      k.setVisible(false);
      k2.setVisible(false);
      k3.setVisible(false);
      E2.setVisible(false);
       
      k4.setVisible(true);
      k5.setVisible(true);
      k6.setVisible(true);
      tömb();
       
        }
    }

    private void pingvin() {
            int a=9;
        if(tomb[szam]==a){
      JOptionPane.showMessageDialog(null,"SZUPER VAGY!  :D Jöhet a  következő");
      adat();
      k.setVisible(false);
      k2.setVisible(false);
      k3.setVisible(false);
       E1.setVisible(false);
      
    k4.setVisible(true);
       k5.setVisible(true);
       k6.setVisible(true);
           tömb();
      
   
   }else{JOptionPane.showMessageDialog(null,"AJJAJ, SEBAJ!  ez: "+a+" darab pingvin");
        k.setVisible(false);
      k2.setVisible(false);
      k3.setVisible(false);
       E1.setVisible(false);
       
        k4.setVisible(true);
      k5.setVisible(true);
      k6.setVisible(true);
       tömb();
        }
    }

    private void katica() {
     int a=1;
        if(tomb[szam]==a){
      JOptionPane.showMessageDialog(null,"SZUPER VAGY!  :D Jöhet a  következő");
      adat();
      k.setVisible(false);
      k2.setVisible(false);
      k3.setVisible(false);
       E3.setVisible(false);
      
         k4.setVisible(true);
      k5.setVisible(true);
      k6.setVisible(true);
     
           tömb();
   
   }else{JOptionPane.showMessageDialog(null,"AJJAJ, SEBAJ!  ez: "+a+" darab katica");
        k.setVisible(false);
      k2.setVisible(false);
      k3.setVisible(false);
       E3.setVisible(false);
       
      k4.setVisible(true);
      k5.setVisible(true);
      k6.setVisible(true);
         tömb();
        }
    }

    private void cica2() {
      int a=2;
        if(tomb2[szam]==a){
      JOptionPane.showMessageDialog(null,"SZUPER VAGY!  :D Jöhet a  következő");
      adat();
      k4.setVisible(false);
      k5.setVisible(false);
      k6.setVisible(false);
       E3.setVisible(false);
     
       K7.setVisible(true);
      K8.setVisible(true);
      K9.setVisible(true); 
     
           tömb2(); 
   
   }else{JOptionPane.showMessageDialog(null,"AJJAJ, SEBAJ!  ez: "+a+" darab cica");
        k4.setVisible(false);
      k5.setVisible(false);
      k6.setVisible(false);
       E3.setVisible(false);
    
      K7.setVisible(true);
      K8.setVisible(true);
      K9.setVisible(true);
         tömb2();
        }
    }

    private void pingvin2() {
            int a=8;
        if(tomb2[szam]==a){
      JOptionPane.showMessageDialog(null,"SZUPER VAGY!  :D Jöhet a  következő");
      adat();
      k4.setVisible(false);
      k5.setVisible(false);
      k6.setVisible(false);
       E1.setVisible(false);
      
        K7.setVisible(true);
      K8.setVisible(true);
      K9.setVisible(true); 
     
           tömb2(); 
   
   }else{JOptionPane.showMessageDialog(null,"AJJAJ, SEBAJ!  ez: "+a+" darab pingvin");
        k4.setVisible(false);
      k5.setVisible(false);
      k6.setVisible(false);
       E1.setVisible(false);
     
      K7.setVisible(true);
      K8.setVisible(true);
      K9.setVisible(true);
         tömb2(); 
        }
    }

    private void katica2() {
           int a=5;
        if(tomb2[szam]==a){
      JOptionPane.showMessageDialog(null,"SZUPER VAGY!  :D Jöhet a  következő");
      adat();
      k4.setVisible(false);
      k5.setVisible(false);
      k6.setVisible(false);
      E2.setVisible(false);
      
       K7.setVisible(true);
      K8.setVisible(true);
      K9.setVisible(true); 
     
           tömb2();
   
   }else{JOptionPane.showMessageDialog(null,"AJJAJ, SEBAJ!  ez: "+a+" darab katica");
        k4.setVisible(false);
      k5.setVisible(false);
      k6.setVisible(false);
        E2.setVisible(false);
        
      K7.setVisible(true);
      K8.setVisible(true);
      K9.setVisible(true);
         tömb2(); 
        }
    }

    private void katica3() {
          int a=3;
        if(tomb3[szam]==a){
      JOptionPane.showMessageDialog(null,"SZUPER VAGY! :D");
      adat();
      K7.setVisible(false);
      K8.setVisible(false);
      K9.setVisible(false); 
        E3.setVisible(false);
        
	 köv1.setEnabled(true);
      
    
   
   }else{JOptionPane.showMessageDialog(null,"AJJAJ, SEBAJ!  ez: "+a+" darab katica!");
        K7.setVisible(false);
      K8.setVisible(false);
      K9.setVisible(false);
        E3.setVisible(false);
      
 köv1.setEnabled(true);
    
        }
    }

    private void pingvin3() {
       int a=7;
        if(tomb3[szam]==a){
      JOptionPane.showMessageDialog(null,"SZUPER VAGY! :D");
      adat();
      K7.setVisible(false);
      K8.setVisible(false);
      K9.setVisible(false); 
      E2.setVisible(false);
      
	 köv1.setEnabled(true);
      
    
   
   }else{JOptionPane.showMessageDialog(null,"AJJAJ, SEBAJ!  ez: "+a+" darab pingvin!");
        K7.setVisible(false);
      K8.setVisible(false);
      K9.setVisible(false);
        E2.setVisible(false);
        
 köv1.setEnabled(true);
    
        }
    }

    private void cica3() {
           int a=6;
        if(tomb3[szam]==a){
      JOptionPane.showMessageDialog(null,"SZUPER VAGY! ");
      adat();
      K7.setVisible(false);
      K8.setVisible(false);
      K9.setVisible(false); 
        E1.setVisible(false);
	 köv1.setEnabled(true);
      
    
   
   }else{JOptionPane.showMessageDialog(null,"AJJAJ SEBAJ!  ez: "+a+" darab cica ENNYI IS VOLT!");
        K7.setVisible(false);
      K8.setVisible(false);
      K9.setVisible(false);
        E1.setVisible(false);
        
 köv1.setEnabled(true);
    
        }
    }
    
 
}
