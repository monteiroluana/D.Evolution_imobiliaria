package br.com.evolution.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Jhonan
 */
public class Conexao {

    static public Connection obterConexao() {

        Connection connection = null;

        try {
            //Endereço de conexão com o banco
            String dbURL = "jdbc:derby://localhost:1527/imobiliariabd";

            //Armazena usuário e senha
            Properties properties = new Properties();
            properties.put("user", "adm");
            properties.put("password", "adm");

            //realiza a conexâo com o banco
            connection = DriverManager.getConnection(dbURL, properties);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        //Retorna a conezão
        return connection;
    }
}
//            throws ClassNotFoundException, SQLException {
//
//        Class.forName("com.javadb.jdbc.Driver");
//        Connection conn = DriverManager.getConnection("jdbc:javadb://localhost:1527/imobiliariadb", "adm", "adm");
//        return conn;
//    }
//}

//     if (connection == null || connection.isClosed()) {
//            
//            //Declaração de endereço de conexão com o banco de dados
//            String dbUrl = "jdbc:derby://localhost:1527/imobiliariadb";
//            
//            //Propriedades para armazenamento do usuário e da senha do banco
//            Properties properties = new Properties();
//            properties.put("user", "adm");
//            properties.put("password", "adm");
//            
//            //Realiza a conexão com o banco
//            connection = DriverManager.getConnection(dbUrl, properties);
//        }
//        
//        //Retorna a conexão a quem chamou
//        return connection;
//    }

