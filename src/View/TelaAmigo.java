package View;

import Controller.ControleAmigo;
import Model.AmigoBEAN;
import com.formdev.flatlaf.FlatDarkLaf;
import java.util.List;
import javax.swing.JOptionPane;

public class TelaAmigo extends javax.swing.JFrame {

    ControleAmigo controleAmigo = new ControleAmigo();
    
    public TelaAmigo() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        jCheckBoxAtivo.setSelected(rootPaneCheckingEnabled);
        
        inativarEditar();
        inativarBotaoAtivar();
        inativarBotaoInativar();
        
        List<AmigoBEAN> listAllAmigos = controleAmigo.listaAmigosAtivos();      
        limpar_tabela();
        preencher_tabela(listAllAmigos);
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
        jTableAmigos = new javax.swing.JTable();
        jButtonEditar = new javax.swing.JButton();
        jButtonAtivar = new javax.swing.JButton();
        jButtonInativar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextNomeAmigo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jFormattedTextCPFAmigo = new javax.swing.JFormattedTextField();
        jFormattedTextTelefoneAmigo = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("AMIGOS");

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

        jTableAmigos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTableAmigos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "CPF", "TELEFONE", "STATUS"
            }
        ));
        jTableAmigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAmigosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAmigos);

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

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("CADASTRO");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("NOME: ");

        jTextNomeAmigo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("CPF: ");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("TELEFONE: ");

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

        try {
            jFormattedTextCPFAmigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextCPFAmigo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFormattedTextCPFAmigo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        try {
            jFormattedTextTelefoneAmigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextTelefoneAmigo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jFormattedTextTelefoneAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextTelefoneAmigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(281, 281, 281))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jFormattedTextTelefoneAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBoxAtivo)
                                .addGap(45, 45, 45)
                                .addComponent(jCheckBoxInativo))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jButtonAtivar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jButtonInativar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextNomeAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextCPFAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxAtivo)
                    .addComponent(jCheckBoxInativo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAtivar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonInativar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextNomeAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jFormattedTextCPFAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jFormattedTextTelefoneAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        AmigoBEAN amigo = new AmigoBEAN(0, jTextNomeAmigo.getText(), jFormattedTextCPFAmigo.getText(), jFormattedTextTelefoneAmigo.getText(), 1);
        controleAmigo.insertAmigo(amigo);
        
        List<AmigoBEAN> listAllAmigos = controleAmigo.listaAmigosAtivos(); 
        limpar_tabela();
        preencher_tabela(listAllAmigos);
        
        inativarEditar();
        inativarBotaoAtivar();
        inativarBotaoInativar();
        
        jTextNomeAmigo.setText("");
        jFormattedTextCPFAmigo.setText("");
        jFormattedTextTelefoneAmigo.setText("");
        jCheckBoxAtivo.setSelected(rootPaneCheckingEnabled);
        jCheckBoxInativo.setSelected(false);
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        if(jCheckBoxAtivo.isSelected() && jCheckBoxInativo.isSelected()){
            List<AmigoBEAN> consulta = controleAmigo.consultaAmigo(jTextPesquisar.getText());
            limpar_tabela();
            preencher_tabela(consulta);
        }else if(jCheckBoxAtivo.isSelected() && !jCheckBoxInativo.isSelected()){
            List<AmigoBEAN> consulta = controleAmigo.consultaAmigosAtivos(jTextPesquisar.getText());
            limpar_tabela();
            preencher_tabela(consulta);
        }else if(!jCheckBoxAtivo.isSelected() && jCheckBoxInativo.isSelected()){
            List<AmigoBEAN> consulta = controleAmigo.consultaAmigosInativos(jTextPesquisar.getText());
            limpar_tabela();
            preencher_tabela(consulta);
        }else if(!jCheckBoxAtivo.isSelected() && !jCheckBoxInativo.isSelected()){
            jCheckBoxAtivo.setSelected(rootPaneCheckingEnabled);
            
            List<AmigoBEAN> consulta = controleAmigo.consultaAmigo(jTextPesquisar.getText());
            limpar_tabela();
            preencher_tabela(consulta);
        }
        
        inativarEditar();
        inativarBotaoAtivar();
        inativarBotaoInativar();
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        List<AmigoBEAN> listAllAmigos = controleAmigo.listaAmigosAtivos(); 
        limpar_tabela();
        preencher_tabela(listAllAmigos);
        
        inativarEditar();
        inativarBotaoAtivar();
        inativarBotaoInativar();
        
        jTextPesquisar.setText("");
        jCheckBoxAtivo.setSelected(rootPaneCheckingEnabled);
        jCheckBoxInativo.setSelected(false);
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        int index = jTableAmigos.getSelectedRow();
        int id;
        
        String idString = jTableAmigos.getValueAt(index, 0).toString();
        id = Integer.parseInt(idString);
        String nomeAmigo = jTableAmigos.getValueAt(index, 1).toString();
        String cpfAmigo = jTableAmigos.getValueAt(index, 2).toString();
        String telefoneAmigo = jTableAmigos.getValueAt(index, 3).toString();
        String statusString = jTableAmigos.getValueAt(index, 4).toString();
       
        new TelaEditarAmigo(id, nomeAmigo, cpfAmigo, telefoneAmigo, statusString).setVisible(true);

        List<AmigoBEAN> listAllAmigos = controleAmigo.listaAmigosAtivos();      
        limpar_tabela();
        preencher_tabela(listAllAmigos);
        
        inativarEditar();
        inativarBotaoAtivar();
        inativarBotaoInativar();
        
        jTextPesquisar.setText("");
        jCheckBoxAtivo.setSelected(rootPaneCheckingEnabled);
        jCheckBoxInativo.setSelected(false);
        
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonAtivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtivarActionPerformed
        int index = jTableAmigos.getSelectedRow();
        int id;
        String idString = jTableAmigos.getValueAt(index, 0).toString();
        id = Integer.parseInt(idString);
        
        AmigoBEAN amigo = new AmigoBEAN(id);
        controleAmigo.ativarAmigo(amigo);
        
        List<AmigoBEAN> listAllAmigos = controleAmigo.listaAmigosAtivos(); 
        limpar_tabela();
        preencher_tabela(listAllAmigos);
        
        jTextPesquisar.setText("");
        jCheckBoxAtivo.setSelected(rootPaneCheckingEnabled);
        jCheckBoxInativo.setSelected(false);
    }//GEN-LAST:event_jButtonAtivarActionPerformed

    private void jButtonInativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInativarActionPerformed
        int index = jTableAmigos.getSelectedRow();
        int id;
        String idString = jTableAmigos.getValueAt(index, 0).toString();
        id = Integer.parseInt(idString);
        
        AmigoBEAN amigo = new AmigoBEAN(id);
        controleAmigo.inativarAmigo(amigo);
        
        List<AmigoBEAN> listAllAmigos = controleAmigo.listaAmigosAtivos(); 
        limpar_tabela();
        preencher_tabela(listAllAmigos);
        
        inativarEditar();
        inativarBotaoAtivar();
        inativarBotaoInativar();
        
        jTextPesquisar.setText("");
        jCheckBoxAtivo.setSelected(rootPaneCheckingEnabled);
        jCheckBoxInativo.setSelected(false);
    }//GEN-LAST:event_jButtonInativarActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jTableAmigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAmigosMouseClicked
        int index = jTableAmigos.getSelectedRow();
        String mouseClick = jTableAmigos.getValueAt(index, 4).toString();
        
        if(mouseClick == "Ativo"){
            inativarBotaoAtivar();
            ativarBotaoInativar();
        }else if(mouseClick == "Inativo"){
            inativarBotaoInativar();
            ativarBotaoAtivar();
        }
        
        ativarEditar();
    }//GEN-LAST:event_jTableAmigosMouseClicked

    private void jFormattedTextTelefoneAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextTelefoneAmigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextTelefoneAmigoActionPerformed

    public void limpar_tabela() {
        for (int i = 0; i < this.jTableAmigos.getRowCount(); i++) {
            this.jTableAmigos.setValueAt("", i, 0);
            this.jTableAmigos.setValueAt("", i, 1);
            this.jTableAmigos.setValueAt("", i, 2);
            this.jTableAmigos.setValueAt("", i, 3);
            this.jTableAmigos.setValueAt("", i, 4);
        }
    }
    
    public void preencher_tabela(List<AmigoBEAN> listAmigoes) {
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) jTableAmigos.getModel();
        
        jTableAmigos.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTableAmigos.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTableAmigos.getColumnModel().getColumn(2).setPreferredWidth(200);
        jTableAmigos.getColumnModel().getColumn(3).setPreferredWidth(150);
        jTableAmigos.getColumnModel().getColumn(4).setPreferredWidth(100);
        modelo.setNumRows(0);
        
        try {
            for (AmigoBEAN amigo : listAmigoes) {
                if (amigo.getStatusAmigo() == 1) {
                    modelo.addRow(new Object[]{amigo.getIDAmigo(), amigo.getNomeAmigo(), amigo.getCPFAmigo(), amigo.getTelefoneAmigo(), "Ativo"});
                } else if (amigo.getStatusAmigo() == 0){
                    modelo.addRow(new Object[]{amigo.getIDAmigo(), amigo.getNomeAmigo(), amigo.getCPFAmigo(), amigo.getTelefoneAmigo(), "Inativo"});
                }
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
            java.util.logging.Logger.getLogger(TelaAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        FlatDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAmigo().setVisible(true);
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
    private javax.swing.JFormattedTextField jFormattedTextCPFAmigo;
    private javax.swing.JFormattedTextField jFormattedTextTelefoneAmigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAmigos;
    private javax.swing.JTextField jTextNomeAmigo;
    private javax.swing.JTextField jTextPesquisar;
    // End of variables declaration//GEN-END:variables
}
