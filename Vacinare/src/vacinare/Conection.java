/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacinare;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Bruno
 */
public class Conection {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/livros";
	private static final String USUARIO = "root";
	private static final String SENHA = "";
	
	public static Connection criaConexao() throws Exception {
		Class.forName(DRIVER);
		
		Connection conexao = DriverManager.getConnection(URL,
				USUARIO, SENHA);
		
		return conexao;
	}
	
	public static void main (String args[]) throws Exception {
		
		Connection conn = criaConexao();
		
		if (conn != null){
			System.out.println("Conexão realizada com sucesso" + conn);
			conn.close();
		}
	}
    
}
