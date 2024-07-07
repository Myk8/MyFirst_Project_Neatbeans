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
public class Vége_és_vissza_az_elejére extends javax.swing.JFrame {
    
     private Statement sta;
    
String host="jdbc:mysql://localhost:3306/vizsga";
String user="root";
String pass="root";
String selected_id="";
    
    
    public Vége_és_vissza_az_elejére() {
        initComponents();
   
    }
    
    //OLDAL ELÉRÉS
      public Vége_és_vissza_az_elejére(Statement sta){
    initComponents();
    this.sta=sta;
    kezd();
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        klick = new javax.swing.JButton();
        újjáték = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bubi = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VÉGE");
        setMaximumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(850, 670));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1052, 684));
        jPanel1.setLayout(null);

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kedvencszám", "Név", "Kor", "Állat kedvenc", "avatárkép", "elért pontszámod"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setMaximumSize(new java.awt.Dimension(0, 0));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 10, 667, 166);

        klick.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        klick.setText("Kattints rám!");
        klick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                klickMouseEntered(evt);
            }
        });
        klick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klickActionPerformed(evt);
            }
        });
        jPanel1.add(klick);
        klick.setBounds(90, 210, 190, 60);

        újjáték.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        újjáték.setText("Új játék");
        újjáték.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                újjátékMouseEntered(evt);
            }
        });
        újjáték.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                újjátékActionPerformed(evt);
            }
        });
        jPanel1.add(újjáték);
        újjáték.setBounds(120, 210, 140, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/disz.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(720, 510, 120, 120);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/disz.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(340, 510, 120, 120);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/magyarázóbót.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 300, 336, 344);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/disz.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(720, 390, 120, 120);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/disz.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(460, 510, 120, 120);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/bubisszöveg.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 180, 230, 130);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/disz.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(590, 510, 120, 120);

        bubi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/bubisrobot.png"))); // NOI18N
        jPanel1.add(bubi);
        bubi.setBounds(360, 190, 370, 360);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/disz.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(720, 280, 120, 120);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/disz.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(720, 160, 120, 120);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/disz.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(720, 30, 120, 120);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 850, 684);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
           int sorokszama=model.getRowCount();
        for(int i=sorokszama-1;i>=0;i--){
        model.removeRow(i);
        }
        
     
        try{
        Connection con=DriverManager.getConnection(host,user,pass);
        String sql="SELECT * FROM játékosadatok";
        Statement sta=con.createStatement();
        ResultSet rs=sta.executeQuery(sql);
        
       
        while(rs.next())
        {
            model.addRow(new Object[]{rs.getInt("id"),rs.getString("nev"),rs.getInt("eletkor"),
            rs.getString("allat_kedvenc"),rs.getString("avatarkep"),rs.getInt("pontszam")});
           
           }
        sta.close();
        con.close();
        }
        catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Hiba a beolvasás");
       
        }
    }//GEN-LAST:event_formWindowOpened

    private void újjátékActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_újjátékActionPerformed
        Címmenü h1=new Címmenü(sta);
        h1.setVisible(true);
        dispose();
    }//GEN-LAST:event_újjátékActionPerformed

    private void klickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klickActionPerformed
   klick.setVisible(false); hang();bubi.setVisible(true); újjáték.setVisible(true);
    }//GEN-LAST:event_klickActionPerformed

    private void újjátékMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_újjátékMouseEntered
      hang3();
    }//GEN-LAST:event_újjátékMouseEntered

    private void klickMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_klickMouseEntered
     hang2();
    }//GEN-LAST:event_klickMouseEntered

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
            java.util.logging.Logger.getLogger(Vége_és_vissza_az_elejére.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vége_és_vissza_az_elejére.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vége_és_vissza_az_elejére.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vége_és_vissza_az_elejére.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vége_és_vissza_az_elejére().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bubi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton klick;
    private javax.swing.JButton újjáték;
    // End of variables declaration//GEN-END:variables

    private void hang() {
       InputStream in;
try{
in=new FileInputStream(new File ("src\\hangok\\végszó.wav"));
AudioStream ad=new AudioStream(in); 
AudioPlayer.player.start(ad);
}
catch(IOException e){
JOptionPane.showMessageDialog(null, "Hiba");  
}
    }

    private void kezd() {
        bubi.setVisible(false);
        újjáték.setVisible(false);
      }

    private void hang3() {
                 InputStream in;
try{
in=new FileInputStream(new File ("src\\hangok\\újjáték.wav"));
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
in=new FileInputStream(new File ("src\\hangok\\Klik.wav"));
AudioStream ad=new AudioStream(in); 
AudioPlayer.player.start(ad);
}
catch(IOException e){
JOptionPane.showMessageDialog(null, "Hiba");  
    
    }
    }
    
}
