/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 *
 * @author wesle
 */
public class ConexaoMysql implements Conexao{
    
    private final String USUARIO = "root";
    private final String SENHA = "";
    private final String URL = "jdbc:mysql://localhost/salesgest";
    private Connection conectar;
    

    @Override
    public Connection obterConexao() throws SQLException {
        if(conectar == null){
            conectar = DriverManager.getConnection(URL, USUARIO, SENHA);
        }
        return conectar;
    }
    
}
