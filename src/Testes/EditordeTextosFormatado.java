/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EditordeTextosFormatado.java
 *
 * Created on 13/05/2011, 21:32:54
 */
package Testes;

import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.text.html.MinimalHTMLWriter;

/**
 *
 * @author MARK
 */
public class EditordeTextosFormatado extends javax.swing.JFrame {

    /** Creates new form EditordeTextosFormatado */
    public EditordeTextosFormatado() {
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

        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        btnNegrito = new javax.swing.JButton();
        btnItalico = new javax.swing.JButton();
        btnSublinhado = new javax.swing.JButton();
        cbFonte = new javax.swing.JComboBox();
        cbTamanhodaFonte = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuArquivo = new javax.swing.JMenu();
        SubMenuArquivoAbrir = new javax.swing.JMenuItem();
        SubMenuArquivoSalvar = new javax.swing.JMenuItem();
        SubMenuArquivoSair = new javax.swing.JMenuItem();
        MenuEditar = new javax.swing.JMenu();
        btnRecortar = new javax.swing.JMenuItem();
        btnCopiar = new javax.swing.JMenuItem();
        btnColar = new javax.swing.JMenuItem();
        btnSelecionarTudo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editor de Texto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setBackground(new java.awt.Color(204, 204, 255));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setPreferredSize(new java.awt.Dimension(613, 45));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        btnNegrito.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNegrito.setText("N");
        btnNegrito.setToolTipText("Negrito");
        btnNegrito.setFocusable(false);
        btnNegrito.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNegrito.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnNegrito.setMargin(new java.awt.Insets(2, 10, 2, 14));
        btnNegrito.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNegrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNegritoMouseClicked(evt);
            }
        });

        btnItalico.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnItalico.setText("I");
        btnItalico.setToolTipText("Itálico");
        btnItalico.setFocusable(false);
        btnItalico.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnItalico.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnItalico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnItalico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnItalicoMouseClicked(evt);
            }
        });

        btnSublinhado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSublinhado.setText("S");
        btnSublinhado.setToolTipText("Sublinhado");
        btnSublinhado.setFocusable(false);
        btnSublinhado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSublinhado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSublinhado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSublinhadoMouseClicked(evt);
            }
        });

        cbFonte.setToolTipText("Fonte");
        cbFonte.setMinimumSize(new java.awt.Dimension(100, 100));
        cbFonte.setPreferredSize(new java.awt.Dimension(200, 200));

        cbTamanhodaFonte.setEditable(true);
        cbTamanhodaFonte.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30" }));
        cbTamanhodaFonte.setToolTipText("Tamanho da fonte");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(btnNegrito)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btnItalico)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btnSublinhado)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(cbFonte, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 253, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(cbTamanhodaFonte, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btnNegrito)
                    .add(btnItalico)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(cbFonte, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(cbTamanhodaFonte, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(btnSublinhado))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar1.add(jPanel1);

        jScrollPane1.setViewportView(jTextPane1);

        MenuArquivo.setText("Arquivo");

        SubMenuArquivoAbrir.setText("Abrir");
        SubMenuArquivoAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuArquivoAbrirActionPerformed(evt);
            }
        });
        MenuArquivo.add(SubMenuArquivoAbrir);

        SubMenuArquivoSalvar.setText("Salvar");
        SubMenuArquivoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuArquivoSalvarActionPerformed(evt);
            }
        });
        MenuArquivo.add(SubMenuArquivoSalvar);

        SubMenuArquivoSair.setText("Sair");
        SubMenuArquivoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuArquivoSairActionPerformed(evt);
            }
        });
        MenuArquivo.add(SubMenuArquivoSair);

        jMenuBar1.add(MenuArquivo);

        MenuEditar.setText("Editar");

        btnRecortar.setText("Recortar");
        MenuEditar.add(btnRecortar);

        btnCopiar.setText("Copiar");
        MenuEditar.add(btnCopiar);

        btnColar.setText("Colar");
        MenuEditar.add(btnColar);

        btnSelecionarTudo.setText("Selecionar tudo");
        MenuEditar.add(btnSelecionarTudo);

        jMenuBar1.add(MenuEditar);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jToolBar1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jToolBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNegritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNegritoMouseClicked
       if(btnNegrito.isEnabled()==true){
           btnNegrito.setEnabled(false);
               StyledDocument doc = (StyledDocument) jTextPane1.getStyledDocument();
// Cria um estilo do objeto depois define os atributos do estilo
        Style style = doc.addStyle("StyleName", null);

        //Negrito
        StyleConstants.setBold(style, true);
//       //Itálico
//       StyleConstants.setItalic(style, true);
//       //Sublinhado
//       StyleConstants.setUnderline(style, true);
        if (!jTextPane1.getText().trim().equals("")) {
            //Anexar no documento
            //offset=posição
            //len=tamanho
            //setar o texto
            doc.setCharacterAttributes(jTextPane1.getSelectionStart(), jTextPane1.getSelectedText().length(), style, true);
        }
       }
       //Retira o negrito
       else{
           btnNegrito.setEnabled(true);
               StyledDocument doc = (StyledDocument) jTextPane1.getStyledDocument();
// Cria um estilo do objeto depois define os atributos do estilo
        Style style = doc.addStyle("StyleName", null);

        //Negrito
        StyleConstants.setBold(style, false);
//       //Itálico
//       StyleConstants.setItalic(style, true);
//       //Sublinhado
//       StyleConstants.setUnderline(style, true);
        if (!jTextPane1.getText().trim().equals("")) {
            //Anexar no documento
            //offset=posição
            //len=tamanho
            //setar o texto
            doc.setCharacterAttributes(jTextPane1.getSelectionStart(), jTextPane1.getSelectedText().length(), style, true);
        }
       }
    }//GEN-LAST:event_btnNegritoMouseClicked

    private void btnItalicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnItalicoMouseClicked
         if(btnItalico.isEnabled()==true){
           btnItalico.setEnabled(false);
               StyledDocument doc = (StyledDocument) jTextPane1.getStyledDocument();
// Cria um estilo do objeto de depois define os atributos do estilo
        Style style = doc.addStyle("StyleName", null);

        //Itálico
        StyleConstants.setItalic(style, true);
        if (!jTextPane1.getText().trim().equals("")) {
            //Anexar no documento
            //offset=posição
            //len=tamanho
            //setar o texto
            doc.setCharacterAttributes(jTextPane1.getSelectionStart(), jTextPane1.getSelectedText().length(), style, true);
        }
       }
       //Retira o itálico
       else{
           btnItalico.setEnabled(true);
               StyledDocument doc = (StyledDocument) jTextPane1.getStyledDocument();
// Cria um estilo do objeto de depois define os atributos do estilo
        Style style = doc.addStyle("StyleName", null);

        //Itálico
        StyleConstants.setItalic(style, false);

        if (!jTextPane1.getText().trim().equals("")) {
            //Anexar no documento
            //offset=posição
            //len=tamanho
            //setar o texto
            doc.setCharacterAttributes(jTextPane1.getSelectionStart(), jTextPane1.getSelectedText().length(), style, true);
        }
       }
    }//GEN-LAST:event_btnItalicoMouseClicked

    private void btnSublinhadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSublinhadoMouseClicked
              if(btnSublinhado.isEnabled()==true){
           btnSublinhado.setEnabled(false);
               StyledDocument doc = (StyledDocument) jTextPane1.getStyledDocument();
// Cria um estilo do objeto de depois define os atributos do estilo
        Style style = doc.addStyle("StyleName", null);

        //Sublinhado
        StyleConstants.setUnderline(style, true);
//       //Sublinhado
//       StyleConstants.setItalic(style, true);
        if (!jTextPane1.getText().trim().equals("")) {
            //Anexar no documento
            //offset=posição
            //len=tamanho
            //setar o texto
            doc.setCharacterAttributes(jTextPane1.getSelectionStart(), jTextPane1.getSelectedText().length(), style, true);
        }
       }
       //Retira o sublinhado
       else{
           btnSublinhado.setEnabled(true);
               StyledDocument doc = (StyledDocument) jTextPane1.getStyledDocument();
// Cria um estilo do objeto de depois define os atributos do estilo
        Style style = doc.addStyle("StyleName", null);

        //Negrito
        StyleConstants.setItalic(style, false);
        if (!jTextPane1.getText().trim().equals("")) {
            //Anexar no documento
            //offset=posição
            //len=tamanho
            //setar o texto
            doc.setCharacterAttributes(jTextPane1.getSelectionStart(), jTextPane1.getSelectedText().length(), style, true);
        }
       }
    }//GEN-LAST:event_btnSublinhadoMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    //Pega todas as fontes disponíveis 
        String listaDeFontes[]=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for(int i=0;i<listaDeFontes.length;i++){        
         cbFonte.addItem(listaDeFontes[i]);
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void SubMenuArquivoAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuArquivoAbrirActionPerformed
      AbrirArquivo a= new AbrirArquivo();
      a.actionPerformed(evt);
    }//GEN-LAST:event_SubMenuArquivoAbrirActionPerformed

    private void SubMenuArquivoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuArquivoSalvarActionPerformed
     SalvarComoHTML s = new SalvarComoHTML();
     s.actionPerformed(evt);
    }//GEN-LAST:event_SubMenuArquivoSalvarActionPerformed

    private void SubMenuArquivoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuArquivoSairActionPerformed
       System.exit(0);
    }//GEN-LAST:event_SubMenuArquivoSairActionPerformed
//Abrir html
    // An action that opens an existing file
  class AbrirArquivo extends AbstractAction {
    public AbrirArquivo() {
      super("Open", new ImageIcon("icons/open.gif"));
    }

    // Query user for a filename and attempt to open and read the file into the
    // text component.
    public void actionPerformed(ActionEvent ev) {
      JFileChooser chooser = new JFileChooser();
      if (chooser.showOpenDialog(EditordeTextosFormatado.this) !=
          JFileChooser.APPROVE_OPTION)
        return;
      File file = chooser.getSelectedFile();
      if (file == null)
        return;

      FileReader reader = null;
      try {
        reader = new FileReader(file);
        jTextPane1.setContentType("text/html");
        jTextPane1.read(reader, null);        
      }
      catch (IOException ex) {
        JOptionPane.showMessageDialog(EditordeTextosFormatado.this,
        "Arquivo nào encontrado", "ERRO", JOptionPane.ERROR_MESSAGE);
      }
      finally {
        if (reader != null) {
          try {
            reader.close();
          } catch (IOException x) {}
        }
      }
    }
  }
//Salvar como HTML-------------------------------------------------------------
         class SalvarComoHTML extends AbstractAction {
    public SalvarComoHTML() {
      super("Salvar", null);
    }

    // Query user for a filename and attempt to open and write the text
    // component's content to the file.
    public void actionPerformed(ActionEvent ev) {
      JFileChooser chooser = new JFileChooser();
      if (chooser.showSaveDialog(EditordeTextosFormatado.this) !=
            JFileChooser.APPROVE_OPTION)
        return;
      File file = chooser.getSelectedFile();
      if (file == null)
        return;
      FileWriter writer = null;
      try {
        writer = new FileWriter(file);
          MinimalHTMLWriter htmlWriter = new MinimalHTMLWriter(writer,
            jTextPane1.getStyledDocument());         
        htmlWriter.write();     
      }
      catch (IOException ex) {
        JOptionPane.showMessageDialog(EditordeTextosFormatado.this,
            "Arquivo HTML não salvo", "ERRO", JOptionPane.ERROR_MESSAGE);
      }
      catch (BadLocationException ex) {
        JOptionPane.showMessageDialog(EditordeTextosFormatado.this,
            "Arquivo HTML corrompido", "ERRO", JOptionPane.ERROR_MESSAGE);
      }
      finally {
        if (writer != null) {
          try {
            writer.close();
          } catch (IOException x) {}
        }
      }
    }
  }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new EditordeTextosFormatado().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuArquivo;
    private javax.swing.JMenu MenuEditar;
    private javax.swing.JMenuItem SubMenuArquivoAbrir;
    private javax.swing.JMenuItem SubMenuArquivoSair;
    private javax.swing.JMenuItem SubMenuArquivoSalvar;
    private javax.swing.JMenuItem btnColar;
    private javax.swing.JMenuItem btnCopiar;
    private javax.swing.JButton btnItalico;
    private javax.swing.JButton btnNegrito;
    private javax.swing.JMenuItem btnRecortar;
    private javax.swing.JMenuItem btnSelecionarTudo;
    private javax.swing.JButton btnSublinhado;
    private javax.swing.JComboBox cbFonte;
    private javax.swing.JComboBox cbTamanhodaFonte;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}