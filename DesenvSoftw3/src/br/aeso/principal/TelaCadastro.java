package br.aeso.principal;

import br.aeso.excecoes.FornecedorJaCadastradoException;
import br.aeso.fornecedor.Fornecedor;
import fachada.Fachada;

public class TelaCadastro {

	public static void main(String[] args) {
		
		Fornecedor fornecedor;
		
		fornecedor = new Fornecedor("Forrest Gump", "006", "Caixa");
		
		Fachada fachada = new Fachada();
		
		try {
			fachada.cadastrarFornecedor(fornecedor);
			System.out.println("Fornecedor " + fornecedor.getNome() + " cadastrado com sucesso!");
		} catch (FornecedorJaCadastradoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		}
	}

}
