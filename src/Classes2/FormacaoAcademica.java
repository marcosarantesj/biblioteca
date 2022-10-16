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
public class FormacaoAcademica {

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

    public FormacaoAcademica() {
    }

    public FormacaoAcademica(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return getDescricao();
    }

     //Carrega todos os dados em um ArrayList para preencher a jCombo
    public List<FormacaoAcademica> carregar() {
        DB banco = new DB();
        banco.connect();
        Query query1 = new Query(banco.conn);
        //==================================================================
        query1.open("SELECT codigo,descricao FROM formacaoacademica");
        //==================================================================
        String Codigo, Descricao;
        //==================================================================
        //Classe instanciada
        FormacaoAcademica formacaoAcademica=new FormacaoAcademica();
        //====================================================================
        //ArrayList
        List<FormacaoAcademica> vformacaoAcademica = new ArrayList();
        //====================================================================
        while (query1.next()) {
            Codigo = query1.fieldbyname("codigo");
            Descricao = query1.fieldbyname("descricao");

            formacaoAcademica.setCodigo(Integer.parseInt(Codigo));
            formacaoAcademica.setDescricao(Descricao);

            //Carrega os dados no ArrayList
            vformacaoAcademica.add(new FormacaoAcademica(formacaoAcademica.getCodigo(), formacaoAcademica.getDescricao()));
        }
        banco.disconnect();
        return vformacaoAcademica;


    }

}
