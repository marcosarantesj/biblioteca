/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes2;

/**
 *
 * @author MARK
 */
public class Devolucoes {

    int codigo;
    String data_2;
    String hora;
    String datadaentrega;
    String datadevolvida;
    int codleitor;
    String nomedoleitor;
    int codlivro;
    String codigodebarras;
    String titulo;
    String situacao;

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

    public String getDatadaentrega() {
        return datadaentrega;
    }

    public void setDatadaentrega(String datadaentrega) {
        this.datadaentrega = datadaentrega;
    }

    public String getDatadevolvida() {
        return datadevolvida;
    }

    public void setDatadevolvida(String datadevolvida) {
        this.datadevolvida = datadevolvida;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNomedoleitor() {
        return nomedoleitor;
    }

    public void setNomedoleitor(String nomedoleitor) {
        this.nomedoleitor = nomedoleitor;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Devolucoes() {
    }
/* Consulta para efetuar as devoluções */
    public Devolucoes(String datadaentrega, int codleitor, String nomedoleitor, int codlivro, String codigodebarras, String titulo,String situacao) {
        this.datadaentrega = datadaentrega;
        this.codleitor = codleitor;
        this.nomedoleitor = nomedoleitor;
        this.codlivro = codlivro;
        this.codigodebarras = codigodebarras;
        this.titulo = titulo;
        this.situacao=situacao;
    }

    
}
