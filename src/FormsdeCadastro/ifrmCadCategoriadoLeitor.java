/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ifrmCadEstadodoLivro.java
 *
 * Created on 16/09/2010, 22:49:54
 */
package FormsdeCadastro;

import Classes2.EstadoDoLivro;
import java.awt.AWTKeyStroke;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Classes.DB;
import Classes.FixedLengthDocument;
import Classes.Query;

/**
 *
 * @author MARK
 */
public class ifrmCadCategoriadoLeitor extends javax.swing.JInternalFrame {

    private boolean novoCadastro;
    private DB banco2;
    private DefaultTableModel modelo;
    private ArrayList vetor;
    EstadoDoLivro estado;

    /** Creates new form ifrmCadEstadodoLivro */
    public ifrmCadCategoriadoLeitor() {

        initComponents();
        txtNome.setDocument(new FixedLengthDocument(20));
        // Colocando enter para pular de campo
        HashSet conj = new HashSet(this.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
        conj.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));
        this.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);

        //Quando clicar na coluna ordenar
        jTable1.setAutoCreateRowSorter(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jToolBar1 = new javax.swing.JToolBar();
        btnAdicionar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btnCancelarConsulta = new javax.swing.JButton();
        txtConsulta = new javax.swing.JTextField();
        btnTodos = new javax.swing.JButton();
        btnSelecionaRegistro = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblMensagem = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Categoria do Leitor");
        setMinimumSize(new java.awt.Dimension(650, 550));
        setNormalBounds(new java.awt.Rectangle(0, 0, 690, 542));
        setPreferredSize(new java.awt.Dimension(650, 550));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jToolBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Adicionar.png"))); // NOI18N
        btnAdicionar.setToolTipText("Adicionar");
        btnAdicionar.setFocusable(false);
        btnAdicionar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdicionar.setPreferredSize(new java.awt.Dimension(24, 24));
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAdicionar);

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Editar.png"))); // NOI18N
        btnEditar.setToolTipText("Editar");
        btnEditar.setFocusable(false);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEditar);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Cancelar.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.setFocusable(false);
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCancelar);

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Salvar.png"))); // NOI18N
        btnSalvar.setToolTipText("Salvar");
        btnSalvar.setFocusable(false);
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSalvar);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Excluir.png"))); // NOI18N
        btnExcluir.setToolTipText("Excluir");
        btnExcluir.setFocusable(false);
        btnExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnExcluir);

        jTabbedPane1.setMaximumSize(new java.awt.Dimension(675, 477));

        txtCodigo.setEditable(false);
        txtCodigo.setEnabled(false);

        jLabel2.setText("Categoria do Leitor:");

        txtNome.setDisabledTextColor(java.awt.Color.black);

        jLabel1.setText("C??digo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(377, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Principal", jPanel1);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Consulta"));

        btnCancelarConsulta.setText("Cancelar");
        btnCancelarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarConsultaActionPerformed(evt);
            }
        });

        txtConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsultaKeyReleased(evt);
            }
        });

        btnTodos.setText("Todos");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });

        btnSelecionaRegistro.setText("Selecionar registro");
        btnSelecionaRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionaRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnTodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSelecionaRegistro)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarConsulta)
                    .addComponent(btnTodos)
                    .addComponent(btnSelecionaRegistro))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Registros"));
        jPanel6.setPreferredSize(new java.awt.Dimension(609, 227));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblMensagem.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblMensagem.setForeground(java.awt.Color.blue);
        lblMensagem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMensagem.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Consulta", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-650)/2, (screenSize.height-550)/2, 650, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // Bot??es
        btnAdicionar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnExcluir.setEnabled(false);
        txtNome.setEnabled(true);
        txtNome.setText("");
        txtNome.requestFocus();//P??e o foco no controle nome
        //=================================================

        //cria um objeto MysqlDB apontando para o banco especificado.
        DB banco = new DB();
        banco.connect();
        int max1 = -1;

        //conecta ao banco
        Query query1 = new Query(banco.conn);
        //Cria um objeto do tipo query chamado query1 que recebe
        //como argumento o  objeto banco.

//        try {
//            String sql = " SELECT MAX(codigo)As Codigo FROM categoriadoleitor";
//            query1.open(sql); //executa uma senten??a sql.
//            query1.next();
////            int i;
////            int r;
////            String max = null;
//            max1 = query1.rs.getInt(1);
//
//            //txtCodigo.setText((query1.fieldbyname("Codigo")));
////            i = Integer.parseInt(max);
////            r = i + 1;
////            int n = r;
//
//            banco.disconnect();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Erro:" + e.getMessage());
////        } finally {
//            try {
//                query1.rs.close();
//            } catch (SQLException ex) {
//                JOptionPane.showMessageDialog(null, "Erro resultset: " + ex.getMessage());
//            }
//        }

        //String zeros = "00000";
        //String numero = zeros + n;
        //numero = numero.substring(numero.length() - 5);
        //System.out.println(numero.substring(numero.length() - 5));

        //txtCodigo.setText(String.valueOf(max1 + 1));
        txtNome.setText("");

        novoCadastro = true;

    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        btnAdicionar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnExcluir.setEnabled(false);
        txtNome.setEnabled(true);

        novoCadastro = false;
}//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        btnAdicionar.setEnabled(true);
        btnEditar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnExcluir.setEnabled(false);

        txtNome.setEnabled(false);
        //Limpa os controles ao cancelar
        txtCodigo.setText("");
        txtNome.setText("");
        novoCadastro = false;
}//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Categoria do Leitor !",
                    "Aviso", JOptionPane.WARNING_MESSAGE);
            txtNome.requestFocus();
        } //Insert
        else if (novoCadastro == true) {
            //cria um objeto DB apontando para o banco especificado.
            DB banco = new DB();
            //conecta ao banco
            banco.connect();
            //Variavel para verificar se foi executado o comando
            int ri = 0;
            //Insere usando formatacao JAVA
            PreparedStatement st1 = null;
            String sqlInsert = "INSERT INTO categoriadoleitor(codigo,descricao)VALUES(?,?)";
            try {
                st1 = banco.conn.prepareStatement(sqlInsert);
                st1.setInt(1, Integer.parseInt(txtCodigo.getText().trim()));
                st1.setString(2, txtNome.getText().trim());
                ri = st1.executeUpdate();
                st1.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Aten????o", JOptionPane.WARNING_MESSAGE);
            }

            if (ri > 0) {
                JOptionPane.showMessageDialog(null, "Registro adicionado"
                        + " com sucesso !", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                btnAdicionar.setEnabled(true);
                btnEditar.setEnabled(false);
                btnCancelar.setEnabled(false);
                btnSalvar.setEnabled(false);
                btnExcluir.setEnabled(false);

                txtNome.setEnabled(false);
                txtCodigo.setText("");
                txtNome.setText("");
                btnTodosActionPerformed(evt);
            }
        } //sen??o Update
        else if (novoCadastro == false) {
            //cria um objeto DB apontando para o banco especificado.
            DB banco = new DB();
            banco.connect();
            //conecta ao banco
            int ru = 0;
            //Atualiza usando formatacao JAVA
            PreparedStatement st1 = null;
            String sqlInsert = "UPDATE categoriadoleitor SET descricao=? WHERE codigo=?";
            try {
                st1 = banco.conn.prepareStatement(sqlInsert);
                st1.setString(1, txtNome.getText().trim());
                st1.setInt(2, Integer.parseInt(txtCodigo.getText().trim()));
                ru = st1.executeUpdate();
                st1.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Aten????o", JOptionPane.WARNING_MESSAGE);
            }
            if (ru > 0) {
                JOptionPane.showMessageDialog(null, "Registro atualizado "
                        + "com sucesso !", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                btnAdicionar.setEnabled(true);
                btnEditar.setEnabled(false);
                btnCancelar.setEnabled(false);
                btnSalvar.setEnabled(false);
                btnExcluir.setEnabled(false);

                txtNome.setEnabled(false);
                txtCodigo.setText("");
                txtNome.setText("");
                btnTodosActionPerformed(evt);
            }
        }


}//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarConsultaActionPerformed
        //txtCodigo.setText("");
        //Volta para a tab principal
        jTabbedPane1.setSelectedIndex(0);
}//GEN-LAST:event_btnCancelarConsultaActionPerformed

    private void txtConsultaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultaKeyReleased

        long time = System.currentTimeMillis();

        banco2 = new DB();
        banco2.connect();
        Query carregaArray = new Query(banco2.conn);


        //ILIKE ?? case insensitive para postgresql somente
        carregaArray.open("SELECT codigo,descricao FROM categoriadoleitor "
                + "WHERE sem_acento(descricao) ILIKE'" + txtConsulta.getText().trim() + "%'"
                + " ORDER BY descricao ASC");


        String cod, est;
        vetor = new ArrayList();
        estado = new EstadoDoLivro();

        while (carregaArray.next()) {
            cod = carregaArray.fieldbyname("codigo");
            est = carregaArray.fieldbyname("descricao");


            estado.setCodigo(Integer.parseInt(cod));
            estado.setDescricao(est);
            //Colocar os gets para poder funcionar corretamente
            vetor.add(new EstadoDoLivro(estado.getCodigo(), estado.getDescricao()));

        }

        String[] colunas = {"Categoria do Leitor"};
        //Deixa nulo o vetor de dados
        modelo = new DefaultTableModel(null, colunas) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        Object[][] dados = {null};

        for (int x = 0; x < vetor.size(); x++) {

            modelo.addRow(dados);
            //modelo.setValueAt(((Grupos) vetor.get(x)).getCodigo(), x, 0);
            modelo.setValueAt(((EstadoDoLivro) vetor.get(x)).getDescricao(), x, 0);

        }

        jTable1.setModel(modelo);
        banco2.disconnect();

        //=============================
        time = System.currentTimeMillis() - time;  // ms
        if (modelo.getRowCount() == 0) {
            lblMensagem.setText("Nenhum registro encontrado !");
        } else {
            lblMensagem.setText(modelo.getRowCount() + " registro(s) encontrado(s) ! Tempo gasto em segundos: " + time / 1000.0 + " s");
        }


    }//GEN-LAST:event_txtConsultaKeyReleased

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed

        long time = System.currentTimeMillis();

        banco2 = new DB();
        banco2.connect();
        Query carregaArray = new Query(banco2.conn);


        //ILIKE ?? case insensitive para postgresql somente
        carregaArray.open("SELECT codigo,descricao FROM categoriadoleitor "
                + " ORDER BY descricao ASC");


        String cod, est;
        vetor = new ArrayList();
        estado = new EstadoDoLivro();

        while (carregaArray.next()) {
            cod = carregaArray.fieldbyname("codigo");
            est = carregaArray.fieldbyname("descricao");


            estado.setCodigo(Integer.parseInt(cod));
            estado.setDescricao(est);
            //Colocar os gets para poder funcionar corretamente
            vetor.add(new EstadoDoLivro(estado.getCodigo(), estado.getDescricao()));

        }

        String[] colunas = {"Categoria do Leitor"};
        //Deixa nulo o vetor de dados
        modelo = new DefaultTableModel(null, colunas) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        Object[][] dados = {null};

        for (int x = 0; x < vetor.size(); x++) {

            modelo.addRow(dados);
            //modelo.setValueAt(((Grupos) vetor.get(x)).getCodigo(), x, 0);
            modelo.setValueAt(((EstadoDoLivro) vetor.get(x)).getDescricao(), x, 0);

        }

        jTable1.setModel(modelo);
        banco2.disconnect();
        jTable1.getTableHeader().setReorderingAllowed(false);
        time = System.currentTimeMillis() - time;  // ms
        //=============================
        if (modelo.getRowCount() == 0) {
            lblMensagem.setText("Nenhum registro encontrado !");
        } else {
            lblMensagem.setText(modelo.getRowCount() + " registro(s) encontrado(s) ! Tempo gasto em segundos: " + time / 1000.0 + " s");
        }
}//GEN-LAST:event_btnTodosActionPerformed

    private void btnSelecionaRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionaRegistroActionPerformed
        int i;
        if (jTable1.getRowCount() > 0 && jTable1.getSelectedRow() > -1) {
            for (i = 0; i < vetor.size(); i++) {
                if (((EstadoDoLivro) vetor.get(i)).getDescricao().equals(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0))) {
                    txtCodigo.setText(String.valueOf(((EstadoDoLivro) vetor.get(i)).getCodigo()));

                }
            }

            txtNome.setText(String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0)));
            btnEditar.setEnabled(true);
            btnExcluir.setEnabled(true);
            btnAdicionar.setEnabled(true);
            btnCancelar.setEnabled(false);
            btnSalvar.setEnabled(false);
            jTabbedPane1.setSelectedIndex(0);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione o registro que deseja editar ou excluir!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        }
}//GEN-LAST:event_btnSelecionaRegistroActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int i;
        if (jTable1.getRowCount() > 0 && evt.getClickCount() == 2) {
            for (i = 0; i < vetor.size(); i++) {
                if (((EstadoDoLivro) vetor.get(i)).getDescricao().equals(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0))) {
                    txtCodigo.setText(String.valueOf(((EstadoDoLivro) vetor.get(i)).getCodigo()));

                }
            }

            txtNome.setText(String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0)));
            btnEditar.setEnabled(true);
            btnExcluir.setEnabled(true);
            btnAdicionar.setEnabled(true);
            btnCancelar.setEnabled(false);
            btnSalvar.setEnabled(false);
            jTabbedPane1.setSelectedIndex(0);
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
//        int i;
//        if (jTable1.getRowCount() > 0) {
//            for (i = 0; i < vetor.size(); i++) {
//                if (((Autores) vetor.get(i)).getAutor().equals(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0))) {
//                    txtCodigo.setText(String.valueOf(((Autores) vetor.get(i)).getCodigo()));
//
//                }
//            }
//
//            txtNome.setText(String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0)));
//            btnEditar.setEnabled(true);
//            btnExcluir.setEnabled(true);
//        }
}//GEN-LAST:event_jTable1KeyReleased

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        btnEditar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnExcluir.setEnabled(false);

        txtNome.setEnabled(false);
        txtCodigo.setVisible(false);
        jLabel1.setVisible(false);


    }//GEN-LAST:event_formInternalFrameOpened

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Nenhum registro a ser exclu??do !",
                    "Aviso", JOptionPane.WARNING_MESSAGE);
            txtNome.requestFocus();
        } //Insert
        else {
            //cria um objeto DB apontando para o banco especificado.
            DB banco = new DB();
            //conecta ao banco
            banco.connect();
            //Variavel para verificar se foi executado o comando
            int ri = 0;
            //Insere usando formatacao JAVA
            PreparedStatement st1 = null;
            String sqlInsert = "DELETE FROM categoriadoleitor WHERE codigo=? ";
            try {
                st1 = banco.conn.prepareStatement(sqlInsert);
                st1.setInt(1, Integer.parseInt(txtCodigo.getText().trim()));
                //st1.setString(2, txtNome.getText().trim());
                ri = st1.executeUpdate();
                st1.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Aten????o", JOptionPane.WARNING_MESSAGE);
            }

            if (ri > 0) {
                JOptionPane.showMessageDialog(null, "Registro exclu??do"
                        + " com sucesso", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                btnAdicionar.setEnabled(true);
                btnEditar.setEnabled(false);
                btnCancelar.setEnabled(false);
                btnSalvar.setEnabled(false);
                btnExcluir.setEnabled(false);

                txtNome.setEnabled(false);
                txtCodigo.setText("");
                txtNome.setText("");
            }
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarConsulta;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSelecionaRegistro;
    private javax.swing.JButton btnTodos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblMensagem;
    public javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtConsulta;
    public javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
