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
public class Niveis{
private int codigo;
private String nivel;

// Getters(pega um valor) e Setters(seta um valor)
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
//===================================================
//construtor com os campos
    public Niveis(int codigo, String nivel) {
        this.codigo = codigo;
        this.nivel = nivel;
    }
    
////Construtor vazio
    public Niveis() {
    }

    @Override
    public String toString() {
        return getNivel();
    }

public List<Niveis> carregar() {
        DB banco = new DB();
        banco.connect();
        Query query1 = new Query(banco.conn);
        //==================================================================
        query1.open("SELECT idnivel,nivel FROM niveis " +
                "ORDER BY nivel ASC");
        //==================================================================
        String cod,desc;
        //==================================================================
        //Classe instanciada
        Niveis a = new Niveis();
        //====================================================================
        //ArrayList
        List<Niveis> vetor = new ArrayList();
        //====================================================================
        while (query1.next()) {
            cod = query1.fieldbyname("idnivel");
            desc = query1.fieldbyname("nivel");
            //Seta os valores
            a.setCodigo(Integer.parseInt(cod));
            a.setNivel(desc);

            //Carrega os dados no ArrayList
            vetor.add(new Niveis(a.getCodigo(),a.getNivel()));
        }
        banco.disconnect();
        return vetor;
    }


}
