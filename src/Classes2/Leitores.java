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
public class Leitores {

    int codigo;
    Date data_2;
    Time hora;
    int categoriadoleitor;
    String nomedoleitor;
    String sexo;
    String estadocivil;
    int idade;
    Date datadenasc;
    String naturalidade;
    String endereco;
    int nrcasa;
    int uf_iduf;
    int cidade_id;
    String cep;
    int bairro_id;
    String religiao;
    String cpf;
    String rg;
    String telefone;
    String celular;
    String email;
    String instituicao;
    int niveldeescolaridade_id;
    int formacaoacademica_id;
    int tipodeformacao_id;
    int estadoi_id;
    int cidadei_id;
    String turma;
    String serie;
    Date datadeconclusao;
    String nomedopai;
    String profissaodopai;
    String nomedamae;
    String profissaodamae;
    String nomedoresponsavel;
    String profissaodoleitor;
    String situacao;
    //Para consulta geral(retorna o nome nas combos sem precisar buscar no ArrayList)
    String categoria;
    String uf;
    String cidade;
    String bairro;
    String niveldeescolaridade;
    String formacaoacademica;
    String tipodeformacao;
    String estadoi;
    String cidadei;
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidadei() {
        return cidadei;
    }

    public void setCidadei(String cidadei) {
        this.cidadei = cidadei;
    }

    public String getEstadoi() {
        return estadoi;
    }

    public void setEstadoi(String estadoi) {
        this.estadoi = estadoi;
    }

    public String getFormacaoacademica() {
        return formacaoacademica;
    }

    public void setFormacaoacademica(String formacaoacademica) {
        this.formacaoacademica = formacaoacademica;
    }

    public String getNiveldeescolaridade() {
        return niveldeescolaridade;
    }

    public void setNiveldeescolaridade(String niveldeescolaridade) {
        this.niveldeescolaridade = niveldeescolaridade;
    }

    public String getTipodeformacao() {
        return tipodeformacao;
    }

    public void setTipodeformacao(String tipodeformacao) {
        this.tipodeformacao = tipodeformacao;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public int getBairro_id() {
        return bairro_id;
    }

    public void setBairro_id(int bairro_id) {
        this.bairro_id = bairro_id;
    }

    public int getCategoriadoleitor() {
        return categoriadoleitor;
    }

    public void setCategoriadoleitor(int categoriadoleitor) {
        this.categoriadoleitor = categoriadoleitor;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getCidade_id() {
        return cidade_id;
    }

    public void setCidade_id(int cidade_id) {
        this.cidade_id = cidade_id;
    }

    public int getCidadei_id() {
        return cidadei_id;
    }

    public void setCidadei_id(int cidadei_id) {
        this.cidadei_id = cidadei_id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getData_2() {
        return data_2;
    }

    public void setData_2(Date data_2) {
        this.data_2 = data_2;
    }

    public Date getDatadeconclusao() {
        return datadeconclusao;
    }

    public void setDatadeconclusao(Date datadeconclusao) {
        this.datadeconclusao = datadeconclusao;
    }

    public Date getDatadenasc() {
        return datadenasc;
    }

    public void setDatadenasc(Date datadenasc) {
        this.datadenasc = datadenasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public int getEstadoi_id() {
        return estadoi_id;
    }

    public void setEstadoi_id(int estadoi_id) {
        this.estadoi_id = estadoi_id;
    }

    public int getFormacaoacademica_id() {
        return formacaoacademica_id;
    }

    public void setFormacaoacademica_id(int formacaoacademica_id) {
        this.formacaoacademica_id = formacaoacademica_id;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public int getNiveldeescolaridade_id() {
        return niveldeescolaridade_id;
    }

    public void setNiveldeescolaridade_id(int niveldeescolaridade_id) {
        this.niveldeescolaridade_id = niveldeescolaridade_id;
    }

    public String getNomedamae() {
        return nomedamae;
    }

    public void setNomedamae(String nomedamae) {
        this.nomedamae = nomedamae;
    }

    public String getNomedoleitor() {
        return nomedoleitor;
    }

    public void setNomedoleitor(String nomedoleitor) {
        this.nomedoleitor = nomedoleitor;
    }

    public String getNomedopai() {
        return nomedopai;
    }

    public void setNomedopai(String nomedopai) {
        this.nomedopai = nomedopai;
    }

    public String getNomedoresponsavel() {
        return nomedoresponsavel;
    }

    public void setNomedoresponsavel(String nomedoresponsavel) {
        this.nomedoresponsavel = nomedoresponsavel;
    }

    public int getNrcasa() {
        return nrcasa;
    }

    public void setNrcasa(int nrcasa) {
        this.nrcasa = nrcasa;
    }

    public String getProfissaodamae() {
        return profissaodamae;
    }

    public void setProfissaodamae(String profissaodamae) {
        this.profissaodamae = profissaodamae;
    }

    public String getProfissaodoleitor() {
        return profissaodoleitor;
    }

    public void setProfissaodoleitor(String profissaodoleitor) {
        this.profissaodoleitor = profissaodoleitor;
    }

    public String getProfissaodopai() {
        return profissaodopai;
    }

    public void setProfissaodopai(String profissaodopai) {
        this.profissaodopai = profissaodopai;
    }

    public String getReligiao() {
        return religiao;
    }

    public void setReligiao(String religiao) {
        this.religiao = religiao;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getTipodeformacao_id() {
        return tipodeformacao_id;
    }

    public void setTipodeformacao_id(int tipodeformacao_id) {
        this.tipodeformacao_id = tipodeformacao_id;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public int getUf_iduf() {
        return uf_iduf;
    }

    public void setUf_iduf(int uf_iduf) {
        this.uf_iduf = uf_iduf;
    }
//Cosntrutor vazio

    public Leitores() {
    }

    
//Construtor baseado nos dados do banco
    public Leitores(int codigo, Date data_2, Time hora, int categoriadoleitor, String nomedoleitor, String sexo, String estadocivil, int idade, Date datadenasc, String naturalidade, String endereco, int nrcasa, int uf_iduf, int cidade_id, String cep, int bairro_id, String religiao, String cpf, String rg, String telefone, String celular, String email, String instituicao, int niveldeescolaridade_id, int formacaoacademica_id, int tipodeformacao_id, int estadoi_id, int cidadei_id, String turma, String serie, Date datadeconclusao, String nomedopai, String profissaodopai, String nomedamae, String profissaodamae, String nomedoresponsavel, String profissaodoleitor, String situacao) {
        this.codigo = codigo;
        this.data_2 = data_2;
        this.hora = hora;
        this.categoriadoleitor = categoriadoleitor;
        this.nomedoleitor = nomedoleitor;
        this.sexo = sexo;
        this.estadocivil = estadocivil;
        this.idade = idade;
        this.datadenasc = datadenasc;
        this.naturalidade = naturalidade;
        this.endereco = endereco;
        this.nrcasa = nrcasa;
        this.uf_iduf = uf_iduf;
        this.cidade_id = cidade_id;
        this.cep = cep;
        this.bairro_id = bairro_id;
        this.religiao = religiao;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.instituicao = instituicao;
        this.niveldeescolaridade_id = niveldeescolaridade_id;
        this.formacaoacademica_id = formacaoacademica_id;
        this.tipodeformacao_id = tipodeformacao_id;
        this.estadoi_id = estadoi_id;
        this.cidadei_id = cidadei_id;
        this.turma = turma;
        this.serie = serie;
        this.datadeconclusao = datadeconclusao;
        this.nomedopai = nomedopai;
        this.profissaodopai = profissaodopai;
        this.nomedamae = nomedamae;
        this.profissaodamae = profissaodamae;
        this.nomedoresponsavel = nomedoresponsavel;
        this.profissaodoleitor = profissaodoleitor;
        this.situacao = situacao;
    }

    //Para carregar a consulta no form de leitores
    public Leitores(int codigo, Date data_2, Time hora, String nomedoleitor, String sexo, String estadocivil, int idade, Date datadenasc, String naturalidade, String endereco, int nrcasa, String cep, String religiao, String cpf, String rg, String telefone, String celular, String email, String instituicao, String turma, String serie, Date datadeconclusao, String nomedopai, String profissaodopai, String profissaodamae, String nomedoresponsavel, String profissaodoleitor, String situacao, String categoria, String uf, String cidade,String bairro, String niveldeescolaridade, String formacaoacademica, String tipodeformacao, String estadoi, String cidadei) {
        this.codigo = codigo;
        this.data_2 = data_2;
        this.hora = hora;
        this.nomedoleitor = nomedoleitor;
        this.sexo = sexo;
        this.estadocivil = estadocivil;
        this.idade = idade;
        this.datadenasc = datadenasc;
        this.naturalidade = naturalidade;
        this.endereco = endereco;
        this.nrcasa = nrcasa;
        this.cep = cep;
        this.religiao = religiao;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.instituicao = instituicao;
        this.turma = turma;
        this.serie = serie;
        this.datadeconclusao = datadeconclusao;
        this.nomedopai = nomedopai;
        this.profissaodopai = profissaodopai;
        this.profissaodamae = profissaodamae;
        this.nomedoresponsavel = nomedoresponsavel;
        this.profissaodoleitor = profissaodoleitor;
        this.situacao = situacao;
        this.categoria = categoria;
        this.uf = uf;
        this.cidade = cidade;
        this.bairro=bairro;
        this.niveldeescolaridade = niveldeescolaridade;
        this.formacaoacademica = formacaoacademica;
        this.tipodeformacao = tipodeformacao;
        this.estadoi = estadoi;
        this.cidadei = cidadei;
    }   
   //Para carregar o jCombo
    public Leitores(int codigo, String nomedoleitor) {
        this.codigo = codigo;
        this.nomedoleitor = nomedoleitor;
    }

    @Override
    public String toString() {
        return getNomedoleitor();
    }

    public List<Leitores> carregar() {
        DB banco = new DB();
        banco.connect();
        Query query1 = new Query(banco.conn);
        //==================================================================
        query1.open("SELECT codigo,nomedoleitor FROM cadleitores " +
                "ORDER BY nomedoleitor ASC");
        //==================================================================
        String codleitor,nome;
        //==================================================================
        //Classe instanciada
        Leitores leitor = new Leitores();
        //====================================================================
        //ArrayList
        List<Leitores> vetor = new ArrayList();
        //====================================================================
        while (query1.next()) {
            codleitor = query1.fieldbyname("codigo");
            nome = query1.fieldbyname("nomedoleitor");
            //Seta os valores
            leitor.setCodigo(Integer.parseInt(codleitor));
            leitor.setNomedoleitor(nome);

            //Carrega os dados no ArrayList
            vetor.add(new Leitores(leitor.getCodigo(),leitor.getNomedoleitor()));
        }
        banco.disconnect();
        return vetor;
    }
}
