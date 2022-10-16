/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import FormsConsulta.MkTableModel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;

/**
 *
 * @author MARK
 */
public class Funcoes {

    FileReader reader = null;
    BufferedReader leitor = null;
    public Object retNome;

    /*Limpar campos*/
    public void limparCampos(Container container) {
        Component components[] = container.getComponents();
        for (Component component : components) {
            if (component instanceof JFormattedTextField) {
                JFormattedTextField field = (JFormattedTextField) component;
                field.setValue(null);
            } else if (component instanceof JTextField) {
                JTextField field = (JTextField) component;
                field.setText("");               
            } else if (component instanceof JTextArea) {
                JTextArea area = (JTextArea) component;
                area.setText("");
            } else if(component instanceof JCheckBox){
                JCheckBox checkbox = (JCheckBox) component;
                checkbox.setSelected(false);
            }

//                else if (component instanceof JComboBox) {
////                JComboBox combo = (JComboBox) component;
////                combo.setSelectedIndex(-1);
////            }
        }
    }

    //========================================================
      /* Container (Nome do controle) */
    /* Parâmetro b(verdadeiro-falso) */
    public void ativarCampos(Container container, boolean b) {
        Component components[] = container.getComponents();
        for (Component component : components) {
            if (component instanceof JFormattedTextField) {
                JFormattedTextField field = (JFormattedTextField) component;
                field.setEnabled(b);
                field.setDisabledTextColor(Color.black);
            } else if (component instanceof JTextField) {
                JTextField field = (JTextField) component;
                field.setEnabled(b);
                field.setDisabledTextColor(Color.black);

            } else if (component instanceof JTextArea) {
                JTextArea area = (JTextArea) component;
                area.setEnabled(b);
                area.setDisabledTextColor(Color.black);
            } else if (component instanceof JComboBox) {
                JComboBox combo = (JComboBox) component;
                combo.setEnabled(b);           
            } else if (component instanceof JButton) {
                JButton button = (JButton) component;
                button.setEnabled(b);
            }
        }
    }
    //========================================================
      /*Função Ler arquivo txt*/
    /*Parâmetros (nome do arquivo.txt,posicao para pegar a partir de lá)*/

    public String LerArquivoTXT(String nomeArquivo, int posicaoINString, int posicaoFIMString) {
        String campo = "";
        try {

            reader = new FileReader(new File(nomeArquivo));
            leitor = new BufferedReader(reader);

            campo = leitor.readLine().substring(posicaoINString, posicaoFIMString);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        return campo;
    }

    /*Fecha a leitura do arquivo TXT*/
    public void closeTXT() {
        try {
            //Fecha a leitura
            reader.close();
            leitor.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
        }

    }

    //=============================================================
    /**
     * Converte uma String para um objeto Date. Caso a String seja vazia ou nula,
     * retorna null - para facilitar em casos onde formulários podem ter campos
     * de datas vazios.
     * @param data String no formato dd/MM/yyyy a ser formatada
     * @return Date Objeto Date ou null caso receba uma String vazia ou nula
     * @throws Exception Caso a String esteja no formato errado
     */
    public static Date formataData(String data) throws Exception {
        if (data == null || data.equals("")) {
            return null;
        }

        Date date = null;
        try {
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            date = (java.util.Date) formatter.parse(data);
        } catch (ParseException e) {
            throw e;
        }
        return date;
    }

    public void SelecionaItemNaJCombo(String item, JComboBox combo) {
        combo.setSelectedItem(item);
    }

    public void MaximizarForm(JDialog jd) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        jd.setSize(screenSize.width, screenSize.height);
        jd.setLocation(0, 0);
        jd.setVisible(true);

    }

    public void eliminarItens(javax.swing.JTable table) {
        int i;
        int j;
        MkTableModel model = (MkTableModel) table.getModel();
        //-- Percorrer todos os ítens
        for (i = 0; i < table.getRowCount(); i++) {
            //-- Comparar um a um com todos os demais
            for (j = i + 1; j < table.getRowCount(); j++) {
                //-- Se for igual, eliminar
                model.removeRow(j);
                j = j - 1;
            }
        }
    }
}

