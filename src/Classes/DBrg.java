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
public class DBrg {
//Declarando as variáveis publicas

    private String host;
    public Connection conn = null;
    private boolean status;
    private String className;
    private String Banco;
    //Recebe o caminho do BD
    //public String caminho="";
    //Variáveis que receberão a linha de conexão do txt
    public String ServerHost = "";

    // fim da declaração

    // Escolher o banco de dados
    private void tipoDB() {     
            
            //ServerHost = "vldc";
            Banco = "sqlite";
            className = "org.sqlite.JDBC"; 
    }

    //Conexão do banco de dados
    public void connect() {
        try {
            tipoDB();
            host = "jdbc:" + Banco + ":" + ServerHost;

            Class.forName(className);
            conn = DriverManager.getConnection(host);
            status = true;
            //System.out.println("A conexão foi um sucesso");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "excessão: Classe não encontrada! " + e.getMessage());
            e.printStackTrace();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQL Exception... Não conectado! " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void disconnect() {
        try {
            conn.close();
            status = false;
//            System.out.println("Fechando a conexão");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no fechamento: " + erro.getMessage());
            //erro.printStackTrace();
        }
    }

    public boolean isconnected() {
        return status;
    }
}


