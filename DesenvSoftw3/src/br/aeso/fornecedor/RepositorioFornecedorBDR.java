package br.aeso.fornecedor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import br.aeso.excecoes.FornecedorJaCadastradoException;
import br.aeso.excecoes.FornecedorNaoEncontradoException;;


public class RepositorioFornecedorBDR {
	
    private Connection conn;
    public RepositorioFornecedorBDR() {
    	try {
			conn = DriverManager.getConnection("jdbc:mysql://192.168.2.3/felixbd", "root", "root");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
    }
    
	public void cadastrar(Fornecedor fornecedor) throws FornecedorJaCadastradoException {
		// Verifica se o fornecedor já existe no repositório
		if (this.existe(fornecedor.getCpf())) throw new FornecedorJaCadastradoException();
        // Criando a String SQL
        String sql ="insert into fornecedor (nome, cpf, banco) values (?, ?, ?)";
 
        // Criar o PreparedStatement, objeto para executar a query
        PreparedStatement preStatement = null;
        ResultSet resultSet = null;
		try {
			preStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		
	        // Atualizando o primeiro parametro
	        preStatement.setString(1, fornecedor.getNome());
	        preStatement.setString(2, fornecedor.getCpf());
	        preStatement.setString(3, fornecedor.getBanco());
	        preStatement.execute();
	        // Retorna um ResultSet com todas as chaves geradas
	        resultSet = preStatement.getGeneratedKeys();
	        Integer fornecedorId = 0;
	        // Pegando o identificador gerado a partir do último insert
	        while(resultSet.next()) {
	        	fornecedorId = resultSet.getInt(1);
	        }
	        fornecedor.setCodigo(fornecedorId);
	        System.out.println("Código do fornecedor " + fornecedor.getNome() + ": " + fornecedor.getCodigo());
	        // Fechando conexões
	        preStatement.close();
	        resultSet.close();
	        
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
    }
	
	public void remover(String cpf) throws FornecedorNaoEncontradoException {
	}
	public Fornecedor procurar(String cpf) throws FornecedorNaoEncontradoException {
		return null;
	}
	public void atualizar(Fornecedor fornecedor) throws FornecedorNaoEncontradoException {
	}
	
	public boolean existe(String cpf) {
		return false;
    }
	
	public ArrayList<Fornecedor> listar()  {
		return null;
	}
	
	public ArrayList<Fornecedor> listar(String complemento) throws SQLException {
		return null;
	}

}
