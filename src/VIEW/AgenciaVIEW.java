package VIEW;

import DTO.AgenciaDTO;
import DAO.AgenciaDAO;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AgenciaVIEW extends javax.swing.JFrame {

    public AgenciaVIEW() {
        initComponents();
//        listarAgencia();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_container = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtp_agencia = new javax.swing.JTabbedPane();
        jp_con_agencia = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabagencia = new javax.swing.JTable();
        jp_cad_agencia = new javax.swing.JPanel();
        lbl_nome_cad_agencia = new javax.swing.JLabel();
        txtcadagencia = new javax.swing.JTextField();
        btncadagencia = new javax.swing.JButton();
        jp_up_agencia = new javax.swing.JPanel();
        lbl_nome_up_agencia = new javax.swing.JLabel();
        cmbupagencia = new javax.swing.JComboBox<>();
        lbl_novo_nome_up_agencia = new javax.swing.JLabel();
        btnupagencia = new javax.swing.JButton();
        txtupagencia = new javax.swing.JTextField();
        jp_del_agencia = new javax.swing.JPanel();
        lbl_del_nome_bairro = new javax.swing.JLabel();
        btndelbairro = new javax.swing.JButton();
        cmbdelbairro = new javax.swing.JComboBox<>();
        lbl_titulo = new javax.swing.JLabel();
        menu_entidades = new javax.swing.JMenuBar();
        jmagencia = new javax.swing.JMenu();
        jmbairro = new javax.swing.JMenu();
        jmclientes = new javax.swing.JMenu();
        jmcontas = new javax.swing.JMenu();
        jmtransacoes = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabagencia.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabagencia);

        javax.swing.GroupLayout jp_con_agenciaLayout = new javax.swing.GroupLayout(jp_con_agencia);
        jp_con_agencia.setLayout(jp_con_agenciaLayout);
        jp_con_agenciaLayout.setHorizontalGroup(
            jp_con_agenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_con_agenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addContainerGap())
        );
        jp_con_agenciaLayout.setVerticalGroup(
            jp_con_agenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_con_agenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtp_agencia.addTab("Consulta", jp_con_agencia);

        lbl_nome_cad_agencia.setText("Nome da Agência");

        btncadagencia.setText("Cadastrar");
        btncadagencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadagenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_cad_agenciaLayout = new javax.swing.GroupLayout(jp_cad_agencia);
        jp_cad_agencia.setLayout(jp_cad_agenciaLayout);
        jp_cad_agenciaLayout.setHorizontalGroup(
            jp_cad_agenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_cad_agenciaLayout.createSequentialGroup()
                .addGroup(jp_cad_agenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_cad_agenciaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_nome_cad_agencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jp_cad_agenciaLayout.createSequentialGroup()
                        .addGroup(jp_cad_agenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btncadagencia)
                            .addComponent(txtcadagencia, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 194, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jp_cad_agenciaLayout.setVerticalGroup(
            jp_cad_agenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_cad_agenciaLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lbl_nome_cad_agencia)
                .addGap(18, 18, 18)
                .addComponent(txtcadagencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btncadagencia)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jtp_agencia.addTab("Cadastro", jp_cad_agencia);

        lbl_nome_up_agencia.setText("Agencia");

        lbl_novo_nome_up_agencia.setText("Novo nome");

        btnupagencia.setText("Atualizar");
        btnupagencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupagenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_up_agenciaLayout = new javax.swing.GroupLayout(jp_up_agencia);
        jp_up_agencia.setLayout(jp_up_agenciaLayout);
        jp_up_agenciaLayout.setHorizontalGroup(
            jp_up_agenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_up_agenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_up_agenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_novo_nome_up_agencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_nome_up_agencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_up_agenciaLayout.createSequentialGroup()
                        .addGroup(jp_up_agenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnupagencia)
                            .addGroup(jp_up_agenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtupagencia, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                .addComponent(cmbupagencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 189, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jp_up_agenciaLayout.setVerticalGroup(
            jp_up_agenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_up_agenciaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lbl_nome_up_agencia)
                .addGap(18, 18, 18)
                .addComponent(cmbupagencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_novo_nome_up_agencia)
                .addGap(18, 18, 18)
                .addComponent(txtupagencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnupagencia)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jtp_agencia.addTab("Atualização", jp_up_agencia);

        lbl_del_nome_bairro.setText("Nome da Agência");

        btndelbairro.setText("Excluir");
        btndelbairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelbairroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_del_agenciaLayout = new javax.swing.GroupLayout(jp_del_agencia);
        jp_del_agencia.setLayout(jp_del_agenciaLayout);
        jp_del_agenciaLayout.setHorizontalGroup(
            jp_del_agenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_del_agenciaLayout.createSequentialGroup()
                .addGroup(jp_del_agenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_del_agenciaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_del_nome_bairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jp_del_agenciaLayout.createSequentialGroup()
                        .addGroup(jp_del_agenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btndelbairro)
                            .addComponent(cmbdelbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 195, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jp_del_agenciaLayout.setVerticalGroup(
            jp_del_agenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_del_agenciaLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lbl_del_nome_bairro)
                .addGap(18, 18, 18)
                .addComponent(cmbdelbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btndelbairro)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jtp_agencia.addTab("Exclusão", jp_del_agencia);

        lbl_titulo.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("Controle de Agências");

        javax.swing.GroupLayout panel_containerLayout = new javax.swing.GroupLayout(panel_container);
        panel_container.setLayout(panel_containerLayout);
        panel_containerLayout.setHorizontalGroup(
            panel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_containerLayout.createSequentialGroup()
                .addGroup(panel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_containerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtp_agencia)))
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
                .addComponent(jtp_agencia))
            .addGroup(panel_containerLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jmagencia.setText("Agências");
        menu_entidades.add(jmagencia);

        jmbairro.setText("Bairros");
        menu_entidades.add(jmbairro);

        jmclientes.setText("Clientes");
        menu_entidades.add(jmclientes);

        jmcontas.setText("Contas");
        menu_entidades.add(jmcontas);

        jmtransacoes.setText("Transações");
        menu_entidades.add(jmtransacoes);

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

    private void btncadagenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadagenciaActionPerformed
        AgenciaDTO objagenciadto = new AgenciaDTO();
        AgenciaDAO objagenciadao = new AgenciaDAO();
        String nomeagencia = txtcadagencia.getText();

//        objagenciadto.setNome(nomeagencia);
//        objagenciadao.cadastrarAgencia(objagenciadto);

        txtcadagencia.setText("");
    }//GEN-LAST:event_btncadagenciaActionPerformed

    private void btnupagenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupagenciaActionPerformed
        AgenciaDTO objagenciadto = new AgenciaDTO();
        AgenciaDAO objagenciadao = new AgenciaDAO();
        Map<String, String> mapaidpornome = null;
        
        String idagencia;
        String selecionado = (String) cmbupagencia.getSelectedItem();
        String novoagencia = txtupagencia.getText();
        
        idagencia = mapaidpornome.get(selecionado);

//        objagenciadto.setId(Integer.parseInt(idagencia));
//        objagenciadto.setNome(novoagencia);
//
//        objagenciadao.atualizarAgencia(objagenciadto);
        txtcadagencia.setText("");
    }//GEN-LAST:event_btnupagenciaActionPerformed

    private void btndelbairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelbairroActionPerformed
        AgenciaDTO objagenciadto = new AgenciaDTO();
        AgenciaDAO objagenciadao = new AgenciaDAO();
        Map<String, String> mapaidpornome = null;
        
        String idagencia;
//        String selecionado = (String) cmbdelagencia.getSelectedItem();

//        idagencia = mapaidpornome.get(selecionado);

//        objagenciadto.setId(Integer.parseInt(idagencia));
//
//        objagenciadao.excluirAgencia(objagenciadto);
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
            java.util.logging.Logger.getLogger(AgenciaVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgenciaVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgenciaVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgenciaVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AgenciaVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncadagencia;
    private javax.swing.JButton btndelbairro;
    private javax.swing.JButton btnupagencia;
    private javax.swing.JComboBox<String> cmbdelbairro;
    private javax.swing.JComboBox<String> cmbupagencia;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu jmagencia;
    private javax.swing.JMenu jmbairro;
    private javax.swing.JMenu jmclientes;
    private javax.swing.JMenu jmcontas;
    private javax.swing.JMenu jmtransacoes;
    private javax.swing.JPanel jp_cad_agencia;
    private javax.swing.JPanel jp_con_agencia;
    private javax.swing.JPanel jp_del_agencia;
    private javax.swing.JPanel jp_up_agencia;
    private javax.swing.JTabbedPane jtp_agencia;
    private javax.swing.JLabel lbl_del_nome_bairro;
    private javax.swing.JLabel lbl_nome_cad_agencia;
    private javax.swing.JLabel lbl_nome_up_agencia;
    private javax.swing.JLabel lbl_novo_nome_up_agencia;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JMenuBar menu_entidades;
    private javax.swing.JPanel panel_container;
    private javax.swing.JTable tabagencia;
    private javax.swing.JTextField txtcadagencia;
    private javax.swing.JTextField txtupagencia;
    // End of variables declaration//GEN-END:variables

//    private List listarAgencia() {
//        AgenciaDAO objagenciadao = new AgenciaDAO();
//        
//        List<AgenciaDTO> lista = objagenciadao.pesquisarAgencia();
//        Map<String, String> mapaidpornome;
//        
//        try {
//            DefaultTableModel model = (DefaultTableModel) tabagencia.getModel();
//            model.setRowCount(0);
//
//            mapaidpornome = new HashMap<>();
//            mapaidpornome.clear();
//            
//            cmbupagencia.removeAllItems();
//            cmbdelagencia.removeAllItems();
//
//            for (AgenciaDTO agencia : lista) {
//                model.addRow(new Object[]{
//                    agencia.getId(),
//                    agencia.getNome()
//                });
//
//                mapaidpornome.put(agencia.getNome(), null);
//
//                cmbupagencia.addItem(agencia.getNome());
//                cmbdelagencia.addItem(agencia.getNome());
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "listar Valores VIEW: " + e);
//        }
//        return lista;
//    }
}
