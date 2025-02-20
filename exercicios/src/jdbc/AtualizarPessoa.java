package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtualizarPessoa {
	public static void main(String[] args) throws SQLException{
		
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		
		
		String sql = "SELECT * FROM pessoas";
		
		Statement stmt = conexao.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(rs.next()) {
			int codigo = rs.getInt("codigo");
			String nome = rs.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		for(Pessoa p: pessoas) {
			System.out.println(p.getCodigo() + " = " + p.getNome());
		}
			
		System.out.println("Informe quem será alterado: (numeros)");
		int codigo = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Para que nome sera alterado: ");
		String nome = entrada.nextLine();
		
		sql = "UPDATE pessoas set nome = ? WHERE codigo = ?";
		PreparedStatement stmt2 = conexao.prepareStatement(sql);
		stmt2.setString(1, nome);
		stmt2.setInt(2, codigo);
		stmt2.execute();
		
		System.out.println("\nNome alterado com sucesso...\n");
		
		String sql2 = "SELECT codigo, nome FROM pessoas";
		ResultSet resultado = stmt.executeQuery(sql2);
		
		if(resultado.next()) {
			Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));
			
			System.out.println(p.getCodigo() + " = " + p.getNome());
		}
		
		conexao.close();
		entrada.close();
	}
}
