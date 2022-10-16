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
public class UF {

    private int codigo;
    private String descricao;

// Getters(pega um valor) e Setters(seta um valor)
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
//===================================================
//construtor com os campos

    public UF(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

////Construtor vazio
    public UF() {
    }

    @Override
    public String toString() {
        return getDescricao();
    }

    //Carrega todos os dados em um ArrayList para preencher a jCombo
    public List<UF> carregar() {
        DB banco = new DB();
        banco.connect();
        Query carregaUf = new Query(banco.conn);
        //==================================================================
        carregaUf.open("SELECT iduf,descricao FROM uf");
        //==================================================================
        String iduf, descricaoUf;
        //==================================================================
        //Classe instanciada
        UF uf = new UF();
        //====================================================================
        //ArrayList
        List<UF> vuf = new ArrayList();
        //====================================================================
        while (carregaUf.next()) {
            iduf = carregaUf.fieldbyname("iduf");
            descricaoUf = carregaUf.fieldbyname("descricao");

            uf.setCodigo(Integer.parseInt(iduf));
            uf.setDescricao(descricaoUf);

            //Carrega os dados no ArrayList
            vuf.add(new UF(uf.getCodigo(), uf.getDescricao()));
        }
        banco.disconnect();
        return vuf;


    }
}
