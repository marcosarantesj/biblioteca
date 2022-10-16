/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes2;

import java.util.ArrayList;
import java.util.List;
import Classes.DB;
import Classes.Query;

/**
 *
 * @author MARK
 */
public class Bairro {

    private int idbairro;
    private int cidade_idcidade;
    private String descricao;
    //Para o jTable
    private String descricaoCidade;

    public String getDescricaoCidade() {
        return descricaoCidade;
    }

    public void setDescricaoCidade(String descricaoCidade) {
        this.descricaoCidade = descricaoCidade;
    }

    public int getCidade_idcidade() {
        return cidade_idcidade;
    }

    public void setCidade_idcidade(int cidade_idcidade) {
        this.cidade_idcidade = cidade_idcidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdbairro() {
        return idbairro;
    }

    public void setIdbairro(int idbairro) {
        this.idbairro = idbairro;
    }

    public Bairro() {
    }

    public Bairro(int idbairro, int cidade_idcidade, String descricao) {
        this.idbairro = idbairro;
        this.cidade_idcidade = cidade_idcidade;
        this.descricao = descricao;
    }
//Para o cadastro de bairros
    public Bairro(int idbairro, String descricao, String descricaoCidade) {
        this.idbairro = idbairro;
        this.descricao = descricao;
        this.descricaoCidade = descricaoCidade;
    }


    @Override
    public String toString() {
        return getDescricao();
    }

    public List<Bairro> carregar() {
        DB banco = new DB();
        banco.connect();
        Query carregaBairro = new Query(banco.conn);
        //==================================================================
        carregaBairro.open("SELECT idbairro,cidade_idcidade,descricao FROM bairro ORDER BY descricao ASC");
        //==================================================================
        String codbairro, descricaobairro, cidadeidcidade;
        //==================================================================
        //Classe instanciada
        Bairro bairro = new Bairro();
        //====================================================================
        //ArrayList
        List<Bairro> vbairro = new ArrayList();
        //====================================================================
        while (carregaBairro.next()) {
            codbairro = carregaBairro.fieldbyname("idbairro");
            descricaobairro = carregaBairro.fieldbyname("descricao");
            cidadeidcidade = carregaBairro.fieldbyname("cidade_idcidade");
            //Seta os valores
            bairro.setIdbairro(Integer.parseInt(codbairro));
            bairro.setDescricao(descricaobairro);
            bairro.setCidade_idcidade(Integer.parseInt(cidadeidcidade));

            //Carrega os dados no ArrayList
            vbairro.add(new Bairro(bairro.getIdbairro(), bairro.getCidade_idcidade(), bairro.getDescricao()));
        }
        banco.disconnect();
        return vbairro;
    }
}
