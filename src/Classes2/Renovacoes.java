/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes2;

/**
 *
 * @author MARK
 */
public class Renovacoes {
int codlivro;
String codigodebarras;
String titulo;
int codleitor;
String nomedoleitor;
String datadaentrega;

    public String getCodigodebarras() {
        return codigodebarras;
    }

    public void setCodigodebarras(String codigodebarras) {
        this.codigodebarras = codigodebarras;
    }

    public int getCodleitor() {
        return codleitor;
    }

    public void setCodleitor(int codleitor) {
        this.codleitor = codleitor;
    }

    public int getCodlivro() {
        return codlivro;
    }

    public void setCodlivro(int codlivro) {
        this.codlivro = codlivro;
    }

    public String getDatadaentrega() {
        return datadaentrega;
    }

    public void setDatadaentrega(String datadaentrega) {
        this.datadaentrega = datadaentrega;
    }

    public String getNomedoleitor() {
        return nomedoleitor;
    }

    public void setNomedoleitor(String nomedoleitor) {
        this.nomedoleitor = nomedoleitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public Renovacoes() {
    }

    public Renovacoes(int codlivro, String codigodebarras, String titulo,int codleitor, String nomedoleitor, String datadaentrega) {
        this.codlivro = codlivro;
        this.codigodebarras = codigodebarras;
        this.titulo=titulo;
        this.codleitor = codleitor;
        this.nomedoleitor = nomedoleitor;
        this.datadaentrega = datadaentrega;
    }


}
