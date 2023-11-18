package model;

import java.sql.Connection;
import java.sql.SQLException;

import java.sql.PreparedStatement;

public class CompraDAO {

	public int inserirDadosNoBanco(String nome, int matricula, int proteina, int queijo, String adicionais, int bebida,
			double valor) {
		Connection conexao = (Connection) new Conexao().getConexao();
		
		String sql = "INSERT INTO cachorro_quente (nome,matricula, op_queijo,op_proteina,ingredientes,bebida,valor) VALUES (?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement statement = (PreparedStatement) conexao.prepareStatement(sql);
			statement.setString(1, nome);
			statement.setInt(2, matricula);
			statement.setInt(3, proteina);
			statement.setInt(4, queijo);
			statement.setString(5, adicionais);
			statement.setInt(6, bebida);
			statement.setDouble(7, valor);
			statement.execute();
			statement.close();
			return 1;

		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}
}
