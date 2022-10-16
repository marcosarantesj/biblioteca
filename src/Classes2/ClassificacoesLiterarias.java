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
public class ClassificacoesLiterarias{
private int codigo;
private String clasliterarias;

// Getters(pega um valor) e Setters(seta um valor)
      public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

      public String getClasliterarias() {
        return clasliterarias;
    }

    public void setClasliterarias(String clasliterarias) {
        this.clasliterarias = clasliterarias;
    }
//===================================================
//construtor com os campos
    public ClassificacoesLiterarias(int codigo, String clasliterarias) {
        this.codigo = codigo;
        this.clasliterarias = clasliterarias;
    }
//Construtor vazio
    public ClassificacoesLiterarias() {
    }

    @Override
    public String toString() {
        return getClasliterarias();
    }

public List<ClassificacoesLiterarias> carregar() {
        DB banco = new DB();
        banco.connect();
        Query query1 = new Query(banco.conn);
        //==================================================================
        query1.open("SELECT codigo,clasliteraria FROM cadclasliteraria " +
                "ORDER BY clasliteraria ASC");
        //==================================================================
        String cod,desc;
        //==================================================================
        //Classe instanciada
        ClassificacoesLiterarias a = new ClassificacoesLiterarias();
        //====================================================================
        //ArrayList
        List<ClassificacoesLiterarias> vetor = new ArrayList();
        //====================================================================
        while (query1.next()) {
            cod = query1.fieldbyname("codigo");
            desc = query1.fieldbyname("clasliteraria");
            //Seta os valores
            a.setCodigo(Integer.parseInt(cod));
            a.setClasliterarias(desc);

            //Carrega os dados no ArrayList
            vetor.add(new ClassificacoesLiterarias(a.getCodigo(),a.getClasliterarias()));
        }
        banco.disconnect();
        return vetor;
    }


}
