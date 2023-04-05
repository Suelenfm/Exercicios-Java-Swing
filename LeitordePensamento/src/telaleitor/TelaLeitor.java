
package telaleitor;

import java.awt.Font;

public class TelaLeitor extends javax.swing.JFrame {

    
    public TelaLeitor() {
        initComponents();
        lblFrase.setText("<html>Vou pensar em um valor <strong>entre 1 e 5 </strong>, tente adivinhar.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFrase = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtVal = new javax.swing.JSpinner();
        btnPalpite = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFrase.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblFrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFrase.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblFrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 130, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1a30c4f991c7abdeaa2c24764d27e733.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        txtVal.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        getContentPane().add(txtVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 50, 30));

        btnPalpite.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnPalpite.setForeground(new java.awt.Color(0, 0, 153));
        btnPalpite.setText("Adivinhe");
        btnPalpite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPalpiteActionPerformed(evt);
            }
        });
        getContentPane().add(btnPalpite, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/balão-de-fala (3).png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText("Valor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPalpiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPalpiteActionPerformed
    double n = 1 + Math.random()* (6-1);
    
    int valor = (int) n;
    System.out.println( valor);
    
    int num = Integer.parseInt(txtVal.getValue().toString());
    
    
    String f1 = "<html> <strong> ACERTOU! </strong> </html>";
    String f2 = "<html> Eu pensei no valor "+ valor  + "</html>";
    String res = (valor == num)?f1:f2;
    
    lblFrase.setFont(new Font("Arial Black", Font.BOLD , 12));
    lblFrase.setText(res); 
    
    
    
    }//GEN-LAST:event_btnPalpiteActionPerformed

    
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLeitor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPalpite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblFrase;
    private javax.swing.JSpinner txtVal;
    // End of variables declaration//GEN-END:variables
}
