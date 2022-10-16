/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FormsConsulta;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MARK
 */
public class MkTableModel2 extends AbstractTableModel {

    private ArrayList linhas = null;
    private String[] colunas = null;

    public String[] getColunas() {
        return colunas;
    }

    public ArrayList getLinhas() {
        return linhas;
    }

    public void setColunas(String[] strings) {
        colunas = strings;
    }

    public void setLinhas(ArrayList list) {
        linhas = list;
    }

    /**
     * Retorna o numero de colunas no modelo
     * @see javax.swing.table.TableModel#getColumnCount()
     */
    public int getColumnCount() {
        return getColunas().length;
    }

    /**
     * Retorna o numero de linhas existentes no modelo
     * @see javax.swing.table.TableModel#getRowCount()
     */
    public int getRowCount() {
        return getLinhas().size();
    }
    /*Retorna o nome da coluna*/
//Usado paa mostra o nome nas colunas da jTable
    public String getColumnName(int col) {
        return colunas[col];
    }

    /**
     * Obtem o valor na linha e coluna
     * @see javax.swing.table.TableModel#getValueAt(int, int)
     */
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Obtem a linha, que é uma String []
        String[] linha = (String[]) getLinhas().get(rowIndex);
//        // Retorna o objeto que esta na coluna
        return linha[columnIndex];

    }
//Alterar o conteúdo do modelo, tem que setar também o setValueAt
    private boolean[] colsEdicao;

    public boolean isCellEditable(int row, int col) {
        return colsEdicao[col];
//    return false;
    }

    /**
     * Seta o valor na linha e coluna
     * @see javax.swing.table.TableModel#setValueAt(java.lang.Object, int, int)
     */
    public void setValueAt(Object value, int row, int col) {
        // Obtem a linha, que é uma String []
        String[] linha = (String[]) getLinhas().get(row);
        // Altera o conteudo no indice da coluna passado
        linha[col] = (String) value;
        // dispara o evento de celula alterada
        fireTableCellUpdated(row, col);

    }

    public void addRow(String[] dadosLinha) {
        getLinhas().add(dadosLinha);
        // Informa a jtable de que houve linhas incluidas no modelo
        // COmo adicionamos no final, pegamos o tamanho total do modelo
        // menos 1 para obter a linha incluida.
        int linha = getLinhas().size() - 1;
        this.fireTableRowsInserted(linha, linha);
        return;
    }

    public void removeRow(int row) {
        getLinhas().remove(row);
        // informa a jtable que houve dados deletados passando a
        // linha removida
        fireTableRowsDeleted(row,row);
    }

    public void removeAllRows(){
    getLinhas().removeAll(linhas);
     // informa a jtable que houve dados deletados passando a
        // linha removida
        fireTableDataChanged();
    }

    /**
     * Remove a linha pelo valor da coluna informada
     * @param val
     * @param col
     * @return
     */
    public boolean removeRow(String val, int col) {
        // obtem o iterator
        Iterator i = getLinhas().iterator();
        int linha = 0;
        // Faz um looping em cima das linhas
        while (i.hasNext()) {
            // Obtem as colunas da linha atual
            String[] linhaCorrente = (String[]) i.next();
            linha++;
            // compara o conteudo String da linha atual na coluna desejada
            // com o valor informado
            if (linhaCorrente[col].equals(val)) {
                getLinhas().remove(linha);
                // informa a jtable que houve dados deletados passando a
                // linha removida
                fireTableRowsDeleted(linha, linha);
                return true;
            }
        }
        // Nao encontrou nada
        return false;
    }

// public Leitor retornaProdutoSelecionado() {
//        ProdutoTableModel model = (ProdutoTableModel) jT_TabelaProdutos.getModel();
//        return model.getCliente(jT_TabelaProdutos.getSelectedRow());
//    }

    /**
     * Retorna uma linha inteira com os registros
     */
    public Object getRow(int row,int indice) {
        String[] linha = (String[]) getLinhas().get(row);
        return  linha[indice];
    }
//Construtor que recebe os parâmetros
    public MkTableModel2(ArrayList dados, String[] colunas, boolean[] edicao) {
        setLinhas(dados);
        setColunas(colunas);
        colsEdicao = edicao;
    }
}
