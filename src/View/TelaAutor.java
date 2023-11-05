package View;

import Controller.ControleAutor;
import Model.AutorBEAN;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;

public class TelaAutor extends javax.swing.JFrame {

    ControleAutor controleAutor = new ControleAutor();
    
    public TelaAutor() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
           
        inativarEditar();
        inativarBotaoAtivar();
        inativarBotaoInativar();
        
        List<AutorBEAN> listaAutores = controleAutor.listaAutoresAtivos();
        limpar_tabela();
        preencher_tabela(listaAutores);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PopUpMenu = new javax.swing.JPopupMenu();
        jMenuItemAtivar = new javax.swing.JMenuItem();
        jMenuItemInativar = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAutor = new javax.swing.JTable();
        jTextPesquisar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonAtualizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jTextNomeAutor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButtonEditar = new javax.swing.JButton();
        jButtonInativar = new javax.swing.JButton();
        jButtonAtivar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jCheckBoxInativo = new javax.swing.JCheckBox();

        jMenuItemAtivar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItemAtivar.setText("Ativar");
        jMenuItemAtivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAtivarActionPerformed(evt);
            }
        });
        PopUpMenu.add(jMenuItemAtivar);

        jMenuItemInativar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItemInativar.setText("Inativar");
        jMenuItemInativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInativarActionPerformed(evt);
            }
        });
        PopUpMenu.add(jMenuItemInativar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableAutor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTableAutor.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAutorMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableAutorMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAutor);

        jTextPesquisar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextPesquisar.setMinimumSize(new java.awt.Dimension(80, 20));
        jTextPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPesquisarActionPerformed(evt);
            }
        });
        jTextPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextPesquisarKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("PESQUISAR");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("NOME:");

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
        jButtonCadastrar.setPreferredSize(new java.awt.Dimension(90, 20));
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jTextNomeAutor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextNomeAutor.setMinimumSize(new java.awt.Dimension(80, 22));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("NOME:");

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
        jLabel5.setText("AUTORES");

        jCheckBoxInativo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jCheckBoxInativo.setText("Inativo");
        jCheckBoxInativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxInativoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(233, 233, 233))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jButtonAtivar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jButtonInativar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(161, 161, 161)
                                        .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextNomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jCheckBoxInativo))
                            .addGap(60, 60, 60)))))
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
                    .addComponent(jLabel2)
                    .addComponent(jTextPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jCheckBoxInativo)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInativar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAtivar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextNomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPesquisarActionPerformed
       
    }//GEN-LAST:event_jTextPesquisarActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        List<AutorBEAN> listAllAutores = controleAutor.listaAutoresAtivos(); 
        limpar_tabela();
        preencher_tabela(listAllAutores);
        
        inativarEditar();
        inativarBotaoAtivar();
        inativarBotaoInativar();
        
        jTextPesquisar.setText("");
        jCheckBoxInativo.setSelected(false);
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        AutorBEAN autor = new AutorBEAN(0, jTextNomeAutor.getText(), 1);
        controleAutor.inserirAutor(autor);
        
        List<AutorBEAN> listAllAutores = controleAutor.listaAutoresAtivos(); 
        limpar_tabela();
        preencher_tabela(listAllAutores);
        
        inativarEditar();
        inativarBotaoAtivar();
        inativarBotaoInativar();
        
        jTextNomeAutor.setText("");
        jCheckBoxInativo.setSelected(false);
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
                
        int index = jTableAutor.getSelectedRow();
        int id;
        
        String idString = jTableAutor.getValueAt(index, 0).toString();
        id = Integer.parseInt(idString);
        String nomeAutor = jTableAutor.getValueAt(index, 1).toString();
        String statusString = jTableAutor.getValueAt(index, 2).toString();
       
        new TelaEditarAutor(id, nomeAutor, statusString).setVisible(true);

        List<AutorBEAN> listAllAutores = controleAutor.listaAutoresAtivos();      
        limpar_tabela();
        preencher_tabela(listAllAutores);
        
        inativarEditar();
        inativarBotaoAtivar();
        inativarBotaoInativar();
        
        jTextPesquisar.setText("");
        jCheckBoxInativo.setSelected(false);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonInativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInativarActionPerformed
        int index = jTableAutor.getSelectedRow();
        int id;
        String idString = jTableAutor.getValueAt(index, 0).toString();
        id = Integer.parseInt(idString);
        
        AutorBEAN autor = new AutorBEAN(id);
        controleAutor.inativarAutor(autor);
        
        List<AutorBEAN> listAllAutores = controleAutor.listaAutoresAtivos(); 
        limpar_tabela();
        preencher_tabela(listAllAutores);
        
        inativarEditar();
        inativarBotaoAtivar();
        inativarBotaoInativar();
        
        jTextPesquisar.setText("");
        jCheckBoxInativo.setSelected(false);
    }//GEN-LAST:event_jButtonInativarActionPerformed

    private void jButtonAtivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtivarActionPerformed
        int index = jTableAutor.getSelectedRow();
        int id;
        String idString = jTableAutor.getValueAt(index, 0).toString();
        id = Integer.parseInt(idString);
        
        AutorBEAN autor = new AutorBEAN(id);
        controleAutor.ativarAutor(autor);
        
        List<AutorBEAN> listAllAutores = controleAutor.listaAutoresAtivos(); 
        limpar_tabela();
        preencher_tabela(listAllAutores);
        
        jTextPesquisar.setText("");
        jCheckBoxInativo.setSelected(false);
    }//GEN-LAST:event_jButtonAtivarActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jTableAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAutorMouseClicked
        int index = jTableAutor.getSelectedRow();
        String mouseClick = jTableAutor.getValueAt(index, 2).toString();
        
        if(mouseClick == "Ativo"){
            inativarBotaoAtivar();
            ativarBotaoInativar();
        }else if(mouseClick == "Inativo"){
            inativarBotaoInativar();
            ativarBotaoAtivar();
        }
        
        ativarEditar();
    }//GEN-LAST:event_jTableAutorMouseClicked

    private void jTableAutorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAutorMouseReleased
        if(evt.getButton() == MouseEvent.BUTTON3){
            if(evt.isPopupTrigger() & jTableAutor.getSelectedRowCount() != 0){
                PopUpMenu.show(evt.getComponent(),evt.getX(),evt.getY());
            }
        }
    }//GEN-LAST:event_jTableAutorMouseReleased

    private void jMenuItemAtivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAtivarActionPerformed
        int index = jTableAutor.getSelectedRow();
        int id;
        String idString = jTableAutor.getValueAt(index, 0).toString();
        id = Integer.parseInt(idString);
        
        AutorBEAN autor = new AutorBEAN(id);
        controleAutor.ativarAutor(autor);
        
        List<AutorBEAN> listAllAutores = controleAutor.listaAutoresAtivos(); 
        limpar_tabela();
        preencher_tabela(listAllAutores);
        
        jTextPesquisar.setText("");
        jCheckBoxInativo.setSelected(false);
    }//GEN-LAST:event_jMenuItemAtivarActionPerformed

    private void jMenuItemInativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInativarActionPerformed
        int index = jTableAutor.getSelectedRow();
        int id;
        String idString = jTableAutor.getValueAt(index, 0).toString();
        id = Integer.parseInt(idString);
        
        AutorBEAN autor = new AutorBEAN(id);
        controleAutor.inativarAutor(autor);
        
        List<AutorBEAN> listAllAutores = controleAutor.listaAutoresAtivos(); 
        limpar_tabela();
        preencher_tabela(listAllAutores);
        
        inativarEditar();
        inativarBotaoAtivar();
        inativarBotaoInativar();
        
        jTextPesquisar.setText("");
        jCheckBoxInativo.setSelected(false);
    }//GEN-LAST:event_jMenuItemInativarActionPerformed

    private void jCheckBoxInativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxInativoActionPerformed
        List<AutorBEAN> consulta = controleAutor.consultaAutoresInativos(jTextPesquisar.getText());
        limpar_tabela();
        preencher_tabela(consulta);
    }//GEN-LAST:event_jCheckBoxInativoActionPerformed

    private void jTextPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPesquisarKeyReleased
        List<AutorBEAN> consulta = controleAutor.consultaAutoresAtivos(jTextPesquisar.getText());
        limpar_tabela();
        preencher_tabela(consulta);
    }//GEN-LAST:event_jTextPesquisarKeyReleased

    
      
    public void preencher_tabela(List<AutorBEAN> listaAutores) {
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) jTableAutor.getModel();
        
        jTableAutor.getColumnModel().getColumn(0).setMinWidth(0);
        jTableAutor.getColumnModel().getColumn(0).setMaxWidth(0);
        jTableAutor.getColumnModel().getColumn(1).setPreferredWidth(500);
        jTableAutor.getColumnModel().getColumn(2).setMinWidth(0);
        jTableAutor.getColumnModel().getColumn(2).setMaxWidth(0);
        modelo.setNumRows(0);
        try {
            for (AutorBEAN autor : listaAutores) {
                if(autor.getStatusAutor() == 1){
                    modelo.addRow(new Object[]{autor.getIDAutor(), autor.getNomeAutor(), "Ativo"});
                }else if(autor.getStatusAutor() == 0){
                    modelo.addRow(new Object[]{autor.getIDAutor(), autor.getNomeAutor(), "Inativo"});
                }
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar dados - " + erro);
        }
    }
    
    
    public void limpar_tabela() {
        for (int i = 0; i < this.jTableAutor.getRowCount(); i++) {
            this.jTableAutor.setValueAt("", i, 0);
            this.jTableAutor.setValueAt("", i, 1);
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
        FlatDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu PopUpMenu;
    private javax.swing.JButton jButtonAtivar;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonInativar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JCheckBox jCheckBoxInativo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItemAtivar;
    private javax.swing.JMenuItem jMenuItemInativar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAutor;
    private javax.swing.JTextField jTextNomeAutor;
    private javax.swing.JTextField jTextPesquisar;
    // End of variables declaration//GEN-END:variables
}
