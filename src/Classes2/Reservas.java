/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes2;


/**
 *
 * @author MARK
 */
public class Reservas {
int codigo;
String data_2;
String datareserva;
String validadereserva;
int codleitor;
String nomedoleitor;
int codlivro;
String codigodebarras;
String titulo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

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

    public String getData_2() {
        return data_2;
    }

    public void setData_2(String data_2) {
        this.data_2 = data_2;
    }

    public String getDatareserva() {
        return datareserva;
    }

    public void setDatareserva(String datareserva) {
        this.datareserva = datareserva;
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

    public String getValidadereserva() {
        return validadereserva;
    }

    public void setValidadereserva(String validadereserva) {
        this.validadereserva = validadereserva;
    }

    public Reservas() {
    }

    public Reservas(int codigo, String data_2, String datareserva, String validadereserva, int codleitor, String nomedoleitor, int codlivro, String codigodebarras, String titulo) {
        this.codigo = codigo;
        this.data_2 = data_2;
        this.datareserva = datareserva;
        this.validadereserva = validadereserva;
        this.codleitor = codleitor;
        this.nomedoleitor = nomedoleitor;
        this.codlivro = codlivro;
        this.codigodebarras = codigodebarras;
        this.titulo = titulo;
    }



}
