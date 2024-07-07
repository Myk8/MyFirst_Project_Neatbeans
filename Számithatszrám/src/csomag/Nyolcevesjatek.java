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
public class Nyolcevesjatek extends javax.swing.JFrame {
private Statement sta;
String host="jdbc:mysql://localhost:3306/vizsga";
String user="root";
String pass="root";
private int  ID;

//1-től-10-ig számok
 Random rand = new Random(); 
 
 
    
      //SZOTZÁSRA
    int r1 =rand.nextInt(10)+1;    
    int r2 =rand.nextInt(10)+1;
    int r3 =rand.nextInt(10)+1;
    int r4 =rand.nextInt(10)+1;
    int r5 =rand.nextInt(10)+1;
    int r6 =rand.nextInt(10)+1;
    
    //OSZTÁS
    int[] tömb ={3,6,9,12,15,18,21,24,27,30}; //3
    int szam=(int)(Math.random()*10);
    
     int[] tömb2 ={4,8,12,16,20,24,28,32,36,40}; //4
        int szam1=(int)(Math.random()*10);
     
      int[] tömb3 ={5,10,15,20,25,30,35,40,45,50}; //5
         int szam2=(int)(Math.random()*10);
//---------------------------------

    public Nyolcevesjatek() {
        initComponents();
      
   
    }
    public Nyolcevesjatek(Statement sta){
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
        masodik = new javax.swing.JTextField();
        elso3 = new javax.swing.JTextField();
        masodik3 = new javax.swing.JTextField();
        v3 = new javax.swing.JTextField();
        elso5 = new javax.swing.JTextField();
        masodik5 = new javax.swing.JTextField();
        v5 = new javax.swing.JTextField();
        elso2 = new javax.swing.JTextField();
        masodik2 = new javax.swing.JTextField();
        v2 = new javax.swing.JTextField();
        elso6 = new javax.swing.JTextField();
        masodik4 = new javax.swing.JTextField();
        v6 = new javax.swing.JTextField();
        elso4 = new javax.swing.JTextField();
        masodik6 = new javax.swing.JTextField();
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
        setTitle("nyolcevesek\n");
        setMaximumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(950, 580));
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
        köv1.setBounds(10, 130, 237, 37);

        elso.setEditable(false);
        elso.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        elso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elsoActionPerformed(evt);
            }
        });
        masodikpalya.add(elso);
        elso.setBounds(30, 200, 55, 57);

        v.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vActionPerformed(evt);
            }
        });
        masodikpalya.add(v);
        v.setBounds(290, 200, 70, 57);

        masodik.setEditable(false);
        masodik.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        masodik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masodikActionPerformed(evt);
            }
        });
        masodikpalya.add(masodik);
        masodik.setBounds(160, 200, 55, 57);

        elso3.setEditable(false);
        elso3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        elso3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elso3ActionPerformed(evt);
            }
        });
        masodikpalya.add(elso3);
        elso3.setBounds(30, 390, 55, 57);

        masodik3.setEditable(false);
        masodik3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        masodik3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masodik3ActionPerformed(evt);
            }
        });
        masodikpalya.add(masodik3);
        masodik3.setBounds(160, 390, 55, 57);

        v3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        v3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v3ActionPerformed(evt);
            }
        });
        masodikpalya.add(v3);
        v3.setBounds(290, 390, 80, 57);

        elso5.setEditable(false);
        elso5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        elso5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elso5ActionPerformed(evt);
            }
        });
        masodikpalya.add(elso5);
        elso5.setBounds(510, 290, 55, 57);

        masodik5.setEditable(false);
        masodik5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        masodik5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masodik5ActionPerformed(evt);
            }
        });
        masodikpalya.add(masodik5);
        masodik5.setBounds(630, 290, 55, 57);

        v5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        v5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v5ActionPerformed(evt);
            }
        });
        masodikpalya.add(v5);
        v5.setBounds(750, 290, 70, 57);

        elso2.setEditable(false);
        elso2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        elso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elso2ActionPerformed(evt);
            }
        });
        masodikpalya.add(elso2);
        elso2.setBounds(30, 290, 55, 58);

        masodik2.setEditable(false);
        masodik2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        masodik2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masodik2ActionPerformed(evt);
            }
        });
        masodikpalya.add(masodik2);
        masodik2.setBounds(150, 290, 55, 57);

        v2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        v2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v2ActionPerformed(evt);
            }
        });
        masodikpalya.add(v2);
        v2.setBounds(290, 290, 70, 57);

        elso6.setEditable(false);
        elso6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        elso6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elso6ActionPerformed(evt);
            }
        });
        masodikpalya.add(elso6);
        elso6.setBounds(510, 400, 55, 57);

        masodik4.setEditable(false);
        masodik4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        masodik4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masodik4ActionPerformed(evt);
            }
        });
        masodikpalya.add(masodik4);
        masodik4.setBounds(620, 200, 55, 57);

        v6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        v6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v6ActionPerformed(evt);
            }
        });
        masodikpalya.add(v6);
        v6.setBounds(760, 400, 70, 57);

        elso4.setEditable(false);
        elso4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        elso4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elso4ActionPerformed(evt);
            }
        });
        masodikpalya.add(elso4);
        elso4.setBounds(500, 200, 55, 57);

        masodik6.setEditable(false);
        masodik6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        masodik6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masodik6ActionPerformed(evt);
            }
        });
        masodikpalya.add(masodik6);
        masodik6.setBounds(630, 400, 55, 57);

        v4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        v4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v4ActionPerformed(evt);
            }
        });
        masodikpalya.add(v4);
        v4.setBounds(750, 200, 60, 57);

        egomb.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        egomb.setText("Ellenőrzés");
        egomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egombActionPerformed(evt);
            }
        });
        masodikpalya.add(egomb);
        egomb.setBounds(10, 90, 155, 37);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel2.setText(" Végül kattints az ellenőrzésre!");
        masodikpalya.add(jLabel2);
        jLabel2.setBounds(12, 44, 370, 27);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/szorzás.png"))); // NOI18N
        masodikpalya.add(jLabel3);
        jLabel3.setBounds(100, 200, 66, 57);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/szorzás.png"))); // NOI18N
        masodikpalya.add(jLabel5);
        jLabel5.setBounds(90, 290, 60, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/szorzás.png"))); // NOI18N
        masodikpalya.add(jLabel4);
        jLabel4.setBounds(90, 390, 66, 57);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/osztás.png"))); // NOI18N
        masodikpalya.add(jLabel6);
        jLabel6.setBounds(570, 290, 67, 57);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/osztás.png"))); // NOI18N
        masodikpalya.add(jLabel7);
        jLabel7.setBounds(560, 200, 60, 60);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/osztás.png"))); // NOI18N
        masodikpalya.add(jLabel8);
        jLabel8.setBounds(570, 400, 60, 60);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\egyenlo.png")); // NOI18N
        masodikpalya.add(jLabel9);
        jLabel9.setBounds(230, 200, 62, 58);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\egyenlo.png")); // NOI18N
        masodikpalya.add(jLabel10);
        jLabel10.setBounds(230, 390, 62, 58);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/egyenlo.png"))); // NOI18N
        masodikpalya.add(jLabel11);
        jLabel11.setBounds(680, 200, 62, 58);

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\egyenlo.png")); // NOI18N
        masodikpalya.add(jLabel12);
        jLabel12.setBounds(690, 290, 62, 58);

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\egyenlo.png")); // NOI18N
        masodikpalya.add(jLabel13);
        jLabel13.setBounds(220, 290, 62, 58);

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\egyenlo.png")); // NOI18N
        masodikpalya.add(jLabel14);
        jLabel14.setBounds(690, 400, 62, 58);
        masodikpalya.add(jLabel15);
        jLabel15.setBounds(720, 190, 0, 0);

        x.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\hiba.png")); // NOI18N
        masodikpalya.add(x);
        x.setBounds(360, 200, 70, 60);

        pipa.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\pipa.png")); // NOI18N
        masodikpalya.add(pipa);
        pipa.setBounds(360, 200, 70, 60);

        x1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\hiba.png")); // NOI18N
        masodikpalya.add(x1);
        x1.setBounds(360, 290, 70, 60);

        pipa1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\pipa.png")); // NOI18N
        masodikpalya.add(pipa1);
        pipa1.setBounds(360, 290, 70, 60);

        x2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\hiba.png")); // NOI18N
        masodikpalya.add(x2);
        x2.setBounds(370, 390, 70, 60);

        pipa2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\pipa.png")); // NOI18N
        masodikpalya.add(pipa2);
        pipa2.setBounds(370, 390, 70, 60);

        x3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\hiba.png")); // NOI18N
        masodikpalya.add(x3);
        x3.setBounds(820, 200, 70, 60);

        pipa3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\pipa.png")); // NOI18N
        masodikpalya.add(pipa3);
        pipa3.setBounds(820, 200, 70, 60);

        x4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\hiba.png")); // NOI18N
        masodikpalya.add(x4);
        x4.setBounds(820, 290, 70, 60);

        pipa4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\pipa.png")); // NOI18N
        masodikpalya.add(pipa4);
        pipa4.setBounds(820, 290, 70, 60);

        x5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\hiba.png")); // NOI18N
        masodikpalya.add(x5);
        x5.setBounds(830, 400, 70, 60);

        pipa5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mikey\\OneDrive\\Dokumentumok\\NetBeansProjects\\Számithatszrám\\src\\kepek\\pipa.png")); // NOI18N
        masodikpalya.add(pipa5);
        pipa5.setBounds(830, 400, 70, 60);

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
        jScrollPane1.setBounds(700, 10, 200, 124);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 0, 0));
        jLabel16.setText("kattints a  nevedre!     --->");
        masodikpalya.add(jLabel16);
        jLabel16.setBounds(390, 70, 303, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 0, 0));
        jLabel17.setText("Ahhoz hogy pontot gyűjts, ");
        masodikpalya.add(jLabel17);
        jLabel17.setBounds(390, 40, 303, 30);

        hetevespalyak.addTab("Első pálya", masodikpalya);

        getContentPane().add(hetevespalyak);
        hetevespalyak.setBounds(0, 10, 930, 560);

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       beolvasás();
    }//GEN-LAST:event_formWindowOpened

    private void egombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egombActionPerformed
GOMB();
     
    }//GEN-LAST:event_egombActionPerformed

    private void v4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v4ActionPerformed

    }//GEN-LAST:event_v4ActionPerformed

    private void masodik6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masodik6ActionPerformed

    }//GEN-LAST:event_masodik6ActionPerformed

    private void elso4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elso4ActionPerformed

    }//GEN-LAST:event_elso4ActionPerformed

    private void v6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v6ActionPerformed

    }//GEN-LAST:event_v6ActionPerformed

    private void masodik4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masodik4ActionPerformed

    }//GEN-LAST:event_masodik4ActionPerformed

    private void elso6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elso6ActionPerformed

    }//GEN-LAST:event_elso6ActionPerformed

    private void v2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v2ActionPerformed

    }//GEN-LAST:event_v2ActionPerformed

    private void masodik2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masodik2ActionPerformed

    }//GEN-LAST:event_masodik2ActionPerformed

    private void elso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elso2ActionPerformed

    }//GEN-LAST:event_elso2ActionPerformed

    private void v5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v5ActionPerformed

    }//GEN-LAST:event_v5ActionPerformed

    private void masodik5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masodik5ActionPerformed

    }//GEN-LAST:event_masodik5ActionPerformed

    private void elso5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elso5ActionPerformed

    }//GEN-LAST:event_elso5ActionPerformed

    private void v3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v3ActionPerformed

    }//GEN-LAST:event_v3ActionPerformed

    private void masodik3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masodik3ActionPerformed

    }//GEN-LAST:event_masodik3ActionPerformed

    private void elso3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elso3ActionPerformed

    }//GEN-LAST:event_elso3ActionPerformed

    private void masodikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masodikActionPerformed

    }//GEN-LAST:event_masodikActionPerformed

    private void vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vActionPerformed

    }//GEN-LAST:event_vActionPerformed

    private void elsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elsoActionPerformed

    }//GEN-LAST:event_elsoActionPerformed

    private void köv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_köv1ActionPerformed

        Nyolceves2 h1=new Nyolceves2(sta);
        h1.setVisible(true);
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
            java.util.logging.Logger.getLogger(Nyolcevesjatek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nyolcevesjatek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nyolcevesjatek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nyolcevesjatek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nyolcevesjatek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton egomb;
    private javax.swing.JTextField elso;
    private javax.swing.JTextField elso2;
    private javax.swing.JTextField elso3;
    private javax.swing.JTextField elso4;
    private javax.swing.JTextField elso5;
    private javax.swing.JTextField elso6;
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
    private javax.swing.JTextField masodik;
    private javax.swing.JTextField masodik2;
    private javax.swing.JTextField masodik3;
    private javax.swing.JTextField masodik4;
    private javax.swing.JTextField masodik5;
    private javax.swing.JTextField masodik6;
    private javax.swing.JPanel masodikpalya;
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

    private void beolvasás() {
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
  JOptionPane.showMessageDialog(null, "SZUPER VAGY");
  }
  catch(SQLException e)
{
JOptionPane.showMessageDialog(null, "Hiba");}
    }

    private void kezdés() {
     
    
  
       //SZORZÁS
        elso.setText(Integer.toString(r1));
         masodik.setText(Integer.toString(r2));
         elso2.setText(Integer.toString(r3));
         masodik2.setText(Integer.toString(r4));
         elso3.setText(Integer.toString(r5));
         masodik3.setText(Integer.toString(r6));
         
         
        elso4.setText(Integer.toString(tömb[szam]));
        masodik4.setText(Integer.toString(3));
        elso5.setText(Integer.toString(tömb2[szam1])); 
        masodik5.setText(Integer.toString(4)); 
         elso6.setText(Integer.toString(tömb3[szam2])); 
        masodik6.setText(Integer.toString(5)); 
        
        
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
        if(r1*r2==Integer.parseInt(v.getText())){ //ELSŐ
            pipa.setVisible(true);
            x.setVisible(false);
            adat();
        }else{x.setVisible(true);pipa.setVisible(false);JOptionPane.showMessageDialog(null, "AJJAJ, SEBAJ!  A válasz volt: "+r1+"x"+r2+"="+(r1*r2) );}

        if(r3*r4==Integer.parseInt(v2.getText())){  //MÁSODIK
            pipa1.setVisible(true);
            x1.setVisible(false);
            adat();
        }else{x1.setVisible(true);pipa1.setVisible(false);JOptionPane.showMessageDialog(null, "AJJAJ, SE BAJ!  A válasz volt: "+r3+"x"+r4+"="+(r3*r4));}

        if(r5*r6==Integer.parseInt(v3.getText())){ //HARMADIK
            pipa2.setVisible(true);
            x2.setVisible(false);
            adat();
        }else{x2.setVisible(true);pipa2.setVisible(false);JOptionPane.showMessageDialog(null, "AJJAJ, SE BAJ! :) A válasz volt: "+r5+"x"+r6+"="+(r5*r6));}

        if(tömb[szam]/3==Integer.parseInt(v4.getText())){ //NEGYEDIK
            pipa3.setVisible(true);
            x3.setVisible(false);
            adat();
        }else{x3.setVisible(true);pipa3.setVisible(false);JOptionPane.showMessageDialog(null, "AJJAJ, SE BAJ! :) A válasz volt: "+tömb[szam]+":"+3+"="+(tömb[szam]/3));}

        if(tömb2[szam1]/4==Integer.parseInt(v5.getText())){   //ÖTÖDIK
            pipa4.setVisible(true);
            x4.setVisible(false);
            adat();
        }else{x4.setVisible(true);pipa4.setVisible(false);JOptionPane.showMessageDialog(null, "AJJAJ, SE BAJ! :) A válasz volt: "+tömb2[szam1]+":"+4+"="+(tömb2[szam1]/4));}

        if(tömb3[szam2]/5==Integer.parseInt(v6.getText())){  //HATODIK
            pipa5.setVisible(true);
            x5.setVisible(false);
            adat();
        }else{x5.setVisible(true);pipa5.setVisible(false);JOptionPane.showMessageDialog(null, "AJJAJ, SE BAJ! :) A válasz volt: "+tömb3[szam2]+":"+5+"="+(tömb3[szam2]/5));}
         köv1.setEnabled(true);
         egomb.setEnabled(false);
        
    }
}
