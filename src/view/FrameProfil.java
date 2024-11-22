
package view;
import javax.swing.ImageIcon;
import org.json.JSONArray;
import org.json.JSONObject;
import kelas.Mahasiswa;


public class FrameProfil extends javax.swing.JFrame {

    /**
     * Creates new form FrameProfil
     */
    public FrameProfil() {
        initComponents();
         loadProfile();

    }
    
    public void loadProfile() {
        JSONArray data = Mahasiswa.getDatamhs();
        for (int i = 0; i < data.length(); i++) {
            JSONObject item = data.getJSONObject(i);
            if (i == Mahasiswa.getBaris()) {
                tNim.setText(item.getString("mhs_nim"));
                tNama.setText(item.getString("mhs_nama"));
                tJk.setText(item.getString("mhs_jk"));
                tTTL.setText(item.getString("mhs_tempatlahir") + ", " + item.getString("mhs_tanggallahir"));
                tEmail.setText(item.getString("mhs_email"));
                tNohp.setText(item.getString("mhs_hp"));

                if (item.has("mhs_foto") && !item.isNull("mhs_foto")) {
                    ImageIcon image = Mahasiswa.decodeBase64ToImage(item.getString("mhs_foto"), tFoto.getWidth(), tFoto.getHeight());
                    tFoto.setIcon(image);
                    tFoto.setText(null); 
                } else {
                    tFoto.setText("Foto tidak tersedia");
                    tFoto.setIcon(null);
                }
            }
        }
    }
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tFoto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tNim = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tJk = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tTTL = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tEmail = new javax.swing.JTextField();
        bClose = new javax.swing.JButton();
        bNext = new javax.swing.JButton();
        bPreveous = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tNohp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tFoto.setText("FOTO");
        tFoto.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setText("Nim");

        tNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNimActionPerformed(evt);
            }
        });

        jLabel3.setText("Nama");

        jLabel4.setText("Jenis Kelamin");

        jLabel5.setText("TTL");

        tTTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTTLActionPerformed(evt);
            }
        });

        jLabel6.setText("Email");

        bClose.setText("CLOSE");
        bClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCloseActionPerformed(evt);
            }
        });

        bNext.setText("NEXT");
        bNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNextActionPerformed(evt);
            }
        });

        bPreveous.setText("PREVEOUS");
        bPreveous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPreveousActionPerformed(evt);
            }
        });

        jLabel7.setText("No.HP");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bPreveous)
                    .addComponent(tFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(bNext)
                        .addGap(103, 103, 103)
                        .addComponent(bClose))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(tNim)
                            .addComponent(tNama)
                            .addComponent(tJk)
                            .addComponent(tTTL)
                            .addComponent(tEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                            .addComponent(tNohp))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addComponent(tFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tJk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tTTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tNohp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bClose)
                    .addComponent(bNext)
                    .addComponent(bPreveous))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNimActionPerformed

    private void tTTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTTLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tTTLActionPerformed

    private void bCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCloseActionPerformed
     dispose();
    }//GEN-LAST:event_bCloseActionPerformed

    private void bNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNextActionPerformed
         if (Mahasiswa.getBaris() >= 0 && Mahasiswa.getBaris() <= Mahasiswa.getDatamhs().length()) {
            Mahasiswa.setBaris(Mahasiswa.getBaris() + 1);
            loadProfile();
        }
    }//GEN-LAST:event_bNextActionPerformed

    private void bPreveousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPreveousActionPerformed
      if (Mahasiswa.getBaris() > 0 && Mahasiswa.getBaris() <= Mahasiswa.getDatamhs().length()) {
            Mahasiswa.setBaris(Mahasiswa.getBaris() - 1);
            loadProfile();
        }
    }//GEN-LAST:event_bPreveousActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameProfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClose;
    private javax.swing.JButton bNext;
    private javax.swing.JButton bPreveous;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tEmail;
    private javax.swing.JLabel tFoto;
    private javax.swing.JTextField tJk;
    private javax.swing.JTextField tNama;
    private javax.swing.JTextField tNim;
    private javax.swing.JTextField tNohp;
    private javax.swing.JTextField tTTL;
    // End of variables declaration//GEN-END:variables
}
