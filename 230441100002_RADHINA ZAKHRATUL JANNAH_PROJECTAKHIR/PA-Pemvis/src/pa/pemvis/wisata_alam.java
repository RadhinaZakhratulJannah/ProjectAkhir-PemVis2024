package pa.pemvis;
import javax.swing.JOptionPane;
public class wisata_alam extends javax.swing.JFrame {
    public wisata_alam() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        panelCustom1 = new custom.panelCustom();
        gnIjen = new javax.swing.JLabel();
        ijen = new javax.swing.JButton();
        panelCustom2 = new custom.panelCustom();
        gnBromo = new javax.swing.JLabel();
        bromo = new javax.swing.JButton();
        panelCustom3 = new custom.panelCustom();
        gnSemeru = new javax.swing.JLabel();
        semeru = new javax.swing.JButton();
        panelCustom6 = new custom.panelCustom();
        gnArjuno = new javax.swing.JLabel();
        arjuno = new javax.swing.JButton();
        panelCustom7 = new custom.panelCustom();
        pBanyuTibo = new javax.swing.JLabel();
        pbanyutibo = new javax.swing.JButton();
        panelCustom8 = new custom.panelCustom();
        pNgliyep = new javax.swing.JLabel();
        ngliyep = new javax.swing.JButton();
        panelCustom9 = new custom.panelCustom();
        pPapuma = new javax.swing.JLabel();
        papuma = new javax.swing.JButton();
        panelCustom10 = new custom.panelCustom();
        pPulauMerah = new javax.swing.JLabel();
        pulaumerah = new javax.swing.JButton();
        panelCustom11 = new custom.panelCustom();
        ktKertosono = new javax.swing.JLabel();
        tkertosono = new javax.swing.JButton();
        panelCustom13 = new custom.panelCustom();
        ktWonosari = new javax.swing.JLabel();
        twonosari = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnWLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.black);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(22, 66, 60));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("CHOOSE YOUR DESTINATION");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 540, 40));

        panelCustom1.setBackground(new java.awt.Color(0, 0, 0, 160));
        panelCustom1.setPreferredSize(new java.awt.Dimension(220, 220));
        panelCustom1.setRoundBottomLeft(35);
        panelCustom1.setRoundBottomRight(35);
        panelCustom1.setRoundTopLeft(35);
        panelCustom1.setRoundTopRight(35);

        gnIjen.setIcon(new javax.swing.ImageIcon("C:\\SMT3\\gunung ijen.jpg")); // NOI18N

        ijen.setText("GUNUNG IJEN");
        ijen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ijenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCustom1Layout = new javax.swing.GroupLayout(panelCustom1);
        panelCustom1.setLayout(panelCustom1Layout);
        panelCustom1Layout.setHorizontalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gnIjen, javax.swing.GroupLayout.PREFERRED_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelCustom1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(ijen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCustom1Layout.setVerticalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gnIjen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ijen)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(panelCustom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, -1, 180));

        panelCustom2.setBackground(new java.awt.Color(0, 0, 0, 160));
        panelCustom2.setRoundBottomLeft(35);
        panelCustom2.setRoundBottomRight(35);
        panelCustom2.setRoundTopLeft(35);
        panelCustom2.setRoundTopRight(35);

        gnBromo.setIcon(new javax.swing.ImageIcon("C:\\SMT3\\bromo.jpeg")); // NOI18N

        bromo.setText("GUNUNG BROMO");
        bromo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bromoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCustom2Layout = new javax.swing.GroupLayout(panelCustom2);
        panelCustom2.setLayout(panelCustom2Layout);
        panelCustom2Layout.setHorizontalGroup(
            panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gnBromo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bromo)
                .addGap(44, 44, 44))
        );
        panelCustom2Layout.setVerticalGroup(
            panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gnBromo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bromo)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(panelCustom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, 180));

        panelCustom3.setBackground(new java.awt.Color(0, 0, 0, 160));
        panelCustom3.setPreferredSize(new java.awt.Dimension(220, 220));
        panelCustom3.setRoundBottomLeft(35);
        panelCustom3.setRoundBottomRight(35);
        panelCustom3.setRoundTopLeft(35);
        panelCustom3.setRoundTopRight(35);

        gnSemeru.setIcon(new javax.swing.ImageIcon("C:\\SMT3\\smru.jpeg")); // NOI18N

        semeru.setText("GUNUNG SEMERU");
        semeru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semeruActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCustom3Layout = new javax.swing.GroupLayout(panelCustom3);
        panelCustom3.setLayout(panelCustom3Layout);
        panelCustom3Layout.setHorizontalGroup(
            panelCustom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gnSemeru, javax.swing.GroupLayout.PREFERRED_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelCustom3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(semeru)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCustom3Layout.setVerticalGroup(
            panelCustom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gnSemeru)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(semeru)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(panelCustom3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 180));

        panelCustom6.setBackground(new java.awt.Color(0, 0, 0, 160));
        panelCustom6.setPreferredSize(new java.awt.Dimension(220, 220));
        panelCustom6.setRoundBottomLeft(35);
        panelCustom6.setRoundBottomRight(35);
        panelCustom6.setRoundTopLeft(35);
        panelCustom6.setRoundTopRight(35);

        gnArjuno.setIcon(new javax.swing.ImageIcon("C:\\SMT3\\arjuno.jpg")); // NOI18N

        arjuno.setText("GUNUNG ARJUNO");
        arjuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arjunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCustom6Layout = new javax.swing.GroupLayout(panelCustom6);
        panelCustom6.setLayout(panelCustom6Layout);
        panelCustom6Layout.setHorizontalGroup(
            panelCustom6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gnArjuno, javax.swing.GroupLayout.PREFERRED_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(arjuno)
                .addGap(44, 44, 44))
        );
        panelCustom6Layout.setVerticalGroup(
            panelCustom6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gnArjuno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(arjuno)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(panelCustom6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, 180));

        panelCustom7.setBackground(new java.awt.Color(0, 0, 0, 160));
        panelCustom7.setPreferredSize(new java.awt.Dimension(220, 220));
        panelCustom7.setRoundBottomLeft(35);
        panelCustom7.setRoundBottomRight(35);
        panelCustom7.setRoundTopLeft(35);
        panelCustom7.setRoundTopRight(35);

        pBanyuTibo.setIcon(new javax.swing.ImageIcon("C:\\SMT3\\banyu tibo.jpg")); // NOI18N

        pbanyutibo.setText("PANTAI BANYU TIBO");
        pbanyutibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pbanyutiboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCustom7Layout = new javax.swing.GroupLayout(panelCustom7);
        panelCustom7.setLayout(panelCustom7Layout);
        panelCustom7Layout.setHorizontalGroup(
            panelCustom7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pBanyuTibo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelCustom7Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(pbanyutibo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCustom7Layout.setVerticalGroup(
            panelCustom7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pBanyuTibo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pbanyutibo)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(panelCustom7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, -1, 180));

        panelCustom8.setBackground(new java.awt.Color(0, 0, 0, 160));
        panelCustom8.setPreferredSize(new java.awt.Dimension(220, 220));
        panelCustom8.setRoundBottomLeft(35);
        panelCustom8.setRoundBottomRight(35);
        panelCustom8.setRoundTopLeft(35);
        panelCustom8.setRoundTopRight(35);

        pNgliyep.setIcon(new javax.swing.ImageIcon("C:\\SMT3\\pantai ngliyep.jpg")); // NOI18N

        ngliyep.setText("PANTAI NGLIYEP");
        ngliyep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngliyepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCustom8Layout = new javax.swing.GroupLayout(panelCustom8);
        panelCustom8.setLayout(panelCustom8Layout);
        panelCustom8Layout.setHorizontalGroup(
            panelCustom8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pNgliyep, javax.swing.GroupLayout.PREFERRED_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelCustom8Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(ngliyep)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCustom8Layout.setVerticalGroup(
            panelCustom8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pNgliyep)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ngliyep)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(panelCustom8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, 180));

        panelCustom9.setBackground(new java.awt.Color(0, 0, 0, 160));
        panelCustom9.setPreferredSize(new java.awt.Dimension(220, 220));
        panelCustom9.setRoundBottomLeft(35);
        panelCustom9.setRoundBottomRight(35);
        panelCustom9.setRoundTopLeft(35);
        panelCustom9.setRoundTopRight(35);

        pPapuma.setIcon(new javax.swing.ImageIcon("C:\\SMT3\\pantai papuma.jpg")); // NOI18N

        papuma.setText("PANTAI PAPUMA");
        papuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                papumaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCustom9Layout = new javax.swing.GroupLayout(panelCustom9);
        panelCustom9.setLayout(panelCustom9Layout);
        panelCustom9Layout.setHorizontalGroup(
            panelCustom9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pPapuma, javax.swing.GroupLayout.PREFERRED_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelCustom9Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(papuma)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCustom9Layout.setVerticalGroup(
            panelCustom9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pPapuma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(papuma)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(panelCustom9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, 180));

        panelCustom10.setBackground(new java.awt.Color(0, 0, 0, 160));
        panelCustom10.setPreferredSize(new java.awt.Dimension(220, 220));
        panelCustom10.setRoundBottomLeft(35);
        panelCustom10.setRoundBottomRight(35);
        panelCustom10.setRoundTopLeft(35);
        panelCustom10.setRoundTopRight(35);

        pPulauMerah.setIcon(new javax.swing.ImageIcon("C:\\SMT3\\pantai pulau merah.jpg")); // NOI18N

        pulaumerah.setText("PANTAI PULAU MERAH");
        pulaumerah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulaumerahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCustom10Layout = new javax.swing.GroupLayout(panelCustom10);
        panelCustom10.setLayout(panelCustom10Layout);
        panelCustom10Layout.setHorizontalGroup(
            panelCustom10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pPulauMerah, javax.swing.GroupLayout.PREFERRED_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pulaumerah)
                .addGap(30, 30, 30))
        );
        panelCustom10Layout.setVerticalGroup(
            panelCustom10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pPulauMerah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pulaumerah)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(panelCustom10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, -1, 180));

        panelCustom11.setBackground(new java.awt.Color(0, 0, 0, 160));
        panelCustom11.setPreferredSize(new java.awt.Dimension(220, 220));
        panelCustom11.setRoundBottomLeft(35);
        panelCustom11.setRoundBottomRight(35);
        panelCustom11.setRoundTopLeft(35);
        panelCustom11.setRoundTopRight(35);

        ktKertosono.setIcon(new javax.swing.ImageIcon("C:\\SMT3\\kebun teh kertowono.jpg")); // NOI18N

        tkertosono.setText("KEBUN TEH KERTOWONO");
        tkertosono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tkertosonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCustom11Layout = new javax.swing.GroupLayout(panelCustom11);
        panelCustom11.setLayout(panelCustom11Layout);
        panelCustom11Layout.setHorizontalGroup(
            panelCustom11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCustom11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom11Layout.createSequentialGroup()
                        .addComponent(ktKertosono, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom11Layout.createSequentialGroup()
                        .addComponent(tkertosono)
                        .addGap(24, 24, 24))))
        );
        panelCustom11Layout.setVerticalGroup(
            panelCustom11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ktKertosono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tkertosono)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(panelCustom11, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 260, -1, 180));

        panelCustom13.setBackground(new java.awt.Color(0, 0, 0, 160));
        panelCustom13.setPreferredSize(new java.awt.Dimension(220, 220));
        panelCustom13.setRoundBottomLeft(35);
        panelCustom13.setRoundBottomRight(35);
        panelCustom13.setRoundTopLeft(35);
        panelCustom13.setRoundTopRight(35);

        ktWonosari.setIcon(new javax.swing.ImageIcon("C:\\SMT3\\kebuh teh wonosari.jpg")); // NOI18N

        twonosari.setText("KEBUH TEH WONOSARI");
        twonosari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twonosariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCustom13Layout = new javax.swing.GroupLayout(panelCustom13);
        panelCustom13.setLayout(panelCustom13Layout);
        panelCustom13Layout.setHorizontalGroup(
            panelCustom13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ktWonosari, javax.swing.GroupLayout.PREFERRED_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(twonosari)
                .addGap(29, 29, 29))
        );
        panelCustom13Layout.setVerticalGroup(
            panelCustom13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ktWonosari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(twonosari)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(panelCustom13, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 60, -1, 180));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(45, 69, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\SMT3\\gm.jpg")); // NOI18N
        jLabel1.setText(" ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 450));

        btnWLogout.setBackground(new java.awt.Color(204, 255, 255));
        btnWLogout.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnWLogout.setText("Logout");
        btnWLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnWLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void semeruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semeruActionPerformed
        String[] options = {"Next"};        
        String detail = """
                        1. Gunung Semeru
                        -> Lokasi: Kabupaten Lumajang dan Kabupaten Malang, Jawa Timur
                        -> Daya Tarik:
                            -Puncak Mahameru (3.676 mdpl), gunung tertinggi di Pulau Jawa.
                            -Ranu Kumbolo, danau cantik di tengah jalur pendakian.
                            -Oro-Oro Ombo, padang savana dengan hamparan bunga ungu (musim tertentu).
                            -Pemandangan sunrise dan kabut pegunungan.
                        -> Aktivitas:
                            -Mendaki gunung hingga pos tertentu (tergantung kemampuan dan izin).
                            -Camping di Ranu Kumbolo.
                            -Fotografi lanskap dan alam.
                        -> Fasilitas:
                            -Transportasi: Antar-jemput dari titik awal (Malang/Lumajang).
                            -Perlengkapan: Tenda, matras, sleeping bag, dan peralatan masak.
                            -Makanan dan Minuman: 3x sehari selama perjalanan (menu sederhana).
                            -Pemandu Wisata: Guide profesional bersertifikat dari Taman Nasional.
                            -Porter: Opsional, membantu membawa barang (biaya tambahan).
                            -Asuransi Wisata: Perlindungan selama pendakian.
                            -Perizinan: Termasuk dalam paket, pengurusan melalui Taman Nasional.
                        -> Catatan:
                            -Durasi: 3 hari 2 malam (tergantung kondisi fisik dan cuaca).
                            -Pendakian ke puncak Mahameru hanya untuk pendaki berpengalaman.
                            -Persiapkan fisik minimal 2 minggu sebelum keberangkatan.
                        -> Estimasi Biaya Paket:
                            -Mulai dari Rp 1.500.000 - Rp 2.500.000/orang, tergantung jumlah peserta dan fasilitas tambahan yang dipilih.
                        """;
                    // Menampilkan JOptionPane dengan tombol "Next"
                    int result = JOptionPane.showOptionDialog(
                        null,detail,"Detail Gunung Semeru",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,
                        options,options[0]);
                    if (result == 0) {// Menangani tombol yang ditekan
                    form_destinasi form = new form_destinasi();
                    form.setVisible(true);
                        dispose();
                    } else {
                        System.out.println("Dialog ditutup tanpa memilih.");}
    }//GEN-LAST:event_semeruActionPerformed

    private void bromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bromoActionPerformed
        String[] options = {"Next"};        
        String detail = """
                        2. Gunung Bromo
                        -> Lokasi: Kabupaten Probolinggo, Kabupaten Pasuruan, Kabupaten Lumajang, dan Kabupaten Malang, Jawa Timur
                        -> Daya Tarik:
                            -Penanjakan 1 dan Penanjakan 2: Tempat terbaik menikmati sunrise.
                            -Kawah Bromo: Kawah aktif dengan panorama unik.
                            -Pasir Berbisik: Hamparan pasir luas dan tenang.
                            -Bukit Teletubbies: Padang rumput hijau yang menyerupai bukit di serial anak-anak.
                        -> Aktivitas:
                            -Menikmati sunrise di Penanjakan.
                            -Berjalan menuju kawah Bromo.
                            -Jeep tour mengelilingi kawasan Bromo.
                            -Fotografi alam dan budaya.
                        -> Fasilitas:
                            -Transportasi: Jeep 4x4 untuk berkeliling Bromo.
                            -Tiket Masuk: Termasuk kawasan wisata.
                            -Makanan dan Minuman: 1x sarapan (opsional).
                            -Pemandu Wisata: Opsional.
                            -Penginapan: Homestay sederhana di sekitar Bromo (jika paket 2 hari).
                        -> Catatan:
                            -Durasi: 1 hari (tanpa menginap) atau 2 hari 1 malam (dengan menginap).
                            -Disarankan memakai jaket tebal karena suhu dingin (4-15°C).
                        -> Estimasi Biaya Paket:
                            -Mulai dari Rp 500.000 - Rp 1.000.000/orang (tergantung jumlah peserta dan fasilitas tambahan).
                        """;
                    // Menampilkan JOptionPane dengan tombol "Next"
                    int result = JOptionPane.showOptionDialog(
                        null,detail,"Detail Gunung Bromo",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,
                        options,options[0]
                    );
                    // Menangani tombol yang ditekan
                    if (result == 0) {
                    // Tampilkan frame FormDestinasi
                        form_destinasi form = new form_destinasi();
                        form.setVisible(true);
                        dispose();
                    } else {
                        System.out.println("Dialog ditutup tanpa memilih.");}
    }//GEN-LAST:event_bromoActionPerformed

    private void arjunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arjunoActionPerformed
        String[] options = {"Next"};        
        String detail = """
                        3. Gunung Arjuno
                        -> Lokasi: Kabupaten Malang dan Kabupaten Pasuruan, Jawa Timur
                        -> Daya Tarik:
                            -Puncak Ogal-Agil: Panorama spektakuler di atas awan.
                            -Jalur Pendakian: Melalui Lawang, Purwosari, atau Tretes dengan tantangan berbeda.
                            -Hutan Pinus dan Savana: Lanskap alami yang memukau.
                        -> Aktivitas:
                            -Pendakian ke puncak Arjuno.
                            -Camping di pos pendakian.
                            -Fotografi pemandangan dan flora.
                        -> Fasilitas:
                            -Transportasi: Antar-jemput dari Malang/Pasuruan.
                            -Perlengkapan: Tenda, sleeping bag, peralatan masak.
                            -Makanan dan Minuman: Selama pendakian.
                            -Pemandu Wisata: Guide lokal berpengalaman.
                            -Perizinan: Pengurusan izin pendakian.
                        -> Catatan:
                            -Durasi: 3 hari 2 malam (tergantung rute dan kondisi fisik).
                            -Jalur cukup menantang, cocok untuk pendaki berpengalaman.
                        -> Estimasi Biaya Paket:
                            -Mulai dari Rp 1.200.000 - Rp 2.000.000/orang (tergantung jumlah peserta).
                        """;
                    // Menampilkan JOptionPane dengan tombol "Next"
                    int result = JOptionPane.showOptionDialog(
                        null,detail,"Detail Gunung Arjuno",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,
                        options,options[0]
                    );
                    // Menangani tombol yang ditekan
                    if (result == 0) {
                    // Tampilkan frame FormDestinasi
                        form_destinasi form = new form_destinasi();
                        form.setVisible(true);
                        dispose();
                    } else {
                        System.out.println("Dialog ditutup tanpa memilih.");}
    }//GEN-LAST:event_arjunoActionPerformed

    private void ijenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ijenActionPerformed
        String[] options = {"Next"};        
        String detail = """
                        4. Gunung Ijen
                        -> Lokasi: Kabupaten Banyuwangi dan Kabupaten Bondowoso, Jawa Timur
                        -> Daya Tarik:
                            -Blue Fire: Fenomena api biru langka yang hanya ada di Ijen dan Islandia.
                            -Kawah Ijen: Danau asam terbesar di dunia dengan warna hijau toska.
                            -Penambang Belerang: Menyaksikan aktivitas penambang tradisional.
                        -> Aktivitas:
                            -Trekking ke puncak Ijen untuk melihat Blue Fire.
                            -Fotografi alam dan fenomena langka.
                        -> Fasilitas:
                            -Transportasi: Antar-jemput ke basecamp Paltuding.
                            -Pemandu Lokal: Guide profesional untuk trekking malam.
                            -Makanan dan Minuman: 1x makan (sarapan setelah trekking).
                            -Peralatan: Masker khusus untuk melindungi dari gas belerang.
                            -Tiket Masuk: Termasuk izin wisata.
                        -> Catatan:
                            -Durasi: 1 hari 1 malam (start tengah malam).
                            -Suhu sangat dingin, bawalah jaket dan senter.
                        -> Estimasi Biaya Paket:
                            -Mulai dari Rp 700.000 - Rp 1.500.000/orang.
                        """;
                    // Menampilkan JOptionPane dengan tombol "Next"
                    int result = JOptionPane.showOptionDialog(
                        null,detail,"Detail Gunung Ijen",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,
                        options,options[0]
                    );
                    // Menangani tombol yang ditekan
                    if (result == 0) {
                    // Tampilkan frame FormDestinasi
                        form_destinasi form = new form_destinasi();
                        form.setVisible(true);
                        dispose();
                    } else {
                        System.out.println("Dialog ditutup tanpa memilih.");}
    }//GEN-LAST:event_ijenActionPerformed

    private void twonosariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twonosariActionPerformed
        String[] options = {"Next"};        
        String detail = """
                        5. Kebun Teh Wonosari
                        -> Lokasi: Kecamatan Lawang, Kabupaten Malang, Jawa Timur
                        -> Daya Tarik:
                            -Hamparan kebun teh hijau yang sejuk.
                            -Udara segar khas pegunungan.
                            -Pabrik teh yang bisa dikunjungi untuk wisata edukasi.
                        -> Aktivitas:
                            -Jalan-jalan santai di kebun teh.
                            -Wisata edukasi proses pengolahan teh.
                            -Tea tasting (mencoba berbagai jenis teh).
                        -> Fasilitas:
                            -Transportasi: Antar-jemput dari Malang.
                            -Tiket Masuk: Termasuk tur ke pabrik teh.
                            -Makanan dan Minuman: 1x makan siang.
                            -Guide Lokal: Untuk tur kebun dan pabrik.
                        > Catatan:
                            -Durasi: 1 hari.
                            -Cocok untuk keluarga atau wisata edukasi.
                        -> Estimasi Biaya Paket:
                            -Mulai dari Rp 200.000 - Rp 400.000/orang.
                        """;
                    // Menampilkan JOptionPane dengan tombol "Next"
                    int result = JOptionPane.showOptionDialog(
                        null,detail,"Detail Kebun Teh Wonosari",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,
                        options,options[0]
                    );
                    // Menangani tombol yang ditekan
                    if (result == 0) {
                    // Tampilkan frame FormDestinasi
                        form_destinasi form = new form_destinasi();
                        form.setVisible(true);
                        dispose();
                    } else {
                        System.out.println("Dialog ditutup tanpa memilih.");}
    }//GEN-LAST:event_twonosariActionPerformed

    private void papumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_papumaActionPerformed
        String[] options = {"Next"};        
        String detail = """
                        6. Pantai Papuma
                        -> Lokasi: Kabupaten Jember, Jawa Timur
                        -> Daya Tarik:
                            -Hamparan pasir putih yang indah.
                            -Batu karang besar di tengah laut.
                            -Sunrise dan sunset yang memesona.
                        -> Aktivitas:
                            -Bermain pasir dan berenang.
                            -Menikmati sunrise dari Bukit Siti Hinggil.
                            -Fotografi pemandangan laut.
                        -> Fasilitas:
                            -Transportasi: Antar-jemput dari Jember.
                            -Tiket Masuk: Termasuk ke kawasan wisata.
                            -Makanan dan Minuman: 1x makan siang di restoran lokal.
                            -Guide: Opsional.
                        -> Catatan:
                            -Durasi: 1 hari (tanpa menginap).
                            -Penginapan tersedia bagi yang ingin menginap (biaya tambahan).
                        -> Estimasi Biaya Paket:
                            -Mulai dari Rp 300.000 - Rp 600.000/orang.
                        """;
                    // Menampilkan JOptionPane dengan tombol "Next"
                    int result = JOptionPane.showOptionDialog(
                        null,detail,"Detail Pantai Papuma",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,
                        options,options[0]
                    );
                    // Menangani tombol yang ditekan
                    if (result == 0) {
                    // Tampilkan frame FormDestinasi
                        form_destinasi form = new form_destinasi();
                        form.setVisible(true);
                        dispose();
                    } else {
                        System.out.println("Dialog ditutup tanpa memilih.");}
    }//GEN-LAST:event_papumaActionPerformed

    private void ngliyepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ngliyepActionPerformed
        String[] options = {"Next"};        
        String detail = """
                        7. Pantai Ngliyep
                        -> Lokasi: Kabupaten Malang, Jawa Timur
                        -> Daya Tarik:
                            -Pasir putih yang bersih.
                            -Tebing tinggi dengan panorama laut selatan.
                            -Ritual Labuhan yang diadakan setahun sekali.
                        -> Aktivitas:
                            -Bermain pasir dan menikmati ombak.
                            -Mendaki tebing untuk pemandangan dari atas.
                            -Fotografi alam.
                        -> Fasilitas:
                            -Transportasi: Antar-jemput dari Malang.
                            -Tiket Masuk: Termasuk.
                            -Makanan dan Minuman: 1x makan siang.
                            -Area Istirahat: Gazebo untuk bersantai.
                        -> Catatan:
                            -Durasi: 1 hari.
                            -Ombak cukup besar, jadi perlu waspada jika bermain di tepi laut.
                        -> Estimasi Biaya Paket:
                            -Mulai dari Rp 250.000 - Rp 500.000/orang.
                        """;
                    // Menampilkan JOptionPane dengan tombol "Next"
                    int result = JOptionPane.showOptionDialog(
                        null,detail,"Detail Pantai Ngliyep",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,
                        options,options[0]
                    );
                    // Menangani tombol yang ditekan
                    if (result == 0) {
                    // Tampilkan frame FormDestinasi
                        form_destinasi form = new form_destinasi();
                        form.setVisible(true);
                        dispose();
                    } else {
                        System.out.println("Dialog ditutup tanpa memilih.");}
    }//GEN-LAST:event_ngliyepActionPerformed

    private void pbanyutiboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pbanyutiboActionPerformed
        String[] options = {"Next"};        
        String detail = """
                        8. Pantai Banyu Tibo
                        -> Lokasi: Kabupaten Pacitan, Jawa Timur
                        -> Daya Tarik:
                            -Air terjun yang langsung mengalir ke laut.
                            -Pasir putih yang bersih dan suasana yang tenang.
                            -Panorama laut selatan dengan ombak besar.
                        -> Aktivitas:
                            -Bermain air di sekitar air terjun (saat kondisi aman).
                            -Fotografi lanskap unik air terjun dan pantai.
                            -Bersantai menikmati suasana pantai.
                        -> Fasilitas:
                            -Transportasi: Antar-jemput dari Pacitan atau Surabaya.
                            -Tiket Masuk: Termasuk ke kawasan pantai.
                            -Makanan dan Minuman: 1x makan siang di area pantai.
                            -Gazebo: Area santai untuk menikmati pemandangan.
                        -> Catatan:
                            -Durasi: 1 hari (tanpa menginap).
                            -Akses jalan cukup menantang, disarankan menggunakan kendaraan yang sesuai.
                        -> Estimasi Biaya Paket:
                            -Mulai dari Rp 300.000 - Rp 600.000/orang.
                        """;
                    // Menampilkan JOptionPane dengan tombol "Next"
                    int result = JOptionPane.showOptionDialog(
                        null,detail,"Detail Pantai Banyu Tibo",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,
                        options,options[0]
                    );
                    // Menangani tombol yang ditekan
                    if (result == 0) {
                    // Tampilkan frame FormDestinasi
                        form_destinasi form = new form_destinasi();
                        form.setVisible(true);
                        dispose();
                    } else {
                        System.out.println("Dialog ditutup tanpa memilih.");}
    }//GEN-LAST:event_pbanyutiboActionPerformed

    private void pulaumerahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulaumerahActionPerformed
        String[] options = {"Next"};        
        String detail = """
                        9. Pantai Pulau Merah
                        -> Lokasi: Kabupaten Banyuwangi, Jawa Timur
                        -> Daya Tarik:
                            -Bukit kecil di tengah laut yang mirip pulau dengan tanah kemerahan.
                            -Sunset yang indah dan terkenal di Banyuwangi.
                            -Ombak cocok untuk pemula belajar surfing.
                        -> Aktivitas:
                            -Surfing (dengan penyewaan peralatan).
                            -Menikmati sunset dari tepi pantai.
                            -Fotografi pemandangan laut.
                        -> Fasilitas:
                            -Transportasi: Antar-jemput dari Banyuwangi.
                            -Tiket Masuk: Termasuk.
                            -Penyewaan Surfing: Opsional (biaya tambahan).
                            -Makanan dan Minuman: 1x makan siang di restoran lokal.
                            -Area Santai: Payung pantai dan kursi santai.
                        -> Catatan:
                            -Durasi: 1 hari (tanpa menginap).
                            -Disarankan membawa baju ganti untuk aktivitas di air.
                        -> Estimasi Biaya Paket:
                            -Mulai dari Rp 250.000 - Rp 500.000/orang.
                        """;
                    // Menampilkan JOptionPane dengan tombol "Next"
                    int result = JOptionPane.showOptionDialog(
                        null,detail,"Detail Pantai Pulau Merah",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,
                        options,options[0]
                    );
                    // Menangani tombol yang ditekan
                    if (result == 0) {
                    // Tampilkan frame FormDestinasi
                        form_destinasi form = new form_destinasi();
                        form.setVisible(true);
                        dispose();
                    } else {
                        System.out.println("Dialog ditutup tanpa memilih.");}
    }//GEN-LAST:event_pulaumerahActionPerformed

    private void tkertosonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tkertosonoActionPerformed
        String[] options = {"Next"};        
        String detail = """
                        10. Kebun Teh Kertosono
                        -> Lokasi: Kecamatan Sempu, Kabupaten Banyuwangi, Jawa Timur
                        -> Daya Tarik:
                            -Suasana kebun teh yang tenang dan sejuk.
                            -Lanskap hijau dengan pemandangan pegunungan di kejauhan.
                            -Spot foto instagramable di tengah kebun.
                        -> Aktivitas:
                            -Jalan santai di area kebun teh.
                            -Fotografi lanskap dan aktivitas petani teh.
                            -Wisata edukasi pengolahan teh (opsional).
                        -> Fasilitas:
                            -Transportasi: Antar-jemput dari Banyuwangi.
                            -Tiket Masuk: Termasuk tur ke kebun.
                            -Makanan dan Minuman: 1x makan siang.
                            -Guide Lokal: Untuk menjelaskan tentang teh dan area kebun.
                        -> Catatan:
                            -Durasi: 1 hari (tanpa menginap).
                            -Cocok untuk wisata santai bersama keluarga.
                        -> Estimasi Biaya Paket:
                            -Mulai dari Rp 200.000 - Rp 400.000/orang.
                        """;
                    // Menampilkan JOptionPane dengan tombol "Next"
                    int result = JOptionPane.showOptionDialog(
                        null,detail,"Detail kebun Ten Kertosono",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,
                        options,options[0]
                    );
                    // Menangani tombol yang ditekan
                    if (result == 0) {
                    // Tampilkan frame FormDestinasi
                        form_destinasi form = new form_destinasi();
                        form.setVisible(true);
                        dispose();
                    } else {
                        System.out.println("Dialog ditutup tanpa memilih.");}
    }//GEN-LAST:event_tkertosonoActionPerformed

    private void btnWLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWLogoutActionPerformed
        login beranda = new login();
        beranda.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnWLogoutActionPerformed
 
    
    
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
            java.util.logging.Logger.getLogger(wisata_alam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(wisata_alam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(wisata_alam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(wisata_alam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new wisata_alam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton arjuno;
    private javax.swing.JButton bromo;
    private javax.swing.JButton btnWLogout;
    private javax.swing.JLabel gnArjuno;
    private javax.swing.JLabel gnBromo;
    private javax.swing.JLabel gnIjen;
    private javax.swing.JLabel gnSemeru;
    private javax.swing.JButton ijen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel ktKertosono;
    private javax.swing.JLabel ktWonosari;
    private javax.swing.JButton ngliyep;
    private javax.swing.JLabel pBanyuTibo;
    private javax.swing.JLabel pNgliyep;
    private javax.swing.JLabel pPapuma;
    private javax.swing.JLabel pPulauMerah;
    private custom.panelCustom panelCustom1;
    private custom.panelCustom panelCustom10;
    private custom.panelCustom panelCustom11;
    private custom.panelCustom panelCustom13;
    private custom.panelCustom panelCustom2;
    private custom.panelCustom panelCustom3;
    private custom.panelCustom panelCustom6;
    private custom.panelCustom panelCustom7;
    private custom.panelCustom panelCustom8;
    private custom.panelCustom panelCustom9;
    private javax.swing.JButton papuma;
    private javax.swing.JButton pbanyutibo;
    private javax.swing.JButton pulaumerah;
    private javax.swing.JButton semeru;
    private javax.swing.JButton tkertosono;
    private javax.swing.JButton twonosari;
    // End of variables declaration//GEN-END:variables
}
