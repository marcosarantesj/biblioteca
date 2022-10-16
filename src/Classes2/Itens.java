/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes2;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Classes.DB;
import Classes.Query;

/**
 *
 * @author MARK
 */
public class Itens {

    private int codigo;
    private Date data_2;
    private Time hora;
    private String titulo;
    private String subtitulo;
    private String edicao;
    private String volume;
    private Date datapublic;
    private int mes;
    private int ano;
    private int npaginas;
    private String local_2;
    private String codigodebarras;
    private String clasliteraria;
    private String editora;
    private String grupo;
    private String disponibilidade;
    private int exemplar;
    private String cdd;
    private String cutter;
    private String cdu;
    private String tombo;
    private String idioma;
    private String estadodolivro;
    private String status;
    private String resumo;

    //Getters e Setters
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCdd() {
        return cdd;
    }

    public void setCdd(String cdd) {
        this.cdd = cdd;
    }

    public String getCdu() {
        return cdu;
    }

    public void setCdu(String cdu) {
        this.cdu = cdu;
    }

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

    public String getCutter() {
        return cutter;
    }

    public void setCutter(String cutter) {
        this.cutter = cutter;
    }

    public Date getData_2() {
        return data_2;
    }

    public void setData_2(Date data_2) {
        this.data_2 = data_2;
    }

    public Date getDatapublic() {
        return datapublic;
    }

    public void setDatapublic(Date datapublic) {
        this.datapublic = datapublic;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEstadodolivro() {
        return estadodolivro;
    }

    public void setEstadodolivro(String estadodolivro) {
        this.estadodolivro = estadodolivro;
    }

    public int getExemplar() {
        return exemplar;
    }

    public void setExemplar(int exemplar) {
        this.exemplar = exemplar;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getLocal_2() {
        return local_2;
    }

    public void setLocal_2(String local_2) {
        this.local_2 = local_2;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getNpaginas() {
        return npaginas;
    }

    public void setNpaginas(int npaginas) {
        this.npaginas = npaginas;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTombo() {
        return tombo;
    }

    public void setTombo(String tombo) {
        this.tombo = tombo;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    //Campos para a consulta(retorna todos os dados)
    public Itens(int codigo, Date data_2, Time hora, String titulo, String subtitulo, String edicao, String volume, Date datapublic, int mes, int ano, int npaginas, String local_2, String codigodebarras, String clasliteraria, String editora, String grupo, String disponibilidade, int exemplar, String cdd, String cutter, String cdu, String tombo, String idioma, String estadodolivro, String status, String resumo) {
        this.codigo = codigo;
        this.data_2 = data_2;
        this.hora = hora;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.edicao = edicao;
        this.volume = volume;
        this.datapublic = datapublic;
        this.mes = mes;
        this.ano = ano;
        this.npaginas = npaginas;
        this.local_2 = local_2;
        this.codigodebarras = codigodebarras;
        this.clasliteraria = clasliteraria;
        this.editora = editora;
        this.grupo = grupo;
        this.disponibilidade = disponibilidade;
        this.exemplar = exemplar;
        this.cdd = cdd;
        this.cutter = cutter;
        this.cdu = cdu;
        this.tombo = tombo;
        this.idioma = idioma;
        this.estadodolivro = estadodolivro;
        this.status = status;
        this.resumo = resumo;
    }

//construtor vazio
    public Itens() {
    }
///*Construtor para carregar a jCombo em reservas*/
//    public Itens(int codigo, String codigodebarras, String titulo,String disponibilidade) {
//        this.codigo = codigo;
//        this.codigodebarras=codigodebarras;
//        this.titulo = titulo;
//        this.disponibilidade=disponibilidade;
//    }

    /*Construtor para os empréstimos, carrega a combo mudando de campo*/
    //preenche o campo local,código,status somente p/verificação
    public Itens(int codigo, String titulo, int exemplar, String local_2, String disponibilidade, String status) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.exemplar = exemplar;
        this.local_2 = local_2;
        this.disponibilidade = disponibilidade;
        this.status = status;
    }

    @Override
    public String toString() {
        return getTitulo();
    }

    /*Construtor para a Consulta do Acervo Geral somente*/
    public Itens(int codigo, String codigodebarras, String titulo, String disponibilidade, String status, String clasliteraria, String editora, String grupo, int exemplar) {
        this.codigo = codigo;
        this.codigodebarras = codigodebarras;
        this.titulo = titulo;
        this.disponibilidade = disponibilidade;
        this.status = status;
        this.clasliteraria = clasliteraria;
        this.editora = editora;
        this.grupo = grupo;
        this.exemplar = exemplar;

    }

    public List<Itens> carregar() {
        DB banco = new DB();
        banco.connect();
        Query query1 = new Query(banco.conn);
        //======================================================================
        query1.open("SELECT dl.iddetalhesdolivro,cl.titulo,dl.exemplar,"
                + "cl.local_2,dl.disponibilidade,dl.status"
                + " FROM cadlivros cl,detalhesdolivro dl"
                + " WHERE dl.cadlivros_id=cl.codigo"
                + " ORDER BY cl.titulo ASC");
        //======================================================================
        String codlivro, tituloL, exemp, local_2L, disponibilidadeL, statusL;
        //======================================================================
        //Classe instanciada
        Itens item = new Itens();
        //======================================================================
        //ArrayList
        List<Itens> vetor = new ArrayList();
        //======================================================================
        while (query1.next()) {
            codlivro = query1.fieldbyname("iddetalhesdolivro");
            tituloL = query1.fieldbyname("titulo");
            exemp = query1.fieldbyname("exemplar");
            local_2L = query1.fieldbyname("local_2");
            disponibilidadeL = query1.fieldbyname("disponibilidade");
            statusL = query1.fieldbyname("status");
            //Seta os valores
            item.setCodigo(Integer.parseInt(codlivro));
            item.setTitulo(tituloL);
            item.setExemplar(Integer.parseInt(exemp));
            item.setLocal_2(local_2L);
            item.setDisponibilidade(disponibilidadeL);
            item.setStatus(statusL);

            //Carrega os dados no ArrayList
            vetor.add(new Itens(item.getCodigo(), item.getTitulo(),
                    item.getExemplar(), item.getLocal_2(), item.getDisponibilidade(), item.getStatus()));
        }
        banco.disconnect();
        return vetor;
    }
}
