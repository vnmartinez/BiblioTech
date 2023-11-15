package View;

import Controller.ControleEditora;
import Model.EditoraBEAN;
import com.formdev.flatlaf.FlatDarkLaf;
import java.util.List;
import javax.swing.JOptionPane;

public class TelaEditora extends javax.swing.JFrame {

    ControleEditora controleEditora = new ControleEditora();
    
    public TelaEditora() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        jCheckBoxAtivo.setSelected(rootPaneCheckingEnabled);
        
        List<EditoraBEAN> listaEditoras = controleEditora.listaEditorasAtivas();
        limpar_tabela();
        preencher_tabela(listaEditoras);
        
        inativarEditar();
        inativarBotaoAtivar();
        inativarBotaoInativar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButtonAtualizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jTextNomeEditora = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButtonEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEditora = new javax.swing.JTable();
        jTextPesquisar = new javax.swing.JTextField();
        jButtonInativar = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonAtivar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonVoltar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jCheckBoxAtivo = new javax.swing.JCheckBox();
        jCheckBoxInativo = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("NOME: ");

        jButtonAtualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.setMaximumSize(new java.awt.Dimension(90, 20));
        jButtonAtualizar.setMinimumSize(new java.awt.Dimension(90, 20));
        jButtonAtualizar.setPreferredSize(new java.awt.Dimension(90, 20));
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("CADASTRO");

        jButtonCadastrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.setMaximumSize(new java.awt.Dimension(90, 20));
        jButtonCadastrar.setMinimumSize(new java.awt.Dimension(90, 20));
        jButtonCadastrar.setPreferredSize(new java.awt.Dimension(100, 20));
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jTextNomeEditora.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextNomeEditora.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("NOME: ");

        jButtonEditar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.setMaximumSize(new java.awt.Dimension(90, 20));
        jButtonEditar.setMinimumSize(new java.awt.Dimension(90, 20));
        jButtonEditar.setPreferredSize(new java.awt.Dimension(90, 20));
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jTableEditora.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTableEditora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "NOME", "STATUS"
            }
        ));
        jTableEditora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEditoraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEditora);

        jTextPesquisar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextPesquisar.setMinimumSize(new java.awt.Dimension(80, 20));
        jTextPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPesquisarActionPerformed(evt);
            }
        });

        jButtonInativar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonInativar.setText("Inativar");
        jButtonInativar.setMaximumSize(new java.awt.Dimension(90, 20));
        jButtonInativar.setMinimumSize(new java.awt.Dimension(90, 20));
        jButtonInativar.setPreferredSize(new java.awt.Dimension(90, 20));
        jButtonInativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInativarActionPerformed(evt);
            }
        });

        jButtonPesquisar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.setMaximumSize(new java.awt.Dimension(90, 20));
        jButtonPesquisar.setMinimumSize(new java.awt.Dimension(90, 20));
        jButtonPesquisar.setPreferredSize(new java.awt.Dimension(100, 20));
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jButtonAtivar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonAtivar.setText("Ativar");
        jButtonAtivar.setMaximumSize(new java.awt.Dimension(90, 20));
        jButtonAtivar.setMinimumSize(new java.awt.Dimension(90, 20));
        jButtonAtivar.setPreferredSize(new java.awt.Dimension(90, 20));
        jButtonAtivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtivarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("PESQUISAR");

        jButtonVoltar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.setMaximumSize(new java.awt.Dimension(90, 20));
        jButtonVoltar.setMinimumSize(new java.awt.Dimension(90, 20));
        jButtonVoltar.setPreferredSize(new java.awt.Dimension(90, 20));
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel5.setText("EDITORAS");

        jCheckBoxAtivo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jCheckBoxAtivo.setText("Ativo");

        jCheckBoxInativo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jCheckBoxInativo.setText("Inativo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(230, 230, 230))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBoxAtivo)
                        .addGap(45, 45, 45)
                        .addComponent(jCheckBoxInativo))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(30, 30, 30)
                            .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1)
                        .addComponent(jLabel3)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jButtonAtivar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jButtonInativar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(jTextNomeEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel5)
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxAtivo)
                    .addComponent(jCheckBoxInativo))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonInativar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAtivar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextNomeEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        List<EditoraBEAN> listAllEditora = controleEditora.listaEditorasAtivas();
        limpar_tabela();
        preencher_tabela(listAllEditora);
        
        inativarEditar();
        inativarBotaoAtivar();
        inativarBotaoInativar();
        
        jTextPesquisar.setText("");
        jCheckBoxAtivo.setSelected(rootPaneCheckingEnabled);
        jCheckBoxInativo.setSelected(false);
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        EditoraBEAN editora = new EditoraBEAN(0, jTextNomeEditora.getText(), 1);
        controleEditora.inserirEditora(editora);

        List<EditoraBEAN> listAllEditora = controleEditora.listaEditorasAtivas();
        limpar_tabela();
        preencher_tabela(listAllEditora);
        
        inativarEditar();
        inativarBotaoAtivar();
        inativarBotaoInativar();
        
        jTextNomeEditora.setText("");
        jCheckBoxAtivo.setSelected(rootPaneCheckingEnabled);
        jCheckBoxInativo.setSelected(false);
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    public void preencher_tabela(List<EditoraBEAN> listaEditoras) {
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) jTableEditora.getModel();
        
        jTableEditora.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTableEditora.getColumnModel().getColumn(1).setPreferredWidth(400);
        jTableEditora.getColumnModel().getColumn(2).setPreferredWidth(200);
        
        modelo.setNumRows(0);
        try {
            for (EditoraBEAN editora : listaEditoras) {
                if(editora.getStatusEditora() == 1){
                    modelo.addRow(new Object[]{editora.getIDEditora(), editora.getNomeEditora(), "Ativo"});
                }else if(editora.getStatusEditora() == 0){
                    modelo.addRow(new Object[]{editora.getIDEditora(), editora.getNomeEditora(), "Inativo"});
                }
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar dados - " + erro);
        }
    }
    
    
    public void limpar_tabela() {
        for (int i = 0; i < this.jTableEditora.getRowCount(); i++) {
            this.jTableEditora.setValueAt("", i, 0);
            this.jTableEditora.setValueAt("", i, 1);
            this.jTableEditora.setValueAt("", i, 2);
        }
    }
    
    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed

        int index = jTableEditora.getSelectedRow();
        int id;

        String idString = jTableEditora.getValueAt(index, 0).toString();
        id = Integer.parseInt(idString);
        String nomeEditora = jTableEditora.getValueAt(index, 1).toString();
        String statusString = jTableEditora.getValueAt(index, 2).toString();

        new TelaEditarEditora(id, nomeEditora, statusString).setVisible(true);

        List<EditoraBEAN> listAllEditora = controleEditora.listaEditorasAtivas();
        limpar_tabela();
        preencher_tabela(listAllEditora);
        
        inativarEditar();
        inativarBotaoAtivar();
        inativarBotaoInativar();
        
        jTextPesquisar.setText("");
        jCheckBoxAtivo.setSelected(rootPaneCheckingEnabled);
        jCheckBoxInativo.setSelected(false);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jTableEditoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEditoraMouseClicked
        int index = jTableEditora.getSelectedRow();
        String mouseClick = jTableEditora.getValueAt(index, 2).toString();

        if(mouseClick == "Ativo"){
            inativarBotaoAtivar();
            ativatBotaoInativar();
        }else if(mouseClick == "Inativo"){
            inativarBotaoInativar();
            ativarBotaoAtivar();
        }

        ativarEditar();
    }//GEN-LAST:event_jTableEditoraMouseClicked
   
    private void ativarEditar() {
        jButtonEditar.setEnabled(true);
    }
    
    private void inativarEditar() {
        jButtonEditar.setEnabled(false);
    }
   
    private void ativarBotaoAtivar() {
        jButtonAtivar.setEnabled(true);
    } 
    private void inativarBotaoAtivar() {
        jButtonAtivar.setEnabled(false);
    }
    
    private void ativatBotaoInativar() {
        jButtonInativar.setEnabled(true);
    }
    
    private void inativarBotaoInativar() {
        jButtonInativar.setEnabled(false);
    }
    
    private void jTextPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPesquisarActionPerformed

    private void jButtonInativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInativarActionPerformed
        int index = jTableEditora.getSelectedRow();
        int id;
        String idString = jTableEditora.getValueAt(index, 0).toString();
        id = Integer.parseInt(idString);
        
        EditoraBEAN editora = new EditoraBEAN(id);
        controleEditora.inativarEditora(editora);
        
        List<EditoraBEAN> listAllEditora = controleEditora.listaEditorasAtivas();
        limpar_tabela();
        preencher_tabela(listAllEditora);
        
        inativarEditar();
        inativarBotaoAtivar();
        inativarBotaoInativar();
        
        jTextPesquisar.setText("");
        jCheckBoxAtivo.setSelected(rootPaneCheckingEnabled);
        jCheckBoxInativo.setSelected(false);
    }//GEN-LAST:event_jButtonInativarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        if(jCheckBoxAtivo.isSelected() && jCheckBoxInativo.isSelected()){
            List<EditoraBEAN> consulta = controleEditora.consultaEditora(jTextPesquisar.getText());
            limpar_tabela();
            preencher_tabela(consulta);
        }else if(jCheckBoxAtivo.isSelected() && !jCheckBoxInativo.isSelected()){
            List<EditoraBEAN> consulta = controleEditora.consultaEditoraAtiva(jTextPesquisar.getText());
            limpar_tabela();
            preencher_tabela(consulta);
        }else if(!jCheckBoxAtivo.isSelected() && jCheckBoxInativo.isSelected()){
            List<EditoraBEAN> consulta = controleEditora.consultaEditoraInativa(jTextPesquisar.getText());
            limpar_tabela();
            preencher_tabela(consulta);
        }else if(!jCheckBoxAtivo.isSelected() && !jCheckBoxInativo.isSelected()){
            jCheckBoxAtivo.setSelected(rootPaneCheckingEnabled);
            
            List<EditoraBEAN> consulta = controleEditora.consultaEditora(jTextPesquisar.getText());
            limpar_tabela();
            preencher_tabela(consulta);
        }
        
        inativarEditar();
        inativarBotaoAtivar();
        inativarBotaoInativar();
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonAtivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtivarActionPerformed
        int index = jTableEditora.getSelectedRow();
        int id;
        String idString = jTableEditora.getValueAt(index, 0).toString();
        id = Integer.parseInt(idString);
        
        EditoraBEAN editora = new EditoraBEAN(id);
        controleEditora.ativarEditora(editora);
        
        List<EditoraBEAN> listAllEditora = controleEditora.listaEditorasAtivas();
        limpar_tabela();
        preencher_tabela(listAllEditora);
        
        inativarEditar();
        inativarBotaoAtivar();
        inativarBotaoInativar();
        
        jTextPesquisar.setText("");
        jCheckBoxAtivo.setSelected(rootPaneCheckingEnabled);
        jCheckBoxInativo.setSelected(false);
    }//GEN-LAST:event_jButtonAtivarActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        FlatDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtivar;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonInativar;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JCheckBox jCheckBoxAtivo;
    private javax.swing.JCheckBox jCheckBoxInativo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEditora;
    private javax.swing.JTextField jTextNomeEditora;
    private javax.swing.JTextField jTextPesquisar;
    // End of variables declaration//GEN-END:variables
}
