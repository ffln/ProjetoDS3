package br.aeso.excecoes;

public class FornecedorJaCadastradoException extends Exception {
	
	public FornecedorJaCadastradoException(){
		super("Fornecedor já cadastrado!");
	}
	
}
