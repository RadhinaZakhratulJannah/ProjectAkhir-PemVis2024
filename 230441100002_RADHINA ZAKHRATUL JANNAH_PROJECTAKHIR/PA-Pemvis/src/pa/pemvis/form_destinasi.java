package pa.pemvis;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class form_destinasi extends javax.swing.JFrame {
    Connection conn;
    private DefaultTableModel model_tblDestinasi;
    private String selectedImagePath = "";
    int harga;
    private File selectedImageFile;
    
    public form_destinasi() {
        initComponents();
        setLocationRelativeTo(null);
        conn = koneksi.getConnection(); // Membuat koneksi ke database
        model_tblDestinasi = new DefaultTableModel();
        model_tblDestinasi.addColumn("ID");
        model_tblDestinasi.addColumn("Gambar");
        model_tblDestinasi.addColumn("Nama Pengunjung");
        model_tblDestinasi.addColumn("Domisili");
        model_tblDestinasi.addColumn("Tgl Kunjung");
        model_tblDestinasi.addColumn("Lokasi");
        model_tblDestinasi.addColumn("Total Harga");
        model_tblDestinasi.addColumn("Wisata");
        tbl_destinasi.setModel(model_tblDestinasi); // Set model ke tabel
        
        // Konfigurasi kolom tabel untuk menampilkan gambar
        // Konfigurasi kolom tabel untuk menampilkan gambar
        TableColumn imageColumn = tbl_destinasi.getColumnModel().getColumn(1);
        imageColumn.setPreferredWidth(60); // Atur lebar kolom gambar
        tbl_destinasi.setRowHeight(120); // Atur tinggi baris sesuai dengan tinggi gambar
        tbl_destinasi.setDefaultRenderer(Object.class, new javax.swing.table.DefaultTableCellRenderer() {            @Override
            public java.awt.Component getTableCellRendererComponent(
                    javax.swing.JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                if (value instanceof ImageIcon) {
                    javax.swing.JLabel label = new javax.swing.JLabel();
                    label.setIcon((ImageIcon) value);
                    return label;
                }return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            }});loadDataDestinasi();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCustom1 = new custom.panelCustom();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_nama = new javax.swing.JTextField();
        cb_wisata = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tx_domisili = new javax.swing.JTextArea();
        btnSimpan = new javax.swing.JButton();
        tglkunjung = new com.toedter.calendar.JDateChooser();
        jLabel27 = new javax.swing.JLabel();
        tf_harga = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        panelCustom3 = new custom.panelCustom();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_destinasi = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        fromlogout = new javax.swing.JButton();
        tf_lokasi = new javax.swing.JTextField();
        upgambar = new javax.swing.JButton();
        gbr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelCustom1.setBackground(new java.awt.Color(255, 246, 227));
        panelCustom1.setForeground(new java.awt.Color(140, 48, 97));
        panelCustom1.setRoundBottomLeft(40);
        panelCustom1.setRoundBottomRight(40);
        panelCustom1.setRoundTopLeft(40);
        panelCustom1.setRoundTopRight(40);
        panelCustom1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(140, 48, 97));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(140, 48, 97));
        jLabel1.setText("INPUT DESTINASI KAMUUU");
        panelCustom1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(140, 48, 97));
        jLabel2.setText("Nama :");
        panelCustom1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(140, 48, 97));
        jLabel3.setText("Domisili :");
        panelCustom1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(140, 48, 97));
        jLabel4.setText("Tgl Kunjung :");
        panelCustom1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(140, 48, 97));
        jLabel5.setText("Lokasi :");
        panelCustom1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        tf_nama.setBackground(new java.awt.Color(140, 48, 97));
        tf_nama.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        tf_nama.setForeground(java.awt.Color.white);
        tf_nama.setPreferredSize(new java.awt.Dimension(83, 32));
        panelCustom1.add(tf_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 340, -1));

        cb_wisata.setBackground(new java.awt.Color(140, 48, 97));
        cb_wisata.setForeground(java.awt.Color.white);
        cb_wisata.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih !", "Gunung Semeru", "Gunung Bromo", "Gunung Arjuno", "Gunung Ijen", "Pantai Pulau Merah", "Pantai Papuma", "Pantai Ngliyep", "Pantai Banyu Tibo", "Kebun Teh Kertosono", "Kebun Teh Wonosari" }));
        cb_wisata.setPreferredSize(new java.awt.Dimension(82, 32));
        panelCustom1.add(cb_wisata, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 340, -1));

        tx_domisili.setBackground(new java.awt.Color(140, 48, 97));
        tx_domisili.setColumns(20);
        tx_domisili.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        tx_domisili.setForeground(java.awt.Color.white);
        tx_domisili.setRows(5);
        jScrollPane1.setViewportView(tx_domisili);

        panelCustom1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 340, 80));

        btnSimpan.setBackground(new java.awt.Color(255, 48, 144));
        btnSimpan.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnSimpan.setForeground(java.awt.Color.white);
        btnSimpan.setText("Simpan");
        btnSimpan.setPreferredSize(new java.awt.Dimension(73, 23));
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        panelCustom1.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 100, 30));

        tglkunjung.setBackground(new java.awt.Color(140, 48, 97));
        panelCustom1.add(tglkunjung, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 340, 30));

        jLabel27.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(140, 48, 97));
        jLabel27.setText("Total Harga :");
        panelCustom1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, -1));

        tf_harga.setBackground(new java.awt.Color(140, 48, 97));
        tf_harga.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        tf_harga.setForeground(java.awt.Color.white);
        tf_harga.setPreferredSize(new java.awt.Dimension(83, 32));
        tf_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_hargaActionPerformed(evt);
            }
        });
        tf_harga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_hargaKeyReleased(evt);
            }
        });
        panelCustom1.add(tf_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 340, -1));

        jLabel28.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(140, 48, 97));
        jLabel28.setText("Wisata :");
        panelCustom1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        panelCustom3.setBackground(new java.awt.Color(255, 223, 214));
        panelCustom3.setRoundBottomLeft(20);
        panelCustom3.setRoundBottomRight(20);
        panelCustom3.setRoundTopLeft(20);
        panelCustom3.setRoundTopRight(20);

        tbl_destinasi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbl_destinasi);

        jLabel6.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(140, 48, 97));
        jLabel6.setText("Data Pengunjung");

        fromlogout.setBackground(new java.awt.Color(140, 48, 97));
        fromlogout.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        fromlogout.setForeground(java.awt.Color.white);
        fromlogout.setText("Logout");
        fromlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromlogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCustom3Layout = new javax.swing.GroupLayout(panelCustom3);
        panelCustom3.setLayout(panelCustom3Layout);
        panelCustom3Layout.setHorizontalGroup(
            panelCustom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom3Layout.createSequentialGroup()
                .addGroup(panelCustom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCustom3Layout.createSequentialGroup()
                        .addGap(860, 860, 860)
                        .addComponent(fromlogout))
                    .addGroup(panelCustom3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 969, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(341, 341, 341))
        );
        panelCustom3Layout.setVerticalGroup(
            panelCustom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fromlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelCustom1.add(panelCustom3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 1000, 460));

        tf_lokasi.setBackground(new java.awt.Color(140, 48, 97));
        tf_lokasi.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        tf_lokasi.setForeground(java.awt.Color.white);
        tf_lokasi.setPreferredSize(new java.awt.Dimension(83, 32));
        tf_lokasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_lokasiActionPerformed(evt);
            }
        });
        panelCustom1.add(tf_lokasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 340, -1));

        upgambar.setBackground(new java.awt.Color(140, 48, 97));
        upgambar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        upgambar.setForeground(java.awt.Color.white);
        upgambar.setText("Upload Gambar");
        upgambar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upgambarActionPerformed(evt);
            }
        });
        panelCustom1.add(upgambar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 320, -1, -1));

        gbr.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 153), new java.awt.Color(153, 0, 153)));
        panelCustom1.add(gbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 340, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void saveImageToDatabase(File imageFile, int id) {
    try {
        FileInputStream fis = new FileInputStream(imageFile);
        String query = "UPDATE destinasi SET gambar = ? WHERE id = ?";
        PreparedStatement pst = conn.prepareStatement(query);
        pst.setBinaryStream(1, fis, (int) imageFile.length());
        pst.setInt(2, id);
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Gambar berhasil disimpan ke database!");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error menyimpan gambar: " + e.getMessage());
    }}

    void loadDataDestinasi() {
    model_tblDestinasi.setRowCount(0); // Bersihkan tabel sebelum load data baru
    try {
        String sql = "SELECT * FROM destinasi";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet hasil = ps.executeQuery();
        
        while (hasil.next()) {
            byte[] imageData = hasil.getBytes("gambar"); // Ambil data gambar dalam bentuk byte array
            ImageIcon imageIcon = new ImageIcon(imageData); // Mengonversi byte array menjadi ImageIcon
            Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH); // Menskalakan gambar
            ImageIcon scaledIcon = new ImageIcon(image); // Menyimpan gambar yang sudah diubah ukuran

            Object[] row = new Object[]{
                hasil.getInt("id"),
                scaledIcon, // Gambar ditampilkan sebagai ImageIcon
                hasil.getString("nama"),
                hasil.getString("domisili"),
                hasil.getString("tglkunjung"),
                hasil.getString("lokasi"),
                hasil.getDouble("harga"),
                hasil.getString("wisata")
            };

            model_tblDestinasi.addRow(row); // Menambahkan data baris ke tabel
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error Load Data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    private void resetForm() {
        tf_nama.setText("");
        tx_domisili.setText("");
        tglkunjung.setDate(null); // Reset JDateChooser
        tf_lokasi.setText("");
        tf_harga.setText("");
        cb_wisata.setSelectedIndex(0);
        selectedImagePath = "";
    }
    
    private void saveDataDestinasi() {
        try {
            Date tglKunjung = tglkunjung.getDate();
            if (tglKunjung == null) {
                JOptionPane.showMessageDialog(this, "Silakan pilih tanggal kunjung!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String tglKunjungStr = sdf.format(tglKunjung);

            // Pastikan selectedImageFile sudah dipilih
            if (selectedImageFile == null) {
                JOptionPane.showMessageDialog(this, "Silakan pilih gambar!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Menyimpan gambar dalam format binary stream
            FileInputStream fis = new FileInputStream(selectedImageFile);
            String sql = "INSERT INTO destinasi (gambar, nama, domisili, tglkunjung, lokasi, harga, wisata) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setBinaryStream(1, fis, (int) selectedImageFile.length()); // Menyimpan gambar dalam binary format
            ps.setString(2, tf_nama.getText());
            ps.setString(3, tx_domisili.getText());
            ps.setDate(4, new java.sql.Date(tglkunjung.getDate().getTime())); // Konversi tanggal
            ps.setString(5, tf_lokasi.getText());
            ps.setDouble(6, Double.parseDouble(tf_harga.getText()));
            ps.setString(7, cb_wisata.getSelectedItem().toString());

            ps.executeUpdate();

            // Setelah berhasil, tampilkan data gambar di tabel
            ImageIcon icon = new ImageIcon(selectedImageFile.getAbsolutePath());
            Image scaledImage = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(scaledImage);

            model_tblDestinasi.addRow(new Object[]{
                model_tblDestinasi.getRowCount() + 1, // ID
                scaledIcon, // Gambar
                tf_nama.getText(), // Nama
                tx_domisili.getText(), // Domisili
                tglKunjungStr, // Tanggal Kunjung
                tf_lokasi.getText(), // Lokasi
                Double.parseDouble(tf_harga.getText()), // Harga
                cb_wisata.getSelectedItem().toString() // Wisata
            });

            JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");
            resetForm();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error Save Data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
   
    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {
    JFileChooser fileChooser = new JFileChooser();
    int result = fileChooser.showOpenDialog(this);
    
    if (result == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();
        try (FileInputStream fis = new FileInputStream(file)) {
            String sql = "INSERT INTO destinasi (nama, domisili, tglkunjung, lokasi, wisata, totalharga, gambar) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, tf_nama.getText());
            pst.setString(2, tx_domisili.getText());
            pst.setDate(3, (java.sql.Date) (tglkunjung.getDate())); // Format: yyyy-MM-dd
            pst.setString(4, tf_lokasi.getText());
            pst.setString(5, cb_wisata.getSelectedItem().toString());
            pst.setDouble(6, Double.parseDouble(tf_harga.getText()));
            pst.setBinaryStream(7, fis, (int) file.length());
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");
            loadDataDestinasi();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
        
    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        saveDataDestinasi();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void tf_lokasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_lokasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_lokasiActionPerformed

    private void fromlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromlogoutActionPerformed
        login beranda = new login();
        beranda.setVisible(true);
        dispose();
    }//GEN-LAST:event_fromlogoutActionPerformed

    private void upgambarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upgambarActionPerformed
        JFileChooser gambar = new JFileChooser();
        gambar.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Gambar (JPG, PNG, GIF)", "jpg", "png", "gif"));
        int result = gambar.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = gambar.getSelectedFile();
            this.selectedImageFile = selectedFile; // Simpan file untuk digunakan nanti
            try {
                // Buat ImageIcon dari file gambar yang dipilih
                ImageIcon icon = new ImageIcon(selectedFile.getAbsolutePath());

                // Ubah ukuran gambar agar sesuai dengan label
                Image scaledImage = icon.getImage().getScaledInstance(gbr.getWidth(), gbr.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(scaledImage);

                // Tampilkan gambar pada label gbr
                gbr.setIcon(scaledIcon);
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Gagal menampilkan gambar: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_upgambarActionPerformed

    private void tf_hargaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_hargaKeyReleased
        try {
            harga = Integer.parseInt(tf_harga.getText());
        } catch (NumberFormatException nfe) {
            tf_harga.setText("");
        }
    }//GEN-LAST:event_tf_hargaKeyReleased

    private void tf_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_hargaActionPerformed


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
            java.util.logging.Logger.getLogger(form_destinasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_destinasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_destinasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_destinasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_destinasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cb_wisata;
    private javax.swing.JButton fromlogout;
    private javax.swing.JLabel gbr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private custom.panelCustom panelCustom1;
    private custom.panelCustom panelCustom3;
    private javax.swing.JTable tbl_destinasi;
    private javax.swing.JTextField tf_harga;
    private javax.swing.JTextField tf_lokasi;
    private javax.swing.JTextField tf_nama;
    private com.toedter.calendar.JDateChooser tglkunjung;
    private javax.swing.JTextArea tx_domisili;
    private javax.swing.JButton upgambar;
    // End of variables declaration//GEN-END:variables
}
