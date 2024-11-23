package pa.pemvis;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class login extends javax.swing.JFrame {
    Connection conn;
    public login() {
        initComponents();
        setLocationRelativeTo(null);
        conn = (Connection) koneksi.getConnection();}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelCustom1 = new custom.panelCustom();
        jLabel1 = new javax.swing.JLabel();
        user1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LogUser = new javax.swing.JButton();
        pass1 = new javax.swing.JPasswordField();
        panelCustom2 = new custom.panelCustom();
        jLabel4 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        LogAdmin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        kdAdmin = new javax.swing.JPasswordField();
        password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(125, 41, 48));

        jLabel8.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 216, 177));
        jLabel8.setText("From Login");

        panelCustom1.setBackground(new java.awt.Color(254, 216, 177));
        panelCustom1.setRoundBottomLeft(25);
        panelCustom1.setRoundBottomRight(25);
        panelCustom1.setRoundTopLeft(25);
        panelCustom1.setRoundTopRight(25);
        panelCustom1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\SMT3\\loginn.png")); // NOI18N
        panelCustom1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        user1.setPreferredSize(new java.awt.Dimension(100, 42));
        panelCustom1.add(user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 170, 28));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setText("Username");
        panelCustom1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setText("Password");
        jLabel3.setToolTipText("");
        panelCustom1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        LogUser.setBackground(new java.awt.Color(255, 255, 204));
        LogUser.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        LogUser.setText("Login");
        LogUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogUserActionPerformed(evt);
            }
        });
        panelCustom1.add(LogUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 150, -1));
        panelCustom1.add(pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 170, 30));

        jTabbedPane1.addTab("Login User", panelCustom1);

        panelCustom2.setBackground(new java.awt.Color(254, 216, 177));
        panelCustom2.setRoundBottomLeft(25);
        panelCustom2.setRoundBottomRight(25);
        panelCustom2.setRoundTopLeft(25);
        panelCustom2.setRoundTopRight(25);
        panelCustom2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\SMT3\\loginn.png")); // NOI18N
        panelCustom2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        username.setPreferredSize(new java.awt.Dimension(100, 42));
        panelCustom2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 170, 28));

        LogAdmin.setBackground(new java.awt.Color(255, 255, 204));
        LogAdmin.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        LogAdmin.setText("Login");
        LogAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogAdminActionPerformed(evt);
            }
        });
        panelCustom2.add(LogAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 150, -1));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setText("Username");
        panelCustom2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel6.setText("Kode Admin");
        jLabel6.setToolTipText("");
        panelCustom2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel7.setText("Password");
        jLabel7.setToolTipText("");
        panelCustom2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));
        panelCustom2.add(kdAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 170, 30));
        panelCustom2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 170, 30));

        jTabbedPane1.addTab("Login Admin", panelCustom2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
    String username = user1.getText();
    String password = new String( pass1.getPassword());

    try {
        String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, username);
        pst.setString(2, password);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            JOptionPane.showMessageDialog(this, "Login berhasil!");
            wisata_alam wisata = new wisata_alam();
            wisata.setVisible(true);
            dispose(); // Tutup frame login
        } else {
            JOptionPane.showMessageDialog(this, "Username atau password salah.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private void simpanData(String table, String[] columns, String... params) {
    try {
        if (conn == null) {
            JOptionPane.showMessageDialog(this, "Koneksi ke database gagal!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        StringBuilder placeholders = new StringBuilder();
        for (int i = 0; i < params.length; i++) {
            placeholders.append("?");
            if (i < params.length - 1) placeholders.append(", ");
        }

        StringBuilder columnsString = new StringBuilder();
        for (int i = 0; i < columns.length; i++) {
            columnsString.append(columns[i]);
            if (i < columns.length - 1) columnsString.append(", ");
        }

        String sql = "INSERT INTO " + table + " (" + columnsString + ") VALUES (" + placeholders + ")";
        PreparedStatement pst = conn.prepareStatement(sql);
        for (int i = 0; i < params.length; i++) {
            pst.setString(i + 1, params[i]);
        }

        int rowsInserted = pst.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan ke tabel " + table + "!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Gagal menyimpan data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}
    
    private void LogAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogAdminActionPerformed
        String userinput = username.getText();               // Ambil username
        String passinput = new String(password.getPassword());  // Ambil password
        String kode = new String(kdAdmin.getPassword());        // Ambil kode_admin

        if (userinput.isEmpty() || passinput.isEmpty() || kode.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String sql = "SELECT * FROM admin WHERE username = ? AND password = ? AND kode_admin = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, userinput);  // username
            pst.setString(2, passinput);   // password
            pst.setString(3, kode);        // kode_admin
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Login berhasil!");
                form_destinasi formDestinasi = new form_destinasi();
                form_admin admin = new form_admin(formDestinasi);
                admin.setVisible(true);
                dispose();  // Tutup form login
            } else {
                JOptionPane.showMessageDialog(this, "Username, password, atau kode admin salah!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            username.setText("");
            password.setText("");
            kdAdmin.setText("");
        }
    }//GEN-LAST:event_LogAdminActionPerformed

    private void LogUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogUserActionPerformed
    String username = user1.getText();
    String password = new String(pass1.getPassword());
    try {
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            return;}
        // Mengecek apakah username ada di database
        String sql = "SELECT password FROM user WHERE username = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, username);
        ResultSet rs = pst.executeQuery();
        
        if (rs.next()) {
            // Jika username ditemukan
            String storedPassword = rs.getString("password");
            // Cek password yang dimasukkan dengan password yang ada di database
            if (storedPassword.equals(password)) {
                JOptionPane.showMessageDialog(this, "Login berhasil! Selamat datang.");
                wisata_alam wisata = new wisata_alam();
                wisata.setVisible(true);
                dispose(); // Tutup frame login
            } else {
                JOptionPane.showMessageDialog(this, "Password salah, coba lagi.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Username tidak ditemukan. Silakan registrasi terlebih dahulu.", "Error", JOptionPane.ERROR_MESSAGE);
            register regis = new register();
            regis.setVisible(true);  // Tampilkan form registrasi
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    }//GEN-LAST:event_LogUserActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                java.awt.EventQueue.invokeLater(() -> {
            new login().setVisible(true);
        });
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogAdmin;
    private javax.swing.JButton LogUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPasswordField kdAdmin;
    private custom.panelCustom panelCustom1;
    private custom.panelCustom panelCustom2;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField user1;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
