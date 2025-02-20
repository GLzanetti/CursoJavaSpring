package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
	public static void main(String[] args) throws SQLException{
		
//		final String url = "jdbc:mysql://localhost:3306";
//		final String usuario = "root";
//		final String senha = "12345678";
		
		Connection conexao = FabricaConexao.getConexao();
		
		Statement smtm = conexao.createStatement();
		smtm.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		
		System.out.println("Banco criado com sucesso");
		
		conexao.close();
	}
}
