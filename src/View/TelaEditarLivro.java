package View;

import Controller.ControleAutor;
import Controller.ControleEditora;
import Controller.ControleLivro;
import Model.AutorBEAN;
import Model.EditoraBEAN;
import Model.EditoraDAO;
import Model.LivroBEAN;
import Model.AutorDAO;
import com.formdev.flatlaf.FlatDarkLaf;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TelaEditarLivro extends javax.swing.JFrame {

    ControleLivro controleLivro = new ControleLivro();
    ControleEditora controleEditora = new ControleEditora();
    ControleAutor controleAutor = new ControleAutor();
    
    public TelaEditarLivro() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false); 
    }

    public TelaEditarLivro(int idLivro, String titulo, String statusLivro, String nomeEditora, String nomeAutor) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false); 
        
        preencher_ComboBox(statusLivro, nomeEditora);
        preencher_ComboBoxAutor(statusLivro, nomeAutor);
        
        jTextID.setText(String.valueOf(idLivro));
        jTextTitulo.setText(String.valueOf(titulo));        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextTitulo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jComboBox = new javax.swing.JComboBox<>();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbxAutor = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("LIVROS");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("ID: ");

        jTextID.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextID.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("TÍTULO:");

        jTextTitulo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("EDITORA: ");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("STATUS: ");

        jButtonCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setMaximumSize(new java.awt.Dimension(90, 20));
        jButtonCancelar.setMinimumSize(new java.awt.Dimension(90, 20));
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(90, 20));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonSalvar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setMaximumSize(new java.awt.Dimension(90, 20));
        jButtonSalvar.setMinimumSize(new java.awt.Dimension(90, 20));
        jButtonSalvar.setPreferredSize(new java.awt.Dimension(90, 20));
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jComboBox.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jComboBoxStatus.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("AUTOR:");

        cbxAutor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(164, 164, 164))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(162, 162, 162)
                                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxAutor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextTitulo)
                                    .addComponent(jTextID)
                                    .addComponent(jComboBox, 0, 250, Short.MAX_VALUE)
                                    .addComponent(jComboBoxStatus, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbxAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void preencher_ComboBox(String statusLivro, String nomeEditora){  
        for (int i = 0; i < jComboBoxStatus.getItemCount(); i++) {
            if (statusLivro.equals(jComboBoxStatus.getItemAt(i))) {
                jComboBoxStatus.setSelectedIndex(i);
            }
        }
        
        List<EditoraBEAN> listaEditoras = new ArrayList<>();
        EditoraDAO daoEdit = new EditoraDAO();
        
        listaEditoras = daoEdit.editorasAtivas();
        
        for (EditoraBEAN editora : listaEditoras) {
            jComboBox.addItem(editora);
        }
        
        for (int i = 0; i < jComboBox.getItemCount(); i++) {
            EditoraBEAN editora = jComboBox.getItemAt(i);
            if (editora.getNomeEditora().equals(nomeEditora)) {
                jComboBox.setSelectedIndex(i);
            }
        }
    }
    
    private void preencher_ComboBoxAutor(String statusLivro, String nomeAutor){  
        for (int i = 0; i < jComboBoxStatus.getItemCount(); i++) {
            if (statusLivro.equals(jComboBoxStatus.getItemAt(i))) {
                jComboBoxStatus.setSelectedIndex(i);
            }
        }
        
        List<AutorBEAN> listaAutores = new ArrayList<>();
        AutorDAO daoEdit = new AutorDAO();
        
        listaAutores = daoEdit.autoresAtivos();
        
        for (AutorBEAN autor : listaAutores) {
            cbxAutor.addItem(autor);
        }
        
        for (int i = 0; i < cbxAutor.getItemCount(); i++) {
            AutorBEAN autor = cbxAutor.getItemAt(i);
            if (autor.getNomeAutor().equals(nomeAutor)) {
                cbxAutor.setSelectedIndex(i);
            }
        }
    }
    
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        EditoraBEAN editora = jComboBox.getItemAt(jComboBox.getSelectedIndex());
        AutorBEAN autor = cbxAutor.getItemAt(cbxAutor.getSelectedIndex());
        
        String idLivro = jTextID.getText();
        int idInt = Integer.parseInt(idLivro);
        
        LivroBEAN livro = new LivroBEAN(idInt, jTextTitulo.getText(), jComboBoxStatus.getSelectedItem().toString(), editora.getIDEditora(),autor.getIDAutor());

        controleLivro.updateLivro(livro);
        TelaLivro frame = new TelaLivro();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

  
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
            java.util.logging.Logger.getLogger(TelaEditarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        FlatDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditarLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<AutorBEAN> cbxAutor;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<EditoraBEAN> jComboBox;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextTitulo;
    // End of variables declaration//GEN-END:variables
}
