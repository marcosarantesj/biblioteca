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
public class EstadoDoLivro{

    private int codigo;
    private String descricao;
// Getters(pega um valor) e Setters(seta um valor)

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int Codigo) {
        this.codigo = Codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    //===================================================
//construtor com os campos

    public EstadoDoLivro(int Codigo, String descricao) {
        this.codigo = Codigo;
        this.descricao = descricao;
    }

//construtor vazio
    public EstadoDoLivro() {
    }

    @Override
    public String toString() {
        return getDescricao();
    }



public List<EstadoDoLivro> carregar() {
        DB banco = new DB();
        banco.connect();
        Query query1 = new Query(banco.conn);
        //==================================================================
        query1.open("SELECT codigo,descricao FROM cadestadodolivro " +
                "ORDER BY descricao ASC");
        //==================================================================
        String cod,desc;
        //==================================================================
        //Classe instanciada
        EstadoDoLivro estado = new EstadoDoLivro();
        //====================================================================
        //ArrayList
        List<EstadoDoLivro> vetor = new ArrayList();
        //====================================================================
        while (query1.next()) {
            cod = query1.fieldbyname("codigo");
            desc = query1.fieldbyname("descricao");
            //Seta os valores
            estado.setCodigo(Integer.parseInt(cod));
            estado.setDescricao(desc);

            //Carrega os dados no ArrayList
            vetor.add(new EstadoDoLivro(estado.getCodigo(),estado.getDescricao()));
        }
        banco.disconnect();
        return vetor;
    }
}
