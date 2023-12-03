package View;

import Controller.ControleAutor;
import Controller.ControleEditora;
import Controller.ControleLivro;
import Model.AutorBEAN;
import Model.LivroBEAN;
import com.formdev.flatlaf.FlatDarkLaf;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class TelaLivro extends javax.swing.JFrame {

    ControleLivro controleLivro = new ControleLivro();
    ControleEditora controleEditora = new ControleEditora();
    ControleAutor controleAutor = new ControleAutor();
    
    public TelaLivro() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        jCheckBoxAtivo.setSelected(rootPaneCheckingEnabled);
        
        inativarEditar();
        inativarBotaoAtivar();
        inativarBotaoInativar();
        
        List<LivroBEAN> listAllLivros = controleLivro.listaLivrosAtivos();      
        limpar_tabela();
        preencher_tabela(listAllLivros);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextPesquisar = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jCheckBoxAtivo = new javax.swing.JCheckBox();
        jCheckBoxInativo = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLivros = new javax.swing.JTable();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonAtivar = new javax.swing.JButton();
        jButtonInativar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("LIVROS");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("PESQUISAR");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("NOME: ");

        jTextPesquisar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jButtonPesquisar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.setMaximumSize(new java.awt.Dimension(100, 20));
        jButtonPesquisar.setMinimumSize(new java.awt.Dimension(100, 20));
        jButtonPesquisar.setPreferredSize(new java.awt.Dimension(100, 20));
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

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

        jCheckBoxAtivo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jCheckBoxAtivo.setText("Ativo");

        jCheckBoxInativo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jCheckBoxInativo.setText("Inativo");

        jTableLivros.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTableLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "TÍTULO", "EDITORA", "AUTOR", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLivrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLivros);

        jButtonCadastrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.setMaximumSize(new java.awt.Dimension(100, 20));
        jButtonCadastrar.setMinimumSize(new java.awt.Dimension(100, 20));
        jButtonCadastrar.setPreferredSize(new java.awt.Dimension(100, 20));
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonAtivar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonInativar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBoxAtivo)
                        .addGap(45, 45, 45)
                        .addComponent(jCheckBoxInativo))
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextPesquisar)))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxAtivo)
                    .addComponent(jCheckBoxInativo))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAtivar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonInativar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        String ativo = "";
        String inativo = "";

        if (jCheckBoxAtivo.isSelected()) 
            ativo = "Ativo";
        
        if (jCheckBoxInativo.isSelected())
            inativo = "Inativo";
        
        List<LivroBEAN> consulta = controleLivro.consultaLivro(jTextPesquisar.getText(), ativo, inativo);
        preencher_tabela(consulta);
        
        inativarEditar();
        inativarBotaoAtivar();
        inativarBotaoInativar();
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        List<LivroBEAN> listLivrosAtivos = controleLivro.listaLivrosAtivos();
        limpar_tabela();
        preencher_tabela(listLivrosAtivos);
        
        inativarEditar();
        inativarBotaoAtivar();
        inativarBotaoInativar();

        jTextPesquisar.setText("");
        jCheckBoxAtivo.setSelected(rootPaneCheckingEnabled);
        jCheckBoxInativo.setSelected(false);
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        new TelaAdicionarLivro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        int index = jTableLivros.getSelectedRow();
        int id;

        String idString = jTableLivros.getValueAt(index, 0).toString();
        id = Integer.parseInt(idString);
        String titulo = jTableLivros.getValueAt(index, 1).toString();
        String nomeEditora = jTableLivros.getValueAt(index, 2).toString();
        String nomeAutor =   jTableLivros.getValueAt(index, 3).toString();
        String statusLivro = jTableLivros.getValueAt(index, 4).toString();
        
        
        new TelaEditarLivro(id, titulo, statusLivro, nomeEditora, nomeAutor).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonAtivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtivarActionPerformed
        int index = jTableLivros.getSelectedRow();
        String idString = jTableLivros.getValueAt(index, 0).toString();
        int id = Integer.parseInt(idString);

        LivroBEAN autor = new LivroBEAN(id);
        controleLivro.ativarLivro(autor);

        List<LivroBEAN> listAllLivros = controleLivro.listaLivrosAtivos();
        limpar_tabela();
        preencher_tabela(listAllLivros);

        jTextPesquisar.setText("");
        jCheckBoxAtivo.setSelected(rootPaneCheckingEnabled);
        jCheckBoxInativo.setSelected(false);
    }//GEN-LAST:event_jButtonAtivarActionPerformed

    private void jButtonInativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInativarActionPerformed
        int index = jTableLivros.getSelectedRow();
        String idString = jTableLivros.getValueAt(index, 0).toString();
        int id = Integer.parseInt(idString);

        LivroBEAN autor = new LivroBEAN(id);
        controleLivro.inativarLivro(autor);

        List<LivroBEAN> listAllLivros = controleLivro.listaLivrosAtivos();
        limpar_tabela();
        preencher_tabela(listAllLivros);

        jTextPesquisar.setText("");
        jCheckBoxAtivo.setSelected(rootPaneCheckingEnabled);
        jCheckBoxInativo.setSelected(false);
    }//GEN-LAST:event_jButtonInativarActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jTableLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLivrosMouseClicked
        
        int index = jTableLivros.getSelectedRow();
        String status = jTableLivros.getValueAt(index, 4).toString();
        
        if(status.equals("Ativo")){
            inativarBotaoAtivar();
            ativarBotaoInativar();
        }else if(status.equals("Inativo")){
            inativarBotaoInativar();
            ativarBotaoAtivar();
        }
        
        ativarEditar();
    }//GEN-LAST:event_jTableLivrosMouseClicked

    
    public void limpar_tabela() {
        for (int i = 0; i < this.jTableLivros.getRowCount(); i++) {
            this.jTableLivros.setValueAt("", i, 0);
            this.jTableLivros.setValueAt("", i, 1);
            this.jTableLivros.setValueAt("", i, 2);
            this.jTableLivros.setValueAt("", i, 3);
            this.jTableLivros.setValueAt("", i, 3);
        }
    }
    
    public void preencher_tabela(List<LivroBEAN> listLivros) {
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) jTableLivros.getModel();
        
        jTableLivros.getColumnModel().getColumn(0).setPreferredWidth(20);
        jTableLivros.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTableLivros.getColumnModel().getColumn(2).setPreferredWidth(80);
        jTableLivros.getColumnModel().getColumn(3).setPreferredWidth(80);
        jTableLivros.getColumnModel().getColumn(4).setPreferredWidth(80);
        
        modelo.setNumRows(0);
        try {
            for (LivroBEAN livro : listLivros) {
                String nomeEditora = controleEditora.consultaEditoraById(livro.getIDEditora());
                String nomeAutor = controleAutor.retornaNomeAutor(livro.getidAutor());
                
                modelo.addRow(new Object[]{livro.getIDLivro(), livro.getTitulo(), nomeEditora, nomeAutor, livro.getStatusLivro()});
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar dados - " + erro);
        }
    }
       
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
    
    private void ativarBotaoInativar() {
        jButtonInativar.setEnabled(true);
    }
    
    private void inativarBotaoInativar() {
        jButtonInativar.setEnabled(false);
    }
    
    
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
            java.util.logging.Logger.getLogger(TelaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        FlatDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLivro().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLivros;
    private javax.swing.JTextField jTextPesquisar;
    // End of variables declaration//GEN-END:variables
}
