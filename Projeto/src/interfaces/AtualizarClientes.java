/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import classes.Cliente;
import classes.Locadora;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Arthur
 */
public class AtualizarClientes extends javax.swing.JFrame {

    private final String filePath = "C:\\Users\\Arthur\\Documents\\UFG\\POO\\codigos-git\\Locadora\\Arquivos\\clientes.txt";
    private final File file = new File(filePath);
    
    public AtualizarClientes() {
        initComponents();
        this.buscaTabelaInteira(file);
        TabelaClientes.setEnabled(false);
        EntradaCodigo.requestFocus();
    }
    
    private void buscaTabelaInteira(File file){
        try {

            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine = br.readLine().trim();
            String[] colunas = firstLine.split(",");
            DefaultTableModel modelo = (DefaultTableModel) TabelaClientes.getModel();
            modelo.setRowCount(0);
            modelo.setColumnIdentifiers(colunas);

            Object[] linhas = br.lines().toArray();

            for (int i=0; i<linhas.length; i++){
                String line = linhas[i].toString().trim();
                String[] dataRow = line.split(";");
                modelo.addRow(dataRow);
            }

            return;

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Erro na comunicação com o arquivo de dados!", "Falha Encontrada", JOptionPane.OK_OPTION);
            ex.printStackTrace();
            return;

        }
        
    }
    
    public boolean temNumeros(String str) {

        try {

            int valor = Integer.parseInt(str);
            return true;

        } catch (NumberFormatException e) {

            return false;

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

        jLabel1 = new javax.swing.JLabel();
        EntradaPesquisar = new javax.swing.JTextField();
        BtnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaClientes = new javax.swing.JTable();
        EntradaCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BtnAtualizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        EntradaTelefone = new javax.swing.JFormattedTextField();
        EntradaEndereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        EntradaEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BtnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Atualização de Clientes");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Atualização de Clientes");

        EntradaPesquisar.setToolTipText("Insira o nome da pesquisa");

        BtnPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisa.png"))); // NOI18N
        BtnPesquisar.setToolTipText("Pesquisar");
        BtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPesquisarActionPerformed(evt);
            }
        });

        TabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaClientesMouseClicked(evt);
            }
        });
        TabelaClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TabelaClientesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaClientes);

        EntradaCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaCodigoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Código:");

        BtnAtualizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BtnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/atualizar.png"))); // NOI18N
        BtnAtualizar.setToolTipText("Atualizar");
        BtnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtualizarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Telefone:");

        try {
            EntradaTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        EntradaEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaEnderecoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Endereço:");

        EntradaEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaEmailActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("E-mail:");

        BtnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/limpar.png"))); // NOI18N
        BtnLimpar.setToolTipText("Limpar dados");
        BtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(EntradaEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(EntradaCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addComponent(EntradaTelefone))
                            .addComponent(jLabel5)
                            .addComponent(EntradaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(BtnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(EntradaPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnLimpar)
                        .addGap(90, 90, 90))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnLimpar)
                    .addComponent(jLabel1)
                    .addComponent(BtnPesquisar)
                    .addComponent(EntradaPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EntradaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EntradaTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EntradaEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EntradaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnAtualizar)
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPesquisarActionPerformed

        this.buscaTabelaInteira(file);

        Vector originalTableModel = (Vector) ((DefaultTableModel) TabelaClientes.getModel()).getDataVector().clone();

        Vector registrosEncontrados = new Vector();
        
        //Verificando se o campo está vazio
        if (EntradaPesquisar.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo vazio!", "Dados Incompletos", JOptionPane.OK_OPTION);
            EntradaPesquisar.requestFocus();
            return;
        }
        
        //Verificando se o texto é composto apenas por letras
        if (EntradaPesquisar.getText().matches(".*\\d.*")){
            JOptionPane.showMessageDialog(null, "Valores inseridos incorretamente", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaPesquisar.requestFocus();
            return;
        }

        DefaultTableModel modelo = (DefaultTableModel) TabelaClientes.getModel();
        modelo.setRowCount(0);

        for (Object linhas : originalTableModel){
            Vector rowVector = (Vector) linhas;
            for (Object colunas : rowVector){
                if (colunas.toString().contains(EntradaPesquisar.getText())){
                    registrosEncontrados.add(rowVector);
                }
            }
        }

        for (Object cliente: registrosEncontrados){
            modelo.addRow((Vector<?>) cliente);
        }
        
    }//GEN-LAST:event_BtnPesquisarActionPerformed

    private void TabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaClientesMouseClicked

        if (TabelaClientes.getSelectedRow() != -1){

            try {

                EntradaPesquisar.setText(String.valueOf(TabelaClientes.getModel().getValueAt(TabelaClientes.getSelectedRow(), 1)));

            } catch (Exception e){

                JOptionPane.showMessageDialog(null, "Erro na comunicação com o arquivo de dados!", "Falha Encontrada", JOptionPane.OK_OPTION);
                e.printStackTrace();

            }

        }
    }//GEN-LAST:event_TabelaClientesMouseClicked

    private void TabelaClientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaClientesKeyReleased

        if (TabelaClientes.getSelectedRow() != -1){

            try {

                EntradaPesquisar.setText(String.valueOf(TabelaClientes.getModel().getValueAt(TabelaClientes.getSelectedRow(), 1)));

            } catch (Exception e){

                JOptionPane.showMessageDialog(null, "Erro na comunicação com o arquivo de dados!", "Falha Encontrada", JOptionPane.OK_OPTION);
                e.printStackTrace();

            }

        }
    }//GEN-LAST:event_TabelaClientesKeyReleased

    private void EntradaCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaCodigoActionPerformed

    private void BtnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtualizarActionPerformed

        //Verificando se algum campo está vazio
        if (EntradaCodigo.getText().isEmpty() || EntradaTelefone.getText().isEmpty() || EntradaEndereco.getText().isEmpty() || EntradaEmail.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha os campos vazios!", "Dados incompletos", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }
        
        //Verificando se "Código" é composto apenas por números
        if (!temNumeros(EntradaCodigo.getText())){
            JOptionPane.showMessageDialog(null, "Valores inseridos incorretamente!", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }
        
        String mensagem = "Deseja atualizar os dados?";
        String title = "Confirmar operação";
        int res = JOptionPane.showConfirmDialog(null, mensagem, title, JOptionPane.YES_NO_OPTION);

        if (res == 0) {
            
            try {
            
                Locadora locadora = new Locadora();
                Cliente c = new Cliente();
                c.setCodCli(Integer.parseInt(EntradaCodigo.getText()));
                c.setTelefone(EntradaTelefone.getText());
                c.setEndereco(EntradaEndereco.getText());
                c.seteMail(EntradaEmail.getText());
                locadora.atualizarCliente(c);
                EntradaCodigo.setText("");
                EntradaTelefone.setText("");
                EntradaEndereco.setText("");
                EntradaEmail.setText("");
                EntradaPesquisar.setText("");
                EntradaCodigo.requestFocus();
                this.buscaTabelaInteira(file);

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(null, "Erro na comunicação com o arquivo de dados!", "Falha Encontrada", JOptionPane.OK_OPTION);
                ex.printStackTrace();

            }
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Operação cancelada!", "", JOptionPane.OK_OPTION);
            
        }
        
    }//GEN-LAST:event_BtnAtualizarActionPerformed

    private void EntradaEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaEnderecoActionPerformed

    private void EntradaEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaEmailActionPerformed

    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed
        EntradaCodigo.setText("");
        EntradaTelefone.setText("");
        EntradaEndereco.setText("");
        EntradaEmail.setText("");
        EntradaPesquisar.setText("");
        EntradaCodigo.requestFocus();
        buscaTabelaInteira(file);
    }//GEN-LAST:event_BtnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(AtualizarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtualizarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtualizarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtualizarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtualizarClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtualizar;
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JButton BtnPesquisar;
    private javax.swing.JTextField EntradaCodigo;
    private javax.swing.JTextField EntradaEmail;
    private javax.swing.JTextField EntradaEndereco;
    private javax.swing.JTextField EntradaPesquisar;
    private javax.swing.JFormattedTextField EntradaTelefone;
    private javax.swing.JTable TabelaClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
