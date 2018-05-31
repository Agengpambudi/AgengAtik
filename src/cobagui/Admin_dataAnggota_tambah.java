/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobagui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author T
 */
public class Admin_dataAnggota_tambah extends javax.swing.JFrame {

    /**
     * Creates new form Admin_dataAnggota_tambah
     */
    public Admin_dataAnggota_tambah() {
        initComponents();
    }
public void idanggota() {
        
        Connection c = koneksidatabase.getKoneksi();
        try (Statement s = c.createStatement()) {
            String sql = "select max(\"dataAnggota\") as ids from dataAnggota";
            try (ResultSet r = s.executeQuery(sql)) {
                while (r.next()) {
                    String n = r.getString("ids");
                    if (n == null) {
                        int id = 0 + 1;
                        idanggota.setText(""+id);
                    }else{
                        int idd = Integer.parseInt(r.getString("ids"));
                        int id = idd + 1;
                        idanggota.setText(""+id);
                    }
                }
            }
            
        } catch (SQLException e) {
    }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        no_tlp = new javax.swing.JTextField();
        kota = new javax.swing.JComboBox();
        alamat = new javax.swing.JTextField();
        jenisKelamin = new javax.swing.JComboBox();
        tglLahir = new com.toedter.calendar.JDateChooser();
        tempatLahir = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        idanggota = new javax.swing.JTextField();
        simpanBtn = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("KOPERASI SIMPAN PINJAM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cobagui/beranda.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, 30));

        jLabel2.setText("Aisyah kana");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, -1, -1));

        jLabel3.setText("ADMIN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cobagui/icons8-logout.png"))); // NOI18N
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, -1, 30));

        jLabel4.setText("Data Anggota");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cobagui/profil saya.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cobagui/data anggota.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 100, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cobagui/simpanan.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 100, 40));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cobagui/pinjaman.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 100, 40));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cobagui/angsuran.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 100, 40));

        jLabel13.setText("ID Anggota");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        jLabel5.setText("Nama");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        jLabel6.setText("Tempat lahir");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        jLabel7.setText("Tanggal Lahir");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        jLabel8.setText("Jenis Kelamin");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        jLabel9.setText("Alamat");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        jLabel11.setText("Kota");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        jLabel12.setText("Nomor Telepon");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));
        getContentPane().add(no_tlp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 160, -1));

        kota.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jember", "Bondowoso", "Situbondo" }));
        getContentPane().add(kota, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 110, -1));

        alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatActionPerformed(evt);
            }
        });
        getContentPane().add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 160, -1));

        jenisKelamin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Perempuan", "Laki-laki" }));
        getContentPane().add(jenisKelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 110, -1));
        getContentPane().add(tglLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 160, -1));
        getContentPane().add(tempatLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 160, -1));
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 160, -1));
        getContentPane().add(idanggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 160, -1));

        simpanBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cobagui/SIMPAN.png"))); // NOI18N
        simpanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanBtnActionPerformed(evt);
            }
        });
        getContentPane().add(simpanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 70, 30));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cobagui/BATAL.png"))); // NOI18N
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 70, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cobagui/PBO Layout FIX 2.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    this.dispose ();
new Admin_Simpanan ().setVisible (true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      this.dispose ();
new Admin_Pinjaman ().setVisible (true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       this.dispose ();
new Admin_Beranda ().setVisible (true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     this.dispose ();
new Admin_Profil ().setVisible (true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose ();
new Admin_dataAnggota ().setVisible (true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      this.dispose ();
new Admin_Angsuran ().setVisible (true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     this.dispose ();
new login ().setVisible (true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void simpanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanBtnActionPerformed
        String idX = idanggota.getText();
        int id = Integer.parseInt(idX);
        String name = nama.getText();
        String tempat = tempatLahir.getText();
        Date tgl = tglLahir.getDate();
        String tanggal = tgl.toString();
        System.out.println(tanggal);
        String jenisK = (String) jenisKelamin.getSelectedItem();;
        String alamate = alamat.getText();
        String kotae = (String) kota.getSelectedItem();;
        String notelpon = no_tlp.getText();
        try {
            Connection c = koneksidatabase.getKoneksi ();
            String sql = "INSERT INTO \"dataAnggota\" VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement p = c.prepareStatement(sql)) {
                p.setInt(1, id);
                p.setString(2, name);
                p.setString(3, tempat);
                p.setString(4,tanggal);
                p.setString (5,alamate );
                p.setString (6,kotae);
                p.setString(7, notelpon);
                p.setString (8,jenisK);
                p.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Berhasil Input Data!");
            }

        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(rootPane, e);
            System.out.println("Koneksi error");

        }
    }//GEN-LAST:event_simpanBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_dataAnggota_tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_dataAnggota_tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_dataAnggota_tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_dataAnggota_tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_dataAnggota_tambah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JLabel background;
    private javax.swing.JTextField idanggota;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox jenisKelamin;
    private javax.swing.JComboBox kota;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField no_tlp;
    private javax.swing.JButton simpanBtn;
    private javax.swing.JTextField tempatLahir;
    private com.toedter.calendar.JDateChooser tglLahir;
    // End of variables declaration//GEN-END:variables
}
