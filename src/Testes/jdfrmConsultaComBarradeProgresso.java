/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * jdfrmConsultaAutores.java
 *
 * Created on 14/01/2011, 18:09:07
 */
package Testes;

import Classes2.Autores;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ProgressMonitor;
import javax.swing.table.DefaultTableModel;
import Classes.DB;
import Classes.Query;

/**
 *
 * @author MARK
 */
public class jdfrmConsultaComBarradeProgresso extends javax.swing.JDialog {

    private DB banco2;
    private DefaultTableModel modelo;
    private ArrayList vetor;
    Autores autor;
    private String nome;
    public boolean okSelecionado;

    private ProgressMonitor progressMonitor;

    /** Creates new form jdfrmConsultaAutores */
    public jdfrmConsultaComBarradeProgresso(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblMensagem = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnCancelarConsulta = new javax.swing.JButton();
        txtConsulta = new javax.swing.JTextField();
        btnTodos = new javax.swing.JButton();
        btnSelecionaRegistro = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta Autor");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Registros"));
        jPanel6.setPreferredSize(new java.awt.Dimension(609, 227));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"AAAAA", null, null},
                {"BBBBBBAsddskjnKSNDkjsndkJNASKDJNKjnsd", null, null},
                {"CCCCCC", null, null},
                {"DDDDDDDDAASSDD", null, null},
                {"EEEEEEEEE", null, null},
                {"FFFFFFFFFFASDGJAHGSJDHAGSJDHG", null, null}
            },
            new String [] {
                "Título 1", "Título 2", "Título 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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

        org.jdesktop.layout.GroupLayout jPanel6Layout = new org.jdesktop.layout.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6Layout.createSequentialGroup()
                .add(jScrollPane3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblMensagem.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblMensagem.setForeground(java.awt.Color.blue);
        lblMensagem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMensagem.setToolTipText("");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Consulta por nome"));

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

        jProgressBar1.setMinimum(1);
        jProgressBar1.setToolTipText("");
        jProgressBar1.setStringPainted(true);

        org.jdesktop.layout.GroupLayout jPanel7Layout = new org.jdesktop.layout.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(txtConsulta, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                    .add(jPanel7Layout.createSequentialGroup()
                        .add(btnTodos)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnCancelarConsulta)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnSelecionaRegistro)
                        .add(18, 18, 18)
                        .add(jProgressBar1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .add(txtConsulta, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jProgressBar1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, btnCancelarConsulta, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, btnTodos, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, btnSelecionaRegistro, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(21, 21, 21))
        );

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 27, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 48, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jPanel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, lblMensagem, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)))
                    .add(layout.createSequentialGroup()
                        .add(157, 157, 157)
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 277, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(lblMensagem, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-661)/2, (screenSize.height-508)/2, 661, 508);
    }// </editor-fold>//GEN-END:initComponents

    public String getNome() {
        nome = jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0).toString();
        return nome;
    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (jTable1.isRowSelected(jTable1.getSelectedRow())) {
            okSelecionado = true;
        } else {
            okSelecionado = false;
        }
        if (evt.getClickCount() == 2) {
            this.dispose();
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
}//GEN-LAST:event_jTable1KeyReleased

    private void btnCancelarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarConsultaActionPerformed
//        //Fechamos a janela diretamente.
//        //Não há necessidade de dizer que o ok não foi selecionado.
//        setVisible(false);
        int maxWidth = 0;
for(int i = 0; i < jTable1.getRowCount(); i++)
{
  Object cellValue = jTable1.getValueAt(i, 0);
  if(cellValue != null){
  maxWidth = Math.max(jTable1.getCellRenderer(i, 0).getTableCellRendererComponent
          (jTable1, cellValue, false, false, i, 0).getPreferredSize().
          width + jTable1.getIntercellSpacing().width, maxWidth);
  }
     
}
//jTable1.getColumnModel().getColumn(0).setWidth(maxWidth);
//jTable1.getColumnModel().getColumn(0).setMaxWidth(maxWidth);
jTable1.getColumnModel().getColumn(0).setPreferredWidth(maxWidth);
}//GEN-LAST:event_btnCancelarConsultaActionPerformed

    private void txtConsultaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultaKeyReleased

        banco2 = new DB();
        banco2.connect();
        Query carregaArray = new Query(banco2.conn);


        //ILIKE é case insensitive para postgresql somente
        carregaArray.open("SELECT codigo,autor FROM cadautores WHERE sem_acento(autor) ILIKE'" + txtConsulta.getText().trim() + "%'"
                + " ORDER BY autor ASC");


        String cod, gp;
        vetor = new ArrayList();
        autor = new Autores();

        while (carregaArray.next()) {
            cod = carregaArray.fieldbyname("codigo");
            gp = carregaArray.fieldbyname("autor");


            autor.setCodigo(Integer.parseInt(cod));
            autor.setAutor(gp);
            //Colocar os gets para poder funcionar corretamente
            vetor.add(new Autores(autor.getCodigo(), autor.getAutor()));

        }

        String[] colunas = {"Autor","booleano"};
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
            modelo.setValueAt(((Autores) vetor.get(x)).getAutor(), x, 0);

        }

        jTable1.setModel(modelo);
        banco2.disconnect();

        //=============================
        if (modelo.getRowCount() == 0) {
            lblMensagem.setText("Nenhum registro encontrado !");
        } else {
            lblMensagem.setText(modelo.getRowCount() + " registro(s) encontrado(s) !");
        }
    }//GEN-LAST:event_txtConsultaKeyReleased

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
       
        banco2 = new DB();
        banco2.connect();
        Query carregaArray = new Query(banco2.conn);


        //ILIKE é case insensitive para postgresql somente
        carregaArray.open("SELECT codigo,autor FROM cadautores "
                + " ORDER BY autor ASC");


        String cod, gp;
        vetor = new ArrayList();
        autor = new Autores();

        while (carregaArray.next()) {
            cod = carregaArray.fieldbyname("codigo");
            gp = carregaArray.fieldbyname("autor");


            autor.setCodigo(Integer.parseInt(cod));
            autor.setAutor(gp);
            //Colocar os gets para poder funcionar corretamente
            vetor.add(new Autores(autor.getCodigo(), autor.getAutor()));

        }

        String[] colunas = {"Autor"};
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
            modelo.setValueAt(((Autores) vetor.get(x)).getAutor(), x, 0);

        }

        jTable1.setModel(modelo);
        banco2.disconnect();

        //=============================
        if (modelo.getRowCount() == 0) {
            lblMensagem.setText("Nenhum registro encontrado !");
        } else {
            lblMensagem.setText(modelo.getRowCount() + " registro(s) encontrado(s) !");
        }
}//GEN-LAST:event_btnTodosActionPerformed

    private void btnSelecionaRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionaRegistroActionPerformed

        if (jTable1.isRowSelected(jTable1.getSelectedRow()) && okSelecionado == true) {
            this.dispose();
        }

}//GEN-LAST:event_btnSelecionaRegistroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                jdfrmConsultaComBarradeProgresso dialog = new jdfrmConsultaComBarradeProgresso(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarConsulta;
    private javax.swing.JButton btnSelecionaRegistro;
    private javax.swing.JButton btnTodos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTable jTable1;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JTextField txtConsulta;
    // End of variables declaration//GEN-END:variables
}
