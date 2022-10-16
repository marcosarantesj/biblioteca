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
public class NiveldeEscolaridade {

private int codigo;
private String descricao;

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

    public NiveldeEscolaridade() {
    }

    public NiveldeEscolaridade(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return getDescricao();
    }

     //Carrega todos os dados em um ArrayList para preencher a jCombo
    public List<NiveldeEscolaridade> carregar() {
        DB banco = new DB();
        banco.connect();
        Query query1 = new Query(banco.conn);
        //==================================================================
        query1.open("SELECT codigo,descricao FROM niveldeescolaridade");
        //==================================================================
        String Codigo, Descricao;
        //==================================================================
        //Classe instanciada
        NiveldeEscolaridade niveldeEscolaridade=new NiveldeEscolaridade();
        //====================================================================
        //ArrayList
        List<NiveldeEscolaridade> vniveldeEscolaridade = new ArrayList();
        //====================================================================
        while (query1.next()) {
            Codigo = query1.fieldbyname("codigo");
            Descricao = query1.fieldbyname("descricao");

            niveldeEscolaridade.setCodigo(Integer.parseInt(Codigo));
            niveldeEscolaridade.setDescricao(Descricao);

            //Carrega os dados no ArrayList
            vniveldeEscolaridade.add(new NiveldeEscolaridade(niveldeEscolaridade.getCodigo(), niveldeEscolaridade.getDescricao()));
        }
        banco.disconnect();
        return vniveldeEscolaridade;


    }

}
