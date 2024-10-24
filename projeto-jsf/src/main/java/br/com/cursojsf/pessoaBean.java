package br.com.cursojsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;


//@RequestScoped //Utilizado para carregar sempre o último dado, limpa os dados anteriores, não consengue manter os dados.

//@ViewScoped //Utilizado para manter os dados enquato a tela estiver aberta, se redirecionar a url ai também limpa os dados da tela.

//@SessionScoped //Sessão do usuario: Sessão é mantida enquanto o navegador do usuário estiver aberta, mesmo redirecionado ou atualizando a
//página os dados são mantidos, é a sessão do usuário "cada usuário e cada navegador tem sua sessão"*/

@ApplicationScoped //Todos os usuário irão compartilhar esses dados, os dados irão aparecer em qualquer sessão dos usuários, irá manter para
//todos, os dados são compartilhado entre todos os usuários, o que um usuário fazer o outro também irá ver.

//Cada aplicação de Scoped é utilizado para um objetivo dentro de um sistema.

@ManagedBean(name="pessoaBean")
public class pessoaBean {

	private String nome;
	
	private List<String> nomes = new ArrayList<String>();

	//Metodo Adicionar Nome
	public String addNome() {
		nomes.add(nome);
		return "";
	}
	
	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}
	
	public List<String> getNomes() {
		return nomes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
