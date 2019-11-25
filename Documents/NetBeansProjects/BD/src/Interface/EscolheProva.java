/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Classes.Candidato;
import Classes.Prova;
import Dao.CandidatoDao;
import Dao.TblFazProvaDao;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class EscolheProva extends javax.swing.JFrame {
    private String cpf;
    private CandidatoDao candidatodao = new CandidatoDao();
    TblFazProvaDao fazProva = new TblFazProvaDao();
    
    /**
     * Creates new form EscolheProva
     */
    public EscolheProva() {
        initComponents();
        this.setTitle("Escolha a Prova!");
    }

    public void recebeCpf(String c){
        this.cpf = c;
        setButton();
        
    }    
    
    public void setButton(){
        System.out.println(fazProva.retornaLinhas(cpf));
        
        switch(fazProva.retornaLinhas(cpf)){
            case 0:               
                jButtonDISCURSIVA.setVisible(false);  
                break;                
            case 1:
                 jButtonQUALIFICACAO.setVisible(false);
                break;
            case 2:
                jButtonQUALIFICACAO.setVisible(false);
                jButtonDISCURSIVA.setVisible(false);
                JOptionPane.showMessageDialog(null, "Provas já realizadas");
                Candidatos candidato = new Candidatos();                
                candidato.setVisible(true);
                this.dispose();
                break;
            default:
                jButtonQUALIFICACAO.setVisible(false);
                jButtonDISCURSIVA.setVisible(false);
                JOptionPane.showMessageDialog(null, "Excluído com sucesso!!");                
                Candidatos candidatos= new Candidatos();
                candidatos.setVisible(true);
                this.dispose();
                break;
            
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

        jButtonQUALIFICACAO = new javax.swing.JButton();
        jButtonDISCURSIVA = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonVOLTAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButtonQUALIFICACAO.setText("QUALIFICACÃO");
        jButtonQUALIFICACAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQUALIFICACAOActionPerformed(evt);
            }
        });

        jButtonDISCURSIVA.setText("DISCURSIVA");
        jButtonDISCURSIVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDISCURSIVAActionPerformed(evt);
            }
        });

        jLabel1.setText("SELECIONE A PROVA");

        jButtonVOLTAR.setText("VOLTAR");
        jButtonVOLTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVOLTARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVOLTAR)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonQUALIFICACAO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonDISCURSIVA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonVOLTAR)))
                .addGap(16, 16, 16)
                .addComponent(jButtonQUALIFICACAO, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButtonDISCURSIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonQUALIFICACAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQUALIFICACAOActionPerformed
        Candidato candidato;
        candidato = candidatodao.recuperaCandidatoObject(cpf);
        Qualificacao qualificacao = new Qualificacao();
        qualificacao.recebeCandidato(candidato);
        qualificacao.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonQUALIFICACAOActionPerformed

    private void jButtonDISCURSIVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDISCURSIVAActionPerformed
        
        try{
            
            Prova provaQ = new Prova();
        
        Candidato candidato;
        candidato = candidatodao.recuperaCandidatoObject(cpf);
        Discursiva discursiva = new Discursiva();
        discursiva.setVisible(true);
        discursiva.recebeCandidato(candidato);
        discursiva.recebeProvaQuali(provaQ);
        this.dispose();
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }//GEN-LAST:event_jButtonDISCURSIVAActionPerformed

    private void jButtonVOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVOLTARActionPerformed
        Candidatos candidatos = new Candidatos();
        candidatos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVOLTARActionPerformed

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
            java.util.logging.Logger.getLogger(EscolheProva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscolheProva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscolheProva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscolheProva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscolheProva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDISCURSIVA;
    private javax.swing.JButton jButtonQUALIFICACAO;
    private javax.swing.JButton jButtonVOLTAR;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
