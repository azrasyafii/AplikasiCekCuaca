/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;
import java.io.*; 
/**
 *
 * @author Pongo
 */
public class CekCuacaGUI extends javax.swing.JFrame {

    /**
     * Creates new form CekCuacaGUI
     */
    public CekCuacaGUI() {
        initComponents();
        bacaLokasiFavoritDariFile();
    }

    // Metode untuk membaca lokasi favorit dari file
    private void bacaLokasiFavoritDariFile() {
    File file = new File("lokasi_favorit.txt");
    if (file.exists()) { // Cek apakah file ada
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String lokasi;
            while ((lokasi = br.readLine()) != null) {
                cmbLokasiFavorit.addItem(lokasi); // Tambahkan ke JComboBox
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Gagal membaca file lokasi favorit: " + e.getMessage());
        }
    }
    }
    
    // Metode untuk menulis lokasi favorit ke file
    private void tulisLokasiFavoritKeFile() {
    File file = new File("lokasi_favorit.txt");
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
        for (int i = 0; i < cmbLokasiFavorit.getItemCount(); i++) {
            bw.write(cmbLokasiFavorit.getItemAt(i));
            bw.newLine();
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Gagal menyimpan lokasi favorit: " + e.getMessage());
    }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtInputLokasi = new javax.swing.JTextField();
        btnCekCuaca = new javax.swing.JButton();
        cmbLokasiFavorit = new javax.swing.JComboBox<>();
        txtSuhu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtKondisiCuaca = new javax.swing.JTextField();
        lblIcon = new javax.swing.JLabel();
        btnSimpanLokasi = new javax.swing.JButton();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("APLIKASI CEK CUACA");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 270, 40));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("MASUKKAN LOKASI");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("DAFTAR LOKASI FAVORIT");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("KONDISI CUACA");

        btnCekCuaca.setBackground(new java.awt.Color(255, 51, 51));
        btnCekCuaca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCekCuaca.setText("CEK CUACA");
        btnCekCuaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekCuacaActionPerformed(evt);
            }
        });

        cmbLokasiFavorit.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbLokasiFavoritItemStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("SUHU");

        btnSimpanLokasi.setBackground(new java.awt.Color(255, 51, 51));
        btnSimpanLokasi.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnSimpanLokasi.setText("SIMPAN LOKASI");
        btnSimpanLokasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanLokasiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIcon)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtInputLokasi)
                            .addComponent(cmbLokasiFavorit, 0, 194, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSimpanLokasi)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnCekCuaca)
                                .addGap(10, 10, 10))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtKondisiCuaca, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtInputLokasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCekCuaca))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbLokasiFavorit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSimpanLokasi))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKondisiCuaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblIcon)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 610, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCekCuacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekCuacaActionPerformed
 try {
        // Ambil lokasi dari input teks
        String lokasi = txtInputLokasi.getText().trim();

        if (lokasi.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masukkan lokasi terlebih dahulu!");
            return;
        }

        // URL API (ganti "YOUR_API_KEY" dengan kunci API dari OpenWeatherMap)
        String apiKey = "07afb948aaa92164a312f5f09450237d";
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + lokasi + "&units=metric&appid=" + apiKey;

        // Koneksi ke API
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        // Membaca respon dari API
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();

        // Parsing JSON
        JSONObject json = new JSONObject(sb.toString());
        String kondisi = json.getJSONArray("weather").getJSONObject(0).getString("main");
        double suhu = json.getJSONObject("main").getDouble("temp");

        // Perbarui UI dengan hasil cuaca
        txtKondisiCuaca.setText(kondisi);
        txtSuhu.setText(String.valueOf(suhu) + "°C");

        // Perbarui ikon sesuai kondisi cuaca
        if (kondisi.equalsIgnoreCase("Clear")) {
            lblIcon.setIcon(new ImageIcon(getClass().getResource("sunny.png")));
        } else if (kondisi.equalsIgnoreCase("Clouds")) {
            lblIcon.setIcon(new ImageIcon(getClass().getResource("cloudy.png")));
        } else if (kondisi.equalsIgnoreCase("Rain")) {
            lblIcon.setIcon(new ImageIcon(getClass().getResource("rainy.png")));
        } else if (kondisi.equalsIgnoreCase("Storm")) {
            lblIcon.setIcon(new ImageIcon(getClass().getResource("stormy.png")));
        } else {
            lblIcon.setIcon(null);
        }

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Gagal mengambil data cuaca: " + ex.getMessage());
    }
    }//GEN-LAST:event_btnCekCuacaActionPerformed

    private void cmbLokasiFavoritItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbLokasiFavoritItemStateChanged
        txtInputLokasi.setText(cmbLokasiFavorit.getSelectedItem().toString());
    }//GEN-LAST:event_cmbLokasiFavoritItemStateChanged

    private void btnSimpanLokasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanLokasiActionPerformed
        String lokasiBaru = txtInputLokasi.getText().trim(); // Ambil teks lokasi

    // Periksa apakah input tidak kosong
    if (!lokasiBaru.isEmpty()) {
        // Cek apakah lokasi sudah ada di daftar
        boolean sudahAda = false;
        for (int i = 0; i < cmbLokasiFavorit.getItemCount(); i++) {
            if (cmbLokasiFavorit.getItemAt(i).equalsIgnoreCase(lokasiBaru)) {
                sudahAda = true;
                break;
            }
        }

        // Tambahkan lokasi ke daftar jika belum ada
        if (!sudahAda) {
            cmbLokasiFavorit.addItem(lokasiBaru);
            tulisLokasiFavoritKeFile(); // Simpan perubahan ke file
            JOptionPane.showMessageDialog(this, "Lokasi berhasil disimpan ke favorit!");
        } else {
            JOptionPane.showMessageDialog(this, "Lokasi sudah ada di daftar favorit.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Masukkan lokasi terlebih dahulu.");
    }
    }//GEN-LAST:event_btnSimpanLokasiActionPerformed

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
            java.util.logging.Logger.getLogger(CekCuacaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CekCuacaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CekCuacaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CekCuacaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CekCuacaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCekCuaca;
    private javax.swing.JButton btnSimpanLokasi;
    private javax.swing.JComboBox<String> cmbLokasiFavorit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JTextField txtInputLokasi;
    private javax.swing.JTextField txtKondisiCuaca;
    private javax.swing.JTextField txtSuhu;
    // End of variables declaration//GEN-END:variables
}
