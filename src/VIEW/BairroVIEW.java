package VIEW;

import DTO.BairroDTO;
import DAO.BairroDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BairroVIEW extends javax.swing.JFrame {

    public BairroVIEW() {
        initComponents();
        listarBairro();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_container = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtp_bairro = new javax.swing.JTabbedPane();
        jp_con_bairro = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabbairro = new javax.swing.JTable();
        jp_cad_bairro = new javax.swing.JPanel();
        lbl_nome_cad_bairro = new javax.swing.JLabel();
        txtcadbairro = new javax.swing.JTextField();
        btncadbairro = new javax.swing.JButton();
        jp_up_bairro = new javax.swing.JPanel();
        lbl_nome_up_bairro = new javax.swing.JLabel();
        cmbupbairro = new javax.swing.JComboBox<>();
        lbl_novo_nome_up_bairro = new javax.swing.JLabel();
        btnupbairro = new javax.swing.JButton();
        txtupbairro = new javax.swing.JTextField();
        jp_del_bairro = new javax.swing.JPanel();
        lbl_del_nome_bairro = new javax.swing.JLabel();
        btndelbairro = new javax.swing.JButton();
        cmbdelbairro = new javax.swing.JComboBox<>();
        lbl_titulo = new javax.swing.JLabel();
        menu_entidades = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabbairro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id Bairro", "Nome Bairro"
            }
        ));
        jScrollPane1.setViewportView(tabbairro);

        javax.swing.GroupLayout jp_con_bairroLayout = new javax.swing.GroupLayout(jp_con_bairro);
        jp_con_bairro.setLayout(jp_con_bairroLayout);
        jp_con_bairroLayout.setHorizontalGroup(
            jp_con_bairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_con_bairroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addContainerGap())
        );
        jp_con_bairroLayout.setVerticalGroup(
            jp_con_bairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_con_bairroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtp_bairro.addTab("Consulta", jp_con_bairro);

        lbl_nome_cad_bairro.setText("Nome do Bairro");

        btncadbairro.setText("Cadastrar");
        btncadbairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadbairroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_cad_bairroLayout = new javax.swing.GroupLayout(jp_cad_bairro);
        jp_cad_bairro.setLayout(jp_cad_bairroLayout);
        jp_cad_bairroLayout.setHorizontalGroup(
            jp_cad_bairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_cad_bairroLayout.createSequentialGroup()
                .addGroup(jp_cad_bairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_cad_bairroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_nome_cad_bairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jp_cad_bairroLayout.createSequentialGroup()
                        .addGroup(jp_cad_bairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btncadbairro)
                            .addComponent(txtcadbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 194, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jp_cad_bairroLayout.setVerticalGroup(
            jp_cad_bairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_cad_bairroLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lbl_nome_cad_bairro)
                .addGap(18, 18, 18)
                .addComponent(txtcadbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btncadbairro)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jtp_bairro.addTab("Cadastro", jp_cad_bairro);

        lbl_nome_up_bairro.setText("Bairro");

        lbl_novo_nome_up_bairro.setText("Novo nome");

        btnupbairro.setText("Atualizar");
        btnupbairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupbairroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_up_bairroLayout = new javax.swing.GroupLayout(jp_up_bairro);
        jp_up_bairro.setLayout(jp_up_bairroLayout);
        jp_up_bairroLayout.setHorizontalGroup(
            jp_up_bairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_up_bairroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_up_bairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_novo_nome_up_bairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_nome_up_bairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_up_bairroLayout.createSequentialGroup()
                        .addGroup(jp_up_bairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnupbairro)
                            .addGroup(jp_up_bairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtupbairro, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                .addComponent(cmbupbairro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 189, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jp_up_bairroLayout.setVerticalGroup(
            jp_up_bairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_up_bairroLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lbl_nome_up_bairro)
                .addGap(18, 18, 18)
                .addComponent(cmbupbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_novo_nome_up_bairro)
                .addGap(18, 18, 18)
                .addComponent(txtupbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnupbairro)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jtp_bairro.addTab("Atualização", jp_up_bairro);

        lbl_del_nome_bairro.setText("Nome do Bairro");

        btndelbairro.setText("Excluir");
        btndelbairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelbairroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_del_bairroLayout = new javax.swing.GroupLayout(jp_del_bairro);
        jp_del_bairro.setLayout(jp_del_bairroLayout);
        jp_del_bairroLayout.setHorizontalGroup(
            jp_del_bairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_del_bairroLayout.createSequentialGroup()
                .addGroup(jp_del_bairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_del_bairroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_del_nome_bairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jp_del_bairroLayout.createSequentialGroup()
                        .addGroup(jp_del_bairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btndelbairro)
                            .addComponent(cmbdelbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 195, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jp_del_bairroLayout.setVerticalGroup(
            jp_del_bairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_del_bairroLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lbl_del_nome_bairro)
                .addGap(18, 18, 18)
                .addComponent(cmbdelbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btndelbairro)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jtp_bairro.addTab("Exclusão", jp_del_bairro);

        lbl_titulo.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("Controle de Bairros");

        javax.swing.GroupLayout panel_containerLayout = new javax.swing.GroupLayout(panel_container);
        panel_container.setLayout(panel_containerLayout);
        panel_containerLayout.setHorizontalGroup(
            panel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_containerLayout.createSequentialGroup()
                .addGroup(panel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_containerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtp_bairro)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(516, 516, 516))
        );
        panel_containerLayout.setVerticalGroup(
            panel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_containerLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtp_bairro))
            .addGroup(panel_containerLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu4.setText("Agências");
        menu_entidades.add(jMenu4);

        jMenu3.setText("Bairros");
        menu_entidades.add(jMenu3);

        jMenu1.setText("Clientes");
        menu_entidades.add(jMenu1);

        jMenu2.setText("Contas");
        menu_entidades.add(jMenu2);

        jMenu5.setText("Transações");
        menu_entidades.add(jMenu5);

        setJMenuBar(menu_entidades);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_container, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncadbairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadbairroActionPerformed
        BairroDTO objbairrodto = new BairroDTO();
        BairroDAO objbairrodao = new BairroDAO();
        
        String nomebairro = txtcadbairro.getText();

        objbairrodto.setNome(nomebairro);
        objbairrodao.cadastrarBairro(objbairrodto);
        
        finalizarTransacao();
    }//GEN-LAST:event_btncadbairroActionPerformed

    private void btnupbairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupbairroActionPerformed
        BairroDTO objbairrodto = new BairroDTO();
        BairroDAO objbairrodao = new BairroDAO();
        
        String nome = (String) cmbupbairro.getSelectedItem();
        int id = objbairrodao.pesquisarBairroId(nome);
        String novobairro = txtupbairro.getText();
        
        objbairrodto.setId(id);
        objbairrodto.setNome(novobairro);
        objbairrodao.atualizarBairro(objbairrodto);

        finalizarTransacao();
    }//GEN-LAST:event_btnupbairroActionPerformed

    private void btndelbairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelbairroActionPerformed
        BairroDTO objbairrodto = new BairroDTO();
        BairroDAO objbairrodao = new BairroDAO();
        
        String nome = (String) cmbdelbairro.getSelectedItem();
        int id = objbairrodao.pesquisarBairroId(nome);
        
        objbairrodto.setId(id);
        objbairrodao.excluirBairro(objbairrodto);
        
        finalizarTransacao();
    }//GEN-LAST:event_btndelbairroActionPerformed

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
            java.util.logging.Logger.getLogger(BairroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BairroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BairroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BairroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BairroVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncadbairro;
    private javax.swing.JButton btndelbairro;
    private javax.swing.JButton btnupbairro;
    private javax.swing.JComboBox<String> cmbdelbairro;
    private javax.swing.JComboBox<String> cmbupbairro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jp_cad_bairro;
    private javax.swing.JPanel jp_con_bairro;
    private javax.swing.JPanel jp_del_bairro;
    private javax.swing.JPanel jp_up_bairro;
    private javax.swing.JTabbedPane jtp_bairro;
    private javax.swing.JLabel lbl_del_nome_bairro;
    private javax.swing.JLabel lbl_nome_cad_bairro;
    private javax.swing.JLabel lbl_nome_up_bairro;
    private javax.swing.JLabel lbl_novo_nome_up_bairro;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JMenuBar menu_entidades;
    private javax.swing.JPanel panel_container;
    private javax.swing.JTable tabbairro;
    private javax.swing.JTextField txtcadbairro;
    private javax.swing.JTextField txtupbairro;
    // End of variables declaration//GEN-END:variables

    private List listarBairro() {
        BairroDAO objbairrodao = new BairroDAO();
        
        List<BairroDTO> lista = objbairrodao.pesquisarBairro();
        
        try {
            DefaultTableModel model = (DefaultTableModel) tabbairro.getModel();
            model.setRowCount(0);

            cmbupbairro.removeAllItems();
            cmbdelbairro.removeAllItems();

            for (BairroDTO bairro : lista) {
                model.addRow(new Object[]{
                    bairro.getId(),
                    bairro.getNome()
                });

                cmbupbairro.addItem(bairro.getNome());
                cmbdelbairro.addItem(bairro.getNome());
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "listar Valores VIEW: " + e);
        }
        
        return lista;
    }
    
    public void finalizarTransacao(){
        JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!");
        txtcadbairro.setText("");
        listarBairro();
        System.gc();
    }
}
