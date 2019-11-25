/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Classes.Candidato;
import Classes.ValidacaoEntradas;
import Dao.CandidatoDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Modificar extends javax.swing.JFrame {
    private CandidatoDao candidatodao = new CandidatoDao();
    private String cpf;
    ValidacaoEntradas validacao = new ValidacaoEntradas();
    /**
     * Creates new form Modificar
     */
    public Modificar() {
        initComponents();
        this.setTitle("MODIFICAR");
        
    }
    
    private void setCampos(){        
        try{
            ResultSet rs = candidatodao.recuperaCandidatoCpf(cpf);
            while(rs.next()){
                jTextField_CPF.setText(rs.getString(1));                
                jTextField_NOME.setText(rs.getString(2));               
                jTextField_EMAIL.setText(rs.getString(3));
            }
        }catch(SQLException e){
            System.out.println(e+" setCampos");
        }
    }
    
    public void recebeCpf(String c){
        this.cpf = c;
        setCampos();
    }    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNOME = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabelEMAIL = new javax.swing.JLabel();
        jTextField_NOME = new javax.swing.JTextField();
        jTextField_CPF = new javax.swing.JTextField();
        jTextField_EMAIL = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButtonATUALIZAR = new javax.swing.JButton();
        jButtonVOLTAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabelNOME.setText("NOME:");

        jLabelCPF.setText("CPF");

        jLabelEMAIL.setText("Email");

        jButtonATUALIZAR.setText("ATUALIZAR");
        jButtonATUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonATUALIZARActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonATUALIZAR, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelEMAIL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelCPF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelNOME)
                                .addGap(32, 32, 32)
                                .addComponent(jTextField_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonVOLTAR)))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVOLTAR)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNOME)
                    .addComponent(jTextField_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCPF)
                    .addComponent(jTextField_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEMAIL)
                    .addComponent(jTextField_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(84, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonATUALIZAR, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVOLTARActionPerformed
        Candidatos candidato = new Candidatos();
        candidato.setVisible(true);        
        this.dispose();
    }//GEN-LAST:event_jButtonVOLTARActionPerformed

    private void jButtonATUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonATUALIZARActionPerformed
        if(validacao.validaNome(jTextField_NOME.getText())){
            if("".equals(jTextField_CPF.getText()) ||  "".equals(jTextField_NOME.getText()) || "".equals(jTextField_EMAIL.getText())){
                JOptionPane.showMessageDialog(null, "Preencha todos campos!!");
            }else{
                
                    if(candidatodao.atualizaCandidato(new Candidato(Long.parseLong(jTextField_CPF.getText()),jTextField_NOME.getText(),jTextField_EMAIL.getText(),cpf))){
                        JOptionPane.showMessageDialog(null, "Atualizado");
                        setCampos();
                    }else{
                        JOptionPane.showMessageDialog(null, "Não Atualizado!");
                    }
            }      
        }else{
            JOptionPane.showMessageDialog(null, "Erro nome: digite apenas letras!!!");
        }          
    }//GEN-LAST:event_jButtonATUALIZARActionPerformed

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
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonATUALIZAR;
    private javax.swing.JButton jButtonVOLTAR;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelEMAIL;
    private javax.swing.JLabel jLabelNOME;
    private javax.swing.JTextField jTextField_CPF;
    private javax.swing.JTextField jTextField_EMAIL;
    private javax.swing.JTextField jTextField_NOME;
    // End of variables declaration//GEN-END:variables
}
