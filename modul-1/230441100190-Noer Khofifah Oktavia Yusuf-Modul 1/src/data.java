
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Al Fariz
 */
public class data extends javax.swing.JFrame {

    /**
     * Creates new form data
     */
    public data() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jNama = new javax.swing.JLabel();
        jTempatLahir = new javax.swing.JLabel();
        jtanggalLahir = new javax.swing.JLabel();
        jJenisKelamin = new javax.swing.JLabel();
        jAlamat = new javax.swing.JLabel();
        jNoHp = new javax.swing.JLabel();
        jEmail = new javax.swing.JLabel();
        jProdi = new javax.swing.JLabel();
        jFakultas = new javax.swing.JLabel();
        jRBLaki = new javax.swing.JRadioButton();
        jRBperempuan = new javax.swing.JRadioButton();
        jTextNama = new javax.swing.JTextField();
        jTextTempatLahir = new javax.swing.JTextField();
        jTexttanggalLahir = new javax.swing.JTextField();
        jTextAlamat = new javax.swing.JTextField();
        jTextNoHp = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jTextProdi = new javax.swing.JTextField();
        jComboFakultas = new javax.swing.JComboBox<>();
        cbceklist = new javax.swing.JCheckBox();
        jBatal = new javax.swing.JButton();
        jReset = new javax.swing.JButton();
        jBSimpan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));
        jPanel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jPanel1PropertyChange(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("FORMULIR PENDAFTARAN UKM ITC");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("UNIVERSITAS TRUNOJOYO MADURA");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Jl.Raya Telang, PO.BOX 2 kamal, Bangkalan-madura");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Telp 085950072703");

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Al Fariz\\Documents\\semester 3\\itc.png")); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jNama.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jNama.setForeground(new java.awt.Color(255, 255, 255));
        jNama.setText("Nama :");

        jTempatLahir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTempatLahir.setForeground(new java.awt.Color(255, 255, 255));
        jTempatLahir.setText("Tempat Lahir :");

        jtanggalLahir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtanggalLahir.setForeground(new java.awt.Color(255, 255, 255));
        jtanggalLahir.setText("Tanggal Lahir :");

        jJenisKelamin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jJenisKelamin.setForeground(new java.awt.Color(255, 255, 255));
        jJenisKelamin.setText("Jenis Kelamin :");

        jAlamat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jAlamat.setForeground(new java.awt.Color(255, 255, 255));
        jAlamat.setText("Alamat :");

        jNoHp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jNoHp.setForeground(new java.awt.Color(255, 255, 255));
        jNoHp.setText(" No.Telp :");

        jEmail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jEmail.setForeground(new java.awt.Color(255, 255, 255));
        jEmail.setText("Email :");

        jProdi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jProdi.setForeground(new java.awt.Color(255, 255, 255));
        jProdi.setText("Prodi :");

        jFakultas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jFakultas.setForeground(new java.awt.Color(255, 255, 255));
        jFakultas.setText("Fakultas :");

        buttonGroup1.add(jRBLaki);
        jRBLaki.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jRBLaki.setForeground(new java.awt.Color(255, 255, 255));
        jRBLaki.setText("Laki-Laki");
        jRBLaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBLakiActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBperempuan);
        jRBperempuan.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jRBperempuan.setForeground(new java.awt.Color(255, 255, 255));
        jRBperempuan.setText("Perempuan");

        jTextNama.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNamaActionPerformed(evt);
            }
        });

        jTextTempatLahir.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jTexttanggalLahir.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTexttanggalLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexttanggalLahirActionPerformed(evt);
            }
        });

        jTextAlamat.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAlamatActionPerformed(evt);
            }
        });

        jTextNoHp.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jTextEmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jTextProdi.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextProdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextProdiActionPerformed(evt);
            }
        });

        jComboFakultas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jComboFakultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Pilihfakultas---", "Fisib", "Pertania", "Teknik", "Fkis" }));
        jComboFakultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboFakultasActionPerformed(evt);
            }
        });

        cbceklist.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cbceklist.setForeground(new java.awt.Color(255, 255, 255));
        cbceklist.setText("Data Yang Saya Masukkan Sudah Benar");

        jBatal.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jBatal.setText("Batal");
        jBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBatalActionPerformed(evt);
            }
        });

        jReset.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jReset.setText("Reset");
        jReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetActionPerformed(evt);
            }
        });

        jBSimpan.setText("Simpan");
        jBSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProdi)
                    .addComponent(jEmail)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jNoHp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextNoHp)
                            .addComponent(jTextEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jFakultas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextProdi)
                            .addComponent(jComboFakultas, 0, 344, Short.MAX_VALUE)))
                    .addComponent(cbceklist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jAlamat)
                            .addComponent(jJenisKelamin)
                            .addComponent(jtanggalLahir)
                            .addComponent(jTempatLahir)
                            .addComponent(jNama))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTexttanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jRBperempuan)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRBLaki)
                                    .addGap(70, 70, 70)))
                            .addComponent(jTextTempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextNama, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jBatal)
                        .addGap(148, 148, 148)
                        .addComponent(jReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNama)
                    .addComponent(jTextNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTempatLahir)
                    .addComponent(jTextTempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtanggalLahir)
                    .addComponent(jTexttanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRBLaki)
                            .addComponent(jRBperempuan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jAlamat)
                            .addComponent(jTextAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextNoHp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNoHp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jEmail)
                            .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jProdi)
                            .addComponent(jTextProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboFakultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFakultas))
                        .addGap(18, 18, 18)
                        .addComponent(cbceklist)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBatal)
                            .addComponent(jReset)
                            .addComponent(jBSimpan)))
                    .addComponent(jJenisKelamin))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel4)))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(0, 442, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    @SuppressWarnings("unchecked")
    private void jComboFakultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboFakultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboFakultasActionPerformed

    private void jTextProdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextProdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextProdiActionPerformed

    private void jTextAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAlamatActionPerformed

    private void jTexttanggalLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexttanggalLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTexttanggalLahirActionPerformed

    private void jTextNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNamaActionPerformed

    private void jPanel1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jPanel1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1PropertyChange

    private void jRBLakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBLakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBLakiActionPerformed

    private void jBSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSimpanActionPerformed
        String nama = jTextNama.getText();
        String tempatlahir = jTextTempatLahir.getText();
        String tanggallahir = jTexttanggalLahir.getText();
        String jenisKelamin = jRBperempuan.isSelected() ? "perempuan" : "laki-laki";
        String alamat = jTextAlamat.getText();
        String NoTelp = jTextNoHp.getText();
        String email = jTextEmail.getText();
        String prodi = jTextProdi.getText();
        String fakultas = jComboFakultas.getSelectedItem().toString();
        if (!cbceklist.isSelected()){
            JOptionPane.showMessageDialog(this, "centang checkcox terlebih dahulu.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (jTextNama.getText().isEmpty() || jTextTempatLahir.getText().isEmpty() || jTexttanggalLahir.getText().isEmpty() || jRBperempuan.getText().isEmpty() || jTextAlamat.getText().isEmpty() || jTextNoHp.getText().isEmpty() || jTextEmail.getText().isEmpty() || jTextProdi.getText().isEmpty() ){
            JOptionPane.showMessageDialog(this,"silahkan isi form  yang kosong terlebih dahulu.","peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
                
        Utm Utm = new Utm ();
        Utm.setData(nama, tempatlahir, tanggallahir, jenisKelamin, alamat, NoTelp, email, prodi, fakultas);
        Utm.setVisible(true);


    }//GEN-LAST:event_jBSimpanActionPerformed

    private void jResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetActionPerformed
        jTextNama.setText(null);
        jTextTempatLahir.setText(null);
        jTexttanggalLahir.setText(null);
        buttonGroup1.clearSelection();
        jTextAlamat.setText(null);
        jTextNoHp.setText(null);
        jTextEmail.setText(null);
        jTextProdi.setText(null);
        cbceklist.setSelected(false);
        jComboFakultas.setSelectedIndex(0);
    }//GEN-LAST:event_jResetActionPerformed

    private void jBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBatalActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jBatalActionPerformed

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
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbceklist;
    private javax.swing.JLabel jAlamat;
    private javax.swing.JButton jBSimpan;
    private javax.swing.JButton jBatal;
    private javax.swing.JComboBox<String> jComboFakultas;
    private javax.swing.JLabel jEmail;
    private javax.swing.JLabel jFakultas;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jJenisKelamin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jNama;
    private javax.swing.JLabel jNoHp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jProdi;
    private javax.swing.JRadioButton jRBLaki;
    private javax.swing.JRadioButton jRBperempuan;
    private javax.swing.JButton jReset;
    private javax.swing.JLabel jTempatLahir;
    private javax.swing.JTextField jTextAlamat;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextNama;
    private javax.swing.JTextField jTextNoHp;
    private javax.swing.JTextField jTextProdi;
    private javax.swing.JTextField jTextTempatLahir;
    private javax.swing.JTextField jTexttanggalLahir;
    private javax.swing.JLabel jtanggalLahir;
    // End of variables declaration//GEN-END:variables
}