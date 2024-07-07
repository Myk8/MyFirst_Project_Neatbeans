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
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mikey
 */
public class Heteves2 extends javax.swing.JFrame {
    private Statement sta; //ELÉRHETŐSÉG TÖRTÉNÉSE
String host="jdbc:mysql://localhost:3306/vizsga";
String user="root";
String pass="root";

private int  ID;



  Random rand = new Random(); 
    int r1 =rand.nextInt(11);//0-től-10-ig
    int r2 =rand.nextInt(11);
    int r3 =rand.nextInt(11);
    int r4 =rand.nextInt(11);
    int r5 =rand.nextInt(11);
    int r6 =rand.nextInt(11);
    
    //KIVONÁS SZEMPOTJÁBÓL HOGY NE MINUSZ LEGYEN A MEGOLDÁS 7 ÉVESEK MÉG EZT NEM TANULJÁK
   int m1 = (int)(Math.random() * 6)+5;  // 5 -től 10-ig
    int m2 = (int)(Math.random() * 6)+10; //10-15-ig
     int m3 = (int)(Math.random() * 11)+10; // 10-20-ig
    
    int m4 =rand.nextInt(5)+1; //1-től 5-ig
    int m5 =(int)(Math.random() * 6)+5; //5-től 10-ig
    int m6=rand.nextInt(5)+1; //1-től 5-ig

    public Heteves2() {
        initComponents();
      
      
    }
    public Heteves2(Statement sta){
    initComponents();
     this.sta=sta;
    kezdés(); 
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hetevespalyak = new javax.swing.JTabbedPane();
        masodikpalya = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        köv1 = new javax.swing.JButton();
        elso = new javax.swing.JTextField();
        v = new javax.swing.JTextField();
        mas = new javax.swing.JTextField();
        harmadik = new javax.swing.JTextField();
        mas1 = new javax.swing.JTextField();
        v3 = new javax.swing.JTextField();
        otodik = new javax.swing.JTextField();
        mas2 = new javax.swing.JTextField();
        v5 = new javax.swing.JTextField();
        masodik = new javax.swing.JTextField();
        masbol = new javax.swing.JTextField();
        v2 = new javax.swing.JTextField();
        hatodik = new javax.swing.JTextField();
        masbol1 = new javax.swing.JTextField();
        v6 = new javax.swing.JTextField();
        negyedik = new javax.swing.JTextField();
        masbol2 = new javax.swing.JTextField();
        v4 = new javax.swing.JTextField();
        egomb = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        pipa = new javax.swing.JLabel();
        x1 = new javax.swing.JLabel();
        pipa1 = new javax.swing.JLabel();
        x2 = new javax.swing.JLabel();
        pipa2 = new javax.swing.JLabel();
        x3 = new javax.swing.JLabel();
        pipa3 = new javax.swing.JLabel();
        x4 = new javax.swing.JLabel();
        pipa4 = new javax.swing.JLabel();
        x5 = new javax.swing.JLabel();
        pipa5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hetevesek2");
        setMaximumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(940, 505));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        masodikpalya.setBackground(new java.awt.Color(102, 153, 255));
        masodikpalya.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        masodikpalya.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setText("Számold ki és írd be a kockába a megoldást!");
        masodikpalya.add(jLabel1);
        jLabel1.setBounds(12, 0, 487, 37);

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
        köv1.setBounds(40, 110, 237, 37);

        elso.setEditable(false);
        elso.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        elso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elsoActionPerformed(evt);
            }
        });
        masodikpalya.add(elso);
        elso.setBounds(40, 170, 55, 57);

        v.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        v.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vActionPerformed(evt);
            }
        });
        masodikpalya.add(v);
        v.setBounds(300, 170, 55, 57);

        mas.setEditable(false);
        mas.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masActionPerformed(evt);
            }
        });
        masodikpalya.add(mas);
        mas.setBounds(170, 170, 55, 57);

        harmadik.setEditable(false);
        harmadik.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        harmadik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                harmadikActionPerformed(evt);
            }
        });
        masodikpalya.add(harmadik);
        harmadik.setBounds(40, 360, 55, 57);

        mas1.setEditable(false);
        mas1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        mas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mas1ActionPerformed(evt);
            }
        });
        masodikpalya.add(mas1);
        mas1.setBounds(170, 360, 55, 57);

        v3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        v3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        v3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v3ActionPerformed(evt);
            }
        });
        masodikpalya.add(v3);
        v3.setBounds(300, 360, 55, 57);

        otodik.setEditable(false);
        otodik.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        otodik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otodikActionPerformed(evt);
            }
        });
        masodikpalya.add(otodik);
        otodik.setBounds(520, 260, 55, 57);

        mas2.setEditable(false);
        mas2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        mas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mas2ActionPerformed(evt);
            }
        });
        masodikpalya.add(mas2);
        mas2.setBounds(640, 260, 55, 57);

        v5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        v5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        v5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v5ActionPerformed(evt);
            }
        });
        masodikpalya.add(v5);
        v5.setBounds(760, 260, 55, 57);

        masodik.setEditable(false);
        masodik.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        masodik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masodikActionPerformed(evt);
            }
        });
        masodikpalya.add(masodik);
        masodik.setBounds(40, 260, 55, 58);

        masbol.setEditable(false);
        masbol.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        masbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masbolActionPerformed(evt);
            }
        });
        masodikpalya.add(masbol);
        masbol.setBounds(160, 260, 55, 57);

        v2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        v2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        v2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v2ActionPerformed(evt);
            }
        });
        masodikpalya.add(v2);
        v2.setBounds(300, 260, 55, 57);

        hatodik.setEditable(false);
        hatodik.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        hatodik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hatodikActionPerformed(evt);
            }
        });
        masodikpalya.add(hatodik);
        hatodik.setBounds(520, 370, 55, 57);

        masbol1.setEditable(false);
        masbol1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        masbol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masbol1ActionPerformed(evt);
            }
        });
        masodikpalya.add(masbol1);
        masbol1.setBounds(630, 170, 55, 57);

        v6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        v6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        v6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v6ActionPerformed(evt);
            }
        });
        masodikpalya.add(v6);
        v6.setBounds(770, 370, 55, 57);

        negyedik.setEditable(false);
        negyedik.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        negyedik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negyedikActionPerformed(evt);
            }
        });
        masodikpalya.add(negyedik);
        negyedik.setBounds(510, 170, 55, 57);

        masbol2.setEditable(false);
        masbol2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        masbol2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masbol2ActionPerformed(evt);
            }
        });
        masodikpalya.add(masbol2);
        masbol2.setBounds(640, 370, 55, 57);

        v4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        v4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        v4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v4ActionPerformed(evt);
            }
        });
        masodikpalya.add(v4);
        v4.setBounds(760, 170, 55, 57);

        egomb.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        egomb.setText("Ellenőrzés");
        egomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egombActionPerformed(evt);
            }
        });
        masodikpalya.add(egomb);
        egomb.setBounds(40, 70, 155, 37);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel2.setText(" Végül kattints az ellenőrzésre!");
        masodikpalya.add(jLabel2);
        jLabel2.setBounds(10, 40, 350, 27);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\hozzáad.png")); // NOI18N
        masodikpalya.add(jLabel3);
        jLabel3.setBounds(100, 170, 56, 57);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\kivonas.png")); // NOI18N
        masodikpalya.add(jLabel5);
        jLabel5.setBounds(100, 280, 56, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\hozzáad.png")); // NOI18N
        masodikpalya.add(jLabel4);
        jLabel4.setBounds(100, 360, 56, 57);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\hozzáad.png")); // NOI18N
        masodikpalya.add(jLabel6);
        jLabel6.setBounds(580, 260, 56, 57);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\kivonas.png")); // NOI18N
        masodikpalya.add(jLabel7);
        jLabel7.setBounds(570, 190, 56, 23);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\kivonas.png")); // NOI18N
        masodikpalya.add(jLabel8);
        jLabel8.setBounds(580, 390, 56, 23);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\egyenlo.png")); // NOI18N
        masodikpalya.add(jLabel9);
        jLabel9.setBounds(240, 170, 62, 58);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\egyenlo.png")); // NOI18N
        masodikpalya.add(jLabel10);
        jLabel10.setBounds(230, 360, 62, 58);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\egyenlo.png")); // NOI18N
        masodikpalya.add(jLabel11);
        jLabel11.setBounds(690, 170, 62, 58);

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\egyenlo.png")); // NOI18N
        masodikpalya.add(jLabel12);
        jLabel12.setBounds(700, 260, 62, 58);

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\egyenlo.png")); // NOI18N
        masodikpalya.add(jLabel13);
        jLabel13.setBounds(230, 260, 62, 58);

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\egyenlo.png")); // NOI18N
        masodikpalya.add(jLabel14);
        jLabel14.setBounds(700, 370, 62, 58);
        masodikpalya.add(jLabel15);
        jLabel15.setBounds(720, 160, 0, 0);

        x.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\hiba.png")); // NOI18N
        masodikpalya.add(x);
        x.setBounds(370, 170, 70, 60);

        pipa.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\pipa.png")); // NOI18N
        masodikpalya.add(pipa);
        pipa.setBounds(370, 170, 70, 60);

        x1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\hiba.png")); // NOI18N
        masodikpalya.add(x1);
        x1.setBounds(370, 260, 70, 60);

        pipa1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\pipa.png")); // NOI18N
        masodikpalya.add(pipa1);
        pipa1.setBounds(370, 260, 70, 60);

        x2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\hiba.png")); // NOI18N
        masodikpalya.add(x2);
        x2.setBounds(380, 360, 70, 60);

        pipa2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\pipa.png")); // NOI18N
        masodikpalya.add(pipa2);
        pipa2.setBounds(380, 360, 70, 60);

        x3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\hiba.png")); // NOI18N
        masodikpalya.add(x3);
        x3.setBounds(830, 170, 70, 60);

        pipa3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\pipa.png")); // NOI18N
        masodikpalya.add(pipa3);
        pipa3.setBounds(830, 170, 70, 60);

        x4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\hiba.png")); // NOI18N
        masodikpalya.add(x4);
        x4.setBounds(830, 260, 70, 60);

        pipa4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\pipa.png")); // NOI18N
        masodikpalya.add(pipa4);
        pipa4.setBounds(830, 260, 70, 60);

        x5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\hiba.png")); // NOI18N
        masodikpalya.add(x5);
        x5.setBounds(840, 370, 70, 60);

        pipa5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\pipa.png")); // NOI18N
        masodikpalya.add(pipa5);
        pipa5.setBounds(840, 370, 70, 60);

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
        jScrollPane1.setBounds(690, 10, 200, 124);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 0, 0));
        jLabel16.setText("kattints a  nevedre!     --->");
        masodikpalya.add(jLabel16);
        jLabel16.setBounds(370, 70, 303, 27);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 0, 0));
        jLabel17.setText("Ahhoz hogy pontot gyűjts, ");
        masodikpalya.add(jLabel17);
        jLabel17.setBounds(370, 40, 303, 27);

        hetevespalyak.addTab("Második pálya", masodikpalya);

        getContentPane().add(hetevespalyak);
        hetevespalyak.setBounds(0, 0, 930, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
  beolvas();
    }//GEN-LAST:event_formWindowOpened

    private void egombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egombActionPerformed
GOMB();
     
    }//GEN-LAST:event_egombActionPerformed

    private void v4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v4ActionPerformed

    }//GEN-LAST:event_v4ActionPerformed

    private void masbol2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masbol2ActionPerformed

    }//GEN-LAST:event_masbol2ActionPerformed

    private void negyedikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negyedikActionPerformed

    }//GEN-LAST:event_negyedikActionPerformed

    private void v6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v6ActionPerformed

    }//GEN-LAST:event_v6ActionPerformed

    private void masbol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masbol1ActionPerformed

    }//GEN-LAST:event_masbol1ActionPerformed

    private void hatodikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hatodikActionPerformed

    }//GEN-LAST:event_hatodikActionPerformed

    private void v2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v2ActionPerformed

    }//GEN-LAST:event_v2ActionPerformed

    private void masbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masbolActionPerformed

    }//GEN-LAST:event_masbolActionPerformed

    private void masodikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masodikActionPerformed

    }//GEN-LAST:event_masodikActionPerformed

    private void v5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v5ActionPerformed

    }//GEN-LAST:event_v5ActionPerformed

    private void mas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mas2ActionPerformed

    }//GEN-LAST:event_mas2ActionPerformed

    private void otodikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otodikActionPerformed

    }//GEN-LAST:event_otodikActionPerformed

    private void v3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v3ActionPerformed

    }//GEN-LAST:event_v3ActionPerformed

    private void mas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mas1ActionPerformed

    }//GEN-LAST:event_mas1ActionPerformed

    private void harmadikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_harmadikActionPerformed

    }//GEN-LAST:event_harmadikActionPerformed

    private void masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masActionPerformed

    }//GEN-LAST:event_masActionPerformed

    private void vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vActionPerformed

    }//GEN-LAST:event_vActionPerformed

    private void elsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elsoActionPerformed

    }//GEN-LAST:event_elsoActionPerformed

    private void köv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_köv1ActionPerformed

        Heteves3 h3=new Heteves3(sta);
        h3.setVisible(true);
        dispose();
    }//GEN-LAST:event_köv1ActionPerformed

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
            java.util.logging.Logger.getLogger(Heteves2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Heteves2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Heteves2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Heteves2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Heteves2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton egomb;
    private javax.swing.JTextField elso;
    private javax.swing.JTextField harmadik;
    private javax.swing.JTextField hatodik;
    private javax.swing.JTabbedPane hetevespalyak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton köv1;
    private javax.swing.JTextField mas;
    private javax.swing.JTextField mas1;
    private javax.swing.JTextField mas2;
    private javax.swing.JTextField masbol;
    private javax.swing.JTextField masbol1;
    private javax.swing.JTextField masbol2;
    private javax.swing.JTextField masodik;
    private javax.swing.JPanel masodikpalya;
    private javax.swing.JTextField negyedik;
    private javax.swing.JTextField otodik;
    private javax.swing.JLabel pipa;
    private javax.swing.JLabel pipa1;
    private javax.swing.JLabel pipa2;
    private javax.swing.JLabel pipa3;
    private javax.swing.JLabel pipa4;
    private javax.swing.JLabel pipa5;
    private javax.swing.JTextField v;
    private javax.swing.JTextField v2;
    private javax.swing.JTextField v3;
    private javax.swing.JTextField v4;
    private javax.swing.JTextField v5;
    private javax.swing.JTextField v6;
    private javax.swing.JLabel x;
    private javax.swing.JLabel x1;
    private javax.swing.JLabel x2;
    private javax.swing.JLabel x3;
    private javax.swing.JLabel x4;
    private javax.swing.JLabel x5;
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
 JOptionPane.showMessageDialog(null, "SZUPER VAGY! :D ");
  }
  catch(SQLException e)
{
JOptionPane.showMessageDialog(null, "Hiba");}

    }

    private void kezdés() {
   
       //ÖSSZEADÁS
        elso.setText(Integer.toString(r1));
        harmadik.setText(Integer.toString(r2));
        otodik.setText(Integer.toString(r3));
       
         mas.setText(Integer.toString(r4));
        mas1.setText(Integer.toString(r5));
        mas2.setText(Integer.toString(r6));
    //-----------------------------------------
        
    //KIVONÁS
        masodik.setText(Integer.toString(m1));
        negyedik.setText(Integer.toString(m2)); 
        hatodik.setText(Integer.toString(m3)); 
        
        masbol.setText(Integer.toString(m4));
        masbol1.setText(Integer.toString(m5));
        masbol2.setText(Integer.toString(m6));
        //---------------------------------------------
        //KEPEK ELTÜNTETÉSE PIPA ÉS HIBA
        pipa.setVisible(false);
        pipa1.setVisible(false);
        pipa2.setVisible(false);
        pipa3.setVisible(false);
        pipa4.setVisible(false);
        pipa5.setVisible(false);
        x.setVisible(false);
        x1.setVisible(false);
        x2.setVisible(false);
        x3.setVisible(false);
        x4.setVisible(false);
        x5.setVisible(false);
        //---------------------------
    }

    private void GOMB() {
          if(r1+r4==Integer.parseInt(v.getText())){ //ELSŐ
            pipa.setVisible(true);
            x.setVisible(false);
            adat();
        }else{x.setVisible(true);pipa.setVisible(false);JOptionPane.showMessageDialog(null, "AJJAJ, SE BAJ!  A válasz volt: "+r1+"+"+r4+"="+(r1+r4) );}

        if(m1-m4==Integer.parseInt(v2.getText())){  //MÁSODIK
            pipa1.setVisible(true);
            x1.setVisible(false);
            adat();
        }else{x1.setVisible(true);pipa1.setVisible(false);JOptionPane.showMessageDialog(null, "AJJAJ, SE BAJ!  A válasz volt: "+m1+"-"+m4+"="+(m1-m4));}

        if(r2+r5==Integer.parseInt(v3.getText())){
            pipa2.setVisible(true);
            x2.setVisible(false);
            adat();
        }else{x2.setVisible(true);pipa2.setVisible(false);JOptionPane.showMessageDialog(null, "AJJAJ, SE BAJ!  A válasz volt: "+r2+"+"+r5+"="+(r2+r5));}

        if(m2-m5==Integer.parseInt(v4.getText())){
            pipa3.setVisible(true);
            x3.setVisible(false);
            adat();
        }else{x3.setVisible(true);pipa3.setVisible(false);JOptionPane.showMessageDialog(null, "AJJAJ, SE BAJ!  A válasz volt: "+m2+"-"+m5+"="+(m2-m5));}

        if(r3+r6==Integer.parseInt(v5.getText())){
            pipa4.setVisible(true);
            x4.setVisible(false);
            adat();
        }else{x4.setVisible(true);pipa4.setVisible(false);JOptionPane.showMessageDialog(null, "AJJAJ, SE BAJ!  A válasz volt: "+r3+"+"+r6+"="+(r3+r6));}

        if(m3-m6==Integer.parseInt(v6.getText())){
            pipa5.setVisible(true);
            x5.setVisible(false);
            adat();
        }else{x5.setVisible(true);pipa5.setVisible(false);JOptionPane.showMessageDialog(null, "AJJAJ, SE BAJ!  A válasz volt:  "+m3+"-"+m6+"="+(m3-m6));}
        köv1.setEnabled(true);
        egomb.setEnabled(false);
    }
}
