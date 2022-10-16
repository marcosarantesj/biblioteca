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
public class Autores{

    private int codigo;
    private String autor;
// Getters(pega um valor) e Setters(seta um valor)

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int Codigo) {
        this.codigo = Codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    //===================================================
//construtor com os campos

    public Autores(int Codigo, String autor) {
        this.codigo = Codigo;
        this.autor = autor;
    }

//construtor vazio
    public Autores() {
    }

    @Override
    public String toString() {
        return getAutor();
    }
  
public List<Autores> carregar() {
        DB banco = new DB();
        banco.connect();
        Query query1 = new Query(banco.conn);
        //==================================================================
        query1.open("SELECT codigo,autor FROM cadautores " +
                "ORDER BY autor ASC");
        //==================================================================
        String cod,descricao;
        //==================================================================
        //Classe instanciada
        Autores autor1 = new Autores();
        //====================================================================
        //ArrayList
        List<Autores> vetor = new ArrayList();
        //====================================================================
        while (query1.next()) {
            cod = query1.fieldbyname("codigo");
            descricao = query1.fieldbyname("autor");
            //Seta os valores
            autor1.setCodigo(Integer.parseInt(cod));
            autor1.setAutor(descricao);

            //Carrega os dados no ArrayList
            vetor.add(new Autores(autor1.getCodigo(),autor1.getAutor()));
        }
        banco.disconnect();
        return vetor;
    }

}
