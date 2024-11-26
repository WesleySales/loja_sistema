/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import entities.Usuario;
import entities.UsuarioCargoEnum;
import entities.UsuarioDAO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author wesle
 */
public class PainelPrimario extends javax.swing.JFrame {

    /**
     * Creates new form PainelPrimario
     */
    public PainelPrimario() {
        initComponents();
        UsuarioDAO u = new UsuarioDAO();
        Usuario funcionario = new Usuario();
        
        funcionario = u.buscarUsuarioPeloLogin(TelaLogin.guardarLogin);
        txtBemVindo.setText(String.format("Olá, %s! Escolha um módulo para continuar", funcionario.getNome()));
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
        btnModuloProdutos = new javax.swing.JButton();
        btnModuloVendas = new javax.swing.JButton();
        btnModuloFuncionarios = new javax.swing.JButton();
        txtTitulo = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        txtBemVindo = new javax.swing.JLabel();
        brnEncerrarSessao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        btnModuloProdutos.setBackground(new java.awt.Color(0, 51, 51));
        btnModuloProdutos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModuloProdutos.setForeground(new java.awt.Color(255, 255, 255));
        btnModuloProdutos.setText("PRODUTOS");
        btnModuloProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloProdutosActionPerformed(evt);
            }
        });

        btnModuloVendas.setBackground(new java.awt.Color(0, 51, 51));
        btnModuloVendas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModuloVendas.setForeground(new java.awt.Color(255, 255, 255));
        btnModuloVendas.setText("VENDAS");
        btnModuloVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloVendasActionPerformed(evt);
            }
        });

        btnModuloFuncionarios.setBackground(new java.awt.Color(0, 51, 51));
        btnModuloFuncionarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModuloFuncionarios.setForeground(new java.awt.Color(255, 255, 255));
        btnModuloFuncionarios.setText("FUNCIONÁRIOS");
        btnModuloFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloFuncionariosActionPerformed(evt);
            }
        });

        txtTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtTitulo.setText("PAINEL PRINCIPAL");

        btnSair.setBackground(new java.awt.Color(255, 51, 51));
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("X");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        txtBemVindo.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        txtBemVindo.setForeground(new java.awt.Color(255, 255, 255));
        txtBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        brnEncerrarSessao.setText("SAIR");
        brnEncerrarSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnEncerrarSessaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(brnEncerrarSessao)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnModuloFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnModuloVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnModuloProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(51, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtBemVindo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE))
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModuloFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModuloVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModuloProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(brnEncerrarSessao)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnModuloVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloVendasActionPerformed
        var tela = new TelaProdutos();
        tela.setVisible(true);
    }//GEN-LAST:event_btnModuloVendasActionPerformed

    private void btnModuloProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloProdutosActionPerformed
        var tela = new TelaProdutos();
        UsuarioDAO u = new UsuarioDAO();
        Usuario funcionario = new Usuario();
        funcionario = u.buscarUsuarioPeloLogin(TelaLogin.guardarLogin);
        
        if(funcionario.getCargo() == UsuarioCargoEnum.GERENTE){
            tela.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para acessar este módulo!\nCargo requerido 'GERENTE'");
        }
    }//GEN-LAST:event_btnModuloProdutosActionPerformed

    private void brnEncerrarSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnEncerrarSessaoActionPerformed
        this.dispose();
    }//GEN-LAST:event_brnEncerrarSessaoActionPerformed

    private void btnModuloFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloFuncionariosActionPerformed
        UsuarioDAO u = new UsuarioDAO();
        Usuario funcionario = new Usuario();
        funcionario = u.buscarUsuarioPeloLogin(TelaLogin.guardarLogin);
        
        if(funcionario.getCargo() == UsuarioCargoEnum.GERENTE){
            var tela = new CadastroFuncionario();
            tela.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para acessar este módulo!\nCargo requerido 'GERENTE'");
        }
        
    }//GEN-LAST:event_btnModuloFuncionariosActionPerformed
    
    public void verificarPermissao(){
        
    }
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
            java.util.logging.Logger.getLogger(PainelPrimario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainelPrimario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainelPrimario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainelPrimario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PainelPrimario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnEncerrarSessao;
    private javax.swing.JButton btnModuloFuncionarios;
    private javax.swing.JButton btnModuloProdutos;
    private javax.swing.JButton btnModuloVendas;
    private javax.swing.JButton btnSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtBemVindo;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
