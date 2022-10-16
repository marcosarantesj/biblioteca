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
public class CategoriadoLeitor {

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

    public CategoriadoLeitor() {
    }

    public CategoriadoLeitor(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return getDescricao();
    }

    //Carrega todos os dados em um ArrayList para preencher a jCombo
    public List<CategoriadoLeitor> carregar(){
        DB banco = new DB();
        banco.connect();
        Query carregaCategoriadoLeitor = new Query(banco.conn);    
        //==================================================================
        carregaCategoriadoLeitor.open("SELECT codigo,descricao FROM categoriadoleitor");     
        //==================================================================
        String codCatdoLeitor, catdoLeitor;
        //==================================================================
          //Classe instanciada
        CategoriadoLeitor categoriadoLeitor = new CategoriadoLeitor();
        //====================================================================
        //ArrayList
        List<CategoriadoLeitor>vcategoriadoLeitor = new ArrayList();
        //====================================================================
         while (carregaCategoriadoLeitor.next()) {
            codCatdoLeitor = carregaCategoriadoLeitor.fieldbyname("codigo");
            catdoLeitor = carregaCategoriadoLeitor.fieldbyname("descricao");

            categoriadoLeitor.setCodigo(Integer.parseInt(codCatdoLeitor));
            categoriadoLeitor.setDescricao(catdoLeitor);

            //Carrega os dados no ArrayList
            vcategoriadoLeitor.add(new CategoriadoLeitor(categoriadoLeitor.getCodigo(), categoriadoLeitor.getDescricao()));
        }
        banco.disconnect();
    return vcategoriadoLeitor;
    }

}
