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
public class Grupos{
private int codigo;
private String grupo;

// Getters(pega um valor) e Setters(seta um valor)
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
//===================================================
//construtor com os campos
    public Grupos(int codigo, String grupo) {
        this.codigo = codigo;
        this.grupo = grupo;
    }
    
////Construtor vazio
    public Grupos() {
    }

    @Override
    public String toString() {
        return getGrupo();
    }

public List<Grupos> carregar() {
        DB banco = new DB();
        banco.connect();
        Query query1 = new Query(banco.conn);
        //==================================================================
        query1.open("SELECT codigo,grupo FROM cadgrupos " +
                "ORDER BY grupo ASC");
        //==================================================================
        String cod,desc;
        //==================================================================
        //Classe instanciada
        Grupos a = new Grupos();
        //====================================================================
        //ArrayList
        List<Grupos> vetor = new ArrayList();
        //====================================================================
        while (query1.next()) {
            cod = query1.fieldbyname("codigo");
            desc = query1.fieldbyname("grupo");
            //Seta os valores
            a.setCodigo(Integer.parseInt(cod));
            a.setGrupo(desc);

            //Carrega os dados no ArrayList
            vetor.add(new Grupos(a.getCodigo(),a.getGrupo()));
        }
        banco.disconnect();
        return vetor;
    }


}
