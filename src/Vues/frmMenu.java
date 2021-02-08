/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

import static Vues.frmVerifMofidVisiteur.nom;

/**
 *
 * @author PC
 */
public class frmMenu extends javax.swing.JFrame {

    /**
     * Creates new form frmMenu
     */
    public frmMenu() {
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

        jLabel1 = new javax.swing.JLabel();
        cboRegion = new javax.swing.JComboBox<>();
        cboVisiteur = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(java.awt.Color.white);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("Bienvenue sur gsb");
        jLabel1.setOpaque(true);

        cboRegion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Region", "lister", "ajouter", "modifier" }));
        cboRegion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboRegionMouseClicked(evt);
            }
        });

        cboVisiteur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Visiteur", "lister", "ajouter", "modifier" }));
        cboVisiteur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboVisiteurMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logel.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(cboRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(cboVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(cboRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(cboVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboVisiteurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboVisiteurMouseClicked
        // TODO add your handling code here:
        if(cboVisiteur.getSelectedItem().toString().compareTo("Visiteur") ==0){
            frmVisiteur frm = new frmVisiteur();
            frm.setVisible(true);
            this.dispose();
        }
        
            if(cboVisiteur.getSelectedItem().toString().compareTo("lister") ==0){
                frmVisiteur frm = new frmVisiteur();
                frm.setVisible(true);
                 this.dispose();
            }
           
                if(cboVisiteur.getSelectedItem().toString().compareTo("ajouter") ==0){
                    frmAjoutVisteur frm = new frmAjoutVisteur();
                    frm.setVisible(true);
                    this.dispose();
                }
                
                    if(cboVisiteur.getSelectedItem().toString().compareTo("modifier") ==0){
                        frmVerifMofidVisiteur frm = new frmVerifMofidVisiteur(nom);
                        frm.setVisible(true);
                        this.dispose();
                    }
    }//GEN-LAST:event_cboVisiteurMouseClicked

    private void cboRegionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboRegionMouseClicked
        // TODO add your handling code here:
        if(cboRegion.getSelectedItem().toString().compareTo("Région") ==0){
            frmRegion frm = new frmRegion();
            frm.setVisible(true);
            this.dispose();
        }
        
            if(cboRegion.getSelectedItem().toString().compareTo("lister") ==0){
                frmRegion frm = new frmRegion();
                frm.setVisible(true);
                 this.dispose();
            }
           
                if(cboRegion.getSelectedItem().toString().compareTo("ajouter") ==0){
                    frmAjoutRegion frm = new frmAjoutRegion();
                    frm.setVisible(true);
                    this.dispose();
                }
                
                    if(cboRegion.getSelectedItem().toString().compareTo("modifier") ==0){
                        frmVerifModifRegion frm = new frmVerifModifRegion();
                        frm.setVisible(true);
                        this.dispose();
                    }
    }//GEN-LAST:event_cboRegionMouseClicked

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboRegion;
    private javax.swing.JComboBox<String> cboVisiteur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}