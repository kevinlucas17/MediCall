/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Classes.Candidato;
import Classes.Prova;
import Classes.TblFazProva;
import Dao.ProvaDao;
import Dao.TblFazProvaDao;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Discursiva extends javax.swing.JFrame {
    private Candidato candidato = new Candidato();
    private final ProvaDao provadao = new ProvaDao();
    private Prova prova = new Prova();
    private final TblFazProvaDao fazProva = new TblFazProvaDao();
    
    /**
     * Creates new form Discursiva
     */
    public Discursiva() {
        initComponents();
        setLables();
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
        jLabel_NOME = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_CPF = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_EMAIL = new javax.swing.JLabel();
        jButton_INSERIR = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField_INSERIRDISCURSIVA = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel_idInscricao = new javax.swing.JLabel();
        jLabel_NOTAQUALIFICACAO = new javax.swing.JLabel();
        jLabel_RECEBENOTAQUALIFICACAO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("NOME:");

        jLabel3.setText("CPF:");

        jLabel5.setText("EMAIL:");

        jButton_INSERIR.setText("INSERIR");
        jButton_INSERIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_INSERIRActionPerformed(evt);
            }
        });

        jLabel7.setText("NOTA DISCURSIVA");

        jLabel8.setText("ID INSCRIÇÃO:");

        jLabel_NOTAQUALIFICACAO.setText("NOTA QUALIFICAÇÃO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(38, 38, 38)
                        .addComponent(jTextField_INSERIRDISCURSIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel_idInscricao, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_NOTAQUALIFICACAO)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_RECEBENOTAQUALIFICACAO, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jButton_INSERIR, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_idInscricao, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel1)
                        .addComponent(jLabel_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_NOTAQUALIFICACAO)
                            .addComponent(jLabel_RECEBENOTAQUALIFICACAO, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_INSERIRDISCURSIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(jButton_INSERIR, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_INSERIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_INSERIRActionPerformed
            Prova provaD = new Prova();
            provaD.setNotaDiscursiva(Float.parseFloat(jTextField_INSERIRDISCURSIVA.getText()));
            prova.setTipo("D");
            provadao.insereDisc(provaD);
            prova.setId(provadao.ultimoId());            
            fazProva.associaProva(candidato, prova);
        
    }//GEN-LAST:event_jButton_INSERIRActionPerformed
 
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
            java.util.logging.Logger.getLogger(Discursiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Discursiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Discursiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Discursiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Discursiva().setVisible(true);
            }
        });
    }
    public void recebeCandidato(Candidato candidatos){
        this.candidato = candidatos;
    }
    public void recebeProvaQuali(Prova provaQ){
        this.prova = provaQ;
    }
    private void setLables(){
        jLabel_NOME.setText(candidato.getNome());
        jLabel_EMAIL.setText(candidato.getEmail());
        jLabel_CPF.setText(String.valueOf(candidato.getCpf()));
        jLabel_idInscricao.setText(String.valueOf(candidato.getId_inscricao()));
        jLabel_RECEBENOTAQUALIFICACAO.setText(String.valueOf(prova.getNotaDiscursiva()));
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_INSERIR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_CPF;
    private javax.swing.JLabel jLabel_EMAIL;
    private javax.swing.JLabel jLabel_NOME;
    private javax.swing.JLabel jLabel_NOTAQUALIFICACAO;
    private javax.swing.JLabel jLabel_RECEBENOTAQUALIFICACAO;
    private javax.swing.JLabel jLabel_idInscricao;
    private javax.swing.JTextField jTextField_INSERIRDISCURSIVA;
    // End of variables declaration//GEN-END:variables
}
