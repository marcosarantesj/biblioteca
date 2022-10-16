/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FormsConsulta;

import Classes2.Leitores;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import Classes.DB;
import Classes.Query;

/**
 *
 * @author MARK
 */
public class MkTableModelConsultaLeitores extends AbstractTableModel {

    private String[] columnNames = {"Codigo", "Nome","sexo","Idade"};
    private ArrayList data = new ArrayList();
    private Leitores leitor;

    public MkTableModelConsultaLeitores(String sql) {
        super();

        DB banco2 = new DB();
        banco2.connect();
        Query q = new Query(banco2.conn);
        q.open(sql);

        //Variáveis que irão receber a consulta
        int codigo;
        Date data_2;
        Time hora;
        int categoriadoleitor;
        String nomedoleitor;
        String sexo;
        String estadocivil;
        int idade;
        Date datadenasc;
        String naturalidade;
        String endereco;
        int nrcasa;
        int uf_iduf;
        int cidade_id;
        String cep;
        int bairro_id;
        String religiao;
        String cpf;
        String rg;
        String telefone;
        String celular;
        String email;
        String instituicao;
        int niveldeescolaridade_id;
        int formacaoacademica_id;
        int tipodeformacao_id;
        int estadoi_id;
        int cidadei_id;
        String turma;
        String serie;
        Date datadeconclusao;
        String nomedopai;
        String profissaodopai;
        String nomedamae;
        String profissaodamae;
        String nomedoresponsavel;
        String profissaodoleitor;
        String situacao;

        leitor = new Leitores();
        data = new ArrayList();
        try {
            while (q.next()) {
                codigo = q.rs.getInt("codigo");
                data_2 = q.rs.getDate("data_2");
                hora = q.rs.getTime("hora");
                categoriadoleitor = q.rs.getInt("categoriadoleitor");
                nomedoleitor = q.rs.getString("nomedoleitor");
                sexo = q.rs.getString("sexo");
                estadocivil = q.rs.getString("estadocivil");
                idade = q.rs.getInt("idade");
                datadenasc = q.rs.getDate("datadenasc");
                naturalidade = q.rs.getString("naturalidade");
                endereco = q.rs.getString("endereco");
                nrcasa = q.rs.getInt("nrcasa");
                uf_iduf = q.rs.getInt("uf_iduf");
                cidade_id = q.rs.getInt("cidade_id");
                cep = q.rs.getString("cep");
                bairro_id = q.rs.getInt("bairro_id");
                religiao = q.rs.getString("religiao");
                cpf = q.rs.getString("cpf");
                rg = q.rs.getString("rg");
                telefone = q.rs.getString("telefone");
                celular = q.rs.getString("celular");
                email = q.rs.getString("email");
                instituicao = q.rs.getString("instituicao");
                niveldeescolaridade_id = q.rs.getInt("niveldeescolaridade_id");
                formacaoacademica_id = q.rs.getInt("formacaoacademica_id");
                tipodeformacao_id = q.rs.getInt("tipodeformacao_id");
                estadoi_id = q.rs.getInt("estadoi_id");
                cidadei_id = q.rs.getInt("cidadei_id");
                turma = q.rs.getString("turma");
                serie = q.rs.getString("serie");
                datadeconclusao = q.rs.getDate("datadeconclusao");
                nomedopai = q.rs.getString("nomedopai");
                profissaodopai = q.rs.getString("nomedopai");
                nomedamae = q.rs.getString("nomedamae");
                profissaodamae = q.rs.getString("profissaodamae");
                nomedoresponsavel = q.rs.getString("nomedoresponsavel");
                profissaodoleitor = q.rs.getString("profissaodoleitor");
                situacao = q.rs.getString("situacao");

                //Seta os valores
                leitor.setCodigo(codigo);
                leitor.setData_2(data_2);
                leitor.setHora(hora);
                leitor.setCategoriadoleitor(categoriadoleitor);
                leitor.setNomedoleitor(nomedoleitor);
                leitor.setSexo(sexo);
                leitor.setEstadocivil(estadocivil);
                leitor.setIdade(idade);
                leitor.setDatadenasc(datadenasc);
                leitor.setNaturalidade(naturalidade);
                leitor.setEndereco(endereco);
                leitor.setNrcasa(nrcasa);
                leitor.setUf_iduf(uf_iduf);
                leitor.setCidade_id(cidade_id);
                leitor.setCep(cep);
                leitor.setBairro_id(bairro_id);
                leitor.setReligiao(religiao);
                leitor.setCpf(cpf);
                leitor.setRg(rg);
                leitor.setTelefone(telefone);
                leitor.setCelular(celular);
                leitor.setEmail(email);
                leitor.setInstituicao(instituicao);
                leitor.setNiveldeescolaridade_id(niveldeescolaridade_id);
                leitor.setFormacaoacademica_id(formacaoacademica_id);
                leitor.setTipodeformacao_id(tipodeformacao_id);
                leitor.setEstadoi_id(estadoi_id);
                leitor.setCidadei_id(cidadei_id);
                leitor.setTurma(turma);
                leitor.setSerie(serie);
                leitor.setDatadeconclusao(datadeconclusao);
                leitor.setNomedopai(nomedopai);
                leitor.setProfissaodopai(profissaodopai);
                leitor.setNomedamae(nomedamae);
                leitor.setProfissaodamae(profissaodamae);
                leitor.setNomedoresponsavel(nomedoresponsavel);
                leitor.setProfissaodoleitor(profissaodoleitor);
                leitor.setSituacao(situacao);

                //Colocar os gets para poder funcionar corretamente
                data.add(new Leitores(
                leitor.getCodigo(),
                leitor.getData_2(),
                leitor.getHora(),
                leitor.getCategoriadoleitor(),
                leitor.getNomedoleitor(),
                leitor.getSexo(),
                leitor.getEstadocivil(),
                leitor.getIdade(),
                leitor.getDatadenasc(),
                leitor.getNaturalidade(),
                leitor.getEndereco(),
                leitor.getNrcasa(),
                leitor.getUf_iduf(),
                leitor.getCidade_id(),
                leitor.getCep(),
                leitor.getBairro_id(),
                leitor.getReligiao(),
                leitor.getCpf(),
                leitor.getRg(),
                leitor.getTelefone(),
                leitor.getCelular(),
                leitor.getEmail(),
                leitor.getInstituicao(),
                leitor.getNiveldeescolaridade_id(),
                leitor.getFormacaoacademica_id(),
                leitor.getTipodeformacao_id(),
                leitor.getEstadoi_id(),
                leitor.getCidadei_id(),
                leitor.getTurma(),
                leitor.getSerie(),
                leitor.getDatadeconclusao(),
                leitor.getNomedopai(),
                leitor.getProfissaodopai(),
                leitor.getNomedamae(),
                leitor.getProfissaodamae(),
                leitor.getNomedoresponsavel(),
                leitor.getProfissaodoleitor(),
                leitor.getSituacao()));

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

    //Mostra apenas os campos da consulta (Código e nome do leitor)
    public Object getValueAt(int row, int col) {
//            return data[row][col];
//        Alterado para ArrayList
//        Pega os nomes da linha
        Leitores leitor2 = (Leitores) data.get(row);
        data.get(row);
//		// façamos um switch
        switch (col) {
            case 0:
                return String.valueOf(leitor2.getCodigo());
            case 1:
                return leitor2.getNomedoleitor();

//                return leitor2.getData_2();
            case 2:
                return leitor.getSexo();
//                return leitor.getHora();
            case 3:
                return String.valueOf(leitor.getIdade());
//                return leitor.getCategoriadoleitor();
//            case 4:
//                return leitor.getNomedoleitor();
//            case 5:
//                return leitor.getSexo();
//            case 6:
//                return leitor.getEstadocivil();
//            case 7:
//                return leitor.getIdade();
//            case 8:
//                return leitor.getDatadenasc();
//            case 9:
//                return leitor.getNaturalidade();
//            case 10:
//                return leitor.getEndereco();
//            case 11:
//                return leitor.getNrcasa();
//            case 12:
//                return leitor.getUf_iduf();
//            case 13:
//                leitor.getCidade_id();
//            case 14:
//                leitor.getCep();
//            case 15:
//                leitor.getBairro_id();
//            case 16:
//                leitor.getReligiao();
//            case 17:
//                leitor.getCpf();
//            case 18:
//                leitor.getRg();
//            case 19:
//                leitor.getTelefone();
//            case 20:
//                leitor.getCelular();
//            case 21:
//                leitor.getEmail();
//            case 22:
//                leitor.getInstituicao();
//            case 23:
//                leitor.getNiveldeescolaridade_id();
//            case 24:
//                leitor.getFormacaoacademica_id();
//            case 25:
//                leitor.getTipodeformacao_id();
//            case 26:
//                leitor.getEstadoi_id();
//            case 27:
//                leitor.getCidadei_id();
//            case 28:
//                leitor.getTurma();
//            case 29:
//                leitor.getSerie();
//            case 30:
//                leitor.getDatadeconclusao();
//            case 31:
//                leitor.getNomedopai();
//            case 32:
//                leitor.getProfissaodopai();
//            case 33:
//                leitor.getNomedamae();
//            case 34:
//                leitor.getProfissaodamae();
//            case 35:
//                leitor.getNomedoresponsavel();
//            case 36:
//                leitor.getProfissaodoleitor();
//            case 37:
//                leitor.getSituacao();
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
     * Todos os dados são retornados do Array
     * @param row number
     *
     * @return DOCUMENT ME!
     */
    //ArrayList
    public Object getRow(int row,int col) {
        //        Pega os nomes da linha
        Leitores leitor2 = (Leitores) data.get(row);
        data.get(row);
//		// façamos um switch
        switch (col) {
            case 0:
                return leitor2.getCodigo();
            case 1:
                return leitor2.getData_2();
            case 2:
                return leitor.getHora();
            case 3:
                return leitor.getCategoriadoleitor();
            case 4:
                return leitor.getNomedoleitor();
            case 5:
                return leitor.getSexo();
            case 6:
                return leitor.getEstadocivil();
            case 7:
                return leitor.getIdade();
            case 8:
                return leitor.getDatadenasc();
            case 9:
                return leitor.getNaturalidade();
            case 10:
                return leitor.getEndereco();
            case 11:
                return leitor.getNrcasa();
            case 12:
                return leitor.getUf_iduf();
            case 13:
                leitor.getCidade_id();
            case 14:
                leitor.getCep();
            case 15:
                leitor.getBairro_id();
            case 16:
                leitor.getReligiao();
            case 17:
                leitor.getCpf();
            case 18:
                leitor.getRg();
            case 19:
                leitor.getTelefone();
            case 20:
                leitor.getCelular();
            case 21:
                leitor.getEmail();
            case 22:
                leitor.getInstituicao();
            case 23:
                leitor.getNiveldeescolaridade_id();
            case 24:
                leitor.getFormacaoacademica_id();
            case 25:
                leitor.getTipodeformacao_id();
            case 26:
                leitor.getEstadoi_id();
            case 27:
                leitor.getCidadei_id();
            case 28:
                leitor.getTurma();
            case 29:
                leitor.getSerie();
            case 30:
                leitor.getDatadeconclusao();
            case 31:
                leitor.getNomedopai();
            case 32:
                leitor.getProfissaodopai();
            case 33:
                leitor.getNomedamae();
            case 34:
                leitor.getProfissaodamae();
            case 35:
                leitor.getNomedoresponsavel();
            case 36:
                leitor.getProfissaodoleitor();
            case 37:
                leitor.getSituacao();
            default:
                return null; // isso nunca deve ocorrer
            }
//        return  (ArrayList)data.get(row);
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
}

