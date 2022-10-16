/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author MARK
 */
public class Query {
//Declarando as variáveis publicas
    public Connection Database = null;
    public boolean status;
    public ResultSet rs;
    public Statement stm;
    private boolean statusreg = true;
// fim da declaração

    /**O método ** public Query(Connection Db)**
    é o construtor da classe, recebe um parâmetro Db que representa
    o banco de dados e cria um Statement.*/
    public Query(Connection Db) {
        try {
            Database = Db;
            stm = Database.createStatement();
            status = false;
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao criar Query! " + e.getMessage());
        }
    }

    /**O método **public void open(String sql)** recebe um parâmetro sql
    (sentença sql) do tipo String e tem o objetivo de fazer uma seleção
    no banco. Observação, o método open só serve para rodar sentenças
    do tipo (SELECT).*/
    public void open(String sql) {
        try {
            rs = stm.executeQuery(sql);
            status = true;
        } catch (SQLException e) {
            status = false;
            JOptionPane.showMessageDialog(null, "Erro ao executar Query! " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**O método **public void execute(String sql)** recebe um parâmetro sql
    (sentença sql) do tipo String e tem objetivo executar sentenças que
    não sejam do tipo (SELECT). Exemplo: UPDATE, CREATE TABLE, DROP, ETC.*/
    public void execute(String sql) {
        try {
            stm.execute(sql);
            status = true;
        } catch (SQLException e) {
            status = false;
            JOptionPane.showMessageDialog(null, "Erro ao executar Query!" + e.getMessage());
            e.printStackTrace();
        }
    }


    /**O método **public String fieldbyname(String field)** retorna
    o valor em String de um campo de uma tabela selecionada.
    Ele recebe como parâmetro o nome do campo e retorna seu valor.*/
    public String fieldbyname(String field) {
        String value = null;
        try {
            if (rs.getString(1) != null) {
                status = false;
            }
            if (status) {
                rs.next();
            }
            value = rs.getString(field);
            status = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Field invalido!" + e.getMessage());
        }
        return value;
    }

    /**O método **public int recordcount()** não recebe parâmetros,
    mas retorna a quantidade de registros selecionados pela query.*/
    public int recordcount() {
        int tot = 0;
        try {
            rs.first();
            do {
                tot++;
            } while (rs.next());
        } catch (SQLException e) {
            status = false;
            JOptionPane.showMessageDialog(null, "Erro ao executar Query!"+ e.getMessage());
            e.printStackTrace();
        }

        return tot;
    }

    /**O método **public boolean next()** avança para o próximo registro.
    Ele retorna true se o comando for executado sem problemas, caso
    contrário retorna false.*/
    public boolean next() {
        boolean retorno = false;
        try {
            if (rs.next()) {
                retorno = true;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar Query! " + e.getMessage());
        }
        return retorno;
    }

    /**O método **public boolean prev()** vai para o registro anterior
    e retorna true se conseguir executar sem problemas ou false caso
    ocorra algum erro.*/
    public boolean prev() {
        boolean retorno = false;
        try {
            if (rs.previous()) {
                retorno = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar previous! " + e.getMessage());
        }
        return retorno;
    }

    /**O método **public boolean first()** vai para o primeiro
    registro query. Retorna true de conseguir executar o comando
    e false caso ocorra algum erro.*/
    public boolean first() {
        boolean retorno = false;
        try {
            if (rs.first()) {
                retorno = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar first! " + e.getMessage());
        }
        return retorno;
    }

    /**O método **public boolean last()** avança para o último registro.
    Retorna true caso não ocorra erro e false caso contrário.*/
    public boolean last() {
        boolean retorno = false;
        try {
            if (rs.last()) {
                retorno = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar last! " + e.getMessage());
        }
        return retorno;
    }
}
