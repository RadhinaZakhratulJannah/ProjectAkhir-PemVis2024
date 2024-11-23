package pa.pemvis;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


public class form_admin extends javax.swing.JFrame {
    Connection conn;
    private DefaultTableModel model_tblDestinasi;
    private final form_destinasi formDestinasi;

    public form_admin(form_destinasi formDestinasi) {
    initComponents();
    setLocationRelativeTo(null);
    conn = koneksi.getConnection();
    this.formDestinasi = formDestinasi;
    model_tblDestinasi = new DefaultTableModel();
    model_tblDestinasi.addColumn("ID");
    model_tblDestinasi.addColumn("Gambar");
    model_tblDestinasi.addColumn("Nama Pengunjung");
    model_tblDestinasi.addColumn("Domisili");
    model_tblDestinasi.addColumn("Tgl Kunjung");
    model_tblDestinasi.addColumn("Lokasi");
    model_tblDestinasi.addColumn("Total Harga");
    model_tblDestinasi.addColumn("Wisata");
    tbl_destinasi.setModel(model_tblDestinasi);
    
    setTableCellRenderer(); // Set renderer untuk gambar
    loadTableData(); // Muat data ke tabel
}


    private void loadTableData() {
    try {
        String query = "SELECT * FROM destinasi";
        PreparedStatement pst = conn.prepareStatement(query);
        ResultSet rs = pst.executeQuery();
        model_tblDestinasi.setRowCount(0);

        while (rs.next()) {
            Object[] row = {
                rs.getInt("id"),
                getImageFromBlob(rs, "gambar"), // Ambil gambar dari database
                rs.getString("nama"),
                rs.getString("domisili"),
                rs.getString("tglkunjung"),
                rs.getString("lokasi"),
                rs.getDouble("harga"),
                rs.getString("wisata")
            };
            model_tblDestinasi.addRow(row);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error memuat data: " + e.getMessage());
    }
}
    
    private void setTableCellRenderer() {
        TableColumn imageColumn = tbl_destinasi.getColumnModel().getColumn(1);
        imageColumn.setPreferredWidth(60); // Atur lebar kolom gambar
        tbl_destinasi.setRowHeight(120); // Atur tinggi baris sesuai dengan tinggi gambar
    tbl_destinasi.setDefaultRenderer(Object.class, new javax.swing.table.DefaultTableCellRenderer() {
        @Override
        public java.awt.Component getTableCellRendererComponent(
                JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if (value instanceof ImageIcon) {
                javax.swing.JLabel label = new javax.swing.JLabel();
                label.setIcon((ImageIcon) value); // Menampilkan gambar
                return label;
            }
            return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            }
        });
    }


    private ImageIcon getImageFromBlob(ResultSet rs, String columnName) {
    try {
        byte[] imgBytes = rs.getBytes(columnName); // Mengambil gambar dalam bentuk byte array
        if (imgBytes != null && imgBytes.length > 0) {
            Image img = Toolkit.getDefaultToolkit().createImage(imgBytes); // Membuat gambar dari byte array
            return new ImageIcon(img.getScaledInstance(100, 100, Image.SCALE_SMOOTH)); // Menyesuaikan ukuran gambar
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return null; // Jika gambar tidak ada, kembalikan null
}


    private int getSelectedID() {
    int selectedRow = tbl_destinasi.getSelectedRow(); // Mendapatkan baris yang dipilih
    if (selectedRow != -1) { 
        // ID diambil dari tabel jika ada baris yang dipilih
        return Integer.parseInt(model_tblDestinasi.getValueAt(selectedRow, 0).toString());
    }

    // Jika tidak ada baris yang dipilih, gunakan input manual
    String idInput = iduser.getText().trim();
    if (idInput.isEmpty() || !idInput.matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "Pilih baris dari tabel atau masukkan ID valid!", "Error", JOptionPane.ERROR_MESSAGE);
        return -1;
    }

    return Integer.parseInt(idInput);} // Pastikan ID adalah angka valid
    
    // Fungsi untuk mengosongkan semua field input
    private void reset() {
    tf_lokasi.setText("");
    tf_nama.setText("");
    cb_wisata.setSelectedIndex(0); // Reset combo box ke pilihan pertama
    iduser.setText(""); // Jika Anda menambahkan input ID manual
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCustom1 = new custom.panelCustom();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        upadmin = new javax.swing.JButton();
        deladmin = new javax.swing.JButton();
        panelCustom3 = new custom.panelCustom();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_destinasi = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        iduser = new javax.swing.JTextField();
        cb_wisata = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nm = new javax.swing.JLabel();
        tf_nama = new javax.swing.JTextField();
        tf_lokasi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fromlogout = new javax.swing.JButton();

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
        jLabel1.setText("ADMIN ONLY");
        panelCustom1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        upadmin.setBackground(new java.awt.Color(140, 48, 97));
        upadmin.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        upadmin.setForeground(java.awt.Color.white);
        upadmin.setText("Edit");
        upadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upadminActionPerformed(evt);
            }
        });
        jPanel1.add(upadmin);

        deladmin.setBackground(new java.awt.Color(140, 48, 97));
        deladmin.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        deladmin.setForeground(java.awt.Color.white);
        deladmin.setText("Hapus");
        deladmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deladminActionPerformed(evt);
            }
        });
        jPanel1.add(deladmin);

        panelCustom1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, 280, 30));

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

        jLabel6.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel6.setText("Data Pengunjung");

        javax.swing.GroupLayout panelCustom3Layout = new javax.swing.GroupLayout(panelCustom3);
        panelCustom3.setLayout(panelCustom3Layout);
        panelCustom3Layout.setHorizontalGroup(
            panelCustom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 972, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(380, 380, 380))
        );
        panelCustom3Layout.setVerticalGroup(
            panelCustom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelCustom1.add(panelCustom3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 1000, 440));

        jPanel2.setBackground(new java.awt.Color(255, 246, 227));

        iduser.setBackground(new java.awt.Color(140, 48, 97));
        iduser.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        iduser.setForeground(java.awt.Color.white);
        iduser.setPreferredSize(new java.awt.Dimension(83, 32));

        cb_wisata.setBackground(new java.awt.Color(140, 48, 97));
        cb_wisata.setForeground(java.awt.Color.white);
        cb_wisata.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih !", "Gunung Semeru", "Gunung Bromo", "Gunung Arjuno", "Gunung Ijen", "Pantai Papuma", "Pantai Ngliyep", "Pantai Banyu Tibo", "Pantai Pulau Merah", "Kebun Teh Kertosono", "Kebun Teh Wonosari" }));
        cb_wisata.setPreferredSize(new java.awt.Dimension(82, 32));

        jLabel28.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(140, 48, 97));
        jLabel28.setText("Wisata");

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(140, 48, 97));
        jLabel2.setText("ID");

        nm.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        nm.setForeground(new java.awt.Color(140, 48, 97));
        nm.setText("Nama");

        tf_nama.setBackground(new java.awt.Color(140, 48, 97));
        tf_nama.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        tf_nama.setForeground(java.awt.Color.white);
        tf_nama.setPreferredSize(new java.awt.Dimension(83, 32));

        tf_lokasi.setBackground(new java.awt.Color(140, 48, 97));
        tf_lokasi.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        tf_lokasi.setForeground(java.awt.Color.white);
        tf_lokasi.setPreferredSize(new java.awt.Dimension(83, 32));

        jLabel8.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(140, 48, 97));
        jLabel8.setText("Lokasi");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(104, 104, 104)
                        .addComponent(iduser, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel28))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nm)
                        .addGap(77, 77, 77)
                        .addComponent(tf_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_lokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_wisata, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(iduser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel28))
                    .addComponent(cb_wisata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nm)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_lokasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(47, 47, 47))
        );

        panelCustom1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 980, 140));

        fromlogout.setBackground(new java.awt.Color(140, 48, 97));
        fromlogout.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        fromlogout.setForeground(java.awt.Color.white);
        fromlogout.setText("Logout");
        fromlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromlogoutActionPerformed(evt);
            }
        });
        panelCustom1.add(fromlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 690, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void upadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upadminActionPerformed
    int id = getSelectedID(); // Ambil ID baris yang dipilih
    if (id == -1) {
        return; // Tidak ada ID yang dipilih, keluar
    }

    // Ambil data dari input pengguna
    String lokasi = tf_lokasi.getText().trim();
    String nama = tf_nama.getText().trim();
    String wisata = cb_wisata.getSelectedItem().toString();

    // Validasi input pengguna
    if (lokasi.isEmpty() || nama.isEmpty()  || wisata.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Semua field harus diisi dengan benar!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Lakukan query UPDATE ke database
    String sql = "UPDATE destinasi SET nama = ?, lokasi = ?, wisata = ? WHERE id = ?";
    try (PreparedStatement pst = conn.prepareStatement(sql)) {
        pst.setString(1, nama);  
        pst.setString(2, lokasi);   
        pst.setString(3, wisata);
        pst.setInt(4, id);           
        int rowsAffected = pst.executeUpdate(); // Jalankan query dan cek hasilnya

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Data berhasil diperbarui!");
            loadTableData(); // Refresh data tabel
            reset();
        } else {
            JOptionPane.showMessageDialog(this, "Gagal memperbarui data. Silakan coba lagi.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error update data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } 
    }//GEN-LAST:event_upadminActionPerformed

    private void deladminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deladminActionPerformed
    int id = getSelectedID(); // Ambil ID baris yang dipilih
    if (id == -1) {
        return; // Tidak ada ID yang dipilih, keluar
    }

    // Konfirmasi penghapusan data
    int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        try {
            String sql = "DELETE FROM destinasi WHERE id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            int rowsAffected = pst.executeUpdate(); // Jalankan query DELETE dan cek hasilnya

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");
                loadTableData(); // Refresh data tabel
                reset();
            } else {
                JOptionPane.showMessageDialog(this, "Gagal menghapus data. Silakan coba lagi.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error menghapus data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } 
    }//GEN-LAST:event_deladminActionPerformed

    private void fromlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromlogoutActionPerformed
        login beranda = new login();
        beranda.setVisible(true);
        dispose();
    }//GEN-LAST:event_fromlogoutActionPerformed

    private boolean isIDExists(int id) {
    try {
        String sql = "SELECT COUNT(*) FROM destinasi WHERE id = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        if (rs.next() && rs.getInt(1) > 0) {
            return true; // ID ditemukan
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error saat validasi ID: " + e.getMessage());
    }
    return false; // ID tidak ditemukan
}

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
            java.util.logging.Logger.getLogger(form_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            // Membuat objek form_destinasi terlebih dahulu
            form_destinasi formDestinasi = new form_destinasi();  // Pastikan Anda punya konstruktor untuk form_destinasi
            new form_admin(formDestinasi).setVisible(true);  // Mengirimkan formDestinasi sebagai parameter
        }
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_wisata;
    private javax.swing.JButton deladmin;
    private javax.swing.JButton fromlogout;
    private javax.swing.JTextField iduser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nm;
    private custom.panelCustom panelCustom1;
    private custom.panelCustom panelCustom3;
    private javax.swing.JTable tbl_destinasi;
    private javax.swing.JTextField tf_lokasi;
    private javax.swing.JTextField tf_nama;
    private javax.swing.JButton upadmin;
    // End of variables declaration//GEN-END:variables
}
