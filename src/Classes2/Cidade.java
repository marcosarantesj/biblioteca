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
public class Cidade {
    private int idcidade;
    private String descricao;
    private String cep;
    private int uf_iduf;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdcidade() {
        return idcidade;
    }

    public void setIdcidade(int idcidade) {
        this.idcidade = idcidade;
    }

    public int getUf_iduf() {
        return uf_iduf;
    }

    public void setUf_iduf(int uf_iduf) {
        this.uf_iduf = uf_iduf;
    }

    public Cidade() {
    }    

    //Construtor para o cadastro de bairros
    public Cidade(int idcidade, String descricao, int uf_iduf) {
        this.idcidade = idcidade;
        this.descricao = descricao;
        this.uf_iduf=uf_iduf;
    }
    //Construtor com todos os campos para o cadastro de Cidades
    public Cidade(int idcidade, String descricao, String cep, int uf_iduf) {
        this.idcidade = idcidade;
        this.descricao = descricao;
        this.cep = cep;
        this.uf_iduf = uf_iduf;
    }

    @Override
    public String toString() {
        return getDescricao();
    }

  public List<Cidade> carregar(){
        DB banco = new DB();
        banco.connect();
        Query carregaCidade = new Query(banco.conn);
        //==================================================================
        carregaCidade.open("SELECT idcidade,descricao,uf_iduf FROM cidade ORDER BY descricao ASC");
        //==================================================================
        String codcidade, descricaocidade, iduf;
        //==================================================================
          //Classe instanciada
        Cidade cidade = new Cidade();
        //====================================================================
        //ArrayList
        List<Cidade>vcidade = new ArrayList();
        //====================================================================
         while (carregaCidade.next()) {
            codcidade = carregaCidade.fieldbyname("idcidade");
            descricaocidade = carregaCidade.fieldbyname("descricao");
            iduf=carregaCidade.fieldbyname("uf_iduf");
            //Seta os valores
            cidade.setIdcidade(Integer.parseInt(codcidade));
            cidade.setDescricao(descricaocidade);
            cidade.setUf_iduf(Integer.parseInt(iduf));

            //Carrega os dados no ArrayList
            vcidade.add(new Cidade(cidade.getIdcidade(), cidade.getDescricao(), cidade.getUf_iduf()));
        }
        banco.disconnect();
    return vcidade;
    }

    
}
