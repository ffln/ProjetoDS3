package br.aeso.fachada;

import br.aeso.endereco.ControladorEndereco;
import br.aeso.excecoes.FornecedorJaCadastradoException;
import br.aeso.fornecedor.ControladorFornecedor;
import br.aeso.fornecedor.Fornecedor;

public class Fachada {
	
	ControladorFornecedor controladorFornecedor;
	ControladorEndereco controladorEndereco;
	
	public Fachada(){
		controladorFornecedor = new ControladorFornecedor();
		controladorEndereco = new ControladorEndereco();
	}
	
	public void cadastrarFornecedor(Fornecedor fornecedor) throws FornecedorJaCadastradoException{
		controladorFornecedor.cadastrarFornecedor(fornecedor);
	}
}
