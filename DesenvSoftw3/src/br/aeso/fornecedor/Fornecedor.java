package br.aeso.fornecedor;

import br.aeso.endereco.Endereco;

public class Fornecedor {
	
	private int codigo;
	private String nome;
	private String cpf;
	private String banco;
	private Endereco endereco;
	
	// Construtor full
	public Fornecedor(String nome, String cpf, String banco, Endereco endereco) {
		this.codigo = 0;
		this.nome = nome;
		this.cpf = cpf;
		this.banco = banco;
		this.endereco = endereco;
	}
	
	// Construtor sem endereco
	public Fornecedor(String nome, String cpf, String banco) {
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.banco = banco;
		this.endereco = null;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
