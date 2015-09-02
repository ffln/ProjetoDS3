package br.aeso.fornecedor;

import br.aeso.excecoes.FornecedorJaCadastradoException;

public class ControladorFornecedor {
	
	RepositorioFornecedorBDR repositorioFornecedor = new RepositorioFornecedorBDR();
	
	public ControladorFornecedor(){
		repositorioFornecedor = new RepositorioFornecedorBDR();
	}
	
	public void cadastrarFornecedor(Fornecedor fornecedor) throws FornecedorJaCadastradoException {
		repositorioFornecedor.cadastrar(fornecedor);
	}

}
