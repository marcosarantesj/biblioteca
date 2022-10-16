/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes2;



/**
 *
 * @author MARK
 */
public class ConsultaItens {

    private int codigo;
    private String
            status,
            codigodebarras,
            titulo,
            clasliteraria,
            grupo,
            editora,
            idioma;

    public String getClasliteraria() {
        return clasliteraria;
    }

    public void setClasliteraria(String clasliteraria) {
        this.clasliteraria = clasliteraria;
    }

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

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //Consulta
    public ConsultaItens(int codigo, String status, String codigodebarras, String titulo, String clasliteraria, String grupo, String editora) {
        this.codigo = codigo;
        this.status = status;
        this.codigodebarras = codigodebarras;
        this.titulo = titulo;
        this.clasliteraria = clasliteraria;
        this.grupo = grupo;
        this.editora = editora;
    }   

//Construtor vazio
    public ConsultaItens() {
    }

    //Construtor com os campos
   

    
}
