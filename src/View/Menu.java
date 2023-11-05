package View;

import com.formdev.flatlaf.FlatDarkLaf;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtoAutor = new javax.swing.JButton();
        jButtonEditora = new javax.swing.JButton();
        jButtonLivro = new javax.swing.JButton();
        jButtonAmigo = new javax.swing.JButton();
        jButtonEmprestimo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("BiblioTech");

        jButtoAutor.setBackground(new java.awt.Color(0, 153, 204));
        jButtoAutor.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButtoAutor.setText("Autor");
        jButtoAutor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtoAutor.setMaximumSize(new java.awt.Dimension(100, 20));
        jButtoAutor.setMinimumSize(new java.awt.Dimension(100, 20));
        jButtoAutor.setPreferredSize(new java.awt.Dimension(100, 20));
        jButtoAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoAutorActionPerformed(evt);
            }
        });

        jButtonEditora.setBackground(new java.awt.Color(0, 153, 204));
        jButtonEditora.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButtonEditora.setText("Editora");
        jButtonEditora.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonEditora.setMaximumSize(new java.awt.Dimension(100, 20));
        jButtonEditora.setMinimumSize(new java.awt.Dimension(100, 20));
        jButtonEditora.setPreferredSize(new java.awt.Dimension(100, 20));
        jButtonEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditoraActionPerformed(evt);
            }
        });

        jButtonLivro.setBackground(new java.awt.Color(0, 153, 204));
        jButtonLivro.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButtonLivro.setText("Livro");
        jButtonLivro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonLivro.setMaximumSize(new java.awt.Dimension(100, 20));
        jButtonLivro.setMinimumSize(new java.awt.Dimension(100, 20));
        jButtonLivro.setPreferredSize(new java.awt.Dimension(100, 20));
        jButtonLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLivroActionPerformed(evt);
            }
        });

        jButtonAmigo.setBackground(new java.awt.Color(0, 153, 204));
        jButtonAmigo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButtonAmigo.setText("Amigo");
        jButtonAmigo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonAmigo.setMaximumSize(new java.awt.Dimension(100, 20));
        jButtonAmigo.setMinimumSize(new java.awt.Dimension(100, 20));
        jButtonAmigo.setPreferredSize(new java.awt.Dimension(100, 20));
        jButtonAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAmigoActionPerformed(evt);
            }
        });

        jButtonEmprestimo.setBackground(new java.awt.Color(0, 153, 204));
        jButtonEmprestimo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButtonEmprestimo.setText("Empréstimo");
        jButtonEmprestimo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonEmprestimo.setMaximumSize(new java.awt.Dimension(100, 20));
        jButtonEmprestimo.setMinimumSize(new java.awt.Dimension(100, 20));
        jButtonEmprestimo.setPreferredSize(new java.awt.Dimension(100, 20));
        jButtonEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmprestimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtoAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonEditora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonAmigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 8, Short.MAX_VALUE))
            .addComponent(jButtonEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jButtoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(578, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtoAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoAutorActionPerformed
        TelaAutor frame = new TelaAutor();
        frame.setVisible(true);
    }//GEN-LAST:event_jButtoAutorActionPerformed

    private void jButtonEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditoraActionPerformed
        TelaEditora frame = new TelaEditora();
        frame.setVisible(true);
    }//GEN-LAST:event_jButtonEditoraActionPerformed

    private void jButtonLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLivroActionPerformed
        TelaLivro frame = new TelaLivro();
        frame.setVisible(true);
    }//GEN-LAST:event_jButtonLivroActionPerformed

    private void jButtonAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAmigoActionPerformed
        TelaAmigo frame = new TelaAmigo();
        frame.setVisible(true);
    }//GEN-LAST:event_jButtonAmigoActionPerformed

    private void jButtonEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmprestimoActionPerformed
        TelaEmprestimo frame = new TelaEmprestimo();
        frame.setVisible(true);
    }//GEN-LAST:event_jButtonEmprestimoActionPerformed

    
    public static void main(String args[]) {
           FlatDarkLaf.setup();
           java.awt.EventQueue.invokeLater(new Runnable() { 
            public void run() {
                new Menu().setVisible(true);
            }
        });
           
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }   
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtoAutor;
    private javax.swing.JButton jButtonAmigo;
    private javax.swing.JButton jButtonEditora;
    private javax.swing.JButton jButtonEmprestimo;
    private javax.swing.JButton jButtonLivro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
