/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;



import Dao.CandidatoDao;
import Dao.InscricaoDao;
import Dao.ProvaDao;
import Dao.TblFazProvaDao;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Kevin
 */
public class Candidatos extends javax.swing.JFrame {

    CandidatoDao candidatos = new CandidatoDao();
    InscricaoDao inscricaodao = new InscricaoDao();
    TblFazProvaDao fazProva = new TblFazProvaDao();
    ProvaDao provadao = new ProvaDao();
    
    public Candidatos() {
        initComponents();
        this.setTitle("Candidatos");
        setTable();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldPESQUISACPF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTable = new javax.swing.JTable();
        jButtonINSCREVER = new javax.swing.JButton();
        jButtonSITUACAO = new javax.swing.JButton();
        jButtonMODIFICAR = new javax.swing.JButton();
        jButtonEXCLUIR = new javax.swing.JButton();
        jButtonVOLTAR = new javax.swing.JButton();
        jButtonPROVA = new javax.swing.JButton();
        jButtonPAGAR = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTextFieldPESQUISACPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPESQUISACPFKeyReleased(evt);
            }
        });

        jLabel1.setText("DIGITE O NOME:");

        jTableTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableTable);

        jButtonINSCREVER.setText("INSCREVER");
        jButtonINSCREVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonINSCREVERActionPerformed(evt);
            }
        });

        jButtonSITUACAO.setText("SITUAÇÃO");
        jButtonSITUACAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSITUACAOActionPerformed(evt);
            }
        });

        jButtonMODIFICAR.setText("MODIFICAR");
        jButtonMODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMODIFICARActionPerformed(evt);
            }
        });

        jButtonEXCLUIR.setText("EXCLUIR");
        jButtonEXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEXCLUIRActionPerformed(evt);
            }
        });

        jButtonVOLTAR.setText("VOLTAR");
        jButtonVOLTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVOLTARActionPerformed(evt);
            }
        });

        jButtonPROVA.setText("PROVA");
        jButtonPROVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPROVAActionPerformed(evt);
            }
        });

        jButtonPAGAR.setText("PAGAR");
        jButtonPAGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPAGARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(jTextFieldPESQUISACPF, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButtonPROVA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(jButtonINSCREVER, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonSITUACAO, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(jButtonMODIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(jButtonEXCLUIR, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButtonPAGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonVOLTAR)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVOLTAR)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPESQUISACPF, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonINSCREVER, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSITUACAO, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMODIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEXCLUIR, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPROVA, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPAGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonINSCREVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonINSCREVERActionPerformed
        int j = jTableTable.getSelectedRow();
        if(j!= -1){
            if(candidatos.verificaInscricao(getLinhaTable(0))){
                Inscricao inscricao = new Inscricao();            
                inscricao.recebeCpf(getLinhaTable(0));        
                inscricao.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Inscrição já realizada!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um candidato!");
        }
    }//GEN-LAST:event_jButtonINSCREVERActionPerformed

    private void jTextFieldPESQUISACPFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPESQUISACPFKeyReleased
        //CONSULTA POR CPF
       setTable(jTextFieldPESQUISACPF.getText());
    }//GEN-LAST:event_jTextFieldPESQUISACPFKeyReleased

    private void jButtonSITUACAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSITUACAOActionPerformed
       int j = jTableTable.getSelectedRow();
       if(j!=-1){
           CandidatoCompleto completo = new CandidatoCompleto();
            completo.recebeCpf(getLinhaTable(0));
            completo.setVisible(true);
            this.dispose();
       }else{
           JOptionPane.showMessageDialog(null, "Selecione um candidato!");
       }
        
        
    }//GEN-LAST:event_jButtonSITUACAOActionPerformed

    private void jButtonEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEXCLUIRActionPerformed
       int j = jTableTable.getSelectedRow();
        
       if(j!=-1){
            int i =JOptionPane.showConfirmDialog(null,"Tem certeza que Deseja Excluir?","Excluir",JOptionPane.YES_NO_OPTION);
            if(i==JOptionPane.YES_NO_OPTION){
                if(getLinhaTable(3) ==null){
                    if((candidatos.removeCandidato(getLinhaTable(0)))){
                        JOptionPane.showMessageDialog(null, "Excluído com sucesso!!");
                        setTable();
                    }else{
                        JOptionPane.showMessageDialog(null, "Erro ao excluir!!");
                    }
                }else{
                    if((candidatos.removeCandidato(getLinhaTable(0))) && inscricaodao.removeInscricao(getLinhaTable(3))){
                        try{
                        ArrayList<String> x = fazProva.consultaCpfList(getLinhaTable(0));
                        fazProva.removerFazProva(getLinhaTable(0));
                            switch (x.size()) {
                                case 2:
                                    provadao.removeProva(x.get(0));
                                    provadao.removeProva(x.get(1));
                                    JOptionPane.showMessageDialog(null, "Excluído com sucesso!!");
                                    setTable();
                                    break;
                                case 1:
                                    provadao.removeProva(x.get(0));
                                    JOptionPane.showMessageDialog(null, "Excluído com sucesso!!");
                                    setTable();
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null,"Excluido com sucesso!!");
                                    break;
                            }
                        }catch(Exception e){
                            System.out.println(e);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Erro ao excluir!!");
                    }
                }
            }
       }else{
           JOptionPane.showMessageDialog(null, "Selecione um candidato!");
       }
    }//GEN-LAST:event_jButtonEXCLUIRActionPerformed

    private void jButtonVOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVOLTARActionPerformed
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVOLTARActionPerformed

    private void jButtonMODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMODIFICARActionPerformed
       int j = jTableTable.getSelectedRow();
       if(j!=-1){
            Modificar modificar = new Modificar();
            modificar.recebeCpf(getLinhaTable(0));        
            modificar.setVisible(true);
            this.dispose();
       }else{
           JOptionPane.showMessageDialog(null, "Selecione um candidato!");
       }
        
    }//GEN-LAST:event_jButtonMODIFICARActionPerformed

    private void jButtonPROVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPROVAActionPerformed
       
       int j = jTableTable.getSelectedRow();
       if(j!=-1){
            EscolheProva escolhe = new EscolheProva();
            escolhe.setVisible(true);
            escolhe.recebeCpf(getLinhaTable(0));
            this.dispose();
       }else{
           JOptionPane.showMessageDialog(null, "Selecione um candidato!");
       }
    }//GEN-LAST:event_jButtonPROVAActionPerformed

    private void jButtonPAGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPAGARActionPerformed
       if(getLinhaTable(3) != null){
       int j = jTableTable.getSelectedRow();
       
            if(j!=-1){
                if(inscricaodao.pagar(getLinhaTable(3))){
                    JOptionPane.showMessageDialog(null, "Pagamento realizado!");
                }else{
                    JOptionPane.showMessageDialog(null, "Erro no Pagamento!!");
                }
            }else{
                    JOptionPane.showMessageDialog(null, "Selecione um candidato!");
            }    
        }else{
           JOptionPane.showMessageDialog(null, "Realize a Inscricão!!");
       }
    }//GEN-LAST:event_jButtonPAGARActionPerformed

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
            java.util.logging.Logger.getLogger(Candidatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Candidatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Candidatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Candidatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Candidatos().setVisible(true);
            }
        });
    }
    
    private String getLinhaTable(int j){        
        try{
        int i =jTableTable.getSelectedRow();
        return jTableTable.getModel().getValueAt(i, j).toString();
        }catch(Exception e){
            System.out.println(e + " getlinatable");
            return null;            
        }      
        
    }           
    
    private void setTable(){
        try{
        ResultSet rs = candidatos.recuperaCandidato();
        jTableTable.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            System.out.println(e+" setTable");
        }
    }
     private void setTable(String g){
        try{
        ResultSet rs = candidatos.recuperaCandidato(g);
        jTableTable.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            System.out.println(e+" setTable");
        }
    }  
         

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEXCLUIR;
    private javax.swing.JButton jButtonINSCREVER;
    private javax.swing.JButton jButtonMODIFICAR;
    private javax.swing.JButton jButtonPAGAR;
    private javax.swing.JButton jButtonPROVA;
    private javax.swing.JButton jButtonSITUACAO;
    private javax.swing.JButton jButtonVOLTAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableTable;
    private javax.swing.JTextField jTextFieldPESQUISACPF;
    // End of variables declaration//GEN-END:variables
}
