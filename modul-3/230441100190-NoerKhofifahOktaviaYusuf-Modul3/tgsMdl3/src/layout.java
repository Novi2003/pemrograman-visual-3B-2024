
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Al Fariz
 */
public class layout extends javax.swing.JFrame {

    /**
     * Creates new form layout
     */
    public layout() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jinsto = new javax.swing.JButton();
        jCombantrin = new javax.swing.JButton();
        jFeminax = new javax.swing.JButton();
        jimboost = new javax.swing.JButton();
        jMixagrip = new javax.swing.JButton();
        jPracetamol = new javax.swing.JButton();
        jPromag = new javax.swing.JButton();
        jSangobion = new javax.swing.JButton();
        jVicks = new javax.swing.JButton();
        jAmoxcilin1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSimpan = new javax.swing.JButton();
        jTkeluhan = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bodoni MT Black", 2, 18)); // NOI18N
        jLabel1.setText("TOKO OBAT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 130, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Al Fariz\\Downloads\\apt-removebg-preview.png")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 70));

        jLabel5.setText("jl.Trunojoyo.gg 5 kh.agus salim,Pamekasan");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(2, 5));

        jinsto.setIcon(new javax.swing.ImageIcon("C:\\Users\\Al Fariz\\Downloads\\insto-removebg-preview.png")); // NOI18N
        jPanel2.add(jinsto);

        jCombantrin.setIcon(new javax.swing.ImageIcon("C:\\Users\\Al Fariz\\Downloads\\combantrin-removebg-preview (1).png")); // NOI18N
        jPanel2.add(jCombantrin);

        jFeminax.setIcon(new javax.swing.ImageIcon("C:\\Users\\Al Fariz\\Downloads\\feminax-removebg-preview.png")); // NOI18N
        jPanel2.add(jFeminax);

        jimboost.setIcon(new javax.swing.ImageIcon("C:\\Users\\Al Fariz\\Downloads\\imboost-removebg-preview.png")); // NOI18N
        jimboost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jimboostActionPerformed(evt);
            }
        });
        jPanel2.add(jimboost);

        jMixagrip.setIcon(new javax.swing.ImageIcon("C:\\Users\\Al Fariz\\Downloads\\mixagrip-removebg-preview.png")); // NOI18N
        jPanel2.add(jMixagrip);

        jPracetamol.setIcon(new javax.swing.ImageIcon("C:\\Users\\Al Fariz\\Downloads\\new-removebg-preview.png")); // NOI18N
        jPanel2.add(jPracetamol);

        jPromag.setIcon(new javax.swing.ImageIcon("C:\\Users\\Al Fariz\\Downloads\\promag-removebg-preview.png")); // NOI18N
        jPanel2.add(jPromag);

        jSangobion.setIcon(new javax.swing.ImageIcon("C:\\Users\\Al Fariz\\Downloads\\sangobian-removebg-preview.png")); // NOI18N
        jPanel2.add(jSangobion);

        jVicks.setIcon(new javax.swing.ImageIcon("C:\\Users\\Al Fariz\\Downloads\\vicks-removebg-preview.png")); // NOI18N
        jPanel2.add(jVicks);

        jAmoxcilin1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Al Fariz\\Downloads\\amoxcilin-removebg-preview.png")); // NOI18N
        jPanel2.add(jAmoxcilin1);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nama :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        jPanel3.add(jTNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 160, -1));

        jLabel3.setText("Keluhan :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jSimpan.setText("Simpan");
        jSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSimpanActionPerformed(evt);
            }
        });
        jPanel3.add(jSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));
        jPanel3.add(jTkeluhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 160, -1));

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Modern No. 20", 3, 14)); // NOI18N
        jLabel4.setText("--------------------------------------DAFTAR OBAT ---------------------------------------- ");
        jPanel4.add(jLabel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jimboostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jimboostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jimboostActionPerformed

    private void jSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSimpanActionPerformed
    String nama, keluhan, obat, detailObat = null;
    
    nama = jTNama.getText();
    keluhan = jTkeluhan.getText();
    
    if(keluhan.equalsIgnoreCase("sakit kepala")){
        obat = "Paracetamol";
        detailObat = "Paracetamol digunakan untuk mengobati rasa sakit dan demam. Biasanya digunakan untuk sakit kepala, nyeri otot, arthritis, sakit punggung, sakit gigi, pilek, dan demam.";
        JOptionPane.showMessageDialog(null,"Nama = " + nama + "\nKeluhan = " + keluhan + "\nRekomendasi Obat = " + obat + "\nDetail = " + detailObat,"Isi pesan", JOptionPane.INFORMATION_MESSAGE);
    } else if(keluhan.equalsIgnoreCase("iritasa mata")){
        obat = "Insto";
        detailObat = "Insto bermanfaat untuk meredakan gejala iritasi mata ringan, seperti mata merah, gatal, atau kering. Obat ini tersedia dalam bentuk tetes mata dengan dua varian, yaitu Insto Regular dan Insto Dry Eyes";
        JOptionPane.showMessageDialog(null,"Nama = " + nama  + "\nKeluhan = " + keluhan + "\nRekomendasi Obat = " + obat + "\nDetail = " + detailObat,"Isi pesan", JOptionPane.INFORMATION_MESSAGE);
    } else if(keluhan.equalsIgnoreCase("cacingan")){
        obat = "Combantrin";
        obat = "Obat ini diformulasikan khusus untuk mengatasi infeksi cacing, seperti cacing gelang, cacing kermi, cacing tambang, serta cacing Trichostrongylus colubriformis.";
        JOptionPane.showMessageDialog(null,"Nama = " + nama  + "\nKeluhan = " + keluhan + "\nRekomendasi Obat = " + obat + "\nDetail = " + detailObat,"Isi pesan", JOptionPane.INFORMATION_MESSAGE);
    } else if(keluhan.equalsIgnoreCase("meredakan nyeri haid")){
        obat = "Feminax";
        detailObat = "Feminax adalah obat yang bermanfaat untuk meredakan nyeri haid, termasuk kram perut dan sakit punggung. Obat ini mengandung kombinasi bahan aktif paracetamol dan ekstrak hiosiamin. ";
        JOptionPane.showMessageDialog(null,"Nama = " + nama  + "\nKeluhan = " + keluhan + "\nRekomendasi Obat = " + obat + "\nDetail = " + detailObat,"Isi pesan", JOptionPane.INFORMATION_MESSAGE);
    }  else if(keluhan.equalsIgnoreCase("vitamin")){
        obat = "Imboost";
        detailObat = "Imboost adalah suplemen yang bermanfaat untuk meningkatkan daya tahan tubuh. Imboost berperan menjaga tubuh agar tidak mudah sakit, menghambat perkembangan virus, dan mempercepat penyembuhan penyakit.";
        JOptionPane.showMessageDialog(null,"Nama = " + nama  + "\nKeluhan = " + keluhan + "\nRekomendasi Obat = " + obat + "\nDetail = " + detailObat,"Isi pesan", JOptionPane.INFORMATION_MESSAGE);
    } else if(keluhan.equalsIgnoreCase("flu batuk")){
        obat = "Mixagrip";
        detailObat = "Mixagrip bermanfaat untuk meredakan gejala flu, seperti bersin-bersin, hidung tersumbat, batuk, demam, dan sakit kepala.";
        JOptionPane.showMessageDialog(null,"Nama = " + nama  + "\nKeluhan = " + keluhan + "\nRekomendasi Obat = " + obat + "\nDetail = " + detailObat,"Isi pesan", JOptionPane.INFORMATION_MESSAGE);
    } else if(keluhan.equalsIgnoreCase("sakit maag")){
        obat = "Promag";
        detailObat = "Promag bermanfaat untuk mengatasi keluhan sakit maag, penyakit asam lambung naik, atau perut kembung.";
        JOptionPane.showMessageDialog(null,"Nama = " + nama  + "\nKeluhan = " + keluhan + "\nRekomendasi Obat = " + obat + "\nDetail = " + detailObat,"Isi pesan", JOptionPane.INFORMATION_MESSAGE);
    } else if(keluhan.equalsIgnoreCase("kurang darah")){
        obat = "Sangobion";
        detailObat = "Sangobion adalah suplemen untuk mengatasi kurang darah (anemia).";
        JOptionPane.showMessageDialog(null,"Nama = " + nama  + "\nKeluhan = " + keluhan + "\nRekomendasi Obat = " + obat + "\nDetail = " + detailObat,"Isi pesan", JOptionPane.INFORMATION_MESSAGE);
    } else if(keluhan.equalsIgnoreCase("tenggorokan gatal")){
        obat = "Vicks formula 44";
        detailObat = "Vicks Formula 44 adalah obat untuk meredakan gejala batuk, pilek, bersin-bersin, dan tenggorokan gatal.";
        JOptionPane.showMessageDialog(null,"Nama = " + nama  + "\nKeluhan = " + keluhan + "\nRekomendasi Obat = " + obat + "\nDetail = " + detailObat,"Isi pesan", JOptionPane.INFORMATION_MESSAGE);
    } else if(keluhan.equalsIgnoreCase("alergi")){
        obat = "Amoxcilin";
        detailObat = "Amoxicillin adalah obat antibiotik yang digunakan untuk mengatasi berbagai penyakit akibat infeksi bakteri, seperti infeksi telinga, tonsilitis, atau bronkitis. Obat ini hanya boleh digunakan berdasarkan resep dokter.";
        JOptionPane.showMessageDialog(null,"Nama = " + nama + "\nKeluhan = " + keluhan + "\nRekomendasi Obat = " + obat + "\nDetail = " + detailObat,"Isi pesan", JOptionPane.INFORMATION_MESSAGE);
    }else {
        JOptionPane.showMessageDialog(null,"Keluhan tidak ditemukan. Silakan masukkan keluhan yang valid.","Isi pesan", JOptionPane.WARNING_MESSAGE);
    }

    }//GEN-LAST:event_jSimpanActionPerformed

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
            java.util.logging.Logger.getLogger(layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new layout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jAmoxcilin1;
    private javax.swing.JButton jCombantrin;
    private javax.swing.JButton jFeminax;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jMixagrip;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jPracetamol;
    private javax.swing.JButton jPromag;
    private javax.swing.JButton jSangobion;
    private javax.swing.JButton jSimpan;
    private javax.swing.JTextField jTNama;
    private javax.swing.JTextField jTkeluhan;
    private javax.swing.JButton jVicks;
    private javax.swing.JButton jimboost;
    private javax.swing.JButton jinsto;
    // End of variables declaration//GEN-END:variables
}
