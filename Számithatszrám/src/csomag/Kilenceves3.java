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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author Mikey
 */
public class Kilenceves3 extends javax.swing.JFrame {

    private Statement sta;
    String host = "jdbc:mysql://localhost:3306/vizsga";
    String user = "root";
    String pass = "root";
    private int ID;

//EREDMÉNYEK
    int a = 253;
    int b = 252;
    int c = 220;
    int d = 107;
    int e = 72;
    int f = 80;
    int g = 890;
    int i = 892;

    public Kilenceves3() {
        initComponents();
        
    }

    public Kilenceves3(Statement sta) {
        initComponents();
        this.sta = sta;
        kezdet();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hetevespalyak = new javax.swing.JTabbedPane();
        harmadikpalya = new javax.swing.JPanel();
        köv1 = new javax.swing.JButton();
        sz = new javax.swing.JLabel();
        sz1 = new javax.swing.JLabel();
        sz2 = new javax.swing.JLabel();
        sz3 = new javax.swing.JLabel();
        e1 = new javax.swing.JButton();
        e2 = new javax.swing.JButton();
        e3 = new javax.swing.JButton();
        m = new javax.swing.JButton();
        m1 = new javax.swing.JButton();
        m2 = new javax.swing.JButton();
        m3 = new javax.swing.JButton();
        S = new javax.swing.JLabel();
        S1 = new javax.swing.JLabel();
        S2 = new javax.swing.JLabel();
        S3 = new javax.swing.JLabel();
        E = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(788, 900));
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
        köv1.setBounds(40, 50, 201, 37);

        sz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/szorny1a mini.png"))); // NOI18N
        harmadikpalya.add(sz);
        sz.setBounds(330, 150, 100, 160);

        sz1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/szorny1a mini.png"))); // NOI18N
        harmadikpalya.add(sz1);
        sz1.setBounds(330, 330, 100, 160);

        sz2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/szorny1a mini.png"))); // NOI18N
        harmadikpalya.add(sz2);
        sz2.setBounds(330, 500, 100, 160);

        sz3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/szorny1a mini.png"))); // NOI18N
        harmadikpalya.add(sz3);
        sz3.setBounds(340, 670, 100, 160);

        e1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        e1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                e1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                e1MouseEntered(evt);
            }
        });
        e1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e1ActionPerformed(evt);
            }
        });
        harmadikpalya.add(e1);
        e1.setBounds(70, 340, 230, 110);

        e2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        e2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                e2MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                e2MouseEntered(evt);
            }
        });
        e2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e2ActionPerformed(evt);
            }
        });
        harmadikpalya.add(e2);
        e2.setBounds(80, 520, 220, 110);

        e3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        e3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                e3MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                e3MouseEntered(evt);
            }
        });
        e3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e3ActionPerformed(evt);
            }
        });
        harmadikpalya.add(e3);
        e3.setBounds(20, 690, 290, 110);

        m.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mMouseEntered(evt);
            }
        });
        m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActionPerformed(evt);
            }
        });
        harmadikpalya.add(m);
        m.setBounds(470, 160, 220, 110);

        m1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        m1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                m1MouseEntered(evt);
            }
        });
        m1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m1ActionPerformed(evt);
            }
        });
        harmadikpalya.add(m1);
        m1.setBounds(470, 340, 220, 110);

        m2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        m2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m2MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                m2MouseEntered(evt);
            }
        });
        m2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m2ActionPerformed(evt);
            }
        });
        harmadikpalya.add(m2);
        m2.setBounds(470, 520, 220, 110);

        m3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        m3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m3MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                m3MouseEntered(evt);
            }
        });
        m3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m3ActionPerformed(evt);
            }
        });
        harmadikpalya.add(m3);
        m3.setBounds(460, 690, 230, 110);

        S.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/szorny1d mini.png"))); // NOI18N
        S.setText("jLabel1");
        harmadikpalya.add(S);
        S.setBounds(330, 150, 100, 160);

        S1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/szorny1d mini.png"))); // NOI18N
        S1.setText("jLabel1");
        harmadikpalya.add(S1);
        S1.setBounds(330, 330, 100, 150);

        S2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/szorny1d mini.png"))); // NOI18N
        S2.setText("jLabel1");
        harmadikpalya.add(S2);
        S2.setBounds(330, 500, 100, 150);

        S3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/szorny1d mini.png"))); // NOI18N
        S3.setText("jLabel1");
        harmadikpalya.add(S3);
        S3.setBounds(340, 670, 100, 150);

        E.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EMouseEntered(evt);
            }
        });
        E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EActionPerformed(evt);
            }
        });
        harmadikpalya.add(E);
        E.setBounds(60, 160, 230, 110);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setText("Kattints a nagyobb értékű müveletre!");
        harmadikpalya.add(jLabel1);
        jLabel1.setBounds(40, 20, 420, 27);

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
        jScrollPane1.setBounds(550, 20, 200, 124);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("kattints a  nevedre!     --->");
        harmadikpalya.add(jLabel7);
        jLabel7.setBounds(250, 90, 303, 27);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Ahhoz hogy pontot gyűjts, ");
        harmadikpalya.add(jLabel6);
        jLabel6.setBounds(250, 60, 303, 27);

        hetevespalyak.addTab("Harmadik Pálya", harmadikpalya);

        getContentPane().add(hetevespalyak);
        hetevespalyak.setBounds(0, 0, 770, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void köv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_köv1ActionPerformed

        Vége_és_vissza_az_elejére v = new Vége_és_vissza_az_elejére(sta);
        v.setVisible(true);
        dispose();
    }//GEN-LAST:event_köv1ActionPerformed

    private void mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActionPerformed
        egyesfm();hang2();
    }//GEN-LAST:event_mActionPerformed

    private void mMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mMouseEntered
        ImageIcon C = new ImageIcon("src/kepek/szorny1b mini.png");
        sz.setIcon(C);
    }//GEN-LAST:event_mMouseEntered

    private void mMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mMouseExited
        ImageIcon C = new ImageIcon("src/kepek/szorny1a mini.png");
        sz.setIcon(C);
    }//GEN-LAST:event_mMouseExited

    private void e1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e1MouseExited
        ImageIcon C = new ImageIcon("src/kepek/szorny1a mini.png");
        sz1.setIcon(C);
    }//GEN-LAST:event_e1MouseExited

    private void e1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e1MouseEntered
        ImageIcon C = new ImageIcon("src/kepek/szorny1b mini.png");
        sz1.setIcon(C);
    }//GEN-LAST:event_e1MouseEntered

    private void e1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e1ActionPerformed
   masodikf();hang();adat();
    }//GEN-LAST:event_e1ActionPerformed

    private void e2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e2MouseExited
        ImageIcon C = new ImageIcon("src/kepek/szorny1a mini.png");
        sz2.setIcon(C);
    }//GEN-LAST:event_e2MouseExited

    private void e2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e2MouseEntered
        ImageIcon C = new ImageIcon("src/kepek/szorny1b mini.png");
        sz2.setIcon(C);
    }//GEN-LAST:event_e2MouseEntered

    private void e2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e2ActionPerformed
   harmadikf();hang2();
    }//GEN-LAST:event_e2ActionPerformed

    private void e3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e3MouseExited
        ImageIcon C = new ImageIcon("src/kepek/szorny1a mini.png");
        sz3.setIcon(C);
    }//GEN-LAST:event_e3MouseExited

    private void e3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e3MouseEntered
        ImageIcon C = new ImageIcon("src/kepek/szorny1b mini.png");
        sz3.setIcon(C);
    }//GEN-LAST:event_e3MouseEntered

    private void e3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e3ActionPerformed
    negyedikf(); hang2();
    }//GEN-LAST:event_e3ActionPerformed

    private void m1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m1MouseExited
        ImageIcon C = new ImageIcon("src/kepek/szorny1a mini.png");
        sz1.setIcon(C);
    }//GEN-LAST:event_m1MouseExited

    private void m1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m1MouseEntered
        ImageIcon C = new ImageIcon("src/kepek/szorny1b mini.png");
        sz1.setIcon(C);
    }//GEN-LAST:event_m1MouseEntered

    private void m1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m1ActionPerformed
   mmasodikfm();hang2();
    }//GEN-LAST:event_m1ActionPerformed

    private void m2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m2MouseExited
        ImageIcon C = new ImageIcon("src/kepek/szorny1a mini.png");
        sz2.setIcon(C);
    }//GEN-LAST:event_m2MouseExited

    private void m2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m2MouseEntered
        ImageIcon C = new ImageIcon("src/kepek/szorny1b mini.png");
        sz2.setIcon(C);
    }//GEN-LAST:event_m2MouseEntered

    private void m2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m2ActionPerformed
  harmadikfm();hang();adat();
    }//GEN-LAST:event_m2ActionPerformed

    private void m3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m3MouseExited
        ImageIcon C = new ImageIcon("src/kepek/szorny1a mini.png");
        sz3.setIcon(C);
    }//GEN-LAST:event_m3MouseExited

    private void m3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m3MouseEntered
        ImageIcon C = new ImageIcon("src/kepek/szorny1b mini.png");
        sz3.setIcon(C);
    }//GEN-LAST:event_m3MouseEntered

    private void m3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m3ActionPerformed
     negyedikfm();adat();hang();
    }//GEN-LAST:event_m3ActionPerformed

    private void EMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMouseExited
        ImageIcon C = new ImageIcon("src/kepek/szorny1a mini.png");
        sz.setIcon(C);
    }//GEN-LAST:event_EMouseExited

    private void EMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMouseEntered
        ImageIcon C = new ImageIcon("src/kepek/szorny1b mini.png");
        sz.setIcon(C);
    }//GEN-LAST:event_EMouseEntered

    private void EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EActionPerformed
        egyesf(); hang(); adat();
    }//GEN-LAST:event_EActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
   beolv();
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
            java.util.logging.Logger.getLogger(Kilenceves3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kilenceves3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kilenceves3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kilenceves3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kilenceves3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton E;
    private javax.swing.JLabel S;
    private javax.swing.JLabel S1;
    private javax.swing.JLabel S2;
    private javax.swing.JLabel S3;
    private javax.swing.JButton e1;
    private javax.swing.JButton e2;
    private javax.swing.JButton e3;
    private javax.swing.JPanel harmadikpalya;
    private javax.swing.JTabbedPane hetevespalyak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton köv1;
    private javax.swing.JButton m;
    private javax.swing.JButton m1;
    private javax.swing.JButton m2;
    private javax.swing.JButton m3;
    private javax.swing.JLabel sz;
    private javax.swing.JLabel sz1;
    private javax.swing.JLabel sz2;
    private javax.swing.JLabel sz3;
    // End of variables declaration//GEN-END:variables

    private void kezdet() {
        E.setText("10x5+204"); //254
        m.setText("500-248");    //252

        e1.setText("5x5x8+20"); //220
        m1.setText("75+4x8");

        e2.setText("63:7+63"); //72
        m2.setText("8x8+16"); //80

        e3.setText("7x113+99"); //890
        m3.setText("90x7+262"); //892
        engedely();
    }

    private void engedely() {
        e1.setVisible(false);
        m1.setVisible(false);
        sz1.setVisible(false);
        S1.setVisible(false);
        e2.setVisible(false);
        m2.setVisible(false);
        sz2.setVisible(false);
        S2.setVisible(false);
        e3.setVisible(false);
        m3.setVisible(false);
        sz3.setVisible(false);
        S3.setVisible(false);
    }

    private void egyesf() {
        if (E.getText().equals("10x5+204")) {
            E.setText("HURRÁ!");
            sz.setVisible(false);
            ImageIcon C = new ImageIcon("src/kepek/szorny1e mini.png");
            S.setIcon(C);
            m.setEnabled(false);
            e1.setVisible(true);
            m1.setVisible(true);
            sz1.setVisible(true);
            S1.setVisible(true);
        }

    }

    private void egyesfm() {
        if (m.getText().equals("500-248")) {
            m.setText("AJJAJ");
            sz.setVisible(false);
            ImageIcon C = new ImageIcon("src/kepek/szorny1d mini.png");
            S.setIcon(C);
            E.setEnabled(false);
            e1.setVisible(true);
            m1.setVisible(true);
            sz1.setVisible(true);
            S1.setVisible(true);

        }
    }

    private void masodikf() {
                if (e1.getText().equals("5x5x8+20")) {
            e1.setText("HURRÁ");
            sz1.setVisible(false);
            ImageIcon C = new ImageIcon("src/kepek/szorny1e mini.png");
            S1.setIcon(C);
            m1.setEnabled(false);
            e2.setVisible(true);
            m2.setVisible(true);
            sz2.setVisible(true);
            S2.setVisible(true);
        }
       }

    private void harmadikf() {
             if (e2.getText().equals("63:7+63")) {
            e2.setText("AJJAJ");
            sz2.setVisible(false);
            ImageIcon C = new ImageIcon("src/kepek/szorny1d mini.png");
            S2.setIcon(C);
            m2.setEnabled(false);
            e3.setVisible(true);
            m3.setVisible(true);
            sz3.setVisible(true);
            S3.setVisible(true);

        }
      }

    private void negyedikf() {
              if (e3.getText().equals("7x113+99")) {
            e3.setText("AJJAJ");
            sz3.setVisible(false);
            ImageIcon C = new ImageIcon("src/kepek/szorny1d mini.png");
            S3.setIcon(C);
            m3.setEnabled(false);
           köv1.setEnabled(true);

        }
      }

    private void mmasodikfm() {
           if (m1.getText().equals("75+4x8")) {
            m1.setText("AJJAJ");
            sz1.setVisible(false);
            ImageIcon C = new ImageIcon("src/kepek/szorny1d mini.png");
            S1.setIcon(C);
           e1.setEnabled(false);
           e2.setVisible(true);
            m2.setVisible(true);
            sz2.setVisible(true);
            S2.setVisible(true);

        }
      }

    private void harmadikfm() {
            if (m2.getText().equals("8x8+16")) {
            m2.setText("HURRÁ");
            sz2.setVisible(false);
            ImageIcon C = new ImageIcon("src/kepek/szorny1e mini.png");
            S2.setIcon(C);
            e2.setEnabled(false);
            e3.setVisible(true);
            m3.setVisible(true);
            sz3.setVisible(true);
            S3.setVisible(true);
        }
     }
    

    private void negyedikfm() {
            if (m3.getText().equals("90x7+262")) {
            m3.setText("HURRÁ");
            sz3.setVisible(false);
            ImageIcon C = new ImageIcon("src/kepek/szorny1e mini.png");
            S3.setIcon(C);
            e3.setEnabled(false);
              köv1.setEnabled(true);
           
        }
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
