/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ifrmCadEditora.java
 *
 * Created on 18/09/2010, 11:05:57
 */
package Forms;

import java.awt.AWTKeyStroke;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Classes.DB;
import Classes.FixedLengthDocument;
import Classes.Funcoes;
import Classes.Query;

/**
 *
 * @author MARK
 */
public class ifrmCadBiblioteca extends javax.swing.JInternalFrame {

    private boolean novoCadastro;
    Funcoes f;

    /** Creates new form ifrmCadEditora */
    public ifrmCadBiblioteca() {
        initComponents();
        txtNome.setDocument(new FixedLengthDocument(40));
        txtEndereco.setDocument(new FixedLengthDocument(40));
        txtNumero.setDocument(new FixedLengthDocument(5));
//        txtCep.setDocument(new FixedLengthDocument(9));
//        txtTelefone.setDocument(new FixedLengthDocument(13));
        txtRamal.setDocument(new FixedLengthDocument(5));
        txtEmail.setDocument(new FixedLengthDocument(50));
        txtSite.setDocument(new FixedLengthDocument(50));

        //Validação de campos


        // Colocando enter para pular de campo
        HashSet conj = new HashSet(this.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
        conj.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));
        this.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        cbUf = new javax.swing.JComboBox();
        cbCidade = new javax.swing.JComboBox();
        cbBairro = new javax.swing.JComboBox();
        txtEmail = new javax.swing.JTextField();
        txtSite = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCep = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtRamal = new javax.swing.JFormattedTextField();
        jToolBar1 = new javax.swing.JToolBar();
        btnAdicionar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro da Biblioteca");
        setMinimumSize(new java.awt.Dimension(500, 327));
        setPreferredSize(new java.awt.Dimension(560, 350));
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setEnabled(false);

        jLabel2.setText("Nome:");

        jLabel1.setText("Código:");
        jLabel1.setEnabled(false);

        txtCodigo.setEditable(false);

        cbUf.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbUfItemStateChanged(evt);
            }
        });
        cbUf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbUfFocusLost(evt);
            }
        });

        cbCidade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCidadeItemStateChanged(evt);
            }
        });

        jLabel3.setText("Endereço:");

        jLabel4.setText("Nº:");

        jLabel5.setText("UF:");

        jLabel6.setText("Cidade:");

        jLabel7.setText("Bairro:");

        jLabel8.setText("CEP:");

        jLabel9.setText("Telefone:");

        jLabel10.setText("E-mail:");

        jLabel11.setText("Site:");

        jLabel12.setText("Ramal:");

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtRamal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####0"))));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbUf, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cbBairro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSite)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRamal, 0, 0, Short.MAX_VALUE))
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .addComponent(txtNome))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(cbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRamal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(0, 42, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, 0, 524, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-560)/2, (screenSize.height-350)/2, 560, 350);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed

        // Botões
        btnAdicionar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnExcluir.setEnabled(false);
        txtNome.requestFocus();//Põe o foco no controle nome
//        f.limparCampos(jPanel1);
        f.ativarCampos(jPanel1, true);

        //=================================================

        //cria um objeto MysqlDB apontando para o banco especificado.
        DB banco = new DB();
        banco.connect();
        int max1 = -1;

        //conecta ao banco
        Query query1 = new Query(banco.conn);
        //Cria um objeto do tipo query chamado query1 que recebe
        //como argumento o  objeto banco.

        try {
            String sql = " SELECT MAX(Codigo)As Codigo FROM cadbiblioteca";
            query1.open(sql); //executa uma sentença sql.
            query1.next();
            //            int i;
            //            int r;
            //            String max = null;
            max1 = query1.rs.getInt(1);

            //txtCodigo.setText((query1.fieldbyname("Codigo")));
            //            i = Integer.parseInt(max);
            //            r = i + 1;
            //            int n = r;

            banco.disconnect();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e.getMessage());
        } finally {
            try {
                query1.rs.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro resultset: " + ex.getMessage());
            }
        }

        //String zeros = "00000";
        //String numero = zeros + n;
        //numero = numero.substring(numero.length() - 5);
        //System.out.println(numero.substring(numero.length() - 5));

        txtCodigo.setText(String.valueOf(max1 + 1));
        novoCadastro = true;
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        btnAdicionar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnExcluir.setEnabled(false);
        f.ativarCampos(jPanel1, true);

        novoCadastro = false;

}//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        if (txtCodigo.getText().equals("1")) {
            formInternalFrameOpened(null);
            btnAdicionar.setEnabled(false);
            btnEditar.setEnabled(true);
            btnCancelar.setEnabled(false);
            btnSalvar.setEnabled(false);
            btnExcluir.setEnabled(true);
            f.ativarCampos(jPanel1, false);
            

        } else if (txtCodigo.getText().equals("")) {
            btnAdicionar.setEnabled(true);
            btnEditar.setEnabled(false);
            btnCancelar.setEnabled(false);
            btnSalvar.setEnabled(false);
            btnExcluir.setEnabled(false);
            f.ativarCampos(jPanel1, false);
//        novoCadastro = false;
        }
        novoCadastro = false;


}//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome !",
                    "Aviso", JOptionPane.WARNING_MESSAGE);
            txtNome.requestFocus();
        }  //Insert
        else if (novoCadastro == true) {
            //cria um objeto DB apontando para o banco especificado.
            DB banco = new DB();
            //conecta ao banco
            banco.connect();
            //Variavel para verificar se foi executado o comando
            int ri = 0;
            //Insere usando formatacao JAVA
            PreparedStatement st1 = null;
            String sqlInsert = "INSERT INTO cadbiblioteca"
                    + "(codigo,nome,endereco,numero,uf,cidade,bairro,cep,telefone,"
                    + "ramal,email,site) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
            try {
                st1 = banco.conn.prepareStatement(sqlInsert);
                st1.setInt(1, Integer.parseInt(txtCodigo.getText().trim()));
                st1.setString(2, txtNome.getText().trim());
                st1.setString(3, txtEndereco.getText().trim());
                st1.setInt(4, Integer.parseInt(txtNumero.getText().trim()));
                st1.setString(5, cbUf.getSelectedItem().toString());
                st1.setString(6, cbCidade.getSelectedItem().toString());
                st1.setString(7, cbBairro.getSelectedItem().toString());
                st1.setString(8, txtCep.getText().trim());
                st1.setString(9, txtTelefone.getText().trim());
                st1.setString(10, txtRamal.getText().trim());
                st1.setString(11, txtEmail.getText().trim());
                st1.setString(12, txtSite.getText().trim());
                ri = st1.executeUpdate();
                st1.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);

            }
//            try {
//                ri = st1.executeUpdate();
//                st1.close();
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
//            }

            if (ri > 0) {
                JOptionPane.showMessageDialog(null, "Registro adicionado"
                        + " com sucesso !", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                btnAdicionar.setEnabled(false);
                btnEditar.setEnabled(true);
                btnCancelar.setEnabled(false);
                btnSalvar.setEnabled(false);
                btnExcluir.setEnabled(true);
                f.ativarCampos(jPanel1, false);
            }
        } //senão Update
        else if (novoCadastro == false) {
            //cria um objeto DB apontando para o banco especificado.
            DB banco = new DB();
            banco.connect();
            //conecta ao banco
            int ru = 0;
            //Atualiza usando formatacao JAVA
            PreparedStatement st1 = null;
            String sqlUpdate = "UPDATE cadbiblioteca SET nome=?,endereco=?,"
                    + "numero=?,uf=?,cidade=?,bairro=?,cep=?,telefone=?,"
                    + "ramal=?,email=?,site=? "
                    + "WHERE codigo=?";
            try {
                st1 = banco.conn.prepareStatement(sqlUpdate);

                st1.setString(1, txtNome.getText().trim());
                st1.setString(2, txtEndereco.getText().trim());
                st1.setInt(3, Integer.parseInt(txtNumero.getText().trim()));
                st1.setString(4, cbUf.getSelectedItem().toString());
                st1.setString(5, cbCidade.getSelectedItem().toString());
                st1.setString(6, cbBairro.getSelectedItem().toString());
                st1.setString(7, txtCep.getText().trim());
                st1.setString(8, txtTelefone.getText().trim());
                st1.setString(9, txtRamal.getText().trim());
                st1.setString(10, txtEmail.getText().trim());
                st1.setString(11, txtSite.getText().trim());
                st1.setInt(12, Integer.parseInt(txtCodigo.getText().trim()));

                ru = st1.executeUpdate();
                st1.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
            }
            if (ru > 0) {
                JOptionPane.showMessageDialog(null, "Registro atualizado "
                        + "com sucesso !", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                btnAdicionar.setEnabled(false);
                btnEditar.setEnabled(true);
                btnCancelar.setEnabled(false);
                btnSalvar.setEnabled(false);
                btnExcluir.setEnabled(true);
                f.ativarCampos(jPanel1, false);
            }
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (txtNome.getText().equals("")||txtCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Nenhum registro a ser excluído !",
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
            String sqlInsert = "DELETE FROM cadbiblioteca WHERE codigo=? ";
            try {
                st1 = banco.conn.prepareStatement(sqlInsert);
                st1.setInt(1, Integer.parseInt(txtCodigo.getText().trim()));
                //st1.setString(2, txtNome.getText().trim());
                ri = st1.executeUpdate();
                st1.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
            }

            if (ri > 0) {
                JOptionPane.showMessageDialog(null, "Registro excluído"
                        + " com sucesso", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                btnAdicionar.setEnabled(true);
                btnEditar.setEnabled(false);
                btnCancelar.setEnabled(false);
                btnSalvar.setEnabled(false);
                btnExcluir.setEnabled(false);
                f.limparCampos(jPanel1);

                cbCidade.removeAllItems();
                cbBairro.removeAllItems();
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

        DB banco = new DB();
        banco.connect();
        //Carrega uf
        Query carregaUf = new Query(banco.conn);
        String sqlUf = "SELECT descricao FROM uf";
        carregaUf.open(sqlUf);
        String Uf;
        while (carregaUf.next()) {

            Uf = carregaUf.fieldbyname("descricao");
            cbUf.addItem(Uf);
        }

        jLabel1.setVisible(false);
        txtCodigo.setVisible(false);

        f = new Funcoes();
        //cria um objeto MysqlDB apontando para o banco especificado.


        int max1 = -1;

        //conecta ao banco
        Query query1 = new Query(banco.conn);

        //Cria um objeto do tipo query chamado query1 que recebe
        //como argumento o  objeto banco.

        try {
            String sql = " SELECT MAX(Codigo)As Codigo FROM cadbiblioteca";
            query1.open(sql); //executa uma sentença sql.
            query1.next();

            max1 = query1.rs.getInt(1);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e.getMessage());
        } finally {
            try {
                query1.rs.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro resultset: " + ex.getMessage());
            }
        }

        //Se já tiver cadastro
        if (max1 == 1) {
            txtCodigo.setText(String.valueOf(max1));
            novoCadastro = false;
            // Botões
            btnAdicionar.setEnabled(false);
            btnEditar.setEnabled(true);
            btnCancelar.setEnabled(false);
            btnSalvar.setEnabled(false);
            btnExcluir.setEnabled(true);
            f.ativarCampos(jPanel1, false);

            Query consulta = new Query(banco.conn);
            consulta.open("SELECT nome,endereco,numero,uf,cidade,bairro,"
                    + "cep,telefone,ramal,email,site FROM cadbiblioteca "
                    + "WHERE codigo=" + txtCodigo.getText());
            String nome = null, endereco = null, numero = null, uf = null, cidade = null, bairro = null,
                    cep = null, telefone = null, ramal = null, email = null, site = null;
            if (consulta.next()) {
                nome = consulta.fieldbyname("nome");
                endereco = consulta.fieldbyname("endereco");
                numero = consulta.fieldbyname("numero");
                uf = consulta.fieldbyname("uf");
                cidade = consulta.fieldbyname("cidade");
                bairro = consulta.fieldbyname("bairro");
                cep = consulta.fieldbyname("cep");
                telefone = consulta.fieldbyname("telefone");
                ramal = consulta.fieldbyname("ramal");
                email = consulta.fieldbyname("email");
                site = consulta.fieldbyname("site");


            }
            txtNome.setText(nome);
            txtEndereco.setText(endereco);
            txtNumero.setText(numero);
            cbUf.setSelectedItem(uf);
            cbCidade.setSelectedItem(cidade);
            cbBairro.setSelectedItem(bairro);
            txtCep.setText(cep);
            txtTelefone.setText(telefone);
            txtRamal.setText(ramal);
            txtEmail.setText(email);
            txtSite.setText(site);

            banco.disconnect();

        } //Se não tiver registro, habilita o botão de adicionar
        else if (max1 == 0) {
            novoCadastro = true;
            // Botões
            btnAdicionar.setEnabled(true);
            btnEditar.setEnabled(false);
            btnCancelar.setEnabled(false);
            btnSalvar.setEnabled(false);
            btnExcluir.setEnabled(false);
            f.ativarCampos(jPanel1, false);

        }


    }//GEN-LAST:event_formInternalFrameOpened

    private void cbCidadeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCidadeItemStateChanged
        //Carrega os bairros de acordo com a cidade
        DB banco = new DB();
        banco.connect();
        Query carregaBairro = new Query(banco.conn);
        String sql = "SELECT bairro.descricao AS descricao"
                + " FROM bairro,cidade"
                + " WHERE bairro.cidade_idcidade=cidade.idcidade AND cidade.descricao='" + cbCidade.getSelectedItem() + "'";
        carregaBairro.open(sql);
        String cidade;
        cbBairro.removeAllItems();
        while (carregaBairro.next()) {
//            codigo=carregaUf.fieldbyname("idcidade");
//            iduf=carregaUf.fieldbyname("iduf");
            cidade = carregaBairro.fieldbyname("descricao");
            cbBairro.addItem(cidade);
        }
        banco.disconnect();
    }//GEN-LAST:event_cbCidadeItemStateChanged

    private void cbUfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbUfFocusLost
        //Carrega as cidades de acordo com o Estado
        DB banco = new DB();
        banco.connect();
        Query carregaUf = new Query(banco.conn);
        String sqlCidade = "SELECT cidade.descricao AS descricaoC"
                + " FROM cidade,uf"
                + " WHERE cidade.uf_iduf=uf.iduf AND uf.descricao='" + cbUf.getSelectedItem().toString() + "'";
        carregaUf.open(sqlCidade);
        String cidade;
        cbCidade.removeAllItems();
        while (carregaUf.next()) {
//            codigo=carregaUf.fieldbyname("idcidade");
//            iduf=carregaUf.fieldbyname("iduf");
            cidade = carregaUf.fieldbyname("descricaoC");
            cbCidade.addItem(cidade);
        }
        banco.disconnect();
    }//GEN-LAST:event_cbUfFocusLost

    private void cbUfItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbUfItemStateChanged
        //Carrega as cidades de acordo com o Estado
        DB banco = new DB();
        banco.connect();
        Query carregaUf = new Query(banco.conn);
        String sqlCidade = "SELECT cidade.descricao AS descricaoC"
                + " FROM cidade,uf"
                + " WHERE cidade.uf_iduf=uf.iduf AND uf.descricao='" + cbUf.getSelectedItem().toString() + "'";
        carregaUf.open(sqlCidade);
        String cidade;
//        if(cbCidade.getModel().getSize()>0){
        cbCidade.removeAllItems();
//        }

        while (carregaUf.next()) {
//            codigo=carregaUf.fieldbyname("idcidade");
//            iduf=carregaUf.fieldbyname("iduf");
            cidade = carregaUf.fieldbyname("descricaoC");
            cbCidade.addItem(cidade);
        }
        banco.disconnect();
    }//GEN-LAST:event_cbUfItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbBairro;
    private javax.swing.JComboBox cbCidade;
    private javax.swing.JComboBox cbUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JFormattedTextField txtCep;
    public javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    public javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JFormattedTextField txtRamal;
    private javax.swing.JTextField txtSite;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
