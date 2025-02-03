package br.com.entidades;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity //@Entity identifca a classe e transformar essa classe em uma tabela no banco de dados
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id//Toda tabela tem que ter uma id "primary key no bd" - "toda classe tem seu primary key para diferenciar os objetos"
	@GeneratedValue(strategy = GenerationType.AUTO) // Utilizado para utilizar o gerador de primary key automático do BD
	
	//Atributos gravados no banco de dados
	private Long id;
	private String nome;
	private String sobrenome;
	private Integer idade;
	
	@Temporal(TemporalType.DATE)//Data sempre tem que utilizar a anotação temporal para dizer qual dados que quer da data, por exemplo, data e hora ou só data
	private Date dataNascimento;

	// Construtor vazio
	public Pessoa() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenoe() {
		return sobrenome;
	}

	public void setSobrenoe(String sobrenoe) {
		this.sobrenome = sobrenoe;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(id, other.id);
	}

}
