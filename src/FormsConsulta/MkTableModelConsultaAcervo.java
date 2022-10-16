/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FormsConsulta;

import Classes2.Itens;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import Classes.DB;
import Classes.Query;

/**
 *
 * @author MARK
 */
public class MkTableModelConsultaAcervo extends AbstractTableModel {

    private String[] columnNames = {"Codigo", "Código de Barras", "Título", "Disponibilidade",
        "Status", "Classificação Literaria", "Grupo", "Editora", "Exemplar"};
    private ArrayList data = new ArrayList();
    private Itens item;

    public MkTableModelConsultaAcervo(String sql) {
        super();

        DB banco2 = new DB();
        banco2.connect();
        Query carregaArray = new Query(banco2.conn);
        carregaArray.open(sql);            

        int codigo;
        String codigodebarras;
        String titulo;
        String disponibilidade;
        String status;
        String clasliteraria;
        String grupo;
        String editora;
        int exemplar;

        item = new Itens();
        data = new ArrayList();
        try {
            while (carregaArray.next()) {
                codigo = carregaArray.rs.getInt("codigo");
                codigodebarras = carregaArray.rs.getString("codigodebarras");
                titulo = carregaArray.rs.getString("titulo");
                disponibilidade = carregaArray.rs.getString("disponibilidade");
                status = carregaArray.rs.getString("status");
                clasliteraria = carregaArray.rs.getString("clasliteraria");
                grupo = carregaArray.rs.getString("grupo");
                editora = carregaArray.rs.getString("editora");
                exemplar = carregaArray.rs.getInt("exemplar");
                //MUDA DE ACORDO COM A DISPONIBILIDADE
                if(disponibilidade.equals("DI")){
                    disponibilidade="DISPONÍVEL";
                }else  if(disponibilidade.equals("EM")){
                    disponibilidade="EMPRESTADO";
                }else  if(disponibilidade.equals("RS")){
                    disponibilidade="RESERVADO";
                }
                //MUDA O STATUS
                if(status.equals("F")){
                    status="EMPRESTAR";
                }else{
                    status="NÃO EMPRESTAR";
                }

                item.setCodigo(codigo);
                item.setCodigodebarras(codigodebarras);
                item.setTitulo(titulo);
                item.setDisponibilidade(disponibilidade);
                item.setStatus(status);
                item.setClasliteraria(clasliteraria);
                item.setGrupo(grupo);
                item.setEditora(editora);
                item.setExemplar(exemplar);

                //Colocar os gets para poder funcionar corretamente
                data.add(new Itens(item.getCodigo(),
                        item.getCodigodebarras(),
                        item.getTitulo(),
                        item.getDisponibilidade(),
                        item.getStatus(),
                        item.getClasliteraria(),
                        item.getGrupo(),
                        item.getEditora(),
                        item.getExemplar()));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        banco2.disconnect();

    }

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
//            return data.length;
        //Alterado para ArrayList
        return data.size();
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
//            return data[row][col];
//            Alterado para ArrayList
        //pega os nomes da linha
        Itens item2 = (Itens) data.get(row);
        data.get(row);
//		// façamos um switch
        switch (col) {
            case 0:
                return item2.getCodigo();
            case 1:
                return item2.getCodigodebarras();
            case 2:
                return item2.getTitulo();
            case 3:
                return item2.getDisponibilidade();
            case 4:
                return item2.getStatus();
            case 5:
                return item2.getClasliteraria();
            case 6:
                return item2.getGrupo();
            case 7:
                return item2.getEditora();
            case 8:
                return item2.getExemplar();
            default:
                return null; // isso nunca deve ocorrer
            }
   
    }

    /*
     * JTable uses this method to determine the default renderer/
     * editor for each cell.  If we didn't implement this method,
     * then the last column would contain text ("true"/"false"),
     * rather than a check box.
     */
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    /*
     * Don't need to implement this method unless your table's
     * editable.
     */
    public boolean isCellEditable(int row, int col) {
        //Note that the data/cell address is constant,
        //no matter where the cell appears onscreen.
//        if (col < 2) {
//            return false;
//        } else {
//            return true;
//        }
        return false;
    }

    /*
     * Don't need to implement this method unless your table's
     * data can change.
     *  @param rowrow row number
     * @param colcolumn column number
     */
    public void setValueAt(Object value, int row, int col) {
        //data[row][col] = value;
        //Alterado para ArrayList
//        ArrayList colArrayList = (ArrayList) data.get(row);
//        colArrayList.set(col, value);
//            fireTableCellUpdated(row, col);
    }

    /*Insere uma nova linha na tabela*/
    public void insertRow(ArrayList newrow) {
        data.add(newrow);
        super.fireTableDataChanged();
    }

    /* Deleta a linha especificada da tabela.
     *
     * @param rowrow row number
     */
    public void deleteRow(int row) {
        data.remove(row);
        super.fireTableDataChanged();
    }

    /* Delete all the rows existing after the selected row from the JTable
     *
     * @param rowrow row number
     */
    public void deleteAfterSelectedRow(int row) {

        // Get the initial size of the table before the deletion has started.
        int size = this.getRowCount();

        // The number of items to be deleted is got by subtracting the

        // selected row + 1 from size. This is done because as each row is deleted
        // the rows next to it are moved up by one space and the number of rows
        // in the JTable decreases. So the technique used here is always deleting
        // the row next to the selected row from the table n times so that all the
        // rows after the selected row are deleted.
        int n = size - (row + 1);

        for (int i = 1; i <= n; i++) {
            data.remove(row + 1);
        }
        super.fireTableDataChanged();
    }

    /**
     * retorna o valor da linha(row) especificada como um ArrayList.
     *
     * @param row number
     *
     * @return DOCUMENT ME!
     */
    public ArrayList getRow(int row) {
        return (ArrayList) data.get(row);
    }

    /**
     * Atualiza a linha especificada. Ele substitui a linha(row) no ArrayList
     * na especificada linha(row) com o novo ArrayList.
     *
     * @param updatedRowArrayList row data
     * @param rowrow row number
     */
    public void updateRow(ArrayList updatedRow, int row) {
        data.set(row, updatedRow);
        super.fireTableDataChanged();
    }

    /**
     * Limpa os dados da tabela.
     */
    public void clearTable() {
        data = new ArrayList();
        super.fireTableDataChanged();

    }
//   
}

