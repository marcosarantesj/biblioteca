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
public class Editoras{
    private int codigo;
    private String editora;

    // Getters(pega um valor) e Setters(seta um valor)
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

//===================================================
//construtor com os campos
    public Editoras(int codigo, String editora) {
        this.codigo = codigo;
        this.editora = editora;
    }
//Construtor vazio
    public Editoras() {
    }

    @Override
    public String toString() {
        return getEditora();
    }

public List<Editoras> carregar() {
        DB banco = new DB();
        banco.connect();
        Query query1 = new Query(banco.conn);
        //==================================================================
        query1.open("SELECT codigo,editora FROM cadeditoras " +
                "ORDER BY editora ASC");
        //==================================================================
        String cod,desc;
        //==================================================================
        //Classe instanciada
        Editoras a = new Editoras();
        //====================================================================
        //ArrayList
        List<Editoras> vetor = new ArrayList();
        //====================================================================
        while (query1.next()) {
            cod = query1.fieldbyname("codigo");
            desc = query1.fieldbyname("editora");
            //Seta os valores
            a.setCodigo(Integer.parseInt(cod));
            a.setEditora(desc);

            //Carrega os dados no ArrayList
            vetor.add(new Editoras(a.getCodigo(),a.getEditora()));
        }
        banco.disconnect();
        return vetor;
    }

}
