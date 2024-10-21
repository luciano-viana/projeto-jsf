package br.com.cursojsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class pessoaBean {

	private String nome;
	private String sobreNome;
	private String nomeCompleto;

	//Metodo mostrarNome
	public String mostrarNome() {
		nomeCompleto = nome + "" + sobreNome;
		return "";
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

}
