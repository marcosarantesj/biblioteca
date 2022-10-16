/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author MARK
 */
public class DB {
//Declarando as variáveis publicas

    public String host;
    public Connection conn = null;
    public boolean status;
    public String className;
    public String Banco;
    private String x;
    private String y;
    private String z;
    private String a;
    private String c;
    private String p;
    private String b;
    //Variáveis que receberão a linha de conexão do txt
    String TipoDB = "",
            ServerHost = "";

// fim da declaração
    // Escolher o banco de dados
    private void tipoDB() {

 try {
            //String conteudo = "";
            FileReader reader = new FileReader(new File("config.txt"));
            BufferedReader leitor = new BufferedReader(reader);

             //Lê linha por linha \n quebra a linha
            TipoDB = leitor.readLine().substring(8);
            ServerHost = leitor.readLine().substring(12);
//            Relatorios = leitor.readLine().substring(12);

            //}
            //Fecha a leitura
            reader.close();
            leitor.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        if (TipoDB.equals("MySQL")) {
            Banco = "mysql";
            className = "com.mysql.jdbc.Driver";
        } else {
            if (TipoDB.equals("PostgreSQL")) {
                Banco = "postgresql";
                className = "org.postgresql.Driver";
            }
        }
    }
    
    //Conexão do banco de dados
    public void connect() {
        try { 
            p="2";            
            y="a";            
            a="k";
            c="1";
            z="r";
            b="3";
            x="m";
            
            tipoDB();

            host = "jdbc:" + Banco + "://" + ServerHost
                    + "/biblioteca?user=postgres&password="+x
                    +y
                    +z
                    +a
                    +c
                    +p
                    +b;
            
                     
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
           
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no fechamento: " + erro.getMessage());
            //erro.printStackTrace();
        }
    }

    public boolean isconnected() {
        return status;
    }
}


