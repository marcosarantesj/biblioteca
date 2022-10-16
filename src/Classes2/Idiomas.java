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
public class Idiomas{

    private int codigo;
    private String idioma;
// Getters(pega um valor) e Setters(seta um valor)

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int Codigo) {
        this.codigo = Codigo;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    //===================================================
//construtor com os campos

    public Idiomas(int Codigo, String idioma) {
        this.codigo = Codigo;
        this.idioma = idioma;
    }

//construtor vazio
    public Idiomas() {
    }

    @Override
    public String toString() {
        return getIdioma();
    }

public List<Idiomas> carregar() {
        DB banco = new DB();
        banco.connect();
        Query query1 = new Query(banco.conn);
        //==================================================================
        query1.open("SELECT codigo,idioma FROM cadidiomas " +
                "ORDER BY idioma ASC");
        //==================================================================
        String cod,desc;
        //==================================================================
        //Classe instanciada
        Idiomas a = new Idiomas();
        //====================================================================
        //ArrayList
        List<Idiomas> vetor = new ArrayList();
        //====================================================================
        while (query1.next()) {
            cod = query1.fieldbyname("codigo");
            desc = query1.fieldbyname("idioma");
            //Seta os valores
            a.setCodigo(Integer.parseInt(cod));
            a.setIdioma(desc);

            //Carrega os dados no ArrayList
            vetor.add(new Idiomas(a.getCodigo(),a.getIdioma()));
        }
        banco.disconnect();
        return vetor;
    }

}
